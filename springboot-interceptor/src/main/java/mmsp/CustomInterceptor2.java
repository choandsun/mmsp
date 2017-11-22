package mmsp;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by mohaiqiu on 2017/8/17.
 */
public class CustomInterceptor2 implements HandlerInterceptor {


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object,
                                Exception exception) throws Exception {
        //在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
        System.out.println("3. 整个请求结束之后被调用......CustomInterceptor2......");
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView view)
            throws Exception {
        // 请求处理之后进行调用，但是在视图被渲染之前
        System.out.println("2. 请求处理之后进行调用，但是在视图被渲染之前......CustomInterceptor2......");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
        // 在请求处理之前进行调用
        System.out.println("1. 在请求处理之前进行调用......CustomInterceptor2......");
        // 只有返回true才会继续向下执行，返回false取消当前请求
        return true;
    }
}
