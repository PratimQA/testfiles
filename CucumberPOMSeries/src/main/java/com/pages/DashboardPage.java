package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

	private WebDriver driver;

	private By add_rvn_month = By.xpath("//select[@name='Additional Revenue']");
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	



  public String get_title() {
	  return driver.getTitle();
  }


 

}