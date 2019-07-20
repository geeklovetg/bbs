package mvc;

import java.lang.reflect.Method;

/**
 * Handler 处理器
 * 请求处理器，用于处理用户请求的
 * 封装控制器对象和业务控制器上的业务方法
 * @Author 极客浅风
 * @create 2019/7/17 17:32
 */
public class RequestHandler {
    private Object controller;
    private Method method;

    public RequestHandler() {
    }

    public RequestHandler(Object controller, Method method) {
        this.controller = controller;
        this.method = method;
    }

    @Override
    public String toString() {
        return "RequestHandler{" +
                "controller=" + controller +
                ", method=" + method +
                '}';
    }

    public Object getController() {
        return controller;
    }

    public void setController(Object controller) {
        this.controller = controller;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }
}
