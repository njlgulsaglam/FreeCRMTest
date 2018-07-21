package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;


public class HomePageTest extends TestBase{
	
LoginPage loginPage;
HomePage homePage;

public HomePageTest() {
	super();
}

///test cases should be separated 
//before each test case launch the browser an login
//@test execute test case
/// after each case close the browse
@BeforeMethod
public void setUp() {
	initiliazition();
	loginPage = new LoginPage();
	
}


@Test(priority=1)
public void verifyHomePageTitle() {
	String homePageTitle = homePage.verifyHomePageTitle();
	Assert.assertEquals(homePageTitle, "CRMPRO" ,"Home page title not nmatched");
}
@Test(priority=2)
public void verifyUsernameTest() {
	Assert.assertTrue (homePage.verifyCorrectUserName());
}




@AfterMethod
public void tearDown() {
	driver.quit();
}



}
