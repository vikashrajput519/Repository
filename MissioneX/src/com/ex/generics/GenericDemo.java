package com.ex.generics;

public class GenericDemo<T> {
	
	public void print(T obj)
	{
		System.out.println("This is object version of type : "+obj+" - "+obj.getClass().getName());
	}
	
	public static void main(String[] args) {
		GenericDemo<Integer> i = new GenericDemo<>();
		i.print(10);
	}
}
