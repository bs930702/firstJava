package com.yedam.lch;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Hankook수명 " + (maxRotation - accumulatedRotation) + " 회");
			return true;
		} else {
			System.out.println("*** " + location + " Hankook 펑크 ***");
			return false;
		}
	}

}
