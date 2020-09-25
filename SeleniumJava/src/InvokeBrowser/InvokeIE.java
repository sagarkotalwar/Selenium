package InvokeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "C:\\Sagar\\Drivers\\IEDriverServer.exe");
		WebDriver ie = new InternetExplorerDriver();
		
		ie.get("https://www.google.com/");

	}

}
