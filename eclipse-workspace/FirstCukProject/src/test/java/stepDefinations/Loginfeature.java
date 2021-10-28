package stepDefinations;


import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Loginfeature {

	 @Given("^User enters into landing page$")
	    public void user_enters_into_landing_page() throws Throwable {
		// System.setProperty("webdriver.chrome.driver","C:\\Test\\Chromedriver.exe");
		//Webdriver driver=new ChromeDriver()
		 
		 System.out.println("Landing page login success");
				
	    }

	 @When("User enters user name {string} and password {string}")
	 public void user_enters_user_name_and_password(String string1, String string2) {
	     System.out.println(string1);
	     System.out.println(string2);
	 }

	    @Then("^Application logged in successfully$")
	    public void application_logged_in_successfully() throws Throwable {
	        System.out.println("logged in successfully");
	    }
	    
	    @Then("User logged in displayed {string}")
	    public void user_logged_in_displayed(String string3) {
	        System.out.println(string3);
	    }	
	    
	    @When("User singup with following details")
	    public void user_singup_with_following_details(DataTable data) {
	      List<List<String>> obj=data.asLists();
	     System.out.println(obj.get(0).get(0));
	     System.out.println(obj.get(0).get(1));
	     System.out.println(obj.get(0).get(2));
	     System.out.println(obj.get(0).get(3));
	     System.out.println(obj.get(0).get(4));
	     System.out.println(obj.get(0).get(5));
	     System.out.println(obj.get(0).get(6));
	    }
	    @When("^User login into  Application with (.+) and (.+)$")
	    public void user_login_into_application_with_and(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }
	    
	    	        
	        
	    @Given("^Validate the browser$")
	    public void validate_the_browser() throws Throwable {
	        System.out.println("Browser validated");
	    }

	    @When("^Browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	        System.out.println("Browser triggered");
	    }

	    @Then("Check  if browser triggered")
	    public void check_if_browser_triggered()
	    {
	       System.out.println("Browswer working fine");
	    }


}
