// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import com.facebook.FacebookSdk;
import java.util.concurrent.*;

public class LockOnGetVariable
{

	public LockOnGetVariable(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		value = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Object value>
	//    5    9:return          
	}

	public LockOnGetVariable(final Callable callable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		initLatch = new CountDownLatch(1);
	//    2    4:aload_0         
	//    3    5:new             #25  <Class CountDownLatch>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #28  <Method void CountDownLatch(int)>
	//    7   13:putfield        #30  <Field CountDownLatch initLatch>
		FacebookSdk.getExecutor().execute(((Runnable) (new FutureTask(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #32  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
				throws Exception
			{
				value = callable.call();
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field LockOnGetVariable this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field Callable val$callable>
			//    4    8:invokeinterface #35  <Method Object Callable.call()>
			//    5   13:invokestatic    #39  <Method Object LockOnGetVariable.access$002(LockOnGetVariable, Object)>
			//    6   16:pop             
				initLatch.countDown();
			//    7   17:aload_0         
			//    8   18:getfield        #19  <Field LockOnGetVariable this$0>
			//    9   21:invokestatic    #43  <Method CountDownLatch LockOnGetVariable.access$100(LockOnGetVariable)>
			//   10   24:invokevirtual   #48  <Method void CountDownLatch.countDown()>
				return null;
			//   11   27:aconst_null     
			//   12   28:areturn         
				Exception exception;
				exception;
			//   13   29:astore_1        
				initLatch.countDown();
			//   14   30:aload_0         
			//   15   31:getfield        #19  <Field LockOnGetVariable this$0>
			//   16   34:invokestatic    #43  <Method CountDownLatch LockOnGetVariable.access$100(LockOnGetVariable)>
			//   17   37:invokevirtual   #48  <Method void CountDownLatch.countDown()>
				throw exception;
			//   18   40:aload_1         
			//   19   41:athrow          
			}

			final LockOnGetVariable this$0;
			final Callable val$callable;

			
			{
				this$0 = LockOnGetVariable.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LockOnGetVariable this$0>
				callable = callable1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Callable val$callable>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
))));
	//    8   16:invokestatic    #36  <Method Executor FacebookSdk.getExecutor()>
	//    9   19:new             #38  <Class FutureTask>
	//   10   22:dup             
	//   11   23:new             #7   <Class LockOnGetVariable$1>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokespecial   #41  <Method void LockOnGetVariable$1(LockOnGetVariable, Callable)>
	//   16   32:invokespecial   #43  <Method void FutureTask(Callable)>
	//   17   35:invokeinterface #49  <Method void Executor.execute(Runnable)>
	//   18   40:return          
	}

	private void waitOnInit()
	{
		CountDownLatch countdownlatch = initLatch;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field CountDownLatch initLatch>
	//    2    4:astore_1        
		if(countdownlatch == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		try
		{
			countdownlatch.await();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #60  <Method void CountDownLatch.await()>
			return;
	//    8   14:return          
		}
		catch(InterruptedException interruptedexception)
	//*   9   15:astore_1        
		{
			return;
	//   10   16:return          
		}
	}

	public Object getValue()
	{
		waitOnInit();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void waitOnInit()>
		return value;
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Object value>
	//    4    8:areturn         
	}

	private CountDownLatch initLatch;
	private Object value;


/*
	static Object access$002(LockOnGetVariable lockongetvariable, Object obj)
	{
		lockongetvariable.value = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Object value>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static CountDownLatch access$100(LockOnGetVariable lockongetvariable)
	{
		return lockongetvariable.initLatch;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field CountDownLatch initLatch>
	//    2    4:areturn         
	}

*/
}
