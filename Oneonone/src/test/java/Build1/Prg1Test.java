package Build1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Prg1Test {
	
	@Test
	public void demo1()
	{
		System.out.println("hiii");
		Reporter.log("hello",true);
		Reporter.log("hii",true);
	}
	//hiii
	//hi.
	//ok.
	//hey

}
