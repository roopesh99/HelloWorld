package QuartzJob.quartzjobexecution;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzMain {

	public static void main(String[] args) throws SchedulerException {
	
		//Define a job and tie to our job class
		
	JobDetail job =JobBuilder.newJob(Quartzjob.class).build();
		
  //  Trigger t1= TriggerBuilder.newTrigger().withIdentity("Simple Trigger").startNow().build();

	
    Trigger t1= TriggerBuilder.newTrigger().withIdentity("Cron Trigger").withSchedule(CronScheduleBuilder.cronSchedule("0 0/1 * 1/1 * ? *")).build();
	
	
    Scheduler sc =StdSchedulerFactory.getDefaultScheduler();
	
   sc.start();
   
   sc.scheduleJob(job, t1);
   
	}
}