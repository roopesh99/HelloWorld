package QuartzJob.quartzjobexecution;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Quartzjob implements Job{

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("Hello people");
		
		System.out.println("System timestamp: "+new Date());
	}

}
