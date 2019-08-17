package com.crudexposer.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudexposer.model.Employee;
import com.crudexposer.repository.EmployeeService;

@RestController
@RequestMapping("/crud/api")
public class TestResource {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/addEmployee")	
	@CrossOrigin("http://localhost:4200")
	public void addEmployee(@RequestBody Employee employee){
		
		 employeeService.addEmployee(employee);
	}
	
	@GetMapping("/getAllEmployee")	
	@CrossOrigin("http://localhost:4200")
	public List<Employee> getAllEmployee(){
		
		return employeeService.allEmplyoee();
	}
	
	@RequestMapping("/getEmployeeByName/{name}")	
	@CrossOrigin("http://localhost:4200")
	public Employee getEmployeeByName(@PathVariable String name){
		
		return employeeService.getEmployeeByName(name);
	}
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello testing, I am ready.";
	}
}