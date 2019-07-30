package yedam;

public class Temp {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
		s1.setName("권보성");
		System.out.println(s1.getName());

		Student s2 = new Student();
		s2.setName("홍길동");

		Student s3 = new Student();
		s3.setName("홍길동");

		Student[] stAry = new Student[5];
		stAry[0] = s1;
		stAry[1] = s2;
		stAry[2] = s3;

		if (s2.getName().equals(s3.getName()))
			System.out.println("같은 값");
		else
			System.out.println("다른 값");

		String str1 = new String("이순신");
		String str2 = new String("이순신");

		if (str1.equals(str2)) // ==주소값 비교 //.equals 문자값비교
			System.out.println("이순신같음.");
		else
			System.out.println("이순신다름.");
	}

}
