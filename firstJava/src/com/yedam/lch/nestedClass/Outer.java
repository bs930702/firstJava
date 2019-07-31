package com.yedam.lch.nestedClass;

public class Outer {
	// 중첩 클래스 B
	class B {
		B() {
			System.out.println("B객체가 생성됨.");
		}

		int fieldB;

		void methodB() {
			System.out.println("B메소드 호출.");

		}
	}

	// 중첩 클래스 C
	static class C {
		C() {
			System.out.println("C객체가 생성됨.");
		}

		int fieldC;
		static int fieldCC;

		void methodC() {
			System.out.println("C메소드 호출.");
		}

		static void methodCC() {
			System.out.println("CC메소드 호출.");
		}
	}

	// 중첩 인터페이스 D
	interface D {
		int fieldD = 4;

		void method();
	}

	void method() {
		class F {
			F() {
				System.out.println("F객체 생성.");
			}

			int fieldF;

			void methodF() {
				System.out.println("F메소드 호출.");
			}
		}
		F f = new F();
		f.fieldF = 10;
		f.methodF();
	}
}
