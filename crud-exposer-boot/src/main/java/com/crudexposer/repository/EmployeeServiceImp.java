package com.crudexposer.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudexposer.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {

		Employee savedEmployee = null;

		try {

			savedEmployee = employeeRepository.save(employee);
		} catch (RuntimeException e) {
			System.out.println("Exception while saving." + e);
		}

		return savedEmployee;
	}

	@Override
	public Employee deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> allEmplyoee() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {

		return null;
	}

	@Override
	public Employee getEmployeeByName(String name) {

		return employeeRepository.findByName(name);
	}

}
