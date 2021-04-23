package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
			driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
			driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
			driver.findElementByXPath("//div[@id='label']").click();
			driver.findElementByXPath("//a[text()='Leads']").click();
			driver.findElementByXPath("//a[text()='Find Leads']").click();
			driver.findElementByXPath("(//a[@class='x-tab-right'])[2]").click();
			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("7639981110");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a").click();
			driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
			driver.findElementByXPath("//a[text()='Find Leads']").click();
			driver.findElementByXPath("//input[@name='id']").sendKeys("11168");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			System.out.println("No record matches");
			driver.close();
			
	}

}
