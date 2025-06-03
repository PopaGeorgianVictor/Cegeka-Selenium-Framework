package ro.mayo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public WebDriver driver;

    //locator
    public static final By FORMS_CARD = By.xpath("//div[@class='card-body']/h5[text()='Forms']");

    //constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //page methods
    public FormPage clickFormCard() {
        //Navigate to the Forms page
        WebElement formsCard = driver.findElement(FORMS_CARD);
        // Scroll into view and click via JavaScript because it is blocked by an add
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true); arguments[0].click();", formsCard);
        return new FormPage(driver);
    }

}
