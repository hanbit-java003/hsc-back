package com.hanbit.hsc.front.vo;

import java.util.List;

public class UserVO {

	private String userNo;
	private String userId;
	private String img;
	private String text;
	private List<VisitedVO> visited;

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

}
