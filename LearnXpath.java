package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class LearnXpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username=driver.findElementByXPath("//input[@id='username']");
		username.sendKeys("Demosalesmanager");
		driver.findElementByXPath("//input[@type='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//div[@for='crmsfa']").click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
