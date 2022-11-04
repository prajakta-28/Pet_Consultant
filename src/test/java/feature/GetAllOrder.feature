Feature: User is able fetch the data

@Getbyall
Scenario: User wants to retrive the data from database

When User is able to retrive the data by using an api is "http://localhost:8080/productorders"
Then User is validates the status code is 200
