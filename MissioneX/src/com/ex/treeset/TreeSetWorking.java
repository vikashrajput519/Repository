package com.ex.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetWorking {

	public static void main(String[] args)throws RuntimeException {

		Set<Integer> tree = new TreeSet<>();
		tree.add(10);
		tree.add(30);
		tree.add(5);
		tree.add(1);
		tree.forEach(t -> System.out.println(t));

	}
}
