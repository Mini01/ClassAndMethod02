package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class DogListClass {
	
	List<String> dogList;
	String strNmae ;
	
	public DogListClass() {
		dogList = new ArrayList();
			this.strNmae = "몽이";
	}
	
	public DogListClass(String strName) {
		dogList = new ArrayList();
		this.strNmae = strName;
		dogList.add(strName);
	}

}
