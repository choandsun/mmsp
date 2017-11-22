package mmsp;

import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by mohaiqiu on 2017/8/16.
 */
//@RestController
//@EnableScheduling
public class UpdateTaskCron implements SchedulingConfigurer {

    String cron = "0/5 * * * * *";


    @RequestMapping("/upcron")
    public void upCron () {
        cron = "0/10 * * * * *";
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("test2----"+new Date());
            }
        };
        Trigger trigger = new Trigger() {
            @Override
            public Date nextExecutionTime(TriggerContext triggerContext) {
                CronTrigger cronTrigger = new CronTrigger(cron);
                return cronTrigger.nextExecutionTime(triggerContext);
            }
        };


        scheduledTaskRegistrar.addTriggerTask(runnable,trigger);
    }
}
