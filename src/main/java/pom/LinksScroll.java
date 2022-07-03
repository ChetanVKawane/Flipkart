package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinksScroll {
	
	@FindBy(xpath="//div[@class=\"_2Brcj4\"]//a[@href=\"/pages/payments\"]")private WebElement payment;

	public LinksScroll(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void scrolltoLink(WebDriver driver) {
//		Actions a=new Actions(driver);
//		a.moveToElement(payment);
//		a.perform();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", payment);
		
	}
}
