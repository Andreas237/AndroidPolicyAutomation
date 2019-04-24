// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.birbit.android.jobqueue:
//			JobManager, CancelResult

class JobManager$5
	implements AsyncCancelCallback
{

	public void onCancelled(CancelResult cancelresult)
	{
		val$result[0] = cancelresult;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CancelResult[] val$result>
	//    2    4:iconst_0        
	//    3    5:aload_1         
	//    4    6:aastore         
		val$latch.countDown();
	//    5    7:aload_0         
	//    6    8:getfield        #25  <Field CountDownLatch val$latch>
	//    7   11:invokevirtual   #36  <Method void CountDownLatch.countDown()>
	//    8   14:return          
	}

	final JobManager this$0;
	final CountDownLatch val$latch;
	final CancelResult val$result[];

	JobManager$5()
	{
		this$0 = final_jobmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field JobManager this$0>
		val$result = acancelresult;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field CancelResult[] val$result>
		val$latch = CountDownLatch.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field CountDownLatch val$latch>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
