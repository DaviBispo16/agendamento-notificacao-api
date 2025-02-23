package com.davib.challenger_magalu.infrastructure.entities;

import com.davib.challenger_magalu.infrastructure.enums.StatusNotificationEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name="schedulings")
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Scheduling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String recipientEmail;
    private String recipientPhone;
    private LocalDateTime dateTimeShipping;
    private LocalDateTime dateTimeScheduling;
    private LocalDateTime dateTimeModification;
    private String message;
    private StatusNotificationEnum statusNotification;

    @PrePersist
    private void prePersist() {
        dateTimeScheduling = LocalDateTime.now();
        statusNotification = StatusNotificationEnum.SCHEDULED;
    }
}
