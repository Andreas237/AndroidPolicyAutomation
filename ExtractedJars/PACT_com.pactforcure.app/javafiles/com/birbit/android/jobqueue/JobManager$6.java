// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.messaging.MessageQueue;
import com.birbit.android.jobqueue.messaging.message.PublicQueryMessage;

// Referenced classes of package com.birbit.android.jobqueue:
//			JobManager

class JobManager$6 extends tQueryFuture
{

	public void onResult(int i)
	{
		try
		{
			val$runnable.run();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Runnable val$runnable>
	//    2    4:invokeinterface #38  <Method void Runnable.run()>
		}
	//*   3    9:aload_0         
	//*   4   10:iload_1         
	//*   5   11:invokespecial   #40  <Method void JobManager$IntQueryFuture.onResult(int)>
	//*   6   14:return          
		catch(Throwable throwable)
	//*   7   15:astore_2        
		{
			val$error[0] = throwable;
	//    8   16:aload_0         
	//    9   17:getfield        #24  <Field Throwable[] val$error>
	//   10   20:iconst_0        
	//   11   21:aload_2         
	//   12   22:aastore         
		}
		super.onResult(i);
	//*  13   23:goto            9
	}

	final JobManager this$0;
	final Throwable val$error[];
	final Runnable val$runnable;

	JobManager$6(Runnable runnable1, Throwable athrowable[])
	{
		this$0 = final_jobmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field JobManager this$0>
		val$runnable = runnable1;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #22  <Field Runnable val$runnable>
		val$error = athrowable;
	//    6   11:aload_0         
	//    7   12:aload           5
	//    8   14:putfield        #24  <Field Throwable[] val$error>
		super(final_messagequeue, ((com.birbit.android.jobqueue.messaging.Message) (PublicQueryMessage.this)));
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:invokespecial   #27  <Method void JobManager$IntQueryFuture(MessageQueue, com.birbit.android.jobqueue.messaging.Message)>
	//   13   23:return          
	}
}
