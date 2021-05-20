Feature: Hotel Booking In Adactin Application
#Background


@smokeTest
Scenario Outline: 
Given user Launch The Application
When user Enter "<Username>" In Username Field
And user Enter "<Password>" In Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page

Examples:
|Username|Password|
|AAA|1234|
|BBB|623821|
|iquii2711|aashif9962|


@sanityTest
Scenario:
When user Select The Location Of Hotel
And user Select The Hotel
And  user Select Room Type
And user Select Number Of Rooms
And user Enter The Check-In Date In The Field
And user Enter The Check-Out Date In The Field
And user Select The Number Of Rooms For Adult
And user Select The Number Of Rooms For Child
Then user Click The Search Button And It Navigates To Select Page

@sanityTest
Scenario:
When user Confirm The Selected Hotel
Then user Click On Continue Button And Navigates To Book A Hotel Page

@sanityTest
Scenario:
When user Enter The FirstName In Desired Field
And user Enter The LastName In Desired Field
And user Enter The Address
And user Enter The Credit Card Number
And user Select Cc Type
And user Select the Expiry Month Of Cc 
And user Select the Expiry Year Of CC
And user Enter The Cvv Number
Then user Click On BookNow Button And Navigates To Confirmation Page

@regressionTest
Scenario:
When user Click On Booked Itinerary Navigates To Bookings Page
