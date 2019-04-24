// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.runtime;

import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.FlowLog;
import com.raizlabs.android.dbflow.structure.database.transaction.ITransactionQueue;
import com.raizlabs.android.dbflow.structure.database.transaction.Transaction;

// Referenced classes of package com.raizlabs.android.dbflow.runtime:
//			DBBatchSaveQueue

public abstract class BaseTransactionManager
{

	public BaseTransactionManager(ITransactionQueue itransactionqueue, DatabaseDefinition databasedefinition)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		transactionQueue = itransactionqueue;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field ITransactionQueue transactionQueue>
		saveQueue = new DBBatchSaveQueue(databasedefinition);
	//    5    9:aload_0         
	//    6   10:new             #18  <Class DBBatchSaveQueue>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #21  <Method void DBBatchSaveQueue(DatabaseDefinition)>
	//   10   18:putfield        #23  <Field DBBatchSaveQueue saveQueue>
		checkQueue();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #26  <Method void checkQueue()>
	//   13   25:return          
	}

	public void addTransaction(Transaction transaction)
	{
		getQueue().add(transaction);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method ITransactionQueue getQueue()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #39  <Method void ITransactionQueue.add(Transaction)>
	//    4   10:return          
	}

	public void cancelTransaction(Transaction transaction)
	{
		getQueue().cancel(transaction);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method ITransactionQueue getQueue()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #43  <Method void ITransactionQueue.cancel(Transaction)>
	//    4   10:return          
	}

	public void checkQueue()
	{
		getQueue().startIfNotAlive();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method ITransactionQueue getQueue()>
	//    2    4:invokeinterface #46  <Method void ITransactionQueue.startIfNotAlive()>
	//    3    9:return          
	}

	public ITransactionQueue getQueue()
	{
		return transactionQueue;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ITransactionQueue transactionQueue>
	//    2    4:areturn         
	}

	public DBBatchSaveQueue getSaveQueue()
	{
		try
		{
			if(!saveQueue.isAlive())
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field DBBatchSaveQueue saveQueue>
	//*   2    4:invokevirtual   #54  <Method boolean DBBatchSaveQueue.isAlive()>
	//*   3    7:ifne            17
				saveQueue.start();
	//    4   10:aload_0         
	//    5   11:getfield        #23  <Field DBBatchSaveQueue saveQueue>
	//    6   14:invokevirtual   #57  <Method void DBBatchSaveQueue.start()>
		}
	//*   7   17:aload_0         
	//*   8   18:getfield        #23  <Field DBBatchSaveQueue saveQueue>
	//*   9   21:areturn         
		catch(IllegalThreadStateException illegalthreadstateexception)
	//*  10   22:astore_1        
		{
			FlowLog.logError(((Throwable) (illegalthreadstateexception)));
	//   11   23:aload_1         
	//   12   24:invokestatic    #63  <Method void FlowLog.logError(Throwable)>
		}
		return saveQueue;
	//*  13   27:goto            17
	}

	public void stopQueue()
	{
		getQueue().quit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method ITransactionQueue getQueue()>
	//    2    4:invokeinterface #67  <Method void ITransactionQueue.quit()>
	//    3    9:return          
	}

	private DBBatchSaveQueue saveQueue;
	private final ITransactionQueue transactionQueue;
}
