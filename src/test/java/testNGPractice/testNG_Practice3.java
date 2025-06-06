package testNGPractice;

import org.testng.annotations.Test;

public class testNG_Practice3 {

	@Test(groups= {"Smoke"})
	void A_Scenario_9() {
		System.out.println("Scenario 9");
	}
	
	@Test(groups= {"Smoke"})
	void B_Scenario_10()
	{
		System.out.println("Scenario 10");
	}
}
