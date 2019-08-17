import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class LoginService {

  constructor(private http: HttpClient) { }

  sendCredential(username: string, password: string) {

    console.log("User -- > "+username,+"Pass -- > "+password);
  	let url = "http://localhost:8181/token";
  	let encodedCredentials = btoa(username+":"+password);
  	let basicHeader = "Basic "+encodedCredentials;
  	let headers = new HttpHeaders ({
      'Content-Type' : 'application/x-www-form-urlencoded',
  		'Authorization' : basicHeader
  	});

  	return this.http.get(url, {headers: headers});

  }

  checkSession() {
    let url = "http://localhost:8181/checkSession";
    
    let headers = new HttpHeaders ({
      'x-auth-token' : localStorage.getItem('xAuthToken')
    });

    return this.http.get(url, {headers: headers});
  }

}
