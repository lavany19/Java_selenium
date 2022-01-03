package main.java.com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class firstclass {
	@Test 
	public void testGoogle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\eclipse-workspace\\lambda testng\\exefile\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java tutorial",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
			
	}

}
