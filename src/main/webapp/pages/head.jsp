<%@ page import="entity.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <div class="navigation_bars">
    <ul>
      <li class="navigation_bars_logo">
      <a><img alt="" src="images/logo.png"></a>
      </li>
      <li><a href="../index.jsp">首页</a></li>
      <li><a href="">原创</a></li>
      <li><a href="">公告</a></li>
      <li><a href="">技术</a></li>
      <li><a href="">交流</a></li>
      <li><a href="">娱乐</a></li>
      <li><a href="">问答</a></li>
      <li><a href=""></a></li>
      <li><a href=""></a></li>
      <li><a href=""></a></li>
      <li><a href=""></a></li>
      <li><a href=""></a></li>

      <li class="navigation_bars_logo_search">
      <input type="text" placeholder="滑稽贴吧" />
      <img src="images/search.jpg">
      </li>
      <li><a></a></li>
      <li><a></a></li>
      <li>

          <c:if test="${user==null}">
            <a href="pages/login.jsp" id="login" target="_bank">登录</a>
          </c:if>
          <c:if test="${user!=null}">
            <a  id="login" style="cursor: pointer;">${user.nickname}</a>
          </c:if>

        <div class="navigation_bars_login">
          <ul>
            <li><a href="">个人信息</a></li>
            <li><a href="">修改密码</a></li>
            <li><a href="mypage.do?uid=${user.uid}">我的帖子</a></li>
            <li><a href="">注销</a></li>
          </ul>
        </div>
      </li>
      <li><a href="pages/register.jsp" target="_bank">注册</a></li>
    </ul>
  </div>
  <div class="clear" id="top"></div>
