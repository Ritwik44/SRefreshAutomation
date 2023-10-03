package RefreshAutomation.RefreshAutomation;


import org.testng.annotations.*;

public class App2 {

/*	@BeforeTest
	public void intial() {
		
		System.out.println("Inside App2-initial before test method");
	}  */
	
	@BeforeMethod
	public void setUp() {
		
		System.out.println("Inside App2-setup method");
	}
	
	
	@Test
	public void test1() {
		
		System.out.println("Inside App2-test1");
	}
	
    
	@Test
	public void test2() {
		
		System.out.println("Inside App2-test2");
	}
}
