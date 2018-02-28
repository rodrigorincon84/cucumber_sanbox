package steps.impl.calculator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import org.apache.log4j.Logger;

import classes.Calculator;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorSteps{		
	public static Logger LOGGER = Logger.getLogger(CalculatorSteps.class);

	private Calculator calculator;
	
    @Before
    public void scenarioSetUp() {
		LOGGER.info("Ran before scenario");
		this.calculator = new Calculator();
    }
	
    @Given("^I have a calculator$")
    public void iHaveACalculator(){
    	LOGGER.info("Running iHaveACalculator step");
    	//MatcherAssert.assertThat(calculator, CoreMatchers.is(IsNull.notNullValue()));
    	assertThat(calculator, is(notNullValue()));
    }
 
    @When("^I add (\\d+) and (\\d+)$")
    public void iAddAnd(int arg1, int arg2){
    	LOGGER.info("Running iAddAnd step");
    	calculator.add(arg1, arg2);
    }
 
    @Then("^The result should be (\\d+)$")
    public void theResultShouldBe(int result){
    	LOGGER.info("Running theResultShouldBe step");
    	//Assert.assertEquals(result, calculator.getResult());
    	assertThat(result, equalTo(calculator.getResult()));
    }

}
