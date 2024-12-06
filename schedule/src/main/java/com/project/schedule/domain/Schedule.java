package com.project.schedule.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Schedule {

    //속성
//    - [ ]  `할일`, `작성자명`, `비밀번호`, `작성/수정일`을 저장
//    - [ ]  `작성/수정일`은 날짜와 시간을 모두 포함한 형태
    @Setter
    private Long id;

    private String work;
    private String name;
    private String pw;
    private LocalDateTime createDate;

    @Setter
    private LocalDateTime patchDate;

    //생성자
    public Schedule(String work, String name, String pw) {
        this.work = work;
        this.name = name;
        this.pw = pw;
        this.createDate = LocalDateTime.now();
        this.patchDate = this.createDate;
    }
}
