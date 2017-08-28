package com.hanbit.hsc.back.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.hsc.back.dao.MemberDAO;
import com.hanbit.hsc.back.vo.MemberVO;

@Service
public class MemberService {
	
	private static final char[] CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

	@Autowired
	private MemberDAO memberDAO;

	public void signUp(MemberVO memberVO) {
		if (memberDAO.countMember(memberVO.getEmail()) > 0) {
			throw new RuntimeException("이미 가입된 이메일 입니다.");
		}

		memberVO.setUid(generateUid());
		
		// TODO: password must encrypt

		memberDAO.insertMember(memberVO);
	}

	public String generateUid() {
		int length = 16;
		char[] uid = new char[length];
		
		Random random = new Random();
		
		for (int i=0; i<length; i++) {
			uid[i] = CHARS[random.nextInt(CHARS.length)];
		}
		
		System.out.println(new String(uid));
		return new String(uid);
	}

}
