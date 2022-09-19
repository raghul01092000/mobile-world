package intro;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingpage {
	WebDriver driver;
    public landingpage(WebDriver driver) {
    this.driver =driver;
    PageFactory.initElements(driver, this);
    } 
    //signin
    @FindBy(xpath= "//button[@class='btn btn-warning my-2 my-sm-0']")
    WebElement signin;
    @FindBy(id = "username")
    WebElement  username;
    @FindBy(id= "password")
    WebElement password;
    @FindBy(xpath="//*[@id=\"submitForm\"]/div[4]/a")
    WebElement login;
    public void signin3(String name, String pass) throws InterruptedException {
        signin.click();
        username.sendKeys(name);
        Thread.sleep(1000);
        password.sendKeys(pass);
        Thread.sleep(1000);
        login.click();
        Thread.sleep(2000);
        driver.quit();
        }
      
    // sign up
        @FindBy(xpath= "//button[@class='btn btn-warning my-2 my-sm-0']")
        WebElement signin1; 
        //signup
        @FindBy(linkText="Sign up")
        WebElement Signup;
        //firstname
        @FindBy(css="input[type='text']")
        WebElement text;
        //lastname
        @FindBy(xpath="//input[@placeholder='Last Name']")
        WebElement lastname;
        //email-id
        @FindBy(xpath = "//input[@placeholder='Enter Email']")
        WebElement Email;
        //password
        @FindBy(xpath="//input[@type='Password']")
        WebElement password1;
        //DOB
        @FindBy(xpath="//input[@type='date']")
        WebElement date;
        //Gender
        @FindBy(xpath="//input[@type='radio']")
        WebElement gender;
        //phone
        @FindBy(xpath="//input[@min='0']")
        WebElement phone1;
        //message
        @FindBy(xpath="//textarea[@rows='3']")
        WebElement message1;
        //register
        @FindBy(css="button[type='submit']")
        WebElement register; 
        public  void main(String firstname,String lname,String emailid,String password,String DOB,String phone,String message ) throws InterruptedException {
        	signin.click();
        	Signup.click();
        text.sendKeys(firstname);
        lastname.sendKeys(lname);
        Email.sendKeys(emailid);
        password1.sendKeys(password);
        date.sendKeys(DOB);
        gender.click();
        phone1.sendKeys(phone);
        message1.sendKeys(message);
        register.click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        driver.quit();
        }
        
        // contactus
        
        //support
        
        @FindBy(xpath="/html/body/nav/div/ul/li[4]/a")
        WebElement support1;
        //contact us
        @FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[4]/div/a[2]")
        WebElement contactus;
        //username
        @FindBy(xpath="/html/body/div/div/div[2]/form/div[1]/input")
        WebElement username3;
        //email
        @FindBy(css="input[placeholder='Email']")
        WebElement email3;
        //phone 
        @FindBy(xpath="//input[@type='tel']")
        WebElement phone2;
        //message
        @FindBy(css="textarea[placeholder='Message']")
        WebElement message2;
        //submit
        @FindBy(css="input[type='submit']")
        WebElement submit;
        public void contactus3(String username,String email,String phone,String message)throws InterruptedException {
        	support1.click();
        	contactus.click();
        	String parenthandle = driver.getWindowHandle();
    	    Set<String> handles = driver.getWindowHandles();
    	    for(String handle : handles) {
    	        if(!handle.equals(parenthandle)) {
    	            driver.switchTo().window(handle);
    	    username3.sendKeys(username);
    	    email3.sendKeys(email);
    	    phone2.sendKeys(phone);
    	    message2.sendKeys(message);
    	    Thread.sleep(2000);
    	    submit.click();
    	    Thread.sleep(2000);
    	    driver.quit();
    	        }
    	    }
        }
		
}
        
    



