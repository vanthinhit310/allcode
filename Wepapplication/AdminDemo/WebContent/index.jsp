<%@page import="dao.AccountDAO"%>
<%@page import="model.Account"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%List<Account> ds = AccountDAO.getAll(); %>
<div class="container">
  <h2>Quản lí Account</h2>
  <a  href="themaccount.jsp">Thêm account</a>
  <table class="table table-striped">
    <thead>
      <tr>
        <th>username</th>
        <th>password</th>
        <th>ten</th>
        <th>email</th>
        <th>sdt</th>
        <th>phan quyen</th>
        <th>Thao tác</th>
      </tr>
    </thead>
    <tbody>
    <%for(Account account:ds){ %>
      <tr>
        <td><%=account.getUsername() %></td>
        <td><%=account.getPassword() %></td>
        <td><%=account.getTen() %></td>
         <td><%=account.getEmail() %></td>
        <td><%=account.getSdt() %></td>
        <td><%=account.getPhanQuyen() %></td>
        <td><a  href="AccountController?action=delete&username=<%=account.getUsername() %>">Xóa</a></td>
      </tr> 
     
      <%} %>
    </tbody>
  </table>
</div>

</body>
</html>
