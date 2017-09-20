package com.hanbit.hsc.back.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.hsc.back.vo.DiaryVO;
import com.hanbit.hsc.back.vo.MemberVO;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public int insertMember(MemberVO memberVO) {
		return sqlSession.insert("member.insertMember", memberVO);
	}
	
	public int countMember(String email) {
		return sqlSession.selectOne("member.countMember", email);
	}
	
	public MemberVO selectMember(String email) {
		return sqlSession.selectOne("member.selectMember", email);
	}
	
	public MemberVO selectMemberDetail(String uid) {
		return sqlSession.selectOne("member.selectMemberDetail", uid);
	}
	
	public MemberVO selectUser(String id) {
		return sqlSession.selectOne("member.selectUser", id);
	}
	
	public List<DiaryVO> selectDiary(String id) {
		return sqlSession.selectList("member.selectDiary", id);
	}
	
	public List<MemberVO> selectMembers() {
		return sqlSession.selectList("member.selectMembers");
	}
	
}
