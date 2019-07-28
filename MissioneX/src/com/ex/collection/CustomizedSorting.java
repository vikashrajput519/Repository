package com.ex.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CustomizedSorting {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>(new MyComparator$CustomizedSorting());
		set.add(10);
		set.add(50);
		set.add(25);
		set.add(40);
		set.add(30);
		set.add(70);
		set.add(80);
		System.out.println(set);
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(60);
		list.add(40);
		list.add(30);
		list.add(5);
		Collections.sort(list, new MyComparator$CustomizedSorting());
		System.out.println(list);
		
		Integer[] a = {10,30,49,35};
		Arrays.sort(a);
		
		for(int i : a)
		{
			System.out.println(i);
		}
		
		Arrays.sort(a,new MyComparatorPremit$CustomizedSorting());
		for(int i : a)
		{
			System.out.println(i);
		}
	}
}

class MyComparator$CustomizedSorting implements Comparator<Integer> {

	@Override public int compare(Integer o1, Integer o2) {

		if(o1 > o2) // o1 - o2
			return -1;
		else if(o1 < o2)
			return 1;
		else
			return 0; 
	 }

	/*
	 * @Override public int compare(Integer o1, Integer o2) {
	 * 
	 * return - o1.compareTo(o2); }
	 */

}
class MyComparatorPremit$CustomizedSorting implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		return -o1.compareTo(o2);
	}
	
}