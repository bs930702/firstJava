package com.yedam.lch;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
//		Calendar now = Calendar.getInstance();
//		System.out.println("올해는 " + now.get(Calendar.YEAR));
//		System.out.println("이번달은 " + now.get(Calendar.MONTH));
//		System.out.println("오늘은 " + now.get(Calendar.DAY_OF_MONTH));
//		System.out.println("이번달의 마지막날은 " + now.getActualMaximum(Calendar.DAY_OF_MONTH));
//		System.out.println("요일은 " + now.get(Calendar.DAY_OF_WEEK));
//		now.set(2019, 7, 1);
//		System.out.println("올해는 " + now.get(Calendar.YEAR));
//		System.out.println("이번달은 " + now.get(Calendar.MONTH));
//		System.out.println("오늘은 " + now.get(Calendar.DAY_OF_MONTH));
//		System.out.println("이번달의 마지막날은 " + now.getActualMaximum(Calendar.DAY_OF_MONTH));
//		System.out.println("요일은 " + now.get(Calendar.DAY_OF_WEEK));
		showCal(2019, 7);
	}

	static void showCal(int year, int month) {
		
		Calendar now = Calendar.getInstance();
		now.set(year, month - 1, 1);
		
		int dayOfFirstDate = now.get(Calendar.DAY_OF_WEEK);
		int dateOflast = now.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		String[] strAry = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		System.out.println("[" + year + "년  " + month + "월]");
		for (String str : strAry) {
			System.out.print(str + "  ");
		}
		System.out.println();
		System.out.println("=================================");
		for (int i = 1; i < dayOfFirstDate; i++) {
			System.out.print("     ");
		}

		for (int i = 1; i <= dateOflast; i++) {
			System.out.printf("%3d  ", i);
			if ((dayOfFirstDate++) % 7 == 0)
				System.out.println();

		}
	}
}
