<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人员列表</title>
</head>
<body>
	<c:set var="persons" value="${persons}" />
	<c:forEach items="${persons}" var="person"> 
		id=${person.id},name=${person.name } <a href="editForm.action?id=${person.id }">编辑</a><br/>
	</c:forEach>
	<a href="addperson.jsp">添加人员</a>
</body>
</html>