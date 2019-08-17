import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatButtonModule, MatCheckboxModule,MatToolbar,MatGridListModule,MatInputModule,MatTableModule} from '@angular/material';
import { FormsModule } from '@angular/forms';
import 'hammerjs';

import { EmployeeService } from './service/employee.service';
import { AddEmployeeComponent } from './employee/add-employee/add-employee.component';
import { AllEmployeeComponent } from './employee/all-employee/all-employee.component';

@NgModule({
  declarations: [
    AppComponent,
    MatToolbar,
    AddEmployeeComponent,
    AllEmployeeComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCheckboxModule,
    MatGridListModule,
    MatInputModule,
    FormsModule,
    MatTableModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule
  ],
  providers: [
    EmployeeService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
