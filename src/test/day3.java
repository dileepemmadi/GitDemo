package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class day3 {
	
	
	@BeforeClass
	
	public void befoclas()
	{
		System.out.println("Before executing any methods in the class");
	}
	
	
	@Parameters({"URL","Username"})
	
	@Test
	public void weblogincarLoan(String urlname, String uname) 
	{
	
	// Selenium
		
	System.out.println("weblogincar");
	System.out.println(urlname);
	System.out.println(uname);
	
	}
	
   @Test(groups= {"Smoke"})
	
	public void MobilelogincarLoan() 
	{
	
	   System.out.println("Mobilelogincar");	
	}
   @BeforeMethod
   public void beforeEvery() 
	{
		   System.out.println("i will execute before every method in day 3 class");	
	}
   
   @AfterMethod
   public void afteclas() 
	{
		   System.out.println("i will execute After every method in day 3 class");	
	}
   
   @AfterClass
   public void afterEvery() 
	{
		   System.out.println("After executing all methods in the class");	
	}
   
   @BeforeSuite
   public void Bfsuite() {
	 
	   System.out.println("I am no 1");
	   
   }
   
 
   @Test(enabled=false)
	
 	public void MobileSignincarLoan() 
 	{
 	
 	   System.out.println("Mobilesignincar");	
 	}
   @Test(dataProvider="getData")
	
	public void MobileSigoutcarLoan(String username,String password) 
	{
	
	   System.out.println("Mobilesignoutcar");	
	   System.out.println(username);	
	   System.out.println(password);	
	}
   
   @Test(dependsOnMethods= {"weblogincarLoan","MobileSigoutcarLoan"})
	
  	public void APIcarLoan() 
  	{
  	
	   System.out.println("APIlogincar");
	   
  	}
   
   @DataProvider
   public Object[][]  getData() 
   {
	   Object[][] data = new Object[3][2];
	   data[0][0] = "firstsetusername";
	   data[0][1] ="firstsetpassword";
	   data[1][0] = "secondsetusername";
	   data[1][1] ="secondsetpassword";
	   data[2][0] = "thirdsetusername";
	   data[2][1] ="thirdsetpassword";
	   return data;
   }
   

}
