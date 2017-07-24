package com.hanbit.hsc.front.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.hsc.front.dao.UserDAO;
import com.hanbit.hsc.front.vo.UserVO;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	public List<UserVO> getUsers() {
		return userDAO.selectUsers();
	}
	
}
