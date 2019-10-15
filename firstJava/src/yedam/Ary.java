package yedam;

public class Ary {
//배열 원리
	public static void main(String[] args) {
		int[][] intAry = new int[5][5];
		int a = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				intAry[i][j] = a++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("[%d,%d] %2d ", i, j, intAry[i][j]);
			}
			System.out.println();
		}
		System.out.println("================");
		{

		}
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("[%d,%d] %2d ", j, i, intAry[j][i]);
			}
			System.out.println();
		}
	}
}
