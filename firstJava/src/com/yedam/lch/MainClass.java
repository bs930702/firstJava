package com.yedam.lch;

public class MainClass {
	public static void main(String[] args) {
		int[] aAry = { 1, 8, 3, 2, 6 };
		for (int i = aAry.length - 1; i >= 0; i--) {
			System.out.print(aAry[i] + " ");
		}
		// => 6, 5, 3, 2, 1 출력결과
	}

}
