package com.project.schedule.controller;

import com.project.schedule.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ScheduledExecutorService;

@RestController
@RequestMapping("/Schedule")
public class ScheduleController {

//    속성
    private final ScheduleService scheduleService;
//    생성자
    public ScheduleController (ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }
//    기능
    @GetMapping
    public void getScheduleAPI() {
        System.out.println("스케줄 조회 API");
    }
}
