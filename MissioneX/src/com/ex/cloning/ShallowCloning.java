package com.ex.cloning;

public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student student = new Student();
		student.setName("Vikash");
		student.setStudentRoll(1);
		
		Address address = new Address();
		address.setFlatNo("V-689");
		address.setAddressLine1("Jalvayu vihar");
		address.setAddressLine2("GN");
		
		student.setAddress(address);
		System.out.println(student);
		
		System.out.println(" ============  ");
		
		Student student2 = (Student) student.clone();
		student2.setStudentRoll(10);
		student2.setName("Archna");
		student2.getAddress().setAddressLine1("Patna");
		System.out.println(student2);
		System.out.println(student);
	}
}
class Student implements Cloneable
{
	private int studentRoll;
	private String name;
	private Address address;

	public int getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public String toString()
	{
		return studentRoll+" , "+name+" , "+address;
	}
}
class Address
{
	private String flatNo;
	private String addressLine1;
	private String addressLine2;
	
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String toString()
	{
		return flatNo+" , "+addressLine1+" , "+addressLine2;
	}
}
