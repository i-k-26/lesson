<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">


<title>BuyItemConfirm画面</title>
</head>
<body>

	<div id="header"></div>

	<div id="main">
		<div id="top">
			<p>BuyItemConfirm</p>
		</div>

		<div>
			<s:form action="BuyItemConfirmAction">
				<table>
					<tr>
						<td>商品名</td>
						<td><s:property value="session.buyItem_name" /></td>
						<!-- LoginActionでMapインターフェースによってsessionされた要素を取り出す   -->
					</tr>
					<tr>
						<td>値段</td>
						<td><s:property value="session.buyItem_price" /><span>円</span>
						<!-- BuyItemActionでsessionされたbuyItem_priceというkeyの中身、intStock*intPriceを取り出す -->
						</td>
					</tr>
					<tr>
						<td>購入個数</td>
						<td><s:property value="session.stock" /><span>個</span></td>
						<!-- BuyItemActionで文字列型へと変換されているsession、keyがstockのstock要素を取り出す -->
					</tr>
					<tr>
						<td><span>支払い方法</span></td>
						<td><s:property value="session.pay" /></td>
						<!-- BuyItemActionのif文でsessionされた、keyがpayの文字列型のpayment要素を取り出す -->
					</tr>
					<tr>
						<td><s:submit value="完了" /></td>
						<!-- valueによってBuyItemConfirmActionへ情報が送られる -->
					</tr>
				</table>
			</s:form>
			<div>
				<span>前の画面に戻る場合は</span> <a href='<s:url action="HomeAction"/>'>こちら</a>
			</div>

		</div>
	</div>

	<div id="footer"></div>
</body>
</html>