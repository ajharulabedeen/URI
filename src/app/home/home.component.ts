import { Component, OnInit } from '@angular/core';
import { TopnavbarComponent } from '../layout/topnavbar/topnavbar.component';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  // var home : boolean = false;
  // private log = new  LoginComponent();
  constructor() { }

  home = false;
  // login = this.log.getLoginInfo();
  // login = LoginComponent.loggedIn;

  top = new TopnavbarComponent();
  myMsg = 'Hello World!';


  // activeHome() {
  //   if (this.home) {
  //     this.home = false;
  //     this.top.logFalse();
  //   }
  //   else if (this.home == false) {
  //     this.home = true;
  //   }
  //   // if(LoginComponent.loggedIn){
  // }//activeHome

  ngOnInit() {
    window.dispatchEvent(new Event('resize'));
    document.body.className = 'hold-transition skin-blue sidebar-mini';
  }

  ngOnDestroy(): void {
    document.body.className = '';
  }
}//class
