package week4;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class week4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    
		HashMap<String, Object> prefs=new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications",0);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", prefs); 

		
		
		System.setProperty("webdriver.chrome.driver","D:\\22R01A6742\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.axisbank.com/");
		WebElement pop=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/span"));
		pop.click(); 


	}

}
