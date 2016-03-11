package mobATF;

import org.testng.annotations.Test;
//import static org.junit.Assert.assertTrue;
//import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.internal.Locatable;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterClass;
import mobATF.Keyboard;

public class QBApp {
//	public WebDriver driver;
	AndroidDriver<WebElement> driver;
	
	  @BeforeClass (alwaysRun = true)
	  public void setup() {
	  		    
		    DesiredCapabilities capabilities = new DesiredCapabilities(); 
		    capabilities.setCapability("device", "selendroid");
		    capabilities.setCapability("deviceName","TA094075TK"); 
		    capabilities.setCapability("platformName","Android");  
		    capabilities.setCapability("app", "C:/Users/entrayn105/Downloads/android-debug1.apk");
		    capabilities.setCapability("appPackage", "com.entrayn.qbapp");
		    capabilities.setCapability("appActivity","com.entrayn.qbapp.MainActivity");
		    try {
		    	driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		    	} catch (MalformedURLException e) {
		    	// TODO Auto-generated catch block
		    	e.printStackTrace();
		    	}
		    	try {
		    	Thread.sleep(5000);
		    	} catch (InterruptedException e) {
		    	// TODO Auto-generated catch block
		    	e.printStackTrace();
		    	}
		    }
	  
	  /*@AfterClass
	  public void quitdriver(){
	  driver.quit();
	  }	 */ 
	  
	  @Test (groups = { "Login" , "Quant" , "Verbal" })
	  public void loginUsingEntrayn() throws InterruptedException {
		  Thread.sleep(3000);
			 WebElement editTextList = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='login-input']"));
			 WebElement editPass = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='password-input']"));
			 WebElement loginBtn = driver.findElement(By.xpath("//android.widget.Button[@resource-id='login-button']"));
			 editTextList.click();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 String test = "user_1512@qa.entrayn.com";
			 Keyboard kb = new Keyboard(driver);
			 kb.type(test);
			 editPass.click();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 kb.type("password");
			 loginBtn.click();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 System.out.println("Logged In Successfully");
			 Thread.sleep(2000);
//			 logOff();
//			 driver.navigate().back();
			 
/*			 driver.pressKeyCode(AndroidKeyCode.KEYCODE_A);
			 driver.pressKeyCode(AndroidKeyCode.KEYCODE_A);
			 driver.pressKeyCode(AndroidKeyCode.KEYCODE_A, AndroidKeyMetastate.META_SHIFT_ON);
			 driver.pressKeyCode(AndroidKeyCode.KEYCODE_A);
			 driver.pressKeyCode(AndroidKeyCode.KEYCODE_A);
			 driver.pressKeyCode(AndroidKeyCode.KEYCODE_AT);
			 driver.pressKeyCode(AndroidKeyCode.KEYCODE_MINUS, AndroidKeyMetastate.META_SHIFT_ON);*/
			 /*String currentURL = driver.getCurrentUrl();
		  	 System.out.println(currentURL);
		  	 driver.switchTo().frame(driver.findElement(By.id("android:id/content")));
	      	 WebElement results=driver.findElement(By.className("form-group center-circle circle")); 
		  	 assert results.getText().equals("OR"):"Actual value is : "+results.getText()+" did not match with expected value";*/
	  }
 
	  @Test (groups = {"Verbal"})
	  public void verbalPractice(){
			 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 driver.scrollToExact("Practice Verbal Now!");
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.context("WEBVIEW_com.entrayn.qbapp");
			 List<WebElement> Btn = driver.findElements(By.cssSelector("button[class='btn btn-primary btn-lg col-xs-12 section-action']"));
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 Btn.get(0).click();
			 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 System.out.println("Practice Verbal Selected");
	  }
	  
	  @Test (groups = { "Quant" })
	  public void quantPractice(){
			 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 driver.scrollToExact("Practice Quant Now!");
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.context("WEBVIEW_com.entrayn.qbapp");
			 List<WebElement> Btn = driver.findElements(By.cssSelector("button[class='btn btn-primary btn-lg col-xs-12 section-action']"));
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 Btn.get(1).click();
			 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 System.out.println("Practice Quant Selected");
//			 driver.navigate().back();
	  }
	  
	  @Test(groups = {"Verbal"})
	  public void verbalQuestions() throws InterruptedException{
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  Thread.sleep(5000);
		  Boolean btn_isPresent = driver.findElements(By.cssSelector("button[class='btn btn-primary']")).size()>0;
		  if(btn_isPresent == true) {
			  WebElement goBtn = driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
			  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			  goBtn.click(); 
			  System.out.println("Let's Go Clicked");
			  Thread.sleep(3000);
			  System.out.println("Verbal Questions Opened Successfully");
		  }
		  else {
			  Thread.sleep(3000);
			  System.out.println("Verbal Questions Opened Successfully");
		  }
	  }
	  
	  @Test(groups = {"Quant"})
	  public void quantQuestions() throws InterruptedException{
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  Thread.sleep(1500);
		  System.out.println("Quant Questions Opened Successfully");
		  for (int j=0; j<2; j++) {				//attend 5 questions  
		  Boolean chkText = driver.findElements(By.xpath("//*[contains(text(),'Discuss this question')]")).size()>0;
		  if(chkText == true) {
			  quantAnsPage(1);
			  System.out.println("Answer"+j);
		  }
		  else {
			  Thread.sleep(5000);
			  WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Discuss this question')]"));
			  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			  quantQuestions();
		  }
		  }
	  }
	  
	  public void quantAnsPage(int i) throws InterruptedException{
		  Thread.sleep(2000);
		  List<WebElement> ansOption = driver.findElements(By.cssSelector("span[class='add-on']"));
		  WebElement checkAnsBtn = driver.findElement(By.cssSelector("button[id='check-answer']"));
		  switch(i){							//1-4 answer options/next question
		  case 1:{
			  Thread.sleep(2000);
			  ansOption.get(2).click();
			  System.out.println("Option 3 selected");
			  Thread.sleep(2000);
			  boolean isAnsBtnEnabled = checkAnsBtn.isEnabled();
			  if(isAnsBtnEnabled) { System.out.println("1Next"); goNext(checkAnsBtn);  }
			  else{ System.out.println("1else"); quantAnsPage(2);  }
				  }
		  break;
		  case 2:{
			  Thread.sleep(2000);
			  ansOption.get(0).click();
			  System.out.println("Option 1 selected");
			  Thread.sleep(2000);
			  boolean isAnsBtnEnabled = checkAnsBtn.isEnabled();
			  if(isAnsBtnEnabled) { System.out.println("2Next"); goNext(checkAnsBtn);  }
			  else{ System.out.println("2else"); quantAnsPage(3); }
				  }
		  break;
		  case 3:{
			  ansOption.get(3).click();
			  boolean isAnsBtnEnabled = checkAnsBtn.isEnabled();
			  if(isAnsBtnEnabled) { goNext(checkAnsBtn);  }
			  else quantAnsPage(4);
				  }
		  case 4:{
			  ansOption.get(4).click();
			  boolean isAnsBtnEnabled = checkAnsBtn.isEnabled();
			  if(isAnsBtnEnabled) { goNext(checkAnsBtn);  }
			  else quantAnsPage(5);
			  	}
		  case 5:{								//go to review page
			  ansOption.get(1).click();
			  boolean isAnsBtnEnabled = checkAnsBtn.isEnabled();
			  if(isAnsBtnEnabled) { goReview(checkAnsBtn);  }
			  }
		  }
	  }
	  
	  public void goNext(WebElement ansBtn) throws InterruptedException{
		  ansBtn.click();
		  Thread.sleep(2000);
		  System.out.println("Answer is:");
		  WebElement ans = driver.findElement(By.cssSelector("div[class='bootbox-body']"));
		  String answer = ans.getText();
		  System.out.print(answer);
		  Thread.sleep(1000);
		  WebElement checkNextBtn = driver.findElement(By.cssSelector("button[class='btn no-margin-left btn btn-primary btn-lg col-xs-12 next-question']"));
		  checkNextBtn.click();
		  System.out.println("Next question");
		  
//		  btn no-margin-left btn btn-primary btn-lg col-xs-12 next-question
//		  btn review-answer no-margin-left btn btn-blue btn-lg col-xs-12
//		  btn share-question btn btn-lg col-xs-12
		  //div class bootbox-body gettext from i class svg-entrayn-ok-circled span	  
	  }
	  
	  public void goReview(WebElement ansBtn) throws InterruptedException{
		  ansBtn.click();
		  Thread.sleep(2000);
		  WebElement ans = driver.findElement(By.cssSelector("div[class='bootbox-body']"));
		  String answer = ans.getText();
		  System.out.print(answer);
		  Thread.sleep(1000);
		  WebElement reviewBtn = driver.findElement(By.cssSelector("button[class='btn review-answer no-margin-left btn btn-blue btn-lg col-xs-12']"));
		  reviewBtn.click();
		  Thread.sleep(3000);
		  driver.scrollTo("NEXT QUESTION");
		  Thread.sleep(1000);
		  WebElement checkNextBtn = driver.findElement(By.cssSelector("button[class='btn no-margin-left btn btn-primary btn-lg col-xs-12 next-question']"));
		  checkNextBtn.click();
	  }

	  public void logOff() throws InterruptedException {
		     driver.context("WEBVIEW_com.entrayn.qbapp");
			 driver.findElement(By.cssSelector("i[class='svg-entrayn-menu']")).click();
			 Thread.sleep(2000);
			 WebElement logoutBtn = driver.findElement(By.id("logout"));
			 logoutBtn.click();
			 Thread.sleep(2000);
			 System.out.println("Logged Out Successfully");
	  }
}