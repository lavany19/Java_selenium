package main.java.com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basicannotation {
	@BeforeSuite
	public  void test1()
	{
		System.out.println("before suite");
	}
	
	@BeforeTest
	public  void test2()
	{
		System.out.println("before test");
	}
	
	@BeforeClass
	public  void test3()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public  void test4()
	{
		System.out.println("before method");
	}
	
	@Test
	public  void test5()
	{
		System.out.println("testing");
	}
	@Test
	public  void test10()
	{
		System.out.println("testing");
	}
	
	@AfterSuite
	public  void test6()
	{
		System.out.println("aftersuite");
	}
	
	@AfterTest
	public  void test7()
	{
		System.out.println("aftertest");
	}
	 
	@AfterClass
	public  void test8()
	{
		System.out.println("afterclass");
	}
	
	@AfterMethod
	public  void test9()
	{
		System.out.println("aftermethod");
	}


}
