<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Product Details Portal</h1>

<!-- id is the object of class -->
<jsp:useBean id="obj" class="com.simplilearn.demo.Product" scope="session"></jsp:useBean>

<h3>Value After taking</h3>

<!-- let's call getter -->
ProductID:  <jsp:getProperty property="id" name="obj"/><br>
ProducNAME:  <jsp:getProperty property="name" name="obj"/><br>
ProductDiscription: <jsp:getProperty property="pdis" name="obj"/><br>
ProductQuantity: <jsp:getProperty property="pqua" name="obj"/><br>

<!--  let's call Setter  -->
<!-- name means usebean object -->

<%
String id=request.getParameter("id");
String name=request.getParameter("name");
String pdis=request.getParameter("pdis");
String pqua=request.getParameter("pqua");

%>

<jsp:setProperty property="id" name="obj" value="<%=Integer.parseInt(id) %>"/><br>
<jsp:setProperty property="name" name="obj" value="<%=name%>"/><br>
<jsp:setProperty property="pdis" name="obj" value="<%=pdis%>"/><br>
<jsp:setProperty property="pqua" name="obj" value="<%=Integer.parseInt(pqua) %>"/><br>


</body>
</html>