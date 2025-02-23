package com.davib.challenger_magalu.controller;

import com.davib.challenger_magalu.business.SchedulingService;
import com.davib.challenger_magalu.controller.dto.in.SchedulingRecord;
import com.davib.challenger_magalu.controller.dto.out.SchedulingRecordOut;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agendamento")
public class SchedulingController {
    private SchedulingService schedulingService;

    @PostMapping
    public ResponseEntity<SchedulingRecordOut> recordScheduling(@RequestBody SchedulingRecord scheduling) {
        return ResponseEntity.ok(schedulingService.recordScheduling(scheduling));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SchedulingRecordOut> findSchedulingById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(schedulingService.findSchedulingById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SchedulingRecordOut> cancelingScheduling(@PathVariable("id") Long id) {
        schedulingService.cancelingScheduling(id);
        return ResponseEntity.accepted().build();
    }
}


