package yedam;

public class MySecondProgram {

	public static void main(String[] args) {

		sum(30);

//		//변수
//		int sum;
//		int x, y;
//		sum = 0;
//		x = 3;
//		y = 5;
//		sum = x + y;
//		
//		System.out.println(sum);

		// if, for, while ;
//		if (sum > 0) //if 맞으면 이 구문을 실행시키고
//			System.out.println("sum 값은 0보다 크다.");
//		else		//if 틀리면 else 구문을 실행시킴
//			System.out.println("sum 값은 0보다 작다.");
//		
//		for(int i = 0; i < 10; i++) { //조건이 맞게 계속 반복 시키는 for 구문
//			System.out.println(i+"hello world.");
//		}
//		int i = 0;
//		while(i < 10) {//조건문이 참이면 계속 실행시키는 while 문
//			System.out.println("hello world.");
//			i++;
//		}
//		int sum = 0; //1~10 짝수만 더하라 for 구문
//		for(int i = 0	; i <= 10; i++) {
//			if(i % 2 == 0) //i에 2를 나눠 0 이되는 값 (짝수) 1 이되는 값 (홀수) 참이나 거짓 쓸때 == 사용
//			{
//				sum = sum+i;
//			}
		{

//		int	sum = 0;
//		int a = 1;
//		while (a <= 10) {
//			if (a % 2 == 1) //홀수일 경우 합 while 구문
//			sum = sum + a++; //sum += a;
//			a++;			
//		}
//		System.out.println(sum);
		}
//	static void sum(int x, int y) {
//		System.out.println(x + y);
//	}

	}

	static void sum(int x) {
		int a = 0;
		for (int i = 1; i <= x; i++) {
			System.out.println(a + i);
			a = a + i;
		}
	}

}
