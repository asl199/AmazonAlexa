$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("alexa.feature");
formatter.feature({
  "line": 1,
  "name": "Assert Alexa in the cart",
  "description": "",
  "id": "assert-alexa-in-the-cart",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Customer searches for \"Alexa\" and selects third option for purchase",
  "description": "",
  "id": "assert-alexa-in-the-cart;customer-searches-for-\"alexa\"-and-selects-third-option-for-purchase",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the user navigates to \"https://www.amazon.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "search for \"Alexa\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "navigate to the second page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "select the third item",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to add item to the cart",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.com",
      "offset": 23
    }
  ],
  "location": "AmazonAlexaSteps.the_user_navigates_to(String)"
});
formatter.result({
  "duration": 5202438666,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Alexa",
      "offset": 12
    }
  ],
  "location": "AmazonAlexaSteps.searches_for(String)"
});
formatter.result({
  "duration": 754107282,
  "status": "passed"
});
formatter.match({
  "location": "AmazonAlexaSteps.navigate_to_the_second_page()"
});
formatter.result({
  "duration": 2200977903,
  "status": "passed"
});
formatter.match({
  "location": "AmazonAlexaSteps.selects_the_third_item()"
});
formatter.result({
  "duration": 4459754953,
  "status": "passed"
});
formatter.match({
  "location": "AmazonAlexaSteps.user_should_be_able_to_add_it_to_the_cart()"
});
formatter.result({
  "duration": 1933863355,
  "status": "passed"
});
});