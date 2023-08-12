$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/Salesforce_login.feature");
formatter.feature({
  "name": "This feature will be used to test the login functionlity of simplilearn",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.SalesforceStepDefinition.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the login failure using parameters",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter username as \"prathiba.sankararaj@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.SalesforceStepDefinition.i_enter_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password as \"Test_1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.SalesforceStepDefinition.i_enter_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.SalesforceStepDefinition.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to see the Home page.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.SalesforceStepDefinition.i_should_be_able_to_see_the_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});