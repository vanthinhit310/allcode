<%@page import="java.text.DecimalFormat"%>
<%@page import="model.SanPhamTrongGioHang"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>CART</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<%DecimalFormat d = new DecimalFormat("###,###,### VNĐ");
		List<SanPhamTrongGioHang> ds = (List<SanPhamTrongGioHang>) session.getAttribute("giohang");
	%>

<script type="text/javascript">
	$(document).ready(function(){
		function formatCurrency(number){
		    var n = number.split('').reverse().join("");
		    var n2 = n.replace(/\d\d\d(?!$)/g, "$&,");    
		    return  n2.split('').reverse().join('') + 'VNĐ';
		}
		$('.sl').on('keyup',function(){
		var madt = this.id; // sl+Madt
		var	soluong=$('#'+madt).val();
			if(parseInt(soluong) <0){
				$('#'+madt).val(1);
			}else{
				var gia = parseInt(soluong)*parseInt($('#gia'+madt).attr('class'));
				$('#tonggia'+madt).html(formatCurrency(gia+''));
			}
		});
		
		$('.sl').on('click',function(){
			var madt = this.id; // sl+Madt
			var	soluong=$('#'+madt).val();
				if(parseInt(soluong) <0){
					$('#'+madt).val(1);
				}else{
					var gia = parseInt(soluong)*parseInt($('#gia'+madt).attr('class'));
					$('#tonggia'+madt).html(formatCurrency(gia+''));
				}
			});
		
		$('.cp').on('click',function(){
			var masp = this.id; // masp_soluong
			var sl = $('#sl'+masp).val();
			$.ajax({
				url:'<%=request.getServletContext().getContextPath()%>/Product?action=thaydoisl&maspvasl='+masp+'_'+sl,
				type:'get',
				success:function(data){
					
				},
				error:function(error){
					
				}
				
			});
			
			
		});
		
	});


</script>


<body>
<jsp:include page="../menu.jsp"></jsp:include>
	





	<div class="container">
		<h1 style="text-align: center; margin-top:90px ">Giỏ hàng</h1>
		<p>Quản lí giỏ hàng</p>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Mã sản phẩm</th>
					<th>Tên hàng hóa</th>
					<th>Hình ảnh</th>
					<th>Số lượng</th>
					<th>Giá</th>
					<th>Tổng giá</th>
					<th>Thao tác</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (SanPhamTrongGioHang sp : ds) {
				%>
				<tr><td><%=sp.getThongTinDT().getMaDT()%></td>
					<td><%=sp.getThongTinDT().getTenDT()%></td>
					<td><img width="46px"  src="<%=application.getContextPath() %>/<%=sp.getThongTinDT().getHinhAnhSP()%>"></img></td>
					<td>
					 <div class="form-inline form-group">
					<input id="sl<%=sp.getThongTinDT().getMaDT()%>" min="1" style="width:100px" type="number" value="<%=sp.getSoLuong()%>" class="sl form-control"/>
					<button id="<%=sp.getThongTinDT().getMaDT()%>" class="btn btn-success cp">Update</button>
					
					  </div>
					</td>
					<td id="giasl<%=sp.getThongTinDT().getMaDT()%>" class="<%=sp.getThongTinDT().getGiaSP()%>"><%=d.format(sp.getThongTinDT().getGiaSP())%></td>
					<td id="tonggiasl<%=sp.getThongTinDT().getMaDT()%>"><%=d.format(sp.getThongTinDT().getGiaSP()*sp.getSoLuong())%></td>
					<td><a href="<%=application.getContextPath() %>/Product?action=xoaSP&maDT=<%=sp.getThongTinDT().getMaDT()%>"><button class="btn btn-danger">Remove</button></a></td>
				</tr>
				<%
					}
				%>

			</tbody>
		</table>
	</div>
	<div align="center">
		<a href="cart.jsp"><button class="btn btn-success cp">Tiếp tục mua hàng</button></a>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	


<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>