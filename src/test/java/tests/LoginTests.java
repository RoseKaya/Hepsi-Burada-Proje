package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pages.MainPage;

import java.time.Duration;

public class LoginTests {
    private WebDriver driver;
    private MainPage mainPage;
    private LoginPage loginPage;

    @BeforeEach
    void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com");
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
    }


    @Test
    void hepsiburadaLoginTest() {

        mainPage.waitUntilElementVisible(mainPage.myAccount);
        mainPage.clickBtn(mainPage.myAccount);
        mainPage.waitUntilElementVisible(mainPage.login);
        mainPage.clickBtn(mainPage.login);

        loginPage.waitUntilElementVisible(loginPage.emailAddress);
        loginPage.sendKeys(loginPage.emailAddress, "seleniumAutomation@gmail.com");
        loginPage.waitUntilElementVisible(loginPage.BtnLogin);
        loginPage.clickBtn(loginPage.BtnLogin);
    }

    @Test
    void searchingTest() throws InterruptedException {
        mainPage.waitUntilElementVisibleSearch(mainPage.searchBox);
        mainPage.sendKeysSearcBox(mainPage.searchBox, "Araba");
        mainPage.keyboardKeyEnter(mainPage.searchBox, Keys.ENTER);
    }
    @AfterEach
    void tearDown() {
        driver.close();
    }

}
