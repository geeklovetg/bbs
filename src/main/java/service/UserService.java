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
    public List<Topic> showMyPage(HttpServletRequest request) {
        User user = userConfirm(request);
        if (user == null) {
            return null;
        }
        TopicDao topicDao=new TopicDao();
        List<Topic> list=topicDao.findAllByUid(user.getUid());
        return list;
    }

    /**
     * 判断用户是否已登陆
     * @param request
     * @return 返回user对象或者null
     */
    public User userConfirm(HttpServletRequest request) {
        HttpSession httpSession=request.getSession(true);
        User user=(User)httpSession.getAttribute("user");
        return user;
    }

    /**
     * 删除我的帖子
     * @param request
     * @return 1为成功，0为失败，-1为未登陆
     */
    public int deleteMyPage(HttpServletRequest request) {
        User user = userConfirm(request);
        if (user == null) {
            return -1;
        }
        /*
            判断文章的tuid和用户的uid是否对应再进行删除操作
         */

        if (user.getUid()==Integer.parseInt(request.getParameter("tuid"))) {
            TopicDao topicDao=new TopicDao();
            int n=topicDao.delete(Integer.parseInt(request.getParameter("tid")));
            return n;
        }
        return 0;
    }
}
