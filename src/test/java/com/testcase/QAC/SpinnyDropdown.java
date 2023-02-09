package com.testcase.QAC;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpinnyDropdown //used li tags not used select tags
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();       //make connection automatically 
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.spinny.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //latest version
		List<WebElement> Mainmenu = driver.findElements(By.xpath("//li[@class='ExploreBy__listItem ExploreBy__listItemDropdown']"));
		Actions act=new Actions(driver);
		for (int i = 0; i < Mainmenu.size(); i++) 
		{
			System.out.println(Mainmenu.get(i).getText()+"==>");
			act.moveToElement(Mainmenu.get(i)).perform();
			List<WebElement> submenu = driver.findElements(By.xpath("//li[@class='ExploreBy__listItem ExploreBy__listItemDropdown']["+(i+1)+"]/descendant::span"));
			
			for (int j = 0; j < submenu.size(); j++) 
			{
				System.out.println(submenu.get(j).getText());
			
				
			}
		}
		
		driver.quit();

	}

}
