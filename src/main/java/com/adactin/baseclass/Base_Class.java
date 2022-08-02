package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Base_Class {
public static WebDriver driver;

//1. browserLaunch 
	public static WebDriver browserLaunch(String options) {

		if (options.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (options.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver", System.getProperty("user.Dir") + "\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();

		} else if (options.equalsIgnoreCase("gecko")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else {

			System.out.println("Invalid Broswer");
		}

		driver.manage().window().maximize();

		return driver;

	}

// 2. Get url
	public static void getUrl(String value) {
		driver.get("https://adactinhotelapp.com/");
	}

//3. Inputvalues(Sendkeys)
	public static void userInput(WebElement element, String value) {
		element.sendKeys(value);
	}

// 4. ClickOnElement(click button)
	public static void clickOnElement(WebElement element) {
		element.click();
	}

// 5. Clear Options
	public static void clearElement(WebElement element) {
		element.clear();
	}

// 6. Boolean Method(isDisplayed)
	public static void isDisplayed(WebElement displayed) {

		boolean displayed2 = displayed.isDisplayed();
		System.out.println("Display the Element;" + displayed2);
	}

// (isEnabled)
	public static void isEnabled(WebElement enabled) {
		boolean enabled2 = enabled.isEnabled();
		System.out.println("Enable the Element:" + enabled2);
	}

// (isSelected)
	public static void isSelected(WebElement selected) {
		boolean selected2 = selected.isSelected();
		System.out.println("Select the Element:" + selected2);
	}

//7. Get Text
	public static void getText(WebElement text) {
		String text2 = text.getText();
		System.out.println("Get the text" + text2);
	}

//8. Get Attributes
	public static void getAttributes(WebElement attribute, String s) {

		String attribute2 = attribute.getAttribute(s);
		System.out.println("Get attribute value" + attribute2);

    }
	
//9. implicit wait
	public static void wait(int seconds) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
//10. Alert
	public static void alert(String options) {
		Alert a=driver.switchTo().alert();
		if(options.equalsIgnoreCase("ok")) {
			a.accept();
		}
		
		else if(options.equalsIgnoreCase("cancle")) {
			a.dismiss();
		}
		
		else if(options.equalsIgnoreCase("gettext")) {
			String text = a.getText();
			System.out.println(text);
		}
		
		else {
			System.out.println("Not handle this alert");
		}
		
	}
	
//alert sendkeys
	public static void alertSendKeys(String value) {
		Alert a=driver.switchTo().alert();
		a.sendKeys(value);
	}
	
//11. IFrame
	public static void frame(WebElement element,String options ) {
		
		if(options.equalsIgnoreCase("locator")) {
			driver.switchTo().frame(element);
		}
		else if(options.equalsIgnoreCase("default")) {
			driver.switchTo().defaultContent();
		}
		else if(options.equalsIgnoreCase("parent")) {
			driver.switchTo().parentFrame();
		}
		else {
			System.out.println("its not frame");
			
		}
	}
		
//12.WindowHandle
		public static void windowhandle() {
			String wh = driver.getWindowHandle();
			System.out.println(wh);
			String title = driver.switchTo().window(wh).getTitle();
			System.out.println(title);
		}
			
//13. windowHandles	
		public static void windowHandles() {
			Set<String> whs = driver.getWindowHandles();
			System.out.println(whs);
			for(String get:whs) {
			String title = driver.switchTo().window(get).getTitle();
			System.out.println(title);
			}
		}
//14.Actions		
			public static void action(WebElement element,String options) {
				Actions a=new Actions(driver);
				if(options.equalsIgnoreCase("click")){
					a.click().perform();
				}
				else if(options.equalsIgnoreCase("rightclick")) {
					a.contextClick().perform();
				}
				else if(options.equalsIgnoreCase("doubleclick")) {
					a.doubleClick();
				}
				else if(options.equalsIgnoreCase("move")) {
					a.moveToElement(element).perform();
				}
				else {
					System.out.println("Invaild click");
				}
			}
//Dragndrop
				public static void dragndrop(WebElement source,WebElement destination) {
					Actions a=new Actions(driver);
					a.dragAndDrop(source, destination).perform();
				}
				
//15 Robot Down
				public static void robotDown() throws AWTException {
					Robot r=new Robot();
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
				}
				
              //robot Up
				public static void robotUp() throws AWTException {
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_UP);
				r.keyRelease(KeyEvent.VK_UP);
				}
				
              //Robot Enter
				public static void robotEnter() throws AWTException {
					Robot r=new Robot();
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
				}
				
				
//16. Navigation
				public static void navigateTo(String Url) {
					driver.navigate().to(Url);
				}
				
				public static void navigateForward(String options) {
					
					if(options.equalsIgnoreCase("forward")) {
						driver.navigate().forward();
					}
					else if(options.equalsIgnoreCase("back")) {
						driver.navigate().back();
					}
					else if(options.equalsIgnoreCase("refresh")) {
						driver.navigate().refresh();
					}
					else if(options.equalsIgnoreCase("close")) {
						driver.close();
					}
					else if(options.equalsIgnoreCase("quit")) {
						driver.quit();
					}
				}
			
				
//17.TakesScrrenShot
//			public static void screenShot() throws IOException {
//					Date date=new Date();//7/22/2022
//					SimpleDateFormat format=new SimpleDateFormat("7/22/2022");
//					String l = format.format(date);
//					String path = l.replace("/", "_");
//					TakesScreenshot ts=(TakesScreenshot) driver;
//					File source=ts.getScreenshotAs(OutputType.FILE);
//					File destination=new File("C:\\Users\\ADMIN\\eclipse-workspace\\TestMaven\\screenshot"+path+".png");
//					FileUtils.copyFile(source,destination);
//					}
				
//18.javaScriptExecutor
			
			public static void scrolview(WebElement element) {
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0],scrolllntoView();", element);
			}
				
			public static void scrolDown(String value) {
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript(value);
			}
			
			public static void jsclick(WebElement element) {
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", element);
			}	
				
			}

			
		
		
	


