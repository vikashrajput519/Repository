import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../../service/employee.service';

@Component({
  selector: 'app-all-employee',
  templateUrl: './all-employee.component.html',
  styleUrls: ['./all-employee.component.css']
})
export class AllEmployeeComponent implements OnInit {

  employees$: Object;

  constructor(private data : EmployeeService) { }

  ngOnInit() {
    this.data.getEmployees().subscribe(

      data => this.employees$ = data

    );
  }

}
