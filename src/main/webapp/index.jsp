<%@ page import="entity.Topic" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>滑稽贴吧</title>
<!-- 设置ICO文件LOGO -->
<link rel="icon" href="images/favicon.ico" type="image/x-icon">
<!-- 设置收藏夹ICO文件LOGO -->
<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
<!-- 导入头部样式 -->
<link rel="stylesheet" type="text/css" href="css/head.css" />
<!-- 导入中部样式 -->
<link rel="stylesheet" type="text/css" href="css/content.css" />
<!-- 导入返回顶部样式 -->
<link rel="stylesheet" type="text/css" href="css/backtotop.css" />
<!-- 导入JQ资源库 -->
<script type="text/javascript" src="js/jquery-1.4.2.js"></script>
<!-- 导入登录JQ代码 -->
<script type="text/javascript" src="js/login.js"></script>
<!-- 导入返回顶部JQ代码 -->
<script type="text/javascript" src="js/top.js"></script>
    <!-- 导入屏幕自适应CSS文件 -->
    <link rel="stylesheet" type="text/css" href="css/auto.css" />
</head>
<body>
  <!-- 导入导航条 -->
  <c:import url="pages/head.jsp"></c:import>
  <!-- 正文内容 -->
  <div class="content">
  <div class="left_navigation">
        <ul>
          <!-- 最多放10个 -->
          <li style="background-color:#f44444;"><a href="" style="color:white; ">推荐</a></li>
          <li><a href="">游戏开发</a></li>
        </ul>
   </div>
     <div class="right_content">
      <ul>
        <!-- 帖子框最多放6个 -->
          <%List<Topic> list=(List<Topic>) request.getAttribute("list");%>
          <%for (Topic topic:list) {%>
          <li>
              <div class="invitation">
                  <div  class="invitation_title">
                      <h2>
                          <a href=""><%=topic.getTtopic()%></a>
                      </h2>
                  </div>
                  <div class="invitation_content">
                      <p><%=topic.getTcontent()%></p>
                  </div>
                  <div class="invitation_bottom">
                      <span><%=topic.getTauthor()%></span>
                      <%SimpleDateFormat sdf=new SimpleDateFormat("YYYY年MM月dd日 hh时mm分");%>
                      <span><%=sdf.format(topic.getTpublishtime())%></span>
                      <div style="margin-left: 250px;">阅读数 <%=topic.getTclickcount()%></div>
                      <div>评论数 <%=topic.getTreplycount()%></div>
                  </div>
              </div>
          </li>
          <%}%>


        <!-- 底部页码 -->
        <li class="page_number">
          <span>总共5页</span>
          <a href="#">1</a>
          <a href="">2</a>
          <a href="">3</a>
          <a href="">4</a>
          <a href="">5</a>
        </li>
      </ul>
     </div>

     <!-- 右边推荐最多放8个 -->
     <div class="right_message">
      <h3>今日推荐</h3>
      <div>
        <ul>
          <li>
            <a href=""><img src="images/1.png"></a>
            <span><a href="">Libra硬刚微信、支付宝? 你也试试!</a></span>
          </li>
        </ul>
      </div>
     </div>

     <!-- 导入返回顶部按钮 -->
     <c:import url="pages/backtotop.jsp"></c:import>
  </div>

</body>
</html>