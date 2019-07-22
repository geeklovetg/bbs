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
                        <h2>
                            Heading
                        </h2>
                        <p>
                            Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
                        </p>
                        <p>
                            <a class="btn" href="#">View details »</a>
                        </p>
                        <button type="button" class="btn btn-block btn-lg btn-info">发帖子</button>
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