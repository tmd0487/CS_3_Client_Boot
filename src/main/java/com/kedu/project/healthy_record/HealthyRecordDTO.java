package com.kedu.project.healthy_record;

import java.security.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HealthyRecordDTO {
    private int record_seq; 
    private int baby_seq;
    private String user_id;
    private String test_code;
    private boolean is_checked;
    private Timestamp created_at;
}
