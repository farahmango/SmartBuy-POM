package TestScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Parameters;
import Pages.SignIn;
import Pages.SignUpPage;

public class TestCases extends Parameters {

	WebDriver driver = new EdgeDriver();
	SignUpPage signUp = new SignUpPage(driver);
	SignIn signIn = new SignIn(driver);

	@BeforeTest
	public void beforeTest() {
		
		driver.manage().window().maximize();
		driver.get("https://smartbuy-me.com/smartbuystore/en/");
		
	}
	
	
	@Test(priority = 0)
	public void signUp() {
		signUp.signUp(firstName,lastName,DOB,mobile ,mobileLand,email,password,confirmPassword);
		
	}
	
	@Test(priority=1)
	public void signIn() throws InterruptedException {
		signIn.signIn(email,password);
		
	}
		
	@AfterTest
	public void afterTest() {}
	
	
	
}
