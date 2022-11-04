Feature: User is able to delete id of the data

@DeleteById
Scenario: User wants to delete the id from database

When User is able to delete the id by using an api is "http://localhost:8080/productorders/12"
Then User validates the delete status code of id is 500