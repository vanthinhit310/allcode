<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Đăng kí thành công</title>

<style>
h1 {
	text-align: center;
}

h2 {
	text-align: center;
}
</style>
</head>
<body>
	<jsp:include page="../menu.jsp"></jsp:include>

	<h1 style="color: red">
		Chúc mừng - Bạn đã đăng kí thành công!
		</h2>
		<h2>Thông tin người dùng đã nhập:</h2>
		<br>
		<div style="text-align: center">
			<%=session.getAttribute("kqnguoidungnhap")%>
		</div>
</body>
</html>