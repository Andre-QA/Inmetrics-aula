package pages;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	WebDriver driver;
	
	public void abrirNavegador(String site) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		
		
	}
	
	public void escrever(String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);
		
		
	}
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
	}
	public void apagar(By elemento) {
		driver.findElement(elemento).clear();
		
	}
	
	public void evidencias (String nome) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/"+ nome + ".png");
		FileUtils.copyFile(scrFile, destFile);
		
	}

}
