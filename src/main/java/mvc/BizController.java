package mvc;

import com.sun.deploy.net.HttpResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 控制类，封装业务功能
 * @Author 极客浅风
 * @create 2019/7/17 17:20
 */
public class BizController {
    public String execute(HttpServletRequest request) {
        System.out.println("Hello");
        request.setAttribute("msg","hello");
        return "hello";
    }

    @RequestMapping("/list.do")
    public String list(HttpServletRequest request) {
        return "list";
    }

    /***
     * 负责处理login.do,返回登陆页面
     * @param request 返回
     * @return
     */

}
