package org.example.infott2t;

import java.time.LocalDateTime;

public class WorkPlan {

    User user;
    Coperation coop;

    Long id;
    String name;            // 일의 이름
    LocalDateTime startWork; // 일 시작 시간
    LocalDateTime endWork;   // 일이 끝난 시간

    WorkInfo workInfo;  //일의 정보.

}
