package ro.mayo;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    WebDriver driver;

    @BeforeEach
    public void setUp(){
        // Create WebDriver instance
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        // Navigate to URL
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown(){
        // Kill the WebDriver session
        driver.quit();
    }

}
