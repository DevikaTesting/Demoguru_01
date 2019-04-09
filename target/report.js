$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/AddTariff.feature");
formatter.feature({
  "name": "To test add tariff plan functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Add tariff details and get message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is in add tariff plan page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariffSteps.the_user_is_in_add_tariff_plan_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User type the form details",
  "rows": [
    {
      "cells": [
        "100",
        "200",
        "300",
        "400",
        "500",
        "600",
        "700"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffSteps.the_User_type_the_form_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the sumit button",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffSteps.click_the_sumit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should see the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffSteps.the_user_should_see_the_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "insert no values in fields and get alert",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is in add tariff plan page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariffSteps.the_user_is_in_add_tariff_plan_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the submit button",
  "keyword": "When "
});
formatter.match({
  "location": "TariffAlert.click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees alert message",
  "keyword": "Then "
});
formatter.match({
  "location": "TariffAlert.the_user_sees_alert_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "the user see successful validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is in add tariff plan page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariffSteps.the_user_is_in_add_tariff_plan_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fill the fields with invalid data",
  "rows": [
    {
      "cells": [
        "abc",
        "abc",
        "abc",
        "abc",
        "abc",
        "abc",
        "abc"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TariffInvalid.user_fill_the_fields_with_invalid_data(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user see invalid input labels",
  "keyword": "Then "
});
formatter.match({
  "location": "TariffInvalid.the_user_see_invalid_input_labels()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});