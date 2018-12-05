package com.biz.classes;

public class ClassExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass  myClass ; // Myclass를 myclass 객체로 선언
		
		myClass = new Myclass(); // myClass 객체를 초기화
		
		Myclass myClass01 = new Myclass();
		myClass.hello(); // mehtod 호출,실행
		myClass01.hello();
		
		Myclass myClass02 = new Myclass();
		// MyClass 형으로 myClass02 객체를 선언하고
		// MyClass에 (감춰진)method인 Myclass()를 호출,실행해서 객체를 초기화한다.
		
		myClass02.hello();
		myClass02.hello("홍길동");
				
		Myclass myClass03 = new Myclass("이몽룡");		

	}

}
