package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	static WebDriver driver;
	
	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
		PageFactory.initElements(driver,this);
	}

}
