<%@ page import="entity.Topic" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cartoon BBS</title>
    <!-- 设置ICO文件LOGO -->
    <link rel="icon" href="../images/favicon.ico" type="image/x-icon">
    <!-- 设置收藏夹ICO文件LOGO -->
    <link rel="shortcut icon" href="../images/favicon.ico" type="image/x-icon">
    <!-- 设置HEAD的CSS文件 -->
    <link rel="stylesheet" type="text/css" href="../css/head.css" />
    <!-- 设置LOGIN的CSS文件 -->
    <link rel="stylesheet" type="text/css" href="../css/login.css" />
    <!-- Latest compiled and minified CSS & JS -->
    <link rel="stylesheet" type="text/css" href="css/contents_body.css">
    <link rel="stylesheet" media="screen" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<!-- 头部-即：导航条 -->
<c:import url="include/head.jsp"/>
<div class="all_content">
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="row clearfix">
                    <div class="col-md-2 column">
                    </div>
                    <div class="col-md-8 column">
                        <%Topic topic =(Topic) request.getAttribute("topic");%>

                        <h1><%=topic.getTtopic()%></h1>
                        <p id="signature">
                            <%SimpleDateFormat sdf=new SimpleDateFormat("YYYY年MM月dd日 hh:mm");%>
                            <%="日期："+sdf.format(topic.getTpublishtime())%>
                            <%="作者："+topic.getTauthor()%>
                        </p>
                        <p><%=topic.getTcontent()%></p>
                    </div>


                </div>
            </div>
        </div>
    </div>
</div>

<!-- 登录 -->
<c:import url="include/login.jsp"/>



<!-- 设置JQ文件 -->
<script type="text/javascript" src="jq/jquery-1.4.2.js"></script>
<!-- 设置HEAD文件的JQ文件 -->
<script type="text/javascript" src="jq/head.js"></script>
<!-- 设置DELETELOGIN文件的JQ文件 -->
<script type="text/javascript" src="jq/deleteLogin.js"></script>

</body>
</html>