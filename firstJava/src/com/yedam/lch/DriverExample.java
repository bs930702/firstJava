package com.yedam.lch;

class Vehicle {
	void run() {
		System.out.println("자동차가 달립니다.");
	}
}

class Bus extends Vehicle {
	@Override
	void run() {
		System.out.println("버스가 달립니다.");
	}

}

class Taxi extends Vehicle {
	@Override
	void run() {
		System.out.println("택시가 달립니다.");
	}
}

class Driver {
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle v = new Vehicle();
		driver.drive(v);
		v = new Bus();
		driver.drive(v);
		v = new Taxi();
		driver.drive(v);

	}
}
