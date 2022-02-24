package demoqaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	By pageTitle = By.xpath("//div[contains(text(),'Login')]");
	By userName = By.id("userName");
	By passw = By.id("password");
	By loginButton = By.id("login");
	By errorMsg = By.id("name");
	By NewUser = By.id("newUser");

	public String getpageTitle() {
		return driver.findElement(pageTitle).getText();


	}

	public void InsertUsername(String user) {
		driver.findElement(userName).sendKeys(user);
	}

	public void InsertPassword(String password) {
		driver.findElement(passw).sendKeys(password);
	}

	public void ClickLoginButton() {
		driver.findElement(loginButton).click();
	}

	public String getError() {

		String error = driver.findElement(errorMsg).getText();
		return error;
	}

	public void NewUser() {
		driver.findElement(NewUser).click();
	}

}