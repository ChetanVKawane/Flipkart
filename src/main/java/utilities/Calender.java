package utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/");
		driver.findElement(By.xpath("//input[@id=\"checkin\"]")).click();
		String Month="June 2023";
		String day="27";
//		new WebDriverWait(driver, Duration.ofSeconds(5))
//		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("\"PgmDJX\"")));
		
		
		while(true) {
			String MonthYear=driver.findElement(By.xpath("//table[@class=\" table-condensed\"]//th[@colspan=\"5\"]")).getText();
			if(MonthYear.equals(Month)) 
			{
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[3]")).click();
			}
		}
		//driver.findElement(By.xpath("//div[9]//div[1]//table[1]//tbody[1]//tr//td[contains(text(),"+day+")]")).click();
		
		
	}
	
}