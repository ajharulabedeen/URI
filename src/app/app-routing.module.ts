import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './public/about/about.component';
import { NewsComponent } from './public/news/news.component';
import { EventsComponent } from './public/events/events.component';
import { RegisterComponent } from './public/register/register.component';


const routes: Routes = [
  // {path: '', redirectTo: 'login', pathMatch: 'full'}
  // {path: '', redirectTo: 'dashboard', pathMatch: 'full'}//working
  // { path: '', redirectTo: 'dashboard', pathMatch: 'full' },//working
  { path: 'about', component: AboutComponent },
  { path: 'news', component: NewsComponent },
  { path: 'events', component: EventsComponent },
  { path: 'register', component: RegisterComponent },
  // { path: 'home', component: HomeComponent }
  { path: '', component: HomeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
