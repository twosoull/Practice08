package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
		
		//equals는 모든 클래스의 조상인 Object의 메소드이기 때문에 사용이 가능하다.
		//또 String은 기존에 있던 문자열을 만들면 새로운 객체를 생성하지않고 이 전에 사용한 똑같은 문자열의 주소를 가지기 때문에 (메모리를 아끼기위함)
		//비교가 가능해진다
	}

}


