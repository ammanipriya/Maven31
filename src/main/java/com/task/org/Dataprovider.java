package com.task.org;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	@DataProvider
	private String[][] details() {
		String[][] values = {
				{"moon","star"},
				{"eclipse","lunar"}
		};
				
		return values;		
		
	}
	
	@Test(dataProvider="details")
	private void login (String username, String password) {
		
		System.out.println(username);
		System.out.println(password);
	}
	
}
