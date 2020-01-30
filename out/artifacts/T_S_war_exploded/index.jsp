<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 91413
  Date: 2020/1/24
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.0.0.js"></script>
  <script type="text/javascript">
    $(function () {
      var pageSize = ${pageInfo.pageSize};
      var pageNumber = ${pageInfo.pageNumber};
      var tname = "${pageInfo.t_name}";
      var sname = "${pageInfo.s_name}";
      //i表示循环角标，n表示迭代变量  n是dom对象
      //dom对象转换成jquery对象 ${dom对象}
      //jquery对象转换成dom对象  jquery对象[0]  jquery对象.get(0)
      $.each($(":radio"),function (i,n) {
        if ($(n).val()==pageSize){
          $(n).attr("checked","checked");
        }
      })
      $(":text[name='sname']").val(sname);
      $(":text[name='tname']").val(tname);
    //  执行查询点击事件
      $("button").click(function () {
        location.href="show?pageSize="+pageSize+"&pageNumber=1&t_name="+$(":text[name='tname']").val()+"&s_name="+$(":text[name='sname']").val();;
      })
    })
  </script>
  <body>
  <input type="radio" value="2" name="pageSize">2
  <input type="radio" value="3" name="pageSize">3
  <input type="radio" value="4" name="pageSize">4<br>
  学生姓名<input type="text" name="sname">
  老师姓名<input type="text" name="tname"><button>查询</button><br>
  <table border="1">
    <tr>
      <td>学生编号</td>
      <td>学生姓名</td>
      <td>年龄</td>
      <td>任课老师</td>
    </tr>
    <c:forEach items="${pageInfo.list}" var="student">
      <tr>
        <td>${student.id}</td>
        <td>${student.s_name}</td>
        <td>${student.s_age}</td>
        <td>${student.teacher.t_name}</td>
      </tr>
    </c:forEach>
  </table>
  <a href="">上一页</a><a href="">下一页</a>
  </body>
</html>
