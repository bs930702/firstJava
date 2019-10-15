package com.yedam.lch.generic;

import java.util.Arrays;

class Course<T> {
	private String name;
	private T[] students;

	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) new Object[capacity];
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;

			}
		}
	}
}

class Person {
}

class Worker extends Person {
}

class Student extends Person {
}

class HighStudent extends Student {
}

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생:" + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생:" + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생:" + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인과정", 5);
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		Course<Student> studentCourse = new Course<>("학생과정", 5);
		Course<HighStudent> highCourse = new Course<>("고등학생과정", 5);
		// 일반인과정.
		personCourse.add(new Person());
		personCourse.add(new Worker());
		personCourse.add(new Student());
		personCourse.add(new HighStudent());
		// 직장인과정.
		workerCourse.add(new Worker());
		// 학생과정.
		studentCourse.add(new Student());
		studentCourse.add(new HighStudent());
		// 고등학생과정.
		highCourse.add(new HighStudent());
		// 매개값 확인. <?>
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highCourse);

		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);

		registerCourseStudent(studentCourse);
		registerCourseStudent(highCourse);
	}
}