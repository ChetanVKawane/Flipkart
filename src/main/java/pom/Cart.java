package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	
	@FindBy(xpath="//div[@class=\"go_DOp\"]//div[@class=\"YUhWwv\"]") private WebElement cart;
	
	@FindBy(xpath="//div[@class=\"_3YT0U7 _10vWcL td-FUv WDiNrH\"]//div[text()=\"Remove\"]")private WebElement order;
	
	@FindBy(xpath="//div[@class=\"td-FUv WDiNrH\"]//div[text()=\"Remove\"]")private WebElement removed;

	public Cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
		public void clickOnCart() {
			cart.click();
		}
		
		public void clickOnRemove() {
			order.click();
		}
		public void removeProduct() {
			removed.click();
		}
	}
	

