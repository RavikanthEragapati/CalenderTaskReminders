package com.rav.task.reminder.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;

@Data
@Builder
public class ScheduleResponse implements java.io.Serializable {

    @Serial
    private static final long serialVersionUID = -7023654163490885018L;

    private String status;
}
