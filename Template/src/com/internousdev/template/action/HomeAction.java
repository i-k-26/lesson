package com.internousdev.template.action;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport {
	
	public String execute(){
	//executeメソッドを呼び出す
		
		return SUCCESS;
	}
}
//struts.xmlの指示によって、login.jspへ移動する