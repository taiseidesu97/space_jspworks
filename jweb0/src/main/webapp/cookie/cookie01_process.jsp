<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
//폼에 입력된 데이터 받기(name속성값)
String id = request.getParameter("id");
String pw = request.getParameter("passwd");
//out.println(id + " , " );

//쿠키 생성해서 로컴 컴 (브라우저)에 보냄
//id - space, pw-1234인 경우 쿠키 생성
if(id.equals("space") && pw.equals("12334")){
//쿠키 이름 -user-id
Cookie cookieId = new Cookie("userid", id);

//브라우저에 보내기(응답)
response.addCookie(cookieId);
out.println("쿠키가 생성되었습니다.");
}else{
out.println("쿠키 생성에 실패했습니다.");
}
 %>