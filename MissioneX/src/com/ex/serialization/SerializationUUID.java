package com.ex.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationUUID {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Employee employee = new Employee();
		employee.setName("Vikash");
		employee.setAge(28);
		employee.setAddress("No where");
		
		new Writer().writeObject(employee);
		System.out.println("Writing process Done.");
		
		System.out.println("Rading process started.");
		
		Employee emp = new Writer().readObject();
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getAddress());
	}
}
class Writer
{
	public void writeObject(Employee employee) throws FileNotFoundException,IOException
	{
		FileOutputStream fOut = new FileOutputStream("G:\\SOFTWARES\\STUDY\\employee.obj");
		ObjectOutputStream objectOutput = new ObjectOutputStream(fOut);
		objectOutput.writeObject(employee);
		objectOutput.close();
	}
	public Employee readObject() throws ClassNotFoundException, IOException
	{
		FileInputStream fInput = new FileInputStream("G:\\SOFTWARES\\STUDY\\employee.obj");
		ObjectInputStream objectInput = new ObjectInputStream(fInput);
		Employee employee = (Employee) objectInput.readObject();
		objectInput.close();
		return employee;
	}
}
class Employee implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
