package testNGPractice;

import org.testng.annotations.Test;

public class testNG_Practice2 {

	@Test(groups= {"Regression"})
	void Scenario5() {
		System.out.println("Scenario 5");
	}
	
	@Test(groups= {"Regression"})
	void Scenario6()
	{
		System.out.println("Scenario 6");
	}
	@Test(groups= {"Regression"})
	void Scenario7()
	{
		System.out.println("Scenario 7");
	}
	@Test(groups= {"Regression"})
	void Scenario8()
	{
		System.out.println("Scenario 8");
	}
}
