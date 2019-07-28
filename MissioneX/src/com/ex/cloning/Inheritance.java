package com.ex.cloning;

public class Inheritance {
	
	public static void main(String[] args) {
		A a = new B();
		a.m1();
		a.m2();
		//
		//a.m3();
	}
}
class A
{
	public void m1() {
		System.out.println("M1");
	}
	public void m2() {
		System.out.println("A M2");
	}
}
class B extends A
{
	public void m2() {
		System.out.println("B M2");
	}
	public void m3() {
		System.out.println("B M2");
	}
}

