package StepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pages.DashboardPage;
import pages.LoginPage;
import pages.PrsnlDtlsPage;

public class BaseClass {

	
	public WebDriver driver;
	public LoginPage lp;
	public PrsnlDtlsPage pd;
    public DashboardPage dash;
	
	//Created for 
	public static String randomstring() 
	{
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
}
