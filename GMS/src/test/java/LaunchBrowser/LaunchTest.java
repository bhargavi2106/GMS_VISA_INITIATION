package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.SessionNotCreatedException;

public class LaunchTest
{
	public void browser()
	{
		ChromeOptions co= new ChromeOptions();
		co.setBinary("C:\\Users\\LCS\\Downloads");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LCS\\eclipse-workspace\\GMS\\src\\External_Files\\chromedriver.exe");
	//	WebDriver driver= new ChromeDriver();
//		driver.get("https://azure.microsoft.com/");
	}
	
	public WebDriver invokedriver()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://azure.microsoft.com/");
		return driver;
	}



	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		LaunchTest lt=new LaunchTest();
		lt.browser();
	    lt.invokedriver();
     // driver.get("https://www.ultimatix.net");
	//driver.manage().window().maximize();
	
	//ystem.out.println(driver.getTitle());
	//ystem.out.println(driver.getCurrentUrl());
	//	driver.quit();
		
	
		
	}



	public WebDriver LaunchTest() {
		// TODO Auto-generated method stub
		return null;
	}

}



