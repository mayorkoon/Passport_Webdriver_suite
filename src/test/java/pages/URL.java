package pages;

import org.openqa.selenium.WebDriver;

public class URL {
	private WebDriver driver = null;
	public String PassportLive = "";
	public String portal_URL = "https://portalv2.qa.interswitchng.com";
	public String BASE_URL = "https://passport-v2.k8.isw.la";
	public String DevConsole_URL = "https://developer-interswitchng.k8.isw.la/";

	public String PassportPath = "/passport";


	//Used only when Passport is UAT
	public String PassportUatUrl() {
		// TODO Auto-generated method stub
		return BASE_URL + PassportPath;
	}

	public String PassportAdminUatUrl() {
		// TODO Auto-generated method stub
		return portal_URL;
	}

	public String DevConsoleUatUrl() {
		// TODO Auto-generated method stub
		return DevConsole_URL;
	}

	//Used only when DevConsole is Live
	public String PassportProduction() {
		return PassportLive;

	}



	public void launchURL(){
		//URL baseUrl = new URL();
		driver.get(PassportUatUrl());
		driver.manage().window().maximize();
	}

	public void launchPortalURL(){
		//URL baseUrl = new URL();
		driver.get(PassportAdminUatUrl());
		driver.manage().window().maximize();
	}

	public void launchDevConsolelURL(){
		//URL baseUrl = new URL();
		driver.get(DevConsoleUatUrl());
		driver.manage().window().maximize();
	}

}
