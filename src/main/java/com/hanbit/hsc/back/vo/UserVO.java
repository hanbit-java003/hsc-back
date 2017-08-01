package com.hanbit.hsc.back.vo;

import java.util.List;

public class UserVO {

	private String userNo;
	private String userId;
	private String img;
	private String text;
	private List<VisitedVO> visited;
	private List<SubmenuVO> submenu;

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<VisitedVO> getVisited() {
		return visited;
	}

	public void setVisited(List<VisitedVO> visited) {
		this.visited = visited;
	}

	public List<SubmenuVO> getSubmenu() {
		return submenu;
	}

	public void setSubmenu(List<SubmenuVO> submenu) {
		this.submenu = submenu;
	}

}
