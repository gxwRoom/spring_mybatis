<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
    <h3>查询用户信息</h3>
    <hr/>
    <!--遍历集合-->
    <table border="1px" style="text-align: center">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>生日</td>
            <td>性别</td>
            <td>住址</td>
        </tr>
        <%--@elvariable id="list" type="java.util.List"--%>
        <c:forEach items="${list}" var="u">
            <tr>
                <td>${u.id}</td>
                <td>${u.username}</td>
                <td>${u.birthday}</td>
                <td>${u.sex}</td>
                <td>${u.address}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
