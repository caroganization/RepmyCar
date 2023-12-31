package f;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import p.MyApp;
import p.Product;

public class AdminTest {

    
	public MyApp obj;
	public AdminTest(MyApp o) {
		super();
		this.obj=o;
		
	}
	
	
	@When("admin try to add product")
	public void admin_try_to_add_product() {
	    // Write code here that turns the phrase above into concrete actions
	  //
		//throw new io.cucumber.java.PendingException();
		String ar6[]= {"p7","Electronics","descr7","imgpath7","70$","no"};
		Product p9=new Product(ar6);
		MyApp.arrayProduct.add(p9);
		
	}

	@Then("the product is added")
	public void the_product_is_added() {
	    
		assertTrue(MyApp.pr.isTheProductExist("p7"));
		
	}

	@When("admin try to edit product")
	public void admin_try_to_edit_product() {
	   
		obj.arrayProduct.get(0).setPrice("800");
		
		
	}

	@Then("the product is edited")
	public void the_product_is_edited() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
		assertEquals( "800" , obj.arrayProduct.get(0).getPrice() );
	}

	@When("admin try to delete product")
	public void admin_try_to_delete_product() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		MyApp.arrayProduct.remove(0);
	}

	@Then("the product is deleted")
	public void the_product_is_deleted() {
	   
		assertTrue(MyApp.pr.isTheProductExist("p1"));
		
		//assertTrue(true);
	}
	
	
	
	
	
	
}
