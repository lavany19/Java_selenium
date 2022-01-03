package main.java.com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class window {
	
	@Test
	public void window()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\eclipse-workspace\\lambda testng\\exefile\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
		
	}

}
