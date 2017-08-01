package com.hanbit.hsc.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.hsc.back.dao.UserDAO;
import com.hanbit.hsc.back.vo.UserVO;
import com.hanbit.hsc.back.vo.VisitedVO;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	public List<UserVO> getUsers() {
		return userDAO.selectUsers();
	}
	
	public List<VisitedVO> getVisited(int id) {
		return userDAO.selectVisited(id);
	}
	
	public UserVO getUser(String no) {
		UserVO user = userDAO.selectUser(no);
		user.setSubmenu(userDAO.selectSubmenu(no));
		
		return user;
	}
	
}
