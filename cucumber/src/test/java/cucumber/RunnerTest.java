package cucumber;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
/*
 * @CucumberOptions
 * No needed because is already defined in mvn command
 */
public class RunnerTest {
	public static Logger LOGGER = Logger.getLogger(RunnerTest.class);
	
	@BeforeClass
	public static void featureSetup() {
		LOGGER.info("Ran before feature");
	}
	
	@AfterClass
	public static void featureTeardown() {
		LOGGER.info("Ran after feature");
	}

}
