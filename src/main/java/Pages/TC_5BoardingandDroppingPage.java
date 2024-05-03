package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
public class TC_5BoardingandDroppingPage {
    public WebDriver driver;

    // create constructor to initiliaze elements
    public TC_5BoardingandDroppingPage(WebDriver driver){
        this.driver=driver;
    }
    private final By rightArrowImage = By.cssSelector("img[src='/oprs-web/_assets/images/home/right-arrow.svg']");
    private final By Select = By.cssSelector("//input[@id='BoardingPoint886']");
    public void ClickOnSelectSeats() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(rightArrowImage).click();

    }

}
