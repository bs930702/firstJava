package com.yedam.lch.exception;

public class ExceptionExample1 {
	public static void main(String[] args) {

		try {
			String str1 = args[0];
			String str2 = args[1];
			System.out.println(str1);
			System.out.println(str2);
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			System.out.println("num1 => " + num1);
			System.out.println("num2 => " + num2);

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("배열예외 발생 or 변환할 수 없는 타입 입니다.");
		} catch (Exception e3) {
			System.out.println("알수 없는 예외 발생.");
		} finally {
			System.out.println("try 구문이 실행되면 항상 실행되는 내용 기술.");
		}
		System.out.println("프로그램의 끝부분.");
	}
}
