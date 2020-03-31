<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h3>
 <table width="1200">
  <tr>
	  <td>编号</td>
	  <td>姓名</td>
	  <td>性别</td>
	  <td>出生日期</td>
	  <td>图片</td>
  </tr>
  <c:forEach items="${pageInfo.list }" var="user">
  <tr>
	  <td>${user.id }</td>
	  <td>${user.name }</td>
	  <td>${user.sex }</td>
	  <td>${user.intime} |
	      ${user.birthday } |
	      <spring:eval expression="user.birthday"/>
	  </td>
	  <td>
	   
	  </td>
  </tr>
  </c:forEach>
  
  <tr>
   <td colspan="5">
   <span style="color:red">${pageInfo.pageNum }</span>/${pageInfo.pages }
    <a href="findPages?page=1">首页</a> | 
    <a href="findPages?page=${pageInfo.prePage }">上一页</a> |
    <a href="findPages?page=${pageInfo.nextPage }">下一页</a> |
    <a href="findPages?page=${pageInfo.lastPage }">尾页</a>
   </td>
  </tr>
 </table>
 </h3>
</body>
</html>