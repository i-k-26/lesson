<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>一覧表示</title>
</head>
<body>
	<table>
		<tbody>
			<tr>
				<th>name</th>
				<th>age</th>
			</tr>
			<s:iterator value="personList">
				<tr>
					<td><s:property value="name" /></td>
					<td><s:property value="age" /></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>