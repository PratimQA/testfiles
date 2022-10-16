package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrsnlDtlsPage {

public WebDriver ldriver;

    
     public PrsnlDtlsPage(WebDriver rdriver)
     {
    	 ldriver = rdriver;
    	 PageFactory.initElements(ldriver, this);
     }

          
   
 	
 	 @FindBy(xpath="//a[normalize-space()='Personal Details']")
 	 @CacheLookup
 	 WebElement  prsnl_dtls;
 	
 	 @FindBy(xpath="//select[@name='countryLists']")
 	 @CacheLookup
 	 WebElement select_country;
 	 
 	 @FindBy(xpath="//div[@class='detailsForm']//input[@name='currentPassword']")
 	 @CacheLookup
 	 WebElement current_pass;
 	 
 	 @FindBy(xpath="//div[@class='detailsForm']//input[@name='newPassword']")
 	 @CacheLookup
 	 WebElement new_pass;
 	 
 	 @FindBy(xpath="//div[@class='detailsForm']//input[@name='confirmNewPassword']")
 	 @CacheLookup
 	 WebElement confirm_pass;
 	 
     @FindBy(xpath="//div[@class='formControl']//child::button[@class='saveNnewBtn']")
     @CacheLookup
     WebElement save_btn;
 
     
     
     public void clickPrsnlDtls() {
    	 prsnl_dtls.click();
     }
     
     public void EnterCurrentPass(String curpass) {
    	 current_pass.sendKeys(curpass);
     }
     
     
     public void EnterNewPass(String newpass) {
    	//to perform Scroll on application using Selenium
    	 JavascriptExecutor js = (JavascriptExecutor) ldriver;
    	 js.executeScript("window.scrollBy(0,350)", "");
    	 new_pass.sendKeys(newpass);	 
     }
     
     public void EnterConfPass(String conpass) {
    	confirm_pass.sendKeys(conpass);
     }
}
