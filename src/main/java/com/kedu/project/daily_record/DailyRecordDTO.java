package com.kedu.project.daily_record;

import java.security.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DailyRecordDTO {
    /*
        하루기록 DTO
    */    
    private int record_seq; 
    private int baby_seq;
    private String user_id;
    private String record_type; // 기록 종류
    private Timestamp start_datetime; // 시작 시간
    private Timestamp end_datetime; // 종료 시간
    private int amount_value; // 양 또는 횟수
    private int duration_minutes; // 지속 시간 ( 분 )
    // private Json detail_json; //  복합 상세 속성
    private String detail_json; //  복합 상세 속성
    private Timestamp created_at; // 생성 날짜
    private Timestamp updated_at; // 수정 날짜
}
