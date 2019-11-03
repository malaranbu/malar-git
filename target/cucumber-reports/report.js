$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("britishairways registration.feature");
formatter.feature({
  "line": 2,
  "name": "british airways registration",
  "description": "",
  "id": "british-airways-registration",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@britishTest"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "british Airways registrationby filling all the mandatiry fields with registered user",
  "description": "",
  "id": "british-airways-registration;british-airways-registrationby-filling-all-the-mandatiry-fields-with-registered-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "launch british airways url \"https://britishairways.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on the Registration link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "check for the registration page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "enter the email id \"malar.cse@gmail.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "confirm the email id \"malar.cse@gmail.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "enter the password \"v1n0thm@l@r\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "confirm the same \"v1n0thm@l@r\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Select the title \"Mr\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "enter the first name",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter the last name",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "click on \"Register with BA\" Radio button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Click on Join Now button",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Check for user already exist message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://britishairways.com",
      "offset": 28
    }
  ],
  "location": "britishAirwayssteps.launch_british_airways_url(String)"
});
formatter.result({
  "duration": 15643720600,
  "status": "passed"
});
formatter.match({
  "location": "britishAirwayssteps.click_on_the_Registration_link()"
});
formatter.result({
  "duration": 5712005100,
  "status": "passed"
});
formatter.match({
  "location": "britishAirwayssteps.check_for_the_registration_page_is_opened()"
});
formatter.result({
  "duration": 6332100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "malar.cse@gmail.com",
      "offset": 20
    }
  ],
  "location": "britishAirwayssteps.enter_the_email_id(String)"
});
formatter.result({
  "duration": 141125900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "malar.cse@gmail.com",
      "offset": 22
    }
  ],
  "location": "britishAirwayssteps.confirm_the_email_id(String)"
});
formatter.result({
  "duration": 91740800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "v1n0thm@l@r",
      "offset": 20
    }
  ],
  "location": "britishAirwayssteps.enter_the_password(String)"
});
formatter.result({
  "duration": 93843500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "v1n0thm@l@r",
      "offset": 18
    }
  ],
  "location": "britishAirwayssteps.confirm_the_same(String)"
});
formatter.result({
  "duration": 233436700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mr",
      "offset": 18
    }
  ],
  "location": "britishAirwayssteps.select_the_title(String)"
});
formatter.result({
  "duration": 335065300,
  "status": "passed"
});
formatter.match({
  "location": "britishAirwayssteps.enter_the_first_name()"
});
formatter.result({
  "duration": 51150500,
  "status": "passed"
});
formatter.match({
  "location": "britishAirwayssteps.enter_the_last_name()"
});
formatter.result({
  "duration": 57536100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register with BA",
      "offset": 10
    }
  ],
  "location": "britishAirwayssteps.click_on_Radio_button(String)"
});
formatter.result({
  "duration": 292699600,
  "status": "passed"
});
formatter.match({
  "location": "britishAirwayssteps.click_on_Join_Now_button()"
});
formatter.result({
  "duration": 1827269300,
  "status": "passed"
});
formatter.match({
  "location": "britishAirwayssteps.check_for_Hello_Malarvizhi_welcome_to_BA_page_is_opened()"
});
formatter.result({
  "duration": 89526900,
  "status": "passed"
});
});