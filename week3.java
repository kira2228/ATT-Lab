package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class week3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\22R01A6742\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("firstname")).sendKeys("ipp");
		Thread.sleep(2000);
		
		
		WebElement surName = driver.findElement(By.name("lastname"));
		surName.sendKeys("jhgtfr");
		Thread.sleep(2000);
		
		
		WebElement mobileNoOrEmailId= driver.findElement(By.name("reg_email__"));
		mobileNoOrEmailId.sendKeys("1234567890"); 
		Thread.sleep(2000);
		
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("ijjuh1234");
		
		
		Select dateDropdown = new Select(driver.findElement(By.name("birthday_day")));
		dateDropdown.selectByValue("18");
		Thread.sleep(2000);
		
		
		Select monthDropdown = new Select(driver.findElement(By.name("birthday_month")));
		monthDropdown.selectByValue("12");
		Thread.sleep(2000);
		
		
		Select yearDropdown = new Select(driver.findElement(By.name("birthday_year")));
		yearDropdown.selectByValue("2005");
		Thread.sleep(500);
		
		
		WebElement femaleRadioBtn = driver.findElement(By.xpath("(//label[normalize-space()='Female'])[1]"));
		femaleRadioBtn.click();
		Thread.sleep(2000);
		
		
		WebElement signUpBtn = driver.findElement(By.name("websubmit"));
		signUpBtn.click();
	}

}
