package ro.mayo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeFormTest {

    @Test
    public void happyTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("George");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Popa");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("geo@paodas.com");
//        Assertions.assertEquals("geo@paodas.com", email.getText());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='gender-radio-1']")));
        WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
        WebElement gender1 = driver.findElement(By.xpath("//label[text()='Male']"));
        gender1.click();
        Assertions.assertTrue(gender.isSelected());

        WebElement mobileNumber = driver.findElement(By.id("userNumber"));
        mobileNumber.sendKeys("12412214");

        WebElement dateOfBirthPicker = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirthPicker.click();
        WebElement monthElement = driver.findElement(By.className("react-datepicker__month-select"));
        Select month = new Select(monthElement);
        WebElement yearElement = driver.findElement(By.className("react-datepicker__year-select"));
        Select year = new Select(yearElement);
        month.selectByVisibleText("January");
        year.selectByValue("1999");
        WebElement day = driver.findElement(By.xpath("//div[@class='react-datepicker__week']/div[text()='12']"));
        day.click();
        driver.quit();
    }
}
