$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BasketPage.feature");
formatter.feature({
  "name": "Implement Basket Page",
  "description": "         -In order to see and possibly edit my order before I enter the checkout flow,\n         as a customer I should have access to a cart page.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "There will be merchandising content in the basket page",
  "description": "          (content. Ex: free shipping text)",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Basket Page as a guest user",
  "keyword": "When "
});
formatter.match({
  "location": "com.bloomingdales.step_definitions.BasketStepDefs.the_user_is_on_the_Basket_Page_as_a_guest_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to see the \"Free Shipping\" content in the Basket page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bloomingdales.step_definitions.BasketStepDefs.the_user_should_be_able_to_see_the_content_in_the_Basket_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});