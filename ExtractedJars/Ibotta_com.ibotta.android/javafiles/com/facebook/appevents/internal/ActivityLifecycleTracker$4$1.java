// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook.appevents.internal:
//			ActivityLifecycleTracker, SessionLogger, SessionInfo, AutomaticAnalyticsLogger

class ActivityLifecycleTracker$4$1
	implements Runnable
{

	public void run()
	{
		if(ActivityLifecycleTracker.access$500().get() <= 0)
	//*   0    0:invokestatic    #26  <Method AtomicInteger ActivityLifecycleTracker.access$500()>
	//*   1    3:invokevirtual   #32  <Method int AtomicInteger.get()>
	//*   2    6:ifgt            40
		{
			SessionLogger.logDeactivateApp(val$applicationContext, val$activityName, ActivityLifecycleTracker.access$200(), ActivityLifecycleTracker.access$300());
	//    3    9:aload_0         
	//    4   10:getfield        #17  <Field ActivityLifecycleTracker$4 this$0>
	//    5   13:getfield        #36  <Field Context ActivityLifecycleTracker$4.val$applicationContext>
	//    6   16:aload_0         
	//    7   17:getfield        #17  <Field ActivityLifecycleTracker$4 this$0>
	//    8   20:getfield        #40  <Field String ActivityLifecycleTracker$4.val$activityName>
	//    9   23:invokestatic    #44  <Method SessionInfo ActivityLifecycleTracker.access$200()>
	//   10   26:invokestatic    #48  <Method String ActivityLifecycleTracker.access$300()>
	//   11   29:invokestatic    #54  <Method void SessionLogger.logDeactivateApp(Context, String, SessionInfo, String)>
			SessionInfo.clearSavedSessionFromDisk();
	//   12   32:invokestatic    #59  <Method void SessionInfo.clearSavedSessionFromDisk()>
			ActivityLifecycleTracker.access$202(((SessionInfo) (null)));
	//   13   35:aconst_null     
	//   14   36:invokestatic    #63  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
	//   15   39:pop             
		}
		synchronized(ActivityLifecycleTracker.access$600())
	//*  16   40:invokestatic    #67  <Method Object ActivityLifecycleTracker.access$600()>
	//*  17   43:astore_1        
	//*  18   44:aload_1         
	//*  19   45:monitorenter    
		{
			ActivityLifecycleTracker.access$702(((java.util.concurrent.ScheduledFuture) (null)));
	//   20   46:aconst_null     
	//   21   47:invokestatic    #71  <Method java.util.concurrent.ScheduledFuture ActivityLifecycleTracker.access$702(java.util.concurrent.ScheduledFuture)>
	//   22   50:pop             
		}
	//   23   51:aload_1         
	//   24   52:monitorexit     
		return;
	//   25   53:return          
		exception;
	//   26   54:astore_2        
		obj;
	//   27   55:aload_1         
		JVM INSTR monitorexit ;
	//   28   56:monitorexit     
		throw exception;
	//   29   57:aload_2         
	//   30   58:athrow          
	}

	final ActivityLifecycleTracker._cls4 this$0;

	ActivityLifecycleTracker$4$1()
	{
		this$0 = ActivityLifecycleTracker._cls4.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ActivityLifecycleTracker$4 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/facebook/appevents/internal/ActivityLifecycleTracker$4

/* anonymous class */
	static final class ActivityLifecycleTracker._cls4
		implements Runnable
	{

		public void run()
		{
			if(ActivityLifecycleTracker.access$200() == null)
		//*   0    0:invokestatic    #36  <Method SessionInfo ActivityLifecycleTracker.access$200()>
		//*   1    3:ifnonnull       25
			{
				ActivityLifecycleTracker.access$202(new SessionInfo(Long.valueOf(currentTime), ((Long) (null))));
		//    2    6:new             #38  <Class SessionInfo>
		//    3    9:dup             
		//    4   10:aload_0         
		//    5   11:getfield        #23  <Field long val$currentTime>
		//    6   14:invokestatic    #44  <Method Long Long.valueOf(long)>
		//    7   17:aconst_null     
		//    8   18:invokespecial   #47  <Method void SessionInfo(Long, Long)>
		//    9   21:invokestatic    #51  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
		//   10   24:pop             
			}
			ActivityLifecycleTracker.access$200().setSessionLastEventTime(Long.valueOf(currentTime));
		//   11   25:invokestatic    #36  <Method SessionInfo ActivityLifecycleTracker.access$200()>
		//   12   28:aload_0         
		//   13   29:getfield        #23  <Field long val$currentTime>
		//   14   32:invokestatic    #44  <Method Long Long.valueOf(long)>
		//   15   35:invokevirtual   #55  <Method void SessionInfo.setSessionLastEventTime(Long)>
			if(ActivityLifecycleTracker.access$500().get() <= 0)
		//*  16   38:invokestatic    #59  <Method AtomicInteger ActivityLifecycleTracker.access$500()>
		//*  17   41:invokevirtual   #65  <Method int AtomicInteger.get()>
		//*  18   44:ifgt            100
			{
				ActivityLifecycleTracker._cls4._cls1 _lcls1 = new ActivityLifecycleTracker._cls4._cls1();
		//   19   47:new             #13  <Class ActivityLifecycleTracker$4$1>
		//   20   50:dup             
		//   21   51:aload_0         
		//   22   52:invokespecial   #68  <Method void ActivityLifecycleTracker$4$1(ActivityLifecycleTracker$4)>
		//   23   55:astore          6
				synchronized(ActivityLifecycleTracker.access$600())
		//*  24   57:invokestatic    #72  <Method Object ActivityLifecycleTracker.access$600()>
		//*  25   60:astore          5
		//*  26   62:aload           5
		//*  27   64:monitorenter    
				{
					ActivityLifecycleTracker.access$702(ActivityLifecycleTracker.access$800().schedule(((Runnable) (_lcls1)), ActivityLifecycleTracker.access$400(), TimeUnit.SECONDS));
		//   28   65:invokestatic    #76  <Method ScheduledExecutorService ActivityLifecycleTracker.access$800()>
		//   29   68:aload           6
		//   30   70:invokestatic    #79  <Method int ActivityLifecycleTracker.access$400()>
		//   31   73:i2l             
		//   32   74:getstatic       #85  <Field TimeUnit TimeUnit.SECONDS>
		//   33   77:invokeinterface #91  <Method java.util.concurrent.ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
		//   34   82:invokestatic    #95  <Method java.util.concurrent.ScheduledFuture ActivityLifecycleTracker.access$702(java.util.concurrent.ScheduledFuture)>
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
		//   44  100:invokestatic    #99  <Method long ActivityLifecycleTracker.access$900()>
		//   45  103:lstore_3        
			long l = 0L;
		//   46  104:lconst_0        
		//   47  105:lstore_1        
			if(l1 > 0L)
		//*  48  106:lload_3         
		//*  49  107:lconst_0        
		//*  50  108:lcmp            
		//*  51  109:ifle            123
				l = (currentTime - l1) / 1000L;
		//   52  112:aload_0         
		//   53  113:getfield        #23  <Field long val$currentTime>
		//   54  116:lload_3         
		//   55  117:lsub            
		//   56  118:ldc2w           #100 <Long 1000L>
		//   57  121:ldiv            
		//   58  122:lstore_1        
			AutomaticAnalyticsLogger.logActivityTimeSpentEvent(activityName, l);
		//   59  123:aload_0         
		//   60  124:getfield        #27  <Field String val$activityName>
		//   61  127:lload_1         
		//   62  128:invokestatic    #107 <Method void AutomaticAnalyticsLogger.logActivityTimeSpentEvent(String, long)>
			ActivityLifecycleTracker.access$200().writeSessionToDisk();
		//   63  131:invokestatic    #36  <Method SessionInfo ActivityLifecycleTracker.access$200()>
		//   64  134:invokevirtual   #110 <Method void SessionInfo.writeSessionToDisk()>
			return;
		//   65  137:return          
		}

		final String val$activityName;
		final Context val$applicationContext;
		final long val$currentTime;

			
			{
				currentTime = l;
			//    0    0:aload_0         
			//    1    1:lload_1         
			//    2    2:putfield        #23  <Field long val$currentTime>
				applicationContext = context;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #25  <Field Context val$applicationContext>
				activityName = s;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #27  <Field String val$activityName>
				super();
			//    9   16:aload_0         
			//   10   17:invokespecial   #30  <Method void Object()>
			//   11   20:return          
			}
	}

}
