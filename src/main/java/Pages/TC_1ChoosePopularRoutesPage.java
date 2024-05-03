package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class TC_1ChoosePopularRoutesPage {
    public WebDriver driver;

    // create constructor to initiliaze elements
    public TC_1ChoosePopularRoutesPage(WebDriver driver){
        this.driver=driver;
    }


    // locate elements use By way
    private final By nextbutton = By.className("carousel-control-next-icon");
    private final By chikkamagaluruToBengaluruLink = By.cssSelector("a[onclick*='populateSearch']");





    public void ScrollDown() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");

    }

    public void ClickOnNextButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(nextbutton).click();

    }

    public void ClickOnCHtoBE() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(chikkamagaluruToBengaluruLink).click();

    }


}
