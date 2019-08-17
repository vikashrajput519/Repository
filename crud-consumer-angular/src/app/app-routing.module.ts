import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AllEmployeeComponent } from './employee/all-employee/all-employee.component';
import { AddEmployeeComponent } from './employee/add-employee/add-employee.component';
import {  } from './employee/add-employee/add-employee.component';

const routes: Routes = [
  
  { path: 'all-employee', component: AllEmployeeComponent},
  { path: 'add-employee', component: AddEmployeeComponent}
  
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
