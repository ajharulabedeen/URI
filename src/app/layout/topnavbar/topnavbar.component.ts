import { Component, OnInit } from '@angular/core';
import { LoginComponent } from 'src/app/login/login/login.component';

@Component({
  selector: 'app-topnavbar',
  templateUrl: './topnavbar.component.html',
  styleUrls: ['./topnavbar.component.scss']
})
export class TopnavbarComponent implements OnInit {

  login = true;
  // login = LoginComponent.loggedIn;
  // static login = true;

  public logFalse() {
    console.log("Top : " + this.login);
    this.login = false;
    console.log("Top : " + this.login);
  }
  public logTrue() {
    console.log("Top : " + this.login);
    this.login = true;
    console.log("Top : " + this.login);
  }

  constructor() { }

  ngOnInit() {
  }

}
