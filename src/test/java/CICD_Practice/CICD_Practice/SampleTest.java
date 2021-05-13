package CICD_Practice.CICD_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchdriver() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjali.ku\\Desktop\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(3000);
		
	}
	@Test
	public void test1()
	{
		driver.get("https://www.path2usa.com/travel-companions");
		System.out.println("Test1 title is " + driver.getTitle());
	}
	
	@Test
	public void test2()
	{
		driver.get("https://www.amazon.in");
		System.out.println("Test2 title is " + driver.getTitle());
		
	}
	
	@Test
	public void test3()
	{
		driver.get("https://www.facebook.com");
		System.out.println("Test3 title is " + driver.getTitle());
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	
}
