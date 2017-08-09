package com.hanbit.hsc.back.admin.vo;

import java.util.List;

import com.hanbit.hsc.back.vo.SubmenuVO;

public class AdminGroupVO {
	
	private String id;
	private String name;
	private String mainTitle;
	private String subTitle;

	private List<SubmenuVO> submenus;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMainTitle() {
		return mainTitle;
	}

	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public List<SubmenuVO> getSubmenu() {
		return submenus;
	}

	public void setSubmenus(List<SubmenuVO> submenu) {
		this.submenus = submenu;
	}

}
