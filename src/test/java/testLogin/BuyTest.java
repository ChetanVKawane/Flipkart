package testLogin;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.BuyProduct;
import pom.LoginPage;

public class BuyTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void login() {
		WebDriver driver=Browser.openBrowser();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage lg=new LoginPage(driver);
		lg.UserName("8793626691");
		lg.Password("Baba@94036");
		lg.login();
		driver.close();
		

		public void cart() {
		WebElement Cart=driver.findElement(By.xpath("//div[@class=\"go_DOp\"]//div[@class=\"YUhWwv\"]"));
		Cart.click();
		WebElement orders=driver.findElement(By.xpath("//div[@class=\"_3YT0U7 _10vWcL td-FUv WDiNrH\"]//div[text()=\"Remove\"]"));
		orders.click();
		WebElement remove=driver.findElement(By.xpath("//div[@class=\"td-FUv WDiNrH\"]//div[text()=\"Remove\"]"));
		remove.click();
		
	}

}
