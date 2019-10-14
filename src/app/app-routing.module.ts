import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './public/about/about.component';


const routes: Routes = [
  // {path: '', redirectTo: 'login', pathMatch: 'full'}
  // {path: '', redirectTo: 'dashboard', pathMatch: 'full'}//working
  { path: '', redirectTo: 'dashboard', pathMatch: 'full' },//working
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
