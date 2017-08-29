package com.hanbit.hsc.back.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

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
	
	@PostMapping("/signin")
	public Map<Object, Object> signIn(@RequestParam("email") String email,
									  @RequestParam("pwd") String pwd,
									  @RequestParam("id") String id,
									  HttpSession session) {
		
		MemberVO memberVO = memberService.signIn(email, pwd);
		
		session.setAttribute("signedIn", true);
		session.setAttribute("uid", memberVO.getUid());
		session.setAttribute("email", memberVO.getEmail());
		session.setAttribute("id", memberVO.getId());
		
		Map<Object, Object> result = new HashMap<>();
		result.put("email", memberVO.getEmail());
		result.put("id", memberVO.getId());
		
		return result;
	}
	
	@RequestMapping("/get")
	public Map<Object, Object> getMember(HttpSession session) {
		Map<Object, Object> member = new HashMap<>();
		
		if (session.getAttribute("signedIn") == null) {
			member.put("signedIn", false);
		}
		else {
			member.put("signedIn", true);
			member.put("id", session.getAttribute("id"));
			member.put("email", session.getAttribute("email"));
		}
		
		return member;
	}

	@RequestMapping("/signout")
	public Map<Object, Object> signOut(HttpSession session) {
		
		session.invalidate();
		
		Map<Object, Object> result = new HashMap<>();
		result.put("status", "ok");
		
		return result;
	}
	
}
