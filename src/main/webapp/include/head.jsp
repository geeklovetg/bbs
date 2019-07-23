<%@ page import="entity.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<div id="navigation" class="navigation">
  <a href="index.do"><img alt="图片加载失败" src="images/logo.png"></a>
  <ul class="navigation_ul_left">
    <li><a href="index.do">首页</a></li>
    <li><a href="#">原创版</a></li>
    <li><a href="#">公告板</a></li>
    <li><a href="#">技术版</a></li>
    <li><a href="#">交流版</a></li>
    <li><a href="#">娱乐版</a></li>
    <li><a href="#">问答版</a></li>
  </ul>
  <ul class="navigation_ul_right" style="margin-top: -10px;">
    <li><a href="register.jsp">注册</a></li>
    <li><a id="login">登录</a></li>
    <li class="ui">
      <a id="ui">
        <%User user=(User)session.getAttribute("loginUser");%>
        <%if(user!=null){%>
          <%=user.getNickname()%>
        <%}%>
      </a>
      <div>
        <a href="">个人信息</a>
        <a href="">修改密码</a>
        <a href="mypage.do">我的帖子</a>
        <a href="">注销</a>
      </div>
    </li>
    <li id="seek">
      <div class="navigation_search_div">
        <input type="text" class="navigation_search" placeholder="Cartoon  BBS">
        <a href="#"> 
          <img alt="图片加载失败" src="images/search.jpg" class="navigation_search_a_img">
        </a>
      </div>
    </li>
  </ul>
</div>
<!-- 清除浮动 -->
<div class="clear"></div>