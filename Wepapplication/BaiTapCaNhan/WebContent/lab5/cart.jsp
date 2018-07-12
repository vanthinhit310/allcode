<%@page import="java.text.DecimalFormat"%>
<%@page import="dao.ProductDAO"%>
<%@page import="model.ThongTinDT"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Giỏ Hàng</title>


<style>
body {
	font-family: monospace;
}
</style>
</head>
<body>
	<jsp:include page="../menu.jsp"></jsp:include>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>


	<div style="text-align: center">
		<h1>MẶT HÀNG</h1>
	</div>
	<div>


		<%
        List<ThongTinDT> dsdt = ProductDAO.getAll();
        DecimalFormat d = new DecimalFormat("###,###,###");
    %>

		<%!
        public String replace(String gia) {
            return gia.replace(",", ".");
        }
    %>

		<div class="container">
			<h2>Quản lí Mặt Hàng</h2>
			<hr>


			<div class="row">
				<%
                for (int i = 0; i < dsdt.size(); i++) {
                    ThongTinDT tt = dsdt.get(i);
            %>

				<div class="col-sm-6 col-md-3">
					<div style="border: 1px solid gray;" class="thumbnail">
						<img
							src="<%=application.getContextPath() %>/<%=tt.getHinhAnhSP()%>"
							alt="Generic placeholder thumbnail">
						<div style="text-align: center;">
							<p style="color: blue">
								<b><%=tt.getTenDT()%> </b>
							</p>
							<p>
								<b>Giá: <%=replace(d.format(tt.getGiaSP()))%>
								</b>
							</p>
							<a
								href="<%=application.getContextPath() %>/Product?action=muahang&madt=<%=tt.getMaDT()%>">
								<button class="btn btn-success">Mua ngay</button>
							</a>
						</div>
					</div>
				</div>


				<%
                }
            %>
			</div>

			<br>
			<hr>

			<table class="table table-hover">
				<thead>
					<tr>
						<th>Mã SP</th>
						<th>Tên SP</th>
						<th>CN Màn hình</th>
						<th>RAM</th>
						<th>Camera</th>
						<th>Hình ảnh</th>
						<th>Giá ban đầu</th>
						<th>Giá đã giảm</th>
					</tr>
				</thead>
				<tbody>
					<%
                for (ThongTinDT tt : dsdt) {
            %>
					<tr>
						<td><%=tt.getMaDT()%></td>
						<td><%=tt.getTenDT()%></td>
						<td><%=tt.getCnManHinh()%></td>
						<td><%=tt.getRam()%></td>
						<td><%=tt.getCameraTruoc()%></td>
						<td><img width="70px"
							src="<%=application.getContextPath() %>/<%=tt.getHinhAnhSP()%>"></td>
						<td><%=replace(d.format(tt.getGiaSP()))%></td>
						<td><%=replace(d.format(tt.getGiaBanDau() - (tt.getGiaBanDau() * tt.getGiaDaGiam())))%>
						</td>
					</tr>
					<%
                }
            %>
				</tbody>
			</table>
		</div>


	</div>
	<%--<jsp:include page="footer.jsp"></jsp:include>--%>
</body>
</html>