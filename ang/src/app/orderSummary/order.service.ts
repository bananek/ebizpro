/**
 * Created by BanaN on 6/17/2017.
 */

import { Injectable } from '@angular/core';
import {Http, Headers, RequestOptions} from '@angular/http';
import {Order} from './order';
import 'rxjs/add/operator/map';

@Injectable()
export class OrderService {

  constructor(private http: Http) {}

  sendOrder( productlist: string, shipment: string,
            payment: string, price: number, uid: string, address: string) {

    const serializedOrder = JSON.stringify({
      'oid': 0,
      'productlist': productlist,
      'shipment': shipment,
      'payment': payment,
      'price': Number(price),
      'uid': uid,
      'address': address
    })

    const headers: Headers = new Headers();
    headers.append('Accept', 'application/json');
    headers.append('Content-Type', 'application/json');

    const options = new RequestOptions({headers: headers});

    this.http.post('http://localhost:9000/sendorder', serializedOrder, options)
      .subscribe(
        data => console.log('order sent', data),
        error => console.error('order rr', error)
      );

  }
}

