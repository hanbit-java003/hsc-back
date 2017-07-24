package com.hanbit.hsc.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanbit.hsc.front.service.ContentsService;
import com.hanbit.hsc.front.vo.ContentsVO;

@RestController
@RequestMapping("/api/main")
public class ContentsController {

	@Autowired
	private ContentsService contentsService;
	
	@RequestMapping("/{id}")
	public ContentsVO getContents(@PathVariable("id") String id) {
		
		return contentsService.getContents(id);
	}
}

