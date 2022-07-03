package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	@SuppressWarnings("deprecation")
	public static WebDriver openBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 
		return driver;
		
	}

}
