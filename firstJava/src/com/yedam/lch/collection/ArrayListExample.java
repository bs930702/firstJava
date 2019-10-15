package com.yedam.lch.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class ArrayListExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<>();
		list.add(new Student("Kwon", 27));
		list.add(new Student("Kim", 20));
		list.add(new Student("Min", 27));
		int cnt = 0;
		while (cnt < 3) {
			System.out.println("이름입력:");
			String name = sc.nextLine();
			System.out.println("나입이력:");
			int age = sc.nextInt();
			sc.nextLine();
			list.add(new Student(name, age));
			cnt++;
		}

		for (Student st : list) {
//			if (st.getName().equals("Kwon")) {
			System.out.println(st.getName() + " " + st.getAge());
		}
	}
}

//		List<String> list = new ArrayList<>();
//		list.add("hello");
//		list.add("world");
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.size());
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		list.add("nice");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		list.remove(0);
//		for (String str : list) {
//			System.out.println(str);
//		}
