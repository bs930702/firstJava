package yedam;

public class Myprogram {
	public static void main(String [] args) {
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 1; j <=9; j++) {
//				System.out.println(i+"x"+j+"="+i*j);
				
		
				int a = 1;
				for (int i = 1; i <= 10; i++) {
					for (int j = 1; j <= 10; j++) {
						System.out.printf("%3d", a++);
					}
					System.out.println();
				}
				
			
			}
}