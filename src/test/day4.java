package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Parameters({"URL"})
	@Test
	
	public void webloginHome(String url) 
	{
	
	// Selenium
		
	System.out.println("webloginhome");
	System.out.println(url);	
	}
	
   @Test(groups= {"Smoke"})
	
	public void MobileloginhomeLoan() 
	{
	
	   System.out.println("Mobileloginhome");	
	}
   
   @Test
	
  	public void LoginAPIhomeLoan() 
  	{
  	
	   System.out.println("APIloginhome");
	   
  	}
   

}
