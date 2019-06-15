package com.ex.cloning;

public class DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		StudentForDeep student = new StudentForDeep();
		student.setStudentRoll(1);
		student.setName("Vikash");

		Address address = new Address();
		address.setFlatNo("V-689");
		address.setAddressLine1("Jalvayu vihar");
		address.setAddressLine2("GN");

		student.setAddress(address);
		System.out.println(student);

		System.out.println(" ============  ");

		StudentForDeep student2 = (StudentForDeep) student.clone();
		student2.setStudentRoll(10);
		student2.setName("Archna");
		student2.getAddress().setAddressLine1("Patna");
		student2.getAddress().setFlatNo("D-146");
		student2.getAddress().setAddressLine2("Test");
		System.out.println(student2);
		System.out.println(student);
	}
}

class StudentForDeep implements Cloneable {
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

	public Object clone() throws CloneNotSupportedException {
		Address tempAddress = new Address();
		tempAddress.setFlatNo(this.address.getFlatNo());
		tempAddress.setAddressLine1(this.address.getAddressLine1());
		tempAddress.setAddressLine2(this.address.getAddressLine2());
		StudentForDeep std = new StudentForDeep();
		std.setName(this.getName());
		std.setStudentRoll(this.getStudentRoll());
		std.setAddress(tempAddress);
		return std;
	}

	public String toString() {
		return studentRoll + ", " + name + ", " + address;
	}
}

class AddressForDeep {
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

	public String toString() {
		return flatNo + ", " + addressLine1 + ", " + addressLine2;
	}
}