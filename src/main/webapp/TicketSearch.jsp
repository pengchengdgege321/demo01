<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="Div">
        <p align="center">
            <b>门票详细信息</b></p>
    </div>
	<div align="right" >
		<form method="post"  action="addUI">
			<input type="submit" value="新增门票信息" />
		</form>
	</div>
	&nbsp
    <div align="center">
       <table class="divTab" width="100%">
            <tr>
                <td><b>序号</b></td>
                <td><b>比赛项目</b></td>
                <td><b>开始时间</b></td>
                <td><b>价格</b></td>
                <td><b>剩余票数</b></td>
                <td><b>操作</b></td>
            </tr>
            <c:forEach items="${all}" var="p">
            <tr>
                <td>${p.ticketid}</td>
                <td>${p.ticketname}</td>
                <td><frm:formatDate value="${p.begintime }"
							pattern="yyyy-MM-dd" /></td>
                <td>${p.price}</td>
                <td>${p.totalcount-p.ordercount}</td>
                <td>
                	<a href="updateUI?id=${p.ticketid }" style="cursor: hand;">修改</a> 
                	<a href="delete?id=${p.ticketid }" style="cursor: hand;">删除</a>
                </td>
            </tr>
            </c:forEach>            
        </table>
    </div>
</body>
</html>