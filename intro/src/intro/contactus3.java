package intro;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class contactus3 {
	@Test(dataProvider = "datas")
	public void contactus3(String username,String email,String phone,String message ) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghul.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://mobileworld.banyanpro.com/"); 
		
		
		landingpage landing = new landingpage(driver);
		landing.contactus3(username, email, phone, message);
		
	} 
	

	
	@DataProvider
	
	 public Object[][] datas(){
	Object[][] data = new Object[5][4];
	//all correct
	data[0][0] = "raghul";
    data[0][1] = "33raghul@gamil.com";
    data[0][2] = "8144114005";
    data[0][3] = "Hi raghul";
    
    //username wrong
    data[1][0] = "ra";
    //email correct
    data[1][1] = "33raghul@gamil.com";
    //phone correct
    data[1][2] = "8144114005";
    //message correct
    data[1][3] = "Hi raghul";

    //username wrong
    data[2][0] = "raghul";
    // email wrong
    data[2][1] = "33RAGHUL@gamil.com";
    //number wrong
    data[2][2] = "8144";
    //message correct
    data[2][3] = "Hi raghul";

    // username wrong , email nill , phone correct , message nill
    data[3][0] = "r";
    data[3][1] = "";
    data[3][2] = "8144114005";
    data[3][3] = "";
 // username wrong , email correct , phone correct , message nill

    data[4][0] = "r     a       g";
    data[4][1] = "33raghul@gmail.com";
    data[4][2] = "8144114005";
    data[4][3] = "";
{
	

	}
return data;

	}
}
