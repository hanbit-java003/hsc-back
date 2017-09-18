package com.hanbit.hsc.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanbit.hsc.back.service.CountryService;
import com.hanbit.hsc.back.vo.CountryVO;

@RestController
@RequestMapping("/api/country")
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@RequestMapping("/{id}")
	public CountryVO getCountry(@PathVariable("id") String id) {
		return countryService.getCountry(id);
	}

}
