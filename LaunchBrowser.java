package week2.day1selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
//webDriverManager.edgedriver().setup();
//webDriverManager.firefoxdriver().setup();

//step 2: launch the Browser
		ChromeDriver driver = new ChromeDriver();

//step 3: Maximize the Browser
		driver.manage().window().maximize();

//step 4:Launch the URL
		driver.get("https://www.google.com/");

//step 5:Get the title of the current page
		String title = driver.getTitle();
		System.out.println("title:" + title);
		
	//Enter username
		WebElement userName=driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		
		//step 7: enter password
		WebElement passWord=driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		
		//step 8:click on the login button
		WebElement loginButton=driver.findElement(By.className("docorativesubmit"));
		loginButton.click();
		
		WebElement crmsfaLink=driver.findElement(By.linkText("CRM/SFA"));
		crmsfaLink.click();
		String title1=driver.getTitle();
		System.out.println("title:"+title);

//step 6:Close the Browser
//driver.close();

	}

}
