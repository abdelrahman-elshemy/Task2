package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
public class TC_4SelectSeatPage {
    public WebDriver driver;

    // create constructor to initiliaze elements
    public TC_4SelectSeatPage(WebDriver driver){
        this.driver=driver;
    }
    private final By selectSeatsButton = By.xpath("(//input[@id='SrvcSelectBtnForward2'])[1]");
    public void ClickOnSelectSeats() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(selectSeatsButton).click();

    }


}
