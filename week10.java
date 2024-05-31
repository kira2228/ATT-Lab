package week10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class week10 {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("Webdriver.chrome.driver","D:\\22R01A6742\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://gmail.com/");
	Thread.sleep(2000);
	WebElement createAccount=driver.findElement(By.xpath("(//span[normalize-space()='Create account'])[1]"));
	createAccount.click();
	Thread.sleep(2000);

	
	WebElement mySelf=driver.findElement(By.xpath("(//span[normalize-space()='For my personal use'])[1]"));
	mySelf.click();
	Thread.sleep(2000);
	
	
	WebElement firstName=driver.findElement(By.name("firstName"));
	firstName.sendKeys("Pooja");
	Thread.sleep(2000);
	
	
	WebElement lastName=driver.findElement(By.name("lastName"));
	lastName.sendKeys("28");
	Thread.sleep(2000);
	
	WebElement bn1=driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
	bn1.click();
	Thread.sleep(2000);
	
	
	WebElement month=driver.findElement(By.xpath("(//select[@id='month'])[1]"));
	month.sendKeys("feb");
	Thread.sleep(2000);
	
	
	WebElement day=driver.findElement(By.xpath("(//input[@id='day'])[1]"));
	day.sendKeys("28");
	Thread.sleep(2000);
	
	
	WebElement year=driver.findElement(By.xpath("(//input[@id='year'])[1]"));
	year.sendKeys("2005");
	
	
	Select gender=new
	Select(driver.findElement(By.xpath("(//select[@id='gender'])[1]")));
	gender.selectByValue("2");
	Thread.sleep(2000);
	
	
	WebElement bn2=driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
	bn2.click();
	Thread.sleep(2000);
	
	
	WebElement uid=driver.findElement(By.name("Username"));
	uid.sendKeys("p0546408");
	
	
	WebElement bn3=driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
	bn3.click();
	Thread.sleep(2000);
	
	
	WebElement pswd =driver.findElement(By.name("Passwd"));
	pswd.sendKeys("Cmrit123#");
	
	
	WebElement cpswd=driver.findElement(By.name("PasswdAgain"));
	cpswd.sendKeys("Cmrit123#");
	
	
	WebElement bn4=driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
	bn4.click();

}





}
