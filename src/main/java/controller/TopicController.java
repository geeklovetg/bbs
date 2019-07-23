package controller;

import entity.Topic;
import mvc.RequestMapping;
import service.PublishService;
import service.ShowTopicService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author 极客浅风
 * @create 2019/7/20 16:30
 */
public class TopicController {
    @RequestMapping("/index.do")
    public String show(HttpServletRequest request) {
        ShowTopicService showTopicService=new ShowTopicService();
        List<Topic> list=showTopicService.showAll();
        request.setAttribute("list",list);
        return "index";
    }

    @RequestMapping("/publish.do")
    public String publish(HttpServletRequest request) {
        PublishService publishService=new PublishService();
        publishService.publishArtical(request);
        return "sendRedirect:index";
    }

    @RequestMapping("/piece.do")
    public String showOne(HttpServletRequest request) {
        ShowTopicService topicService=new ShowTopicService();
        Topic topic=topicService.showByTid(request);
        request.setAttribute("topic",topic);
        return "piece";
    }

}
