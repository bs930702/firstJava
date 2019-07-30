package com.yedam.lch;

abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("숨을 쉰다.");
	}

	public abstract void sound();
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.breathe();
		dog.sound();
		Cat cat = new Cat();
		cat.breathe();
		cat.sound();
	}
}
