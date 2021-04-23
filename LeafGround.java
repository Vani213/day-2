package week2.day2;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Drop down").click();
		WebElement Source=driver.findElementById("dropdown1");
		Select dropdown1=new Select(Source);		
		dropdown1.selectByVisibleText("Selenium");
		WebElement Source1=driver.findElementByName("dropdown2");
		Select dropdown2=new Select(Source1);		
		dropdown2.selectByVisibleText("Appium");
		WebElement Source2=driver.findElementById("dropdown3");
		Select dropdown3=new Select(Source2);		
		dropdown3.selectByVisibleText("Appium");
		WebElement Source3=driver.findElementByClassName("dropdown");
		Select dropdown=new Select(Source3);		
		dropdown.selectByVisibleText("Loadrunner");
		Select Source4=new Select(driver.findElementByXPath("/html/body/div/div/div[3]/section/div[5]/select"));
		Source4.selectByIndex(2);
		Select Source5=new Select(driver.findElementByXPath("/html/body/div/div/div[3]/section/div[6]/select"));
		Source5.selectByIndex(3);
		Thread.sleep(2000);
		driver.close();
		
		
	
		
	}

}
