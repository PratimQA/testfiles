package parallel;

import java.util.List;
import java.util.Map;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private DashboardPage dashboardpage;
	
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

	
}
