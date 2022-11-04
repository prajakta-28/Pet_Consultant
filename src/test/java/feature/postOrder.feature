Feature: User is able to place the order

Scenario: User is able to retrive data

Given User want to post the data in database
When User is able to post the data by using an api is "http://localhost:8080/productorders"
Then User validates the status code is 201


