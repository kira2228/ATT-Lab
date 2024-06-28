package week12;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week12 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\22R01A6742\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.sendKeys("convert word to pdf");
		searchBar.sendKeys(Keys.ENTER);
		
		WebElement pdfToWord = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div[1]/div/div/div[1]/div/div/span/a/h3"));
		pdfToWord.click();
		Thread.sleep(2000);
		
		WebElement chooseFileBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/header/div[2]/div/div/label/form/label/div/div[2]/div[2]/button[1]/span"));
		chooseFileBtn.click();
		Thread.sleep(2000);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection str = new StringSelection("\"C:\\Users\\N POOJA\\OneDrive\\Desktop\\Documents\\Hi I am bot.docx\"");
		clipboard.setContents(str, null);
		Thread.sleep(1500);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		
		WebElement download = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div/button[1]/div/span"));
		download.click();
	}

}
