<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>액션 태그 - forward</title>
</head>
<body>
	<h2>Action Tag - forward</h2>
	<!-- xml 형식 : 각 괄호로만든 태그 시작 태그와 반드시 닫는(종료)
	 태그를 표기해야 한다. 
	 forward 액션 태그 는 url은 현재 페이지 이고 내용은 이동한 페이지 내용임-->
	<jsp:forward page="forward_date.jsp"></jsp:forward>
</body>
</html>