package com.facebook.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_Data {
	public static Properties p;
	public Test_Data() throws IOException {
		File f = new File("C:\\Users\\Priya\\eclipse-workspace\\Maven31\\src\\test\\java\\com\\facebook\\test\\Facebook.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
			}
	
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	 }
	
	public String getpassword() {
		String password = p.getProperty("password");
		return password;
	}
	public String getSearch() {
		String search = p.getProperty("search");
		return search;
	}
}
