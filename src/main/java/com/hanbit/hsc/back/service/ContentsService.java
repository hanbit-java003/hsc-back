package com.hanbit.hsc.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.hsc.back.dao.ContentsDAO;
import com.hanbit.hsc.back.vo.ContentsVO;

@Service
public class ContentsService {

	@Autowired
	private ContentsDAO contentsDAO;
	
	public ContentsVO getContents(String id) {
		ContentsVO contents = contentsDAO.selectContents(id);
		contents.setSubmenus(contentsDAO.selectSubmenu(id));
		
		return contents;
	}
	
}
