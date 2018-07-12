<%@ page import="com.model.Account" %><%--
  Created by IntelliJ IDEA.
  User: vanth
  Date: 06-Jul-18
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    <%Account account = (Account) session.getAttribute("account");%>

</head>
<body>
<nav class="navbar navbar-expand-sm bg-light justify-content-center">
    <ul class="navbar-nav">
        <%if (account == null){%>
        <li class="nav-item">
            <a class="nav-link" href="/">Trang chủ</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/LoginPage">Đăng nhập</a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="/RegisterPage">Đăng kí</a>
        </li>
        <%}else {%>
        <li class="nav-item">
            <a class="nav-link" href="#"><%=account.getTenTk()%></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/Logout">Đăng xuất</a>
        </li>
        <%}%>
    </ul>
</nav>
</body>
</html>
