// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.android.scheduler.PeriodicTask;

// Referenced classes of package com.gigya.socialize.android:
//			GSSessionVerification

class GSSessionVerification$1
	implements Runnable
{

	public void run()
	{
		if(!Thread.currentThread().isInterrupted())
	//*   0    0:invokestatic    #32  <Method Thread Thread.currentThread()>
	//*   1    3:invokevirtual   #36  <Method boolean Thread.isInterrupted()>
	//*   2    6:ifne            27
		{
			GSSessionVerification.access$002(GSSessionVerification.this, System.currentTimeMillis());
	//    3    9:aload_0         
	//    4   10:getfield        #19  <Field GSSessionVerification this$0>
	//    5   13:invokestatic    #42  <Method long System.currentTimeMillis()>
	//    6   16:invokestatic    #46  <Method long GSSessionVerification.access$002(GSSessionVerification, long)>
	//    7   19:pop2            
			val$task.run();
	//    8   20:aload_0         
	//    9   21:getfield        #21  <Field PeriodicTask val$task>
	//   10   24:invokevirtual   #50  <Method void PeriodicTask.run()>
		}
	//   11   27:return          
	}

	final GSSessionVerification this$0;
	final PeriodicTask val$task;

	GSSessionVerification$1()
	{
		this$0 = final_gssessionverification;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GSSessionVerification this$0>
		val$task = PeriodicTask.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field PeriodicTask val$task>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
