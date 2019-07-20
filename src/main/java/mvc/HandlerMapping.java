package mvc;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 极客浅风
 * @create 2019/7/17 17:31
 */
public class HandlerMapping {
    /**
     * map用于映射请求path到对应的请求处理器
     * 如：将/emp/list.do 映射到bizController.list方法中
     */
    private Map<String, RequestHandler> map = new HashMap<>();
    public void init(String className) {

        try {
            Class cls = Class.forName(className);
            Method[] methods=cls.getDeclaredMethods();
            Object controller=cls.newInstance();
            for (Method method : methods) {
                RequestMapping ann = method.getAnnotation(RequestMapping.class);
                if (ann!=null) {
                    //找到注解上标注的路径
                    String path=ann.value();
                    //创建请求处理器对象，封装控制器对象和方法
                    RequestHandler handler = new RequestHandler(controller, method);
                    //请求路径和对应的“请求处理器”添加到map
                    map.put(path, handler);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }

    public RequestHandler get(String path) {
        return map.get(path);
    }

    /**
     * 用于根据path执行对应控制器方法
     * @param path 请求路径
     * @param request   执行控制器时候的参数
     * @return 控制器执行以后的返回值
     */
    public String execute(String path, HttpServletRequest request) {
        RequestHandler handler = get(path);
        Method method=handler.getMethod();
        Object controller = handler.getController();
        try {
            Object val = method.invoke(controller, request);
            String value=(String)val;
            return value;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException("非法访问实例");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            throw new RuntimeException("调用目标异常");
        }

    }

}
