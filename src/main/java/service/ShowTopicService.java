package service;

import dao.TopicDao;
import entity.Topic;

import java.util.List;

/**
 *
 * @Author 极客浅风
 * @create 2019/7/20 17:25
 */
public class ShowTopicService {
    public List<Topic> show() {
        TopicDao topicDao=new TopicDao();
        List<Topic> list=topicDao.ShowAllTopic();
        return list;
    }
}
