Feature: Assignment 1

Scenario Outline: verify borrowing power
When user open url as "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/"
When user clicks on Application type as "<app type>"
And user selects no of dependncis "<noOfDepen>"
And user click on properity "<propType>"
When user enters ammount for annual income as"<annIncome>"
And user enters ammount for other income as "<Oincome>"
When user enters ammount for living expence as "<LivingExpence>"
And user enters ammount for home loan payments as "<homeLoanPayments>"
And user enters ammount for other loan payments as "<loanPayments>"
And user enters ammount for other commitments as "<othCommitments>"
And user enters ammount for card limit as "<cardLimits>"
When user clicks on calculate
Then estimation should be "<estimate>"
When user clicks starts over
Then all fileds should be cleared
Examples:
|app type	|noOfDepen	|propType									|annIncome|Oincome|LivingExpence|homeLoanPayments	|loanPayments	|othCommitments	|cardLimits	|estimate	|
|Single		|0					|buying a home to live in	|80000		|10000	|500					|0								|	100					|0							|10000			| 479000	|



Scenario: verify borrowing power with annual zero income
When user open url as "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/"
When user clicks on Application type as "Single"
And user selects no of dependncis "0"
And user click on properity "buying a home to live in"
And user enters ammount for annual income as"0"
When user clicks on calculate
Then user should see error message as "on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 100 641."
