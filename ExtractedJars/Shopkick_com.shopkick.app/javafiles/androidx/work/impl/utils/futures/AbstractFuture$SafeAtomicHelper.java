// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.futures;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

// Referenced classes of package androidx.work.impl.utils.futures:
//			AbstractFuture

private static final class AbstractFuture$SafeAtomicHelper extends AbstractFuture.AtomicHelper
{

	boolean casListeners(AbstractFuture abstractfuture, AbstractFuture.Listener listener, AbstractFuture.Listener listener1)
	{
		return listenersUpdater.compareAndSet(((Object) (abstractfuture)), ((Object) (listener)), ((Object) (listener1)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field AtomicReferenceFieldUpdater listenersUpdater>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #44  <Method boolean AtomicReferenceFieldUpdater.compareAndSet(Object, Object, Object)>
	//    6   10:ireturn         
	}

	boolean casValue(AbstractFuture abstractfuture, Object obj, Object obj1)
	{
		return valueUpdater.compareAndSet(((Object) (abstractfuture)), obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AtomicReferenceFieldUpdater valueUpdater>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #44  <Method boolean AtomicReferenceFieldUpdater.compareAndSet(Object, Object, Object)>
	//    6   10:ireturn         
	}

	boolean casWaiters(AbstractFuture abstractfuture, AbstractFuture.Waiter waiter, AbstractFuture.Waiter waiter1)
	{
		return waitersUpdater.compareAndSet(((Object) (abstractfuture)), ((Object) (waiter)), ((Object) (waiter1)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field AtomicReferenceFieldUpdater waitersUpdater>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #44  <Method boolean AtomicReferenceFieldUpdater.compareAndSet(Object, Object, Object)>
	//    6   10:ireturn         
	}

	void putNext(AbstractFuture.Waiter waiter, AbstractFuture.Waiter waiter1)
	{
		waiterNextUpdater.lazySet(((Object) (waiter)), ((Object) (waiter1)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field AtomicReferenceFieldUpdater waiterNextUpdater>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #57  <Method void AtomicReferenceFieldUpdater.lazySet(Object, Object)>
	//    5    9:return          
	}

	void putThread(AbstractFuture.Waiter waiter, Thread thread)
	{
		waiterThreadUpdater.lazySet(((Object) (waiter)), ((Object) (thread)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AtomicReferenceFieldUpdater waiterThreadUpdater>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #57  <Method void AtomicReferenceFieldUpdater.lazySet(Object, Object)>
	//    5    9:return          
	}

	final AtomicReferenceFieldUpdater listenersUpdater;
	final AtomicReferenceFieldUpdater valueUpdater;
	final AtomicReferenceFieldUpdater waiterNextUpdater;
	final AtomicReferenceFieldUpdater waiterThreadUpdater;
	final AtomicReferenceFieldUpdater waitersUpdater;

	AbstractFuture$SafeAtomicHelper(AtomicReferenceFieldUpdater atomicreferencefieldupdater, AtomicReferenceFieldUpdater atomicreferencefieldupdater1, AtomicReferenceFieldUpdater atomicreferencefieldupdater2, AtomicReferenceFieldUpdater atomicreferencefieldupdater3, AtomicReferenceFieldUpdater atomicreferencefieldupdater4)
	{
		super(((AbstractFuture._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #23  <Method void AbstractFuture$AtomicHelper(AbstractFuture$1)>
		waiterThreadUpdater = atomicreferencefieldupdater;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #25  <Field AtomicReferenceFieldUpdater waiterThreadUpdater>
		waiterNextUpdater = atomicreferencefieldupdater1;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #27  <Field AtomicReferenceFieldUpdater waiterNextUpdater>
		waitersUpdater = atomicreferencefieldupdater2;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #29  <Field AtomicReferenceFieldUpdater waitersUpdater>
		listenersUpdater = atomicreferencefieldupdater3;
	//   12   20:aload_0         
	//   13   21:aload           4
	//   14   23:putfield        #31  <Field AtomicReferenceFieldUpdater listenersUpdater>
		valueUpdater = atomicreferencefieldupdater4;
	//   15   26:aload_0         
	//   16   27:aload           5
	//   17   29:putfield        #33  <Field AtomicReferenceFieldUpdater valueUpdater>
	//   18   32:return          
	}
}
