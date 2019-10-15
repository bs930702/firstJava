package com.yedam.lch.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	String name;
	int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		System.out.println(name.hashCode() + age);
		return name.hashCode() + age;
	}

//	@Override
//	public boolean equals(Object obj) {
//		Member meber = (Member) obj;
//		return (name.equals(member.name) && age == member.age);
//	}
}

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> mSet = new HashSet<>();
		mSet.add(new Member("Kwon", 10));
		mSet.add(new Member("Kwon", 10));
		System.out.println(mSet.size());

		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("Oracle");
		set.add("JDBC");
		set.add("Kwon");
		System.out.println(set.size());
		System.out.println("===========");
		for (String str : set) {
			System.out.println(str);
		}
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
