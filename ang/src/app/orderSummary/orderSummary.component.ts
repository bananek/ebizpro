import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute} from '@angular/router';
import {Order} from './order';
import {Cart} from '../cart/cart';
import {OrderService} from './order.service';
import {CartService} from '../cart/cart.service';
import {LoginService} from '../login/login.service';

@Component({
  selector: 'app-ordersummary',
  templateUrl: './orderSummary.component.html',
})
export class OrderSummaryComponent implements OnInit {

  productForm: FormGroup;
  mercs: Cart[];

  shipment = ['DHL', 'UPS'];

  payment = ['paypal', 'money transfer']

  address = ''

  model = new Order();
  step = 1;
  totalPrice = 0;

  constructor( private cartService: CartService, private orderService: OrderService,
               private route: ActivatedRoute, private loginService: LoginService) { }

  ngOnInit() {
    this.model.payment = this.payment[0];
    this.model.shipment = this.shipment[0];
    this.model.address = this.address[0];
    this.cartService.getCart().subscribe(data => this.mercs = data);
  }

  showSummary() {
    this.Total();
    this.step = 2;
  }

  Total() {
    let price = 0;
    for (let i = 0; i < this.mercs.length; i++) {
      price += this.mercs[i].price;
    }
    this.totalPrice = price;
  }

  sendOrder() {

    let profile = this.loginService.userProfile;
    let uid: string = profile.sub;

    let products = '';
    for (let i = 0; i < this.mercs.length; i++) {
      products += this.mercs[i].title + '';
      this.cartService.removeFromCart(this.mercs[i].title);
    }

    this.orderService.sendOrder(products,
      this.model.shipment,
      this.model.payment,
      this.totalPrice,
      uid,
      this.model.address,
      );

    this.step = 3;
  }
}
