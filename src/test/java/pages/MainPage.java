package pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends Page {

    public final String myAccount="myAccount";
    public final String login="login";

    public final String searchBox="[placeholder='Ürün, kategori veya marka ara']";

    public MainPage(WebDriver driver) {
        super(driver);
    }
}
