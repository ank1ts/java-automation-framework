package testNGPractice;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testNGPractice.testng_Listner.listners_Practice1;

@Listeners(listners_Practice1.class)

public class testng_Practice5 {
	@Test(dependsOnMethods = { "Scenario14" })
	public void Scenario13() {
		System.out.println("Scenario 13");
	}

	@Test(description="this scenario will run before 13 because of dependsOnMethods",timeOut=2000)
	public void Scenario14() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Scenario 14");
	}
}
