Feature: Automate the Login page
    @SC-1
    Scenario: Login with valid CSR user
        Given  Click on the login Button
        When enter the username "supervisor"
        And  enter the password "tek_supervisor"
        And  click the Sign in button
        Then Validate The Title "TEK Insurance App"

        @SC-2
        Scenario: Navigate to login and enter wrong credentials and validate error
        message as expected Note both wrong username and wrong password should tested
           Given Click on the login Button
            When  enter wrong username  "supervisors"
           And   enter wrong  password "tek_supervisor123"
            And click the Sign in button
            Then should see an error message"ERROR"