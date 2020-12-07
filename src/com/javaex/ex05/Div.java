package com.javaex.ex05;

public class Div {

	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		if (a == 0 || b == 0) {
			System.out.println("0은 나눌 수 없습니다, 다시입력해주세요.");
		}
		return a / b;
	}

}
