package firstJava;

public class First {
	/*
	 * 자바로 만든 첫번째 프로그램입니다. 2019년 7월 17일 by 권보성
	 */
	public static void main(String[] args) {
		System.out.println("Hello 방가방가");
		introduce("권보성", 27, 170.1);

		int sum = 0;

		for (int i = 0; i < 10; i = i + 1) { // i = 0
			sum = sum + i;
		}
		System.out.println(sum);

//		for (int i = 0; i < 100; i++) {
//			System.out.println("i의 값은:" + i);
//			startProgram(i+1);
//		}
		mod(3, 2); // 3%2
		div(4, 4);
		sum2(3, 10);
//		startProgram(1); // start_program < oracle 에서 씀
		System.out.println("End of Program");
	}

	static void mod(int a, int b) {
		System.out.println("답 :" + a % b);
	}

	// div( a , b )
	static void div(int a, int b) {
		double c = (double) a / (double) b; // float, double
		System.out.println("답 :" + c);
	}

	static void sum1(int x, int y) {
		System.out.println("더하기:" + (x + y));
	}

	static void startProgram(int x) {
		int a, b, c; // double, short, byte, long
		a = 1;
		b = 2;
		c = (a + b) * x;
		System.out.println("Result:" + c);
	}

	// 데이터 타입: 정수(int), 실수(double), 문자열(string)
	static void introduce(String name, int age, double height) {
		System.out.println("이름은:" + name + " 나이는:" + age + " 키는:" + height + "cm");
	}

	static void sum2(int x, int y) {
		int sum3 = 0;
		for (; x < y;) {
			sum3 = sum3 + x;
			x = x + 1;
		}
		System.out.println(sum3);
	}

}
