package com.quiz;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumTest {
	
	//private WebDriver driver;
	
	public WebDriver driver = new ChromeDriver();
	
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  
	  
	  @Before
	  public void setUp() {
		  
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	  
	  
	  @After
	  public void tearDown() {
		    driver.close();
	        driver.quit();
	  }
	  
	  @Test
	  void questionAdd() {
		  driver.get("http://localhost:4200/quiz/add-question");
		    driver.manage().window().setSize(new Dimension(1346, 708));
		    driver.findElement(By.cssSelector(".input-group:nth-child(1) > .form-control")).click();
		    driver.findElement(By.cssSelector(".input-group:nth-child(1) > .form-control")).sendKeys("1*5=?");
		    driver.findElement(By.cssSelector(".input-group:nth-child(2) > .form-control")).click();
		    driver.findElement(By.cssSelector(".input-group:nth-child(2) > .form-control")).sendKeys("1");
		    driver.findElement(By.cssSelector(".input-group:nth-child(3) > .form-control")).click();
		    driver.findElement(By.cssSelector(".input-group:nth-child(3) > .form-control")).sendKeys("2");
		    driver.findElement(By.cssSelector(".input-group:nth-child(4) > .form-control")).click();
		    driver.findElement(By.cssSelector(".input-group:nth-child(4) > .form-control")).sendKeys("4");
		    driver.findElement(By.cssSelector(".input-group:nth-child(5) > .form-control")).click();
		    driver.findElement(By.cssSelector(".input-group:nth-child(5) > .form-control")).sendKeys("5");
		    driver.findElement(By.cssSelector(".input-group:nth-child(6) > .form-control")).click();
		    driver.findElement(By.cssSelector(".input-group:nth-child(6) > .form-control")).sendKeys("3");
		    driver.findElement(By.cssSelector(".btn")).click();
	  }
	  
	  @Test
	  public void deleteTest() {
	    driver.get("http://localhost:4200/quiz");
	    driver.manage().window().setSize(new Dimension(1346, 708));
	    driver.findElement(By.cssSelector(".mat-list-item:nth-child(4) > .mat-list-item-content")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(3) .btn")).click();
	  }

}
