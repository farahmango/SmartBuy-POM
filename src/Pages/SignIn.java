package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	WebDriver driver;
	@FindBy(xpath="/html/body/main/div[3]/div[1]/div/div[1]/div[1]/div/div/form/div[1]/div/div[1]/div[2]/input") WebElement email;
	@FindBy(xpath="/html/body/main/div[3]/div[1]/div/div[1]/div[1]/div/div/form/div[1]/div/div[1]/div[3]/input") WebElement password;
	@FindBy(xpath="/html/body/main/div[3]/div[1]/div/div[1]/div[1]/div/div/form/div[1]/div/div[3]/button") WebElement logIn;


	
	public SignIn(WebDriver driver) {
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	public void signIn(String Email,String Password) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://smartbuy-me.com/smartbuystore/en/login");		
		email.sendKeys(Email);
		password.sendKeys(Password);
		logIn.click();
		
	}


	
}
