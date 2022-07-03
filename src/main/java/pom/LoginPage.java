package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@class=\"_2IX_2- VJZDxU\"]")private WebElement username;
	@FindBy(xpath="//input[@type=\"password\"]") private WebElement password;
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")private WebElement login;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void UserName(String name) {
		username.sendKeys(name);
	}
	
	public void Password(String pass) {
		password.sendKeys(pass);
	}
	
	public void login() {
		login.click();
		
	}

}
