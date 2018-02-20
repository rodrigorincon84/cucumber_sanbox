package steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import classes.Calculator;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorSteps {
		
	private Calculator calculator;

	
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    
    @Given("^I have a calculator$")
    public void iHaveACalculator(){
    	//MatcherAssert.assertThat(calculator, CoreMatchers.is(IsNull.notNullValue()));
    	assertThat(calculator, is(notNullValue()));
    }
 
    @When("^I add (\\d+) and (\\d+)$")
    public void iAddAnd(int arg1, int arg2){
        calculator.add(arg1, arg2);
    }
 
    @Then("^The result should be (\\d+)$")
    public void theResultShouldBe(int result){
    	//Assert.assertEquals(result, calculator.getResult());
    	assertThat(result, equalTo(calculator.getResult()));
    }

}
