package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
public class TC_3SearchForBusPage {
    public WebDriver driver;

    // create constructor to initiliaze elements
    public TC_3SearchForBusPage(WebDriver driver){
        this.driver=driver;
    }
    private final By searchBusButton = By.xpath("//button[contains(@class, 'btn-booking') and contains(text(), 'Search for Bus')]");
    public void ClickOnSearchBus() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(searchBusButton).click();

    }




}
