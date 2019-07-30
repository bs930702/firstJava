package com.yedam.lch;

public class Calculator {

	static double multi(double x, double y) {
		return x * y;
	}

	static double div(double x, double y) {
		return x / y;
	}

	int plus(int x, int y) {
		return x + y;
	}

	double avg(int x, int y) {
		return plus(x, y) / 2;
	}

	void println(String message) {
		System.out.println(message);
	}

	void execute() {
		println("결과값은" + avg(7, 10));
	}

	// 메소드 오버로딩.
	// 사각형의 넓이를 구하는 메소드. areaRectangle(1 or 2)
	// 1)정사각형이면 width
	// 2)직사각형이면 width, height
	double areaRectangle(double width) {
		return width * width;
	}

	double areaRectangle(double width, double height) {
		return width * height;

	}
}
