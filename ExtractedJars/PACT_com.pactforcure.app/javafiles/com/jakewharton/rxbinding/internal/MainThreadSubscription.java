// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Subscription;

public abstract class MainThreadSubscription
	implements Subscription, Runnable
{

	public MainThreadSubscription()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:return          
	}

	public final boolean isUnsubscribed()
	{
		return unsubscribed != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int unsubscribed>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected abstract void onUnsubscribe();

	public final void run()
	{
		onUnsubscribe();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method void onUnsubscribe()>
	//    2    4:return          
	}

	public final void unsubscribe()
	{
label0:
		{
			if(unsubscribedUpdater.compareAndSet(((Object) (this)), 0, 1))
	//*   0    0:getstatic       #40  <Field AtomicIntegerFieldUpdater unsubscribedUpdater>
	//*   1    3:aload_0         
	//*   2    4:iconst_0        
	//*   3    5:iconst_1        
	//*   4    6:invokevirtual   #56  <Method boolean AtomicIntegerFieldUpdater.compareAndSet(Object, int, int)>
	//*   5    9:ifeq            25
			{
				if(Looper.getMainLooper() != Looper.myLooper())
					break label0;
	//    6   12:invokestatic    #25  <Method Looper Looper.getMainLooper()>
	//    7   15:invokestatic    #59  <Method Looper Looper.myLooper()>
	//    8   18:if_acmpne       26
				onUnsubscribe();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #51  <Method void onUnsubscribe()>
			}
			return;
	//   11   25:return          
		}
		mainThread.post(((Runnable) (this)));
	//   12   26:getstatic       #31  <Field Handler mainThread>
	//   13   29:aload_0         
	//   14   30:invokevirtual   #63  <Method boolean Handler.post(Runnable)>
	//   15   33:pop             
	//   16   34:return          
	}

	private static final Handler mainThread = new Handler(Looper.getMainLooper());
	private static final AtomicIntegerFieldUpdater unsubscribedUpdater = AtomicIntegerFieldUpdater.newUpdater(com/jakewharton/rxbinding/internal/MainThreadSubscription, "unsubscribed");
	private volatile int unsubscribed;

	static 
	{
	//    0    0:new             #19  <Class Handler>
	//    1    3:dup             
	//    2    4:invokestatic    #25  <Method Looper Looper.getMainLooper()>
	//    3    7:invokespecial   #29  <Method void Handler(Looper)>
	//    4   10:putstatic       #31  <Field Handler mainThread>
	//    5   13:ldc1            #2   <Class MainThreadSubscription>
	//    6   15:ldc1            #32  <String "unsubscribed">
	//    7   17:invokestatic    #38  <Method AtomicIntegerFieldUpdater AtomicIntegerFieldUpdater.newUpdater(Class, String)>
	//    8   20:putstatic       #40  <Field AtomicIntegerFieldUpdater unsubscribedUpdater>
	//*   9   23:return          
	}
}
