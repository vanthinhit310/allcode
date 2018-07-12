<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Quản lí sinh viên</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
        <c:forEach items="${dssv}"  var="sv">
            <tr>
                <td>${sv.getMaSv()}</td>
                <td>${sv.getTenSv()}</td>
                <td>${sv.getLopByLop().getTenLop()}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
