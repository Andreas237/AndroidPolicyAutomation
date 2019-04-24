// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import java.util.concurrent.*;

public class TimerOnce
{

	public TimerOnce(ScheduledExecutorService scheduledexecutorservice, Runnable runnable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		scheduler = scheduledexecutorservice;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field ScheduledExecutorService scheduler>
		command = runnable;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Runnable command>
		isRunning = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #23  <Field boolean isRunning>
	//   11   19:return          
	}

	public long getFireIn()
	{
		if(waitingTask == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field ScheduledFuture waitingTask>
	//*   2    4:ifnonnull       9
			return 0L;
	//    3    7:lconst_0        
	//    4    8:lreturn         
		else
			return waitingTask.getDelay(TimeUnit.MILLISECONDS);
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field ScheduledFuture waitingTask>
	//    7   13:getstatic       #34  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    8   16:invokeinterface #40  <Method long ScheduledFuture.getDelay(TimeUnit)>
	//    9   21:lreturn         
	}

	public void startIn(long l)
	{
		if(waitingTask != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field ScheduledFuture waitingTask>
	//*   2    4:ifnull          18
			waitingTask.cancel(false);
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field ScheduledFuture waitingTask>
	//    5   11:iconst_0        
	//    6   12:invokeinterface #46  <Method boolean ScheduledFuture.cancel(boolean)>
	//    7   17:pop             
		waitingTask = scheduler.schedule(command, l, TimeUnit.MILLISECONDS);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #19  <Field ScheduledExecutorService scheduler>
	//   11   23:aload_0         
	//   12   24:getfield        #21  <Field Runnable command>
	//   13   27:lload_1         
	//   14   28:getstatic       #34  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   15   31:invokeinterface #52  <Method ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   16   36:putfield        #28  <Field ScheduledFuture waitingTask>
	//   17   39:return          
	}

	private Runnable command;
	private boolean isRunning;
	private ScheduledExecutorService scheduler;
	private ScheduledFuture waitingTask;
}
