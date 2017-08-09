package com.hanbit.hsc.back.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.hsc.back.admin.vo.AdminGroupVO;

@Repository
public class AdminDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public List<AdminGroupVO> selectContents() {
		return sqlSession.selectList("admin.selectContents");
	}
	
}
