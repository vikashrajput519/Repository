package com.ex.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SotingUsingLength {

	public static void main(String[] args) {
		Set set = new TreeSet<>(new MyComparator$SotingUsingLength());
		set.add(new StringBuffer("Vikash singh"));
		set.add("vikash");
		set.add(new StringBuffer("Archna"));
		set.add("Devendra");
		set.add("Sonu");
		set.add("Rahul");
		System.out.println(set);
	}
}
class MyComparator$SotingUsingLength implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		
		if((o1 instanceof String || o1 instanceof StringBuffer) && (o2 instanceof String || o2 instanceof StringBuffer))
		{
			String str1 = o1.toString();
			String str2 = o2.toString();
			
			if(str1.length() > str2.length())
			{
				return 1;
			}
			else if(str1.length() < str2.length())
			{
				return -1;
			}
			else if (str1.length() == str2.length())
			{
				return str1.compareTo(str2);
			}
		}
		return 0;
	}
	
}