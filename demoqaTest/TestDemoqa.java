package demoqaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import demoqaBase.BaseDemoqa;

public class TestDemoqa extends BaseDemoqa {

	@BeforeMethod
	public void pageSetUp() {

		driver.navigate().to("https://demoqa.com/books");
		driver.manage().window().maximize();
		homePage.clickLoginSubPage();
	}

	@Test(priority = 5)

	public void OpenedLoginPage() {
		loginPage.getpageTitle();
		Assert.assertEquals(loginPage.getpageTitle(), "Login");
		System.out.println("Successfully opened Login page- page title: " + loginPage.getpageTitle());
	}

	@Test(priority = 10)
	public void SucccessfulLogin() throws InterruptedException {

		loginPage.InsertUsername("vesna");
		loginPage.InsertPassword("Vesnaqa@23");
		loginPage.ClickLoginButton();
		Thread.sleep(2000);
		profilePage.LogoutButtonIsVisible();
		System.out.println("Successful user login- page title: " + profilePage.getsuccMsg());
		Assert.assertEquals(profilePage.getsuccMsg(), "Book Store");
	}

	@Test(priority = 20)

	public void incorectUsername() {

		loginPage.InsertUsername("vesn");
		loginPage.InsertPassword("vesnaqa@23");
		loginPage.ClickLoginButton();
		wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("name")));
		loginPage.getError();
		System.out.println("Invalid username message: " + loginPage.getError());
		Assert.assertEquals(loginPage.getError(), "Invalid username or password!");
	}

	@Test(priority = 30)

	public void incorectPassword() throws InterruptedException {

		loginPage.InsertUsername("vesna");
		loginPage.InsertPassword("vesnaqa@2");
		loginPage.ClickLoginButton();
		wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("name")));
		loginPage.getError();
		System.out.println("Invalid password message: " + loginPage.getError());
		Assert.assertEquals(loginPage.getError(), "Invalid username or password!");
	}

	@AfterMethod

	public void deleteCookies() {
		driver.manage().deleteAllCookies();

	}
}
