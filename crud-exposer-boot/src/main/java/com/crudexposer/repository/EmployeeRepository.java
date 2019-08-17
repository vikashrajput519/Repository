package com.crudexposer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crudexposer.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	public Employee findByName(String name);
}