package testLogin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.Cart;
import pom.LinksScroll;
import pom.LoginPage;

public class LoginPageTest {
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Test
	public void login(){
		WebDriver driver=Browser.openBrowser();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage lg=new LoginPage(driver);
		lg.UserName("8793626691");
		lg.Password("Baba@94036");
		lg.login();
		driver.close();
	}
		
		
		@SuppressWarnings("deprecation")
		@Test
		public void CartProduct() throws InterruptedException {
			
			WebDriver driver=Browser.openBrowser();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			LoginPage lg=new LoginPage(driver);
			lg.UserName("8793626691");
			lg.Password("Baba@94036");
			lg.login();
			Thread.sleep(10000);
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Cart c=new Cart(driver);
			//Thread.sleep(10000);
			c.clickOnCart();
			Thread.sleep(5000);
			c.clickOnRemove();
			Thread.sleep(5000);
			c.removeProduct();
			driver.quit();
			
			
			
		}
		
		@Test
		public void scroll() {
			WebDriver driver=Browser.openBrowser();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			LoginPage lg=new LoginPage(driver);
			lg.UserName("8793626691");
			lg.Password("Baba@94036");
			lg.login();
			LinksScroll ls=new LinksScroll(driver);
			ls.scrolltoLink(driver);
			
		}
		
//		List<WebElement>AllLinks= driver.findElements(By.tagName("a"));
//		System.out.println("Total Links presents on Website are: "+AllLinks.size());
//		for(int i=0;i<AllLinks.size();i++) {
//			System.out.println("Links are: "+AllLinks.get(i).getAttribute("class"));
	}


	
