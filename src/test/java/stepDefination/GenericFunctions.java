package stepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class GenericFunctions 
{
	public static byte[] getScreenshot() throws IOException {
		File flSource = ((TakesScreenshot) Hooks.driver).getScreenshotAs(OutputType.FILE);
		byte[] bContents = FileUtils.readFileToByteArray(flSource);
		return bContents;
		
	}
}
