package com.kedu.project.file_info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("")
@RestController
public class FileControoler {
    @Autowired
    private FileService fileService;    
}
