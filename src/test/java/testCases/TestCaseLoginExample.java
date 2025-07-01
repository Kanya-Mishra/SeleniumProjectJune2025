package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseLoginExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriver driver;
					
					driver = new ChromeDriver();
					
					driver.manage().deleteAllCookies();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
					driver.get("https://www.saucedemo.com/");
					driver.manage().window().maximize();
					
					driver.findElement(By.xpath("//input[@id='user-name']")).click();
					driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
					
					driver.findElement(By.xpath("//input[@id='password']")).click();
					driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
					
					driver.findElement(By.xpath("//input[@id='login-button']")).click();
					
	//				driver.quit();
		}
}
