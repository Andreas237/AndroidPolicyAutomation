// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.android.scheduler.PeriodicTask;
import com.gigya.socialize.android.scheduler.tasks.SessionVerificationTask;
import java.util.concurrent.*;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI, GSSession

class GSSessionVerification
{

	GSSessionVerification(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		lastRequestTimestamp = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #23  <Field long lastRequestTimestamp>
		interval = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #25  <Field int interval>
	//    8   14:return          
	}

	private long getInitialDelayFor(PeriodicTask periodictask)
	{
		if(lastRequestTimestamp == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field long lastRequestTimestamp>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            14
			return periodictask.getInterval();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #36  <Method long PeriodicTask.getInterval()>
	//    7   13:lreturn         
		long l = periodictask.getInterval();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #36  <Method long PeriodicTask.getInterval()>
	//   10   18:lstore_2        
		long l1 = System.currentTimeMillis() - lastRequestTimestamp;
	//   11   19:invokestatic    #41  <Method long System.currentTimeMillis()>
	//   12   22:aload_0         
	//   13   23:getfield        #23  <Field long lastRequestTimestamp>
	//   14   26:lsub            
	//   15   27:lstore          4
		if(l1 > l)
	//*  16   29:lload           4
	//*  17   31:lload_2         
	//*  18   32:lcmp            
	//*  19   33:ifle            38
			return 0L;
	//   20   36:lconst_0        
	//   21   37:lreturn         
		else
			return l - l1;
	//   22   38:lload_2         
	//   23   39:lload           4
	//   24   41:lsub            
	//   25   42:lreturn         
	}

	private void schedule(final PeriodicTask task)
	{
		stop();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method void stop()>
		sch = (ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(1);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokestatic    #52  <Method java.util.concurrent.ScheduledExecutorService Executors.newScheduledThreadPool(int)>
	//    5    9:checkcast       #54  <Class ScheduledThreadPoolExecutor>
	//    6   12:putfield        #56  <Field ScheduledThreadPoolExecutor sch>
		Runnable runnable = new Runnable() {

			public void run()
			{
				if(!Thread.currentThread().isInterrupted())
			//*   0    0:invokestatic    #32  <Method Thread Thread.currentThread()>
			//*   1    3:invokevirtual   #36  <Method boolean Thread.isInterrupted()>
			//*   2    6:ifne            27
				{
					lastRequestTimestamp = System.currentTimeMillis();
			//    3    9:aload_0         
			//    4   10:getfield        #19  <Field GSSessionVerification this$0>
			//    5   13:invokestatic    #42  <Method long System.currentTimeMillis()>
			//    6   16:invokestatic    #46  <Method long GSSessionVerification.access$002(GSSessionVerification, long)>
			//    7   19:pop2            
					task.run();
			//    8   20:aload_0         
			//    9   21:getfield        #21  <Field PeriodicTask val$task>
			//   10   24:invokevirtual   #50  <Method void PeriodicTask.run()>
				}
			//   11   27:return          
			}

			final GSSessionVerification this$0;
			final PeriodicTask val$task;

			
			{
				this$0 = GSSessionVerification.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GSSessionVerification this$0>
				task = periodictask;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field PeriodicTask val$task>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    7   15:new             #6   <Class GSSessionVerification$1>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokespecial   #59  <Method void GSSessionVerification$1(GSSessionVerification, PeriodicTask)>
	//   12   24:astore          4
		long l = getInitialDelayFor(task);
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:invokespecial   #61  <Method long getInitialDelayFor(PeriodicTask)>
	//   16   31:lstore_2        
		future = sch.scheduleAtFixedRate(runnable, l, task.getInterval(), TimeUnit.MILLISECONDS);
	//   17   32:aload_0         
	//   18   33:aload_0         
	//   19   34:getfield        #56  <Field ScheduledThreadPoolExecutor sch>
	//   20   37:aload           4
	//   21   39:lload_2         
	//   22   40:aload_1         
	//   23   41:invokevirtual   #36  <Method long PeriodicTask.getInterval()>
	//   24   44:getstatic       #67  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   25   47:invokevirtual   #71  <Method ScheduledFuture ScheduledThreadPoolExecutor.scheduleAtFixedRate(Runnable, long, long, TimeUnit)>
	//   26   50:putfield        #73  <Field ScheduledFuture future>
	//   27   53:return          
	}

	void invalidate()
	{
		stop();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method void stop()>
		lastRequestTimestamp = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #23  <Field long lastRequestTimestamp>
	//    5    9:return          
	}

	void start(GSAPI gsapi)
	{
		GSSession gssession = gsapi.getSession();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #82  <Method GSSession GSAPI.getSession()>
	//    2    4:astore_2        
		if(gssession != null && interval > 0 && gssession.isValid())
	//*   3    5:aload_2         
	//*   4    6:ifnull          46
	//*   5    9:aload_0         
	//*   6   10:getfield        #25  <Field int interval>
	//*   7   13:ifle            46
	//*   8   16:aload_2         
	//*   9   17:invokevirtual   #88  <Method boolean GSSession.isValid()>
	//*  10   20:ifeq            46
			schedule(((PeriodicTask) (new SessionVerificationTask(gsapi, TimeUnit.SECONDS.toMillis(interval)))));
	//   11   23:aload_0         
	//   12   24:new             #90  <Class SessionVerificationTask>
	//   13   27:dup             
	//   14   28:aload_1         
	//   15   29:getstatic       #93  <Field TimeUnit TimeUnit.SECONDS>
	//   16   32:aload_0         
	//   17   33:getfield        #25  <Field int interval>
	//   18   36:i2l             
	//   19   37:invokevirtual   #97  <Method long TimeUnit.toMillis(long)>
	//   20   40:invokespecial   #100 <Method void SessionVerificationTask(GSAPI, long)>
	//   21   43:invokespecial   #102 <Method void schedule(PeriodicTask)>
	//   22   46:return          
	}

	void stop()
	{
		if(future != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field ScheduledFuture future>
	//*   2    4:ifnull          23
		{
			future.cancel(true);
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field ScheduledFuture future>
	//    5   11:iconst_1        
	//    6   12:invokeinterface #108 <Method boolean ScheduledFuture.cancel(boolean)>
	//    7   17:pop             
			future = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #73  <Field ScheduledFuture future>
		}
		if(sch != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #56  <Field ScheduledThreadPoolExecutor sch>
	//*  13   27:ifnull          43
		{
			sch.shutdownNow();
	//   14   30:aload_0         
	//   15   31:getfield        #56  <Field ScheduledThreadPoolExecutor sch>
	//   16   34:invokevirtual   #112 <Method java.util.List ScheduledThreadPoolExecutor.shutdownNow()>
	//   17   37:pop             
			sch = null;
	//   18   38:aload_0         
	//   19   39:aconst_null     
	//   20   40:putfield        #56  <Field ScheduledThreadPoolExecutor sch>
		}
	//   21   43:return          
	}

	private static final int POOL_SIZE = 1;
	private ScheduledFuture future;
	private int interval;
	private long lastRequestTimestamp;
	private ScheduledThreadPoolExecutor sch;


/*
	static long access$002(GSSessionVerification gssessionverification, long l)
	{
		gssessionverification.lastRequestTimestamp = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #23  <Field long lastRequestTimestamp>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

*/
}
