package GESS_TRAVEL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LaunchBrowser.LaunchTest;


public class GMS_VISA_INITIATION {
	
	LaunchTest browser;
	WebDriver driver;
	

	
	
	
	
	
	public GMS_VISA_INITIATION()
	{
		browser=new LaunchTest();
		driver=browser.invokedriver();
		
	}
	
	public void homepage()
	{
		driver.get("https://azure.microsoft.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		System.out.println("Successfully launched the browser and website");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GMS_VISA_INITIATION visa=new GMS_VISA_INITIATION();
		visa.homepage();

	}

}
