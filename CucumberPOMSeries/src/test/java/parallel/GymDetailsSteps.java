package parallel;

import java.util.List;
import java.util.Map;

import com.pages.DashboardPage;
import com.pages.GymDetailsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GymDetailsSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private DashboardPage dashboardpage;
	private GymDetailsPage gymdetailspage;
	
	@Given("user has already logged in to application and is on Dashboard page")
    public void user_launch_chrome_browser(DataTable credTable) throws Throwable {
		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");

		DriverFactory.getDriver()
				.get("https://www.redbeltgym.com");
		dashboardpage = loginPage.doLogin(userName, password);

        throw new PendingException();
    }

    @Given("user is on Dashboard page")
    public void user_is_on_dashboard_page(String strArg) throws Throwable {
    	String title = dashboardpage.get_title();
		System.out.println("Dashboard Page title is: " + title);
        throw new PendingException();
    }


    @Then("User will click on general settings")
    public void user_will_click_on_general_settings() throws Throwable {
    	
        throw new PendingException();
    }
    
    @And("^User will click on gym details$")
    public void user_will_click_on_gym_details() throws Throwable {
        throw new PendingException();
    }
    
    
    @And("^Accordingly User will click on Edit button$")
    public void accordingly_user_will_click_on_edit_button() throws Throwable {
        throw new PendingException();
    }
    
    @Then("^User will fill up all fields$")
    public void user_will_fill_up_all_fields() throws Throwable {
        throw new PendingException();
    }

    
    
    @Then("^User will click on upload and select any png or jpg file$")
    public void user_will_click_on_upload_and_select_any_png_or_jpg_file() throws Throwable {
        throw new PendingException();
    }

    @Then("^User must see the edit button beside the name of the gym$")
    public void user_must_see_the_edit_button_beside_the_name_of_the_gym() throws Throwable {
        throw new PendingException();
    }

    @And("^User will Enter Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void user_will_enter_email_as_something_and_password_as_something(String strArg1, String strArg2) throws Throwable {
        throw new PendingException();
    }

    @And("^User will click on Login button$")
    public void user_will_click_on_login_button() throws Throwable {
        throw new PendingException();
    }



    @And("^Finally click on Save$")
    public void finally_click_on_save() throws Throwable {
        throw new PendingException();
    }

    @And("^Update the details$")
    public void update_the_details() throws Throwable {
        throw new PendingException();
    }

    
    
}
