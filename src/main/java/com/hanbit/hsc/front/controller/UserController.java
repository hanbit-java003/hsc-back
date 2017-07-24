package com.hanbit.hsc.front.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanbit.hsc.front.service.UserService;
import com.hanbit.hsc.front.vo.UserVO;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public List<UserVO> getUsers() {
		return userService.getUsers();
	}
	
}
