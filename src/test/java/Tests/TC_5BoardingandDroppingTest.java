package Tests;
import Pages.*;
import TestBase.Task2.TestBase;
import TestBase.Task2.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
public class TC_5BoardingandDroppingTest extends TestBase {
    public TC_1ChoosePopularRoutesPage chooseroute;
    public TC_2ChooseArrivalDatePage choosedate;
    public TC_3SearchForBusPage searchbus;
    public TC_4SelectSeatPage selectseat;

    public TC_5BoardingandDroppingPage drop;


    @Feature("Select Seatss ")
    @Description("Here we Select For the seats")
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

        selectseat = new TC_4SelectSeatPage(driver);
        selectseat.ClickOnSelectSeats();

        drop = new TC_5BoardingandDroppingPage(driver);
        drop.ClickOnSelectSeats();

}}
