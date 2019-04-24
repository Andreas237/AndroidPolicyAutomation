// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency.internal;

import java.util.concurrent.*;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public abstract class AbstractFuture
	implements Future
{
	static final class Sync extends AbstractQueuedSynchronizer
	{

		private boolean complete(Object obj, Throwable throwable, int i)
		{
			boolean flag = compareAndSetState(0, 1);
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:iconst_1        
		//    3    3:invokevirtual   #39  <Method boolean compareAndSetState(int, int)>
		//    4    6:istore          4
			if(flag)
		//*   5    8:iload           4
		//*   6   10:ifeq            49
			{
				value = obj;
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:putfield        #41  <Field Object value>
				if((i & 0xc) != 0)
		//*  10   18:iload_3         
		//*  11   19:bipush          12
		//*  12   21:iand            
		//*  13   22:ifeq            35
					throwable = ((Throwable) (new CancellationException("Future.cancel() was called.")));
		//   14   25:new             #43  <Class CancellationException>
		//   15   28:dup             
		//   16   29:ldc1            #45  <String "Future.cancel() was called.">
		//   17   31:invokespecial   #48  <Method void CancellationException(String)>
		//   18   34:astore_2        
				exception = throwable;
		//   19   35:aload_0         
		//   20   36:aload_2         
		//   21   37:putfield        #50  <Field Throwable exception>
				releaseShared(i);
		//   22   40:aload_0         
		//   23   41:iload_3         
		//   24   42:invokevirtual   #54  <Method boolean releaseShared(int)>
		//   25   45:pop             
			} else
		//*  26   46:iload           4
		//*  27   48:ireturn         
			if(getState() == 1)
		//*  28   49:aload_0         
		//*  29   50:invokevirtual   #58  <Method int getState()>
		//*  30   53:iconst_1        
		//*  31   54:icmpne          46
			{
				acquireShared(-1);
		//   32   57:aload_0         
		//   33   58:iconst_m1       
		//   34   59:invokevirtual   #62  <Method void acquireShared(int)>
				return flag;
		//   35   62:iload           4
		//   36   64:ireturn         
			}
			return flag;
		}

		private Object getValue()
			throws CancellationException, ExecutionException
		{
			int i = getState();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #58  <Method int getState()>
		//    2    4:istore_1        
			switch(i)
		//*   3    5:iload_1         
			{
		//*   4    6:lookupswitch    3: default 40
		//		               2: 67
		//		               4: 91
		//		               8: 91
			default:
				throw new IllegalStateException((new StringBuilder()).append("Error, synchronizer in invalid state: ").append(i).toString());
		//    5   40:new             #70  <Class IllegalStateException>
		//    6   43:dup             
		//    7   44:new             #72  <Class StringBuilder>
		//    8   47:dup             
		//    9   48:invokespecial   #73  <Method void StringBuilder()>
		//   10   51:ldc1            #75  <String "Error, synchronizer in invalid state: ">
		//   11   53:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
		//   12   56:iload_1         
		//   13   57:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
		//   14   60:invokevirtual   #86  <Method String StringBuilder.toString()>
		//   15   63:invokespecial   #87  <Method void IllegalStateException(String)>
		//   16   66:athrow          

			case 2: // '\002'
				if(exception != null)
		//*  17   67:aload_0         
		//*  18   68:getfield        #50  <Field Throwable exception>
		//*  19   71:ifnull          86
					throw new ExecutionException(exception);
		//   20   74:new             #68  <Class ExecutionException>
		//   21   77:dup             
		//   22   78:aload_0         
		//   23   79:getfield        #50  <Field Throwable exception>
		//   24   82:invokespecial   #90  <Method void ExecutionException(Throwable)>
		//   25   85:athrow          
				else
					return value;
		//   26   86:aload_0         
		//   27   87:getfield        #41  <Field Object value>
		//   28   90:areturn         

			case 4: // '\004'
			case 8: // '\b'
				throw AbstractFuture.cancellationExceptionWithCause("Task was cancelled.", exception);
		//   29   91:ldc1            #92  <String "Task was cancelled.">
		//   30   93:aload_0         
		//   31   94:getfield        #50  <Field Throwable exception>
		//   32   97:invokestatic    #96  <Method CancellationException AbstractFuture.cancellationExceptionWithCause(String, Throwable)>
		//   33  100:athrow          
			}
		}

		boolean cancel(boolean flag)
		{
			byte byte0;
			if(flag)
		//*   0    0:iload_1         
		//*   1    1:ifeq            15
				byte0 = 8;
		//    2    4:bipush          8
		//    3    6:istore_2        
			else
		//*   4    7:aload_0         
		//*   5    8:aconst_null     
		//*   6    9:aconst_null     
		//*   7   10:iload_2         
		//*   8   11:invokespecial   #102 <Method boolean complete(Object, Throwable, int)>
		//*   9   14:ireturn         
				byte0 = 4;
		//   10   15:iconst_4        
		//   11   16:istore_2        
			return complete(((Object) (null)), ((Throwable) (null)), ((int) (byte0)));
		//*  12   17:goto            7
		}

		Object get()
			throws CancellationException, ExecutionException, InterruptedException
		{
			acquireSharedInterruptibly(-1);
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:invokevirtual   #108 <Method void acquireSharedInterruptibly(int)>
			return getValue();
		//    3    5:aload_0         
		//    4    6:invokespecial   #110 <Method Object getValue()>
		//    5    9:areturn         
		}

		Object get(long l)
			throws TimeoutException, CancellationException, ExecutionException, InterruptedException
		{
			if(!tryAcquireSharedNanos(-1, l))
		//*   0    0:aload_0         
		//*   1    1:iconst_m1       
		//*   2    2:lload_1         
		//*   3    3:invokevirtual   #117 <Method boolean tryAcquireSharedNanos(int, long)>
		//*   4    6:ifne            19
				throw new TimeoutException("Timeout waiting for task.");
		//    5    9:new             #113 <Class TimeoutException>
		//    6   12:dup             
		//    7   13:ldc1            #119 <String "Timeout waiting for task.">
		//    8   15:invokespecial   #120 <Method void TimeoutException(String)>
		//    9   18:athrow          
			else
				return getValue();
		//   10   19:aload_0         
		//   11   20:invokespecial   #110 <Method Object getValue()>
		//   12   23:areturn         
		}

		boolean isCancelled()
		{
			return (getState() & 0xc) != 0;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #58  <Method int getState()>
		//    2    4:bipush          12
		//    3    6:iand            
		//    4    7:ifeq            12
		//    5   10:iconst_1        
		//    6   11:ireturn         
		//    7   12:iconst_0        
		//    8   13:ireturn         
		}

		boolean isDone()
		{
			return (getState() & 0xe) != 0;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #58  <Method int getState()>
		//    2    4:bipush          14
		//    3    6:iand            
		//    4    7:ifeq            12
		//    5   10:iconst_1        
		//    6   11:ireturn         
		//    7   12:iconst_0        
		//    8   13:ireturn         
		}

		boolean set(Object obj)
		{
			return complete(obj, ((Throwable) (null)), 2);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:iconst_2        
		//    4    4:invokespecial   #102 <Method boolean complete(Object, Throwable, int)>
		//    5    7:ireturn         
		}

		boolean setException(Throwable throwable)
		{
			return complete(((Object) (null)), throwable, 2);
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:aload_1         
		//    3    3:iconst_2        
		//    4    4:invokespecial   #102 <Method boolean complete(Object, Throwable, int)>
		//    5    7:ireturn         
		}

		protected int tryAcquireShared(int i)
		{
			return !isDone() ? -1 : 1;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #133 <Method boolean isDone()>
		//    2    4:ifeq            9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_m1       
		//    6   10:ireturn         
		}

		protected boolean tryReleaseShared(int i)
		{
			setState(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #137 <Method void setState(int)>
			return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
		}

		boolean wasInterrupted()
		{
			return getState() == 8;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #58  <Method int getState()>
		//    2    4:bipush          8
		//    3    6:icmpne          11
		//    4    9:iconst_1        
		//    5   10:ireturn         
		//    6   11:iconst_0        
		//    7   12:ireturn         
		}

		static final int CANCELLED = 4;
		static final int COMPLETED = 2;
		static final int COMPLETING = 1;
		static final int INTERRUPTED = 8;
		static final int RUNNING = 0;
		private static final long serialVersionUID = 0L;
		private Throwable exception;
		private Object value;

		Sync()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void AbstractQueuedSynchronizer()>
		//    2    4:return          
		}
	}


	protected AbstractFuture()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #9   <Class AbstractFuture$Sync>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void AbstractFuture$Sync()>
	//    6   12:putfield        #20  <Field AbstractFuture$Sync sync>
	//    7   15:return          
	}

	static final CancellationException cancellationExceptionWithCause(String s, Throwable throwable)
	{
		s = ((String) (new CancellationException(s)));
	//    0    0:new             #25  <Class CancellationException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #28  <Method void CancellationException(String)>
	//    4    8:astore_0        
		((CancellationException) (s)).initCause(throwable);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #32  <Method Throwable CancellationException.initCause(Throwable)>
	//    8   14:pop             
		return ((CancellationException) (s));
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public boolean cancel(boolean flag)
	{
		if(!sync.cancel(flag))
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field AbstractFuture$Sync sync>
	//*   2    4:iload_1         
	//*   3    5:invokevirtual   #36  <Method boolean AbstractFuture$Sync.cancel(boolean)>
	//*   4    8:ifne            13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		if(flag)
	//*   7   13:iload_1         
	//*   8   14:ifeq            21
			interruptTask();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #39  <Method void interruptTask()>
		return true;
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public Object get()
		throws InterruptedException, ExecutionException
	{
		return sync.get();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AbstractFuture$Sync sync>
	//    2    4:invokevirtual   #47  <Method Object AbstractFuture$Sync.get()>
	//    3    7:areturn         
	}

	public Object get(long l, TimeUnit timeunit)
		throws InterruptedException, TimeoutException, ExecutionException
	{
		return sync.get(timeunit.toNanos(l));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AbstractFuture$Sync sync>
	//    2    4:aload_3         
	//    3    5:lload_1         
	//    4    6:invokevirtual   #59  <Method long TimeUnit.toNanos(long)>
	//    5    9:invokevirtual   #62  <Method Object AbstractFuture$Sync.get(long)>
	//    6   12:areturn         
	}

	protected void interruptTask()
	{
	//    0    0:return          
	}

	public boolean isCancelled()
	{
		return sync.isCancelled();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AbstractFuture$Sync sync>
	//    2    4:invokevirtual   #67  <Method boolean AbstractFuture$Sync.isCancelled()>
	//    3    7:ireturn         
	}

	public boolean isDone()
	{
		return sync.isDone();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AbstractFuture$Sync sync>
	//    2    4:invokevirtual   #70  <Method boolean AbstractFuture$Sync.isDone()>
	//    3    7:ireturn         
	}

	protected boolean set(Object obj)
	{
		return sync.set(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AbstractFuture$Sync sync>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #74  <Method boolean AbstractFuture$Sync.set(Object)>
	//    4    8:ireturn         
	}

	protected boolean setException(Throwable throwable)
	{
		if(throwable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			throw new NullPointerException();
	//    2    4:new             #79  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #80  <Method void NullPointerException()>
	//    5   11:athrow          
		else
			return sync.setException(throwable);
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field AbstractFuture$Sync sync>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #82  <Method boolean AbstractFuture$Sync.setException(Throwable)>
	//   10   20:ireturn         
	}

	protected final boolean wasInterrupted()
	{
		return sync.wasInterrupted();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AbstractFuture$Sync sync>
	//    2    4:invokevirtual   #85  <Method boolean AbstractFuture$Sync.wasInterrupted()>
	//    3    7:ireturn         
	}

	private final Sync sync = new Sync();
}
