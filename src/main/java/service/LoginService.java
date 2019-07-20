package service;

import dao.UserDao;
import entity.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author 极客浅风
 * @create 2019/7/20 10:33
 */
public class LoginService {
    public int login(HttpServletRequest request) {
        //获取用户提交表单
        String username = request.getParameter("name");
        String password = request.getParameter("pwd");
        System.out.println("用户请求登陆");
        //根据用户名查找对应的用户信息
        UserDao userDao=new UserDao();
        User user=userDao.findByName(username);

        //根据用户信息判断是否登陆成功
        if (user==null) {
            request.setAttribute("msg","登陆失败！账户或密码错误");
            return 0;
        }

        if (user.getPassword().equals(password)) {
            request.setAttribute("msg","登陆成功！");
            return 1;
        }

        request.setAttribute("msg","登陆失败！账户或密码错误");
        System.out.println("账户或密码错误");
        return 0;
    }
}
