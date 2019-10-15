package yedam;

public class Test {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
			} else {
				sum = sum + i;
			}
		}
		System.out.println(sum);

		int intAry[] = { 1, 5, 3, 9, 7, 10 };
		int max = 0;
		for (int i = 0; i < intAry.length; i++) {
			if (max < intAry[i]) {

			}
			max = intAry[i];

		}
		System.out.println(max);
	}

}
