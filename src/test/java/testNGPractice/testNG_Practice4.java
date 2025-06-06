package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNG_Practice4 {

	@Test(groups= {"Regression"})
	void Scenario11() {
		
		System.out.println("Scenario 11");
	}
	
	@Test(groups= {"Smoke"})
	void Scenario12()
	{

		int i=1/0;
		System.out.println("Scenario 12");
	}
}
