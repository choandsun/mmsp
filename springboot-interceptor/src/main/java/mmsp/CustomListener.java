package mmsp;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by mohaiqiu on 2017/8/17.
 */
@WebListener
public class CustomListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent servletContext) {
        System.out.println("servletContext销毁......");

    }

    @Override
    public void contextInitialized(ServletContextEvent servletContext) {
        System.out.println("servletContext初始化......");
    }
}
