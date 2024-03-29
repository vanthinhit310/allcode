<%@page import="java.util.regex.Pattern"%>
<%@page import="model.ThongTinDT"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ThemDienThoai"%>
<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Sản phẩm - Lab 4</title>
<meta name="viewport" content="width=device-width,
initial-scale=1">
<link rel="stylesheet" href="Boot/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="style.css">
<style type="text/css">
.colors {
	margin-left: 100px;
	padding-right: 100px;
}

th {
	text-align: center;
}

td {
	text-align: center;
}
</style>
</head>
<body style="font-family: monospace;">
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="container">

		<h1 style="text-align: center;">Sản Phẩm</h1>
		<br>
		<hr>
		<%
			ArrayList<ThongTinDT> list = ThemDienThoai.all;
			DecimalFormat d = new DecimalFormat("###,###,### VNĐ");
		%>
		<%!public String replace(String gia) {
		return gia.replace(",", ".");
	}%>


		<div class="row">
			<%
				for (int i = 0; i < list.size(); i++) {
			%>

			<div class="col-sm-6 col-md-3">
				<div style="border: 1px solid gray;" class="thumbnail">
					<img src="<%=list.get(i).getHinhAnhSP()%>"
						alt="Generic placeholder thumbnail">
					<div style="text-align: center;">
						<p style="color: blue">
							<b><%=list.get(i).getTenDT()%></b>
						</p>
						<p>
							<b><%=replace(d.format(list.get(i).getGiaSP()))%></b>
						</p>
						<p>
							<b><%=list.get(i).getMaDT()%></b>
						</p>
					</div>
				</div>
			</div>



			<%
				}
			%>
		</div>



		<div class="colors">
			<div>
				<h3 style="text-align: center">Danh Sách Sản Phẩm</h3>
				<hr>
			</div>
			<div>
				<table class="table table-bordered">
					<thead>
						<tr>
							<div>
							<th>Mã sản phẩm</th>
							<th>Tên sản phẩm</th>
							<th>Hình ảnh</th>
							<th>Giá ban đầu</th>
							<th>Giá đã giảm</th>
							<th>Thao tác</th>
						</tr>
					</thead>
					<%
						for (int i = 0; i < list.size(); i++) {
							String x = i + "";
					%>
					<tbody>
						<tr>
							<td valign="middle"><%=(list.get(i).getMaDT())%></td>
							<td style="color: blue;" valign="middle"><%=(list.get(i).getTenDT())%></td>
							<td valign="middle" style="padding: 20px 20px 20px 50px"><img
								src="<%=(list.get(i).getHinhAnhSP())%>" width="50px"
								height="50px"></td>
							<td valign="middle"><%=replace(d.format(list.get(i).getGiaSP()))%></td>
							<td valign="middle"><%=replace(d.format(list.get(i).getGiaDaGiam()))%></td>
							<td><a href="lab4?id=<%=list.get(i).getMaDT()%>"><button class="btn btn-success">Xóa</button></a></td>
						</tr>
					</tbody>
					<%
						}
					%>
				</table>
			</div>
		</div>




	</div>
	<!-- Go To Top
    ============================================= -->
	<div id="gotoTop" class="vta-arrow-up"></div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>


</html>