package actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CreateUserPageObject;
import pages.NavigateToURL;
import pages.StartBrowser;
import pages.URL;

import java.io.IOException;

public class PassportCreateAdminAccountTestSuite {
	static WebDriver driver = null;
	URL baseUrl = new URL();

	@BeforeTest
	public void startUp() throws IOException {

		StartBrowser openConnection = new StartBrowser(driver);

		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	public void CreateUserCheck() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		CreateUserPageObject CreateUserObj = new CreateUserPageObject(driver);

		CreateUserObj.ClickCreateAccountButton();

		CreateUserObj.ClearFirstName();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		CreateUserObj.EnterFirstName("Hudson");
		
		CreateUserObj.ClearLastName();
		
		CreateUserObj.EnterLastName("User");
		
		CreateUserObj.ClearEmail();
		
		CreateUserObj.EnterEmail("admin@sharklasers.com");
		
		CreateUserObj.ClearMobile();
		
		CreateUserObj.EnterMobileNumber("07033469345");
		
		CreateUserObj.ClearPassword();
		
		CreateUserObj.EnterPassword("Admin123!@#");
		
		CreateUserObj.ClearConfirmPassword();
		
		CreateUserObj.EnterConfirmPassword("Admin123!@#");
		
		CreateUserObj.ClickAgreeButton();
		
		CreateUserObj.ClickCreateButton();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		CreateUserObj.verifyAccountCreatedSuccessfullyMsgIsPresent();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	


	@AfterTest

	public void TearDown() {
		driver.close();
		driver.quit();
		System.out.print("=>");
	}

}






