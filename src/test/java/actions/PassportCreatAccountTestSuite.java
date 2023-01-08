package actions;
import org.testng.annotations.Test;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.NavigateToURL;
import pages.CreateUserPageObject;
import pages.StartBrowser;
import pages.URL;

public class PassportCreatAccountTestSuite {
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

		CreateUserObj.EnterFirstName("passport");
		
		CreateUserObj.ClearLastName();
		
		CreateUserObj.EnterLastName("User");
		
		CreateUserObj.ClearEmail();
		
		CreateUserObj.EnterEmail("passportuser@interswitchgroup.com");
		
		CreateUserObj.ClearMobile();
		
		CreateUserObj.EnterMobileNumber("07033469777");
		
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
	
	@Test(priority = 2)
	public void EmailAlreadyExistCheck() {

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

		CreateUserObj.EnterFirstName("passport");
		
		CreateUserObj.ClearLastName();
		
		CreateUserObj.EnterLastName("User");
		
		CreateUserObj.ClearEmail();
		
		CreateUserObj.EnterEmail("passportuser1@interswitchgroup.com");
		
		CreateUserObj.ClearMobile();
		
		CreateUserObj.EnterMobileNumber("07033469770");
		
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
		
		CreateUserObj.verifyEmailAlreadyExistMsgIsPresent();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	
	@Test(priority = 3)
	public void MobileNumberAlreadyExistCheck() {

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

		CreateUserObj.EnterFirstName("passport");
		
		CreateUserObj.ClearLastName();
		
		CreateUserObj.EnterLastName("User");
		
		CreateUserObj.ClearEmail();
		
		CreateUserObj.EnterEmail("passportuser2@interswitchgroup.com");
		
		CreateUserObj.ClearMobile();
		
		CreateUserObj.EnterMobileNumber("07033469770");
		
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
		
		CreateUserObj.verifyMobileNumberAlreadyExistMsgIsPresent();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	
	@Test(priority = 4)
	public void PasswordMismatchCheck() {

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

		CreateUserObj.EnterFirstName("passport");
		
		CreateUserObj.ClearLastName();
		
		CreateUserObj.EnterLastName("User");
		
		CreateUserObj.ClearEmail();
		
		CreateUserObj.EnterEmail("passportuser@interswitchgroup.com");
		
		CreateUserObj.ClearMobile();
		
		CreateUserObj.EnterMobileNumber("07033469777");
		
		CreateUserObj.ClearPassword();
		
		CreateUserObj.EnterPassword("Admin123!@#");
		
		CreateUserObj.ClearConfirmPassword();
		
		CreateUserObj.EnterConfirmPassword("Admin123!@#@");
		
		CreateUserObj.ClickAgreeButton();
		
		CreateUserObj.ClickCreateButton();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		CreateUserObj.verifyPasswordMismatchMsgIsPresent();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	
	@Test(priority = 5)
	public void CheckBoxCheck() {

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

		CreateUserObj.EnterFirstName("passport");
		
		CreateUserObj.ClearLastName();
		
		CreateUserObj.EnterLastName("User");
		
		CreateUserObj.ClearEmail();
		
		CreateUserObj.EnterEmail("passportuser@interswitchgroup.com");
		
		CreateUserObj.ClearMobile();
		
		CreateUserObj.EnterMobileNumber("07033469777");
		
		CreateUserObj.ClearPassword();
		
		CreateUserObj.EnterPassword("Admin123!@#");
		
		CreateUserObj.ClearConfirmPassword();
		
		CreateUserObj.EnterConfirmPassword("Admin123!@#");
		
		CreateUserObj.ClickCreateButton();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		CreateUserObj.verifyCheckBoxMsgIsPresent();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	
	@Test(priority = 6)
	public void EmptyFirstNameCheck() {

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

		CreateUserObj.EnterFirstName("");
		
		CreateUserObj.ClearLastName();
		
		CreateUserObj.EnterLastName("User");
		
		CreateUserObj.ClearEmail();
		
		CreateUserObj.EnterEmail("passportuser@interswitchgroup.com");
		
		CreateUserObj.ClearMobile();
		
		CreateUserObj.EnterMobileNumber("07033469777");
		
		CreateUserObj.ClearPassword();
		
		CreateUserObj.EnterPassword("Admin123!@#");
		
		CreateUserObj.ClearConfirmPassword();
		
		CreateUserObj.EnterConfirmPassword("Admin123!@#@");
		
		CreateUserObj.ClickAgreeButton();
		
		CreateUserObj.ClickCreateButton();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		CreateUserObj.verifyEmptyFirstNameMsgIsPresent();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	
	@Test(priority = 7)
	public void EmptyLastNameCheck() {

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

		CreateUserObj.EnterFirstName("passport");
		
		CreateUserObj.ClearLastName();
		
		CreateUserObj.EnterLastName("");
		
		CreateUserObj.ClearEmail();
		
		CreateUserObj.EnterEmail("passportuser@interswitchgroup.com");
		
		CreateUserObj.ClearMobile();
		
		CreateUserObj.EnterMobileNumber("07033469777");
		
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
		
		CreateUserObj.verifyEmptyLastNameMsgIsPresent();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	
	@Test(priority = 8)
	public void InvalidMobileCheck() {

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

		
		CreateUserObj.EnterFirstName("passport");
		
		CreateUserObj.ClearLastName();
		
		CreateUserObj.EnterLastName("User");
		
		CreateUserObj.ClearEmail();
		
		CreateUserObj.EnterEmail("");
		
		CreateUserObj.ClearMobile();
		
		CreateUserObj.EnterMobileNumber("070334697772333");
		
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
		
		CreateUserObj.verifyInvalidMobileMsgIsPresent();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	
	//@Test(priority = 9)
//	public void EmptyMobileNumberCheck() {
//
//		NavigateToURL startWebsite = new NavigateToURL(driver);
//
//		startWebsite.launchURL();
//
//
//		CreateUserPageObject CreateUserObj = new CreateUserPageObject(driver);
//
//		CreateUserObj.ClickCreateAccountButton();
//
//		CreateUserObj.ClearFirstName();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//
//		CreateUserObj.EnterFirstName("passport");
//		
//		CreateUserObj.ClearLastName();
//		
//		CreateUserObj.EnterLastName("User");
//		
//		CreateUserObj.ClearEmail();
//		
//		CreateUserObj.EnterEmail("");
//		
//		CreateUserObj.ClearMobile();
//		
//		CreateUserObj.EnterMobileNumber("");
//		
//		CreateUserObj.ClearPassword();
//		
//		CreateUserObj.EnterPassword("Admin123!@#");
//		
//		CreateUserObj.ClearConfirmPassword();
//		
//		CreateUserObj.EnterConfirmPassword("Admin123!@#");
//		
//		CreateUserObj.ClickAgreeButton();
//		
//		CreateUserObj.ClickCreateButton();
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		CreateUserObj.verifyEmptyMobileMsgIsPresent();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//
//	}
	
	@Test(priority = 10)
	public void EmptyPassword() {

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

		CreateUserObj.EnterFirstName("passport");
		
		CreateUserObj.ClearLastName();
		
		CreateUserObj.EnterLastName("User");
		
		CreateUserObj.ClearEmail();
		
		CreateUserObj.EnterEmail("passportuser@interswitchgroup.com");
		
		CreateUserObj.ClearMobile();
		
		CreateUserObj.EnterMobileNumber("07033469777");
		
		CreateUserObj.ClearPassword();
		
		CreateUserObj.EnterPassword("");
		
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
		
		CreateUserObj.verifyEmptyPasswordMsgIsPresent();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	
	@Test(priority = 11)
	public void EmptyConfirmPasswordCheck() {

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

		CreateUserObj.EnterFirstName("passport");
		
		CreateUserObj.ClearLastName();
		
		CreateUserObj.EnterLastName("User");
		
		CreateUserObj.ClearEmail();
		
		CreateUserObj.EnterEmail("passportuser@interswitchgroup.com");
		
		CreateUserObj.ClearMobile();
		
		CreateUserObj.EnterMobileNumber("07033469777");
		
		CreateUserObj.ClearPassword();
		
		CreateUserObj.EnterPassword("Admin123!@#");
		
		CreateUserObj.ClearConfirmPassword();
		
		CreateUserObj.EnterConfirmPassword("");
		
		CreateUserObj.ClickAgreeButton();
		
		CreateUserObj.ClickCreateButton();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		CreateUserObj.verifyEmptyConfirmPasswordMsgIsPresent();
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






