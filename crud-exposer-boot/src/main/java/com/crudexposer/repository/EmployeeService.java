package com.crudexposer.repository;

import java.util.List;

import com.crudexposer.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	public Employee deleteEmployee(Long id);
	public Employee updateEmployee(Employee employee);
	
	public List<Employee> allEmplyoee();
	public Employee getEmployeeById(Long id);
	public Employee getEmployeeByName(String name);

}
