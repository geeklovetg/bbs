package service;

import dao.TopicDao;
import entity.Topic;
import entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author 极客浅风
 * @create 2019/7/22 20:14
 */
public class UserService {
    /**
     * 显示个人帖子信息
     * @return 返回帖子对象集合
     */
    public List<Topic> ShowMyPage(HttpServletRequest request) {
        HttpSession httpSession=request.getSession(true);
        User user=(User)httpSession.getAttribute("loginUser");
        if (user==null) {
            System.out.println("未获取到用户对象");
            return null;
        }
        TopicDao topicDao=new TopicDao();
        List<Topic> list=topicDao.findAllByUid(user.getUid());
        return list;
    }
}
