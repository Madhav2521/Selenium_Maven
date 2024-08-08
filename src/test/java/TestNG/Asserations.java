package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserations {
	@Test
	void test() {
//		int x = 10;
//		int y = 40;
//		if(x==y) 
//			System.out.println("Test is passed");
//		else
//			System.out.println("Test is failed");
		
//		Assert.assertEquals(x, y);		// hard asserations	
//		Assert.assertTrue(true);		// passed
//		Assert.assertTrue(false);		// failed
//		Assert.fail();
		
//		int a = 30;
//		int b = 20;
//		Assert.assertEquals(actual, expected, description);		
//		Assert.assertEquals(a<b, true, "a is not smaller than b");
		
//		String str1 = "Abc";
//		String str2 = "abc";
//		Assert.assertEquals(str1, str2, "Both Strings are same");
		
		if(true)
			Assert.assertTrue(true);
		else
			Assert.fail();
	}
}
