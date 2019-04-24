// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.scheduling;

import com.birbit.android.jobqueue.log.JqLog;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.birbit.android.jobqueue.scheduling:
//			GcmScheduler

private static class GcmScheduler$ResultCallback
{

	public boolean get()
	{
		try
		{
			latch.await(600L, TimeUnit.SECONDS);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field CountDownLatch latch>
	//    2    4:ldc2w           #30  <Long 600L>
	//    3    7:getstatic       #37  <Field TimeUnit TimeUnit.SECONDS>
	//    4   10:invokevirtual   #41  <Method boolean CountDownLatch.await(long, TimeUnit)>
	//    5   13:pop             
		}
	//*   6   14:aload_0         
	//*   7   15:getfield        #24  <Field boolean reschedule>
	//*   8   18:ireturn         
		catch(InterruptedException interruptedexception)
	//*   9   19:astore_1        
		{
			JqLog.e("job did not finish in 10 minutes :/", new Object[0]);
	//   10   20:ldc1            #43  <String "job did not finish in 10 minutes :/">
	//   11   22:iconst_0        
	//   12   23:anewarray       Object[]
	//   13   26:invokestatic    #49  <Method void JqLog.e(String, Object[])>
		}
		return reschedule;
	//*  14   29:goto            14
	}

	void onDone(boolean flag)
	{
		reschedule = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field boolean reschedule>
		latch.countDown();
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field CountDownLatch latch>
	//    5    9:invokevirtual   #54  <Method void CountDownLatch.countDown()>
	//    6   12:return          
	}

	CountDownLatch latch;
	volatile boolean reschedule;

	GcmScheduler$ResultCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		latch = new CountDownLatch(1);
	//    2    4:aload_0         
	//    3    5:new             #17  <Class CountDownLatch>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #20  <Method void CountDownLatch(int)>
	//    7   13:putfield        #22  <Field CountDownLatch latch>
		reschedule = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #24  <Field boolean reschedule>
	//   11   21:return          
	}
}
