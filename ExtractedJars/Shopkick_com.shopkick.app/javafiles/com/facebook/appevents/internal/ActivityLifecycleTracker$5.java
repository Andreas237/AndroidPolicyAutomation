// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook.appevents.internal:
//			ActivityLifecycleTracker, SessionInfo, AutomaticAnalyticsLogger, SessionLogger

static final class ActivityLifecycleTracker$5
	implements Runnable
{

	public void run()
	{
		if(ActivityLifecycleTracker.access$200() == null)
	//*   0    0:invokestatic    #32  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//*   1    3:ifnonnull       25
		{
			ActivityLifecycleTracker.access$202(new SessionInfo(Long.valueOf(val$currentTime), ((Long) (null))));
	//    2    6:new             #34  <Class SessionInfo>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field long val$currentTime>
	//    6   14:invokestatic    #40  <Method Long Long.valueOf(long)>
	//    7   17:aconst_null     
	//    8   18:invokespecial   #43  <Method void SessionInfo(Long, Long)>
	//    9   21:invokestatic    #47  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
	//   10   24:pop             
		}
		ActivityLifecycleTracker.access$200().setSessionLastEventTime(Long.valueOf(val$currentTime));
	//   11   25:invokestatic    #32  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//   12   28:aload_0         
	//   13   29:getfield        #21  <Field long val$currentTime>
	//   14   32:invokestatic    #40  <Method Long Long.valueOf(long)>
	//   15   35:invokevirtual   #51  <Method void SessionInfo.setSessionLastEventTime(Long)>
		if(ActivityLifecycleTracker.access$500().get() <= 0)
	//*  16   38:invokestatic    #55  <Method AtomicInteger ActivityLifecycleTracker.access$500()>
	//*  17   41:invokevirtual   #61  <Method int AtomicInteger.get()>
	//*  18   44:ifgt            100
		{
			Runnable runnable = new Runnable() {

				public void run()
				{
					if(ActivityLifecycleTracker.access$500().get() <= 0)
				//*   0    0:invokestatic    #26  <Method AtomicInteger ActivityLifecycleTracker.access$500()>
				//*   1    3:invokevirtual   #32  <Method int AtomicInteger.get()>
				//*   2    6:ifgt            33
					{
						SessionLogger.logDeactivateApp(activityName, ActivityLifecycleTracker.access$200(), ActivityLifecycleTracker.access$300());
				//    3    9:aload_0         
				//    4   10:getfield        #17  <Field ActivityLifecycleTracker$5 this$0>
				//    5   13:getfield        #36  <Field String ActivityLifecycleTracker$5.val$activityName>
				//    6   16:invokestatic    #40  <Method SessionInfo ActivityLifecycleTracker.access$200()>
				//    7   19:invokestatic    #44  <Method String ActivityLifecycleTracker.access$300()>
				//    8   22:invokestatic    #50  <Method void SessionLogger.logDeactivateApp(String, SessionInfo, String)>
						SessionInfo.clearSavedSessionFromDisk();
				//    9   25:invokestatic    #55  <Method void SessionInfo.clearSavedSessionFromDisk()>
						ActivityLifecycleTracker.access$202(((SessionInfo) (null)));
				//   10   28:aconst_null     
				//   11   29:invokestatic    #59  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
				//   12   32:pop             
					}
					synchronized(ActivityLifecycleTracker.access$600())
				//*  13   33:invokestatic    #63  <Method Object ActivityLifecycleTracker.access$600()>
				//*  14   36:astore_1        
				//*  15   37:aload_1         
				//*  16   38:monitorenter    
					{
						ActivityLifecycleTracker.access$702(((java.util.concurrent.ScheduledFuture) (null)));
				//   17   39:aconst_null     
				//   18   40:invokestatic    #67  <Method java.util.concurrent.ScheduledFuture ActivityLifecycleTracker.access$702(java.util.concurrent.ScheduledFuture)>
				//   19   43:pop             
					}
				//   20   44:aload_1         
				//   21   45:monitorexit     
					return;
				//   22   46:return          
					exception1;
				//   23   47:astore_2        
					obj1;
				//   24   48:aload_1         
					JVM INSTR monitorexit ;
				//   25   49:monitorexit     
					throw exception1;
				//   26   50:aload_2         
				//   27   51:athrow          
				}

				final ActivityLifecycleTracker._cls5 this$0;

			
			{
				this$0 = ActivityLifecycleTracker._cls5.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ActivityLifecycleTracker$5 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//   19   47:new             #13  <Class ActivityLifecycleTracker$5$1>
	//   20   50:dup             
	//   21   51:aload_0         
	//   22   52:invokespecial   #64  <Method void ActivityLifecycleTracker$5$1(ActivityLifecycleTracker$5)>
	//   23   55:astore          6
			synchronized(ActivityLifecycleTracker.access$600())
	//*  24   57:invokestatic    #68  <Method Object ActivityLifecycleTracker.access$600()>
	//*  25   60:astore          5
	//*  26   62:aload           5
	//*  27   64:monitorenter    
			{
				ActivityLifecycleTracker.access$702(ActivityLifecycleTracker.access$800().schedule(runnable, ActivityLifecycleTracker.access$400(), TimeUnit.SECONDS));
	//   28   65:invokestatic    #72  <Method ScheduledExecutorService ActivityLifecycleTracker.access$800()>
	//   29   68:aload           6
	//   30   70:invokestatic    #75  <Method int ActivityLifecycleTracker.access$400()>
	//   31   73:i2l             
	//   32   74:getstatic       #81  <Field TimeUnit TimeUnit.SECONDS>
	//   33   77:invokeinterface #87  <Method java.util.concurrent.ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   34   82:invokestatic    #91  <Method java.util.concurrent.ScheduledFuture ActivityLifecycleTracker.access$702(java.util.concurrent.ScheduledFuture)>
	//   35   85:pop             
			}
	//   36   86:aload           5
	//   37   88:monitorexit     
		}
		break MISSING_BLOCK_LABEL_100;
	//   38   89:goto            100
		exception;
	//   39   92:astore          6
		obj;
	//   40   94:aload           5
		JVM INSTR monitorexit ;
	//   41   96:monitorexit     
		throw exception;
	//   42   97:aload           6
	//   43   99:athrow          
		long l1 = ActivityLifecycleTracker.access$900();
	//   44  100:invokestatic    #95  <Method long ActivityLifecycleTracker.access$900()>
	//   45  103:lstore_3        
		long l = 0L;
	//   46  104:lconst_0        
	//   47  105:lstore_1        
		if(l1 > 0L)
	//*  48  106:lload_3         
	//*  49  107:lconst_0        
	//*  50  108:lcmp            
	//*  51  109:ifle            123
			l = (val$currentTime - l1) / 1000L;
	//   52  112:aload_0         
	//   53  113:getfield        #21  <Field long val$currentTime>
	//   54  116:lload_3         
	//   55  117:lsub            
	//   56  118:ldc2w           #96  <Long 1000L>
	//   57  121:ldiv            
	//   58  122:lstore_1        
		AutomaticAnalyticsLogger.logActivityTimeSpentEvent(val$activityName, l);
	//   59  123:aload_0         
	//   60  124:getfield        #23  <Field String val$activityName>
	//   61  127:lload_1         
	//   62  128:invokestatic    #103 <Method void AutomaticAnalyticsLogger.logActivityTimeSpentEvent(String, long)>
		ActivityLifecycleTracker.access$200().writeSessionToDisk();
	//   63  131:invokestatic    #32  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//   64  134:invokevirtual   #106 <Method void SessionInfo.writeSessionToDisk()>
		return;
	//   65  137:return          
	}

	final String val$activityName;
	final long val$currentTime;

	ActivityLifecycleTracker$5(long l, String s)
	{
		val$currentTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #21  <Field long val$currentTime>
		val$activityName = s;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #23  <Field String val$activityName>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
