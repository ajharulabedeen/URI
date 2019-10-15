import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

export interface AuthResponseData {
  access_token: string;
  token_type: string;
  expires_in: number;
  user: string;
}

@Injectable({ providedIn: 'root' })
export class AuthService {
  constructor(private http: HttpClient) { }

  signup(email: string, password: string) {
    return this.http
      .post<AuthResponseData>(
        'http://127.0.0.1:8000/api/signup ',
        {
          name: "Test Name",
          email: email,
          password: password,
          password_confirmation: password
        }
      )
      .pipe(
        catchError(errorRes => {
          // console.log(errorRes.error.errors.email[0]);
          let errorMessage = 'An unknown error occurred!';
          // errorMessage = 'This email already taken!';
          // if (!errorRes.error || !errorRes.error.error) {
          //   errorMessage = errorRes.error.errors.email[0];
          //   return throwError(errorMessage);
          // }

          //working
          // if (errorRes.error.errors.email[0] === "The email has already been taken.") {
          if (errorRes.error.errors.email[0].match("The email has already been taken.")) {
            errorMessage = 'This email already taken!';
            console.log("ERR : " + errorRes.error.errors.email[0]);
            errorMessage = errorRes.error.errors.email[0];
            return throwError(errorMessage);
          }

          // switch (errorRes.error.error.message) {
          //   case 'EMAIL_EXISTS':
          //     errorMessage = 'This email exists already';
          // }


          return throwError(errorMessage);
        })
      );
  }
}
