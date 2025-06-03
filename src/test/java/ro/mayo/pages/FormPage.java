package ro.mayo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage extends HomePage{

    //locator
    public static final By PRACTICE_FORM = By.xpath("//span[text() = \"Practice Form\"]");

    //constructors
    public FormPage(WebDriver driver) {
        super(driver);
    }

    //methods
    public PracticeFormPage clickOnPracticeForm(){
        //Navigate to the Practice Form page in the left menu
        WebElement practiceForm = driver.findElement(PRACTICE_FORM);
        practiceForm.click();
        return new PracticeFormPage(driver);
    }
}
