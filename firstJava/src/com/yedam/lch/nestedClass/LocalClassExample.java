package com.yedam.lch.nestedClass;

public class LocalClassExample {
	static String regularExpression = "[^0-9]";

	public static void validatePhoneNumber(String pNo1, String pNo2) {
		final int numberLength = 10;
		class PhoneNumber {
			String formattedPhoneNumber = null;

			PhoneNumber(String phoneNumber) {
				String currentNumber = phoneNumber.replaceAll(regularExpression, "");
				if (currentNumber.length() == numberLength)
					formattedPhoneNumber = currentNumber;
				else
					formattedPhoneNumber = null;
			}

			public String getNumber() {
				return formattedPhoneNumber;
			}
		}// end of PhoneNumber
		PhoneNumber myNo1 = new PhoneNumber(pNo1);
		PhoneNumber myNo2 = new PhoneNumber(pNo2);
		if (myNo1.getNumber() == null)
			System.out.println("First Number is invalid.");
		else
			System.out.println("First Number is " + myNo1.getNumber());
		if (myNo2.getNumber() == null)
			System.out.println("Second Number is invalid.");
		else
			System.out.println("Second Number is " + myNo2.getNumber());
	}

	public static void main(String[] args) {
		validatePhoneNumber("12-3456-7890", "4567-7890");
	}
}
