package com.hanbit.hsc.back.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hanbit.hsc.back.annotation.SignInRequired;
import com.hanbit.hsc.back.service.MemberService;
import com.hanbit.hsc.back.vo.MemberVO;

@RestController
@RequestMapping("/api/member")
public class MemberController {

	@Autowired
	private MemberService memberService;

	@PostMapping("/signup")
	public Map<Object, Object> signUp(@RequestParam("id") String id, 
									  @RequestParam("email") String email,
									  @RequestParam("pwd") String pwd,
									  @RequestParam("domain") String domain
									  ) {

		MemberVO memberVO = new MemberVO();
		memberVO.setId(id);
		memberVO.setEmail(email);
		memberVO.setPwd(pwd);
		memberVO.setDomain(domain);

		memberService.signUp(memberVO);

		Map<Object, Object> result = new HashMap<>();
		result.put("status", "ok");

		return result;
	}
	
	@PostMapping("/signin")
	public Map<Object, Object> signIn(@RequestParam("id") String id,
									  @RequestParam("email") String email,
									  @RequestParam("pwd") String pwd,
									  HttpSession session) {
		
		MemberVO memberVO = memberService.signIn(email, pwd);
		
		session.setAttribute("signedIn", true);
		session.setAttribute("uid", memberVO.getUid());
		session.setAttribute("id", memberVO.getId());
		session.setAttribute("email", memberVO.getEmail());
		
		if (memberVO.getDetail() != null) {
			session.setAttribute("img", memberVO.getDetail().getImg());
		}
		
		Map<Object, Object> result = new HashMap<>();
		result.put("id", memberVO.getId());
		result.put("email", memberVO.getEmail());
		
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
			member.put("img", session.getAttribute("img"));
		}
		
		return member;
	}
	
	@SignInRequired
	@RequestMapping("/detail")
	public MemberVO getMemberDetail(HttpSession session) {
		String uid = (String) session.getAttribute("uid");
		
		return memberService.getMemberDetail(uid);
	}

	@RequestMapping("/signout")
	public Map<Object, Object> signOut(HttpSession session) {
		
		session.invalidate();
		
		Map<Object, Object> result = new HashMap<>();
		result.put("status", "ok");
		
		return result;
	}
	
	@RequestMapping("/{id}")
	public MemberVO getUser(@PathVariable("id") String id) {
		return memberService.getUser(id);
	}
	
}
