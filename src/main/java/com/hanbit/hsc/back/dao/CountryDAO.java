package com.hanbit.hsc.back.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.hsc.back.vo.CountryVO;

@Repository
public class CountryDAO {

	@Autowired
	private SqlSession sqlSession;

	public CountryVO selectCountry(String id) {
		return sqlSession.selectOne("country.selectCountry", id);
	}

}
