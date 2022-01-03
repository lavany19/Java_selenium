package main.java.com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class locator {
   @Test
	public void locator()
	{
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\eclipse-workspace\\Newbasic\\exefile\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://demo.automationtesting.in/Register.html");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("padma");
				driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("priya");
				driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("karur");
				driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("lavanyakrr19@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9600439551");
				driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
				driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
			     WebElement wb=driver.findElement(By.id("yearbox"));
			     Select sel=new Select(wb);
			     sel.selectByValue("1997");
			     
			     
			     WebElement wb1=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
			     Select sel1=new Select(wb1);
			     sel1.selectByValue("September");
			     
			     
			     WebElement wb2=driver.findElement(By.id("daybox"));
			     Select sel2=new Select(wb2);
			     sel2.selectByValue("30");
			     
			     
			     WebElement wb3=driver.findElement(By.id("Skills"));
			     Select sel3=new Select(wb3);
			     sel3.selectByIndex(4);
			     
			     
//			     WebElement wb4=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span"));
//			     Select sel4=new Select(wb4);
//			     sel4.selectByVisibleText("India");
//			     
			     
			     
			     
			     
			     
				driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("lavanya*19");
				driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("lavanya*19");
				

	}
}
