package week2.day1selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");

		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		WebElement crmsfaLink = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaLink.click();
		String title1 = driver.getTitle();
		System.out.println("title:" + title1);

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kesavarthini");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manoharan");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Mano");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs.");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("4L");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("NIL");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("HardWork Never Fails");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/27/1989");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality Analyst");
        driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("30");
        driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ok");
        
        WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("7");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("007");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9943083290");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("100");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.Google.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("-");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("keshmano@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.Google.com");
		
		
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("keshmano");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("kesh");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("118 Gandhi Road");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Kanchipuram");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600179");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("08");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TAMILNADU");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		
		
		
		driver.findElement(By.name("submitButton")).click();
		
		//driver.close();

		
	}

}
