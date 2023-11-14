Feature: Automate the Create Account'

    @SC-1
    Scenario: Navigate to Home page then click on Create Primary Account Button.
    User should navigate to Create Account form page validate Form Title as
    Expected “Create Primary Account Holder”
        When User clicks on Create Primary Account Button
        Then the form title should be "Create Primary Account Holder"

        @SC-2
        Scenario:On Create primary account holder form fill up the form and click on
        create Account Button Validate user navigate to Sing up your Account page and
        email address shows as expected
            Given   Click on the Create Primary Account Holder page
            When  Enter email address "Deniz1.Karam@gmail.com"
            And   Enter First Name"Deniz"
            And  Select Gender"Female"
            And Enter Employment Status"Internship"
            And Select Title "MS"
            And Enter Last Name"Karam"
            And Select Marital Status "Single"
            And Enter Date Of Birth"08/11/1999"
            And Click on the Create  Account
            Then Navigate The Email Address"Deniz1.Karam@gmail.com"

        @US_3
        Scenario: Create an account with existed email and validate the error
            Given   Click on the Create Primary Account Holder page
            When  Enter email address "Deniz1.Karam@gmail.com"
            And   Enter First Name"Deniz"
            And  Select Gender"Female"
            And Enter Employment Status"Internship"
            And Select Title "MS"
            And Enter Last Name"Karam"
            And Select Marital Status "Single"
            And Enter Date Of Birth"08/11/1999"
            And Click on the Create  Account
            Then The error message should be "ERROR"



