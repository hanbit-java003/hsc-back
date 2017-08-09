package com.hanbit.hsc.back.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.hsc.back.admin.dao.AdminDAO;
import com.hanbit.hsc.back.admin.vo.AdminGroupVO;

@Service
public class AdminService {

	@Autowired
	private AdminDAO adminDAO;
	
	public List<AdminGroupVO> getContents() {
		return adminDAO.selectContents();
	}
	
}
