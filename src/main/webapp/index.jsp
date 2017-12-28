<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: harbo
  Date: 2017/12/28
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询成绩 - TellYouWhat</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="container harbor-container">
    <h1><a href="index.jsp">西北大学第三方成绩查询</a></h1>
    <hr>
    <div class="harbor-body">
        <form action="${pageContext.request.contextPath}/queryAllGrade" method="post">
            <div class="form-group">
                <label for="student-number">学号：</label>
                <input id="student-number" title="学号" placeholder="10位纯数字"
                       maxlength="10" name="stu-num" class="form-control">
            </div>
            <button type="submit" class="btn btn-primary btn-lg">查询</button>
        </form>

        <%--@elvariable id="grades" type="java.util.List"--%>
        <c:if test="${grades != null}">
            <table class="table table-bordered table-hover">
                <tr>
                    <th>课程</th>
                    <th>成绩</th>
                </tr>
                    <%--@elvariable id="grades" type="java.util.List"--%>
                <c:forEach items="${grades}" var="grade">
                    <tr>
                        <td>${grade.extend1}</td>
                        <td>${grade.extend2}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </div>
    <footer>
        <div class="footer copyright">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <span>
                            Copyright &copy;
                            <a href="https://tellyouwhat.cn/">tellyouwhat.cn</a>
                        </span> |
                        <span>
                            项目源代码：
                            <a href="https://github.com/HarborZeng/NwuGradeTeller"
                               target="_blank">
                            https://github.com/HarborZeng/NwuGradeTeller
                            </a>
                        </span>
                    </div>
                </div>
            </div>
        </div>
    </footer>

</div>
</body>
</html>
