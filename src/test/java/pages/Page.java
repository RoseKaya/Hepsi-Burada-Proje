package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {

    WebDriver driver;

    public Page(WebDriver driver){
        this.driver=driver;
    }
    public void waitUntilElementVisible(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));

    }

    public void waitUntilElementVisibleSearch(String searchBoxElement){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(searchBoxElement)));

    }

    public void clickBtn(String btnId){

        driver.findElement(By.id(btnId)).click();

    }


    public void sendKeys(String elementId, String emailAddress){

    driver.findElement(By.id(elementId)).sendKeys(emailAddress);
    }

    public void sendKeysSearcBox(String serchBoxId, String str){

        driver.findElement(By.cssSelector(serchBoxId)).sendKeys(str);
    }

    public void keyboardKeyEnter(String elementId, Keys keyboardKeys ){
        driver.findElement(By.cssSelector(elementId)).sendKeys(keyboardKeys);
    }



}
