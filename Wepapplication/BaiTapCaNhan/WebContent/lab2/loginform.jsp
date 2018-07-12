<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Register - Lab 2</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Client Signup Form template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<!--<script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);

    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>-->
<!-- Custom Theme files -->
<link href="<%=application.getContextPath() %>/css/login.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js">
    </script>
<link
	href="//fonts.googleapis.com/css?family=Old+Standard+TT:400,400i,700"
	rel="stylesheet">
<link
	href='//fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800'
	rel='stylesheet' type='text/css'>
<!--web font-->
<!-- //web font -->
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>

<!--bắt lỗi form!-->
<script>
        $(document).ready(function () {
            $('#formx').on('submit', function () {
                if ($('#name').val() === '') {
                    $('#e_name').html('Bạn phải nhập họ tên!');
                    $('#name').css('border', 'solid 1px red');
                    return false;
                }
                if ($('#em').val() === '') {
                    $('#e_em').html('Bạn phải nhập Email!');
                    $('#em').css('border', 'solid 1px red');
                    return false;
                }
                if ($('#username').val() === '') {
                    $('#e_username').html('Bạn phải nhập tên tài khoản!');
                    $('#username').css('border', 'solid 1px red');
                    return false;
                }
                if ($('#pw').val() === '') {
                    $('#e_pw').html('Không được để trống mật khẩu!');
                    $('#pw').css('border', 'solid 1px red');
                    return false;
                }
                if ($('#rpw').val() === '') {
                    $('#e_cf').html('Bạn phải xác nhận mật khẩu!');
                    $('#rpw').css('border', 'solid 1px red');
                    return false;
                }
                if ($('#pw').val() !== $('#rpw').val()) {
                    $('#e_cf').html('Mật khẩu nhập lại không chính xác!');
                    $('#rpw').css('border', 'solid 1px red');
                    return false;
                }
                if ($('#Sdt').val() === '') {
                    $('#e_sdt').html('Bạn phải nhập số điện thoại!');
                    $('#Sdt').css('border', 'solid 1px red');
                    return false;
                }
                if ($('#add').val() === '') {
                    $('#e_add').html('Vui lòng nhập địa chỉ!');
                    $('#add').css('border', 'solid 1px red');
                    return false;
                }
                if (!$('#brand2')[0].checked){
                    return false;
                }
                return true;
            });
            $('#formx').on('keyup',function () {
                if ($('#name').val() !== '') {
                    $('#e_name').html('');
                    $('#name').css('border', 'solid 2px green');
                }
                if ($('#em').val() !== '') {
                    $('#e_em').html('');
                    $('#em').css('border', 'solid 2px green');
                }
                if ($('#username').val() !== '') {
                    $('#e_username').html('');
                    $('#username').css('border', 'solid 2px green');
                }
                if ($('#pw').val() !== '') {
                    $('#e_pw').html('');
                    $('#pw').css('border', 'solid 2px green');
                }
                if ($('#rpw').val() !== '') {
                    $('#e_cf').html('');
                    $('#rpw').css('border', 'solid 2px green');
                }
                if ($('#Sdt').val() !== '') {
                    $('#e_sdt').html('');
                    $('#Sdt').css('border', 'solid 2px green');
                }
                if ($('#add').val() !== '') {
                    $('#e_add').html('');
                    $('#add').css('border', 'solid 2px green');
                }

            });


        });

    </script>
</head>
<body>
	<jsp:include page="../menu.jsp"></jsp:include>
	<!-- main -->
	<div class="main main-agileits">
		<h1>Register Form</h1>
		<div class="main-agilerow">
			<div class="signup-wthreetop">
				<h2 style="text-align: center">Welcome to me!</h2>
				<p style="text-align: center" id="p-text">Vui lòng điền thông
					tin vào mẫu dưới đây!</p>
			</div>
			<div class="contact-wthree">
				<form id="formx" action="<%=application.getContextPath() %>/Lab2" method="post">
					<h3>THÔNG TIN CÁ NHÂN</h3>
					<div class="form-w3step1">
						<input id="name" type="text" name="Name" placeholder="Tên của bạn">
						<p id="e_name" style="color: red"></p>

						<input id="em" type="email" class="email agileits-btm"
							name="Email" placeholder="Email">
						<p id="e_em" style="color: red"></p>
						
						<p>
							Date: <input name="date" type="text" id="datepicker">
						</p>
						<p>Giới tính</p>
						<input checked="checked" type="radio" name="gender" value="male"> Nam<br>
						<input type="radio" name="gender" value="female"> Nữ<br>
						
					</div>
					<h3>THÔNG TIN TÀI KHOẢN</h3>
					<div class="form-w3step1">
						<input id="username" type="text" name="User Name"
							placeholder="Tên đăng nhập">
						<p id="e_username" style="color: red"></p>

						<input id="pw" type="password" name="Password"
							placeholder="Mật khẩu">
						<p id="e_pw" style="color: red"></p>

						<input id="rpw" type="password" class="agileits-btm"
							name="confirm password" placeholder="Nhập lại mật khẩu">
						<p id="e_cf" style="color: red"></p>
					</div>
					<h3>LIÊN LẠC</h3>
					<div class="form-w3step1 w3ls-formrow">
						<input id="Sdt" type="text" name="Number"
							placeholder="Số điện thoại">
						<p id="e_sdt" style="color: red"></p>

						<input id="add" type="text" class="agileits-btm"
							name="Your Address" placeholder="Địa chỉ của bạn">
						<p id="e_add" style="color: red"></p>
					</div>
					<div class="agileits-row2 w3ls-formrow2">
						<input type="checkbox" id="brand2" value=""> <label
							for="brand2"><span></span>Tôi đồng ý với điều khoản sử
							dụng</label>
					</div>
					<input type="submit" value="Register">

				</form>
			</div>
		</div>
	</div>
	<!-- //main -->
	<!-- copyright -->
	<div class="w3copyright-agile">
		<p>
			© 2018 Register Form. All rights reserved | Design by <a
				href="https://www.facebook.com/vanthinh.le.50364" target="_blank">Văn
				Thịnh</a>
		</p>
	</div>
	<!-- //copyright -->
</body>
</html>