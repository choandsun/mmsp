package mmsp;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

/**
 * Created by mohaiqiu on 2017/8/16.
 */
//@Configuration
//@EnableScheduling
public class MyTask {


    /**
     * cron格式
     * 秒 分钟 小时 日期 月份 星期 年(可选)
     * *代表任意
     *
     */
    @Scheduled(cron = "0/5 * * * * *")
    public void test1(){
        System.out.println("test1--"+new Date());
    }

}
