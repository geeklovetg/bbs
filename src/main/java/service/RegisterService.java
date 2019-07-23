package service;

import dao.UserDao;
import mvc.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * @Author 极客浅风
 * @create 2019/7/20 10:11
 */
public class RegisterService {
    /**
     * 处理注册请求
     * @param request
     */
    public int Reg(HttpServletRequest request) {
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String username = request.getParameter("userName");
        String password = request.getParameter("password");
        String nickName=request.getParameter("nickName");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phone");
        UserDao userDao=new UserDao();
        int n=userDao.setUser(username,nickName,password,email,phoneNumber);
        return n;
    }
}
