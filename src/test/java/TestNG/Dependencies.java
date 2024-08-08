package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencies {
	
	@Test(priority = 1)
	void openURL() {
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2, dependsOnMethods = {"openURL"})
	void Login() {
		Assert.assertTrue(true);		
	}
	
	@Test(priority = 3, dependsOnMethods = {"Login"})
	void Search() {
		Assert.assertTrue(false);		
	}

	@Test(priority = 4, dependsOnMethods = {"Login", "Search"})
	void AdvancedSearch() {
		Assert.assertTrue(true);		
	}
	
	@Test(priority = 5, dependsOnMethods = {"Login"})
	void Logout() {
		Assert.assertTrue(true);		
	}


}
