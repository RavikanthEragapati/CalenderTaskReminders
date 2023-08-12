package com.rav.task.reminder.model;

import lombok.*;
import org.quartz.CronExpression;

import java.io.Serial;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Data
@Builder
public class ScheduleRequest implements java.io.Serializable {

    @Serial
    private static final long serialVersionUID = -6542389881065935983L;

    private ZoneId zoneId;
    private LocalDateTime dateTime;
    private CronExpression cronExpression;

    private String correlationId;
}
