package actions;
import org.testng.annotations.Test;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.NavigateToURL;
import pages.LoginPageObject;
import pages.StartBrowser;
import pages.URL;

public class PassportAdminTestSuite {
	static WebDriver driver = null;
	URL baseUrl = new URL();

	@BeforeTest
	public void startUp() throws IOException {

		StartBrowser openConnection = new StartBrowser(driver);

		driver = openConnection.initializeBrowser();
	}

	
	
	@Test(priority = 1)
	public void ValidUsernameInvalidPassword() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchPortalURL();


		LoginPageObject LoginPageObj = new LoginPageObject(driver);

		LoginPageObj.ClickLoginWithPassportButton();

		LoginPageObj.EnterUsername("ademola.adelekan@interswitchgroup.com");

		LoginPageObj.EnterPassword("password0$");

		LoginPageObj.ClickLoginButton();

		LoginPageObj.verifyInvalidUsernameOrPasswordErrMsgIsPresent();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test(priority = 2)
	public void InValidUsernameInvalidPassword() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchPortalURL();


		LoginPageObject LoginPageObj = new LoginPageObject(driver);

		LoginPageObj.ClickLoginWithPassportButton();

		LoginPageObj.EnterUsername("ademola.adelekan09@interswitchgroup.com");

		LoginPageObj.EnterPassword("password0$");

		LoginPageObj.ClickLoginButton();

		LoginPageObj.verifyInvalidUsernameOrPasswordErrMsgIsPresent();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test(priority = 3)
	public void InValidUsernamevalidPassword() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchPortalURL();


		LoginPageObject LoginPageObj = new LoginPageObject(driver);

		LoginPageObj.ClickLoginWithPassportButton();

		LoginPageObj.EnterUsername("ademola.adelekan09@interswitchgroup.com");

		LoginPageObj.EnterPassword("Iitoye123!@");

		LoginPageObj.ClickLoginButton();

		LoginPageObj.verifyInvalidUsernameOrPasswordErrMsgIsPresent();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@Test(priority = 4)
	public void ValidUsernameValidPassword() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchPortalURL();


		LoginPageObject LoginPageObj = new LoginPageObject(driver);

		LoginPageObj.ClickLoginWithPassportButton();

		LoginPageObj.EnterUsername("ademola.adelekan@interswitchgroup.com");

		LoginPageObj.EnterPassword("!@Admin12!@");

		LoginPageObj.ClickLoginButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		LoginPageObj.ClickPassportButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPageObj.verifyPassportClientPageIsPresent();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//LoginPageObj.ClickPortalDropDown();
		
		//LoginPageObj.ClickPortalLogout();
		
	}
		

	@AfterTest

	public void TearDown() {
		driver.close();
		driver.quit();
		System.out.print("Passport Admin Page Test Passed Successfully with ");
	}

}






