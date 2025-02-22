package com.davib.challenger_magalu.controller.dto;

import com.davib.challenger_magalu.business.SchedulingService;
import com.davib.challenger_magalu.controller.dto.in.SchedulingRecord;
import com.davib.challenger_magalu.controller.dto.out.SchedulingRecordOut;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agendamento")
public class SchedulingController {
    private SchedulingService schedulingService;
    public ResponseEntity<SchedulingRecordOut> recordScheduling(@RequestBody SchedulingRecord scheduling) {
        return ResponseEntity.ok(schedulingService.recordScheduling(scheduling));
    }
}
