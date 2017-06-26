import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


import { LoginComponent } from './login/login.component';
import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { CategoryComponent } from './category/category.component';
import { ShowProductComponent } from './showProduct/showProduct.component';
import { CartComponent } from './cart/cart.component';
import { PageNotFoundComponent } from './not-found/not-found.component';
import { TestComponent } from './test/test.component';
import { OrderSummaryComponent } from './orderSummary/orderSummary.component';

import { LoginService } from './login/login.service';
import { ProductService } from './product/product.service';
import { CartService } from './cart/cart.service';
import { CategoryService } from './category/category.service';
import { TestService } from './test/test.service';
import { OrderService } from './orderSummary/order.service';
import { CanActivateViaOAuthGuard } from './oAuth.canActivateGuard';




@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
    CategoryComponent,
    ShowProductComponent,
    PageNotFoundComponent,
    CartComponent,
    TestComponent,
    OrderSummaryComponent,
    LoginComponent
  ],
  imports: [
    HttpModule,
    FormsModule,
    BrowserModule,
    ReactiveFormsModule,
    BrowserModule,
    RouterModule.forRoot([
      { path: '.', component: AppComponent},
      { path: 'test', component: TestComponent},
      { path: 'index.hyml', component: AppComponent},
      { path: 'products', component: ProductComponent},
      { path: 'category/:id', component: ProductComponent},
      { path: 'categories', component: CategoryComponent},
      { path: 'cart', component: CartComponent, canActivate: [CanActivateViaOAuthGuard]},
      { path: 'orderSummary', component: OrderSummaryComponent},
      { path: 'login', component: LoginComponent},
      { path: 'callback', component: LoginComponent},
      { path: 'showProduct/:id', component: ShowProductComponent},
      { path: 'moreparams/:tytul/:opis', component: ProductComponent},
      { path: '', redirectTo: 'products', pathMatch: 'full'},
      { path: '**', component: PageNotFoundComponent }
      ])
  ],
  providers: [ProductService,
              CartService,
              CategoryService,
              TestService,
              LoginService,
              OrderService,
             CanActivateViaOAuthGuard],
  bootstrap: [AppComponent]

})
export class AppModule { }
