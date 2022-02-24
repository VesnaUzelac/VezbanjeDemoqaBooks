package demoqaBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import demoqaPages.HomePage;
import demoqaPages.LoginPage;

import demoqaPages.ProfilePage;

public class BaseDemoqa {
	public WebDriver driver;
	public WebDriverWait wdwait;
	public HomePage homePage;
	public LoginPage loginPage;
	public ProfilePage profilePage;
	

	@BeforeClass

	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		wdwait = new WebDriverWait(driver, 10);
		
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		profilePage = new ProfilePage (driver);
		

	}

	@AfterClass
	public void TearDown() {
		driver.close();
		driver.quit();
	}
}
