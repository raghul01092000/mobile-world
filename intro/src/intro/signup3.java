package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class signup3 {
	@Test(dataProvider = "datas")
	public  void main(String firstname,String lastname,String emailid,String password,String DOB,String phone,String message ) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghul.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://mobileworld.banyanpro.com/"); 
		
		landingpage landing = new landingpage(driver);
		landing.main(firstname, lastname, emailid, password, DOB, phone, message);
		}
	
@DataProvider
 public Object[][] datas(){
Object[][] data = new Object[6][7];
    //all correct
    data[0][0] = "raghul";
    data[0][1] = "kumar";
    data[0][2] = "33raghul@gmail.com";
    data[0][3] = "Hr@01092000";
    data[0][4] = "01/09/2000";
    data[0][5] = "8144114005";
    data[0][6] = "hi i am raghul";
	
    //firstname correct
    data[1][0] = "raghul";
    //lastname wrong
    data[1][1] = "k";
    //emailwrong
    data[1][2] = "33RAGHUL@gmail.com";
    //password wrong
    data[1][3] = "H1"; 
    //DOB correct
    data[1][4] = "01/09/2000";
    //phone wrong
    data[1][5] = "81441";
    //message correct
    data[1][6] = "hi";
    
    //firstname wrong
    data[2][0] = "ra";
    //lastname correct
    data[2][1] = "kumar";
    //email correct
    data[2][2] = "33raghul@gmail.com";
    //password wrong
    data[2][3] = "01092000";
    //DOB correct
    data[2][4] = "01/09/2000";
    //phone wrong
    data[2][5] = "8144114005111111111";
    //message correct
    data[2][6] = "hi i am raghul";

    data[3][0] = "123456";
    data[3][1] = "kumar";
    data[3][2] = "33raghul@gmail.com";
    data[3][3] = "Hr@01092000";
    data[3][4] = "01/09/2000";
    data[3][5] = "8144114005";
    data[3][6] = "hi i am raghul";

    data[4][0] = "@#$%^";
    data[4][1] = "kumar";
    data[4][2] = "33raghul@gmail.com";
    data[4][3] = "Hr@01092000";
    data[4][4] = "01/09/2000";
    data[4][5] = "8144114005";
    data[4][6] = "hi i am raghul";

    data[5][0] = "raghul";
    data[5][1] = "12345678";
    data[5][2] = "33raghul@gmail.com";
    data[5][3] = "Hr@01092000";
    data[5][4] = "01/09/2000";
    data[5][5] = "8144114005";
    data[5][6] = "hi i am raghul";

	return data;
	 
 }
}

