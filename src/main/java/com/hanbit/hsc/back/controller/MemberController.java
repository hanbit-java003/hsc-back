package com.hanbit.hsc.back.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hanbit.hsc.back.service.MemberService;
import com.hanbit.hsc.back.vo.MemberVO;

@RestController
@RequestMapping("/api/member")
public class MemberController {

	@Autowired
	private MemberService memberService;

	@PostMapping("/signup")
	public Map<Object, Object> signUp(@RequestParam("email") String email,
									  @RequestParam("pwd") String pwd,
									  @RequestParam("id") String id) {

		MemberVO memberVO = new MemberVO();
		memberVO.setEmail(email);
		memberVO.setId(id);
		memberVO.setPwd(pwd);

		memberService.signUp(memberVO);

		Map<Object, Object> result = new HashMap<>();
		result.put("status", "ok");

		return result;
	}

}
