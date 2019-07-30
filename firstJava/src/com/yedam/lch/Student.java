package com.yedam.lch;

public class Student {
	static final String nation = "한국"; // 상수.
	static final double pi = 3.14;
	private String name;
	private String major;
	private int age;
	private double height;

	// 생성자
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	Student() {
	}

	Student(String name, String major, int age) {
		this.name = name;
		this.major = major;
		this.age = age;
	}

	public void study() {
		System.out.println(name + " 가 공부합니다.");
	}

	public void introduce() {
		System.out.println("전공은" + major + " 이고 나이는" + age + "입니다.");
	}

	public void showHeight() {
		System.out.println("키는" + height + "입니다.");
	}
}
