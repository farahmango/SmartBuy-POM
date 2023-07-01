package Pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

	public class SignUpPage {
	WebDriver driver ;
	@FindBy(xpath="/html/body/main/div[3]/div[1]/div/div[2]/div/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div/button") WebElement titleButton;
	@FindBy(xpath="/html/body/main/div[3]/div[1]/div/div[2]/div/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div/div/ul/li[5]/a") WebElement misButton;
	@FindBy(id="register.firstName") WebElement firstName;
	@FindBy(id="register.lastName") WebElement lastName;
	@FindBy(id="registerGender") WebElement gender;
	@FindBy(id="dateOfBirth") WebElement dateOfBirth;
	@FindBy(xpath="/html/body/main/div[3]/div[1]/div/div[2]/div/div/div/form/div[1]/div[2]/div[3]/div/div/div/button") WebElement countryButton;
	@FindBy(xpath="/html/body/main/div[3]/div[1]/div/div[2]/div/div/div/form/div[1]/div[2]/div[3]/div/div/div/div/div/input") WebElement countryCode;
	@FindBy(id="mobileNumber") WebElement mobileNumber;
	@FindBy(id="phoneNumber") WebElement phoneNumber;
	@FindBy(id="register.email") WebElement email;
	@FindBy(xpath="/html/body/main/div[3]/div[1]/div/div[2]/div/div/div/form/div[1]/div[2]/div[7]/div/div/div/button") WebElement nationalityButton;
	@FindBy(xpath="/html/body/main/div[3]/div[1]/div/div[2]/div/div/div/form/div[1]/div[2]/div[7]/div/div/div/div/div/input") WebElement nationality;
	@FindBy(id="password") WebElement password;
	@FindBy(id="register.checkPwd") WebElement confirmPassword;
	@FindBy(id="termsandconditions") WebElement checkBox;
	@FindBy(xpath="/html/body/main/div[3]/div[1]/div/div[2]/div/div/div/form/div[2]/div[2]/div[2]/button") WebElement signUp;

	
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void signUp(String FirstName,String LastName,String DOB,String MobileNumber,String PhoneNumber,String Email,String Password ,String checkPassword) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://smartbuy-me.com/smartbuystore/en/login");
		
		titleButton.click();
		misButton.click();
		firstName.sendKeys(FirstName);
		lastName.sendKeys(LastName);
		Select mySelect = new Select(gender);
		mySelect.selectByIndex(2);		
		dateOfBirth.sendKeys(DOB);
		countryButton.click();
		
		countryCode.sendKeys("Jordan"+ Keys.ENTER);
		mobileNumber.sendKeys(MobileNumber);
		phoneNumber.sendKeys(PhoneNumber);
		
		email.sendKeys(Email);
		nationalityButton.click();
		nationality.sendKeys("Jordanian"+ Keys.ENTER);
		password.sendKeys(Password);
		confirmPassword.sendKeys(checkPassword);
		checkBox.click();
		signUp.click();
		
	}	
	
}
