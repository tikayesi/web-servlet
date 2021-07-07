<%@page contentType="text/html;charset=UTF-8" %>
<html>
<body>
<a href="customer">Customer</a>
<% HttpSession mySession = request.getSession(); %>
<h1>WELCOME <%=mySession.getAttribute("namanya")%></h1>
<h1><% =mySession.getId() %></h1>
</body>
</html>
