package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Toggle {

	private WebDriver driver = null;
	By toggleButton = By.xpath("//input[@class='jss1156 MuiSwitch-input']");
	
	By modalPopUp = By.xpath("//span[@class='jss5119']");
	
	public Toggle(WebDriver driver){
		this.driver  = driver;
	}

	public void clickOntoggleForward(){
		driver.findElement(toggleButton).click();
	}

	public void clickOntoggleBackward(){
		driver.findElement(toggleButton).click();
	}
	
	public void verifyTogglePopUpIsPresent(){
		if( driver.findElement(modalPopUp).isDisplayed())
		{
			System.out.println("ModalPopUp is Present");
		}else{
			System.out.println("ModalPopUp is Absent");
		}
	}
	
}
