package com.davib.challenger_magalu.business.mapper;

import com.davib.challenger_magalu.controller.dto.in.SchedulingRecord;
import com.davib.challenger_magalu.controller.dto.out.SchedulingRecordOut;
import com.davib.challenger_magalu.infrastructure.entities.Scheduling;
import org.mapstruct.Mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface ISchedulingMapper {
    Scheduling forEntity (SchedulingRecord scheduling);

    SchedulingRecordOut forOut (Scheduling scheduling);
}
