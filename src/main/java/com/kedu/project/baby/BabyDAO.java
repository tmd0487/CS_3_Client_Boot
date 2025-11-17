package com.kedu.project.baby;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BabyDAO {
    @Autowired
	private SqlSession mybatis;
}
