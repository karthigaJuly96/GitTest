package gitTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;


public class FirstGitTest {

	
	public void LogInTest() throws IOException{
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.bing.com");
		WebElement search = wd.findElement(By.name("q"));
		search.sendKeys("chennai");
		search.submit();
		
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\SeleniumWorkspace\\GitTest\\Screenshots\\\\check.jpg"));
		
	}

}
