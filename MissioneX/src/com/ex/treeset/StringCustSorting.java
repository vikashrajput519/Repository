package com.ex.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StringCustSorting
	{
		public static void main(String[] args)
			{
				m1();
				System.out.println("===========");
				m2();
			}

		public static void m1()
			{
				TreeSet<String> t = new TreeSet<>();
				t.add("Vikash");
				t.add("Archna");
				t.add("Devendra");
				t.add("Sonu");
				t.forEach(tr -> System.out.println(tr));
				//t.forEach(tr -> System.out.println(t)); 
			}
		public static void m2()
			{
				TreeSet<String> t = new TreeSet<>(new MyStringComparator());
				t.add("Vikash");
				t.add("Archna");
				t.add("Devendra");
				t.add("Sonu");
				t.forEach(tr -> System.out.println(tr));
				//t.forEach(tr -> System.out.println(t)); 
			}
	}
class MyStringComparator implements Comparator<String>
{


	@Override
	public int compare(String o1, String o2)
		{
			//return -o1.compareTo(o2);
			return o2.compareTo(o1);
		}
	
}