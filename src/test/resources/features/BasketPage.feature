Feature: Implement Basket Page
         -In order to see and possibly edit my order before I enter the checkout flow,
         as a customer I should have access to a cart page.

   # This scenario might be implemented by manual testing
  Scenario: Basket is styled according to attached design
    When the user is on the Home Page as a guest user
    And the user clicks on the Bag Logo icon on the top left corner
    Then the user should able to navigate his or her Bag page

  Scenario: Users should be able to edit amount and remove products from basket page.
    When the user is on the Basket Page as a guest user
    And the user should see the Basket is empty
    And the user clicks on any product on the Basket page
    And the user adds that product to Basket
    Then the user should be able see the message "Item Successfully Added"
    When the user removes one product from the Basket
    Then the user should be able to remove the product successfully
  @wip
  Scenario:There will be merchandising content in the basket page
          (content. Ex: free shipping text)
    When the user is on the Basket Page as a guest user
    Then the user should be able to see the "Free Shipping" content in the Basket page

  Scenario:If the user adds products as a guest user, then logs in to website, baskets should be merged.
    When the user is on the Basket Page as a guest user
    And the user should see the Basket is empty
    And the user clicks on any product on the Basket page
    And the user adds that product to Basket
    Then the user should be able see the message "Item Successfully Added"
    And the user clicks on the User Avatar to sign in
    And the user enters the valid credentials as "email" and "password"
    And The user clicks on the Sign In button and logs in
    Then the user should see the same product (added as a quest user) in the Basket
