package alltopics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//Take screen Shot and store as a file formate
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//now copy the screenShot to desired location using copy//method
		Files.copy(src,new File("\\Users\\MYPC\\eclipse-workspace\\Alltopics\\src\\alltopics\\krishna.png"));
		
       
	}

}
