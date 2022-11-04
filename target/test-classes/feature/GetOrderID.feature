Feature: User is able fetch the data by id

@Getbyid
Scenario: User wants to retrive the data from database by id

When User is able to retrive the data by id using an api is "http://localhost:8080/productorders/5"
Then User validates id the status code is 200