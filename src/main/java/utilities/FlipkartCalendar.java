package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartCalendar {
	public static void depart(WebDriver driver, String Month_Year, String date) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name=\"0-datefrom\"]")).click();
		
		while(true) {
			String current=driver.findElement(By.xpath("//div[@class=\"_1oqlzu\"]")).getText();
			if(current.equals(Month_Year)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//div[@class=\"_3hsbax\"]")).click();
			}
			
		}
		driver.findElement(By.xpath("//button[text()=\""+date+"\"]")).click();

}}

