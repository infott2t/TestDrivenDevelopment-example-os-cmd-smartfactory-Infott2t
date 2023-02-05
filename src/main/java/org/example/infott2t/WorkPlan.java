package org.example.infott2t;

import java.time.LocalDateTime;

public class WorkPlan {

    Long id;
    String name;            // 일의 이름
    String startWork; // 일 시작 시간
    String endWork;   // 일이 끝난 시간

    User user;
    Coperation coop;
    WorkInfo workInfo;  //일의 정보.

    WorkPlan(Long id, String name, String startWork, String endWork, User user, Coperation coop, WorkInfo workInfo ){
        this.id = id;
        this.name = name;
        this.startWork = startWork;
        this.endWork = endWork;

        this.user = user;
        this.coop = coop;
        this.workInfo = workInfo;
    }

}
