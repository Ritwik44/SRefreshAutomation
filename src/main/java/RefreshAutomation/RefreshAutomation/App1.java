package RefreshAutomation.RefreshAutomation;

import org.testng.annotations.*;

public class App1 
{
    @BeforeClass
	public void variableintialization() {
    	
    	System.out.println("Inside variableintialization method");
    }
    
	
	@BeforeTest
	public void intial() {
		
		System.out.println("Inside App2-initial before test method");
	}
	

	
	@Test
	public void one()
    {
        System.out.println( "Inside app1" );
    }
}
