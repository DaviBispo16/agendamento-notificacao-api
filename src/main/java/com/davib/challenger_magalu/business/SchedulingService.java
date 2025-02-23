package com.davib.challenger_magalu.business;

import com.davib.challenger_magalu.business.mapper.ISchedulingMapper;
import com.davib.challenger_magalu.controller.dto.in.SchedulingRecord;
import com.davib.challenger_magalu.controller.dto.out.SchedulingRecordOut;
import com.davib.challenger_magalu.infrastructure.exception.NotFoundException;
import com.davib.challenger_magalu.infrastructure.repository.SchedulingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SchedulingService {
    private SchedulingRepository repository;
    private ISchedulingMapper schedulingMapper;

    public SchedulingRecordOut recordScheduling(SchedulingRecord scheduling){
        return schedulingMapper.forOut(
                repository.save(schedulingMapper.forEntity(scheduling)));
    }

    public SchedulingRecordOut findSchedulingById(Long id) {
        return schedulingMapper.forOut(repository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID não encontrado")));
    }


}
