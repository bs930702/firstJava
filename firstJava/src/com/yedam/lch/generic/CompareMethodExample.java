package com.yedam.lch.generic;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(10, "Kwon");
		Pair<Integer, String> p2 = new Pair<>(10, "Kwon");
		boolean result = Util.compare(p1, p2);
		if(result)
			System.out.println("논리적으로 동일한 객체");
		else
			System.out.println("논리적으로 동일한 객체가 아닙니다");
	}
}
