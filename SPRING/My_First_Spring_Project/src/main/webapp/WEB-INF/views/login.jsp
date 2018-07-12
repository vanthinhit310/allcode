<%--
  Created by IntelliJ IDEA.
  User: vanth
  Date: 06-Jul-18
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng nhập</title>
    <style>
        #body_login {
            background-color: #faf2cc;
        }

        #logo {
            padding-top: 5px;
            display: block;
            margin-left: auto;
            margin-right: auto;
            width: 220px;
            height: 220px;

        }

        #form_dn {
            text-align: center;
            font-family: monospace;
        }
    </style>
</head>
<body id="body_login">
<jsp:include page="menu.jsp"></jsp:include>
<div class="row"><img class="center" id="logo" src="../../resources/img/Logo%20main.png" alt=""></div>
<div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4">
        <form id="form_dn" action="/Account/DangNhap" class="form-control">
            <h2>Đăng nhập</h2>
            <input id="taikhoan" name="taikhoan" class="form-control" type="text" placeholder="Nhập tên đăng nhập">
            <br>
            <input id="matkhau" name="matkhau" class="form-control" type="password" placeholder="Nhập mật khẩu">
            <a href="">Quên mật khẩu</a>
            <br>
            <input type="submit" class="btn btn-success" value="Đăng nhập">
        </form>
    </div>
    <div class="col-sm-4"></div>
</div>
</body>
</html>
