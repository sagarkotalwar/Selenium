package InvokeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Sagar\\Drivers\\geckodriver.exe");
		WebDriver firefox = new FirefoxDriver();
		
		firefox.get("https://www.google.com/");

	}

}
