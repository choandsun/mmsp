package mmsp;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by mohaiqiu on 2017/8/17.
 */
public class SessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent session) {
        System.out.println("session创建成功......");

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent session) {
        System.out.println("session销毁......");

    }
}
