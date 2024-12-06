package com.project.schedule.dto;

import com.project.schedule.domain.Schedule;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {
    private Long id;

    private String work;
    private String name;
    private String pw;
    private LocalDateTime createDate;

    private LocalDateTime patchDate;

    public ScheduleResponseDto(Schedule schedule) {
        this.id = schedule.getId();
        this.work = schedule.getWork();
        this.name = schedule.getName();
        this.pw = schedule.getPw();
        this.createDate = schedule.getCreateDate();
        this.patchDate = schedule.getPatchDate();
    }
}
