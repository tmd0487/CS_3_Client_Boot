package com.kedu.project.daily_record;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DailyRecordDAO {
    @Autowired
	private SqlSession mybatis;    
}
