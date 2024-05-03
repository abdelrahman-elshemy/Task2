package Tests;

import TestBase.Task2.TestBase;
import Pages.TC_1ChoosePopularRoutesPage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class TC_1ChooseRouteTest extends TestBase {
    public TC_1ChoosePopularRoutesPage chooseroute;

    @Feature("Choosing Popular Route ")
    @Description("Here we choose Popular Route from CHIKKAMAGALURU to BENGALURU")
    @Test
    public void goToPopularRoute() throws InterruptedException {

        chooseroute = new TC_1ChoosePopularRoutesPage(driver);
        chooseroute.ScrollDown();
        chooseroute.ClickOnNextButton();
        chooseroute.ClickOnCHtoBE();


    }
}
