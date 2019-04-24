// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.birbit.android.jobqueue:
//			CallbackManager

class CallbackManager$1
	implements Runnable
{

	public void run()
	{
		val$latch.countDown();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field CountDownLatch val$latch>
	//    2    4:invokevirtual   #31  <Method void CountDownLatch.countDown()>
	//    3    7:return          
	}

	final CallbackManager this$0;
	final CountDownLatch val$latch;

	CallbackManager$1()
	{
		this$0 = final_callbackmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CallbackManager this$0>
		val$latch = CountDownLatch.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CountDownLatch val$latch>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
