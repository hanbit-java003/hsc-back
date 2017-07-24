package com.hanbit.hsc.back.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.hsc.back.vo.ContentsVO;
import com.hanbit.hsc.back.vo.SubmenuVO;

@Repository
public class ContentsDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public ContentsVO selectContents(String id) {
		return sqlSession.selectOne("contents.selectContents", id);
	}
	
	public List<SubmenuVO> selectSubmenu(String id) {
		return sqlSession.selectList("contents.selectSubmenu", id);
	}
	
}
