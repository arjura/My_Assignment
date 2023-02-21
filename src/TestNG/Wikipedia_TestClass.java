package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import graphql.Assert;

public class Wikipedia_TestClass extends BaseClass
{
	Wikipedia_HomePage Home;
@BeforeClass
public void OpenBrowser()
{
	initializeBrowser();
	 Home=new Wikipedia_HomePage(driver);
}
@Test
public void VerifTextOnHomePage()
{
	String A1 = Home.InputWikipedia_HomePageReleaseDate();
	System.out.println(A1);
	String A2 = Home.InputWikipedia_HomePageCountry();
	System.out.println(A2);

}
@AfterClass
public void CloseBrowser() throws InterruptedException
{
	Thread.sleep(2000);
	driver.close();
}
}
