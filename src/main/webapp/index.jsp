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
  </head>
  <body>
  <div>
    <form action="${pageContext.request.contextPath}/queryAllGrade" method="post">
      <label for="student-number">学号：</label>
      <input id="student-number" title="学号" maxlength="10" name="stu-num">
      <button type="submit" >查询</button>
    </form>
  </div>
  </body>
</html>
