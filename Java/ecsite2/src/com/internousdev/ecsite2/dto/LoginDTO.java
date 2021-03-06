package com.internousdev.ecsite2.dto;

public class LoginDTO {
	private String loginId;
	private String loginPassword;
	private String userName;
	private String insertDate;
	private boolean loginFlg = false;
	private boolean adminFlg = false;
	// booleanはfalseかtrueの2パターンのみ

	public String getLoginId() {
		return loginId;
		// setされたloginIdを呼び出し元にreturnする
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
		// LoginDAOから値がsetされる
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public boolean getAdminFlg() {
		return adminFlg;
	}

	public void setAdminFlg(boolean adminFlg) {
		this.adminFlg = adminFlg;
	}

	public boolean getLoginFlg() {
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

}
