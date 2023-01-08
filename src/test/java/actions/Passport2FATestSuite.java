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

public class Passport2FATestSuite {
	static WebDriver driver = null;
	URL baseUrl = new URL();

	@BeforeTest
	public void startUp() throws IOException {

		StartBrowser openConnection = new StartBrowser(driver);

		driver = openConnection.initializeBrowser();
	}

	
	
	@Test(priority = 1)
	public void PassportSecondFactorAuthentication() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchDevConsoleURL();


		LoginPageObject LoginPageObj = new LoginPageObject(driver);

		LoginPageObj.ClickDevConsoleSignInButton();

		LoginPageObj.EnterUsername("passportuser@interswitchgroup.com");

		LoginPageObj.EnterPassword("Admin123!@#");

		LoginPageObj.ClickLoginButton();

		LoginPageObj.verifySecondFactorAuthenticationMessageIsPresent();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPageObj.ClickEmailOptionButton();
		
		LoginPageObj.ClickSecondFactorSubmitButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPageObj.ClearOtp();
		
		LoginPageObj.EnterOtp("123456");
		
		LoginPageObj.ClickOtpSubmitButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPageObj.ClickDevConUser();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPageObj.ClickDevConLogoutButton();
		
	}
	
	@Test(priority = 2)
	public void ResendOtp() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchDevConsoleURL();


		LoginPageObject LoginPageObj = new LoginPageObject(driver);

		LoginPageObj.ClickDevConsoleSignInButton();

		LoginPageObj.EnterUsername("passportuser@interswitchgroup.com");

		LoginPageObj.EnterPassword("Admin123!@#");

		LoginPageObj.ClickLoginButton();

		LoginPageObj.verifySecondFactorAuthenticationMessageIsPresent();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPageObj.ClickEmailOptionButton();
		
		LoginPageObj.ClickSecondFactorSubmitButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPageObj.ClickResendOtpButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPageObj.verifySecondFactorAuthenticationMessageIsPresent();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPageObj.ClickDropdown();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPageObj.ClickLogout();
		
	}
	
	@Test(priority = 3)
	public void InvalidOtp() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchDevConsoleURL();


		LoginPageObject LoginPageObj = new LoginPageObject(driver);

		LoginPageObj.ClickDevConsoleSignInButton();

		LoginPageObj.EnterUsername("passportuser@interswitchgroup.com");

		LoginPageObj.EnterPassword("Admin123!@#");

		LoginPageObj.ClickLoginButton();

		LoginPageObj.verifySecondFactorAuthenticationMessageIsPresent();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPageObj.ClickEmailOptionButton();
		
		LoginPageObj.ClickSecondFactorSubmitButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPageObj.ClearOtp();
		
		LoginPageObj.EnterOtp("111111");
		
		LoginPageObj.ClickOtpSubmitButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPageObj.verifyInvalidOtpMessageIsPresent();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPageObj.ClickDropdown();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPageObj.ClickLogout();
		
		
	}
		

	@AfterTest

	public void TearDown() {
		driver.close();
		driver.quit();
		System.out.print("Passport Second Factor Authentication Page Test Passed Successfully");
	}

}






