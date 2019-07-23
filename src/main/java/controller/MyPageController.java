package controller;

import entity.Topic;
import mvc.RequestMapping;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 个人帖子控制器
 * @Author 极客浅风
 * @create 2019/7/23 10:18
 */
public class MyPageController {
    @RequestMapping("/delete.do")
    public String userDelete(HttpServletRequest request) {
        UserService userService=new UserService();
        int n=userService.deleteMyPage(request);
        return "sendRedirect:mypage";
    }

    @RequestMapping("/mypage.do")
    public String myPage(HttpServletRequest request) {
        UserService userService=new UserService();
        List<Topic> list=userService.showMyPage(request);
        request.setAttribute("list",list);
        return "mypage";
    }
}
