package Yugioh;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void TestUsingSelenium()
	{
		System.out.println("Selenium is awesome!");
	}
	
	@Test
	public void DummyTest1()
	{
		System.out.println(" You dummy!");
	}
	
	@Test
	public void DummyTest2()
	{
		System.out.println(" You big dummy!");
	}
	
	@Test
	public void DummyTest3()
	{
		System.out.println(" You GIANT dummy!");
	}
	
	@DataProvider
	public Object[][] MyData()
	{
		Object[][] myData = new Object[2][3];
		
		
		return myData;
	}

}
