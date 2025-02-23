package com.davib.challenger_magalu.controller.dto.out;

import com.davib.challenger_magalu.infrastructure.enums.StatusNotificationEnum;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record SchedulingRecordOut(Long Id,
                                  String recipientEmail, String recipientPhone,
                                  String message,
                                  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
                                  LocalDateTime dateTimeShipping,
                                  StatusNotificationEnum statusNotification) {
}
