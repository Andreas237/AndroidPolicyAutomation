// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.futures;


// Referenced classes of package androidx.work.impl.utils.futures:
//			AbstractFuture

private static abstract class AbstractFuture$AtomicHelper
{

	abstract boolean casListeners(AbstractFuture abstractfuture, AbstractFuture.Listener listener, AbstractFuture.Listener listener1);

	abstract boolean casValue(AbstractFuture abstractfuture, Object obj, Object obj1);

	abstract boolean casWaiters(AbstractFuture abstractfuture, AbstractFuture.Waiter waiter, AbstractFuture.Waiter waiter1);

	abstract void putNext(AbstractFuture.Waiter waiter, AbstractFuture.Waiter waiter1);

	abstract void putThread(AbstractFuture.Waiter waiter, Thread thread);

	private AbstractFuture$AtomicHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	AbstractFuture$AtomicHelper(AbstractFuture._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AbstractFuture$AtomicHelper()>
	//    2    4:return          
	}
}
