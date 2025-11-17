package com.kedu.project.healthy_record;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HealthyRecordDAO {
    @Autowired
    private SqlSession mybatis;
}
