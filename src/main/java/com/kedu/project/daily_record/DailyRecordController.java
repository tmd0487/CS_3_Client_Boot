package com.kedu.project.daily_record;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("")
@RestController
public class DailyRecordController {
    @Autowired
    private DailyRecordService dailyRecordService;    
}
