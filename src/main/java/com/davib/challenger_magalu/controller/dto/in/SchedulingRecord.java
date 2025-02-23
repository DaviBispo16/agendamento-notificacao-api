package com.davib.challenger_magalu.controller.dto.in;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record SchedulingRecord(String recipientEmail, String recipientPhone,
                               String message,
                               @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
                               LocalDateTime dateTimeShipping
                               ) {
}
