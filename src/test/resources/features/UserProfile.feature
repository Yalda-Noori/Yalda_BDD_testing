Feature: Automate The User Profile

    Background:Login to the UI insurance app
        Given  Click on the login Button
        When enter the username "supervisor"
        And  enter the password "tek_supervisor"
        And  click the Sign in button
         And  click on the profile button




    Scenario:Navigate to login and enter valid CSR credentials and navigate to Customer
    Service Portal then click on profile button validate information is in Profile Side
    Drawer is correct.


        Then  validate that the Status "Active"
        And validate that the User Type "CSR"
        And validate that the Name "Supervisor"
        And validate that the Username "supervisor"
        And validate that the Authorities "admin"

        @SC-2
        Scenario: Navigate to login and enter valid CSR credentials and navigate to Customer
        Service Portal then click on profile button and then click on Logout button make
        sure user navigate to home page


            Then the user clicks on the logout button






