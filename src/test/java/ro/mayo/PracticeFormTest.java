package ro.mayo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

//public class PracticeFormTest {
//
//    @Test
//    public void happyTest(){
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://demoqa.com/automation-practice-form");
//        driver.manage().window().maximize();
//
//        WebElement firstName = driver.findElement(By.id("firstName"));
//        firstName.sendKeys("George");
//
//        WebElement lastName = driver.findElement(By.id("lastName"));
//        lastName.sendKeys("Popa");
//
//        WebElement email = driver.findElement(By.id("userEmail"));
//        email.sendKeys("geo@paodas.com");
////        Assertions.assertEquals("geo@paodas.com", email.getText());
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='gender-radio-1']")));
//        WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
//        WebElement gender1 = driver.findElement(By.xpath("//label[text()='Male']"));
//        gender1.click();
//        Assertions.assertTrue(gender.isSelected());
//
//        WebElement mobileNumber = driver.findElement(By.id("userNumber"));
//        mobileNumber.sendKeys("12412214");
//
//        WebElement dateOfBirthPicker = driver.findElement(By.id("dateOfBirthInput"));
//        dateOfBirthPicker.click();
//        WebElement monthElement = driver.findElement(By.className("react-datepicker__month-select"));
//        Select month = new Select(monthElement);
//        WebElement yearElement = driver.findElement(By.className("react-datepicker__year-select"));
//        Select year = new Select(yearElement);
//        month.selectByVisibleText("January");
//        year.selectByValue("1999");
//        WebElement day = driver.findElement(By.xpath("//div[@class='react-datepicker__week']/div[text()='12']"));
//        day.click();
//        driver.quit();
//    }
//}


public class PracticeFormTest {

    @Test
    public void happyTest(){
        // Create WebDriver instance
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to URL
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        //Define a wait object to be used anywhere in the test
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Navigate to the Forms page
        WebElement formsCard = driver.findElement(By.xpath("//div[@class='card-body']/h5[text()='Forms']"));
        // Scroll into view and click via JavaScript because it is blocked by an add
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true); arguments[0].click();", formsCard);

        //Navigate to the Practice Form page in the left menu
        WebElement practiceForm = driver.findElement(By.xpath("//span[text() = \"Practice Form\"]"));
        practiceForm.click();

        // Close all the visible popup ads
        ((JavascriptExecutor) driver).executeScript("document.querySelectorAll('iframe, .advertisement').forEach(el => el.remove());");

        // Add first name and last name
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("John");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Smith");

        // Add email address
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("john.smith@gmail.com");

        // Select the gender
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='gender-radio-1']")));
        WebElement genderRadio = driver.findElement(By.xpath("//input[@value='Male']"));
        WebElement gender = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        gender.click();
        Assertions.assertTrue(genderRadio.isSelected());

        // Add a valid phone number
        WebElement mobileNumber = driver.findElement(By.id("userNumber"));
        mobileNumber.sendKeys("1234567890");

        // Select a date of birth
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

        // Upload a picture
        WebElement picture = driver.findElement(By.id("uploadPicture"));
        picture.sendKeys("C:\\Users\\georgian.popa\\OneDrive - EOS Technology Solutions GmbH\\Desktop\\Curs\\curs\\SeleniumFramework\\src\\test\\resources\\Screenshot_7.jpg");

        // Submit the form
        WebElement submit = driver.findElement(By.id("submit"));
        submit.submit();

        // Verify the registration was successful
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-title")));
        WebElement confirmationMessage = driver.findElement(By.className("modal-title"));
        Assertions.assertTrue(confirmationMessage.isDisplayed());
        Assertions.assertEquals("Thanks for submitting the form", confirmationMessage.getText() );

        // Close the modal element
        WebElement closeButton = driver.findElement(By.id("closeLargeModal"));
        //closeButton.click(); //sometimes it doesn't scroll enough
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true); arguments[0].click();", closeButton);

        // Kill the WebDriver session
        driver.close();
    }

    @Test
    public void sadTest(){
        // Create WebDriver instance
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to URL
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        //Define a wait object to be used anywhere in the test
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Navigate to the Forms page
        WebElement formsCard = driver.findElement(By.xpath("//div[@class='card-body']/h5[text()='Forms']"));
        // Scroll into view and click via JavaScript because it is blocked by an add
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true); arguments[0].click();", formsCard);

        //Navigate to the Practice Form page in the left menu
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text() = \"Practice Form\"]")));
        WebElement practiceForm = driver.findElement(By.xpath("//span[text() = \"Practice Form\"]"));
        practiceForm.click();

        // Click on Submit without filling in the form
        WebElement submit = driver.findElement(By.id("submit"));
        submit.submit();

        // Verify that the entire modal popup is not displayed.
        // When an element does not exist in the DOM (like this popup), just by verifying using the isDisplayed() does not work because it cannot find the element in order to verify that.
        // So the easiest option is to try an find all possible elements with that locator using findElements(...) that can return an empty list if the element is not displayed.
        List<WebElement> elements = driver.findElements(By.className("modal-content"));
        Assertions.assertTrue(elements.isEmpty());

        // Verify the form has been validated.
        WebElement form = driver.findElement(By.id("userForm"));
        Assertions.assertTrue(form.getAttribute("class").contains("was-validated"));

        // Verify the First name and Last name fields have a red icon inside the text boxes
        WebElement firstName = driver.findElement(By.id("firstName"));
        Assertions.assertTrue(firstName.getCssValue("background-image").contains("stroke='%23dc3545'")); // red border
        WebElement lastName = driver.findElement(By.id("lastName"));
        Assertions.assertTrue(lastName.getCssValue("background-image").contains("stroke='%23dc3545'")); // red border

        // Verify all gender labels are red (rgba structure)
        List<WebElement> genderLabels = driver.findElements(By.xpath("//label[contains(@for, 'gender-radio')]"));
        for (WebElement gender : genderLabels) {
            Assertions.assertEquals("rgba(73, 80, 87, 1)", firstName.getCssValue("color")); // red border
        }

        // Verify the Mobile number field has a red icon inside the text box
        WebElement mobileNumber = driver.findElement(By.id("userNumber"));
        Assertions.assertTrue(mobileNumber.getCssValue("background-image").contains("stroke='%23dc3545'")); // red border

        // Kill the WebDriver session
        driver.close();
    }
}

