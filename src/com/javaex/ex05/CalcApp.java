package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = 0, b = 0;
			String ao = "";

			System.out.print(">>");

			String str = sc.nextLine();
			str = str.trim();
			if (str.equals("/q")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}

			String[] sArray = str.split(" ");

			try { // 문자열이 밑에 int로 들어가지 못할 경우 or 원하는 배열보다 작은 값을 입력했을 경우
				a = Integer.parseInt(sArray[0]);
				ao = sArray[1];
				b = Integer.parseInt(sArray[2]);
			} catch (Exception e) {
				System.out.println("다시 입력해주세요");
				continue;
			}

			Add add = new Add();
			Sub sub = new Sub();
			Mul mul = new Mul();
			Div div = new Div(); // 이렇게 사용하기엔 너무 길다
			if (ao.equals("+")) {
				add.setValue(a, b);
				System.out.println(">>" + add.calculate());
				continue;
			} else if (ao.equals("-")) {
				sub.setValue(a, b);
				System.out.println(">>" + sub.calculate());
				continue;
			} else if (ao.equals("*")) {
				mul.setValue(a, b);
				System.out.println(">>" + mul.calculate());
				continue;
			} else if (ao.equals("/")) {
				div.setValue(a, b);
				System.out.println(">>" + div.calculate());
				continue;
			} else {
				System.out.println("알수없는 연산입니다");
				continue;
			}

		}
	}
}
