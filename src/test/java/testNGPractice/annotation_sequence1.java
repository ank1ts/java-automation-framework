package testNGPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class annotation_sequence1 {

	@BeforeMethod
	void before_method1() {
		System.out.println("before_method1");
	}
	@AfterMethod
	void after_method1() {
		System.out.println("after_method1");
	}
}
