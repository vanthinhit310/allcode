<%@ page import="java.util.List" %>
<%@ page import="com.model.SinhVien" %><%--
  Created by IntelliJ IDEA.
  User: vanth
  Date: 06-Jul-18
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quản lí sinh viên</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <%List<SinhVien> dssv = (List<SinhVien>) request.getAttribute("dssv");%>
</head>
<body>
<div class="container">
    <h2>Bảng quản lí sinh viên</h2>
    <p>The .table class adds basic styling (light padding and only horizontal dividers) to a table:</p>
    <table class="table">
        <thead>
        <tr>
            <th>MSSV</th>
            <th>TEN</th>
            <th>TEN LOP</th>
        </tr>
        </thead>
        <tbody>
        <%for (SinhVien sv : dssv) {%>
        <tr>
            <td><%=sv.getMaSv()%>
            </td>
            <td><%=sv.getTenSv()%>
            </td>
            <td><%=sv.getLopByLop().getTenLop()%>
            </td>
        </tr>
        <%}%>

        </tbody>
    </table>
</div>

</body>
</html>
