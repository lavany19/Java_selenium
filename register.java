package main.java.com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class register {
	@Test
	public void register()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\eclipse-workspace\\lambda testng\\exefile\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
		driver.findElement(By.name("username")).sendKeys("lavanya");
		driver.findElement(By.name("password")).sendKeys("lavanya");
		driver.findElement(By.name("signon")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
		driver.findElement(By.name("username")).sendKeys("lavanya");
		driver.findElement(By.name("password")).sendKeys("lavanya");
		driver.findElement(By.name("repeatedPassword")).sendKeys("lavanya");
		driver.findElement(By.name("account.firstName")).sendKeys("lavanya");
		driver.findElement(By.name("account.lastName")).sendKeys("selvam");
		driver.findElement(By.name("account.email")).sendKeys("lavanyakrr19@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("9790448548");
		driver.findElement(By.name("account.address1")).sendKeys("karur");
		driver.findElement(By.name("account.address2")).sendKeys("karur");
		driver.findElement(By.name("account.city")).sendKeys("karur");
		driver.findElement(By.name("account.state")).sendKeys("tamilnadu");
		driver.findElement(By.name("account.zip")).sendKeys("639004");
		driver.findElement(By.name("account.country")).sendKeys("india");
		driver.findElement(By.name("account.languagePreference")).click();
		driver.findElement(By.name("account.favouriteCategoryId")).click();
		driver.findElement(By.name("account.listOption")).click();
		driver.findElement(By.name("account.bannerOption")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
		
		
	}
	


}
