package com.yedam.lch;

public class Dmbcellphone extends Cellphone {
	int channel;

	public Dmbcellphone() {
		super();
	}

	public Dmbcellphone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}

	@Override
	void powerOn() {
		System.out.println("DMB 전원 켠다.");
	}

	void turnOnDmb() {
		System.out.println("채널 " + channel + " 방송수신을 합니다.");
	}

	void turnOFffDmb() {
		System.out.println("DMB 방송 수신 멈춤.");
	}

	void changeChannel(int channel) {
		System.out.println("채널 " + channel + " 으로 변경합니다.");
	}
}
