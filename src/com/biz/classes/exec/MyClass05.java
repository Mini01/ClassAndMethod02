package com.biz.classes.exec;

public class MyClass05 {


	
	String strName;
	int intAge;
   
	// 기본생성자, blank constructor
	public MyClass05() {
		this("몽이");
	}
	
	// 2번생성자는 매개변수로 받은 값과 나이의 기본값 14를 3번 생성자로 전달하는 역할만
	public MyClass05(String strName) {
		this(strName,14);
	}
	
	// 3번 생성자에서 모든 변수를 초기화 전담
	public MyClass05(String strName, int intAge) {
		
		this.strName = strName;
		this.intAge = intAge;
	}
		
			
}	
		
	


