package controller;

import mvc.RequestMapping;

/**
 * @Author 极客浅风
 * @create 2019/7/20 16:30
 */
public class TopicController {
    @RequestMapping("/index.do")
    public String show() {
        return "index";
    }
}
