import { Component, OnInit,OnDestroy } from '@angular/core';
import { LoginComponent } from '../../login/login/login.component';
import { Subscription } from 'rxjs';
import { AuthService } from 'src/app/auth/auth.service';

@Component({
  selector: 'app-asidenavbar',
  templateUrl: './asidenavbar.component.html',
  styleUrls: ['./asidenavbar.component.scss']
})
export class AsidenavbarComponent implements OnInit, OnDestroy {

  isAuthenticated = false;
  private userSub: Subscription;

  profile = true;
  loggedIn = LoginComponent.loggedIn;

  constructor(private authService: AuthService) { }

  ngOnInit() {
    console.log("Asidebar onInit()");
    this.userSub = this.authService.user.subscribe(user => {
    console.log("Auth Subscriber:");
      this.isAuthenticated = !!user;
      console.log(!user);
      console.log(!!user);
    });
  }//onInit

  ngOnDestroy() {
    this.userSub.unsubscribe();
  }

}//class
