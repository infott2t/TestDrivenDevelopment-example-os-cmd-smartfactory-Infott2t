package org.example.infott2t;

public class WorkInfo {

    Long id;
    String name;

    //일의 정보....데이터..
    String str1; // 김치를 만드는 일입니다.
    String str2; // 안전하게 일합시다.

    public WorkInfo(Long id, String name, String str1, String str2) {
        this.id = id;
        this.name = name;
        this.str1 = str1;
        this.str2 = str2;
    }
}
