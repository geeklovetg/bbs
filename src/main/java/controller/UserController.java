package controller;

import dao.UserDao;
import entity.Topic;
import entity.User;
import mvc.RequestMapping;
import service.LoginService;
import service.RegisterService;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 极客浅风
 * @create 2019/7/17 19:01
 */
public class UserController {

    @RequestMapping("/login.do")
    public String login(HttpServletRequest request) {
        LoginService loginService=new LoginService();
        int n=loginService.login(request);
        if (n==1) {
            System.out.println("登陆成功");
            return "sendRedirect:index";
        }
        return "login";
    }

    @RequestMapping("/reg.do")
    public String reg(HttpServletRequest request) {
        RegisterService reg=new RegisterService();
        int n=reg.Reg(request);
        if (n==1) {
            System.out.println("注册成功");
            return "sendRedirect:index";
        }
        return "register";
    }

    @RequestMapping("/mypage.do")
    public String myPage(HttpServletRequest request) {
        UserService userService=new UserService();
        List<Topic> list=userService.ShowMyPage(request);
        request.setAttribute("list",list);
        return "mypage";
    }
}
