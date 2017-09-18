package com.hanbit.hsc.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.hsc.back.dao.CountryDAO;
import com.hanbit.hsc.back.vo.CountryVO;

@Service
public class CountryService {

	@Autowired
	private CountryDAO countryDAO;

	public CountryVO getCountry(String id) {
		return countryDAO.selectCountry(id);
	}

}
