package testNGPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_Practice1 {
	
	@BeforeMethod
	void before_method1() {
		System.out.println("before_method1");
	}
	@AfterMethod
	void after_method1() {
		System.out.println("after_method1");
	}

	@Test(groups= {"Smoke","Regression"})
	void Scenario1() {
		System.out.println("Scenario 1");
		int i=1/0;
	}
	
	@Test(groups= {"Smoke"})
	void Scenario2()
	{
		System.out.println("Scenario 2");
	}
	@Test(groups= {"Smoke"})
	void Scenario3()
	{
		System.out.println("Scenario 3");
	}
	@Test(groups= {"Regression"})
	void Scenario4()
	{
		System.out.println("Scenario 4");
	}
	
}