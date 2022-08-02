Feature: Hotel Booking Application
Scenario: User Login
Given launch Url
When user Enter The Username In The "durgakumar" Field
And user Enter The Password In The "O1717K" Field
Then user click The Login Page In Navigate To Next Web Page On Serarch Hotel

Scenario: User Search The Select Hotel Page And Give Other Details 
When user Select The Location
And user Select Hotel
And user Select Room Type
And user Select Number Of Room
And user Enter The Check In Date
And user Enter The Check Out Date
And user Select Adults Per Room
And user Select Children Per Room
Then user Click The Search Button And Navigate to  Select Hotel

Scenario: User Select Hotel
When user Click Radio Button
Then user Click The Continue Button In Navigate To Book A Hotel

Scenario: User Select A Hotel
When user Enter The First Name In The Field
And user Enter The Last Name In The Field
And user Enter The Billind Address In The Field
And user Enter The Credit Card no In The "2233445566778899" No Field
And user Select Credit Card Type
And user Select Expire Date For Select Month
And user Select Expire Date For Select Year
And user Enter The VCC  Number "2345" Field
Then User Click The Book Now Button And Navigate To Booking Confirmation

Scenario: User Logout
When user Click The Logout Button


 

