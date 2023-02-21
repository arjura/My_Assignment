package Sample1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia_HomePage 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
Thread.sleep(2000);

String Text = driver.findElement(By.xpath("(//table[@class='infobox vevent']//li)[10]")).getText();
String Text1 = driver.findElement(By.xpath("(//table[@class='infobox vevent']//td)[13]")).getText();
  System.out.println(Text);
  System.out.println(Text1);
  
 
 Thread.sleep(3000);
 driver.close();

}
}
