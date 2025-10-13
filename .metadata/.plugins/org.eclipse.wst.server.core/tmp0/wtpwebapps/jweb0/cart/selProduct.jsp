<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<%
//입력된 이름 받아오기
String name = request.getParameter("username");
//out.println(name);
//세션 발급
session.setAttribute("sessionName", name);
%>
<body>
<section id="container">
<h2>상품 선택</h2>
<p>[<%=session.getAttribute("sessionName") %>]</b>님 환영합니다.</p>
<form action="addProduct.jsp" method="post">
<select name = "product">
<option value="사과">사과</option>
<option value="바나나">바나나</option>
<option value="포도">포도</option>
</select>
<button type="submit">추가</button>
</form>
<button onclick="location.href='cart.jsp'">장바구니</button>
</section>

</body>
</html>