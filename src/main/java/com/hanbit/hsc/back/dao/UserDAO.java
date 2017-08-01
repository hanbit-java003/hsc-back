package com.hanbit.hsc.back.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.hsc.back.vo.SubmenuVO;
import com.hanbit.hsc.back.vo.UserVO;
import com.hanbit.hsc.back.vo.VisitedVO;

@Repository
public class UserDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public List<UserVO> selectUsers() {
		return sqlSession.selectList("user.selectUsers");
	}
	
	public List<VisitedVO> selectVisited(int id) {
		return sqlSession.selectList("user.selectVisited", id);
	}
	
	public UserVO selectUser(String no) {
		return sqlSession.selectOne("user.selectUser", no);
	}
	
	public List<SubmenuVO> selectSubmenu(String no) {
		return sqlSession.selectList("user.selectSubmenu", no);
	}
	
}
