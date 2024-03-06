package samplePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tests {
	
	@Test
	public void test1() {
		System.out.println("Test");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
