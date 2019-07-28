package com.ex.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class IntegerCustomSorting
	{

		public static void main(String[] args)
			{
				m1();
				System.out.println("===============");
				m2();
			}

		public static void m1()
			{
				TreeSet<Integer> t = new TreeSet<>();
				// Set<Integer> t = new TreeSet<>();
				t.add(10);
				t.add(30);
				t.add(5);
				t.add(1);
				t.add(5);
				t.add(2);
				t.forEach(tr -> System.out.println(tr));
			}

		public static void m2()
			{
				TreeSet<Integer> t = new TreeSet<>(new MyIntComparator());
				// Set<Integer> t = new TreeSet<>();
				t.add(10);
				t.add(30);
				t.add(5);
				t.add(1);
				t.add(5);
				t.add(2);
				t.forEach(tr -> System.out.println(tr));
			}

	}

class MyIntComparator implements Comparator<Integer>
	{

		@Override
		public int compare(Integer ob1, Integer ob2)
			{
				// ascending
				// return ob1.compareTo(ob2);
				// descending
				// return ob2.compareTo(ob1);
				// ascending
				// if (ob1 > ob2)
				// {
				// return 1;
				// }
				// else if (ob2 > ob1)
				// {
				// return -1;
				// }

				// else
				// {
				// return 0;
				// }
				// descending
				if (ob1 < ob2) return 1;
				if (ob2 < ob1) return -1;
				else return 0;

			}

	}