package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Driver {
    private static WebDriver driver;
    private Driver(){//singleton design pattern

    }
    //TO DO :driver classını cross browser çalışacak formata getir

    public static WebDriver getDriver(){
        String browser=ConfigReader.getProperty("browser");


        if (driver == null){

            switch (browser){
                case "chrome"://browser chrome ise
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "edge"://edge ise
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        return driver;
    }

    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver=null;

        }

    }
}
