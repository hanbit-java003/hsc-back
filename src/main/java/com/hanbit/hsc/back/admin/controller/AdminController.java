package com.hanbit.hsc.back.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanbit.hsc.back.admin.service.AdminService;
import com.hanbit.hsc.back.admin.vo.AdminGroupVO;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/group")
	public List<AdminGroupVO> getContents() {
		return adminService.getContents();
	}
	
}
