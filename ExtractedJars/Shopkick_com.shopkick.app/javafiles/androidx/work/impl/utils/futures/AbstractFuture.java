// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package androidx.work.impl.utils.futures:
//			DirectExecutor

public abstract class AbstractFuture
	implements ListenableFuture
{
	private static abstract class AtomicHelper
	{

		abstract boolean casListeners(AbstractFuture abstractfuture, Listener listener, Listener listener1);

		abstract boolean casValue(AbstractFuture abstractfuture, Object obj, Object obj1);

		abstract boolean casWaiters(AbstractFuture abstractfuture, Waiter waiter, Waiter waiter1);

		abstract void putNext(Waiter waiter, Waiter waiter1);

		abstract void putThread(Waiter waiter, Thread thread);

		private AtomicHelper()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}

	}

	private static final class Cancellation
	{

		static final Cancellation CAUSELESS_CANCELLED;
		static final Cancellation CAUSELESS_INTERRUPTED;
		final Throwable cause;
		final boolean wasInterrupted;

		static 
		{
			if(AbstractFuture.GENERATE_CANCELLATION_CAUSES)
		//*   0    0:getstatic       #20  <Field boolean AbstractFuture.GENERATE_CANCELLATION_CAUSES>
		//*   1    3:ifeq            15
			{
				CAUSELESS_CANCELLED = null;
		//    2    6:aconst_null     
		//    3    7:putstatic       #22  <Field AbstractFuture$Cancellation CAUSELESS_CANCELLED>
				CAUSELESS_INTERRUPTED = null;
		//    4   10:aconst_null     
		//    5   11:putstatic       #24  <Field AbstractFuture$Cancellation CAUSELESS_INTERRUPTED>
		//    6   14:return          
			} else
			{
				CAUSELESS_CANCELLED = new Cancellation(false, ((Throwable) (null)));
		//    7   15:new             #2   <Class AbstractFuture$Cancellation>
		//    8   18:dup             
		//    9   19:iconst_0        
		//   10   20:aconst_null     
		//   11   21:invokespecial   #28  <Method void AbstractFuture$Cancellation(boolean, Throwable)>
		//   12   24:putstatic       #22  <Field AbstractFuture$Cancellation CAUSELESS_CANCELLED>
				CAUSELESS_INTERRUPTED = new Cancellation(true, ((Throwable) (null)));
		//   13   27:new             #2   <Class AbstractFuture$Cancellation>
		//   14   30:dup             
		//   15   31:iconst_1        
		//   16   32:aconst_null     
		//   17   33:invokespecial   #28  <Method void AbstractFuture$Cancellation(boolean, Throwable)>
		//   18   36:putstatic       #24  <Field AbstractFuture$Cancellation CAUSELESS_INTERRUPTED>
			}
		//*  19   39:return          
		}

		Cancellation(boolean flag, Throwable throwable)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			wasInterrupted = flag;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #33  <Field boolean wasInterrupted>
			cause = throwable;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #35  <Field Throwable cause>
		//    8   14:return          
		}
	}

	private static final class Failure
	{

		static final Failure FALLBACK_INSTANCE = new Failure(((Throwable) (new Throwable("Failure occurred while trying to finish a future.") {

			public Throwable fillInStackTrace()
			{
				this;
			//    0    0:aload_0         
				JVM INSTR monitorenter ;
			//    1    1:monitorenter    
			//*   2    2:aload_0         
				return ((Throwable) (this));
			//    3    3:monitorexit     
			//    4    4:aload_0         
			//    5    5:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokespecial   #13  <Method void Throwable(String)>
			//    3    5:return          
			}
		}
)));
		final Throwable exception;

		static 
		{
		//    0    0:new             #2   <Class AbstractFuture$Failure>
		//    1    3:dup             
		//    2    4:new             #9   <Class AbstractFuture$Failure$1>
		//    3    7:dup             
		//    4    8:ldc1            #17  <String "Failure occurred while trying to finish a future.">
		//    5   10:invokespecial   #21  <Method void AbstractFuture$Failure$1(String)>
		//    6   13:invokespecial   #24  <Method void AbstractFuture$Failure(Throwable)>
		//    7   16:putstatic       #26  <Field AbstractFuture$Failure FALLBACK_INSTANCE>
		//*   8   19:return          
		}

		Failure(Throwable throwable)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void Object()>
			exception = (Throwable)AbstractFuture.checkNotNull(((Object) (throwable)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #33  <Method Object AbstractFuture.checkNotNull(Object)>
		//    5    9:checkcast       #35  <Class Throwable>
		//    6   12:putfield        #37  <Field Throwable exception>
		//    7   15:return          
		}
	}

	private static final class Listener
	{

		static final Listener TOMBSTONE = new Listener(((Runnable) (null)), ((Executor) (null)));
		final Executor executor;
		Listener next;
		final Runnable task;

		static 
		{
		//    0    0:new             #2   <Class AbstractFuture$Listener>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:aconst_null     
		//    4    6:invokespecial   #21  <Method void AbstractFuture$Listener(Runnable, Executor)>
		//    5    9:putstatic       #23  <Field AbstractFuture$Listener TOMBSTONE>
		//*   6   12:return          
		}

		Listener(Runnable runnable, Executor executor1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			task = runnable;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #28  <Field Runnable task>
			executor = executor1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #30  <Field Executor executor>
		//    8   14:return          
		}
	}

	private static final class SafeAtomicHelper extends AtomicHelper
	{

		boolean casListeners(AbstractFuture abstractfuture, Listener listener, Listener listener1)
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

		boolean casWaiters(AbstractFuture abstractfuture, Waiter waiter, Waiter waiter1)
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

		void putNext(Waiter waiter, Waiter waiter1)
		{
			waiterNextUpdater.lazySet(((Object) (waiter)), ((Object) (waiter1)));
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field AtomicReferenceFieldUpdater waiterNextUpdater>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #57  <Method void AtomicReferenceFieldUpdater.lazySet(Object, Object)>
		//    5    9:return          
		}

		void putThread(Waiter waiter, Thread thread)
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

		SafeAtomicHelper(AtomicReferenceFieldUpdater atomicreferencefieldupdater, AtomicReferenceFieldUpdater atomicreferencefieldupdater1, AtomicReferenceFieldUpdater atomicreferencefieldupdater2, AtomicReferenceFieldUpdater atomicreferencefieldupdater3, AtomicReferenceFieldUpdater atomicreferencefieldupdater4)
		{
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

	private static final class SetFuture
		implements Runnable
	{

		public void run()
		{
			if(owner.value != this)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field AbstractFuture owner>
		//*   2    4:getfield        #33  <Field Object AbstractFuture.value>
		//*   3    7:aload_0         
		//*   4    8:if_acmpeq       12
				return;
		//    5   11:return          
			Object obj = AbstractFuture.getFutureValue(future);
		//    6   12:aload_0         
		//    7   13:getfield        #25  <Field ListenableFuture future>
		//    8   16:invokestatic    #37  <Method Object AbstractFuture.getFutureValue(ListenableFuture)>
		//    9   19:astore_1        
			if(AbstractFuture.ATOMIC_HELPER.casValue(owner, ((Object) (this)), obj))
		//*  10   20:getstatic       #41  <Field AbstractFuture$AtomicHelper AbstractFuture.ATOMIC_HELPER>
		//*  11   23:aload_0         
		//*  12   24:getfield        #23  <Field AbstractFuture owner>
		//*  13   27:aload_0         
		//*  14   28:aload_1         
		//*  15   29:invokevirtual   #47  <Method boolean AbstractFuture$AtomicHelper.casValue(AbstractFuture, Object, Object)>
		//*  16   32:ifeq            42
				AbstractFuture.complete(owner);
		//   17   35:aload_0         
		//   18   36:getfield        #23  <Field AbstractFuture owner>
		//   19   39:invokestatic    #51  <Method void AbstractFuture.complete(AbstractFuture)>
		//   20   42:return          
		}

		final ListenableFuture future;
		final AbstractFuture owner;

		SetFuture(AbstractFuture abstractfuture, ListenableFuture listenablefuture)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			owner = abstractfuture;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field AbstractFuture owner>
			future = listenablefuture;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field ListenableFuture future>
		//    8   14:return          
		}
	}

	private static final class SynchronizedHelper extends AtomicHelper
	{

		boolean casListeners(AbstractFuture abstractfuture, Listener listener, Listener listener1)
		{
			abstractfuture;
		//    0    0:aload_1         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			if(abstractfuture.listeners != listener)
				break MISSING_BLOCK_LABEL_19;
		//    2    2:aload_1         
		//    3    3:getfield        #19  <Field AbstractFuture$Listener AbstractFuture.listeners>
		//    4    6:aload_2         
		//    5    7:if_acmpne       19
			abstractfuture.listeners = listener1;
		//    6   10:aload_1         
		//    7   11:aload_3         
		//    8   12:putfield        #19  <Field AbstractFuture$Listener AbstractFuture.listeners>
		//*   9   15:aload_1         
		//*  10   16:monitorexit     
			return true;
		//   11   17:iconst_1        
		//   12   18:ireturn         
			abstractfuture;
		//   13   19:aload_1         
			JVM INSTR monitorexit ;
		//   14   20:monitorexit     
			return false;
		//   15   21:iconst_0        
		//   16   22:ireturn         
			listener;
		//   17   23:astore_2        
			abstractfuture;
		//   18   24:aload_1         
			JVM INSTR monitorexit ;
		//   19   25:monitorexit     
			throw listener;
		//   20   26:aload_2         
		//   21   27:athrow          
		}

		boolean casValue(AbstractFuture abstractfuture, Object obj, Object obj1)
		{
			abstractfuture;
		//    0    0:aload_1         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			if(abstractfuture.value != obj)
				break MISSING_BLOCK_LABEL_19;
		//    2    2:aload_1         
		//    3    3:getfield        #27  <Field Object AbstractFuture.value>
		//    4    6:aload_2         
		//    5    7:if_acmpne       19
			abstractfuture.value = obj1;
		//    6   10:aload_1         
		//    7   11:aload_3         
		//    8   12:putfield        #27  <Field Object AbstractFuture.value>
		//*   9   15:aload_1         
		//*  10   16:monitorexit     
			return true;
		//   11   17:iconst_1        
		//   12   18:ireturn         
			abstractfuture;
		//   13   19:aload_1         
			JVM INSTR monitorexit ;
		//   14   20:monitorexit     
			return false;
		//   15   21:iconst_0        
		//   16   22:ireturn         
			obj;
		//   17   23:astore_2        
			abstractfuture;
		//   18   24:aload_1         
			JVM INSTR monitorexit ;
		//   19   25:monitorexit     
			throw obj;
		//   20   26:aload_2         
		//   21   27:athrow          
		}

		boolean casWaiters(AbstractFuture abstractfuture, Waiter waiter, Waiter waiter1)
		{
			abstractfuture;
		//    0    0:aload_1         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			if(abstractfuture.waiters != waiter)
				break MISSING_BLOCK_LABEL_19;
		//    2    2:aload_1         
		//    3    3:getfield        #34  <Field AbstractFuture$Waiter AbstractFuture.waiters>
		//    4    6:aload_2         
		//    5    7:if_acmpne       19
			abstractfuture.waiters = waiter1;
		//    6   10:aload_1         
		//    7   11:aload_3         
		//    8   12:putfield        #34  <Field AbstractFuture$Waiter AbstractFuture.waiters>
		//*   9   15:aload_1         
		//*  10   16:monitorexit     
			return true;
		//   11   17:iconst_1        
		//   12   18:ireturn         
			abstractfuture;
		//   13   19:aload_1         
			JVM INSTR monitorexit ;
		//   14   20:monitorexit     
			return false;
		//   15   21:iconst_0        
		//   16   22:ireturn         
			waiter;
		//   17   23:astore_2        
			abstractfuture;
		//   18   24:aload_1         
			JVM INSTR monitorexit ;
		//   19   25:monitorexit     
			throw waiter;
		//   20   26:aload_2         
		//   21   27:athrow          
		}

		void putNext(Waiter waiter, Waiter waiter1)
		{
			waiter.next = waiter1;
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:putfield        #42  <Field AbstractFuture$Waiter AbstractFuture$Waiter.next>
		//    3    5:return          
		}

		void putThread(Waiter waiter, Thread thread)
		{
			waiter.thread = thread;
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:putfield        #48  <Field Thread AbstractFuture$Waiter.thread>
		//    3    5:return          
		}

		SynchronizedHelper()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #12  <Method void AbstractFuture$AtomicHelper(AbstractFuture$1)>
		//    3    5:return          
		}
	}

	private static final class Waiter
	{

		void setNext(Waiter waiter)
		{
			AbstractFuture.ATOMIC_HELPER.putNext(this, waiter);
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

		static final Waiter TOMBSTONE = new Waiter(false);
		volatile Waiter next;
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

		Waiter()
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

		Waiter(boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:return          
		}
	}


	protected AbstractFuture()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method void Object()>
	//    2    4:return          
	}

	private void addDoneString(StringBuilder stringbuilder)
	{
		CancellationException cancellationexception;
		try
		{
			Object obj = getUninterruptibly(((Future) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #142 <Method Object getUninterruptibly(Future)>
	//    2    4:astore_2        
			stringbuilder.append("SUCCESS, result=[");
	//    3    5:aload_1         
	//    4    6:ldc1            #144 <String "SUCCESS, result=[">
	//    5    8:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//    6   11:pop             
			stringbuilder.append(userObjectToString(obj));
	//    7   12:aload_1         
	//    8   13:aload_0         
	//    9   14:aload_2         
	//   10   15:invokespecial   #154 <Method String userObjectToString(Object)>
	//   11   18:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   12   21:pop             
			stringbuilder.append("]");
	//   13   22:aload_1         
	//   14   23:ldc1            #156 <String "]">
	//   15   25:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   16   28:pop             
			return;
	//   17   29:return          
		}
	//*  18   30:astore_2        
	//*  19   31:aload_1         
	//*  20   32:ldc1            #158 <String "UNKNOWN, cause=[">
	//*  21   34:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//*  22   37:pop             
	//*  23   38:aload_1         
	//*  24   39:aload_2         
	//*  25   40:invokevirtual   #162 <Method Class Object.getClass()>
	//*  26   43:invokevirtual   #165 <Method StringBuilder StringBuilder.append(Object)>
	//*  27   46:pop             
	//*  28   47:aload_1         
	//*  29   48:ldc1            #167 <String " thrown from get()]">
	//*  30   50:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//*  31   53:pop             
	//*  32   54:return          
	//*  33   55:aload_1         
	//*  34   56:ldc1            #169 <String "CANCELLED">
	//*  35   58:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//*  36   61:pop             
	//*  37   62:return          
		catch(ExecutionException executionexception)
	//*  38   63:astore_2        
		{
			stringbuilder.append("FAILURE, cause=[");
	//   39   64:aload_1         
	//   40   65:ldc1            #171 <String "FAILURE, cause=[">
	//   41   67:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   42   70:pop             
			stringbuilder.append(((Object) (executionexception.getCause())));
	//   43   71:aload_1         
	//   44   72:aload_2         
	//   45   73:invokevirtual   #175 <Method Throwable ExecutionException.getCause()>
	//   46   76:invokevirtual   #165 <Method StringBuilder StringBuilder.append(Object)>
	//   47   79:pop             
			stringbuilder.append("]");
	//   48   80:aload_1         
	//   49   81:ldc1            #156 <String "]">
	//   50   83:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   51   86:pop             
			return;
	//   52   87:return          
		}
		// Misplaced declaration of an exception variable
		catch(CancellationException cancellationexception)
		{
			stringbuilder.append("CANCELLED");
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			stringbuilder.append("UNKNOWN, cause=[");
			stringbuilder.append(((Object) (((Object) (runtimeexception)).getClass())));
			stringbuilder.append(" thrown from get()]");
			return;
		}
	//*  53   88:astore_2        
	//*  54   89:goto            55
	}

	private static CancellationException cancellationExceptionWithCause(String s, Throwable throwable)
	{
		s = ((String) (new CancellationException(s)));
	//    0    0:new             #136 <Class CancellationException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #180 <Method void CancellationException(String)>
	//    4    8:astore_0        
		((CancellationException) (s)).initCause(throwable);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #184 <Method Throwable CancellationException.initCause(Throwable)>
	//    8   14:pop             
		return ((CancellationException) (s));
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	static Object checkNotNull(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          6
			return obj;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			throw new NullPointerException();
	//    4    6:new             #190 <Class NullPointerException>
	//    5    9:dup             
	//    6   10:invokespecial   #191 <Method void NullPointerException()>
	//    7   13:athrow          
	}

	private Listener clearListeners(Listener listener)
	{
		Listener listener2;
		do
			listener2 = listeners;
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field AbstractFuture$Listener listeners>
	//    2    4:astore_3        
		while(!ATOMIC_HELPER.casListeners(this, listener2, Listener.TOMBSTONE));
	//    3    5:getstatic       #115 <Field AbstractFuture$AtomicHelper ATOMIC_HELPER>
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:getstatic       #201 <Field AbstractFuture$Listener AbstractFuture$Listener.TOMBSTONE>
	//    7   13:invokevirtual   #205 <Method boolean AbstractFuture$AtomicHelper.casListeners(AbstractFuture, AbstractFuture$Listener, AbstractFuture$Listener)>
	//    8   16:ifeq            0
		Listener listener1 = listener;
	//    9   19:aload_1         
	//   10   20:astore_2        
		for(listener = listener2; listener != null; listener = listener2)
	//*  11   21:aload_3         
	//*  12   22:astore_1        
	//*  13   23:aload_1         
	//*  14   24:ifnull          44
		{
			listener2 = listener.next;
	//   15   27:aload_1         
	//   16   28:getfield        #207 <Field AbstractFuture$Listener AbstractFuture$Listener.next>
	//   17   31:astore_3        
			listener.next = listener1;
	//   18   32:aload_1         
	//   19   33:aload_2         
	//   20   34:putfield        #207 <Field AbstractFuture$Listener AbstractFuture$Listener.next>
			listener1 = listener;
	//   21   37:aload_1         
	//   22   38:astore_2        
		}

	//   23   39:aload_3         
	//   24   40:astore_1        
	//*  25   41:goto            23
		return listener1;
	//   26   44:aload_2         
	//   27   45:areturn         
	}

	static void complete(AbstractFuture abstractfuture)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		Object obj = ((Object) (abstractfuture));
	//    2    2:aload_0         
	//    3    3:astore_1        
		abstractfuture = ((AbstractFuture) (obj1));
	//    4    4:aload_2         
	//    5    5:astore_0        
label0:
		do
		{
			((AbstractFuture) (obj)).releaseWaiters();
	//    6    6:aload_1         
	//    7    7:invokespecial   #212 <Method void releaseWaiters()>
			((AbstractFuture) (obj)).afterDone();
	//    8   10:aload_1         
	//    9   11:invokevirtual   #215 <Method void afterDone()>
			for(obj = ((Object) (((AbstractFuture) (obj)).clearListeners(((Listener) (abstractfuture))))); obj != null; obj = ((Object) (abstractfuture)))
	//*  10   14:aload_1         
	//*  11   15:aload_0         
	//*  12   16:invokespecial   #217 <Method AbstractFuture$Listener clearListeners(AbstractFuture$Listener)>
	//*  13   19:astore_1        
	//*  14   20:aload_1         
	//*  15   21:ifnull          95
			{
				abstractfuture = ((AbstractFuture) (((Listener) (obj)).next));
	//   16   24:aload_1         
	//   17   25:getfield        #207 <Field AbstractFuture$Listener AbstractFuture$Listener.next>
	//   18   28:astore_0        
				Object obj2 = ((Object) (((Listener) (obj)).task));
	//   19   29:aload_1         
	//   20   30:getfield        #221 <Field Runnable AbstractFuture$Listener.task>
	//   21   33:astore_2        
				if(obj2 instanceof SetFuture)
	//*  22   34:aload_2         
	//*  23   35:instanceof      #28  <Class AbstractFuture$SetFuture>
	//*  24   38:ifeq            82
				{
					obj2 = ((Object) ((SetFuture)obj2));
	//   25   41:aload_2         
	//   26   42:checkcast       #28  <Class AbstractFuture$SetFuture>
	//   27   45:astore_2        
					obj = ((Object) (((SetFuture) (obj2)).owner));
	//   28   46:aload_2         
	//   29   47:getfield        #225 <Field AbstractFuture AbstractFuture$SetFuture.owner>
	//   30   50:astore_1        
					if(((AbstractFuture) (obj)).value != obj2)
						continue;
	//   31   51:aload_1         
	//   32   52:getfield        #227 <Field Object value>
	//   33   55:aload_2         
	//   34   56:if_acmpne       90
					Object obj3 = getFutureValue(((SetFuture) (obj2)).future);
	//   35   59:aload_2         
	//   36   60:getfield        #231 <Field ListenableFuture AbstractFuture$SetFuture.future>
	//   37   63:invokestatic    #235 <Method Object getFutureValue(ListenableFuture)>
	//   38   66:astore_3        
					if(!ATOMIC_HELPER.casValue(((AbstractFuture) (obj)), obj2, obj3))
	//*  39   67:getstatic       #115 <Field AbstractFuture$AtomicHelper ATOMIC_HELPER>
	//*  40   70:aload_1         
	//*  41   71:aload_2         
	//*  42   72:aload_3         
	//*  43   73:invokevirtual   #239 <Method boolean AbstractFuture$AtomicHelper.casValue(AbstractFuture, Object, Object)>
	//*  44   76:ifeq            90
						continue;
	//   45   79:goto            6
					continue label0;
				}
				executeListener(((Runnable) (obj2)), ((Listener) (obj)).executor);
	//   46   82:aload_2         
	//   47   83:aload_1         
	//   48   84:getfield        #243 <Field Executor AbstractFuture$Listener.executor>
	//   49   87:invokestatic    #247 <Method void executeListener(Runnable, Executor)>
			}

	//   50   90:aload_0         
	//   51   91:astore_1        
	//*  52   92:goto            20
			return;
	//   53   95:return          
		} while(true);
	}

	private static void executeListener(Runnable runnable, Executor executor)
	{
		try
		{
			executor.execute(runnable);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #254 <Method void Executor.execute(Runnable)>
			return;
	//    3    7:return          
		}
		catch(RuntimeException runtimeexception)
	//*   4    8:astore_2        
		{
			Logger logger = log;
	//    5    9:getstatic       #92  <Field Logger log>
	//    6   12:astore_3        
			Level level = Level.SEVERE;
	//    7   13:getstatic       #121 <Field Level Level.SEVERE>
	//    8   16:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//    9   18:new             #146 <Class StringBuilder>
	//   10   21:dup             
	//   11   22:invokespecial   #255 <Method void StringBuilder()>
	//   12   25:astore          5
			stringbuilder.append("RuntimeException while executing runnable ");
	//   13   27:aload           5
	//   14   29:ldc2            #257 <String "RuntimeException while executing runnable ">
	//   15   32:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   16   35:pop             
			stringbuilder.append(((Object) (runnable)));
	//   17   36:aload           5
	//   18   38:aload_0         
	//   19   39:invokevirtual   #165 <Method StringBuilder StringBuilder.append(Object)>
	//   20   42:pop             
			stringbuilder.append(" with executor ");
	//   21   43:aload           5
	//   22   45:ldc2            #259 <String " with executor ">
	//   23   48:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
			stringbuilder.append(((Object) (executor)));
	//   25   52:aload           5
	//   26   54:aload_1         
	//   27   55:invokevirtual   #165 <Method StringBuilder StringBuilder.append(Object)>
	//   28   58:pop             
			logger.log(level, stringbuilder.toString(), ((Throwable) (runtimeexception)));
	//   29   59:aload_3         
	//   30   60:aload           4
	//   31   62:aload           5
	//   32   64:invokevirtual   #262 <Method String StringBuilder.toString()>
	//   33   67:aload_2         
	//   34   68:invokevirtual   #126 <Method void Logger.log(Level, String, Throwable)>
			return;
	//   35   71:return          
		}
	}

	private Object getDoneValue(Object obj)
		throws ExecutionException
	{
		if(!(obj instanceof Cancellation))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #14  <Class AbstractFuture$Cancellation>
	//*   2    4:ifne            40
		{
			if(!(obj instanceof Failure))
	//*   3    7:aload_1         
	//*   4    8:instanceof      #17  <Class AbstractFuture$Failure>
	//*   5   11:ifne            25
			{
				if(obj == NULL)
	//*   6   14:aload_1         
	//*   7   15:getstatic       #129 <Field Object NULL>
	//*   8   18:if_acmpne       23
					return ((Object) (null));
	//    9   21:aconst_null     
	//   10   22:areturn         
				else
					return obj;
	//   11   23:aload_1         
	//   12   24:areturn         
			} else
			{
				throw new ExecutionException(((Failure)obj).exception);
	//   13   25:new             #134 <Class ExecutionException>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:checkcast       #17  <Class AbstractFuture$Failure>
	//   17   33:getfield        #267 <Field Throwable AbstractFuture$Failure.exception>
	//   18   36:invokespecial   #270 <Method void ExecutionException(Throwable)>
	//   19   39:athrow          
			}
		} else
		{
			throw cancellationExceptionWithCause("Task was cancelled.", ((Cancellation)obj).cause);
	//   20   40:ldc2            #272 <String "Task was cancelled.">
	//   21   43:aload_1         
	//   22   44:checkcast       #14  <Class AbstractFuture$Cancellation>
	//   23   47:getfield        #275 <Field Throwable AbstractFuture$Cancellation.cause>
	//   24   50:invokestatic    #277 <Method CancellationException cancellationExceptionWithCause(String, Throwable)>
	//   25   53:athrow          
		}
	}

	static Object getFutureValue(ListenableFuture listenablefuture)
	{
		if(listenablefuture instanceof AbstractFuture)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #2   <Class AbstractFuture>
	//*   2    4:ifeq            64
		{
			Object obj = ((AbstractFuture)listenablefuture).value;
	//    3    7:aload_0         
	//    4    8:checkcast       #2   <Class AbstractFuture>
	//    5   11:getfield        #227 <Field Object value>
	//    6   14:astore_2        
			listenablefuture = ((ListenableFuture) (obj));
	//    7   15:aload_2         
	//    8   16:astore_0        
			if(obj instanceof Cancellation)
	//*   9   17:aload_2         
	//*  10   18:instanceof      #14  <Class AbstractFuture$Cancellation>
	//*  11   21:ifeq            62
			{
				Cancellation cancellation = (Cancellation)obj;
	//   12   24:aload_2         
	//   13   25:checkcast       #14  <Class AbstractFuture$Cancellation>
	//   14   28:astore_3        
				listenablefuture = ((ListenableFuture) (obj));
	//   15   29:aload_2         
	//   16   30:astore_0        
				if(cancellation.wasInterrupted)
	//*  17   31:aload_3         
	//*  18   32:getfield        #282 <Field boolean AbstractFuture$Cancellation.wasInterrupted>
	//*  19   35:ifeq            62
				{
					if(cancellation.cause != null)
	//*  20   38:aload_3         
	//*  21   39:getfield        #275 <Field Throwable AbstractFuture$Cancellation.cause>
	//*  22   42:ifnull          58
						return ((Object) (new Cancellation(false, cancellation.cause)));
	//   23   45:new             #14  <Class AbstractFuture$Cancellation>
	//   24   48:dup             
	//   25   49:iconst_0        
	//   26   50:aload_3         
	//   27   51:getfield        #275 <Field Throwable AbstractFuture$Cancellation.cause>
	//   28   54:invokespecial   #285 <Method void AbstractFuture$Cancellation(boolean, Throwable)>
	//   29   57:areturn         
					listenablefuture = ((ListenableFuture) (Cancellation.CAUSELESS_CANCELLED));
	//   30   58:getstatic       #289 <Field AbstractFuture$Cancellation AbstractFuture$Cancellation.CAUSELESS_CANCELLED>
	//   31   61:astore_0        
				}
			}
			return ((Object) (listenablefuture));
	//   32   62:aload_0         
	//   33   63:areturn         
		}
		boolean flag = listenablefuture.isCancelled();
	//   34   64:aload_0         
	//   35   65:invokeinterface #293 <Method boolean ListenableFuture.isCancelled()>
	//   36   70:istore_1        
		if((GENERATE_CANCELLATION_CAUSES ^ true) & flag)
	//*  37   71:getstatic       #78  <Field boolean GENERATE_CANCELLATION_CAUSES>
	//*  38   74:iconst_1        
	//*  39   75:ixor            
	//*  40   76:iload_1         
	//*  41   77:iand            
	//*  42   78:ifeq            85
			return ((Object) (Cancellation.CAUSELESS_CANCELLED));
	//   43   81:getstatic       #289 <Field AbstractFuture$Cancellation AbstractFuture$Cancellation.CAUSELESS_CANCELLED>
	//   44   84:areturn         
		Object obj1;
		Object obj2;
		try
		{
			obj2 = getUninterruptibly(((Future) (listenablefuture)));
	//   45   85:aload_0         
	//   46   86:invokestatic    #142 <Method Object getUninterruptibly(Future)>
	//   47   89:astore_3        
		}
	//*  48   90:aload_3         
	//*  49   91:astore_2        
	//*  50   92:aload_3         
	//*  51   93:ifnonnull       100
	//*  52   96:getstatic       #129 <Field Object NULL>
	//*  53   99:astore_2        
	//*  54  100:aload_2         
	//*  55  101:areturn         
	//*  56  102:astore_0        
	//*  57  103:new             #17  <Class AbstractFuture$Failure>
	//*  58  106:dup             
	//*  59  107:aload_0         
	//*  60  108:invokespecial   #294 <Method void AbstractFuture$Failure(Throwable)>
	//*  61  111:areturn         
	//*  62  112:astore_2        
	//*  63  113:iload_1         
	//*  64  114:ifne            159
	//*  65  117:new             #146 <Class StringBuilder>
	//*  66  120:dup             
	//*  67  121:invokespecial   #255 <Method void StringBuilder()>
	//*  68  124:astore_3        
	//*  69  125:aload_3         
	//*  70  126:ldc2            #296 <String "get() threw CancellationException, despite reporting isCancelled() == false: ">
	//*  71  129:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//*  72  132:pop             
	//*  73  133:aload_3         
	//*  74  134:aload_0         
	//*  75  135:invokevirtual   #165 <Method StringBuilder StringBuilder.append(Object)>
	//*  76  138:pop             
	//*  77  139:new             #17  <Class AbstractFuture$Failure>
	//*  78  142:dup             
	//*  79  143:new             #298 <Class IllegalArgumentException>
	//*  80  146:dup             
	//*  81  147:aload_3         
	//*  82  148:invokevirtual   #262 <Method String StringBuilder.toString()>
	//*  83  151:aload_2         
	//*  84  152:invokespecial   #301 <Method void IllegalArgumentException(String, Throwable)>
	//*  85  155:invokespecial   #294 <Method void AbstractFuture$Failure(Throwable)>
	//*  86  158:areturn         
	//*  87  159:new             #14  <Class AbstractFuture$Cancellation>
	//*  88  162:dup             
	//*  89  163:iconst_0        
	//*  90  164:aload_2         
	//*  91  165:invokespecial   #285 <Method void AbstractFuture$Cancellation(boolean, Throwable)>
	//*  92  168:areturn         
		// Misplaced declaration of an exception variable
		catch(ListenableFuture listenablefuture)
	//*  93  169:astore_0        
		{
			return ((Object) (new Failure(((ExecutionException) (listenablefuture)).getCause())));
	//   94  170:new             #17  <Class AbstractFuture$Failure>
	//   95  173:dup             
	//   96  174:aload_0         
	//   97  175:invokevirtual   #175 <Method Throwable ExecutionException.getCause()>
	//   98  178:invokespecial   #294 <Method void AbstractFuture$Failure(Throwable)>
	//   99  181:areturn         
		}
		catch(CancellationException cancellationexception)
		{
			if(!flag)
			{
				StringBuilder stringbuilder = new StringBuilder();
				stringbuilder.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
				stringbuilder.append(((Object) (listenablefuture)));
				return ((Object) (new Failure(((Throwable) (new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (cancellationexception))))))));
			} else
			{
				return ((Object) (new Cancellation(false, ((Throwable) (cancellationexception)))));
			}
		}
		// Misplaced declaration of an exception variable
		catch(ListenableFuture listenablefuture)
		{
			return ((Object) (new Failure(((Throwable) (listenablefuture)))));
		}
		obj1 = obj2;
		if(obj2 != null)
			break MISSING_BLOCK_LABEL_100;
		obj1 = NULL;
		return obj1;
	}

	private static Object getUninterruptibly(Future future)
		throws ExecutionException
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
_L2:
		Object obj = future.get();
	//    2    2:aload_0         
	//    3    3:invokeinterface #310 <Method Object Future.get()>
	//    4    8:astore_2        
		if(flag)
	//*   5    9:iload_1         
	//*   6   10:ifeq            19
			Thread.currentThread().interrupt();
	//    7   13:invokestatic    #314 <Method Thread Thread.currentThread()>
	//    8   16:invokevirtual   #317 <Method void Thread.interrupt()>
		return obj;
	//    9   19:aload_2         
	//   10   20:areturn         
		future;
	//   11   21:astore_0        
		if(flag)
	//*  12   22:iload_1         
	//*  13   23:ifeq            32
			Thread.currentThread().interrupt();
	//   14   26:invokestatic    #314 <Method Thread Thread.currentThread()>
	//   15   29:invokevirtual   #317 <Method void Thread.interrupt()>
		throw future;
	//   16   32:aload_0         
	//   17   33:athrow          
_L3:
		flag = true;
	//   18   34:iconst_1        
	//   19   35:istore_1        
		if(true) goto _L2; else goto _L1
	//   20   36:goto            2
_L1:
		InterruptedException interruptedexception;
		interruptedexception;
	//   21   39:astore_2        
		  goto _L3
	//*  22   40:goto            34
	}

	private void releaseWaiters()
	{
		Waiter waiter;
		do
			waiter = waiters;
	//    0    0:aload_0         
	//    1    1:getfield        #320 <Field AbstractFuture$Waiter waiters>
	//    2    4:astore_1        
		while(!ATOMIC_HELPER.casWaiters(this, waiter, Waiter.TOMBSTONE));
	//    3    5:getstatic       #115 <Field AbstractFuture$AtomicHelper ATOMIC_HELPER>
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getstatic       #322 <Field AbstractFuture$Waiter AbstractFuture$Waiter.TOMBSTONE>
	//    7   13:invokevirtual   #326 <Method boolean AbstractFuture$AtomicHelper.casWaiters(AbstractFuture, AbstractFuture$Waiter, AbstractFuture$Waiter)>
	//    8   16:ifeq            0
		for(; waiter != null; waiter = waiter.next)
	//*   9   19:aload_1         
	//*  10   20:ifnull          35
			waiter.unpark();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #329 <Method void AbstractFuture$Waiter.unpark()>

	//   13   27:aload_1         
	//   14   28:getfield        #331 <Field AbstractFuture$Waiter AbstractFuture$Waiter.next>
	//   15   31:astore_1        
	//*  16   32:goto            19
	//   17   35:return          
	}

	private void removeWaiter(Waiter waiter)
	{
		waiter.thread = null;
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:putfield        #336 <Field Thread AbstractFuture$Waiter.thread>
_L1:
		Waiter waiter1;
		waiter = waiters;
	//    3    5:aload_0         
	//    4    6:getfield        #320 <Field AbstractFuture$Waiter waiters>
	//    5    9:astore_1        
		if(waiter == Waiter.TOMBSTONE)
	//*   6   10:aload_1         
	//*   7   11:getstatic       #322 <Field AbstractFuture$Waiter AbstractFuture$Waiter.TOMBSTONE>
	//*   8   14:if_acmpne       18
			return;
	//    9   17:return          
		waiter1 = null;
	//   10   18:aconst_null     
	//   11   19:astore_2        
_L4:
		Waiter waiter2;
		Waiter waiter3;
		if(waiter == null)
			break MISSING_BLOCK_LABEL_90;
	//   12   20:aload_1         
	//   13   21:ifnull          90
		waiter3 = waiter.next;
	//   14   24:aload_1         
	//   15   25:getfield        #331 <Field AbstractFuture$Waiter AbstractFuture$Waiter.next>
	//   16   28:astore          4
		if(waiter.thread != null)
	//*  17   30:aload_1         
	//*  18   31:getfield        #336 <Field Thread AbstractFuture$Waiter.thread>
	//*  19   34:ifnull          42
		{
			waiter2 = waiter;
	//   20   37:aload_1         
	//   21   38:astore_3        
			break; /* Loop/switch isn't completed */
	//   22   39:goto            82
		}
		if(waiter1 == null)
			break MISSING_BLOCK_LABEL_64;
	//   23   42:aload_2         
	//   24   43:ifnull          64
		waiter1.next = waiter3;
	//   25   46:aload_2         
	//   26   47:aload           4
	//   27   49:putfield        #331 <Field AbstractFuture$Waiter AbstractFuture$Waiter.next>
		waiter2 = waiter1;
	//   28   52:aload_2         
	//   29   53:astore_3        
		if(waiter1.thread != null) goto _L2; else goto _L1
	//   30   54:aload_2         
	//   31   55:getfield        #336 <Field Thread AbstractFuture$Waiter.thread>
	//   32   58:ifnonnull       82
_L2:
		break; /* Loop/switch isn't completed */
	//   33   61:goto            5
		waiter2 = waiter1;
	//   34   64:aload_2         
	//   35   65:astore_3        
		if(ATOMIC_HELPER.casWaiters(this, waiter, waiter3)) goto _L3; else goto _L1
	//   36   66:getstatic       #115 <Field AbstractFuture$AtomicHelper ATOMIC_HELPER>
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:aload           4
	//   40   73:invokevirtual   #326 <Method boolean AbstractFuture$AtomicHelper.casWaiters(AbstractFuture, AbstractFuture$Waiter, AbstractFuture$Waiter)>
	//   41   76:ifne            82
	//*  42   79:goto            5
_L3:
		waiter = waiter3;
	//   43   82:aload           4
	//   44   84:astore_1        
		waiter1 = waiter2;
	//   45   85:aload_3         
	//   46   86:astore_2        
		  goto _L4
	//*  47   87:goto            20
	//   48   90:return          
	}

	private String userObjectToString(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       9
			return "this future";
	//    3    5:ldc2            #338 <String "this future">
	//    4    8:areturn         
		else
			return String.valueOf(obj);
	//    5    9:aload_1         
	//    6   10:invokestatic    #343 <Method String String.valueOf(Object)>
	//    7   13:areturn         
	}

	public final void addListener(Runnable runnable, Executor executor)
	{
		checkNotNull(((Object) (runnable)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #346 <Method Object checkNotNull(Object)>
	//    2    4:pop             
		checkNotNull(((Object) (executor)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #346 <Method Object checkNotNull(Object)>
	//    5    9:pop             
		Listener listener = listeners;
	//    6   10:aload_0         
	//    7   11:getfield        #198 <Field AbstractFuture$Listener listeners>
	//    8   14:astore_3        
		if(listener != Listener.TOMBSTONE)
	//*   9   15:aload_3         
	//*  10   16:getstatic       #201 <Field AbstractFuture$Listener AbstractFuture$Listener.TOMBSTONE>
	//*  11   19:if_acmpeq       70
		{
			Listener listener2 = new Listener(runnable, executor);
	//   12   22:new             #22  <Class AbstractFuture$Listener>
	//   13   25:dup             
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokespecial   #348 <Method void AbstractFuture$Listener(Runnable, Executor)>
	//   17   31:astore          5
			Listener listener1;
			do
			{
				listener2.next = listener;
	//   18   33:aload           5
	//   19   35:aload_3         
	//   20   36:putfield        #207 <Field AbstractFuture$Listener AbstractFuture$Listener.next>
				if(ATOMIC_HELPER.casListeners(this, listener, listener2))
	//*  21   39:getstatic       #115 <Field AbstractFuture$AtomicHelper ATOMIC_HELPER>
	//*  22   42:aload_0         
	//*  23   43:aload_3         
	//*  24   44:aload           5
	//*  25   46:invokevirtual   #205 <Method boolean AbstractFuture$AtomicHelper.casListeners(AbstractFuture, AbstractFuture$Listener, AbstractFuture$Listener)>
	//*  26   49:ifeq            53
					return;
	//   27   52:return          
				listener1 = listeners;
	//   28   53:aload_0         
	//   29   54:getfield        #198 <Field AbstractFuture$Listener listeners>
	//   30   57:astore          4
				listener = listener1;
	//   31   59:aload           4
	//   32   61:astore_3        
			} while(listener1 != Listener.TOMBSTONE);
	//   33   62:aload           4
	//   34   64:getstatic       #201 <Field AbstractFuture$Listener AbstractFuture$Listener.TOMBSTONE>
	//   35   67:if_acmpne       33
		}
		executeListener(runnable, executor);
	//   36   70:aload_1         
	//   37   71:aload_2         
	//   38   72:invokestatic    #247 <Method void executeListener(Runnable, Executor)>
	//   39   75:return          
	}

	protected void afterDone()
	{
	//    0    0:return          
	}

	public final boolean cancel(boolean flag)
	{
		boolean flag3;
label0:
		{
			Object obj = value;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field Object value>
	//    2    4:astore          6
			boolean flag4 = true;
	//    3    6:iconst_1        
	//    4    7:istore          4
			boolean flag1;
			if(obj == null)
	//*   5    9:aload           6
	//*   6   11:ifnonnull       19
				flag1 = true;
	//    7   14:iconst_1        
	//    8   15:istore_2        
			else
	//*   9   16:goto            21
				flag1 = false;
	//   10   19:iconst_0        
	//   11   20:istore_2        
			if(flag1 | (obj instanceof SetFuture))
	//*  12   21:iload_2         
	//*  13   22:aload           6
	//*  14   24:instanceof      #28  <Class AbstractFuture$SetFuture>
	//*  15   27:ior             
	//*  16   28:ifeq            216
			{
				Cancellation cancellation;
				if(GENERATE_CANCELLATION_CAUSES)
	//*  17   31:getstatic       #78  <Field boolean GENERATE_CANCELLATION_CAUSES>
	//*  18   34:ifeq            60
					cancellation = new Cancellation(flag, ((Throwable) (new CancellationException("Future.cancel() was called."))));
	//   19   37:new             #14  <Class AbstractFuture$Cancellation>
	//   20   40:dup             
	//   21   41:iload_1         
	//   22   42:new             #136 <Class CancellationException>
	//   23   45:dup             
	//   24   46:ldc2            #352 <String "Future.cancel() was called.">
	//   25   49:invokespecial   #180 <Method void CancellationException(String)>
	//   26   52:invokespecial   #285 <Method void AbstractFuture$Cancellation(boolean, Throwable)>
	//   27   55:astore          5
				else
	//*  28   57:goto            77
				if(flag)
	//*  29   60:iload_1         
	//*  30   61:ifeq            72
					cancellation = Cancellation.CAUSELESS_INTERRUPTED;
	//   31   64:getstatic       #355 <Field AbstractFuture$Cancellation AbstractFuture$Cancellation.CAUSELESS_INTERRUPTED>
	//   32   67:astore          5
				else
	//*  33   69:goto            77
					cancellation = Cancellation.CAUSELESS_CANCELLED;
	//   34   72:getstatic       #289 <Field AbstractFuture$Cancellation AbstractFuture$Cancellation.CAUSELESS_CANCELLED>
	//   35   75:astore          5
				flag3 = false;
	//   36   77:iconst_0        
	//   37   78:istore_3        
				Object obj1;
				do
				{
					AbstractFuture abstractfuture;
					for(abstractfuture = this; ATOMIC_HELPER.casValue(abstractfuture, obj, ((Object) (cancellation)));)
	//*  38   79:aload_0         
	//*  39   80:astore          7
	//*  40   82:getstatic       #115 <Field AbstractFuture$AtomicHelper ATOMIC_HELPER>
	//*  41   85:aload           7
	//*  42   87:aload           6
	//*  43   89:aload           5
	//*  44   91:invokevirtual   #239 <Method boolean AbstractFuture$AtomicHelper.casValue(AbstractFuture, Object, Object)>
	//*  45   94:ifeq            195
					{
						if(flag)
	//*  46   97:iload_1         
	//*  47   98:ifeq            106
							abstractfuture.interruptTask();
	//   48  101:aload           7
	//   49  103:invokevirtual   #358 <Method void interruptTask()>
						complete(abstractfuture);
	//   50  106:aload           7
	//   51  108:invokestatic    #360 <Method void complete(AbstractFuture)>
						flag3 = flag4;
	//   52  111:iload           4
	//   53  113:istore_3        
						if(!(obj instanceof SetFuture))
							break label0;
	//   54  114:aload           6
	//   55  116:instanceof      #28  <Class AbstractFuture$SetFuture>
	//   56  119:ifeq            218
						obj = ((Object) (((SetFuture)obj).future));
	//   57  122:aload           6
	//   58  124:checkcast       #28  <Class AbstractFuture$SetFuture>
	//   59  127:getfield        #231 <Field ListenableFuture AbstractFuture$SetFuture.future>
	//   60  130:astore          6
						if(obj instanceof AbstractFuture)
	//*  61  132:aload           6
	//*  62  134:instanceof      #2   <Class AbstractFuture>
	//*  63  137:ifeq            184
						{
							abstractfuture = (AbstractFuture)obj;
	//   64  140:aload           6
	//   65  142:checkcast       #2   <Class AbstractFuture>
	//   66  145:astore          7
							obj = abstractfuture.value;
	//   67  147:aload           7
	//   68  149:getfield        #227 <Field Object value>
	//   69  152:astore          6
							boolean flag2;
							if(obj == null)
	//*  70  154:aload           6
	//*  71  156:ifnonnull       164
								flag2 = true;
	//   72  159:iconst_1        
	//   73  160:istore_2        
							else
	//*  74  161:goto            166
								flag2 = false;
	//   75  164:iconst_0        
	//   76  165:istore_2        
							flag3 = flag4;
	//   77  166:iload           4
	//   78  168:istore_3        
							if(!(flag2 | (obj instanceof SetFuture)))
								break label0;
	//   79  169:iload_2         
	//   80  170:aload           6
	//   81  172:instanceof      #28  <Class AbstractFuture$SetFuture>
	//   82  175:ior             
	//   83  176:ifeq            218
							flag3 = true;
	//   84  179:iconst_1        
	//   85  180:istore_3        
						} else
	//*  86  181:goto            82
						{
							((ListenableFuture) (obj)).cancel(flag);
	//   87  184:aload           6
	//   88  186:iload_1         
	//   89  187:invokeinterface #362 <Method boolean ListenableFuture.cancel(boolean)>
	//   90  192:pop             
							return true;
	//   91  193:iconst_1        
	//   92  194:ireturn         
						}
					}

					obj1 = abstractfuture.value;
	//   93  195:aload           7
	//   94  197:getfield        #227 <Field Object value>
	//   95  200:astore          8
					obj = obj1;
	//   96  202:aload           8
	//   97  204:astore          6
				} while(obj1 instanceof SetFuture);
	//   98  206:aload           8
	//   99  208:instanceof      #28  <Class AbstractFuture$SetFuture>
	//  100  211:ifne            82
				return flag3;
	//  101  214:iload_3         
	//  102  215:ireturn         
			}
			flag3 = false;
	//  103  216:iconst_0        
	//  104  217:istore_3        
		}
		return flag3;
	//  105  218:iload_3         
	//  106  219:ireturn         
	}

	public final Object get()
		throws InterruptedException, ExecutionException
	{
		if(!Thread.interrupted())
	//*   0    0:invokestatic    #365 <Method boolean Thread.interrupted()>
	//*   1    3:ifne            180
		{
			Object obj = value;
	//    2    6:aload_0         
	//    3    7:getfield        #227 <Field Object value>
	//    4   10:astore_3        
			boolean flag;
			if(obj != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          20
				flag = true;
	//    7   15:iconst_1        
	//    8   16:istore_1        
			else
	//*   9   17:goto            22
				flag = false;
	//   10   20:iconst_0        
	//   11   21:istore_1        
			boolean flag2;
			if(!(obj instanceof SetFuture))
	//*  12   22:aload_3         
	//*  13   23:instanceof      #28  <Class AbstractFuture$SetFuture>
	//*  14   26:ifne            34
				flag2 = true;
	//   15   29:iconst_1        
	//   16   30:istore_2        
			else
	//*  17   31:goto            36
				flag2 = false;
	//   18   34:iconst_0        
	//   19   35:istore_2        
			if(flag & flag2)
	//*  20   36:iload_1         
	//*  21   37:iload_2         
	//*  22   38:iand            
	//*  23   39:ifeq            48
				return getDoneValue(obj);
	//   24   42:aload_0         
	//   25   43:aload_3         
	//   26   44:invokespecial   #367 <Method Object getDoneValue(Object)>
	//   27   47:areturn         
			obj = ((Object) (waiters));
	//   28   48:aload_0         
	//   29   49:getfield        #320 <Field AbstractFuture$Waiter waiters>
	//   30   52:astore_3        
			if(obj != Waiter.TOMBSTONE)
	//*  31   53:aload_3         
	//*  32   54:getstatic       #322 <Field AbstractFuture$Waiter AbstractFuture$Waiter.TOMBSTONE>
	//*  33   57:if_acmpeq       171
			{
				Waiter waiter1 = new Waiter();
	//   34   60:new             #34  <Class AbstractFuture$Waiter>
	//   35   63:dup             
	//   36   64:invokespecial   #368 <Method void AbstractFuture$Waiter()>
	//   37   67:astore          5
				Waiter waiter;
				do
				{
					waiter1.setNext(((Waiter) (obj)));
	//   38   69:aload           5
	//   39   71:aload_3         
	//   40   72:invokevirtual   #371 <Method void AbstractFuture$Waiter.setNext(AbstractFuture$Waiter)>
					boolean flag1;
					boolean flag3;
					if(ATOMIC_HELPER.casWaiters(this, ((Waiter) (obj)), waiter1))
						do
	//*  41   75:getstatic       #115 <Field AbstractFuture$AtomicHelper ATOMIC_HELPER>
	//*  42   78:aload_0         
	//*  43   79:aload_3         
	//*  44   80:aload           5
	//*  45   82:invokevirtual   #326 <Method boolean AbstractFuture$AtomicHelper.casWaiters(AbstractFuture, AbstractFuture$Waiter, AbstractFuture$Waiter)>
	//*  46   85:ifeq            154
						{
							LockSupport.park(((Object) (this)));
	//   47   88:aload_0         
	//   48   89:invokestatic    #377 <Method void LockSupport.park(Object)>
							if(!Thread.interrupted())
	//*  49   92:invokestatic    #365 <Method boolean Thread.interrupted()>
	//*  50   95:ifne            140
							{
								obj = value;
	//   51   98:aload_0         
	//   52   99:getfield        #227 <Field Object value>
	//   53  102:astore_3        
								if(obj != null)
	//*  54  103:aload_3         
	//*  55  104:ifnull          112
									flag1 = true;
	//   56  107:iconst_1        
	//   57  108:istore_1        
								else
	//*  58  109:goto            114
									flag1 = false;
	//   59  112:iconst_0        
	//   60  113:istore_1        
								if(!(obj instanceof SetFuture))
	//*  61  114:aload_3         
	//*  62  115:instanceof      #28  <Class AbstractFuture$SetFuture>
	//*  63  118:ifne            126
									flag3 = true;
	//   64  121:iconst_1        
	//   65  122:istore_2        
								else
	//*  66  123:goto            128
									flag3 = false;
	//   67  126:iconst_0        
	//   68  127:istore_2        
								if(flag1 & flag3)
	//*  69  128:iload_1         
	//*  70  129:iload_2         
	//*  71  130:iand            
	//*  72  131:ifeq            88
									return getDoneValue(obj);
	//   73  134:aload_0         
	//   74  135:aload_3         
	//   75  136:invokespecial   #367 <Method Object getDoneValue(Object)>
	//   76  139:areturn         
							} else
							{
								removeWaiter(waiter1);
	//   77  140:aload_0         
	//   78  141:aload           5
	//   79  143:invokespecial   #379 <Method void removeWaiter(AbstractFuture$Waiter)>
								throw new InterruptedException();
	//   80  146:new             #304 <Class InterruptedException>
	//   81  149:dup             
	//   82  150:invokespecial   #380 <Method void InterruptedException()>
	//   83  153:athrow          
							}
						} while(true);
					waiter = waiters;
	//   84  154:aload_0         
	//   85  155:getfield        #320 <Field AbstractFuture$Waiter waiters>
	//   86  158:astore          4
					obj = ((Object) (waiter));
	//   87  160:aload           4
	//   88  162:astore_3        
				} while(waiter != Waiter.TOMBSTONE);
	//   89  163:aload           4
	//   90  165:getstatic       #322 <Field AbstractFuture$Waiter AbstractFuture$Waiter.TOMBSTONE>
	//   91  168:if_acmpne       69
			}
			return getDoneValue(value);
	//   92  171:aload_0         
	//   93  172:aload_0         
	//   94  173:getfield        #227 <Field Object value>
	//   95  176:invokespecial   #367 <Method Object getDoneValue(Object)>
	//   96  179:areturn         
		} else
		{
			throw new InterruptedException();
	//   97  180:new             #304 <Class InterruptedException>
	//   98  183:dup             
	//   99  184:invokespecial   #380 <Method void InterruptedException()>
	//  100  187:athrow          
		}
	}

	public final Object get(long l, TimeUnit timeunit)
		throws InterruptedException, TimeoutException, ExecutionException
	{
label0:
		{
			long l1;
			long l2;
label1:
			{
				long l3 = timeunit.toNanos(l);
	//    0    0:aload_3         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #390 <Method long TimeUnit.toNanos(long)>
	//    3    5:lstore          10
				if(Thread.interrupted())
					break label0;
	//    4    7:invokestatic    #365 <Method boolean Thread.interrupted()>
	//    5   10:ifne            819
				Object obj = value;
	//    6   13:aload_0         
	//    7   14:getfield        #227 <Field Object value>
	//    8   17:astore          12
				boolean flag;
				if(obj != null)
	//*   9   19:aload           12
	//*  10   21:ifnull          30
					flag = true;
	//   11   24:iconst_1        
	//   12   25:istore          4
				else
	//*  13   27:goto            33
					flag = false;
	//   14   30:iconst_0        
	//   15   31:istore          4
				boolean flag4;
				if(!(obj instanceof SetFuture))
	//*  16   33:aload           12
	//*  17   35:instanceof      #28  <Class AbstractFuture$SetFuture>
	//*  18   38:ifne            47
					flag4 = true;
	//   19   41:iconst_1        
	//   20   42:istore          5
				else
	//*  21   44:goto            50
					flag4 = false;
	//   22   47:iconst_0        
	//   23   48:istore          5
				if(flag & flag4)
	//*  24   50:iload           4
	//*  25   52:iload           5
	//*  26   54:iand            
	//*  27   55:ifeq            65
					return getDoneValue(obj);
	//   28   58:aload_0         
	//   29   59:aload           12
	//   30   61:invokespecial   #367 <Method Object getDoneValue(Object)>
	//   31   64:areturn         
				if(l3 > 0L)
	//*  32   65:lload           10
	//*  33   67:lconst_0        
	//*  34   68:lcmp            
	//*  35   69:ifle            83
					l2 = System.nanoTime() + l3;
	//   36   72:invokestatic    #394 <Method long System.nanoTime()>
	//   37   75:lload           10
	//   38   77:ladd            
	//   39   78:lstore          8
				else
	//*  40   80:goto            86
					l2 = 0L;
	//   41   83:lconst_0        
	//   42   84:lstore          8
				l1 = l3;
	//   43   86:lload           10
	//   44   88:lstore          6
				if(l3 < 1000L)
					break label1;
	//   45   90:lload           10
	//   46   92:ldc2w           #48  <Long 1000L>
	//   47   95:lcmp            
	//   48   96:iflt            278
				obj = ((Object) (waiters));
	//   49   99:aload_0         
	//   50  100:getfield        #320 <Field AbstractFuture$Waiter waiters>
	//   51  103:astore          12
				if(obj != Waiter.TOMBSTONE)
	//*  52  105:aload           12
	//*  53  107:getstatic       #322 <Field AbstractFuture$Waiter AbstractFuture$Waiter.TOMBSTONE>
	//*  54  110:if_acmpeq       269
				{
					Waiter waiter1 = new Waiter();
	//   55  113:new             #34  <Class AbstractFuture$Waiter>
	//   56  116:dup             
	//   57  117:invokespecial   #368 <Method void AbstractFuture$Waiter()>
	//   58  120:astore          14
					Waiter waiter;
					do
					{
						waiter1.setNext(((Waiter) (obj)));
	//   59  122:aload           14
	//   60  124:aload           12
	//   61  126:invokevirtual   #371 <Method void AbstractFuture$Waiter.setNext(AbstractFuture$Waiter)>
						boolean flag1;
						boolean flag5;
						if(ATOMIC_HELPER.casWaiters(this, ((Waiter) (obj)), waiter1))
							do
	//*  62  129:getstatic       #115 <Field AbstractFuture$AtomicHelper ATOMIC_HELPER>
	//*  63  132:aload_0         
	//*  64  133:aload           12
	//*  65  135:aload           14
	//*  66  137:invokevirtual   #326 <Method boolean AbstractFuture$AtomicHelper.casWaiters(AbstractFuture, AbstractFuture$Waiter, AbstractFuture$Waiter)>
	//*  67  140:ifeq            251
							{
								LockSupport.parkNanos(((Object) (this)), l3);
	//   68  143:aload_0         
	//   69  144:lload           10
	//   70  146:invokestatic    #398 <Method void LockSupport.parkNanos(Object, long)>
								if(!Thread.interrupted())
	//*  71  149:invokestatic    #365 <Method boolean Thread.interrupted()>
	//*  72  152:ifne            237
								{
									obj = value;
	//   73  155:aload_0         
	//   74  156:getfield        #227 <Field Object value>
	//   75  159:astore          12
									if(obj != null)
	//*  76  161:aload           12
	//*  77  163:ifnull          172
										flag1 = true;
	//   78  166:iconst_1        
	//   79  167:istore          4
									else
	//*  80  169:goto            175
										flag1 = false;
	//   81  172:iconst_0        
	//   82  173:istore          4
									if(!(obj instanceof SetFuture))
	//*  83  175:aload           12
	//*  84  177:instanceof      #28  <Class AbstractFuture$SetFuture>
	//*  85  180:ifne            189
										flag5 = true;
	//   86  183:iconst_1        
	//   87  184:istore          5
									else
	//*  88  186:goto            192
										flag5 = false;
	//   89  189:iconst_0        
	//   90  190:istore          5
									if(flag1 & flag5)
	//*  91  192:iload           4
	//*  92  194:iload           5
	//*  93  196:iand            
	//*  94  197:ifeq            207
										return getDoneValue(obj);
	//   95  200:aload_0         
	//   96  201:aload           12
	//   97  203:invokespecial   #367 <Method Object getDoneValue(Object)>
	//   98  206:areturn         
									l1 = l2 - System.nanoTime();
	//   99  207:lload           8
	//  100  209:invokestatic    #394 <Method long System.nanoTime()>
	//  101  212:lsub            
	//  102  213:lstore          6
									l3 = l1;
	//  103  215:lload           6
	//  104  217:lstore          10
									if(l1 < 1000L)
	//* 105  219:lload           6
	//* 106  221:ldc2w           #48  <Long 1000L>
	//* 107  224:lcmp            
	//* 108  225:ifge            143
									{
										removeWaiter(waiter1);
	//  109  228:aload_0         
	//  110  229:aload           14
	//  111  231:invokespecial   #379 <Method void removeWaiter(AbstractFuture$Waiter)>
										break label1;
	//  112  234:goto            278
									}
								} else
								{
									removeWaiter(waiter1);
	//  113  237:aload_0         
	//  114  238:aload           14
	//  115  240:invokespecial   #379 <Method void removeWaiter(AbstractFuture$Waiter)>
									throw new InterruptedException();
	//  116  243:new             #304 <Class InterruptedException>
	//  117  246:dup             
	//  118  247:invokespecial   #380 <Method void InterruptedException()>
	//  119  250:athrow          
								}
							} while(true);
						waiter = waiters;
	//  120  251:aload_0         
	//  121  252:getfield        #320 <Field AbstractFuture$Waiter waiters>
	//  122  255:astore          13
						obj = ((Object) (waiter));
	//  123  257:aload           13
	//  124  259:astore          12
					} while(waiter != Waiter.TOMBSTONE);
	//  125  261:aload           13
	//  126  263:getstatic       #322 <Field AbstractFuture$Waiter AbstractFuture$Waiter.TOMBSTONE>
	//  127  266:if_acmpne       122
				}
				return getDoneValue(value);
	//  128  269:aload_0         
	//  129  270:aload_0         
	//  130  271:getfield        #227 <Field Object value>
	//  131  274:invokespecial   #367 <Method Object getDoneValue(Object)>
	//  132  277:areturn         
			}
			while(l1 > 0L) 
	//* 133  278:lload           6
	//* 134  280:lconst_0        
	//* 135  281:lcmp            
	//* 136  282:ifle            362
			{
				Object obj1 = value;
	//  137  285:aload_0         
	//  138  286:getfield        #227 <Field Object value>
	//  139  289:astore          12
				boolean flag2;
				if(obj1 != null)
	//* 140  291:aload           12
	//* 141  293:ifnull          302
					flag2 = true;
	//  142  296:iconst_1        
	//  143  297:istore          4
				else
	//* 144  299:goto            305
					flag2 = false;
	//  145  302:iconst_0        
	//  146  303:istore          4
				boolean flag6;
				if(!(obj1 instanceof SetFuture))
	//* 147  305:aload           12
	//* 148  307:instanceof      #28  <Class AbstractFuture$SetFuture>
	//* 149  310:ifne            319
					flag6 = true;
	//  150  313:iconst_1        
	//  151  314:istore          5
				else
	//* 152  316:goto            322
					flag6 = false;
	//  153  319:iconst_0        
	//  154  320:istore          5
				if(flag2 & flag6)
	//* 155  322:iload           4
	//* 156  324:iload           5
	//* 157  326:iand            
	//* 158  327:ifeq            337
					return getDoneValue(obj1);
	//  159  330:aload_0         
	//  160  331:aload           12
	//  161  333:invokespecial   #367 <Method Object getDoneValue(Object)>
	//  162  336:areturn         
				if(!Thread.interrupted())
	//* 163  337:invokestatic    #365 <Method boolean Thread.interrupted()>
	//* 164  340:ifne            354
					l1 = l2 - System.nanoTime();
	//  165  343:lload           8
	//  166  345:invokestatic    #394 <Method long System.nanoTime()>
	//  167  348:lsub            
	//  168  349:lstore          6
				else
	//* 169  351:goto            278
					throw new InterruptedException();
	//  170  354:new             #304 <Class InterruptedException>
	//  171  357:dup             
	//  172  358:invokespecial   #380 <Method void InterruptedException()>
	//  173  361:athrow          
			}
			String s1 = toString();
	//  174  362:aload_0         
	//  175  363:invokevirtual   #399 <Method String toString()>
	//  176  366:astore          14
			String s2 = timeunit.toString().toLowerCase(Locale.ROOT);
	//  177  368:aload_3         
	//  178  369:invokevirtual   #400 <Method String TimeUnit.toString()>
	//  179  372:getstatic       #406 <Field Locale Locale.ROOT>
	//  180  375:invokevirtual   #410 <Method String String.toLowerCase(Locale)>
	//  181  378:astore          15
			Object obj2 = ((Object) (new StringBuilder()));
	//  182  380:new             #146 <Class StringBuilder>
	//  183  383:dup             
	//  184  384:invokespecial   #255 <Method void StringBuilder()>
	//  185  387:astore          12
			((StringBuilder) (obj2)).append("Waited ");
	//  186  389:aload           12
	//  187  391:ldc2            #412 <String "Waited ">
	//  188  394:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  189  397:pop             
			((StringBuilder) (obj2)).append(l);
	//  190  398:aload           12
	//  191  400:lload_1         
	//  192  401:invokevirtual   #415 <Method StringBuilder StringBuilder.append(long)>
	//  193  404:pop             
			((StringBuilder) (obj2)).append(" ");
	//  194  405:aload           12
	//  195  407:ldc2            #417 <String " ">
	//  196  410:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  197  413:pop             
			((StringBuilder) (obj2)).append(timeunit.toString().toLowerCase(Locale.ROOT));
	//  198  414:aload           12
	//  199  416:aload_3         
	//  200  417:invokevirtual   #400 <Method String TimeUnit.toString()>
	//  201  420:getstatic       #406 <Field Locale Locale.ROOT>
	//  202  423:invokevirtual   #410 <Method String String.toLowerCase(Locale)>
	//  203  426:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  204  429:pop             
			String s = ((StringBuilder) (obj2)).toString();
	//  205  430:aload           12
	//  206  432:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  207  435:astore          13
			obj2 = ((Object) (s));
	//  208  437:aload           13
	//  209  439:astore          12
			if(l1 + 1000L < 0L)
	//* 210  441:lload           6
	//* 211  443:ldc2w           #48  <Long 1000L>
	//* 212  446:ladd            
	//* 213  447:lconst_0        
	//* 214  448:lcmp            
	//* 215  449:ifge            735
			{
				obj2 = ((Object) (new StringBuilder()));
	//  216  452:new             #146 <Class StringBuilder>
	//  217  455:dup             
	//  218  456:invokespecial   #255 <Method void StringBuilder()>
	//  219  459:astore          12
				((StringBuilder) (obj2)).append(s);
	//  220  461:aload           12
	//  221  463:aload           13
	//  222  465:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  223  468:pop             
				((StringBuilder) (obj2)).append(" (plus ");
	//  224  469:aload           12
	//  225  471:ldc2            #419 <String " (plus ">
	//  226  474:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  227  477:pop             
				obj2 = ((Object) (((StringBuilder) (obj2)).toString()));
	//  228  478:aload           12
	//  229  480:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  230  483:astore          12
				l1 = -l1;
	//  231  485:lload           6
	//  232  487:lneg            
	//  233  488:lstore          6
				l = timeunit.convert(l1, TimeUnit.NANOSECONDS);
	//  234  490:aload_3         
	//  235  491:lload           6
	//  236  493:getstatic       #423 <Field TimeUnit TimeUnit.NANOSECONDS>
	//  237  496:invokevirtual   #427 <Method long TimeUnit.convert(long, TimeUnit)>
	//  238  499:lstore_1        
				l1 -= timeunit.toNanos(l);
	//  239  500:lload           6
	//  240  502:aload_3         
	//  241  503:lload_1         
	//  242  504:invokevirtual   #390 <Method long TimeUnit.toNanos(long)>
	//  243  507:lsub            
	//  244  508:lstore          6
				int i = l != 0L;
	//  245  510:lload_1         
	//  246  511:lconst_0        
	//  247  512:lcmp            
	//  248  513:istore          5
				boolean flag3;
				if(i != 0 && l1 <= 1000L)
	//* 249  515:iload           5
	//* 250  517:ifeq            538
	//* 251  520:lload           6
	//* 252  522:ldc2w           #48  <Long 1000L>
	//* 253  525:lcmp            
	//* 254  526:ifle            532
	//* 255  529:goto            538
					flag3 = false;
	//  256  532:iconst_0        
	//  257  533:istore          4
				else
	//* 258  535:goto            541
					flag3 = true;
	//  259  538:iconst_1        
	//  260  539:istore          4
				timeunit = ((TimeUnit) (obj2));
	//  261  541:aload           12
	//  262  543:astore_3        
				if(i > 0)
	//* 263  544:iload           5
	//* 264  546:ifle            658
				{
					timeunit = ((TimeUnit) (new StringBuilder()));
	//  265  549:new             #146 <Class StringBuilder>
	//  266  552:dup             
	//  267  553:invokespecial   #255 <Method void StringBuilder()>
	//  268  556:astore_3        
					((StringBuilder) (timeunit)).append(((String) (obj2)));
	//  269  557:aload_3         
	//  270  558:aload           12
	//  271  560:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  272  563:pop             
					((StringBuilder) (timeunit)).append(l);
	//  273  564:aload_3         
	//  274  565:lload_1         
	//  275  566:invokevirtual   #415 <Method StringBuilder StringBuilder.append(long)>
	//  276  569:pop             
					((StringBuilder) (timeunit)).append(" ");
	//  277  570:aload_3         
	//  278  571:ldc2            #417 <String " ">
	//  279  574:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  280  577:pop             
					((StringBuilder) (timeunit)).append(s2);
	//  281  578:aload_3         
	//  282  579:aload           15
	//  283  581:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  284  584:pop             
					obj2 = ((Object) (((StringBuilder) (timeunit)).toString()));
	//  285  585:aload_3         
	//  286  586:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  287  589:astore          12
					timeunit = ((TimeUnit) (obj2));
	//  288  591:aload           12
	//  289  593:astore_3        
					if(flag3)
	//* 290  594:iload           4
	//* 291  596:ifeq            627
					{
						timeunit = ((TimeUnit) (new StringBuilder()));
	//  292  599:new             #146 <Class StringBuilder>
	//  293  602:dup             
	//  294  603:invokespecial   #255 <Method void StringBuilder()>
	//  295  606:astore_3        
						((StringBuilder) (timeunit)).append(((String) (obj2)));
	//  296  607:aload_3         
	//  297  608:aload           12
	//  298  610:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  299  613:pop             
						((StringBuilder) (timeunit)).append(",");
	//  300  614:aload_3         
	//  301  615:ldc2            #429 <String ",">
	//  302  618:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  303  621:pop             
						timeunit = ((TimeUnit) (((StringBuilder) (timeunit)).toString()));
	//  304  622:aload_3         
	//  305  623:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  306  626:astore_3        
					}
					obj2 = ((Object) (new StringBuilder()));
	//  307  627:new             #146 <Class StringBuilder>
	//  308  630:dup             
	//  309  631:invokespecial   #255 <Method void StringBuilder()>
	//  310  634:astore          12
					((StringBuilder) (obj2)).append(((String) (timeunit)));
	//  311  636:aload           12
	//  312  638:aload_3         
	//  313  639:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  314  642:pop             
					((StringBuilder) (obj2)).append(" ");
	//  315  643:aload           12
	//  316  645:ldc2            #417 <String " ">
	//  317  648:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  318  651:pop             
					timeunit = ((TimeUnit) (((StringBuilder) (obj2)).toString()));
	//  319  652:aload           12
	//  320  654:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  321  657:astore_3        
				}
				obj2 = ((Object) (timeunit));
	//  322  658:aload_3         
	//  323  659:astore          12
				if(flag3)
	//* 324  661:iload           4
	//* 325  663:ifeq            706
				{
					obj2 = ((Object) (new StringBuilder()));
	//  326  666:new             #146 <Class StringBuilder>
	//  327  669:dup             
	//  328  670:invokespecial   #255 <Method void StringBuilder()>
	//  329  673:astore          12
					((StringBuilder) (obj2)).append(((String) (timeunit)));
	//  330  675:aload           12
	//  331  677:aload_3         
	//  332  678:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  333  681:pop             
					((StringBuilder) (obj2)).append(l1);
	//  334  682:aload           12
	//  335  684:lload           6
	//  336  686:invokevirtual   #415 <Method StringBuilder StringBuilder.append(long)>
	//  337  689:pop             
					((StringBuilder) (obj2)).append(" nanoseconds ");
	//  338  690:aload           12
	//  339  692:ldc2            #431 <String " nanoseconds ">
	//  340  695:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  341  698:pop             
					obj2 = ((Object) (((StringBuilder) (obj2)).toString()));
	//  342  699:aload           12
	//  343  701:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  344  704:astore          12
				}
				timeunit = ((TimeUnit) (new StringBuilder()));
	//  345  706:new             #146 <Class StringBuilder>
	//  346  709:dup             
	//  347  710:invokespecial   #255 <Method void StringBuilder()>
	//  348  713:astore_3        
				((StringBuilder) (timeunit)).append(((String) (obj2)));
	//  349  714:aload_3         
	//  350  715:aload           12
	//  351  717:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  352  720:pop             
				((StringBuilder) (timeunit)).append("delay)");
	//  353  721:aload_3         
	//  354  722:ldc2            #433 <String "delay)">
	//  355  725:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  356  728:pop             
				obj2 = ((Object) (((StringBuilder) (timeunit)).toString()));
	//  357  729:aload_3         
	//  358  730:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  359  733:astore          12
			}
			if(isDone())
	//* 360  735:aload_0         
	//* 361  736:invokevirtual   #436 <Method boolean isDone()>
	//* 362  739:ifeq            777
			{
				timeunit = ((TimeUnit) (new StringBuilder()));
	//  363  742:new             #146 <Class StringBuilder>
	//  364  745:dup             
	//  365  746:invokespecial   #255 <Method void StringBuilder()>
	//  366  749:astore_3        
				((StringBuilder) (timeunit)).append(((String) (obj2)));
	//  367  750:aload_3         
	//  368  751:aload           12
	//  369  753:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  370  756:pop             
				((StringBuilder) (timeunit)).append(" but future completed as timeout expired");
	//  371  757:aload_3         
	//  372  758:ldc2            #438 <String " but future completed as timeout expired">
	//  373  761:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  374  764:pop             
				throw new TimeoutException(((StringBuilder) (timeunit)).toString());
	//  375  765:new             #384 <Class TimeoutException>
	//  376  768:dup             
	//  377  769:aload_3         
	//  378  770:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  379  773:invokespecial   #439 <Method void TimeoutException(String)>
	//  380  776:athrow          
			} else
			{
				timeunit = ((TimeUnit) (new StringBuilder()));
	//  381  777:new             #146 <Class StringBuilder>
	//  382  780:dup             
	//  383  781:invokespecial   #255 <Method void StringBuilder()>
	//  384  784:astore_3        
				((StringBuilder) (timeunit)).append(((String) (obj2)));
	//  385  785:aload_3         
	//  386  786:aload           12
	//  387  788:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  388  791:pop             
				((StringBuilder) (timeunit)).append(" for ");
	//  389  792:aload_3         
	//  390  793:ldc2            #441 <String " for ">
	//  391  796:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  392  799:pop             
				((StringBuilder) (timeunit)).append(s1);
	//  393  800:aload_3         
	//  394  801:aload           14
	//  395  803:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  396  806:pop             
				throw new TimeoutException(((StringBuilder) (timeunit)).toString());
	//  397  807:new             #384 <Class TimeoutException>
	//  398  810:dup             
	//  399  811:aload_3         
	//  400  812:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  401  815:invokespecial   #439 <Method void TimeoutException(String)>
	//  402  818:athrow          
			}
		}
		throw new InterruptedException();
	//  403  819:new             #304 <Class InterruptedException>
	//  404  822:dup             
	//  405  823:invokespecial   #380 <Method void InterruptedException()>
	//  406  826:athrow          
	}

	protected void interruptTask()
	{
	//    0    0:return          
	}

	public final boolean isCancelled()
	{
		return value instanceof Cancellation;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field Object value>
	//    2    4:instanceof      #14  <Class AbstractFuture$Cancellation>
	//    3    7:ireturn         
	}

	public final boolean isDone()
	{
		Object obj = value;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field Object value>
	//    2    4:astore_3        
		boolean flag1 = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		boolean flag;
		if(obj != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          16
			flag = true;
	//    7   11:iconst_1        
	//    8   12:istore_1        
		else
	//*   9   13:goto            18
			flag = false;
	//   10   16:iconst_0        
	//   11   17:istore_1        
		if(obj instanceof SetFuture)
	//*  12   18:aload_3         
	//*  13   19:instanceof      #28  <Class AbstractFuture$SetFuture>
	//*  14   22:ifne            28
	//*  15   25:goto            30
			flag1 = false;
	//   16   28:iconst_0        
	//   17   29:istore_2        
		return flag & flag1;
	//   18   30:iload_1         
	//   19   31:iload_2         
	//   20   32:iand            
	//   21   33:ireturn         
	}

	final void maybePropagateCancellationTo(Future future)
	{
		boolean flag;
		if(future != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		if(flag & isCancelled())
	//*   7   11:iload_2         
	//*   8   12:aload_0         
	//*   9   13:invokevirtual   #445 <Method boolean isCancelled()>
	//*  10   16:iand            
	//*  11   17:ifeq            31
			future.cancel(wasInterrupted());
	//   12   20:aload_1         
	//   13   21:aload_0         
	//   14   22:invokevirtual   #447 <Method boolean wasInterrupted()>
	//   15   25:invokeinterface #448 <Method boolean Future.cancel(boolean)>
	//   16   30:pop             
	//   17   31:return          
	}

	protected String pendingToString()
	{
		Object obj = value;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field Object value>
	//    2    4:astore_1        
		if(obj instanceof SetFuture)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #28  <Class AbstractFuture$SetFuture>
	//*   5    9:ifeq            56
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//    6   12:new             #146 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #255 <Method void StringBuilder()>
	//    9   19:astore_2        
			stringbuilder1.append("setFuture=[");
	//   10   20:aload_2         
	//   11   21:ldc2            #452 <String "setFuture=[">
	//   12   24:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
			stringbuilder1.append(userObjectToString(((Object) (((SetFuture)obj).future))));
	//   14   28:aload_2         
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:checkcast       #28  <Class AbstractFuture$SetFuture>
	//   18   34:getfield        #231 <Field ListenableFuture AbstractFuture$SetFuture.future>
	//   19   37:invokespecial   #154 <Method String userObjectToString(Object)>
	//   20   40:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
			stringbuilder1.append("]");
	//   22   44:aload_2         
	//   23   45:ldc1            #156 <String "]">
	//   24   47:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
			return stringbuilder1.toString();
	//   26   51:aload_2         
	//   27   52:invokevirtual   #262 <Method String StringBuilder.toString()>
	//   28   55:areturn         
		}
		if(this instanceof ScheduledFuture)
	//*  29   56:aload_0         
	//*  30   57:instanceof      #454 <Class ScheduledFuture>
	//*  31   60:ifeq            109
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   32   63:new             #146 <Class StringBuilder>
	//   33   66:dup             
	//   34   67:invokespecial   #255 <Method void StringBuilder()>
	//   35   70:astore_1        
			stringbuilder.append("remaining delay=[");
	//   36   71:aload_1         
	//   37   72:ldc2            #456 <String "remaining delay=[">
	//   38   75:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
			stringbuilder.append(((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS));
	//   40   79:aload_1         
	//   41   80:aload_0         
	//   42   81:checkcast       #454 <Class ScheduledFuture>
	//   43   84:getstatic       #459 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   44   87:invokeinterface #463 <Method long ScheduledFuture.getDelay(TimeUnit)>
	//   45   92:invokevirtual   #415 <Method StringBuilder StringBuilder.append(long)>
	//   46   95:pop             
			stringbuilder.append(" ms]");
	//   47   96:aload_1         
	//   48   97:ldc2            #465 <String " ms]">
	//   49  100:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   50  103:pop             
			return stringbuilder.toString();
	//   51  104:aload_1         
	//   52  105:invokevirtual   #262 <Method String StringBuilder.toString()>
	//   53  108:areturn         
		} else
		{
			return null;
	//   54  109:aconst_null     
	//   55  110:areturn         
		}
	}

	protected boolean set(Object obj)
	{
		Object obj1 = obj;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(obj == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			obj1 = NULL;
	//    4    6:getstatic       #129 <Field Object NULL>
	//    5    9:astore_2        
		if(ATOMIC_HELPER.casValue(this, ((Object) (null)), obj1))
	//*   6   10:getstatic       #115 <Field AbstractFuture$AtomicHelper ATOMIC_HELPER>
	//*   7   13:aload_0         
	//*   8   14:aconst_null     
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #239 <Method boolean AbstractFuture$AtomicHelper.casValue(AbstractFuture, Object, Object)>
	//*  11   19:ifeq            28
		{
			complete(this);
	//   12   22:aload_0         
	//   13   23:invokestatic    #360 <Method void complete(AbstractFuture)>
			return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
		} else
		{
			return false;
	//   16   28:iconst_0        
	//   17   29:ireturn         
		}
	}

	protected boolean setException(Throwable throwable)
	{
		throwable = ((Throwable) (new Failure((Throwable)checkNotNull(((Object) (throwable))))));
	//    0    0:new             #17  <Class AbstractFuture$Failure>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #346 <Method Object checkNotNull(Object)>
	//    4    8:checkcast       #60  <Class Throwable>
	//    5   11:invokespecial   #294 <Method void AbstractFuture$Failure(Throwable)>
	//    6   14:astore_1        
		if(ATOMIC_HELPER.casValue(this, ((Object) (null)), ((Object) (throwable))))
	//*   7   15:getstatic       #115 <Field AbstractFuture$AtomicHelper ATOMIC_HELPER>
	//*   8   18:aload_0         
	//*   9   19:aconst_null     
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #239 <Method boolean AbstractFuture$AtomicHelper.casValue(AbstractFuture, Object, Object)>
	//*  12   24:ifeq            33
		{
			complete(this);
	//   13   27:aload_0         
	//   14   28:invokestatic    #360 <Method void complete(AbstractFuture)>
			return true;
	//   15   31:iconst_1        
	//   16   32:ireturn         
		} else
		{
			return false;
	//   17   33:iconst_0        
	//   18   34:ireturn         
		}
	}

	protected boolean setFuture(ListenableFuture listenablefuture)
	{
		checkNotNull(((Object) (listenablefuture)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #346 <Method Object checkNotNull(Object)>
	//    2    4:pop             
		Object obj1 = value;
	//    3    5:aload_0         
	//    4    6:getfield        #227 <Field Object value>
	//    5    9:astore_3        
		Object obj = obj1;
	//    6   10:aload_3         
	//    7   11:astore_2        
		if(obj1 == null)
	//*   8   12:aload_3         
	//*   9   13:ifnonnull       118
		{
			if(listenablefuture.isDone())
	//*  10   16:aload_1         
	//*  11   17:invokeinterface #473 <Method boolean ListenableFuture.isDone()>
	//*  12   22:ifeq            50
			{
				listenablefuture = ((ListenableFuture) (getFutureValue(listenablefuture)));
	//   13   25:aload_1         
	//   14   26:invokestatic    #235 <Method Object getFutureValue(ListenableFuture)>
	//   15   29:astore_1        
				if(ATOMIC_HELPER.casValue(this, ((Object) (null)), ((Object) (listenablefuture))))
	//*  16   30:getstatic       #115 <Field AbstractFuture$AtomicHelper ATOMIC_HELPER>
	//*  17   33:aload_0         
	//*  18   34:aconst_null     
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #239 <Method boolean AbstractFuture$AtomicHelper.casValue(AbstractFuture, Object, Object)>
	//*  21   39:ifeq            48
				{
					complete(this);
	//   22   42:aload_0         
	//   23   43:invokestatic    #360 <Method void complete(AbstractFuture)>
					return true;
	//   24   46:iconst_1        
	//   25   47:ireturn         
				} else
				{
					return false;
	//   26   48:iconst_0        
	//   27   49:ireturn         
				}
			}
			obj = ((Object) (new SetFuture(this, listenablefuture)));
	//   28   50:new             #28  <Class AbstractFuture$SetFuture>
	//   29   53:dup             
	//   30   54:aload_0         
	//   31   55:aload_1         
	//   32   56:invokespecial   #476 <Method void AbstractFuture$SetFuture(AbstractFuture, ListenableFuture)>
	//   33   59:astore_2        
			if(ATOMIC_HELPER.casValue(this, ((Object) (null)), obj))
	//*  34   60:getstatic       #115 <Field AbstractFuture$AtomicHelper ATOMIC_HELPER>
	//*  35   63:aload_0         
	//*  36   64:aconst_null     
	//*  37   65:aload_2         
	//*  38   66:invokevirtual   #239 <Method boolean AbstractFuture$AtomicHelper.casValue(AbstractFuture, Object, Object)>
	//*  39   69:ifeq            113
			{
				try
				{
					listenablefuture.addListener(((Runnable) (obj)), ((Executor) (DirectExecutor.INSTANCE)));
	//   40   72:aload_1         
	//   41   73:aload_2         
	//   42   74:getstatic       #482 <Field DirectExecutor DirectExecutor.INSTANCE>
	//   43   77:invokeinterface #484 <Method void ListenableFuture.addListener(Runnable, Executor)>
				}
	//*  44   82:iconst_1        
	//*  45   83:ireturn         
				// Misplaced declaration of an exception variable
				catch(ListenableFuture listenablefuture)
	//*  46   84:astore_1        
				{
					try
					{
						listenablefuture = ((ListenableFuture) (new Failure(((Throwable) (listenablefuture)))));
	//   47   85:new             #17  <Class AbstractFuture$Failure>
	//   48   88:dup             
	//   49   89:aload_1         
	//   50   90:invokespecial   #294 <Method void AbstractFuture$Failure(Throwable)>
	//   51   93:astore_1        
					}
	//*  52   94:goto            101
	//*  53   97:getstatic       #488 <Field AbstractFuture$Failure AbstractFuture$Failure.FALLBACK_INSTANCE>
	//*  54  100:astore_1        
	//*  55  101:getstatic       #115 <Field AbstractFuture$AtomicHelper ATOMIC_HELPER>
	//*  56  104:aload_0         
	//*  57  105:aload_2         
	//*  58  106:aload_1         
	//*  59  107:invokevirtual   #239 <Method boolean AbstractFuture$AtomicHelper.casValue(AbstractFuture, Object, Object)>
	//*  60  110:pop             
	//*  61  111:iconst_1        
	//*  62  112:ireturn         
	//*  63  113:aload_0         
	//*  64  114:getfield        #227 <Field Object value>
	//*  65  117:astore_2        
	//*  66  118:aload_2         
	//*  67  119:instanceof      #14  <Class AbstractFuture$Cancellation>
	//*  68  122:ifeq            139
	//*  69  125:aload_1         
	//*  70  126:aload_2         
	//*  71  127:checkcast       #14  <Class AbstractFuture$Cancellation>
	//*  72  130:getfield        #282 <Field boolean AbstractFuture$Cancellation.wasInterrupted>
	//*  73  133:invokeinterface #362 <Method boolean ListenableFuture.cancel(boolean)>
	//*  74  138:pop             
	//*  75  139:iconst_0        
	//*  76  140:ireturn         
					// Misplaced declaration of an exception variable
					catch(ListenableFuture listenablefuture)
					{
						listenablefuture = ((ListenableFuture) (Failure.FALLBACK_INSTANCE));
					}
					ATOMIC_HELPER.casValue(this, obj, ((Object) (listenablefuture)));
					return true;
				}
				return true;
			}
			obj = value;
		}
		if(obj instanceof Cancellation)
			listenablefuture.cancel(((Cancellation)obj).wasInterrupted);
		return false;
	//*  77  141:astore_1        
	//*  78  142:goto            97
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #146 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #255 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(super.toString());
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:invokespecial   #490 <Method String Object.toString()>
	//    7   13:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append("[status=");
	//    9   17:aload_2         
	//   10   18:ldc2            #492 <String "[status=">
	//   11   21:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		if(isCancelled())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #445 <Method boolean isCancelled()>
	//*  15   29:ifeq            42
			stringbuilder.append("CANCELLED");
	//   16   32:aload_2         
	//   17   33:ldc1            #169 <String "CANCELLED">
	//   18   35:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		else
	//*  20   39:goto            154
		if(isDone())
	//*  21   42:aload_0         
	//*  22   43:invokevirtual   #436 <Method boolean isDone()>
	//*  23   46:ifeq            57
		{
			addDoneString(stringbuilder);
	//   24   49:aload_0         
	//   25   50:aload_2         
	//   26   51:invokespecial   #494 <Method void addDoneString(StringBuilder)>
		} else
	//*  27   54:goto            154
		{
			Object obj;
			try
			{
				obj = ((Object) (pendingToString()));
	//   28   57:aload_0         
	//   29   58:invokevirtual   #496 <Method String pendingToString()>
	//   30   61:astore_1        
			}
	//*  31   62:goto            96
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  32   65:astore_1        
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   33   66:new             #146 <Class StringBuilder>
	//   34   69:dup             
	//   35   70:invokespecial   #255 <Method void StringBuilder()>
	//   36   73:astore_3        
				stringbuilder1.append("Exception thrown from implementation: ");
	//   37   74:aload_3         
	//   38   75:ldc2            #498 <String "Exception thrown from implementation: ">
	//   39   78:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   40   81:pop             
				stringbuilder1.append(((Object) (obj.getClass())));
	//   41   82:aload_3         
	//   42   83:aload_1         
	//   43   84:invokevirtual   #162 <Method Class Object.getClass()>
	//   44   87:invokevirtual   #165 <Method StringBuilder StringBuilder.append(Object)>
	//   45   90:pop             
				obj = ((Object) (stringbuilder1.toString()));
	//   46   91:aload_3         
	//   47   92:invokevirtual   #262 <Method String StringBuilder.toString()>
	//   48   95:astore_1        
			}
			if(obj != null && !((String) (obj)).isEmpty())
	//*  49   96:aload_1         
	//*  50   97:ifnull          131
	//*  51  100:aload_1         
	//*  52  101:invokevirtual   #501 <Method boolean String.isEmpty()>
	//*  53  104:ifne            131
			{
				stringbuilder.append("PENDING, info=[");
	//   54  107:aload_2         
	//   55  108:ldc2            #503 <String "PENDING, info=[">
	//   56  111:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   57  114:pop             
				stringbuilder.append(((String) (obj)));
	//   58  115:aload_2         
	//   59  116:aload_1         
	//   60  117:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   61  120:pop             
				stringbuilder.append("]");
	//   62  121:aload_2         
	//   63  122:ldc1            #156 <String "]">
	//   64  124:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   65  127:pop             
			} else
	//*  66  128:goto            154
			if(isDone())
	//*  67  131:aload_0         
	//*  68  132:invokevirtual   #436 <Method boolean isDone()>
	//*  69  135:ifeq            146
				addDoneString(stringbuilder);
	//   70  138:aload_0         
	//   71  139:aload_2         
	//   72  140:invokespecial   #494 <Method void addDoneString(StringBuilder)>
			else
	//*  73  143:goto            154
				stringbuilder.append("PENDING");
	//   74  146:aload_2         
	//   75  147:ldc2            #505 <String "PENDING">
	//   76  150:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   77  153:pop             
		}
		stringbuilder.append("]");
	//   78  154:aload_2         
	//   79  155:ldc1            #156 <String "]">
	//   80  157:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   81  160:pop             
		return stringbuilder.toString();
	//   82  161:aload_2         
	//   83  162:invokevirtual   #262 <Method String StringBuilder.toString()>
	//   84  165:areturn         
	}

	protected final boolean wasInterrupted()
	{
		Object obj = value;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field Object value>
	//    2    4:astore_1        
		return (obj instanceof Cancellation) && ((Cancellation)obj).wasInterrupted;
	//    3    5:aload_1         
	//    4    6:instanceof      #14  <Class AbstractFuture$Cancellation>
	//    5    9:ifeq            24
	//    6   12:aload_1         
	//    7   13:checkcast       #14  <Class AbstractFuture$Cancellation>
	//    8   16:getfield        #282 <Field boolean AbstractFuture$Cancellation.wasInterrupted>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	static final AtomicHelper ATOMIC_HELPER;
	static final boolean GENERATE_CANCELLATION_CAUSES;
	private static final Object NULL;
	private static final long SPIN_THRESHOLD_NANOS = 1000L;
	private static final Logger log;
	volatile Listener listeners;
	volatile Object value;
	volatile Waiter waiters;

	static 
	{
		GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
	//    0    0:ldc1            #62  <String "guava.concurrent.generate_cancellation_cause">
	//    1    2:ldc1            #64  <String "false">
	//    2    4:invokestatic    #70  <Method String System.getProperty(String, String)>
	//    3    7:invokestatic    #76  <Method boolean Boolean.parseBoolean(String)>
	//    4   10:putstatic       #78  <Field boolean GENERATE_CANCELLATION_CAUSES>
		log = Logger.getLogger(((Class) (androidx/work/impl/utils/futures/AbstractFuture)).getName());
	//    5   13:ldc1            #2   <Class AbstractFuture>
	//    6   15:invokevirtual   #84  <Method String Class.getName()>
	//    7   18:invokestatic    #90  <Method Logger Logger.getLogger(String)>
	//    8   21:putstatic       #92  <Field Logger log>
		Object obj = ((Object) (new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(androidx/work/impl/utils/futures/AbstractFuture$Waiter, java/lang/Thread, "thread"), AtomicReferenceFieldUpdater.newUpdater(androidx/work/impl/utils/futures/AbstractFuture$Waiter, androidx/work/impl/utils/futures/AbstractFuture$Waiter, "next"), AtomicReferenceFieldUpdater.newUpdater(androidx/work/impl/utils/futures/AbstractFuture, androidx/work/impl/utils/futures/AbstractFuture$Waiter, "waiters"), AtomicReferenceFieldUpdater.newUpdater(androidx/work/impl/utils/futures/AbstractFuture, androidx/work/impl/utils/futures/AbstractFuture$Listener, "listeners"), AtomicReferenceFieldUpdater.newUpdater(androidx/work/impl/utils/futures/AbstractFuture, java/lang/Object, "value"))));
	//    9   24:new             #25  <Class AbstractFuture$SafeAtomicHelper>
	//   10   27:dup             
	//   11   28:ldc1            #34  <Class AbstractFuture$Waiter>
	//   12   30:ldc1            #94  <Class Thread>
	//   13   32:ldc1            #96  <String "thread">
	//   14   34:invokestatic    #102 <Method AtomicReferenceFieldUpdater AtomicReferenceFieldUpdater.newUpdater(Class, Class, String)>
	//   15   37:ldc1            #34  <Class AbstractFuture$Waiter>
	//   16   39:ldc1            #34  <Class AbstractFuture$Waiter>
	//   17   41:ldc1            #104 <String "next">
	//   18   43:invokestatic    #102 <Method AtomicReferenceFieldUpdater AtomicReferenceFieldUpdater.newUpdater(Class, Class, String)>
	//   19   46:ldc1            #2   <Class AbstractFuture>
	//   20   48:ldc1            #34  <Class AbstractFuture$Waiter>
	//   21   50:ldc1            #105 <String "waiters">
	//   22   52:invokestatic    #102 <Method AtomicReferenceFieldUpdater AtomicReferenceFieldUpdater.newUpdater(Class, Class, String)>
	//   23   55:ldc1            #2   <Class AbstractFuture>
	//   24   57:ldc1            #22  <Class AbstractFuture$Listener>
	//   25   59:ldc1            #106 <String "listeners">
	//   26   61:invokestatic    #102 <Method AtomicReferenceFieldUpdater AtomicReferenceFieldUpdater.newUpdater(Class, Class, String)>
	//   27   64:ldc1            #2   <Class AbstractFuture>
	//   28   66:ldc1            #5   <Class Object>
	//   29   68:ldc1            #107 <String "value">
	//   30   70:invokestatic    #102 <Method AtomicReferenceFieldUpdater AtomicReferenceFieldUpdater.newUpdater(Class, Class, String)>
	//   31   73:invokespecial   #111 <Method void AbstractFuture$SafeAtomicHelper(AtomicReferenceFieldUpdater, AtomicReferenceFieldUpdater, AtomicReferenceFieldUpdater, AtomicReferenceFieldUpdater, AtomicReferenceFieldUpdater)>
	//   32   76:astore_0        
		Throwable throwable;
		throwable = null;
	//   33   77:aconst_null     
	//   34   78:astore_1        
		break MISSING_BLOCK_LABEL_91;
	//   35   79:goto            91
		throwable;
	//   36   82:astore_1        
		obj = ((Object) (new SynchronizedHelper()));
	//   37   83:new             #31  <Class AbstractFuture$SynchronizedHelper>
	//   38   86:dup             
	//   39   87:invokespecial   #113 <Method void AbstractFuture$SynchronizedHelper()>
	//   40   90:astore_0        
		ATOMIC_HELPER = ((AtomicHelper) (obj));
	//   41   91:aload_0         
	//   42   92:putstatic       #115 <Field AbstractFuture$AtomicHelper ATOMIC_HELPER>
		if(throwable != null)
	//*  43   95:aload_1         
	//*  44   96:ifnull          111
			log.log(Level.SEVERE, "SafeAtomicHelper is broken!", throwable);
	//   45   99:getstatic       #92  <Field Logger log>
	//   46  102:getstatic       #121 <Field Level Level.SEVERE>
	//   47  105:ldc1            #123 <String "SafeAtomicHelper is broken!">
	//   48  107:aload_1         
	//   49  108:invokevirtual   #126 <Method void Logger.log(Level, String, Throwable)>
		NULL = new Object();
	//   50  111:new             #5   <Class Object>
	//   51  114:dup             
	//   52  115:invokespecial   #127 <Method void Object()>
	//   53  118:putstatic       #129 <Field Object NULL>
	//   54  121:return          
	}
}
