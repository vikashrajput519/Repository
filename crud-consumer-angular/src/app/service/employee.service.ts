import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Employee } from '../model/employee.model';

@Injectable({
  providedIn: 'root'
})

export class EmployeeService {

  constructor(private http:HttpClient) { }

  //private userUrl = '/api';//

  getEmployees()
  {
    const url = "http://localhost:8182/crud/api/getAllEmployee";
    
    const headers = new HttpHeaders(
      {
        Authorization: 'Basic ' + btoa('test:test123')
      }
      );
      return this.http.get(url, { headers });
  }
  
  public createEmp(Employee) 
  {
    const url = "http://localhost:8182/crud/api/addEmployee";
    
    const headers = new HttpHeaders(
      {
        Authorization: 'Basic ' + btoa('test:test123')
      }
      );
    return this.http.post<Employee>(url, Employee);
  }

  public deleteEmployee(String) 
  {
    
    return this.http.post<Employee>("http://localhost:8182/crud/api/addEmployee", Employee);
  }
}
