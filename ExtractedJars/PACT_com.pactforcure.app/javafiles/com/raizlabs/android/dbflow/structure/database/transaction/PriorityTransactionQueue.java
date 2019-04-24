// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import android.os.Looper;
import android.os.Process;
import com.raizlabs.android.dbflow.config.FlowLog;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			ITransactionQueue, Transaction, PriorityTransactionWrapper

public class PriorityTransactionQueue extends Thread
	implements ITransactionQueue
{
	class PriorityEntry
		implements Comparable
	{

		public int compareTo(PriorityEntry priorityentry)
		{
			return transactionWrapper.compareTo(priorityentry.transactionWrapper);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
		//    2    4:aload_1         
		//    3    5:getfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
		//    4    8:invokevirtual   #54  <Method int PriorityTransactionWrapper.compareTo(PriorityTransactionWrapper)>
		//    5   11:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((PriorityEntry)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class PriorityTransactionQueue$PriorityEntry>
		//    3    5:invokevirtual   #59  <Method int compareTo(PriorityTransactionQueue$PriorityEntry)>
		//    4    8:ireturn         
		}

		public boolean equals(Object obj)
		{
			if(this != obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
		//*   3    5:iconst_1        
		//*   4    6:ireturn         
			{
				if(obj == null || ((Object)this).getClass() != obj.getClass())
		//*   5    7:aload_1         
		//*   6    8:ifnull          22
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #65  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #65  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((PriorityEntry)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class PriorityTransactionQueue$PriorityEntry>
		//   16   28:astore_1        
				if(transactionWrapper != null)
		//*  17   29:aload_0         
		//*  18   30:getfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
		//*  19   33:ifnull          48
					return ((Object) (transactionWrapper)).equals(((Object) (((PriorityEntry) (obj)).transactionWrapper)));
		//   20   36:aload_0         
		//   21   37:getfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
		//   22   40:aload_1         
		//   23   41:getfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
		//   24   44:invokevirtual   #67  <Method boolean Object.equals(Object)>
		//   25   47:ireturn         
				if(((PriorityEntry) (obj)).transactionWrapper != null)
		//*  26   48:aload_1         
		//*  27   49:getfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
		//*  28   52:ifnull          5
					return false;
		//   29   55:iconst_0        
		//   30   56:ireturn         
			}
			return true;
		}

		public Transaction getEntry()
		{
			return entry;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Transaction entry>
		//    2    4:areturn         
		}

		public int hashCode()
		{
			if(transactionWrapper != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
		//*   2    4:ifnull          15
				return ((Object) (transactionWrapper)).hashCode();
		//    3    7:aload_0         
		//    4    8:getfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
		//    5   11:invokevirtual   #74  <Method int Object.hashCode()>
		//    6   14:ireturn         
			else
				return 0;
		//    7   15:iconst_0        
		//    8   16:ireturn         
		}

		final Transaction entry;
		final PriorityTransactionQueue this$0;
		final PriorityTransactionWrapper transactionWrapper;

		public PriorityEntry(Transaction transaction)
		{
			this$0 = PriorityTransactionQueue.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field PriorityTransactionQueue this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			entry = transaction;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field Transaction entry>
			if(transaction.transaction() instanceof PriorityTransactionWrapper)
		//*   8   14:aload_2         
		//*   9   15:invokevirtual   #32  <Method ITransaction Transaction.transaction()>
		//*  10   18:instanceof      #34  <Class PriorityTransactionWrapper>
		//*  11   21:ifeq            36
			{
				transactionWrapper = (PriorityTransactionWrapper)transaction.transaction();
		//   12   24:aload_0         
		//   13   25:aload_2         
		//   14   26:invokevirtual   #32  <Method ITransaction Transaction.transaction()>
		//   15   29:checkcast       #34  <Class PriorityTransactionWrapper>
		//   16   32:putfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
				return;
		//   17   35:return          
			} else
			{
				transactionWrapper = (new PriorityTransactionWrapper.Builder(transaction.transaction())).build();
		//   18   36:aload_0         
		//   19   37:new             #38  <Class PriorityTransactionWrapper$Builder>
		//   20   40:dup             
		//   21   41:aload_2         
		//   22   42:invokevirtual   #32  <Method ITransaction Transaction.transaction()>
		//   23   45:invokespecial   #41  <Method void PriorityTransactionWrapper$Builder(ITransaction)>
		//   24   48:invokevirtual   #45  <Method PriorityTransactionWrapper PriorityTransactionWrapper$Builder.build()>
		//   25   51:putfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
				return;
		//   26   54:return          
			}
		}
	}


	public PriorityTransactionQueue(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void Thread(String)>
		isQuitting = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #20  <Field boolean isQuitting>
	//    6   10:aload_0         
	//    7   11:new             #22  <Class PriorityBlockingQueue>
	//    8   14:dup             
	//    9   15:invokespecial   #25  <Method void PriorityBlockingQueue()>
	//   10   18:putfield        #27  <Field PriorityBlockingQueue queue>
	//   11   21:return          
	}

	private void throwInvalidTransactionType(Transaction transaction)
	{
		StringBuilder stringbuilder = (new StringBuilder()).append("Transaction of type:");
	//    0    0:new             #32  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void StringBuilder()>
	//    3    7:ldc1            #35  <String "Transaction of type:">
	//    4    9:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:astore_2        
		if(transaction != null)
	//*   6   13:aload_1         
	//*   7   14:ifnull          46
			transaction = ((Transaction) (((Object) (transaction.transaction())).getClass()));
	//    8   17:aload_1         
	//    9   18:invokevirtual   #45  <Method ITransaction Transaction.transaction()>
	//   10   21:invokevirtual   #51  <Method Class Object.getClass()>
	//   11   24:astore_1        
		else
	//*  12   25:new             #53  <Class IllegalArgumentException>
	//*  13   28:dup             
	//*  14   29:aload_2         
	//*  15   30:aload_1         
	//*  16   31:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
	//*  17   34:ldc1            #58  <String " should be of type PriorityTransactionWrapper">
	//*  18   36:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//*  19   39:invokevirtual   #62  <Method String StringBuilder.toString()>
	//*  20   42:invokespecial   #63  <Method void IllegalArgumentException(String)>
	//*  21   45:athrow          
			transaction = "Unknown";
	//   22   46:ldc1            #65  <String "Unknown">
	//   23   48:astore_1        
		throw new IllegalArgumentException(stringbuilder.append(((Object) (transaction))).append(" should be of type PriorityTransactionWrapper").toString());
	//*  24   49:goto            25
	}

	public void add(Transaction transaction)
	{
		synchronized(queue)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field PriorityBlockingQueue queue>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			transaction = ((Transaction) (new PriorityEntry(transaction)));
	//    5    7:new             #8   <Class PriorityTransactionQueue$PriorityEntry>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokespecial   #69  <Method void PriorityTransactionQueue$PriorityEntry(PriorityTransactionQueue, Transaction)>
	//   10   16:astore_1        
			if(!queue.contains(((Object) (transaction))))
	//*  11   17:aload_0         
	//*  12   18:getfield        #27  <Field PriorityBlockingQueue queue>
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #73  <Method boolean PriorityBlockingQueue.contains(Object)>
	//*  15   25:ifne            37
				queue.add(((Object) (transaction)));
	//   16   28:aload_0         
	//   17   29:getfield        #27  <Field PriorityBlockingQueue queue>
	//   18   32:aload_1         
	//   19   33:invokevirtual   #75  <Method boolean PriorityBlockingQueue.add(Object)>
	//   20   36:pop             
		}
	//   21   37:aload_2         
	//   22   38:monitorexit     
		return;
	//   23   39:return          
		transaction;
	//   24   40:astore_1        
		priorityblockingqueue;
	//   25   41:aload_2         
		JVM INSTR monitorexit ;
	//   26   42:monitorexit     
		throw transaction;
	//   27   43:aload_1         
	//   28   44:athrow          
	}

	public void cancel(Transaction transaction)
	{
		synchronized(queue)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field PriorityBlockingQueue queue>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			transaction = ((Transaction) (new PriorityEntry(transaction)));
	//    5    7:new             #8   <Class PriorityTransactionQueue$PriorityEntry>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokespecial   #69  <Method void PriorityTransactionQueue$PriorityEntry(PriorityTransactionQueue, Transaction)>
	//   10   16:astore_1        
			if(queue.contains(((Object) (transaction))))
	//*  11   17:aload_0         
	//*  12   18:getfield        #27  <Field PriorityBlockingQueue queue>
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #73  <Method boolean PriorityBlockingQueue.contains(Object)>
	//*  15   25:ifeq            37
				queue.remove(((Object) (transaction)));
	//   16   28:aload_0         
	//   17   29:getfield        #27  <Field PriorityBlockingQueue queue>
	//   18   32:aload_1         
	//   19   33:invokevirtual   #79  <Method boolean PriorityBlockingQueue.remove(Object)>
	//   20   36:pop             
		}
	//   21   37:aload_2         
	//   22   38:monitorexit     
		return;
	//   23   39:return          
		transaction;
	//   24   40:astore_1        
		priorityblockingqueue;
	//   25   41:aload_2         
		JVM INSTR monitorexit ;
	//   26   42:monitorexit     
		throw transaction;
	//   27   43:aload_1         
	//   28   44:athrow          
	}

	public void cancel(String s)
	{
		PriorityBlockingQueue priorityblockingqueue = queue;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field PriorityBlockingQueue queue>
	//    2    4:astore_2        
		priorityblockingqueue;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Iterator iterator = queue.iterator();
	//    5    7:aload_0         
	//    6    8:getfield        #27  <Field PriorityBlockingQueue queue>
	//    7   11:invokevirtual   #83  <Method Iterator PriorityBlockingQueue.iterator()>
	//    8   14:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   15:aload_3         
	//   10   16:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//   11   21:ifeq            72
			Transaction transaction = ((PriorityEntry)iterator.next()).entry;
	//   12   24:aload_3         
	//   13   25:invokeinterface #93  <Method Object Iterator.next()>
	//   14   30:checkcast       #8   <Class PriorityTransactionQueue$PriorityEntry>
	//   15   33:getfield        #97  <Field Transaction PriorityTransactionQueue$PriorityEntry.entry>
	//   16   36:astore          4
			if(transaction.name() != null && transaction.name().equals(((Object) (s))))
	//*  17   38:aload           4
	//*  18   40:invokevirtual   #100 <Method String Transaction.name()>
	//*  19   43:ifnull          15
	//*  20   46:aload           4
	//*  21   48:invokevirtual   #100 <Method String Transaction.name()>
	//*  22   51:aload_1         
	//*  23   52:invokevirtual   #105 <Method boolean String.equals(Object)>
	//*  24   55:ifeq            15
				iterator.remove();
	//   25   58:aload_3         
	//   26   59:invokeinterface #107 <Method void Iterator.remove()>
		} while(true);
	//   27   64:goto            15
		break MISSING_BLOCK_LABEL_72;
		s;
	//   28   67:astore_1        
		priorityblockingqueue;
	//   29   68:aload_2         
		JVM INSTR monitorexit ;
	//   30   69:monitorexit     
		throw s;
	//   31   70:aload_1         
	//   32   71:athrow          
		priorityblockingqueue;
	//   33   72:aload_2         
		JVM INSTR monitorexit ;
	//   34   73:monitorexit     
	//   35   74:return          
	}

	public void quit()
	{
		isQuitting = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #20  <Field boolean isQuitting>
		interrupt();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #111 <Method void interrupt()>
	//    5    9:return          
	}

	public void run()
	{
		Looper.prepare();
	//    0    0:invokestatic    #119 <Method void Looper.prepare()>
		Process.setThreadPriority(10);
	//    1    3:bipush          10
	//    2    5:invokestatic    #125 <Method void Process.setThreadPriority(int)>
_L2:
		PriorityEntry priorityentry = (PriorityEntry)queue.take();
	//    3    8:aload_0         
	//    4    9:getfield        #27  <Field PriorityBlockingQueue queue>
	//    5   12:invokevirtual   #128 <Method Object PriorityBlockingQueue.take()>
	//    6   15:checkcast       #8   <Class PriorityTransactionQueue$PriorityEntry>
	//    7   18:astore_1        
		priorityentry.entry.executeSync();
	//    8   19:aload_1         
	//    9   20:getfield        #97  <Field Transaction PriorityTransactionQueue$PriorityEntry.entry>
	//   10   23:invokevirtual   #131 <Method void Transaction.executeSync()>
		if(true) goto _L2; else goto _L1
	//   11   26:goto            8
_L1:
		InterruptedException interruptedexception;
		interruptedexception;
	//   12   29:astore_1        
		if(!isQuitting) goto _L2; else goto _L3
	//   13   30:aload_0         
	//   14   31:getfield        #20  <Field boolean isQuitting>
	//   15   34:ifeq            8
_L3:
		synchronized(queue)
	//*  16   37:aload_0         
	//*  17   38:getfield        #27  <Field PriorityBlockingQueue queue>
	//*  18   41:astore_1        
	//*  19   42:aload_1         
	//*  20   43:monitorenter    
		{
			queue.clear();
	//   21   44:aload_0         
	//   22   45:getfield        #27  <Field PriorityBlockingQueue queue>
	//   23   48:invokevirtual   #134 <Method void PriorityBlockingQueue.clear()>
		}
	//   24   51:aload_1         
	//   25   52:monitorexit     
		return;
	//   26   53:return          
		exception;
	//   27   54:astore_2        
		priorityblockingqueue;
	//   28   55:aload_1         
		JVM INSTR monitorexit ;
	//   29   56:monitorexit     
		throw exception;
	//   30   57:aload_2         
	//   31   58:athrow          
	}

	public void startIfNotAlive()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = isAlive();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #140 <Method boolean isAlive()>
	//    4    6:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_15;
	//    5    7:iload_1         
	//    6    8:ifne            15
		start();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #143 <Method void start()>
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
	//   13   19:getstatic       #149 <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.E>
	//   14   22:aload_2         
	//   15   23:invokestatic    #155 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, Throwable)>
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
	private final PriorityBlockingQueue queue = new PriorityBlockingQueue();
}
