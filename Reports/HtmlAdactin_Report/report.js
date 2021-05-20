$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 2,
      "value": "#Background"
    }
  ],
  "line": 6,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;;;1"
    },
    {
      "cells": [
        "AAA",
        "1234"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;;;2"
    },
    {
      "cells": [
        "BBB",
        "623821"
      ],
      "line": 15,
      "id": "hotel-booking-in-adactin-application;;;3"
    },
    {
      "cells": [
        "iquii2711",
        "aashif9962"
      ],
      "line": 16,
      "id": "hotel-booking-in-adactin-application;;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter \"AAA\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter \"1234\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 1942998700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Username_Field(String)"
});
formatter.result({
  "duration": 120373400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Password_Field(String)"
});
formatter.result({
  "duration": 58605700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 266766900,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter \"BBB\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter \"623821\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 200702700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BBB",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Username_Field(String)"
});
formatter.result({
  "duration": 62514700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "623821",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Password_Field(String)"
});
formatter.result({
  "duration": 61261200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 254433600,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter \"iquii2711\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter \"aashif9962\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 202354000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iquii2711",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Username_Field(String)"
});
formatter.result({
  "duration": 65589200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aashif9962",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Password_Field(String)"
});
formatter.result({
  "duration": 55809100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 541075600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user Select The Location Of Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user Select The Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Enter The Check-In Date In The Field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Enter The Check-Out Date In The Field",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Select The Number Of Rooms For Adult",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Select The Number Of Rooms For Child",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Click The Search Button And It Navigates To Select Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location_Of_Hotel()"
});
formatter.result({
  "duration": 99079900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel()"
});
formatter.result({
  "duration": 95644400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Room_Type()"
});
formatter.result({
  "duration": 79005200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Number_Of_Rooms()"
});
formatter.result({
  "duration": 81851800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_In_Date_In_The_Field()"
});
formatter.result({
  "duration": 102339300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_Out_Date_In_The_Field()"
});
formatter.result({
  "duration": 95699600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms_For_Adult()"
});
formatter.result({
  "duration": 84451700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms_For_Child()"
});
formatter.result({
  "duration": 76395600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Search_Button_And_It_Navigates_To_Select_Page()"
});
formatter.result({
  "duration": 386209800,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "user Confirm The Selected Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user Click On Continue Button And Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Confirm_The_Selected_Hotel()"
});
formatter.result({
  "duration": 200463100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Continue_Button_And_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 438893700,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "user Enter The FirstName In Desired Field",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "user Enter The LastName In Desired Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enter The Address",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Enter The Credit Card Number",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Select Cc Type",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Select the Expiry Month Of Cc",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Select the Expiry Year Of CC",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user Enter The Cvv Number",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user Click On BookNow Button And Navigates To Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_FirstName_In_Desired_Field()"
});
formatter.result({
  "duration": 67196900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_LastName_In_Desired_Field()"
});
formatter.result({
  "duration": 57342600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Address()"
});
formatter.result({
  "duration": 76495900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_Number()"
});
formatter.result({
  "duration": 77334200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Cc_Type()"
});
formatter.result({
  "duration": 82529100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Expiry_Month_Of_Cc()"
});
formatter.result({
  "duration": 80337400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Expiry_Year_Of_CC()"
});
formatter.result({
  "duration": 74666200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Cvv_Number()"
});
formatter.result({
  "duration": 52510900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_BookNow_Button_And_Navigates_To_Confirmation_Page()"
});
formatter.result({
  "duration": 7054281000,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@regressionTest"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "user Click On Booked Itinerary Navigates To Bookings Page",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Booked_Itinerary_Navigates_To_Bookings_Page()"
});
formatter.result({
  "duration": 811466000,
  "status": "passed"
});
});