package TestNG;

import org.testng.annotations.*;

public class Annotation_D {
	
	@BeforeMethod
	void bm() {
		System.out.println("This is before method");
	}

	@BeforeClass
	void bc() {
		System.out.println("This is before class");
	}

	@BeforeTest
	void bt() {
		System.out.println("This is before test");
	}
	
	@BeforeSuite
	void bs() {
//	  System.out.println("This is Before Test login");
	  System.out.println("This is before suite");
  }
	
	@Test (priority = 1)
	void search() {
		System.out.println("This is search method");
	}
	
	@Test (priority = 2)
	void AdvancedSearch() {
		System.out.println("This is Advanced search method");
	 }
	
	@AfterMethod
	void am() {
		System.out.println("This is after method");
	}
	
	@AfterClass
	void ac() {
		System.out.println("This is after class");
	}
	
}
