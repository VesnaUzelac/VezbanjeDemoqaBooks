package demoqaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
	WebDriver driver;
By submitButton = By.id("submit");
By profilePageTitle = By.cssSelector("#app > div > div > div.pattern-backgound.playgound-header");


public ProfilePage(WebDriver driver) {
	super();
	this.driver = driver;
}
public void LogoutButtonIsVisible() {
	driver.findElement(submitButton).isDisplayed();
	
	
}
public String getsuccMsg() {
	String message = driver.findElement(profilePageTitle).getText();
	return message;
}
}
