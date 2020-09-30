package DriverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		
		//To hit the URL in Browser
		chrome.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Fetch and print the title of the Page
		System.out.println(chrome.getTitle());
		
		//TO find the Web Element of the Page and fetch text and display
		System.out.println(chrome.findElement(By.className("blinkingText")).getText());
		
		//To Enter values in Text Box
		chrome.findElement(By.id("name")).sendKeys("Accept Alert");
		
		//To Click on the button
		chrome.findElement(By.id("alertbtn")).click();
		
		//TO Switch control to alert and accept alert 
		Thread.sleep(3000);
		chrome.switchTo().alert().accept();;
		
		chrome.findElement(By.id("name")).sendKeys("Confirm Box Accept");
		chrome.findElement(By.id("confirmbtn")).click();
		
		//To switch to alert and accept the confirm Box
		Thread.sleep(3000);
		chrome.switchTo().alert().accept();
		
		
		//To switch to alert and Reject / Close the confirm Box
		
		chrome.findElement(By.id("name")).sendKeys("Confirm Box Reject");
		chrome.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		chrome.switchTo().alert().dismiss();  //Step for Reject
		
		
		
		//To Close the current Browser
		//chrome.close();
		
		//To close all browser opened by Selenium
		//chrome.quit();
		
	}

}
