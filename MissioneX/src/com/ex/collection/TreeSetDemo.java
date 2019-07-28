package com.ex.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Employee> emp = new TreeSet<>();
		
		emp.add(new Employee(1,"Vikash Singh",26));
		emp.add(new Employee(2, "Dev", 28));
		emp.add(new Employee(3, "Test", 28));
		System.out.println(emp);
	}
}

class Employee implements Comparable<Employee>
{
	private Integer id;
	private String name;
	private int age;
	
	Employee(int id, String name,int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Employee o) {
		return this.id.compareTo(o.id);
	}

	@Override
	public String toString()
	{
		return id+" "+name+" "+age;
	}
	
	public boolean equals(Employee e)
	{
		return this.id.equals(e.id);
	}
}
