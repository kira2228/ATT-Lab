package week7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "D:\\22R01A6742\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		WebElement searchBar=driver.findElement(By.name("q"));
		searchBar.sendKeys("cmrit hyderabad");
		searchBar.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.quit();

	}

}
