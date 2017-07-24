package com.hanbit.hsc.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.hsc.back.dao.UserDAO;
import com.hanbit.hsc.back.vo.UserVO;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	public List<UserVO> getUsers() {
		return userDAO.selectUsers();
	}
	
}
