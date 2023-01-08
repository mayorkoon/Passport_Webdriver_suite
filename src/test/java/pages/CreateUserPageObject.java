package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateUserPageObject {

	By CreateAccountButton = By.xpath("//a[contains(text(),'Create an account now')]");
	By firstname = By.xpath("//input[@id='firstName']");
	By lastname = By.xpath("//input[@id='lastName']");
	By email = By.xpath("//input[@id='email']");
	By mobile = By.xpath("//input[@id='mobileNo']");
	By password = By.xpath("//input[@id='password']");
	By confirmpassword = By.xpath("//input[@id='confirmPassword']");
	By agree = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[7]/div[1]/label[1]");
	By create = By.xpath("//button[contains(text(),'Create account')]");
	By creatSuccessful = By.xpath("//div[contains(text(),'Your Passport Board')]");
	By emailExist = By.xpath("//p[contains(text(),'Provided email address belongs to an existing acco')]");
	By mobileExist = By.xpath("//p[contains(text(),'Provided mobile number belongs to an existing acco')]");
	By passwordMismatch = By.xpath("//li[contains(text(),'Confirm password does not match provided password')]");
	By checkBox = By.xpath("//li[contains(text(),'Please read and accept our privacy policy')]");
	By emptyFirstname = By.xpath("//li[contains(text(),'Please provide your first name')]");
	By emptyLastname = By.xpath("//li[contains(text(),'Please provide your last name')]");
	By invalidMobile = By.xpath("//p[contains(text(),'Please provide a valid mobile number')]");
	By emptyMobile = By.xpath("");
	By emptyPassword = By.xpath("//li[contains(text(),'Please provide a password')]");
	By emptyConfirmPassword = By.xpath("//li[contains(text(),'Please confirm your password')]");

	private WebDriver driver;

	public CreateUserPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void ClickCreateAccountButton() {

		try{
			driver.findElement(CreateAccountButton).click();

			System.out.println("Create Account Button was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}


	public void ClearFirstName() {
		try {
			driver.findElement(firstname).clear();
			System.out.println("Firstname box cleared successfully");
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}


	public void EnterFirstName(String text){

		try{
			driver.findElement(firstname).sendKeys(text);

			System.out.println("Firstname was Entered successfully");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}


	public void ClearLastName() {
		try {
			driver.findElement(lastname).clear();
			System.out.println("Lastname box cleared successfully");
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	

	public void EnterLastName(String text){

		try{
			driver.findElement(lastname).sendKeys(text);

			System.out.println("Lastname was Entered successfully");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearEmail() {
		try {
			driver.findElement(email).clear();
			System.out.println("email box cleared successfully");
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterEmail(String text){

		try{
			driver.findElement(email).sendKeys(text);

			System.out.println("Email Address was Entered successfully");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearMobile() {
		try {
			driver.findElement(mobile).clear();
			System.out.println("Mobile box cleared successfully");
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}


	public void EnterMobileNumber(String text){

		try{
			driver.findElement(mobile).sendKeys(text);

			System.out.println("Mobile Number was Entered successfully");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearPassword() {
		try {
			driver.findElement(password).clear();
			System.out.println("Password box cleared successfully");
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

	public void ClearConfirmPassword() {
		try {
			driver.findElement(confirmpassword).clear();
			System.out.println("Confirm Password box cleared successfully");
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterConfirmPassword(String text) {


		try{
			driver.findElement(confirmpassword).sendKeys(text);

			System.out.println("Confirm Password was Entered successfully");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickAgreeButton() {
		driver.findElement(agree).click();
	}

	public void ClickCreateButton() {
		driver.findElement(create).click();
	}


	public void verifyAccountCreatedSuccessfullyMsgIsPresent(){
		if( driver.findElement(creatSuccessful).isDisplayed())
		{
			System.out.println("CreatSuccessful Message is Present");
		}else{
			System.out.println("CreatSuccessful Message is Absent");
		}
	}

	public void verifyEmailAlreadyExistMsgIsPresent(){
		if( driver.findElement(emailExist).isDisplayed())
		{
			System.out.println("EmailAlreadyExist Message is Present");
		}else{
			System.out.println("EmailAlreadyExist Message is Absent");
		}
	}

	public void verifyMobileNumberAlreadyExistMsgIsPresent(){
		if( driver.findElement(mobileExist).isDisplayed())
		{
			System.out.println("MobileNumberAlreadyExist Message is Present");
		}else{
			System.out.println("MobileNumberAlreadyExist Message is Absent");
		}
	}

	public void verifyPasswordMismatchMsgIsPresent(){
		if( driver.findElement(passwordMismatch).isDisplayed())
		{
			System.out.println("PasswordMismatch Message is Present");
		}else{
			System.out.println("PasswordMismatch Message is Absent");
		}
	}

	public void verifyCheckBoxMsgIsPresent(){
		if( driver.findElement(checkBox).isDisplayed())
		{
			System.out.println("Check Box Message is Present");
		}else{
			System.out.println("Check Box Message is Absent");
		}
	}

	public void verifyEmptyFirstNameMsgIsPresent(){
		if( driver.findElement(emptyFirstname).isDisplayed())
		{
			System.out.println("Empty FirstName Message is Present");
		}else{
			System.out.println("Empty FirstName Message is Absent");
		}
	}

	public void verifyEmptyLastNameMsgIsPresent(){
		if( driver.findElement(emptyLastname).isDisplayed())
		{
			System.out.println("Empty LastName Message is Present");
		}else{
			System.out.println("Empty LastName Message is Absent");
		}
	}

	public void verifyInvalidMobileMsgIsPresent(){
		if( driver.findElement(invalidMobile).isDisplayed())
		{
			System.out.println("Empty Email Message is Present");
		}else{
			System.out.println("Empty Email Message is Absent");
		}
	}

	public void verifyEmptyMobileMsgIsPresent(){
		if( driver.findElement(emptyMobile).isDisplayed())
		{
			System.out.println("Empty Mobile Message is Present");
		}else{
			System.out.println("Empty Mobile Message is Absent");
		}
	}

	public void verifyEmptyPasswordMsgIsPresent(){
		if( driver.findElement(emptyPassword).isDisplayed())
		{
			System.out.println("Empty Password Message is Present");
		}else{
			System.out.println("Empty Password Message is Absent");
		}
	}

	public void verifyEmptyConfirmPasswordMsgIsPresent(){
		if( driver.findElement(emptyConfirmPassword).isDisplayed())
		{
			System.out.println("Empty Confirm Password Message is Present");
		}else{
			System.out.println("Empty Confirm Password Message is Absent");
		}
	}
}







