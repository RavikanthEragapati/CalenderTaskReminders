# CalenderTaskReminders
Building API's to create tasks and set reminder such that an email/sms/notification can be sent


# Swagger docs:
OpenAPI v3 URL: http://localhost:8080/v3/api-docs
SwaggerUI URL : http://localhost:8080/swagger-ui.html OR http://localhost:8080/webjars/swagger-ui/index.html

# Basepath
/api/reminder/schedule

# List of Endpoint
1. GET      /api/reminder/schedule  retrieveScheduledReminders
2. POST     /api/reminder/schedule  scheduleNewReminder
3. PUT      /api/reminder/schedule  updateExistingReminderSchedule
4. DELETE   /api/reminder/schedule  unscheduledReminder