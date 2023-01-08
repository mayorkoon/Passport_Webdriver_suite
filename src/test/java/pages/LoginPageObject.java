package pages;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {

	By PassportSignInButton = By.xpath("//a[contains(text(),'Sign in')]");
	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.xpath("//*[@id=\"login-form\"]/button");
	By WelcomeMessage = By.xpath("//body/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[1]");
	By PassportDropDown = By.xpath("//div[@id='dropdown']");
	By PortalDropDown = By.xpath("//body/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[2]");
	By Logout = By.xpath("//a[contains(text(),'Logout')]");
	By invalidUsernameOrPasswordErrMsg = By.xpath("//span[contains(text(), 'Invalid username/password')]");
	By LogoutMessage = By.xpath("//span[contains(text(),'Logout successful')]");
	By forgotPassword = By.xpath("//a[contains(text(),'Forgot your password')]");
	By emailOrMobileNo = By.xpath("//input[@id='emailMobileNo']");
	By continueButton = By.xpath("//button[contains(text(),'Continue')]");
	By resetLink = By.xpath("//span[contains(text(),'A reset password link has been sent to passportuse')]");
	By invalidEmailForgotPassword = By.xpath("");
	By emptyEmailForgorPassword = By.xpath("");
	By loginWithPassport = By.xpath("//a[contains(text(),'Login with Passport')]");
	By passportButton = By.xpath("//span[contains(text(),'PASSPORT')]");
	By passportClient = By.xpath("//span[contains(text(),'Client ID')]");
	By PortalLogout = By.xpath("//span[contains(text(),'Logout')]");
	By DevConsoleSignInButton = By.xpath("//button[contains(text(),'Sign In')]");
	By SecondFactorAuth = By.xpath("//span[contains(text(),'Please select your preferred option to receive you')]");
	By TwoCheckBox = By.xpath("//span[contains(text(),'Email (passportuse***********chgroup.com)')]");
	By TwoSubmitButton = By.xpath("//button[@id='submit']");
	By Otp = By.xpath("//input[@id='otp']");
	By OtpSubmit = By.xpath("//button[@id='submit']");
	By ResendOtp = By.xpath("//a[contains(text(),'One Time Password')]");
	By InvalidOtpMessage = By.xpath("//span[contains(text(),'Provided One Time Password is not valid')]");
	private By devConUserDropDown = By.xpath("//div[contains(text(),'passport User')]");
	private By devConLogout = By.xpath("//button[contains(text(),'Sign Out')]");

	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void ClickSignInButton() {

		try{
			driver.findElement(PassportSignInButton).click();

			System.out.println("SignIn Button was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterUsername(String text){

		try{
			driver.findElement(username).sendKeys(text);

			System.out.println("Username was Entered successfully");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterPassword(String text) {


		try{
			driver.findElement(password).sendKeys(text);

			System.out.println("Password was Entered successfully");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickLoginButton() {
		driver.findElement(loginButton).click();
	}

	public void ClickLogout () {

		try{
			driver.findElement(Logout).click();

			System.out.println("Logout was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}


	public void ClickDropdown () {
		try{
			driver.findElement(PassportDropDown).click();

			System.out.println("DropDown was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void verifyUserWelcomeMessageIsPresent(){
		if( driver.findElement(WelcomeMessage).isDisplayed())
		{
			System.out.println("WelcomeMessage is Present");
		}else{
			System.out.println("WelcomeMessage is Absent");
		}
	}

	public void verifyInvalidUsernameOrPasswordErrMsgIsPresent(){
		if( driver.findElement(invalidUsernameOrPasswordErrMsg).isDisplayed())
		{
			System.out.println("loginErrorMessage is Present");
		}else{
			System.out.println("loginErrorMessage is Absent");
		}
	}

	public void verifyLogoutMsgIsPresent(){
		if( driver.findElement(LogoutMessage).isDisplayed())
		{
			System.out.println("LogoutMessage is Present");
		}else{
			System.out.println("LogoutMessage is Absent");
		}
	}


	public void ClickForgotPassword() {
		try{
			driver.findElement(forgotPassword).click();

			System.out.println("Forgot Password Button was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickContinue () {

		try{
			driver.findElement(continueButton).click();

			System.out.println("Continue Button was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearFirstName() {
		try {
			driver.findElement(emailOrMobileNo).clear();
			System.out.println("Email Or MobileNo box cleared successfully");
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}


	public void EnterEmailOrMobileNumber(String text){

		try{
			driver.findElement(emailOrMobileNo).sendKeys(text);

			System.out.println("Email Or MobileNo was Entered successfully");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void verifyResetLinkMsgIsPresent(){
		if( driver.findElement(resetLink).isDisplayed())
		{
			System.out.println("Reset Link is Present");
		}else{
			System.out.println("Reset Likk is Absent");
		}
	}

	public void ClickLoginWithPassportButton() {

		try{
			driver.findElement(loginWithPassport).click();

			System.out.println("Login With Button was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public void ClickPassportButton() {

		try{
			driver.findElement(passportButton).click();

			System.out.println("Passport Button was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public void verifyPassportClientPageIsPresent(){
		driver.switchTo().frame("portletIframe");
		if( driver.findElement(passportClient).isDisplayed())
		{
			System.out.println("Passport Client page is Present");
		}else{
			System.out.println("Passport Client Page is Absent");
		}
	}
	
	public void ClickPortalDropDown () {
		//driver.switchTo().frame("portletIframe");
		try{
			driver.findElement(PortalDropDown).click();

			System.out.println("Portal Drop Down was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public void ClickPortalLogout () {
		//driver.switchTo().frame("portletIframe");
		try{
			driver.findElement(PortalLogout).click();

			System.out.println("Portal Logout Down was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public void ClickDevConsoleSignInButton () {
		//driver.switchTo().frame("portletIframe");
		try{
			driver.findElement(DevConsoleSignInButton).click();

			System.out.println("DevConsole SignIn Button was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public void verifySecondFactorAuthenticationMessageIsPresent(){
		//driver.switchTo().frame("portletIframe");
		if( driver.findElement(SecondFactorAuth).isDisplayed())
		{
			System.out.println("Second Factor Authentication Message is Present");
		}else{
			System.out.println("Second Factor Authentication Message is Absent");
		}
	}
	
	public void ClickEmailOptionButton () {
		//driver.switchTo().frame("portletIframe");
		try{
			driver.findElement(TwoCheckBox).click();

			System.out.println("Second Factor Authentication Email option was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public void ClickSecondFactorSubmitButton () {
		//driver.switchTo().frame("portletIframe");
		try{
			driver.findElement(TwoSubmitButton).click();

			System.out.println("Second Factor Authentication Submit Button was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public void ClearOtp() {
		try {
			driver.findElement(Otp).clear();
			System.out.println("Otp cleared successfully");
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	

	public void EnterOtp(String text){

		try{
			driver.findElement(Otp).sendKeys(text);

			System.out.println("Otp Entered successfully");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public void ClickOtpSubmitButton () {
		//driver.switchTo().frame("portletIframe");
		try{
			driver.findElement(OtpSubmit).click();

			System.out.println("Otp Submit Button was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public void ClickResendOtpButton () {
		//driver.switchTo().frame("portletIframe");
		try{
			driver.findElement(ResendOtp).click();

			System.out.println("Resend Otp Button was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public void verifyInvalidOtpMessageIsPresent(){
		//driver.switchTo().frame("portletIframe");
		if( driver.findElement(InvalidOtpMessage).isDisplayed())
		{
			System.out.println("Invalid Otp Message is Present");
		}else{
			System.out.println("Invalid Otp Message is Absent");
		}
	}

	public void ClickDevConUser() {
		try{
			driver.findElement(devConUserDropDown).click();
			System.out.println("Dev console user drop down is interactive");
		}
		catch (Exception e){
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickDevConLogoutButton() {
		try {
			driver.findElement(devConLogout).click();
			System.out.println("Dev console user logged out successfully");
		}
		catch (Exception e){
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public void ClickPassportDropdown () {
		//driver.switchTo().frame("portletIframe");
		try{
			driver.findElement(PassportDropDown).click();

			System.out.println("Passport Dropdown Button was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

}







