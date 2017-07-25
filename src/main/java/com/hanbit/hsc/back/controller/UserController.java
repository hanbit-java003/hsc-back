package com.hanbit.hsc.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanbit.hsc.back.service.UserService;
import com.hanbit.hsc.back.vo.UserVO;
import com.hanbit.hsc.back.vo.VisitedVO;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public List<UserVO> getUsers() {
		return userService.getUsers();
	}
	
	@RequestMapping("/users/{id}")
	public List<VisitedVO> getVisited(@PathVariable("id") int id) {
		return userService.getVisited(id);
	}
	
}
