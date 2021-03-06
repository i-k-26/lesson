<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">


<title>item一覧</title>
</head>
<body>

	<div id="header"></div>

	<div id="main">
		<div id="top">
			<p>商品一覧</p>
		</div>

		<div>
			<s:if test="itemlist.isEmpty()">
				<h3>商品情報はありません。</h3>
			</s:if>
			<s:elseif test="itemlist != null">

				<h3>商品情報一覧</h3>
				<table border="1">
					<tr>
						<th>商品ID</th>
						<th>商品名</th>
						<th>値段</th>
						<th>在庫</th>
						<th>登録日時</th>
						<th>更新日時</th>
					</tr>
					<s:iterator value="itemlist">
						<tr>
							<td><s:property value="id" /></td>
							<td><s:property value="itemName" /></td>
							<td><s:property value="itemPrice" /><span>円</span></td>
							<td><s:property value="itemStock" /><span>個</span></td>
							<td><s:property value="insertDate" /></td>
							<td><s:property value="updateDate" /></td>
						</tr>
					</s:iterator>
				</table>

			</s:elseif>

			<div>
				<s:form action="GoAdminAction">
					<s:submit value="前のページへ戻る" />
				</s:form>

				<s:form action="LogoutAction">
					<s:submit value="ログアウト" />
				</s:form>
			</div>
		</div>
	</div>

	<div id="footer"></div>


</body>
</html>