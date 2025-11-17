package com.kedu.project.file_info;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FileDAO {
    @Autowired
	private SqlSession mybatis;    
}
