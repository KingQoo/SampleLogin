<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="customer" value="${sessionScope.customer}" />

<a href="../chapter25/Product.action">商品</a>
<a href="../chapter25/cart.jsp">カート</a>
<a href="../chapter25/Preview.action">購入</a>
<a href="../login/login-in.jsp">ログイン</a>
<c:if test="${!empty customer}">
	<a href="../login/logout-in.jsp">ログアウト</a>
</c:if>
<hr>