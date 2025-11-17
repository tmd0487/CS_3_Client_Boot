package com.kedu.project.pregnancy_journal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/baby")
@RestController
public class PregnancyJournalController {
    @Autowired
    private PregnancyJournalService pregnancyJournalService;    
}
