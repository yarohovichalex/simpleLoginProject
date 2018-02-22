<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert</title>
</head>
<body>
	<h1>Hello user!!!</h1>
	
	
	
	<form action="MainServlet" method="post">
		<input type = "hidden" name="action"  value = "test3">
			
	</form>
	<form action="MainServlet" method="post">
		<input type = "hidden" name="action"  value = "test4">
		<input type = "submit" value = "vvesti">
		<input type="text" name="qqqq" size="40">			
	</form>
	
	<form action="MainServlet" method="post">
		<input type = "hidden" name="action"  value = "test">
		<input type = "submit" value = "test jsp">		
	</form>
	<form action="MainServlet" method="post">
		<input type = "hidden" name="action"  value = "test2">
		<input type = "submit" value = "test jsp 2">		
	</form>
</body>
</html>