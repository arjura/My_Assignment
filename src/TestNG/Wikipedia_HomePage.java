package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Wikipedia_HomePage 
{
@FindBy(xpath="(//table[@class='infobox vevent']//li)[10]")private WebElement home;
@FindBy(xpath="(//table[@class='infobox vevent']//td)[13]")private WebElement home1;

public  Wikipedia_HomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public String InputWikipedia_HomePageReleaseDate()
{

	String actText1 = home.getText();
	return actText1;
    
}
public String InputWikipedia_HomePageCountry()
{

	String actText2 = home1.getText();
    return actText2;
}
}
