// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import java.util.concurrent.*;

public class TimerCycle
{

	public TimerCycle(Runnable runnable, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		scheduler = Executors.newSingleThreadScheduledExecutor();
	//    2    4:aload_0         
	//    3    5:invokestatic    #26  <Method ScheduledExecutorService Executors.newSingleThreadScheduledExecutor()>
	//    4    8:putfield        #28  <Field ScheduledExecutorService scheduler>
		command = runnable;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #30  <Field Runnable command>
		initialDelay = l;
	//    8   16:aload_0         
	//    9   17:lload_2         
	//   10   18:putfield        #32  <Field long initialDelay>
		cycleDelay = l1;
	//   11   21:aload_0         
	//   12   22:lload           4
	//   13   24:putfield        #34  <Field long cycleDelay>
		isPaused = true;
	//   14   27:aload_0         
	//   15   28:iconst_1        
	//   16   29:putfield        #36  <Field boolean isPaused>
	//   17   32:return          
	}

	public void start()
	{
		if(!isPaused)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field boolean isPaused>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			waitingTask = scheduler.scheduleWithFixedDelay(command, initialDelay, cycleDelay, TimeUnit.MILLISECONDS);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field ScheduledExecutorService scheduler>
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field Runnable command>
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field long initialDelay>
	//   11   21:aload_0         
	//   12   22:getfield        #34  <Field long cycleDelay>
	//   13   25:getstatic       #44  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   14   28:invokeinterface #50  <Method ScheduledFuture ScheduledExecutorService.scheduleWithFixedDelay(Runnable, long, long, TimeUnit)>
	//   15   33:putfield        #52  <Field ScheduledFuture waitingTask>
			isPaused = false;
	//   16   36:aload_0         
	//   17   37:iconst_0        
	//   18   38:putfield        #36  <Field boolean isPaused>
			return;
	//   19   41:return          
		}
	}

	public void suspend()
	{
		if(isPaused)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field boolean isPaused>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			initialDelay = waitingTask.getDelay(TimeUnit.MILLISECONDS);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #52  <Field ScheduledFuture waitingTask>
	//    7   13:getstatic       #44  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    8   16:invokeinterface #59  <Method long ScheduledFuture.getDelay(TimeUnit)>
	//    9   21:putfield        #32  <Field long initialDelay>
			waitingTask.cancel(false);
	//   10   24:aload_0         
	//   11   25:getfield        #52  <Field ScheduledFuture waitingTask>
	//   12   28:iconst_0        
	//   13   29:invokeinterface #63  <Method boolean ScheduledFuture.cancel(boolean)>
	//   14   34:pop             
			isPaused = true;
	//   15   35:aload_0         
	//   16   36:iconst_1        
	//   17   37:putfield        #36  <Field boolean isPaused>
			return;
	//   18   40:return          
		}
	}

	private Runnable command;
	private long cycleDelay;
	private long initialDelay;
	private boolean isPaused;
	private ScheduledExecutorService scheduler;
	private ScheduledFuture waitingTask;
}
