<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib  uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人员添加</title>
</head>
<body>
	<form action="action_add.action" namespace="/person" method="post">
		姓名：<input type="text" name="person.name"/>
		<input type="submit" value="添加"/>
	<form>
</body>
</html>