package com.yedam.lch.nestedClass;

//Outer > B
//		> static C
//		> D (interface)
public class OuterExample {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method();

		Outer.B b = outer.new B();
		b.fieldB = 10;
		b.methodB();

		// 인스턴스 클래스 생성.
		Outer.C c = new Outer.C();
		c.fieldC = 10;
		c.methodC();

		// 정적클래스 생성.
		Outer.C.fieldCC = 10;
		Outer.C.methodCC();
	}
}