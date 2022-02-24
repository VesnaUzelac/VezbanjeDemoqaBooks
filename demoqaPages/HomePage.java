package demoqaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
WebDriver driver;

public HomePage(WebDriver driver) {
	super();
	this.driver = driver;
}
By LoginBBtn = By.id("login");
public void clickLoginSubPage() {
	driver.findElement(LoginBBtn).click();
}
}
