package com.kedu.project.baby;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BabyService {
    @Autowired
    private BabyDAO dao;
}
