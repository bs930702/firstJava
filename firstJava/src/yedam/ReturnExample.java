package yedam;

public class ReturnExample {
	public static void main(String[] args) {

//		int[] numAry = new int[5];
//		
//		int[] num = {10,20,30,40,50};
//		System.out.println(num[0]);
//		num[0] = 100;
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		
//		String[] strAry = {"hi","my","name","is","1ch"};
//		for(int i = 0; i < strAry.length; i++) {
//			System.out.println(strAry[i]);
//		}
//		int[] intAry = new int[100];
//		for(int i = 0; i<100; i++){
//			intAry[i] = 10;
//		}
//		int sum = 0;
//		for(int i=0;i<100;i++) {
//			sum += intAry[i];
//		}
//		System.out.println("배열의 크기:" + intAry.length);
//		System.out.println("result: + sum");
		int sum = 0;
		int[] number = new int[10];
		for (int i = 0; i < 10; i++) {
			number[i] = 5 * (i + 1);
			System.out.println("배열" + i + " 번째의 값은" + number[i]);
		}

		for (int i = 0; i < 10; i++) {
			sum = sum + number[i];
		}
		System.out.println("합은" + sum + "평균값은" + (sum / number.length));

		// 배열
//		int avg = (num1 + num2 + num4)/30;
//		int num2 = 20;
//		int num3 = 30;
//		int num4 = 40;
	}
}
