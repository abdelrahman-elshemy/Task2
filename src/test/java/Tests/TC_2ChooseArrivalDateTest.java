package Tests;
import Pages.TC_2ChooseArrivalDatePage;
import TestBase.Task2.TestBase;
import Pages.TC_1ChoosePopularRoutesPage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
public class TC_2ChooseArrivalDateTest extends TestBase{

    public TC_1ChoosePopularRoutesPage chooseroute;
    public TC_2ChooseArrivalDatePage choosedate;


    @Feature("Choosing Date ")
    @Description("Here we choose The Date")
    @Test
    public void ChooseDate() throws InterruptedException {

        chooseroute = new TC_1ChoosePopularRoutesPage(driver);
        chooseroute.ScrollDown();
        chooseroute.ClickOnNextButton();
        chooseroute.ClickOnCHtoBE();

        choosedate = new TC_2ChooseArrivalDatePage(driver);
        choosedate.ChooseDate();



    }

}
