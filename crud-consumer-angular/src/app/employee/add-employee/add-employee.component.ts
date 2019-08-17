import { Component, OnInit } from '@angular/core';

import { Employee } from '../../model/employee.model';
import { Router } from '@angular/router';
import { EmployeeService } from 'src/app/service/employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent{

  employee: Employee = new Employee();

  constructor(private router: Router, private userService: EmployeeService) { }


  createEmployee(): void {

    this.userService.createEmp(this.employee)

        .subscribe( data => {
          alert("User created successfully.");
        });

  };

}
