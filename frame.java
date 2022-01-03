package main.java.com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {
	@Test
	public void frame()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\eclipse-workspace\\lambda testng\\exefile\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
	       //using webelement
	       driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
	       WebElement outerframe=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
	       driver.switchTo().frame(outerframe);//here we passing frame as a webelement
	       WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	       //WebElement innerframe=dr.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/iframe[1]"));
	       driver.switchTo().frame(innerframe);
	       driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("hai");
	}

}
