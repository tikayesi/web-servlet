<%@ page import="java.util.List" %>
<%@ page import="com.shopee.customer.Customer" %><%--
  Created by IntelliJ IDEA.
  User: Enigmacamp
  Date: 9/30/2020
  Time: 10:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<%@include file="../menu.jsp"%>
<% String name= (String) request.getAttribute("name");%>
<h1>HELLOW <%=name%></h1>
<a href="customer-register">Add Customer</a>
<table class="addStyle">
    <thead>
<th>Name</th>
<th>Email</th>
    <th>Phone Number</th>
    <th>Address</th>
    </thead>
    <tbody>
<% List<Customer> customers= (List<Customer>) request.getAttribute("customers");%>
<% for (Customer customer: customers){ %>
<tr>
    <td><%=customer.getName()%></td>
        <td><%=customer.getEmail()%></>
        <td><%=customer.getPhoneNumber()%></td>
        <td><%=customer.getAddress()%></td>
</tr>
<%}%>

    </tbody>
</table>
</body>
</html>
