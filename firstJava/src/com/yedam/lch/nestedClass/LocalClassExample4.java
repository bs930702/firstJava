package com.yedam.lch.nestedClass;

class OuterClass1 {
	class NestedClass {

	}
}

class OuterClass2 {
	static class StaticNestedClass {

	}

	class InnerClass {

	}
}

class ShadowTest {
	public int x = 0;

	class FirstLevel {
		public int x = 1;

		void methodInFirstLevel(int x) {
			System.out.println("x = " + x);
			System.out.println("this.x " + this.x);
			System.out.println("ShadowTest.this.x " + ShadowTest.this.x);
		}
	}
}

public class LocalClassExample4 {
	public static void main(String[] args) {
		ShadowTest st = new ShadowTest();
		ShadowTest.FirstLevel f1 = st.new FirstLevel();
		f1.methodInFirstLevel(23);
	}
}
