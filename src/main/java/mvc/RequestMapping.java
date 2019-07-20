package mvc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author 极客浅风
 * @create 2019/7/17 17:34
 */

/**
 * 标注在控制器方法上
 * 用途：将请求url地址映射到当前的方法上
 * 英文翻译： Request 请求  Mapping 映射
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//将请求url地址映射到方法上
public @interface RequestMapping {
    public String value();
}
