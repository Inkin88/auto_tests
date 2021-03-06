package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.TestBase;

public class StepsDefinition extends TestBase {
    @Before
    public void initialization() {
        start();
    }

    @After
    public void teardown() {
        finish();
    }

    @Given("I go to main page")
    public void iGoToMainPage() {
        page.goTo();
    }

    @When("I select {string} task")
    public void iSelectTask(String taskNumber) {
        page.chooseTask(taskNumber);
    }

    @And("I login as {string} with password {string}")
    public void iLoginAsWithPassword(String login, String password) {
        taskSix.fillInLogin(login)
                .fillInPassword(password)
                .loginButtonClick();
    }

    @Then("I should (see|not see) the link to download file$")
    public void iShouldSeeTheLinkToDownloadFile(String visibility) {
        if (visibility.equals("see")) {
            taskSix.isLoginCorrect();
        } else {
            taskSix.isLoginWrong();
        }
    }
}
