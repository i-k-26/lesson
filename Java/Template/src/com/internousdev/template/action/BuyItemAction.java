package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {

	private int stock;
	private String pay;
	//buyItem.jspに入力された情報がsetされる
	
	private Map<String, Object> session;
	private String result;

	public String execute() {
		result = SUCCESS;

		session.put("stock", stock);
		//stockというkeyで、変数stockという要素をsessionする
		
		int intStock = Integer.parseInt(session.get("stock").toString());
		//session.getで整数型のstockをgetし、toStringで文字列型へと変換する
		int intPrice = Integer.parseInt(session.get("buyItem_price").toString());

		session.put("buyItem_price", intStock * intPrice);
		//新しくbuyItem_price(合計金額)をoverrideさせる
		
		String payment;

		if (pay.equals("1")) {
			//buyItem.jspから送られたpayの値が1であれば、sessionが実行される
			payment = "現金払い";
			session.put("pay", payment);
		} else {
			//buyItem.jspから送られたpayの値が1以外であれば、sessionが実行される
			payment = "クレジットカード";
			session.put("pay", payment);
		}
		return result;
		//BuyItemActionのresultがSUCCESSでreturnされるので、struts.xmlによって次ページbuyItemConfirm.jspに移動する
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
