package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverClass;

import java.time.LocalDateTime;

public class Hooks {

    @Before
    public void beforeScenario() {
        System.out.println("Scenario has started.");

    }

    @After
    public void afterScenario(){
        System.out.println("Scenario has ended.");
        DriverClass.quitDriver();
    }

}
