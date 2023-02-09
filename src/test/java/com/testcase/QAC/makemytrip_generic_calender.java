package com.testcase.QAC;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip_generic_calender 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		String month="May 2023";
		String date="16";
		for (int i = 0; i < 11; i++) 
		{
			try {
			driver.findElement(By.xpath("//div[text()='"+month+"']/parent::div/parent::div/descendant::p[text()='"+date+"']")).click();
			break;
			}
			catch (NoSuchElementException e)
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			driver.quit();
		}
		
	}
	

}
