// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package android.support.v4.provider:
//			SelfDestructiveThread

class SelfDestructiveThread$3
	implements Runnable
{

	public void run()
	{
		Exception exception;
		try
		{
			val$holder.set(val$callable.call());
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field AtomicReference val$holder>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field Callable val$callable>
	//    4    8:invokeinterface #50  <Method Object Callable.call()>
	//    5   13:invokevirtual   #56  <Method void AtomicReference.set(Object)>
		}
	//*   6   16:aload_0         
	//*   7   17:getfield        #33  <Field ReentrantLock val$lock>
	//*   8   20:invokevirtual   #61  <Method void ReentrantLock.lock()>
	//*   9   23:aload_0         
	//*  10   24:getfield        #35  <Field AtomicBoolean val$running>
	//*  11   27:iconst_0        
	//*  12   28:invokevirtual   #66  <Method void AtomicBoolean.set(boolean)>
	//*  13   31:aload_0         
	//*  14   32:getfield        #37  <Field Condition val$cond>
	//*  15   35:invokeinterface #71  <Method void Condition.signal()>
	//*  16   40:aload_0         
	//*  17   41:getfield        #33  <Field ReentrantLock val$lock>
	//*  18   44:invokevirtual   #74  <Method void ReentrantLock.unlock()>
	//*  19   47:return          
	//*  20   48:astore_1        
	//*  21   49:aload_0         
	//*  22   50:getfield        #33  <Field ReentrantLock val$lock>
	//*  23   53:invokevirtual   #74  <Method void ReentrantLock.unlock()>
	//*  24   56:aload_1         
	//*  25   57:athrow          
		catch(Exception exception1) { }
	//   26   58:astore_1        
		val$lock.lock();
		val$running.set(false);
		val$cond.signal();
		val$lock.unlock();
		return;
		exception;
		val$lock.unlock();
		throw exception;
	//*  27   59:goto            16
	}

	final SelfDestructiveThread this$0;
	final Callable val$callable;
	final Condition val$cond;
	final AtomicReference val$holder;
	final ReentrantLock val$lock;
	final AtomicBoolean val$running;

	SelfDestructiveThread$3()
	{
		this$0 = final_selfdestructivethread;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field SelfDestructiveThread this$0>
		val$holder = atomicreference;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #29  <Field AtomicReference val$holder>
		val$callable = callable1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #31  <Field Callable val$callable>
		val$lock = reentrantlock;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #33  <Field ReentrantLock val$lock>
		val$running = atomicboolean;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #35  <Field AtomicBoolean val$running>
		val$cond = Condition.this;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #37  <Field Condition val$cond>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #40  <Method void Object()>
	//   20   37:return          
	}
}
