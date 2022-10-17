package util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import qa.factory.DriverFactory;



public class GenericFunctions extends DriverFactory {
	
	
	public static byte[] takeScreenShotAsByte() throws IOException {
        return takeFullPageScreenShotAsByte();
    }
	
		
	
		
	private static byte[]takeFullPageScreenShotAsByte() throws IOException{
		
					
//       Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
//              .takeScreenshot(getDriver());
         
        byte[] originalImage =    ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);
        	return originalImage;	
         }
    }





