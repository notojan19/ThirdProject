package Resorce;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	WebDriver driver;
	public Properties prop;
	
	public WebDriver intializerDriver() throws IOException {
		
	 prop=new Properties();
		String proPath=System.getProperty("user.dir")+"/src/test/java/Resorce/data.properties";
				 FileInputStream fis= new FileInputStream(proPath);
				 prop.load(fis);
				 
				 
				 
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		
	}
		else if(browserName.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			 driver=new SafariDriver();

}else if(browserName.equalsIgnoreCase("edge")) {
	WebDriverManager.edgedriver().setup();
	 driver=new EdgeDriver();
	
}
		
		driver.manage().window().maximize();
	
		
		return driver;
	}
	
	
	public String takeScreenShot(String testName, WebDriver driver) throws IOException {
		
		File Sourcefile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationFilePath=System.getProperty("user.dir")+"/screenshots//"+testName+".png";
        FileUtils.copyFile(Sourcefile, new File(destinationFilePath));
        
        return destinationFilePath;

		
	}
}
