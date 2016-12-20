package com.baobaotao.test.quater;


import java.util.Date;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.SimpleTriggerImpl;
public class SimpleTriggerRunner {
	public static void main(String[] args) throws SchedulerException {
		JobDetail jobDetail=JobBuilder.newJob(SimpleJob.class).withIdentity("job1_1", "jgroup1").build();
		SimpleTriggerImpl trigger=new SimpleTriggerImpl();
		trigger.setName("trigger1_1");
		trigger.setGroup("tgroup1");
		trigger.setStartTime(new Date());
		trigger.setRepeatInterval(2000);
		trigger.setRepeatCount(200);
		Scheduler schduler=new StdSchedulerFactory().getScheduler();
		schduler.scheduleJob(jobDetail, trigger);
		schduler.start();
	}
}
