package com.hanbit.hsc.front.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.hsc.front.vo.UserVO;

@Repository
public class UserDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public List<UserVO> selectUsers() {
		return sqlSession.selectList("user.selectUsers");
	}
	
}
