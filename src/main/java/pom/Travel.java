package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Travel {
	@FindBy(xpath="//div[text()=\"Travel\"]")private WebElement Flight;
	@FindBy(xpath="//label[@for=\"ROUND_TRIP\"]") private WebElement Roundtrip;
	@FindBy(xpath="//label[@for=\"ONE_WAY\"]") private WebElement OneWay;
	@FindBy(xpath="//input[@tabindex=\"01\"]")private WebElement From;
	@FindBy(xpath="//input[@name=\"0-arrivalcity\"]") private WebElement To;
	//@FindBy(xpath="//button[@tabindex=\"5\"]")private WebElement Serach;
	@FindBy(xpath="//input[@name=\"0-datefrom\"]") private WebElement DepartDate;
	@FindBy(xpath="//input[@name=\"0-dateto\"]") private WebElement ReturnDate;
	@FindBy(xpath="//input[@tabindex=\"05\"]")private WebElement TravellerClass;
	@FindBy(xpath="//button[text()=\"Done\"]") private WebElement TDone;
	@FindBy(xpath="//span[text()=\"SEARCH\"]") private WebElement Search;
	
	public Travel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTravel() {
		Flight.click();
		
	}
	
	public void clickOnRound() {
		Roundtrip.click();
	}
	
	public void clickOnOneWay() {
		OneWay.click();
	}
	
	public void clickonClass() throws InterruptedException {
		TravellerClass.click();
		Thread.sleep(5000);
		TDone.click();
	}
	
	public void clickOnSearch() {
		Search.click();
	}
	
	
	public void clickOnFrom(String from) throws InterruptedException {
		From.click();
		Thread.sleep(3000);
		From.clear();
		Thread.sleep(3000);
		From.sendKeys(from);
		Thread.sleep(3000);
		From.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		From.sendKeys(Keys.ENTER);
	}
	
	public void clickOnTO(String to) throws InterruptedException {
		
		To.clear();
		To.sendKeys(to);
		Thread.sleep(3000);
		To.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		To.sendKeys(Keys.ENTER);
	}
	public void clickonDapart() {
		DepartDate.click();
	}
	
	public void clickonRreturn() {
		ReturnDate.click();
	}
//	public void clickOnSearch() {
//		Serach.click();
//	}
}

