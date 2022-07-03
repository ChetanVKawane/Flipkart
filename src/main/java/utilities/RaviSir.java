package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RaviSir {

	public static void calendar(String MonthYear, String Date) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/travel/flights?otracker=nmenu_Flights");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name=\"0-datefrom\"]")).click();
		String monthyear="August 2022";
		String date="12";
		
		
		
		
		while(true) {
			String Current=driver.findElement(By.xpath("//div[@class=\"_1oqlzu\"]")).getText();
			
			if(Current.equals(monthyear)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//div[@class=\"_3hsbax\"]")).click();
				
			}
		}
		driver.findElement(By.xpath("//button[text()=\""+date+"\"]")).click();
		// How not to add the project
		
			
		}
	
}
