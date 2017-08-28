package com.hanbit.hsc.back.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hanbit.hsc.back.service.MemberService;
import com.hanbit.hsc.back.vo.MemberVO;

@RestController
@RequestMapping("/api")
public class MemberController {

	@Autowired
	private MemberService memberService;

	// 일단 겟방식으로 디비 연결 성공함. 나중에 포스트방식으로 바꿔야함.
	@GetMapping("/signup")
	public Map<Object, Object> signUp(@RequestParam("email") String email, @RequestParam("pwd") String pwd) {

		MemberVO memberVO = new MemberVO();
		memberVO.setEmail(email);
		memberVO.setPwd(pwd);

		memberService.signUp(memberVO);

		Map<Object, Object> result = new HashMap<>();
		result.put("status", "ok");

		return result;
	}

}
