<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>滑稽贴吧</title>
<!-- 设置ICO文件LOGO -->
<link rel="icon" href="../images/favicon.ico" type="image/x-icon">
<!-- 设置收藏夹ICO文件LOGO -->
<link rel="shortcut icon" href="../images/favicon.ico" type="image/x-icon">
<!-- 导入登录样式 -->
<link rel="stylesheet" type="text/css" href="../css/login.css" />
</head>
<body>
  <!-- 注册 -->
  <div class="login">
    <form action="../login.do" method="post" >
      <h1>用户登录</h1>
      <p>
        <label for="userName">用户名</label>
        <c:choose>
          <c:when test="${user==null || user=='' || user==' '}">
             <input name="userName" id="userName" type="text" required placeholder="请设置用户名(小于18字符)" required="required" maxlength="18">
          </c:when>
          <c:otherwise>
            <input name="userName" id="userName" type="text" required placeholder="请设置用户名(小于18字符)" required="required" maxlength="18" style="border: 1px #f44444 solid;">
            <span>此处添加错误信息</span>
          </c:otherwise>
        </c:choose>
      </p>
      <p>
        <label for="password">密码</label>
        <c:choose>
          <c:when test="${user==null || user=='' || user==' '}">
             <input name="password" id="password" type="password" required placeholder="请设置登录密码(小于18字符)" required="required" maxlength="18">
         </c:when>
          <c:otherwise>
            <label for="password">密码</label>
            <input name="password" id="password" type="password" required placeholder="请设置登录密码(小于18字符)" required="required" maxlength="18" style="border: 1px #f44444 solid;">
            <span>此处添加错误信息</span>
          </c:otherwise>
        </c:choose>
      </p>
      <p>
        <input type="checkbox" id="remembe" value="autoLogin">
        <label for="remembe" class="remembe_lable">下次自动登录</label>
        <a href="./register.jsp" class="remembe_a">注册</a>
      </p>
      <p>
        <input type="submit" value="登录"  id="login_submit">
      <p>
    </form>
  </div>
</body>
</html>