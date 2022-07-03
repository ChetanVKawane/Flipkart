package testLogin;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		WebElement cal=driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
		cal.click();
		
		new WebDriverWait(driver,Duration.ofSeconds(5))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		 
		DatePicker.selectDate(driver, "16", "July", "2022");
	}
	
	public static  String[] getMonthYearVal( String monthYearValue) {
		return monthYearValue.split(" ");
	}
	
	public static void selectDate( WebDriver driver,String Date, String Month, String Year) {
		//WebDriver driver = new ChromeDriver();
		String monthYearValue=driver.findElement(By.className("ui-datepicker-title")).getText();
		while(!(getMonthYearVal(monthYearValue)[0].equals(Month)&& getMonthYearVal(monthYearValue)[1].equals(Year))) { 	
			driver.findElement(By.xpath("//a[@title=\"Next\"]")).click();
			monthYearValue=driver.findElement(By.className("ui-datepicker-title")).getText();
			}
		driver.findElement(By.xpath("//a[text()=\""+Date+"\"]")).click();
		
	}
}
