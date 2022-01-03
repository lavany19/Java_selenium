package main.java.com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class daypick {
	@Test
	public void day()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\eclipse-workspace\\lambda testng\\exefile\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();

		WebElement date=driver.findElement(By.xpath("//*[@id=\"datepicker2\"]"));
		String dateval="19/12/1999";
		selectdatebyjs(driver,date,dateval);
		
		WebElement date1=driver.findElement(By.xpath(" //*[@id=\"datepicker1\"]"));
		String dateval1="30/09/1997";
		selectdatebyjs(driver,date1,dateval1);
		
		
		//List<WebElement> date=dr.findElement(By.xpath(" "));
		
		
	}
	public static void selectdatebyjs(WebDriver dr,WebElement element,String dateval) {
		JavascriptExecutor js=((JavascriptExecutor) dr);
		js.executeScript("arguments[0].setAttribute('value' ,'" +dateval+"');", element);

	}
}