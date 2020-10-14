<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<%@include file="../menu.jsp" %>
${message}
<form action="Login.action" method="post">
<p>ログイン名<input type="text" name="login" value=${login}></p>
<p>パスワード<input type="text" name="password" value="${password}"></p>
<input type="submit" value="ログイン">
</form>

<%@include file="../footer.html" %>