<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン失敗</title>
</head>
<body>
	<h1>ログインに失敗しました。</h1>

	<p>【入力内容を確認してください】</p>
	<label>ログインID:</label>
	<s:property value="loginId" />
	<br>
	<label>パスワード:</label>
	<s:property value="loginPassword" />
</body>
</html>