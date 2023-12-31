package f;

import static org.junit.Assert.assertTrue;
import static p.MyApp.arrayProduct;
import static p.MyApp.pr;
import static p.MyApp.theProductIsAvailable;
import static p.MyApp.theProductIsElectronics;
import static p.MyApp.theProductIsExist;
import static p.MyApp.theProductIsExterior;
import static p.MyApp.theProductIsInterior;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import p.MyApp;

public class Product_CatalogTest {
	public MyApp obj15;
	//public RoleMain obj2;	
		public Product_CatalogTest(MyApp o) {
			super();
			this.obj15=o;
		
			
			
		}
	
	
	@Given("product is not Interior")
	public void product_is_not_interior() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
		theProductIsInterior=false;
	}

	@When("i try to search for Interior product if it is Interior or not")
	public void i_try_to_search_for_interior_product_if_it_is_interior_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//int q=0;
		theProductIsInterior=pr.isItInterior("p1");
	
	}

	@Then("the product is Interior")
	public void the_product_is_interior() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	assertTrue(theProductIsInterior);
	
	}

	@Given("product is not Exterior")
	public void product_is_not_exterior() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		theProductIsExterior=false;
	}

	@When("i try to search for Exterior product if it is Exterior or not")
	public void i_try_to_search_for_exterior_product_if_it_is_exterior_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		theProductIsExterior=pr.isItExterior("p3");
	}

	@Then("the product is Exterior")
	public void the_product_is_exterior() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	assertTrue(theProductIsExterior);
	
	}

	@Given("product is not Electronics")
	public void product_is_not_electronics() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	theProductIsElectronics=false;
	
	}

	@When("i try to search for Electronics product if it is Electronics or not")
	public void i_try_to_search_for_electronics_product_if_it_is_electronics_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	
	theProductIsElectronics=pr.isItElectronics("p5");
	
	}

	@Then("the product is Electronics")
	public void the_product_is_electronics() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	assertTrue(theProductIsElectronics);
	}

	@Given("product is not available")
	public void product_is_not_available() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	theProductIsAvailable=false;
	
	}

	@When("i try to search for available product if it is available or not")
	public void i_try_to_search_for_available_product_if_it_is_available_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		theProductIsAvailable=pr.isItAvailable("p1");
	
	}

	@Then("the product is available")
	public void the_product_is_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	assertTrue(theProductIsAvailable);
	
	}

	@Given("the product is not exist")
	public void the_product_is_not_exist() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	theProductIsExist=false;
	}

	@When("I try to search for exist product")
	public void i_try_to_search_for_exist_product() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	theProductIsExist=pr.isTheProductExist("p5");
	}

	@Then("the product is exist")
	public void the_product_is_exist() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	assertTrue(theProductIsExist);
	}

	
	
	
	
	
	
	
	
	

}
