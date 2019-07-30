package yedam;

public class ReturnMethodExample {

	public static void main(String[] args) {
//		sum(3,5);
//		int result = sum2(3,5);
//		System.out.println("sum2 : " + result);
//		
//		double avg = avg(3,6);
//		System.out.println("avg : " + avg );

		System.out.println("7월의 마지막날은 :" + getLastDay(7));

		System.out.println("7월의 1일은 : " + getDayOfFirstDate(7));

		String[] strAry = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int month = 7;
		for (String str : strAry) {
			System.out.print(str + "  ");
		}
		System.out.println();
		System.out.println("=================================");
		int dayOfFirstDate = getDayOfFirstDate(month);
		for (int i = 1; i < dayOfFirstDate; i++) {
			System.out.print("     ");
		}

		int dateOfLast = getLastDay(month);
		for (int i = 1; i <= dateOfLast; i++) {
			System.out.printf("%3d  ", i);
			if ((dayOfFirstDate++) % 7 == 0)
				System.out.println();
		}
	}

	// 해당월의 1일날의 요일 계산하는 메소드
	static int getDayOfFirstDate(int month) {
		if (month == 7)
			return 2; // 월요일
		else if (month == 8)
			return 5;
		else if (month == 9)
			return 1;
		else
			return 0;
	}

	// 해당월의 마지막을 날짜를 가지고 오는 메소드
	static int getLastDay(int month) {
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		else if (month == 2)
			return 28;
		else
			return 31;
	}

//	static double avg(int x, int y) {
//		return (double)(x+y)/2;
//	}
//	
//	static int sum2(int x, int y) {
//		return x + y;
//	}
//	
//	static void sum(int x, int y) {
//		System.out.println("sum : " + (x + y));
//	}

}
