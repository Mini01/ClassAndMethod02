package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass08 {

	List<String> stList;

	public MyClass08() {
		stList = new ArrayList();
	}

	public void add(int num) {

		stList.add(String.valueOf(num));

	}

	public int sum() {
		int intSum = 0;
		for (String s : stList) {
			
		}
		return intSum;

	}

}
