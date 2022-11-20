package com.task.org;

import org.testng.annotations.Test;

public class DaOutsideclass {
	@Test(dataProvider="details",dataProviderClass=Dataprovider.class)
	private void logindetails(String username , String password) {
		System.out.println(username);
		System.out.println(password);
	}

}
