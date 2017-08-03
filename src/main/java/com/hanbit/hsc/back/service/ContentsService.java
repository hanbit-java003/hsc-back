package com.hanbit.hsc.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.hsc.back.dao.ContentsDAO;
import com.hanbit.hsc.back.vo.ContentsVO;
import com.hanbit.hsc.back.vo.SubmenuVO;

@Service
public class ContentsService {

	@Autowired
	private ContentsDAO contentsDAO;
	
	public ContentsVO getContents(String id) {
		ContentsVO contents = contentsDAO.selectContents(id);
		contents.setSubmenus(contentsDAO.selectSubmenu(id));
		
		return contents;
	}
	
	public List<SubmenuVO> getSubmenus() {
		return contentsDAO.selectSubmenus();
	}
	
}
