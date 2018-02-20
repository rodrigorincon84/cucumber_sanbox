$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/Calculator.feature");
formatter.feature({
  "name": "This is a sample feature",
  "description": "  I want to use this feature for test, and this should be a better description",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag_feature"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag_feature"
    },
    {
      "name": "@tag_scenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.match({
  "location": "CalculatorSteps.iHaveACalculator()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add 1 and 2",
  "keyword": "When "
});
formatter.match({
  "location": "CalculatorSteps.iAddAnd(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The result should be 3",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.theResultShouldBe(int)"
});
formatter.result({
  "status": "passed"
});
});