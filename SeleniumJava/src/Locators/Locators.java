package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		
		chrome.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		
		// Link text Locator
		chrome.findElement(By.linkText("Input Forms")).click();
		
		chrome.findElement(By.linkText("Input Form Submit")).click();
		
		//Name Locator
		chrome.findElement(By.name("first_name")).sendKeys("First Name");
		
		
		chrome.findElement(By.linkText("Input Forms")).click();
		
		chrome.findElement(By.linkText("Ajax Form Submit")).click();
		
		//Class Locator
		String text=chrome.findElement(By.className("panel-heading")).getText();
		System.out.println(text);
		
		// ID locator
		chrome.findElement(By.id("title")).sendKeys("Title");
		
		
		chrome.findElement(By.linkText("Input Forms")).click();
		
		chrome.findElement(By.linkText("Simple Form Demo")).click();
		
		//Xpath
		chrome.findElement(By.xpath("//*[@id='sum1']")).sendKeys("12");
		
		//Css Selector
		chrome.findElement(By.cssSelector("[id='sum2']")).sendKeys("13");
		
		//Xpath Based on Text value
		chrome.findElement(By.xpath("//*[text()='Get Total']")).click();
		
		System.out.println(chrome.findElement(By.id("displayvalue")).getText());
		
		
		chrome.findElement(By.id("user-message")).sendKeys("My Message");
		chrome.findElement(By.xpath("//*[text()='Show Message']")).click();
		
		//Parent Child Traversing
		System.out.println(chrome.findElement(By.xpath("//*[@id='user-message']/label")).getText());
		
		// Traversing from one sibling to another sibling
		System.out.println(chrome.findElement(By.xpath("//*[@id='user-message']/label/following-sibling::span")).getText());
		
		//Child Parent Traversing syntax
		// //*[@attribute='attribute value']/parent::tagName
		
		
		//Regular Expression Xpath  Syntax: //*[contains(@attribute='attribute value')]
		
		// Regular expression CSS  SYntax: [attribute*='attribute Value']
		
		chrome.close();
	}

}
