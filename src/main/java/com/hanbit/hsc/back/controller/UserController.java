package com.hanbit.hsc.back.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hanbit.hsc.back.service.UserService;
import com.hanbit.hsc.back.vo.SubmenuVO;
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
	
	@RequestMapping("/user/{no}")
	public UserVO getUser(@PathVariable("no") String no) {
		return userService.getUser(no);
	}
	
	@RequestMapping("/user/like/{id}")
	public Map increaseLikeCount(@PathVariable("id") String id,
								 @RequestParam("submenuId")	String submenuId,
								 @RequestParam("userNo") String userNo) {
		
		SubmenuVO submenuVO = new SubmenuVO();
		submenuVO.setSubmenuId(submenuId);
		submenuVO.setUserNo(userNo);
		
		Map result = new HashMap();
		result.put("ok", true);
		
		return result;
	}
	
}
