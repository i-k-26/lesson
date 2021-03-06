package com.internousdev.ecsite2.dto;

public class BuyItemDTO {
	private int id;
	private String itemName;
	private String itemPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
		// LoginActionによってitem_info_transactionのtableが呼び出され、値がsetされる
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
		// BuyItemDAOによってそれぞれの値がsetし直される
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

}
