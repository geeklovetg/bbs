<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<div id="bg"></div>
<div class="login">
  <a id="deleteLogin">×</a>
  <form action="" method="post">
    <p>
      <label for="name">用户名</label> <input id="name" name="name" type="text" placeholder="设置用户名(小于18字符)" required="required" maxlength="18">
    </p>
    <p>
      <label for="pwd">密码</label> <input id="pwd" name="pwd" type="password" placeholder="设置密码(小于18字符)" required="required" maxlength="18">
    </p>
    <p>
      <input id="autoLogin" type="checkbox" checked="checked"> 
      <label id="auto" for="autoLogin">下次自动登录</label> 
      <a href="register.jsp">注册</a>
    </p>
    <p>
      <input id="login_submit" type="submit" value="登录">
    </p>
  </form>
</div>