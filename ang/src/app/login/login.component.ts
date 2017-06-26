import { Component, Input } from '@angular/core';
import { LoginService } from './login.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html'
})
export class LoginComponent {

  private token: number;
  profile: any;
  profileSaved: boolean = false;


  constructor(public loginService: LoginService, private route: ActivatedRoute) {
  }

  ngOnInit() {
    let res = this.loginService.handleAuthentication();
  }

  login() {
    return this.loginService.auth();
  }

  logout() {
    this.profileSaved = false;
    return this.loginService.logout();
  }

  isAuthenticated() {
    return this.loginService.isAuthenticated();
  }

  isSuccess() {
    let res = this.loginService.success;
    if(res && !this.profileSaved) {
      this.getUserInfo();
      this.profileSaved = true;
    }
    return res;
  }

  hasToken() {
    if(localStorage.getItem('access_token')){
      return true;
    } else {
      return false;
    }
  }

  getUserInfo() {
    if (this.loginService.userProfile) {
      this.profile = this.loginService.userProfile;
    } else {
      this.loginService.getProfile((err, profile) => {
        this.profile = profile;
      });
    }
  }

}
