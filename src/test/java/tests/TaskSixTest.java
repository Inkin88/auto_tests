package tests;

import org.junit.jupiter.api.Test;

class TaskSixTest extends TestBase {

    @Test
    public void firstTest() {
        page.goTo().chooseTask("6");
        taskSix.fillInLogin("tester")
                .fillInPassword("123-xyz")
                .loginButtonClick()
                .isLoginCorrect();
    }
}