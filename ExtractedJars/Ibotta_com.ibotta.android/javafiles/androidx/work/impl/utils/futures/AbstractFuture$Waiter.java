// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.futures;

import java.util.concurrent.locks.LockSupport;

// Referenced classes of package androidx.work.impl.utils.futures:
//			AbstractFuture

private static final class AbstractFuture$Waiter
{

	void setNext(AbstractFuture$Waiter abstractfuture$waiter)
	{
		AbstractFuture.ATOMIC_HELPER.putNext(this, abstractfuture$waiter);
	//    0    0:getstatic       #28  <Field AbstractFuture$AtomicHelper AbstractFuture.ATOMIC_HELPER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #46  <Method void AbstractFuture$AtomicHelper.putNext(AbstractFuture$Waiter, AbstractFuture$Waiter)>
	//    4    8:return          
	}

	void unpark()
	{
		Thread thread1 = thread;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Thread thread>
	//    2    4:astore_1        
		if(thread1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			thread = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #49  <Field Thread thread>
			LockSupport.unpark(thread1);
	//    8   14:aload_1         
	//    9   15:invokestatic    #54  <Method void LockSupport.unpark(Thread)>
		}
	//   10   18:return          
	}

	static final AbstractFuture$Waiter TOMBSTONE = new AbstractFuture$Waiter(false);
	volatile AbstractFuture$Waiter next;
	volatile Thread thread;

	static 
	{
	//    0    0:new             #2   <Class AbstractFuture$Waiter>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #19  <Method void AbstractFuture$Waiter(boolean)>
	//    4    8:putstatic       #21  <Field AbstractFuture$Waiter TOMBSTONE>
	//*   5   11:return          
	}

	AbstractFuture$Waiter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		AbstractFuture.ATOMIC_HELPER.putThread(this, Thread.currentThread());
	//    2    4:getstatic       #28  <Field AbstractFuture$AtomicHelper AbstractFuture.ATOMIC_HELPER>
	//    3    7:aload_0         
	//    4    8:invokestatic    #34  <Method Thread Thread.currentThread()>
	//    5   11:invokevirtual   #40  <Method void AbstractFuture$AtomicHelper.putThread(AbstractFuture$Waiter, Thread)>
	//    6   14:return          
	}

	AbstractFuture$Waiter(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}
}
