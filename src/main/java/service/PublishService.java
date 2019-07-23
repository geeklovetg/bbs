package service;

import dao.TopicDao;
import entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;

/**
 * 发表帖子功能
 * @Author 极客浅风
 * @create 2019/7/22 15:50
 */
public class PublishService {
    public int publishArtical(HttpServletRequest request) {
        TopicDao topicDao=new TopicDao();
        HttpSession httpSession = request.getSession(true);
        User user=(User)httpSession.getAttribute("loginUser");
        System.out.println(user);
        //进行转码
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        // 定义当前时间
        //设置日期格式,并转转换成sql.date
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        int n=topicDao.CreateTopic(1,1,user.getUid(),request.getParameter("title"),request.getParameter("content"),0,0,timestamp,null);
        return n;
    }
}
