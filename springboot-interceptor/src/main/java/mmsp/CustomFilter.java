package mmsp;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by mohaiqiu on 2017/8/17.
 */
@WebFilter(filterName="customFilter",urlPatterns="/*")
public class CustomFilter implements Filter {

    @Override
    public void destroy() {
        System.out.println("CustomFilter过滤器销毁");

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("CustomFilter指定过滤器操作......");
        //执行操作后必须doFilter
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        System.out.println("CustomFilter初始化......");
    }
}
