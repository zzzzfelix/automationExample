package stepdef;

import common.BrowerDriver;
import common.BrowserCommand;
import common.ValidateCommand;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data.EventList;
import org.openqa.selenium.By;
import page.EventPage;

public class buyTicketSteps {
    private final String BASEURL = "http://www1.ticketmaster.com/event/";

    @Before
    public void setup() {
        BrowerDriver.newSession();
    }

    @Given("^I'm at (.*) page$")
    public void launchEventPage(String eventType) {
        String URL = BASEURL + EventList.getEventMapping().get(eventType);
        BrowerDriver.goToURL(URL);
    }

    @When("^I click on 1st item$")
    public void clickItem() {
        By quickPickItem = EventPage.getListItem(1);
        BrowserCommand.click(quickPickItem);
    }

    @Then("^I can see ticket detail panel$")
    public void validateTicketPanel() {
        String ticketInfo = BrowserCommand.getElementValue(EventPage.getTicketInfo());
        ValidateCommand.elementExist(ticketInfo);
    }

    @After
    public void cleanUp() {
        BrowerDriver.closeSession();
    }
}
