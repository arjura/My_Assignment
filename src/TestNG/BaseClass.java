package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver driver;
public void initializeBrowser()
{
	driver=new ChromeDriver();
	
	driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
}
