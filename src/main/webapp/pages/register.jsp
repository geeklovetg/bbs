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
<!-- 导入注册样式 -->
<link rel="stylesheet" type="text/css" href="../css/register.css" />
<!-- 导入JQ资源库 -->
<script type="text/javascript" src="../js/jquery-1.4.2.js"></script>
<!-- 导入注册JQ代码 -->
<script type="text/javascript" src="../js/register.js"></script>
</head>
<body>
  <!-- 注册 -->
  <div class="register">
    <form action="../reg.do" method="post">
      <h1>用户注册</h1>
      <p>
        <label for="userName">用户名</label>
        <input name="userName" id="userName" type="text" required placeholder="请设置用户名(小于18字符)" maxlength="18">
        <span></span>
      </p>
      <p>
        <label for="nickName">昵称</label>
        <input name="nickName" id="nickName" type="text" required placeholder="请设置昵称(小于18字符)" maxlength="18">
        <span></span>
      </p>
      <p>
        <label for="password">密码</label>
        <input name="password" id="password" type="password" required placeholder="请设置登录密码(小于18字符)" maxlength="18">
        <span></span>
      </p>
      <p>
        <label for="email">邮箱</label>
        <input name="email" id="email" type="email" required placeholder="请设置邮箱(小于18字符)" maxlength="18">
        <span></span>
      </p>
      <p>
        <label for="phone">手机</label>
        <input name="phone" id="phone" type="number" required placeholder="请设置手机(等于11数字)" maxlength="11">
        <span></span>
      </p>
      <p>
        <input type="submit" value="注册"  id="register_submit">
      </p>
    </form>
  </div>
</body>
</html>