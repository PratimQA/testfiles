package StepDefinitions;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.PrsnlDtlsPage;
import pages.DashboardPage;

public class Steps extends BaseClass {

    public WebDriver driver;
    public LoginPage lp;
	public DashboardPage dash;
	public PrsnlDtlsPage pd;
	
	
       //////////////////////**BROWSER LAUNCH STEPS**///////////////////////
    
	    @Given("User launch chrome browser")
	    public void browser_is_launched(){
	     //Write code here that turns the phrase above into concrete actions
		 //String projectpath = System.getProperty("user.dir");
		 //System.out.println("Project path is: "+projectpath);
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
		
//		 ChromeOptions options = new ChromeOptions();
//		 options.addArguments("--headless");
		 
		 //WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		 lp = new LoginPage(driver);
		 
		
		 driver.manage().window().maximize();
		 
		 System.out.println("Inside Step - browser is opened");
	     //throw new io.cucumber.java.PendingException();
	     }

	    
	    
	    
	
	    
	   ///////////////////////**LOGIN FEATURE STEPS**////////////////////
	
	    @When("User opens login URL {string}")
        public void user_is_on_login_page(String url) throws Throwable{
          //throw new PendingException();
		  driver.get(url);
		  System.out.println("Inside Step - user is on login page");
          }
	
	   
	   
	    @Then("Page Title should be {string}")
		public void page_Title_should_be(String title){
		    // Write code here that turns the phrase above into concrete actions
			if (driver.getTitle().contains("Red Belt Gym -Login")){
				System.out.println("Title is correct");
			} else {
				System.out.println("Title is incorrect");
			}
				
		   }
	   
	   
	    @And("User will enter Email as {string} and Password as {string}")
	    public void user_enters_username_and_password(String username, String password) {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Inside Step - user enters username and password");
		  lp.enterUsername(username);
		  lp.enterPassword(password);
		  //throw new io.cucumber.java.PendingException();
	      }

	
	    @And("User will click on Login button")
	    public void clicks_on_login_button() {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Inside Step - clicks on login button");
		  lp.clickLogin();
	
		//throw new io.cucumber.java.PendingException();
	    }
	
	
	 
	    
	    
	    
	   ///////////////////**DASHBOARD FEATURE STEPS**//////////////////
	  
	    @Then("User can view Dashboard URL {string}")
	    public void user_can_view_dashboard_URL(String url) throws Throwable {
	    	 dash = new DashboardPage(driver);
	    	 String title_dash = dash.getPageTitle();
	    	 System.out.println("The URL after viewing dashboard is"+title_dash);
	        //throw new PendingException();
	    }

	    
	    @When("User clicks on Settings menu")
	    public void user_click_on_settings_menu() throws Throwable {
	    	Thread.sleep(5000);
	    	dash.click_settings_icon();
	        //throw new PendingException();
	    }

	    
	    @Then("User can view his account setup")
	    public void user_can_view_his_account_setup() throws Throwable {
	         Thread.sleep(1000);
	         String title_setup = dash.getPageTitle();
	    	 System.out.println("The URL after viewing setup is"+title_setup);
	    	//throw new PendingException();
	    }

	    
	    
	    
	    
	    
	    ////////////*PERSONAL DETAILS FEATURE*/////////////////////////
	    @Then("User will click on Personal Details")
	    public void user_clicks_on_personal_details() throws InterruptedException {
	    	pd = new PrsnlDtlsPage(driver);
	    	Thread.sleep(5000);
	    	pd.clickPrsnlDtls();
	    }
	    
	    
	    @Then("User will enter Current Password as {string}")
	    public void user_will_enter_current_password_as(String curpass) throws InterruptedException {
	        // Write code here that turns the phrase above into concrete actions
	        Thread.sleep(10000);
	    	pd.EnterCurrentPass(curpass);
	    	//throw new io.cucumber.java.PendingException();
	    }
	    
	    @Then("User will enter New Password as {string}")
	    public void user_will_enter_new_password_as(String newpass) {
	        // Write code here that turns the phrase above into concrete actions
	        pd.EnterNewPass(newpass);
	    	//throw new io.cucumber.java.PendingException();
	    }
	    
	    @Then("User will enter Confirm Password as {string}")
	    public void user_will_enter_confirm_password_as(String conpass) {
	        // Write code here that turns the phrase above into concrete actions
	        pd.EnterConfPass(conpass);
	    	//throw new io.cucumber.java.PendingException();
	    }
	    
	    @Then("User will click on Save button")
	    public void user_will_click_on_save_button() {
	        // Write code here that turns the phrase above into concrete actions
	        
	    	//throw new io.cucumber.java.PendingException();
	    }
	    
	    
	    
}
