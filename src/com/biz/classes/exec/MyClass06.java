package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass06 {
	
	List<Integer> intList;
	
	public MyClass06() {
		intList = new ArrayList();
		
	}
	
	public void add (int num) {
		intList.add(num);
	}
	
	public void sum () {
		int intSum = 0;
		for(Integer s : intList) {
			intSum += s;
			
    }
		System.out.println(intSum);
	
	}
	

}
