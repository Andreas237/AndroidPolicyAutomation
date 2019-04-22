// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.subscription;

import java.util.TimerTask;

// Referenced classes of package com.apollographql.apollo.internal.subscription:
//			RealSubscriptionManager

class RealSubscriptionManager$AutoReleaseTimer$1 extends TimerTask
{

	public void run()
	{
		val$task.run();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Runnable val$task>
	//    2    4:invokeinterface #35  <Method void Runnable.run()>
		cancelTask(val$taskId);
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
		cancelTask(val$taskId);
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

	RealSubscriptionManager$AutoReleaseTimer$1()
	{
		this$0 = final_autoreleasetimer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field RealSubscriptionManager$AutoReleaseTimer this$0>
		val$task = runnable;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Runnable val$task>
		val$taskId = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #26  <Field int val$taskId>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #29  <Method void TimerTask()>
	//   11   19:return          
	}
}
