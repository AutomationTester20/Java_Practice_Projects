package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@SmokeTest")
	public void beforeTest()
	{
		System.out.println("Hooks Before Regression Run");
	}
	
	@After("@SmokeTest")
	public void aftervalidationTest()
	{
		System.out.println("Hooks After Regression Test");
	}
}
