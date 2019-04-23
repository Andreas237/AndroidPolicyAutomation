// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.io.Closeable;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package bolts:
//			BoltsExecutors, CancellationTokenRegistration, CancellationToken

public class CancellationTokenSource
	implements Closeable
{

	public CancellationTokenSource()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void Object()>
	//    6   12:putfield        #27  <Field Object lock>
	//    7   15:aload_0         
	//    8   16:new             #29  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #30  <Method void ArrayList()>
	//   11   23:putfield        #32  <Field List registrations>
	//   12   26:aload_0         
	//   13   27:invokestatic    #38  <Method ScheduledExecutorService BoltsExecutors.scheduled()>
	//   14   30:putfield        #40  <Field ScheduledExecutorService executor>
	//   15   33:return          
	}

	private void cancelAfter(long l, TimeUnit timeunit)
	{
		int i;
label0:
		{
			i = l != -1L;
	//    0    0:lload_1         
	//    1    1:ldc2w           #50  <Long -1L>
	//    2    4:lcmp            
	//    3    5:istore          4
			if(i < 0)
				break MISSING_BLOCK_LABEL_85;
	//    4    7:iload           4
	//    5    9:iflt            85
			if(l == 0L)
	//*   6   12:lload_1         
	//*   7   13:lconst_0        
	//*   8   14:lcmp            
	//*   9   15:ifne            23
			{
				cancel();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #54  <Method void cancel()>
				return;
	//   12   22:return          
			}
			synchronized(lock)
	//*  13   23:aload_0         
	//*  14   24:getfield        #27  <Field Object lock>
	//*  15   27:astore          5
	//*  16   29:aload           5
	//*  17   31:monitorenter    
			{
				if(!cancellationRequested)
					break label0;
	//   18   32:aload_0         
	//   19   33:getfield        #56  <Field boolean cancellationRequested>
	//   20   36:ifeq            43
			}
	//   21   39:aload           5
	//   22   41:monitorexit     
			return;
	//   23   42:return          
		}
		cancelScheduledCancellation();
	//   24   43:aload_0         
	//   25   44:invokespecial   #59  <Method void cancelScheduledCancellation()>
		if(i == 0)
			break MISSING_BLOCK_LABEL_75;
	//   26   47:iload           4
	//   27   49:ifeq            75
		scheduledCancellation = executor.schedule(new Runnable() {

			public void run()
			{
				synchronized(lock)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field CancellationTokenSource this$0>
			//*   2    4:invokestatic    #26  <Method Object CancellationTokenSource.access$000(CancellationTokenSource)>
			//*   3    7:astore_1        
			//*   4    8:aload_1         
			//*   5    9:monitorenter    
				{
					scheduledCancellation = null;
			//    6   10:aload_0         
			//    7   11:getfield        #17  <Field CancellationTokenSource this$0>
			//    8   14:aconst_null     
			//    9   15:invokestatic    #30  <Method ScheduledFuture CancellationTokenSource.access$102(CancellationTokenSource, ScheduledFuture)>
			//   10   18:pop             
				}
			//   11   19:aload_1         
			//   12   20:monitorexit     
				cancel();
			//   13   21:aload_0         
			//   14   22:getfield        #17  <Field CancellationTokenSource this$0>
			//   15   25:invokevirtual   #33  <Method void CancellationTokenSource.cancel()>
				return;
			//   16   28:return          
				exception;
			//   17   29:astore_2        
				obj1;
			//   18   30:aload_1         
				JVM INSTR monitorexit ;
			//   19   31:monitorexit     
				throw exception;
			//   20   32:aload_2         
			//   21   33:athrow          
			}

			final CancellationTokenSource this$0;

			
			{
				this$0 = CancellationTokenSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CancellationTokenSource this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
, l, timeunit);
	//   28   52:aload_0         
	//   29   53:aload_0         
	//   30   54:getfield        #40  <Field ScheduledExecutorService executor>
	//   31   57:new             #8   <Class CancellationTokenSource$1>
	//   32   60:dup             
	//   33   61:aload_0         
	//   34   62:invokespecial   #62  <Method void CancellationTokenSource$1(CancellationTokenSource)>
	//   35   65:lload_1         
	//   36   66:aload_3         
	//   37   67:invokeinterface #68  <Method ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   38   72:putfield        #47  <Field ScheduledFuture scheduledCancellation>
		obj;
	//   39   75:aload           5
		JVM INSTR monitorexit ;
	//   40   77:monitorexit     
		return;
	//   41   78:return          
		timeunit;
	//   42   79:astore_3        
		obj;
	//   43   80:aload           5
		JVM INSTR monitorexit ;
	//   44   82:monitorexit     
		throw timeunit;
	//   45   83:aload_3         
	//   46   84:athrow          
		throw new IllegalArgumentException("Delay must be >= -1");
	//   47   85:new             #70  <Class IllegalArgumentException>
	//   48   88:dup             
	//   49   89:ldc1            #72  <String "Delay must be >= -1">
	//   50   91:invokespecial   #75  <Method void IllegalArgumentException(String)>
	//   51   94:athrow          
	}

	private void cancelScheduledCancellation()
	{
		ScheduledFuture scheduledfuture = scheduledCancellation;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ScheduledFuture scheduledCancellation>
	//    2    4:astore_1        
		if(scheduledfuture != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
		{
			scheduledfuture.cancel(true);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:invokeinterface #80  <Method boolean ScheduledFuture.cancel(boolean)>
	//    8   16:pop             
			scheduledCancellation = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #47  <Field ScheduledFuture scheduledCancellation>
		}
	//   12   22:return          
	}

	private void notifyListeners(List list)
	{
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((CancellationTokenRegistration)((Iterator) (list)).next()).runAction());
	//    0    0:aload_1         
	//    1    1:invokeinterface #88  <Method Iterator List.iterator()>
	//    2    6:astore_1        
	//    3    7:aload_1         
	//    4    8:invokeinterface #94  <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            31
	//    6   16:aload_1         
	//    7   17:invokeinterface #98  <Method Object Iterator.next()>
	//    8   22:checkcast       #100 <Class CancellationTokenRegistration>
	//    9   25:invokevirtual   #103 <Method void CancellationTokenRegistration.runAction()>
	//*  10   28:goto            7
	//   11   31:return          
	}

	private void throwIfClosed()
	{
		if(!closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field boolean closed>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("Object already closed");
	//    4    8:new             #110 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #112 <String "Object already closed">
	//    7   14:invokespecial   #113 <Method void IllegalStateException(String)>
	//    8   17:athrow          
	}

	public void cancel()
	{
label0:
		{
			synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				throwIfClosed();
	//    5    7:aload_0         
	//    6    8:invokespecial   #115 <Method void throwIfClosed()>
				if(!cancellationRequested)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #56  <Field boolean cancellationRequested>
	//    9   15:ifeq            21
			}
	//   10   18:aload_1         
	//   11   19:monitorexit     
			return;
	//   12   20:return          
		}
		ArrayList arraylist;
		cancelScheduledCancellation();
	//   13   21:aload_0         
	//   14   22:invokespecial   #59  <Method void cancelScheduledCancellation()>
		cancellationRequested = true;
	//   15   25:aload_0         
	//   16   26:iconst_1        
	//   17   27:putfield        #56  <Field boolean cancellationRequested>
		arraylist = new ArrayList(((java.util.Collection) (registrations)));
	//   18   30:new             #29  <Class ArrayList>
	//   19   33:dup             
	//   20   34:aload_0         
	//   21   35:getfield        #32  <Field List registrations>
	//   22   38:invokespecial   #118 <Method void ArrayList(java.util.Collection)>
	//   23   41:astore_2        
		obj;
	//   24   42:aload_1         
		JVM INSTR monitorexit ;
	//   25   43:monitorexit     
		notifyListeners(((List) (arraylist)));
	//   26   44:aload_0         
	//   27   45:aload_2         
	//   28   46:invokespecial   #120 <Method void notifyListeners(List)>
		return;
	//   29   49:return          
		exception;
	//   30   50:astore_2        
		obj;
	//   31   51:aload_1         
		JVM INSTR monitorexit ;
	//   32   52:monitorexit     
		throw exception;
	//   33   53:aload_2         
	//   34   54:athrow          
	}

	public void cancelAfter(long l)
	{
		cancelAfter(l, TimeUnit.MILLISECONDS);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:getstatic       #127 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    3    5:invokespecial   #129 <Method void cancelAfter(long, TimeUnit)>
	//    4    8:return          
	}

	public void close()
	{
label0:
		{
			synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(!closed)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #108 <Field boolean closed>
	//    7   11:ifeq            17
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		cancelScheduledCancellation();
	//   11   17:aload_0         
	//   12   18:invokespecial   #59  <Method void cancelScheduledCancellation()>
		for(Iterator iterator = registrations.iterator(); iterator.hasNext(); ((CancellationTokenRegistration)iterator.next()).close());
	//   13   21:aload_0         
	//   14   22:getfield        #32  <Field List registrations>
	//   15   25:invokeinterface #88  <Method Iterator List.iterator()>
	//   16   30:astore_2        
	//   17   31:aload_2         
	//   18   32:invokeinterface #94  <Method boolean Iterator.hasNext()>
	//   19   37:ifeq            55
	//   20   40:aload_2         
	//   21   41:invokeinterface #98  <Method Object Iterator.next()>
	//   22   46:checkcast       #100 <Class CancellationTokenRegistration>
	//   23   49:invokevirtual   #132 <Method void CancellationTokenRegistration.close()>
	//*  24   52:goto            31
		registrations.clear();
	//   25   55:aload_0         
	//   26   56:getfield        #32  <Field List registrations>
	//   27   59:invokeinterface #135 <Method void List.clear()>
		closed = true;
	//   28   64:aload_0         
	//   29   65:iconst_1        
	//   30   66:putfield        #108 <Field boolean closed>
		obj;
	//   31   69:aload_1         
		JVM INSTR monitorexit ;
	//   32   70:monitorexit     
		return;
	//   33   71:return          
		exception;
	//   34   72:astore_2        
		obj;
	//   35   73:aload_1         
		JVM INSTR monitorexit ;
	//   36   74:monitorexit     
		throw exception;
	//   37   75:aload_2         
	//   38   76:athrow          
	}

	public CancellationToken getToken()
	{
		CancellationToken cancellationtoken;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			throwIfClosed();
	//    5    7:aload_0         
	//    6    8:invokespecial   #115 <Method void throwIfClosed()>
			cancellationtoken = new CancellationToken(this);
	//    7   11:new             #139 <Class CancellationToken>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #140 <Method void CancellationToken(CancellationTokenSource)>
	//   11   19:astore_2        
		}
	//   12   20:aload_1         
	//   13   21:monitorexit     
		return cancellationtoken;
	//   14   22:aload_2         
	//   15   23:areturn         
		exception;
	//   16   24:astore_2        
		obj;
	//   17   25:aload_1         
		JVM INSTR monitorexit ;
	//   18   26:monitorexit     
		throw exception;
	//   19   27:aload_2         
	//   20   28:athrow          
	}

	public boolean isCancellationRequested()
	{
		boolean flag;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			throwIfClosed();
	//    5    7:aload_0         
	//    6    8:invokespecial   #115 <Method void throwIfClosed()>
			flag = cancellationRequested;
	//    7   11:aload_0         
	//    8   12:getfield        #56  <Field boolean cancellationRequested>
	//    9   15:istore_1        
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return flag;
	//   12   18:iload_1         
	//   13   19:ireturn         
		exception;
	//   14   20:astore_3        
		obj;
	//   15   21:aload_2         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_3         
	//   18   24:athrow          
	}

	CancellationTokenRegistration register(Runnable runnable)
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object lock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		throwIfClosed();
	//    5    7:aload_0         
	//    6    8:invokespecial   #115 <Method void throwIfClosed()>
		runnable = ((Runnable) (new CancellationTokenRegistration(this, runnable)));
	//    7   11:new             #100 <Class CancellationTokenRegistration>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #146 <Method void CancellationTokenRegistration(CancellationTokenSource, Runnable)>
	//   12   20:astore_1        
		if(cancellationRequested)
	//*  13   21:aload_0         
	//*  14   22:getfield        #56  <Field boolean cancellationRequested>
	//*  15   25:ifeq            35
		{
			((CancellationTokenRegistration) (runnable)).runAction();
	//   16   28:aload_1         
	//   17   29:invokevirtual   #103 <Method void CancellationTokenRegistration.runAction()>
			break MISSING_BLOCK_LABEL_46;
	//   18   32:goto            46
		}
		registrations.add(((Object) (runnable)));
	//   19   35:aload_0         
	//   20   36:getfield        #32  <Field List registrations>
	//   21   39:aload_1         
	//   22   40:invokeinterface #150 <Method boolean List.add(Object)>
	//   23   45:pop             
		obj;
	//   24   46:aload_2         
		JVM INSTR monitorexit ;
	//   25   47:monitorexit     
		return ((CancellationTokenRegistration) (runnable));
	//   26   48:aload_1         
	//   27   49:areturn         
		runnable;
	//   28   50:astore_1        
		obj;
	//   29   51:aload_2         
		JVM INSTR monitorexit ;
	//   30   52:monitorexit     
		throw runnable;
	//   31   53:aload_1         
	//   32   54:athrow          
	}

	void throwIfCancellationRequested()
		throws CancellationException
	{
label0:
		{
			synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				throwIfClosed();
	//    5    7:aload_0         
	//    6    8:invokespecial   #115 <Method void throwIfClosed()>
				if(cancellationRequested)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #56  <Field boolean cancellationRequested>
	//    9   15:ifne            21
			}
	//   10   18:aload_1         
	//   11   19:monitorexit     
			return;
	//   12   20:return          
		}
		throw new CancellationException();
	//   13   21:new             #153 <Class CancellationException>
	//   14   24:dup             
	//   15   25:invokespecial   #154 <Method void CancellationException()>
	//   16   28:athrow          
		exception;
	//   17   29:astore_2        
		obj;
	//   18   30:aload_1         
		JVM INSTR monitorexit ;
	//   19   31:monitorexit     
		throw exception;
	//   20   32:aload_2         
	//   21   33:athrow          
	}

	public String toString()
	{
		return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[] {
			((Object)this).getClass().getName(), Integer.toHexString(((Object)this).hashCode()), Boolean.toString(isCancellationRequested())
		});
	//    0    0:getstatic       #163 <Field Locale Locale.US>
	//    1    3:ldc1            #165 <String "%s@%s[cancellationRequested=%s]">
	//    2    5:iconst_3        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:invokevirtual   #169 <Method Class Object.getClass()>
	//    8   15:invokevirtual   #174 <Method String Class.getName()>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:aload_0         
	//   13   22:invokevirtual   #178 <Method int Object.hashCode()>
	//   14   25:invokestatic    #184 <Method String Integer.toHexString(int)>
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_2        
	//   18   31:aload_0         
	//   19   32:invokevirtual   #186 <Method boolean isCancellationRequested()>
	//   20   35:invokestatic    #191 <Method String Boolean.toString(boolean)>
	//   21   38:aastore         
	//   22   39:invokestatic    #197 <Method String String.format(Locale, String, Object[])>
	//   23   42:areturn         
	}

	void unregister(CancellationTokenRegistration cancellationtokenregistration)
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			throwIfClosed();
	//    5    7:aload_0         
	//    6    8:invokespecial   #115 <Method void throwIfClosed()>
			registrations.remove(((Object) (cancellationtokenregistration)));
	//    7   11:aload_0         
	//    8   12:getfield        #32  <Field List registrations>
	//    9   15:aload_1         
	//   10   16:invokeinterface #202 <Method boolean List.remove(Object)>
	//   11   21:pop             
		}
	//   12   22:aload_2         
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		cancellationtokenregistration;
	//   15   25:astore_1        
		obj;
	//   16   26:aload_2         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		throw cancellationtokenregistration;
	//   18   28:aload_1         
	//   19   29:athrow          
	}

	private boolean cancellationRequested;
	private boolean closed;
	private final ScheduledExecutorService executor = BoltsExecutors.scheduled();
	private final Object lock = new Object();
	private final List registrations = new ArrayList();
	private ScheduledFuture scheduledCancellation;


/*
	static Object access$000(CancellationTokenSource cancellationtokensource)
	{
		return cancellationtokensource.lock;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object lock>
	//    2    4:areturn         
	}

*/


/*
	static ScheduledFuture access$102(CancellationTokenSource cancellationtokensource, ScheduledFuture scheduledfuture)
	{
		cancellationtokensource.scheduledCancellation = scheduledfuture;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field ScheduledFuture scheduledCancellation>
		return scheduledfuture;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
