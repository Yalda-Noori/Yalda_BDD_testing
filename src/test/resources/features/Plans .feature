Feature: Validate Plans elements


    Background:Login to the UI insurance app
        Given  Click on the login Button
        When enter the username "supervisor"
        And  enter the password "tek_supervisor"
        And  click the Sign in button
        And  click on the profile button



    @SC_1
    Scenario: validate 4 row of data is present in plans page
        Then click on Plans
        Then validate plans section title as "Today's Plans Price"
        Then validate plan table headers
            | PLAN TYPE | PLANE BASE PRICE | DATE CREATED | DATE EXPIRE |
        Then validate data of 4 rows

        @SC-2
        Scenario: Validate Create Date is today's date in (EST Time zone) and
        Date Expire is a day after (EST Time Zone)

            Then  validate that Create Date is today's date in (EST Time zone)
            And  validate that Date Expire is a day after (EST Time Zone)
