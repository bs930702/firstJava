package yedam;

public class Bs {

	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3, 45, 7 };
		int maxValue = 0;
		for (int i = 0; i < intAry.length; i++) {
			if (maxValue < intAry[i])
				maxValue = intAry[i];
		}
//		System.out.println("최대값은:" + maxValue);

		String[] strAry = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		// 확장된 for문
		for (String str : strAry) {
			System.out.println(str);
		}
	}

}
