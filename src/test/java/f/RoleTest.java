package f;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static p.MyApp.arrayUser;
import static p.MyApp.isLogIn;
import static p.MyApp.r;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import p.MyApp;

public class RoleTest {
	
public MyApp obj22;
//public RoleMain obj2;	
	public RoleTest(MyApp o) {
		super();
		this.obj22=o;
		
	}
	
	@Given("I am not log in")
	public void i_am_not_log_in() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		isLogIn=false;
		
	}

	@When("i enter email: {string} and password :{string} inf for admin")
	public void i_enter_email_and_password_inf_for_admin(String email, String pwd) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		isLogIn= r.isAdmin(email, pwd);
	}

	@Then("invalid log in")
	public void invalid_log_in() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		assertFalse(isLogIn);
		//assertTrue(true);
	}

	@Then("valid log in")
	public void valid_log_in() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		assertTrue(isLogIn);
	}

	@When("i enter email: {string} and password :{string} inf for installer")
	public void i_enter_email_and_password_inf_for_installer(String s1, String s2) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		isLogIn= r.isInstaller(s1, s2);
	}
	
	
	@When("i enter email: {string} and password :{string} inf for customer")
	public void i_enter_email_and_password_inf_for_customer(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		isLogIn=r.isCustomer(string, string2);
	}

	
	

}
