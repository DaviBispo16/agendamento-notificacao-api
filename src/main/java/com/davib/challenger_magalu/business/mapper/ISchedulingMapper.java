package com.davib.challenger_magalu.business.mapper;

import com.davib.challenger_magalu.controller.dto.in.SchedulingRecord;
import com.davib.challenger_magalu.controller.dto.out.SchedulingRecordOut;
import com.davib.challenger_magalu.infrastructure.entities.Scheduling;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface ISchedulingMapper {
    Scheduling forEntity (SchedulingRecord scheduling);

    SchedulingRecordOut forOut (Scheduling scheduling);

    @Mapping(target="dateTimeModification", expression = "java(LocalDateTime.now())")
    @Mapping(target="statusNotification", expression = "java(StatusNotificationEnum.CANCELLED")
    Scheduling forEntityCancelled(Scheduling scheduling);
}
