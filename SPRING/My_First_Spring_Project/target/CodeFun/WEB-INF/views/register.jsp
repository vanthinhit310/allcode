<%--
  Created by IntelliJ IDEA.
  User: vanth
  Date: 06-Jul-18
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng kí tài khoản</title>
    <style>
        #body_Register {
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
        #form_dk{
            text-align: center;
            font-family: monospace;
        }
    </style>
</head>
<body id="body_Register">
<jsp:include page="menu.jsp"></jsp:include>
<div class="row"><img class="center" id="logo" src="../../resources/img/Logo%20main.png" alt=""></div>
<div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4">
        <form id="form_dk" action="/Account/DangKi" class="form-control">
            <h2>Đăng kí</h2>

            <input id="user_name" name="username" class="form-control" type="text" placeholder="Tên tài khoản">
            <br>
            <input id="mat_khau" name="pass" class="form-control" type="password" placeholder="Mật khẩu">
            <br>
            <input id="re_pass" class="form-control" type="password" placeholder="Nhập lại mật khẩu">
            <br>
            <input id="email" name="email" class="form-control" type="email" placeholder="Email của bạn">
            <br>
            <input id="sdt" name="sdt" class="form-control" type="text" placeholder="Số điện thoại">
            <br>

            <input type="submit" class="btn btn-success" value="Đăng kí">
        </form>
    </div>
    <div class="col-sm-4"></div>
</div>
</body>
</html>
