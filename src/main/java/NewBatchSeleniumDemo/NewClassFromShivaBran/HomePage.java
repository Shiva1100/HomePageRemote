package NewBatchSeleniumDemo.NewClassFromShivaBran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\HomePageLaunch\\chromedriver.exe");
		WebDriver inputDropDown = new ChromeDriver();
		inputDropDown.get("https://www.google.com/");
		inputDropDown.manage().window().maximize();
		inputDropDown.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium course");
		

	}

}
