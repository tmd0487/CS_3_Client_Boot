package com.kedu.project.healthy_record;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthyRecordService {
    @Autowired
    private HealthyRecordDAO dao;    
}
