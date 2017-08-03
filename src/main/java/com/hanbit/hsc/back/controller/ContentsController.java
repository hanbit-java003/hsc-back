package com.hanbit.hsc.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanbit.hsc.back.service.ContentsService;
import com.hanbit.hsc.back.vo.ContentsVO;
import com.hanbit.hsc.back.vo.SubmenuVO;

@RestController
@RequestMapping("/api/main")
public class ContentsController {

	@Autowired
	private ContentsService contentsService;
	
	@RequestMapping("/{id}")
	public ContentsVO getContents(@PathVariable("id") String id) {
		
		return contentsService.getContents(id);
	}
	
	@RequestMapping("/result")
	public List<SubmenuVO> getSubmenus() {
		return contentsService.getSubmenus();
	}
}

