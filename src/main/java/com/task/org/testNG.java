package com.task.org;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG {

@Test(priority=-1)
private void Msc(){
	System.out.println("M.sc");
}
@Test(priority=-2)
private void Bsc() {
	System.out.println("B.sc");
}
@Test(priority=1)
private void Phd() {
	System.out.println("Phd");
}
@Test(invocationCount = 8,invocationTimeOut = 2000)
private void Ms() {
	System.out.println("Ms");
	
}





}
