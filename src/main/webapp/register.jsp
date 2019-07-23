<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cartoon BBS</title>
<!-- 设置ICO文件LOGO -->
<link rel="icon" href="images/favicon.ico" type="image/x-icon">
<!-- 设置收藏夹ICO文件LOGO -->
<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
<!-- 设置HEAD的CSS文件 -->
<link rel="stylesheet" type="text/css" href="css/head.css" />
<!-- 设置LOGIN的CSS文件 -->
<link rel="stylesheet" type="text/css" href="css/login.css" />
<!-- 设置REGISTER的CSS文件 -->
<link rel="stylesheet" type="text/css" href="css/register.css" />
</head>
<body>
  <!-- 头部-即：导航条 -->
  <c:import url="include/head.jsp"></c:import>
  
  <!-- 登录 -->
  <c:import url="include/login.jsp"></c:import>
  
  <!-- 注册 -->
  <div class="register">
    <form action="reg.do" method="post" >
      <p>
        <label for="userName">用户名</label>
        <input id="userName" name="userName" type="text" placeholder="请设置用户名(小于18字符)" required="required" maxlength="18">
      </p>
      <p>
        <label for="nickName">昵称</label>
        <input id="nickName" name="nickName" type="text" placeholder="请设置昵称(小于18字符)" required="required" maxlength="18">
      </p>
      <p>
        <label for="password">密码</label>
        <input id="password" name="password" type="password" placeholder="请设置登录密码(小于18字符)" required="required" maxlength="18">
      </p>
      <p>
        <label for="email">邮箱</label>
        <input id="email" name="email" type="email" placeholder="请设置邮箱(小于18字符)" required="required" maxlength="18">
      </p>
      <p>
        <label for="phone">手机</label>
        <input id="phone" name="phone" type="number" placeholder="请设置手机(等于11数字)" required="required" maxlength="11">
      </p>
      <p>
        <input type="submit" value="注册"  id="register_submit">
      </p>
    </form>
  </div>
  
  <!-- 设置JQ文件 -->
  <script type="text/javascript" src="jq/jquery-1.4.2.js"></script>
  <!-- 设置HEAD文件的JQ文件 -->
  <script type="text/javascript" src="jq/head.js"></script>
  <!-- 设置DELETELOGIN文件的JQ文件 -->
  <script type="text/javascript" src="jq/deleteLogin.js"></script>
  
</body>
</html>