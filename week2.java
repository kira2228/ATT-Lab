package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class week2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","D:\\22R01A6742\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(2000);
		Actions builder=new Actions(driver);
		
		
		WebElement customerLogin=driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"));
		builder.moveToElement(customerLogin).perform();
		Thread.sleep(2000);
		
		WebElement register = driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/ul/li[2]/a"));
		register.click();
		Thread.sleep(2000);

		
		WebElement firstName=driver.findElement(By.id("acc_first_name"));
		firstName.sendKeys("pooja");
		Thread.sleep(2000);


		WebElement lastName=driver.findElement(By.id("acc_last_name"));
		lastName.sendKeys("N");
     	Thread.sleep(2000);

		
		WebElement emailId=driver.findElement(By.id("acc_user_email"));
    	emailId.sendKeys("22r01a6742@cmrithyderabad.edu.in");
		Thread.sleep(2000);

		

		WebElement Password=driver.findElement(By.id("acc_user_password"));
	    Password.sendKeys("1234pooja");
		Thread.sleep(2000);
		
		
		WebElement confirmPassword=driver.findElement(By.id("acc_user_passconf"));
		confirmPassword.sendKeys("1234pooja");
		Thread.sleep(2000);

		
		WebElement mobileNumber=driver.findElement(By.id("acc_mobile_no"));
		mobileNumber.sendKeys("9014823743");
		Thread.sleep(2000);

		
		WebElement registerBtn=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/button"));
		registerBtn.click();
		Thread.sleep(1000);

	}

}
