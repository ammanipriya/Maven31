package com.junit.org;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sample_junit {
	@Test
	public void Summer_dress() {
		System.out.println("Summer Dress");
	}
	
@Test
public void Evening_dress() {
	System.out.println("Evening_dress");
}
@Test 
public void Casual_dress() {
	System.out.println("Casual_dress");
}
@After
public void Log_out() {
	System.out.println("Log_out");
}
@Before
public void Log_in() {
	System.out.println("Log_in");
}
}
