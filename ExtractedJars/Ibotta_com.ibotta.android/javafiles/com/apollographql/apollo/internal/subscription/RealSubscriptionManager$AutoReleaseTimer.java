// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.subscription;

import java.util.*;

// Referenced classes of package com.apollographql.apollo.internal.subscription:
//			RealSubscriptionManager

static final class RealSubscriptionManager$AutoReleaseTimer
{

	void cancelTask(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		TimerTask timertask = (TimerTask)tasks.remove(((Object) (Integer.valueOf(i))));
	//    2    2:aload_0         
	//    3    3:getfield        #23  <Field Map tasks>
	//    4    6:iload_1         
	//    5    7:invokestatic    #32  <Method Integer Integer.valueOf(int)>
	//    6   10:invokeinterface #38  <Method Object Map.remove(Object)>
	//    7   15:checkcast       #40  <Class TimerTask>
	//    8   18:astore_2        
		if(timertask == null)
			break MISSING_BLOCK_LABEL_28;
	//    9   19:aload_2         
	//   10   20:ifnull          28
		timertask.cancel();
	//   11   23:aload_2         
	//   12   24:invokevirtual   #44  <Method boolean TimerTask.cancel()>
	//   13   27:pop             
		if(tasks.isEmpty() && timer != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #23  <Field Map tasks>
	//*  16   32:invokeinterface #47  <Method boolean Map.isEmpty()>
	//*  17   37:ifeq            59
	//*  18   40:aload_0         
	//*  19   41:getfield        #49  <Field Timer timer>
	//*  20   44:ifnull          59
		{
			timer.cancel();
	//   21   47:aload_0         
	//   22   48:getfield        #49  <Field Timer timer>
	//   23   51:invokevirtual   #53  <Method void Timer.cancel()>
			timer = null;
	//   24   54:aload_0         
	//   25   55:aconst_null     
	//   26   56:putfield        #49  <Field Timer timer>
		}
		this;
	//   27   59:aload_0         
		JVM INSTR monitorexit ;
	//   28   60:monitorexit     
		return;
	//   29   61:return          
		Exception exception;
		exception;
	//   30   62:astore_2        
		this;
	//   31   63:aload_0         
		JVM INSTR monitorexit ;
	//   32   64:monitorexit     
		throw exception;
	//   33   65:aload_2         
	//   34   66:athrow          
	}

	void schedule(final int taskId, final Runnable task, long l)
	{
		task = ((Runnable) (new TimerTask() {

			public void run()
			{
				task.run();
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field Runnable val$task>
			//    2    4:invokeinterface #35  <Method void Runnable.run()>
				cancelTask(taskId);
			//    3    9:aload_0         
			//    4   10:getfield        #22  <Field RealSubscriptionManager$AutoReleaseTimer this$0>
			//    5   13:aload_0         
			//    6   14:getfield        #26  <Field int val$taskId>
			//    7   17:invokevirtual   #39  <Method void RealSubscriptionManager$AutoReleaseTimer.cancelTask(int)>
				return;
			//    8   20:return          
				Exception exception;
				exception;
			//    9   21:astore_1        
				cancelTask(taskId);
			//   10   22:aload_0         
			//   11   23:getfield        #22  <Field RealSubscriptionManager$AutoReleaseTimer this$0>
			//   12   26:aload_0         
			//   13   27:getfield        #26  <Field int val$taskId>
			//   14   30:invokevirtual   #39  <Method void RealSubscriptionManager$AutoReleaseTimer.cancelTask(int)>
				throw exception;
			//   15   33:aload_1         
			//   16   34:athrow          
			}

			final RealSubscriptionManager.AutoReleaseTimer this$0;
			final Runnable val$task;
			final int val$taskId;

			
			{
				this$0 = RealSubscriptionManager.AutoReleaseTimer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field RealSubscriptionManager$AutoReleaseTimer this$0>
				task = runnable;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Runnable val$task>
				taskId = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #26  <Field int val$taskId>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void TimerTask()>
			//   11   19:return          
			}
		}
));
	//    0    0:new             #9   <Class RealSubscriptionManager$AutoReleaseTimer$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokespecial   #58  <Method void RealSubscriptionManager$AutoReleaseTimer$1(RealSubscriptionManager$AutoReleaseTimer, Runnable, int)>
	//    6   10:astore_2        
		this;
	//    7   11:aload_0         
		JVM INSTR monitorenter ;
	//    8   12:monitorenter    
		TimerTask timertask = (TimerTask)tasks.put(((Object) (Integer.valueOf(taskId))), ((Object) (task)));
	//    9   13:aload_0         
	//   10   14:getfield        #23  <Field Map tasks>
	//   11   17:iload_1         
	//   12   18:invokestatic    #32  <Method Integer Integer.valueOf(int)>
	//   13   21:aload_2         
	//   14   22:invokeinterface #62  <Method Object Map.put(Object, Object)>
	//   15   27:checkcast       #40  <Class TimerTask>
	//   16   30:astore          5
		if(timertask == null)
			break MISSING_BLOCK_LABEL_43;
	//   17   32:aload           5
	//   18   34:ifnull          43
		timertask.cancel();
	//   19   37:aload           5
	//   20   39:invokevirtual   #44  <Method boolean TimerTask.cancel()>
	//   21   42:pop             
		if(timer == null)
	//*  22   43:aload_0         
	//*  23   44:getfield        #49  <Field Timer timer>
	//*  24   47:ifnonnull       64
			timer = new Timer("Subscription SmartTimer", true);
	//   25   50:aload_0         
	//   26   51:new             #51  <Class Timer>
	//   27   54:dup             
	//   28   55:ldc1            #64  <String "Subscription SmartTimer">
	//   29   57:iconst_1        
	//   30   58:invokespecial   #67  <Method void Timer(String, boolean)>
	//   31   61:putfield        #49  <Field Timer timer>
		this;
	//   32   64:aload_0         
		JVM INSTR monitorexit ;
	//   33   65:monitorexit     
		timer.schedule(((TimerTask) (task)), l);
	//   34   66:aload_0         
	//   35   67:getfield        #49  <Field Timer timer>
	//   36   70:aload_2         
	//   37   71:lload_3         
	//   38   72:invokevirtual   #70  <Method void Timer.schedule(TimerTask, long)>
		return;
	//   39   75:return          
		task;
	//   40   76:astore_2        
		this;
	//   41   77:aload_0         
		JVM INSTR monitorexit ;
	//   42   78:monitorexit     
		throw task;
	//   43   79:aload_2         
	//   44   80:athrow          
	}

	final Map tasks = new LinkedHashMap();
	Timer timer;

	RealSubscriptionManager$AutoReleaseTimer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #20  <Class LinkedHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void LinkedHashMap()>
	//    6   12:putfield        #23  <Field Map tasks>
	//    7   15:return          
	}
}
