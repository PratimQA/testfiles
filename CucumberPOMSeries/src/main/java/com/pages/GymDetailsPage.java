package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GymDetailsPage {

	private WebDriver driver;
	
	private By settings_icon = By.xpath("xpath = \"//button[@class='btn buttonHeaderIcons']\"");
	private By gym_details = By.xpath("//a[normalize-space()='Gym Details']");
	private By edit_icon = By.xpath("//div[@class='gymName']//button//img");
	private By input_image = By.xpath("//input[@type='file']");
	private By org_name = By.xpath("//input[@placeholder='Ex. Fitbit']");
	private By contact_person = By.xpath("//input[@placeholder='Ex. Jon Doe']");
	private By phone_no = By.xpath("//input[@placeholder='Eg. 5552234454']");
	private By gym_email = By.xpath("//input[@placeholder='Ex. admin@fitbit.come']");
	private By timezone = By.xpath("//select[@name='timezone']");
	private By save_btn = By.xpath("button[type='submit']");
	
	private By setgymform = By.xpath("//div[@class='gymdetails_left']");
	
	
	
	public GymDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void click_settings_icon() {
		JavascriptExecutor  js = (JavascriptExecutor)driver;
	   	js.executeScript("arguments[0].click();", settings_icon);
	}
	
	public void select_gym_details() 
    {
    	driver.findElement(gym_details).click();
    }
    
    public void select_edit_icon() 
    {
    	driver.findElement(edit_icon);
    }
    
    public void upload_image() {
    	driver.findElement(input_image).sendKeys("/home/tier5/Pictures/Screenshot from 2022-06-15 11-07-12.png");
    } 
    
//    
//    public List<String> setfields() {
//
//		List<String> DataList = new ArrayList<>();
//		List<WebElement> GymdetailsList = driver.findElements(setgymform);
//
//		for (WebElement e : GymdetailsList) {
//			String text = e.getText();
//			System.out.println(text);
//			DataList.add(text);
//		}
//
//		return DataList;
//		
//    }
		
       public void givedetails() {
		driver.findElement(org_name).clear();
    	driver.findElement(org_name).sendKeys("Tier5 gym");
    	driver.findElement(contact_person).clear();
    	driver.findElement(contact_person).sendKeys("old person");
    	driver.findElement(phone_no).clear();
    	driver.findElement(phone_no).sendKeys("8907789098");
    	driver.findElement(gym_email).clear();
    	driver.findElement(gym_email).sendKeys("abcd@gmail.com");
    	
       }
       
       
       public void save_Details() {
       	JavascriptExecutor js = (JavascriptExecutor)driver;
       	js.executeScript("window.scrollBy(0,250)", "");
       	driver.findElement(save_btn).click();
       	
       }
 
       
       
}
