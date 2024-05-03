package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class TC_2ChooseArrivalDatePage {
    public WebDriver driver;

    // create constructor to initiliaze elements
    public TC_2ChooseArrivalDatePage(WebDriver driver){
        this.driver=driver;
    }

    private final By choosedate = By.xpath("//a[contains(text(),'18')]");


    public void ChooseDate() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(choosedate).click();

    }

}
