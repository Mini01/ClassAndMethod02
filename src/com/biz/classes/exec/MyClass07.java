package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass07 {
	
	List<Integer> intList;
	
	public MyClass07() {
		intList = new ArrayList();
	}
	
	public void add(int num) {
		intList.add(num);
	}
	
	public int  sum() {
		int intSum = 0;
		for(Integer s : intList) {
			intSum += s;
	    } return intSum;
	
	
	}
	
}
