package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();
		
		//코드를 작성하세요
		//먼저 " " 공백으로 구분되는 문자들을 잘라서 배열에 넣어준다
		String[] sArr = numLine.split(" ");
		//배열의 수를 미리 알수 없으니 배열의 길이로 반복문을 만들어주고
		for(int i = 0 ; i<sArr.length; i++) {
			sum += Integer.parseInt(sArr[i]);
			//아직 문자열 상태인 숫자를 정수로 변한시킨뒤에 sum에 계속적으로 쌓아준다
		}
		//여기에서 문자열을 자르는 split() 메소드와 문자열을 정수로 변화시키는Integer.parseInt가 나왔다.
		//자주쓸수있으니 외워두도록하자
		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
