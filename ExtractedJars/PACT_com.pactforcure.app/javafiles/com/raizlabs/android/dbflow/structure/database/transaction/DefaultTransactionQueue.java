// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import android.os.Looper;
import android.os.Process;
import com.raizlabs.android.dbflow.config.FlowLog;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			ITransactionQueue, Transaction

public class DefaultTransactionQueue extends Thread
	implements ITransactionQueue
{

	public DefaultTransactionQueue(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void Thread(String)>
		isQuitting = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #17  <Field boolean isQuitting>
	//    6   10:aload_0         
	//    7   11:new             #19  <Class LinkedBlockingQueue>
	//    8   14:dup             
	//    9   15:invokespecial   #22  <Method void LinkedBlockingQueue()>
	//   10   18:putfield        #24  <Field LinkedBlockingQueue queue>
	//   11   21:return          
	}

	public void add(Transaction transaction)
	{
		synchronized(queue)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field LinkedBlockingQueue queue>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(!queue.contains(((Object) (transaction))))
	//*   5    7:aload_0         
	//*   6    8:getfield        #24  <Field LinkedBlockingQueue queue>
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #31  <Method boolean LinkedBlockingQueue.contains(Object)>
	//*   9   15:ifne            27
				queue.add(((Object) (transaction)));
	//   10   18:aload_0         
	//   11   19:getfield        #24  <Field LinkedBlockingQueue queue>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #33  <Method boolean LinkedBlockingQueue.add(Object)>
	//   14   26:pop             
		}
	//   15   27:aload_2         
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		transaction;
	//   18   30:astore_1        
		linkedblockingqueue;
	//   19   31:aload_2         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		throw transaction;
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	public void cancel(Transaction transaction)
	{
		synchronized(queue)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field LinkedBlockingQueue queue>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(queue.contains(((Object) (transaction))))
	//*   5    7:aload_0         
	//*   6    8:getfield        #24  <Field LinkedBlockingQueue queue>
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #31  <Method boolean LinkedBlockingQueue.contains(Object)>
	//*   9   15:ifeq            27
				queue.remove(((Object) (transaction)));
	//   10   18:aload_0         
	//   11   19:getfield        #24  <Field LinkedBlockingQueue queue>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #37  <Method boolean LinkedBlockingQueue.remove(Object)>
	//   14   26:pop             
		}
	//   15   27:aload_2         
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		transaction;
	//   18   30:astore_1        
		linkedblockingqueue;
	//   19   31:aload_2         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		throw transaction;
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	public void cancel(String s)
	{
		LinkedBlockingQueue linkedblockingqueue = queue;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field LinkedBlockingQueue queue>
	//    2    4:astore_2        
		linkedblockingqueue;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Iterator iterator = queue.iterator();
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field LinkedBlockingQueue queue>
	//    7   11:invokevirtual   #41  <Method Iterator LinkedBlockingQueue.iterator()>
	//    8   14:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   15:aload_3         
	//   10   16:invokeinterface #47  <Method boolean Iterator.hasNext()>
	//   11   21:ifeq            69
			Transaction transaction = (Transaction)iterator.next();
	//   12   24:aload_3         
	//   13   25:invokeinterface #51  <Method Object Iterator.next()>
	//   14   30:checkcast       #53  <Class Transaction>
	//   15   33:astore          4
			if(transaction.name() != null && transaction.name().equals(((Object) (s))))
	//*  16   35:aload           4
	//*  17   37:invokevirtual   #57  <Method String Transaction.name()>
	//*  18   40:ifnull          15
	//*  19   43:aload           4
	//*  20   45:invokevirtual   #57  <Method String Transaction.name()>
	//*  21   48:aload_1         
	//*  22   49:invokevirtual   #62  <Method boolean String.equals(Object)>
	//*  23   52:ifeq            15
				iterator.remove();
	//   24   55:aload_3         
	//   25   56:invokeinterface #64  <Method void Iterator.remove()>
		} while(true);
	//   26   61:goto            15
		break MISSING_BLOCK_LABEL_69;
		s;
	//   27   64:astore_1        
		linkedblockingqueue;
	//   28   65:aload_2         
		JVM INSTR monitorexit ;
	//   29   66:monitorexit     
		throw s;
	//   30   67:aload_1         
	//   31   68:athrow          
		linkedblockingqueue;
	//   32   69:aload_2         
		JVM INSTR monitorexit ;
	//   33   70:monitorexit     
	//   34   71:return          
	}

	public void quit()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		isQuitting = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #17  <Field boolean isQuitting>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		interrupt();
	//    7    9:aload_0         
	//    8   10:invokevirtual   #68  <Method void interrupt()>
		return;
	//    9   13:return          
		Exception exception;
		exception;
	//   10   14:astore_1        
		this;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public void run()
	{
		Looper.prepare();
	//    0    0:invokestatic    #76  <Method void Looper.prepare()>
		Process.setThreadPriority(10);
	//    1    3:bipush          10
	//    2    5:invokestatic    #82  <Method void Process.setThreadPriority(int)>
_L1:
		do
		{
			Transaction transaction;
			do
				transaction = (Transaction)queue.take();
	//    3    8:aload_0         
	//    4    9:getfield        #24  <Field LinkedBlockingQueue queue>
	//    5   12:invokevirtual   #85  <Method Object LinkedBlockingQueue.take()>
	//    6   15:checkcast       #53  <Class Transaction>
	//    7   18:astore_1        
			while(isQuitting);
	//    8   19:aload_0         
	//    9   20:getfield        #17  <Field boolean isQuitting>
	//   10   23:ifne            8
			transaction.executeSync();
	//   11   26:aload_1         
	//   12   27:invokevirtual   #88  <Method void Transaction.executeSync()>
		} while(true);
	//   13   30:goto            8
		Object obj;
		obj;
	//   14   33:astore_1        
		this;
	//   15   34:aload_0         
		JVM INSTR monitorenter ;
	//   16   35:monitorenter    
		if(!isQuitting)
			break MISSING_BLOCK_LABEL_72;
	//   17   36:aload_0         
	//   18   37:getfield        #17  <Field boolean isQuitting>
	//   19   40:ifeq            72
		synchronized(queue)
	//*  20   43:aload_0         
	//*  21   44:getfield        #24  <Field LinkedBlockingQueue queue>
	//*  22   47:astore_1        
	//*  23   48:aload_1         
	//*  24   49:monitorenter    
		{
			queue.clear();
	//   25   50:aload_0         
	//   26   51:getfield        #24  <Field LinkedBlockingQueue queue>
	//   27   54:invokevirtual   #91  <Method void LinkedBlockingQueue.clear()>
		}
	//   28   57:aload_1         
	//   29   58:monitorexit     
		this;
	//   30   59:aload_0         
		JVM INSTR monitorexit ;
	//   31   60:monitorexit     
		return;
	//   32   61:return          
		exception;
	//   33   62:astore_2        
		linkedblockingqueue;
	//   34   63:aload_1         
		JVM INSTR monitorexit ;
	//   35   64:monitorexit     
		throw exception;
	//   36   65:aload_2         
	//   37   66:athrow          
		linkedblockingqueue;
	//   38   67:astore_1        
		this;
	//   39   68:aload_0         
		JVM INSTR monitorexit ;
	//   40   69:monitorexit     
		throw linkedblockingqueue;
	//   41   70:aload_1         
	//   42   71:athrow          
		this;
	//   43   72:aload_0         
		JVM INSTR monitorexit ;
	//   44   73:monitorexit     
		  goto _L1
	//*  45   74:goto            8
	}

	public void startIfNotAlive()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = isAlive();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #97  <Method boolean isAlive()>
	//    4    6:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_15;
	//    5    7:iload_1         
	//    6    8:ifne            15
		start();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #100 <Method void start()>
_L1:
		this;
	//    9   15:aload_0         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		Object obj;
		obj;
	//   12   18:astore_2        
		FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.E, ((Throwable) (obj)));
	//   13   19:getstatic       #106 <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.E>
	//   14   22:aload_2         
	//   15   23:invokestatic    #112 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, Throwable)>
		  goto _L1
	//*  16   26:goto            15
		obj;
	//   17   29:astore_2        
		this;
	//   18   30:aload_0         
		JVM INSTR monitorexit ;
	//   19   31:monitorexit     
		throw obj;
	//   20   32:aload_2         
	//   21   33:athrow          
	}

	private boolean isQuitting;
	private final LinkedBlockingQueue queue = new LinkedBlockingQueue();
}
