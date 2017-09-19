package com.hanbit.hsc.back.vo;

import java.util.List;

public class MemberVO {

	private String uid;
	private String id;
	private String email;
	private String pwd;
	private String registDt;
	private String registBy;
	private String domain;
	private MemberDetailVO detail;
	private List<DiaryVO> diary;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRegistDt() {
		return registDt;
	}

	public void setRegistDt(String registDt) {
		this.registDt = registDt;
	}

	public String getRegistBy() {
		return registBy;
	}

	public void setRegistBy(String registBy) {
		this.registBy = registBy;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public MemberDetailVO getDetail() {
		return detail;
	}

	public void setDetail(MemberDetailVO detail) {
		this.detail = detail;
	}

	public List<DiaryVO> getDiary() {
		return diary;
	}

	public void setDiary(List<DiaryVO> diary) {
		this.diary = diary;
	}

}
