package com.kedu.project.file_info;

import java.security.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FileDTO {
    private int file_seq;
    private String user_id;
    private String oriname; 
    private String sysname;
    private String target_type;
    private int target_seq; 
    private Timestamp created_at;
    
}