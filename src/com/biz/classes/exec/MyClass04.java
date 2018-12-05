package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass04 {
	
	List<String> stList ;//= new ArrayList();
	
	public MyClass04() {
		stList = new ArrayList();
	}
	
	public void hello(String strName) {
		// stList는 생성자에서 초기화가 되어
		// MyClass04 클래스의 어떤 위치에서나 읽고 쓰기가 가능한 상태가된다.
		stList.add(strName);
	}
	
	public void view () {
		for(String strName : stList) {
			System.out.println(strName);
		}
	}

}
