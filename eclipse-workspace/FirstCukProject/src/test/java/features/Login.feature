Feature:  Application login
Background:
Given Validate the browser
When Browser is triggered
Then Check  if browser triggered

@SmokeTest
Scenario: login test cases
Given User enters into landing page
When User enters user name "Vijay" and password "Mydream"
Then Application logged in successfully
And User logged in displayed "true"

@SmokeTest
 Scenario: login test cases
Given User enters into landing page
When User enters user name "Devsai" and password "Imadoctor"
Then Application logged in successfully
And User logged in displayed "false"

@WebTest
 Scenario: login test cases
Given User enters into landing page
When User singup with following details
| vijay | Subramanian | TechMahindra | ST LOUIS | missouri | 63043 | USA |
Then Application logged in successfully
And User logged in displayed "false"

@RegTest
Scenario Outline: login test cases
Given User enters into landing page
When User login into  Application with <Username> and <Password>
Then Application logged in successfully
And User logged in displayed "true"

Examples:
| Username | Password |
| user1    | Pass1    |
| user2    | Pass2    |
| user3    | Pass3    |
| user4    | Pass4    |

