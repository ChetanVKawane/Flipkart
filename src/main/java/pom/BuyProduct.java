package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyProduct {
	@FindBy(xpath="//input[@class=\"_3704LK\"]")private WebElement searchProduct;
	@FindBy(xpath="//button[@type=\"submit\"]")private WebElement clickonSearch;
	@FindBy(xpath="//div[@class=\"_4rR01T\"]")private WebElement clickonProduct;
	@FindBy(xpath="//button[text()=\"ADD TO CART\"]")private WebElement addtoCart;
	
	public BuyProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SearchProduct(String product) {
		searchProduct.click();
		searchProduct.sendKeys(product);
	}
	public void clickonSearch() {
		clickonSearch.click();
	}
	
	public void ClickonProduct() {
		clickonProduct.click();
	}
     
	public void AddtoCart() {
		addtoCart.click();
	}

}
