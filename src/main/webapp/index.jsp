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
  <script type="text/javascript">
    $(function () {
      window.onload=function(){
        alert("页面加载")
        $.ajax({
          url:"index.do",//请求的url地址
          dataType:"json",//返回的格式为json
          async:true,//请求是否异步，默认true异步，这是ajax的特性
          type:"GET",//请求的方式
          success:function(msg){console.log(msg)}//请求成功的处理
        });
      }
    })

  </script>
</head>
<body>
  <!-- 头部-即：导航条 -->
  <c:import url="include/head.jsp"/>

  <!-- 登录 -->
  <c:import url="include/login.jsp"/>
  
  <!-- 设置JQ文件 -->
  <script type="text/javascript" src="jq/jquery-1.4.2.js"></script>
  <!-- 设置HEAD文件的JQ文件 -->
  <script type="text/javascript" src="jq/head.js"></script>
  <!-- 设置DELETELOGIN文件的JQ文件 -->
  <script type="text/javascript" src="jq/deleteLogin.js"></script>


  <script type="text/javascript" src="jq/login.js"></script>
</body>
</html>