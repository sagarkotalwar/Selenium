package InvokeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		
		chrome.get("https://www.google.com/");
		
	
		
	}

}
