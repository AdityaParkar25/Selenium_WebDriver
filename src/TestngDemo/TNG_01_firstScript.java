package TestngDemo;

import org.testng.annotations.Test;

import WebDriverDemos.baseFunction;

public class TNG_01_firstScript extends baseFunction{
	
	// testNG doesnt have main function
	
	@Test
	public void testA() {
		System.out.println("TestA");
	}
	
	
	@Test
	public void testB() {
		System.out.println("TestB");
	}
	
	
	@Test
	public void testC() {
		System.out.println("TestC");
	}

}
