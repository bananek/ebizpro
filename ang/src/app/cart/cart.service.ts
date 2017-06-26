/**
 * Created by BanaN on 6/19/2017.
 */
import { Injectable } from '@angular/core';
import {Http, Headers, RequestOptions, URLSearchParams} from '@angular/http';
import {Cart} from './cart';
import { LoginService } from '../login/login.service';
import 'rxjs/add/operator/map';

@Injectable()
export class CartService {

  profile: any;

  constructor(private http: Http, private loginService: LoginService) {
  }


  getCart() {
    const headers: Headers = new Headers();
    headers.append('Accept', 'application/json');
    headers.append('Content-Type', 'application/json');

    this.profile = this.loginService.userProfile;
    let uid: string = this.profile.sub;

    let params: URLSearchParams = new URLSearchParams();
    params.set('uid', uid);

    const options = new RequestOptions({headers: headers});

    return this.http.get('http://localhost:9000/cart', options)
      .map(response => <Cart[]>response.json());

  }

  removeFromCart(title: String) {
    const headers: Headers = new Headers();
    headers.append('Accept', 'application/json');
    headers.append('Content-Type', 'application/json');

    const options = new RequestOptions({headers: headers});
    this.http.get('http://localhost:9000/removefromcart/' + title, options)
      .subscribe(
        data => console.log('remove from cart', data),
        error => console.error('error', error)
      );
  }

  addToCart(title: String, price: number) {

    console.log('login service');

    this.profile = this.loginService.userProfile;
    let uid: string = this.profile.sub;

    console.log('uid = ' + uid);

    const serializedJson = JSON.stringify({
      'title': title,
      'price': Number(price),
      'uid': uid
    })

    const headers: Headers = new Headers();
    headers.append('Accept', 'application/json');
    headers.append('Content-Type', 'application/json');

    const options = new RequestOptions({headers: headers});

    this.http.post('http://localhost:9000/addtocart', serializedJson, options)
      .subscribe(
        data => console.log('product added to cart', data),
        error => console.error('adding to cart error', error)
      );
  }

}
