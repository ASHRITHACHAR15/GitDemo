Feature: Search and place the order for the products
@searchProduct
Scenario Outline: Search experience for product search in both home page and offers page

Given User is landed on GreenKart website homepage
When User searched with short name <Name> and extracted actual name of product
Then User searched for same name <Name> in the offers page to check if product exist

Examples:
|Name|
|Tom |
|Beet|




