<%@ page import="entity.Topic" %>
<%@ page import="java.util.List" %>
<%@ page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
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
<!-- 设置CONTENTS的CSS文件 -->
<link rel="stylesheet" type="text/css" href="css/contents_body.css" />
<!-- 设置LOGIN的CSS文件 -->
<link rel="stylesheet" type="text/css" href="css/login.css" />
<!-- 设置BootStrap的CSS文件 -->
  <link rel="stylesheet" media="screen" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"/>
  <script type="text/javascript">

      /*window.onload=function(){
        $.ajax({
          url:"index.do",//请求的url地址
          dataType:"json",//返回的格式为json
          async:true,//请求是否异步，默认true异步，这是ajax的特性
          type:"GET",//请求的方式
          success:function(msg){console.log(msg)}//请求成功的处理
        });
      }*/


  </script>
</head>
<body>
  <!-- 头部-即：导航条 -->
  <c:import url="include/head.jsp"/>
  <!-- 登录 -->
  <c:import url="include/login.jsp"/>
  <div class="all_content">
    <div class="container">
      <div class="row clearfix">
        <div class="col-md-12 column">
          <div class="row clearfix">
            <div class="col-md-2 column">
            </div>
            <div class="col-md-8 column">
              <%List<Topic> list =(List<Topic>) request.getAttribute("list");%>
                <%for (Topic topic:list) {%>
                <div class="topic_style">
                <h2>
                  <%=(topic.getTtopic())%>
                </h2>
                <p class="comment_inner">
                  <%=(topic.getTcontent())%>
                </p>
                  <p>
                    <%=(topic.getTpublishtime()).toString().substring(0,19)%>
                  </p>
                </div>
                <%}%>
              <div>
                <h4>发表新帖</h4>
                <form action="publish.do" method="post">
                  <input type="text" name="title" id="inputID" class="form-control" value="" title="" required="required" placeholder="请输入主题">
                  <br>
                  <textarea  name="content" id="" cols="104" rows="10" required="required"></textarea>
                  <button type="submit" class="btn btn-block btn-lg btn-info">发帖子</button>
                </form>

              </div>



              



          </div>
        </div>
      </div>
    </div>
  </div>
  </div>
  <!-- 设置JQ文件 -->
  <script type="text/javascript" src="jq/jquery-1.4.2.js"></script>
  <!-- 设置HEAD文件的JQ文件 -->
  <script type="text/javascript" src="jq/head.js"></script>
  <!-- 设置DELETELOGIN文件的JQ文件 -->
  <script type="text/javascript" src="jq/deleteLogin.js"></script>
  <script type="text/javascript" src="jq/login.js"></script>
</body>
</html>