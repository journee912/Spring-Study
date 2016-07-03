<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<html>
<head>
<script >
$(".btn-primary").on("click", function(){
	formObj.attr("method", "get");
	formObj.attr("action", "/board/listPage");
	formObj.submit();
});

$(".btn-warning").on("click", function(){
	formObj.attr("action", "/board/modifyPage");
	formObj.attr("method", "get");
	formObj.submit();
});
</script>
</head>
</html>

<form role="form" action="modifyPage" method="post">
	<input type='hidden' name='bno' value="${boardVO.bno }">
	<input type='hidden' name='page' value="${cri.page }">
	<input type='hidden' name='perPageNum' value="${cri.perPageNum }">
</form>

<%@ include file="../include/footer.jsp" %>