package tests;

import org.junit.jupiter.api.Test;

public class First extends TestBase {

    @Test
    public void firstTest() {
        page.goTo().chooseTask("1");
        taskOne.checkPageIsCorrect();
    }
}
