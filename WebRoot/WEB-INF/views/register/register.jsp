<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>新增用户</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body>
  		<form action="<c:url value='/user/user.do'/>" method="post">
  			<table>
  				<tr><td>用户名:</td><td><input type="text" name="userName" /></td></tr>
  				<tr><td>密码:</td><td><input type="password" name="password" /></td></tr>
  				<tr><td>姓名:</td><td><input type="text" name="realName" /></td></tr>
  				<tr><td colspan="2"><input type="submit" name="提交" /></td></tr>
  			</table>
  		</form>
  </body>
</html>
