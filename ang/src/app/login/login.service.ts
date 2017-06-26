import { Injectable } from '@angular/core';
import { Http , URLSearchParams , Response  } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import {Route, Router} from '@angular/router';

declare var auth0: any;

@Injectable()
export class LoginService {
  userProfile: any;
  success: boolean = false;

  auth0 = new auth0.WebAuth({
    clientID: 'pt6MOYj81ia01QJCTJii1AA37ci5yhQe',
    domain: 'bananeeek.eu.auth0.com',
    responseType: 'token id_token',
    audience: 'https://bananeeek.eu.auth0.com/userinfo',
    redirectUri: 'http://localhost:4200/callback',
    scope: 'openid'
  });

  constructor(public http: Http, private router: Router) {}

  auth() {
    this.auth0.authorize();
  }

  public handleAuthentication(): boolean {
    this.auth0.parseHash((err, authResult) => {
      if (authResult && authResult.accessToken && authResult.idToken) {
        window.location.hash = '';
        this.setSession(authResult);
        this.success = true;
        this.router.navigate(['/categories']);
      } else if (err) {
        this.router.navigate(['/home']);
        console.log(err);
        this.success = false;
      }
    });
    return this.success;
  }

  private setSession(authResult): void {
    // Set the time that the access token will expire at
    const expiresAt = JSON.stringify((authResult.expiresIn * 1000) + new Date().getTime());
    localStorage.setItem('access_token', authResult.accessToken);
    localStorage.setItem('id_token', authResult.idToken);
    localStorage.setItem('expires_at', expiresAt);
  }

  public logout(): void {
    this.success = false;
    localStorage.removeItem('access_token');
    localStorage.removeItem('id_token');
    localStorage.removeItem('expires_at');
    this.router.navigate(['/']);
  }

  public isAuthenticated(): boolean {
    const expiresAt = JSON.parse(localStorage.getItem('expires_at'));
    return new Date().getTime() < expiresAt;
  }


  public getProfile(cb): void {
    const accessToken = localStorage.getItem('access_token');
    if (!accessToken) {
      throw new Error('Access token must exist to fetch profile');
    }

    const self = this;
    this.auth0.client.userInfo(accessToken, (err, profile) => {
      if (profile) {
        self.userProfile = profile;
      }
      cb(err, profile);
    });
  }


}
