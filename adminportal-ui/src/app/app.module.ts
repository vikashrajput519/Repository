import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Injectable } from '@angular/core';

import { HttpClientModule, HttpHandler, HttpInterceptor, HttpRequest, HTTP_INTERCEPTORS } from '@angular/common/http';
import { routing } from './app.routing';

import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatButtonModule, MatCheckboxModule,MatToolbar,MatGridListModule,MatInputModule} from '@angular/material';
import { FormsModule } from '@angular/forms';
import 'hammerjs';

import { AppComponent } from './app.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { LoginComponent } from './components/login/login.component';

import { LoginService } from './services/login.service';

@Injectable()
export class XhrInterceptor implements HttpInterceptor {

  intercept(req: HttpRequest<any>, next: HttpHandler) {
    const xhr = req.clone({
      headers: req.headers.set('X-Requested-With', 'XMLHttpRequest')
    });
    return next.handle(xhr);
  }
}
@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    MatToolbar,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCheckboxModule,
    MatGridListModule,
    MatInputModule,
    FormsModule,
    HttpClientModule,
    routing
  ],
  providers: [
    LoginService,{ provide: HTTP_INTERCEPTORS, useClass: XhrInterceptor, multi: true }
  ],
  bootstrap: [AppComponent]
})

export class AppModule { }
