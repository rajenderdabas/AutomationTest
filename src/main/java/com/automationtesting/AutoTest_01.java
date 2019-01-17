package com.automationtesting;

import java.net.MalformedURLException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoTest_01 {
	
//private WebDriver driver;	
 private RemoteWebDriver driver;	
	
@Test				
public void testEasy() {
//public static void main(String[] args) {
	driver.get("http://demo.guru99.com/test/guru99home/");  
	String title = driver.getTitle();	
	System.out.println("Page Title ----->" + title);
	Assert.assertTrue(title.contains("Demo Guru99 Page"));
	System.out.println("Page Title -----> AutoTest_01 :: Hello Testing 1");
	
}	

@Test				
public void testEasy2() {
//public static void main(String[] args) {
	driver.get("http://demo.guru99.com/test/guru99home/");  
	String title = driver.getTitle();	
	System.out.println("Page Title ----->" + title);
	Assert.assertTrue(title.contains("Demo Guru99 Page")); 
	System.out.println("Page Title -----> AutoTest_01 :: Hello Testing 2");
	
}

  @BeforeTest
	public void beforeTest() throws MalformedURLException {	
	  
	  System.out.println("***** Test_01 Started *******");
	  
	  	/*File file= new File("F:/Softwares/chromedriver_win32/chromedriver.exe");
	    
		DesiredCapabilities dcap = DesiredCapabilities.chrome();
		dcap.setCapability("version", "");
		dcap.setPlatform(Platform.WINDOWS);
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dcap);*/
	  
		
	  	/*DesiredCapabilities dcap = DesiredCapabilities.chrome();
		dcap.setCapability("version", "");
		dcap.setPlatform(Platform.LINUX);
		driver=new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), dcap);*/
		
		System.setProperty("webdriver.chrome.driver", "F:/Softwares/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}	

}
