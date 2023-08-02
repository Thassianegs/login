package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Executa extends DriversFactory {

	public static void abrirNavegador  (boolean headless) {
		
		String ambiente = "https://fm-site-br/login"; 
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions(); 
		chromeOptions.setCapability (CapabilityType.ACCEPT_INSECURE_CERTS, true);
	
		if(!headless) {
			chromeOptions.addArguments("--headless"); 
		}
		
		chromeOptions.addArguments("--start-maximize"); 
		driver = new ChromeDriver (chromeOptions); 
		driver.get(ambiente);
		
	}
	public static void fecharNavegador () {
		
		driver.quit();
	}
	
}
