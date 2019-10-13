import { Component, OnInit } from '@angular/core';
import { LoginComponent } from '../../login/login/login.component';

@Component({
  selector: 'app-asidenavbar',
  templateUrl: './asidenavbar.component.html',
  styleUrls: ['./asidenavbar.component.scss']
})
export class AsidenavbarComponent implements OnInit {

  loggedIn = LoginComponent.loggedIn;

  constructor() { }

  ngOnInit() {
  }

}
