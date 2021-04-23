package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement username=driver.findElementByXPath("//input[@id='username']");
		username.sendKeys("Demosalesmanager");
		WebElement password=driver.findElementByXPath("//input[@id='password']");
		password.sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//div[@for='crmsfa']").click();
		driver.findElementByXPath("//a[text() ='Create Contact']").click();
		driver.findElementByXPath("//input[@id='firstNameField']").sendKeys("Vani");
		driver.findElementByXPath("//input[@id='lastNameField']").sendKeys("Prasath");
		driver.findElementByXPath("//input[@id='createContactForm_departmentName']").sendKeys("Testing");
		driver.findElementByXPath("//textarea[@id='createContactForm_description']").sendKeys("Working has a test engineer");
		driver.findElementByXPath("//input[@id='createContactForm_primaryEmail']").sendKeys("vanimarch21@gmail.com");
		Select source=new Select(driver.findElementById("createContactForm_generalStateProvinceGeoId"));
		source.selectByVisibleText("New York");
		driver.findElementByXPath("//input[@value='Create Contact']").click();
		driver.findElementByXPath("//a[text()=\"Edit\"]").click();
		driver.findElementByXPath("//textarea[@id='updateContactForm_description']").clear();
		driver.findElementByXPath("//textarea[@id='updateContactForm_importantNote']").sendKeys("Important");
		driver.findElementByXPath("//input[@value='Update']").click();
	   Thread.sleep(2000);
	   System.out.println("contact created");
		driver.close();
	   
		
	}

}
