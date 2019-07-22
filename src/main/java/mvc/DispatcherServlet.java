package mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 单一前端控制器
 * 负责接收请求，处理与Http协议相关
 * 为了增加广泛的实用性，可以处理任何的*.do请求
 * 将请求URL设置为*.do
 * @Author 极客浅风
 * @create 2019/7/17 17:30
 */
@WebServlet(name = "DispatcherServlet",urlPatterns = "*.do")
public class DispatcherServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("接收到用户post请求");
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HandlerMapping mapping=(HandlerMapping) getServletContext().getAttribute("handlerMapping");
        //获取用户请求路径
        String pth=request.getServletPath();
        System.out.println(pth);
        String target=mapping.execute(pth, request);
        System.out.println(target);
        //将目标页面名称前后增加JSP文件的位置和后缀
        String redirect = "sendRedirect:";
        String show = "show:";
        try {
            //重定向
            if (target.startsWith(redirect)) {
                System.out.println("重定向");
                String path =  target.substring(13) + ".jsp";
                System.out.println(path);
                response.sendRedirect(path);
                return;
            }
            if (target.startsWith(show)) {
                System.out.println("异步刷新数据");
                String path =  target.substring(5) + ".jsp";
                System.out.println(path);
                return;
            }
            //转发,调用业务方法，根据业务方法的返回值转发到JSP
            String path =  target + ".jsp";
            request.getRequestDispatcher(path).forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
            /*
                抛出一个ServletException,这个异常
                作用是，将异常e抛给Web容器，Web容器会
                显示500页面错误页面到浏览器
             */
            throw new ServletException("分发错误");
        }
    }
}
