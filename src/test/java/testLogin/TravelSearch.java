package testLogin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.LoginPage;
import utilities.FlipkartCalendar;

public class TravelSearch {
	
	@Test
	public void Travel() throws InterruptedException {
		WebDriver driver=Browser.openBrowser();
		//driver.manage().deleteAllCookies();
		LoginPage lg=new LoginPage(driver);
		lg.UserName("8793626691");
		lg.Password("Baba@94036");
		lg.login();
		Thread.sleep(10000);
		pom.Travel t=new pom.Travel(driver);
		t.clickOnTravel();
		Thread.sleep(10000);
		//t.clickOnRound();
		//t.clickOnFrom("Mum");
		//t.clickOnTO("Bang");
		FlipkartCalendar c=new FlipkartCalendar();
		c.depart(driver, "November 2022", "20");
		t.clickonRreturn();
		c.depart(driver, "December 2022", "12");
		t.clickonClass();
		t.clickOnSearch();
		
	}

}
