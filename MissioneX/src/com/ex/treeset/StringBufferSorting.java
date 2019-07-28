package com.ex.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class StringBufferSorting
	{
		public static void main(String[] args)
			{
				m1();
				System.out.println("===========");
				m2();
			}

		public static void m1()
			{
				TreeSet<StringBuffer> t = new TreeSet<>(new MyStringBufferComparator());
				t.add(new StringBuffer("Vikash"));
				t.add(new StringBuffer("Archna"));
				t.add(new StringBuffer("Devendra"));
				t.add(new StringBuffer("Sonu"));
				t.forEach(tr -> System.out.println(tr));
				//t.forEach(tr -> System.out.println(t)); 
			}
		public static void m2()
			{
				TreeSet t = new TreeSet<>(new MyStringBufferOrComparator());
				t.add(new StringBuffer("Vikash"));
				t.add(new StringBuffer("Archna"));
				t.add(new StringBuffer("Devendra"));
				t.add(new StringBuffer("Sonu"));
				t.forEach(tr -> System.out.println(tr));
				//t.forEach(tr -> System.out.println(t)); 
			}
	}
class MyStringBufferComparator implements Comparator<StringBuffer>
{
	@Override
	public int compare(StringBuffer o1, StringBuffer o2)
		{
			//return o1.toString().compareTo(o2.toString());
			//return -o1.toString().compareTo(o2.toString());
			return o2.toString().compareTo(o1.toString());
		}
	
}
class MyStringBufferOrComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
		{
			String s1 = o1.toString();
			String s2 = o2.toString();
			return s1.compareTo(s2);
		}
	
}
