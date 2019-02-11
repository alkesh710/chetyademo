package A;

import org.testng.annotations.Test;

public class C {
	
	@Test
	public void m1() throws InterruptedException
	{
		
		System.out.println("m1 methods");
	}

	@Test(timeOut=1000)
	public void m2() throws InterruptedException
	{
		
		Thread.sleep(2000);
		System.out.println("m2 methods");
	}
	@Test
	public void m4() throws InterruptedException
	{Thread.sleep(4000);
		System.out.println("m4");
	}

}
