package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.Testbase;
import Pages.Homepage;
import Utilities.ReadOR;


public class HomeTest extends Testbase{
	
	Homepage obj;
	@BeforeClass
	public void init()
	{
		 obj=new Homepage(driver);
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
@Test
public void run() throws InterruptedException
{
	Assert.assertEquals(obj.getURL(),obj.getURL());
	System.out.println(obj.getURL());
	System.out.println("SEARCHING MOST RATED TV IN AMAZON");
	Testbase.test.log(LogStatus.INFO, "SEARCHING MOST RATED TV IN AMAZON");
	String[] res=obj.addToCart(ReadOR.getLocator("product"));
	Assert.assertEquals(res[0],res[2]);
	String expected="(27,839)";
	Assert.assertEquals(27839,27839);
	System.out.println("MostREviwed Tv " +res[0]+"with rating  "+ res[1]);
	Testbase.test.log(LogStatus.INFO, "MostREviwed Tv " +res[0]+"with rating  "+res[1]);
}
}
