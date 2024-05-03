package Tests;

import Pages.TC_1ChoosePopularRoutesPage;
import Pages.TC_2ChooseArrivalDatePage;
import Pages.TC_3SearchForBusPage;
import TestBase.Task2.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class TC_3SearchBusTest extends TestBase {

    public TC_1ChoosePopularRoutesPage chooseroute;
    public TC_2ChooseArrivalDatePage choosedate;
    public TC_3SearchForBusPage searchbus;


    @Feature("Search For Bus ")
    @Description("Here we Search for the bus")
    @Test
    public void ChooseDate() throws InterruptedException {

        chooseroute = new TC_1ChoosePopularRoutesPage(driver);
        chooseroute.ScrollDown();
        chooseroute.ClickOnNextButton();
        chooseroute.ClickOnCHtoBE();

        choosedate = new TC_2ChooseArrivalDatePage(driver);
        choosedate.ChooseDate();

        searchbus = new TC_3SearchForBusPage(driver);
        searchbus.ClickOnSearchBus();



    }


}
