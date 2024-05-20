package me.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import me.pages.HomePage;
import me.pages.CareersPage;
import me.utility.ConfigurationReader;
import me.utility.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;

public class StepDefs {

    HomePage homePage = new HomePage();
    CareersPage careersPage = new CareersPage();

    @Given("user is on the FUNDUEL Home page")
    public void user_is_on_the_funduel_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("funduel_url"));
    }

    @Then("user should see title is {string}")
    public void userShouldSeeTitleIs(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(actualTitle,expectedTitle);
    }

//    @Then("user should see title is FanDuel | Daily Fantasy Sports and Online U.S. Sportsbook & Casino | FanDuel")
//    public void userShouldSeeTitleIsFanDuelDailyFantasySportsandOnlineUSSportsbookCasinoFanDuel() {
//        String actualTitle = Driver.getDriver().getTitle();
//        String expectedTitle = "FanDuel | Daily Fantasy Sports and Online U.S. Sportsbook & Casino | FanDuel";
//        assertEquals(actualTitle,expectedTitle);
//
//    }


    @When("user clicks on careers button")
    public void userClicksOnCareersButton() {
        homePage.careersBtn.click();

    }

    @And("user fill in keywords or job title")
    public void userFillInKeywordsOrJobTitle() {
        careersPage.acceptCookiesBtn.click();

        careersPage.keysInput.sendKeys("software engineer");
    }

    @And("user selects a team")
    public void userSelectsATeam() {
        Select team = new Select(careersPage.teamSelect);
        team.selectByVisibleText("Software Engineering");

    }

    @And("user selects a location")
    public void userSelectsALocation() {
        Select team = new Select(careersPage.locationSelect);
        team.selectByValue("101");
    }

    @And("user clicks on find your position button")
    public void userClicksOnFindYourPositionButton() {
        careersPage.findPositionBtn.click();
    }

    @Then("user should see all open positions based on his selections")
    public void userShouldSeeAllOpenPositionsBasedOnHisSelections() {
        System.out.println("careersPage.listOpenPositions.size() = " + careersPage.listOpenPositions.size());
        for(WebElement eachPosition : careersPage.listOpenPositions){
            if(!eachPosition.getText().isEmpty())
            System.out.println("eachPosition.getText() = " + eachPosition.getText());
        }

        assertTrue(careersPage.resultInfo.isDisplayed());


    }


}
