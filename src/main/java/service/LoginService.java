package service;

import dao.UserDao;
import entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author 极客浅风
 * @create 2019/7/20 10:33
 */
public class LoginService {
    public int login(HttpServletRequest request) {
        //获取用户提交表单
        String username = request.getParameter("userName");
        String password = request.getParameter("password");
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
            // 设置session 服务器端保存登录用户信息
            HttpSession session = request.getSession(true);
            // session是key-value格式
            // 把user_id作为key,value是user对象
            session.setAttribute("user",user);
            return 1;
        }

        request.setAttribute("msg","登陆失败！账户或密码错误");
        System.out.println("账户或密码错误");
        return 0;
    }
}
