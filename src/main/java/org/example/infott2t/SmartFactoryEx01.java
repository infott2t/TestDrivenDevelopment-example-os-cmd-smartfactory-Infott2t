package org.example.infott2t;

import java.time.LocalDateTime;

public class SmartFactoryEx01 {

    User user;
    Coperation coop;
    WorkPlan workPlan;

    public static void main(String[] args) {




        User user = new User(1L, "InfoTt2t");
        Coperation coop = new Coperation(1L, "ABC_Coop");

        //일의 정보....데이터..
        String str1; // 김치를 만드는 일입니다.
        String str2; // 안전하게 일합시다.

        WorkInfo workInfo = new WorkInfo(1L,"MakeKimchi","김치를 만드는 일입니다.", "안전하게 일합시다.");


        // WorkPlan(Long id, String name, LocalDateTime startWork, LocalDateTime endWork, User user, Coperation coop, WorkInfo workInfo ){
        String startTime= "YYYY-MM-DD HH:ss";
        String endTime = "YYYY-MM-DD HH:ss";

        new WorkPlan(1L,"Kimch_ABC_Coop_hyeonil",startTime, endTime,user, coop,workInfo);

    }
}
