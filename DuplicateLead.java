package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElementByXPath("(//a[@class='x-tab-right'])[3]").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("vimy@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		String firstname=driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(firstname);
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		String Verify=driver.findElementByXPath("//div[text()='Duplicate Lead']").getText();
		System.out.println(Verify);
		driver.findElementByXPath("//input[@name='submitButton']").click();
		String firstname1=driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(firstname1);
		
		if(firstname.equals(firstname1))
		{
			System.out.println("There is a duplicate");
		}
		driver.close();
				
	}
	
}
