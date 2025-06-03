package ro.mayo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Assertions;
import java.time.Duration;
import java.util.List;

public class PracticeFormPage extends FormPage{
    public static final By FIRST_NAME = By.id("firstName");
    public static final By LAST_NAME = By.id("lastName");
    public static final By EMAIL = By.id("userEmail");
    public static final By GENDER_RADIO_MALE = By.xpath("//input[@value='Male']");
    public static final By GENDER_RADIO_LABEL_MALE = By.xpath("//label[@for='gender-radio-1']");
    public static final By PHONE_NUMBER = By.id("userNumber");
    public static final By DATE_OF_BIRTH_PICKER = By.id("dateOfBirthInput");
    public static final By MONTH_DROPDOWN = By.className("react-datepicker__month-select");
    public static final By YEAR_DROPDOWN = By.className("react-datepicker__year-select");
    public static final By UPLOAD_PICTURE = By.id("uploadPicture");
    public static final By SUBMIT_BTN = By.id("submit");
    public static final By CONFIRMATION_MSG = By.className("modal-title");

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String firstName){
        driver.findElement(FIRST_NAME).sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        driver.findElement(LAST_NAME).sendKeys(lastName);
    }

    public void enterEmail(String email){
        driver.findElement(EMAIL).sendKeys(email);
    }

    public void selectGenderRadioMale(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Select the gender
        wait.until(ExpectedConditions.elementToBeClickable(GENDER_RADIO_LABEL_MALE));
        WebElement genderRadio = driver.findElement(GENDER_RADIO_MALE);
        WebElement gender = driver.findElement(GENDER_RADIO_LABEL_MALE);
        gender.click();
        Assertions.assertTrue(genderRadio.isSelected());
    }

    public void enterPhoneNumber(String phoneNumber){
        driver.findElement(PHONE_NUMBER).sendKeys(phoneNumber);
    }

    public void selectDateOfBirth(String day, String month, String year){
        WebElement dateOfBirthPicker = driver.findElement(DATE_OF_BIRTH_PICKER);
        dateOfBirthPicker.click();
        WebElement monthElement = driver.findElement(MONTH_DROPDOWN);
        Select monthSelect = new Select(monthElement);
        WebElement yearElement = driver.findElement(YEAR_DROPDOWN);
        Select yearSelect = new Select(yearElement);
        monthSelect.selectByVisibleText(month);
        yearSelect.selectByValue(year);
        WebElement dayElement = driver.findElement(By.xpath("//div[@class='react-datepicker__week']/div[text()='"+day+"']"));
        dayElement.click();
    }

    public void uploadPicture(String filePath){
        driver.findElement(UPLOAD_PICTURE).sendKeys(filePath);
    }

    public void submit(){
        driver.findElement(SUBMIT_BTN).submit();
    }

    public void verifyConfirmationMsg(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(CONFIRMATION_MSG));
        List <WebElement> confirmationMsg = driver.findElements(CONFIRMATION_MSG);
        Assertions.assertFalse(confirmationMsg.isEmpty());
        Assertions.assertEquals("Thanks for submitting the form", confirmationMsg.get(0).getText());
    }

}
