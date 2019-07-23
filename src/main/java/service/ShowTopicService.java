package service;

import dao.TopicDao;
import entity.Topic;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 * @Author 极客浅风
 * @create 2019/7/20 17:25
 */
public class ShowTopicService {
    /**
     * 显示所有帖子
     * @return 帖子对象集合
     */
    public List<Topic> showAll() {
        TopicDao topicDao=new TopicDao();
        List<Topic> list=topicDao.ShowAllTopic();
        return list;
    }

    /**
     * 根据帖子id显示
     * @return topic对象
     */
    public Topic showByTid(HttpServletRequest request) {
        TopicDao topicDao=new TopicDao();
        int tid=Integer.parseInt(request.getParameter("tid"));
        Topic topic=topicDao.showTopic(tid);
        return topic;
    }
}
