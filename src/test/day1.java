package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	
	public void lastExecution() {

		System.out.println("i will execute last");

	}
	@Test
	public void Demo() {

		System.out.println("hello");

	}
	
	@AfterSuite
	
	public void afsuite() {

		System.out.println("i am the no 1 from last");

	}

	@Test

	public void SecondTest() {
		System.out.println("Bye");
	}

}
