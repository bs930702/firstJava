package yedam;

public class DiffExample {

	public static void main(String[] args) {
//메소드가 언제 유용한지..
		int a, b, c, d;
		a = 3;
		b = 5;
		c = 7;
		d = 9;

		// a, b 비교
//		if(a > b)
//			System.out.println(a - b);
//		else
//			System.out.println(b - a);
		diff(a, b);
//		if(a > c)
//			System.out.println(a - c);
//		else
//			System.out.println(c - a);
		diff(a, c);
//		if(a > d)
//			System.out.println(a - d);
//		else
//			System.out.println(d - a);
		diff(a, d);
	}

	static void diff(int x, int y) {
		if (x > y)
			System.out.println(x - y);
		else
			System.out.println(y - x);

	}

}
