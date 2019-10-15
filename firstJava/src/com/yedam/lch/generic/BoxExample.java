package com.yedam.lch.generic;

class Box<T> {
	private T object;

	public void set(T object) {
		this.object = object;
	}

	public T get() {
		return this.object;
	}
}

class Apple {

}

class Orange {

}

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("hello");
		String retStr = box.get();
		Box<Integer> boxInt = new Box<>();
		boxInt.set(new Integer(10));
		Integer retInt = boxInt.get();
		Box<Apple> boxApple = new Box<>();
		boxApple.set(new Apple());
		Apple retApple = boxApple.get();
		// Box box = new Box();
//		box.set("hello");
//		String retStr = (String) box.get();
//		box.set(new Integer(10));
//		Integer retInt = (Integer) box.get();
//		//문제.
//		box.set(new Apple());
//		Apple retApple = (Apple) box.get();
//		box.set("World");
//		retApple = (Apple) box.get();
	}
}
