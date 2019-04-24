// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.log.JqLog;
import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.MessageQueue;
import java.util.concurrent.*;

// Referenced classes of package com.birbit.android.jobqueue:
//			IntCallback, JobManager

static class JobManager$IntQueryFuture
	implements Future, IntCallback
{

	public boolean cancel(boolean flag)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Integer get()
		throws InterruptedException, ExecutionException
	{
		messageQueue.post(message);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field MessageQueue messageQueue>
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field Message message>
	//    4    8:invokeinterface #62  <Method void MessageQueue.post(Message)>
		latch.await();
	//    5   13:aload_0         
	//    6   14:getfield        #35  <Field CountDownLatch latch>
	//    7   17:invokevirtual   #65  <Method void CountDownLatch.await()>
		return result;
	//    8   20:aload_0         
	//    9   21:getfield        #28  <Field Integer result>
	//   10   24:areturn         
	}

	public Integer get(long l, TimeUnit timeunit)
		throws InterruptedException, ExecutionException, TimeoutException
	{
		messageQueue.post(message);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field MessageQueue messageQueue>
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field Message message>
	//    4    8:invokeinterface #62  <Method void MessageQueue.post(Message)>
		latch.await(l, timeunit);
	//    5   13:aload_0         
	//    6   14:getfield        #35  <Field CountDownLatch latch>
	//    7   17:lload_1         
	//    8   18:aload_3         
	//    9   19:invokevirtual   #73  <Method boolean CountDownLatch.await(long, TimeUnit)>
	//   10   22:pop             
		return result;
	//   11   23:aload_0         
	//   12   24:getfield        #28  <Field Integer result>
	//   13   27:areturn         
	}

	public volatile Object get()
		throws InterruptedException, ExecutionException
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method Integer get()>
	//    2    4:areturn         
	}

	public volatile Object get(long l, TimeUnit timeunit)
		throws InterruptedException, ExecutionException, TimeoutException
	{
		return ((Object) (get(l, timeunit)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #80  <Method Integer get(long, TimeUnit)>
	//    4    6:areturn         
	}

	Integer getSafe()
	{
		Integer integer;
		try
		{
			integer = get();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method Integer get()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(Throwable throwable)
	//*   5    7:astore_1        
		{
			JqLog.e(throwable, "message is not complete", new Object[0]);
	//    6    8:aload_1         
	//    7    9:ldc1            #85  <String "message is not complete">
	//    8   11:iconst_0        
	//    9   12:anewarray       Object[]
	//   10   15:invokestatic    #91  <Method void JqLog.e(Throwable, String, Object[])>
			throw new RuntimeException("cannot get the result of the JobManager query");
	//   11   18:new             #93  <Class RuntimeException>
	//   12   21:dup             
	//   13   22:ldc1            #95  <String "cannot get the result of the JobManager query">
	//   14   24:invokespecial   #98  <Method void RuntimeException(String)>
	//   15   27:athrow          
		}
		return integer;
	}

	public boolean isCancelled()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isDone()
	{
		return latch.getCount() == 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field CountDownLatch latch>
	//    2    4:invokevirtual   #105 <Method long CountDownLatch.getCount()>
	//    3    7:lconst_0        
	//    4    8:lcmp            
	//    5    9:ifne            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public void onResult(int i)
	{
		result = Integer.valueOf(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//    3    5:putfield        #28  <Field Integer result>
		latch.countDown();
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field CountDownLatch latch>
	//    6   12:invokevirtual   #115 <Method void CountDownLatch.countDown()>
	//    7   15:return          
	}

	final CountDownLatch latch = new CountDownLatch(1);
	final Message message;
	final MessageQueue messageQueue;
	volatile Integer result;

	JobManager$IntQueryFuture(MessageQueue messagequeue, Message message1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		result = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #28  <Field Integer result>
	//    5    9:aload_0         
	//    6   10:new             #30  <Class CountDownLatch>
	//    7   13:dup             
	//    8   14:iconst_1        
	//    9   15:invokespecial   #33  <Method void CountDownLatch(int)>
	//   10   18:putfield        #35  <Field CountDownLatch latch>
		messageQueue = messagequeue;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #37  <Field MessageQueue messageQueue>
		message = message1;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #39  <Field Message message>
		((lback)message1).setCallback(((IntCallback) (this)));
	//   17   31:aload_2         
	//   18   32:checkcast       #41  <Class IntCallback$MessageWithCallback>
	//   19   35:aload_0         
	//   20   36:invokeinterface #45  <Method void IntCallback$MessageWithCallback.setCallback(IntCallback)>
	//   21   41:return          
	}
}
