package com.hanbit.hsc.back.vo;

public class SubmenuVO {

	private String id;
	private String submenuId;
	private String img;
	private String title;
	private String content;
	private String userNo;
	private String userId;
	private String usersImg;
	private String together;
	private int likeCount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubmenuId() {
		return submenuId;
	}

	public void setSubmenuId(String submenuId) {
		this.submenuId = submenuId;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUsersImg() {
		return usersImg;
	}

	public void setUsersImg(String usersImg) {
		this.usersImg = usersImg;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTogether() {
		return together;
	}

	public void setTogether(String together) {
		this.together = together;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

}
