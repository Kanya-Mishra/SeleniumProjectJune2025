package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectLogin extends BasePage{
	
	WebDriver driver;

	public PageObjectLogin(WebDriver driver) {				//Contructor
		super(driver);
	
	}
	
	//Locators
	
	@FindBy(xpath = "//input[@id='user-name']" )
	WebElement Uname;
	
	@FindBy(xpath = "//input[@id='password']" )
	WebElement Pswd;
	
	@FindBy(xpath = "//input[@id='login-button']" )
	WebElement loginBtn;
	

	//Action Method
	
	public void clickUname() {									//Action Method
		Uname.click();
	}

	public void sendUnameKeys(String username) {
		Uname.sendKeys(username);
	}
	
	public void clickPswd() {									//Action Method
		Pswd.click();
	}

	public void sendPswdKeys(String password) {
		Pswd.sendKeys(password);
	}
		
	public void clickloginBtn() {									//Action Method
		loginBtn.click();
	}
	

}
