package com.kedu.project.pregnancy_journal;

import java.security.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PregnancyJournalDTO {
    private int journal_seq;
    private int baby_seq;
    private String user_id;
    private int pregnancy_week;
    private Timestamp record_datetime;
    private String title;
    private String content;
    private Timestamp created_at;
    private Timestamp updated_at; 
}
 