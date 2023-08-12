package com.rav.task.reminder.api;

import com.rav.task.reminder.model.ScheduleRequest;
import com.rav.task.reminder.model.ScheduleResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/reminder/schedule",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE)
public class ReminderController {

    @GetMapping
    public ResponseEntity<ScheduleResponse> retrieveScheduledReminders(@RequestBody ScheduleRequest request){
        return ResponseEntity.ok(ScheduleResponse.builder().build());
    }

    @PostMapping
    public ResponseEntity<ScheduleResponse> scheduleNewReminder(@RequestBody ScheduleRequest request){
        return ResponseEntity.ok(ScheduleResponse.builder().build());
    }

    @PutMapping
    public ResponseEntity<ScheduleResponse> updateExistingReminderSchedule(@RequestBody ScheduleRequest request){
        return ResponseEntity.ok(ScheduleResponse.builder().build());

    }

    @DeleteMapping
    public ResponseEntity<ScheduleResponse> unscheduledReminder(@RequestBody ScheduleRequest request){
        return ResponseEntity.ok(ScheduleResponse.builder().build());

    }
}
