package com.kedu.project.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/baby")
@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;    
}
