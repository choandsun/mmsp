package mmsp;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.concurrent.ScheduledFuture;

/**
 * Created by mohaiqiu on 2017/8/16.
 */
@EnableScheduling
@RestController
public class CRUDTask {


    String cron = "0/5 * * * * *";

    @Resource
    ThreadPoolTaskScheduler threadPoolTaskScheduler;


    ScheduledFuture<?> scheduledFuture;


    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler(){
        return new ThreadPoolTaskScheduler();
    }

    /**
     * 定义任务内容
     */
    private class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("test3 -- "+new Date());
        }
    }

    @RequestMapping("/crudTask")
    public void start(String cmd){
        if(cmd.equals("start")){
            if (scheduledFuture != null){
                scheduledFuture.cancel(true);
            }
            scheduledFuture = threadPoolTaskScheduler.schedule(new MyRunnable(), new CronTrigger(cron));
        }

        if(cmd.equals("stop")){
            if (scheduledFuture != null){
                scheduledFuture.cancel(true);
            }
        }

        if(cmd.equals("update")){
            if (scheduledFuture != null){
                scheduledFuture.cancel(true);
            }
            cron = "0/10 * * * * *";
            scheduledFuture = threadPoolTaskScheduler.schedule(new MyRunnable(), new CronTrigger(cron));
        }

    }




}
