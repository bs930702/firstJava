package com.yedam.lch.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Oracle");
		list.add(1, "JDBC");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ", " + list.get(i));
		}
		list.remove(2);
		System.out.println("------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ", " + list.get(i));
		}
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("=============");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		List<String> liast1 = new LinkedList<>();
		long starTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list.add(0, "hello"); // arraylist
		}
		long endTime = System.nanoTime();
		starTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list.add(0, "hello"); // linkedlist
	}
		endTime = System.nanoTime();
		System.out.println("ArrayList : " + (endTime - starTime));
		starTime = System.nanoTime();
		
		for (int i = 0; i < 100000; i++) {
			list.add(0, "hello"); // linkedlist
			
		}
	}
}
