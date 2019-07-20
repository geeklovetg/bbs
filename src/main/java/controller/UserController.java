package controller;

import dao.UserDao;
import entity.User;
import mvc.RequestMapping;
import service.LoginService;
import service.RegisterService;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 极客浅风
 * @create 2019/7/17 19:01
 */
public class UserController {
    @RequestMapping("/list.do")
    public String list(HttpServletRequest request) {
        UserDao dao=new UserDao();
        List<User> list = dao.findAll();
        Map<String,String> names = new HashMap<>();
        for (User user : list) {
            names.put(user.getUsername(),user.getPassword());
            System.out.println(user);
        }
        //利用request对象将数据共享但JSP页面
        request.setAttribute("list", list);
        request.setAttribute("names",names);
        return "list";
    }

    @RequestMapping("/login.do")
    public String login(HttpServletRequest request) {
        LoginService loginService=new LoginService();
        int n=loginService.login(request);
        if (n==1) {
            System.out.println("登陆成功");
            return "index";
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
}
