package mvc; /**
 * @Author 极客浅风
 * @create 2019/7/17 17:42
 */

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.io.InputStream;
import java.util.List;

@WebListener()
public class ContextConfigListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    // Public constructor is required by servlet spec
    public ContextConfigListener() {
    }

    public HandlerMapping loadControllers(String xml) {
        SAXReader reader = new SAXReader();
        InputStream in = ContextConfigListener.class.getClassLoader().getResourceAsStream(xml);
        try {
            Document doc=reader.read(in);
            //beans
            Element root=doc.getRootElement();
            List<Element> list = root.elements("bean");
            HandlerMapping mapping=new HandlerMapping();
            for (Element element : list) {

                String className=element.attributeValue("class");
                mapping.init(className);
            }
            System.out.println("初始化成功");
            return mapping;
        } catch (DocumentException e) {
            e.printStackTrace();
            throw new RuntimeException("读取文件失败");
        }

    }
    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    @Override
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
        ServletContext ctx= sce.getServletContext();
        String contextPath= ctx.getContextPath();
        ctx.setAttribute("root",contextPath);
        HandlerMapping mapping=loadControllers("beans.xml");
        ctx.setAttribute("handlerMapping",mapping);
        System.out.println("初始化了HandlerMapping对象");
        System.out.println("初始化了root");
        System.out.println("ServletContext初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    @Override
    public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.
      */
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attibute
         is replaced in a session.
      */
    }
}
