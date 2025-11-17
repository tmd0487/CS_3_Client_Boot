package com.kedu.project.pregnancy_journal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PregnancyJournalService {
    @Autowired
    private PregnancyJournalDAO dao;
}
