package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class NavigateToURL {
		WebDriver driver;
		URL baseUrl = new URL();

		public NavigateToURL(WebDriver driver) {
			this.driver = driver;
		}
		public void launchURL() {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get(baseUrl.PassportUatUrl());
			driver.manage().window().maximize();
						
			System.out.println("Url Launched Sucessfully");
		}
		
		public void launchPortalURL() {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get(baseUrl.PassportAdminUatUrl());
			driver.manage().window().maximize();
						
			System.out.println("Portal Url Launched Sucessfully");
		}
		
		public void launchDevConsoleURL() {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get(baseUrl.DevConsoleUatUrl());
			driver.manage().window().maximize();
						
			System.out.println("Dev Console Url Launched Sucessfully");
		}

	}

