// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.runtime;

import android.os.Looper;
import android.os.Process;
import com.raizlabs.android.dbflow.config.*;
import com.raizlabs.android.dbflow.structure.Model;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.transaction.Transaction;
import java.util.ArrayList;
import java.util.Collection;

public class DBBatchSaveQueue extends Thread
{

	DBBatchSaveQueue(DatabaseDefinition databasedefinition)
	{
		super("DBBatchSaveQueue");
	//    0    0:aload_0         
	//    1    1:ldc1            #39  <String "DBBatchSaveQueue">
	//    2    3:invokespecial   #42  <Method void Thread(String)>
		modelSaveSize = 50;
	//    3    6:aload_0         
	//    4    7:bipush          50
	//    5    9:putfield        #44  <Field int modelSaveSize>
		modelSaveCheckTime = 30000L;
	//    6   12:aload_0         
	//    7   13:ldc2w           #45  <Long 30000L>
	//    8   16:putfield        #48  <Field long modelSaveCheckTime>
		isQuitting = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #50  <Field boolean isQuitting>
	//   12   24:aload_0         
	//   13   25:new             #6   <Class DBBatchSaveQueue$1>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:invokespecial   #53  <Method void DBBatchSaveQueue$1(DBBatchSaveQueue)>
	//   17   33:putfield        #55  <Field com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel modelSaver>
	//   18   36:aload_0         
	//   19   37:new             #8   <Class DBBatchSaveQueue$2>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:invokespecial   #56  <Method void DBBatchSaveQueue$2(DBBatchSaveQueue)>
	//   23   45:putfield        #58  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success successCallback>
	//   24   48:aload_0         
	//   25   49:new             #10  <Class DBBatchSaveQueue$3>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:invokespecial   #59  <Method void DBBatchSaveQueue$3(DBBatchSaveQueue)>
	//   29   57:putfield        #61  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error errorCallback>
		databaseDefinition = databasedefinition;
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:putfield        #63  <Field DatabaseDefinition databaseDefinition>
	//   33   65:aload_0         
	//   34   66:new             #65  <Class ArrayList>
	//   35   69:dup             
	//   36   70:invokespecial   #68  <Method void ArrayList()>
	//   37   73:putfield        #70  <Field ArrayList models>
	//   38   76:return          
	}

	public void add(Object obj)
	{
		synchronized(models)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field ArrayList models>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			models.add(obj);
	//    5    7:aload_0         
	//    6    8:getfield        #70  <Field ArrayList models>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #84  <Method boolean ArrayList.add(Object)>
	//    9   15:pop             
			if(models.size() > modelSaveSize)
	//*  10   16:aload_0         
	//*  11   17:getfield        #70  <Field ArrayList models>
	//*  12   20:invokevirtual   #88  <Method int ArrayList.size()>
	//*  13   23:aload_0         
	//*  14   24:getfield        #44  <Field int modelSaveSize>
	//*  15   27:icmple          34
				interrupt();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #91  <Method void interrupt()>
		}
	//   18   34:aload_2         
	//   19   35:monitorexit     
		return;
	//   20   36:return          
		obj;
	//   21   37:astore_1        
		arraylist;
	//   22   38:aload_2         
		JVM INSTR monitorexit ;
	//   23   39:monitorexit     
		throw obj;
	//   24   40:aload_1         
	//   25   41:athrow          
	}

	public void addAll(Collection collection)
	{
		synchronized(models)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field ArrayList models>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			models.addAll(collection);
	//    5    7:aload_0         
	//    6    8:getfield        #70  <Field ArrayList models>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #96  <Method boolean ArrayList.addAll(Collection)>
	//    9   15:pop             
			if(models.size() > modelSaveSize)
	//*  10   16:aload_0         
	//*  11   17:getfield        #70  <Field ArrayList models>
	//*  12   20:invokevirtual   #88  <Method int ArrayList.size()>
	//*  13   23:aload_0         
	//*  14   24:getfield        #44  <Field int modelSaveSize>
	//*  15   27:icmple          34
				interrupt();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #91  <Method void interrupt()>
		}
	//   18   34:aload_2         
	//   19   35:monitorexit     
		return;
	//   20   36:return          
		collection;
	//   21   37:astore_1        
		arraylist;
	//   22   38:aload_2         
		JVM INSTR monitorexit ;
	//   23   39:monitorexit     
		throw collection;
	//   24   40:aload_1         
	//   25   41:athrow          
	}

	public void addAll2(Collection collection)
	{
		synchronized(models)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field ArrayList models>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			models.addAll(collection);
	//    5    7:aload_0         
	//    6    8:getfield        #70  <Field ArrayList models>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #96  <Method boolean ArrayList.addAll(Collection)>
	//    9   15:pop             
			if(models.size() > modelSaveSize)
	//*  10   16:aload_0         
	//*  11   17:getfield        #70  <Field ArrayList models>
	//*  12   20:invokevirtual   #88  <Method int ArrayList.size()>
	//*  13   23:aload_0         
	//*  14   24:getfield        #44  <Field int modelSaveSize>
	//*  15   27:icmple          34
				interrupt();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #91  <Method void interrupt()>
		}
	//   18   34:aload_2         
	//   19   35:monitorexit     
		return;
	//   20   36:return          
		collection;
	//   21   37:astore_1        
		arraylist;
	//   22   38:aload_2         
		JVM INSTR monitorexit ;
	//   23   39:monitorexit     
		throw collection;
	//   24   40:aload_1         
	//   25   41:athrow          
	}

	public void purgeQueue()
	{
		interrupt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method void interrupt()>
	//    2    4:return          
	}

	public void quit()
	{
		isQuitting = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #50  <Field boolean isQuitting>
	//    3    5:return          
	}

	public void remove(Object obj)
	{
		synchronized(models)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field ArrayList models>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			models.remove(obj);
	//    5    7:aload_0         
	//    6    8:getfield        #70  <Field ArrayList models>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #105 <Method boolean ArrayList.remove(Object)>
	//    9   15:pop             
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		obj;
	//   13   19:astore_1        
		arraylist;
	//   14   20:aload_2         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw obj;
	//   16   22:aload_1         
	//   17   23:athrow          
	}

	public void removeAll(Collection collection)
	{
		synchronized(models)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field ArrayList models>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			models.removeAll(collection);
	//    5    7:aload_0         
	//    6    8:getfield        #70  <Field ArrayList models>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #108 <Method boolean ArrayList.removeAll(Collection)>
	//    9   15:pop             
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		collection;
	//   13   19:astore_1        
		arraylist;
	//   14   20:aload_2         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw collection;
	//   16   22:aload_1         
	//   17   23:athrow          
	}

	public void removeAll2(Collection collection)
	{
		synchronized(models)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field ArrayList models>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			models.removeAll(collection);
	//    5    7:aload_0         
	//    6    8:getfield        #70  <Field ArrayList models>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #108 <Method boolean ArrayList.removeAll(Collection)>
	//    9   15:pop             
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		collection;
	//   13   19:astore_1        
		arraylist;
	//   14   20:aload_2         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw collection;
	//   16   22:aload_1         
	//   17   23:athrow          
	}

	public void run()
	{
		super.run();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method void Thread.run()>
		Looper.prepare();
	//    2    4:invokestatic    #119 <Method void Looper.prepare()>
		Process.setThreadPriority(10);
	//    3    7:bipush          10
	//    4    9:invokestatic    #125 <Method void Process.setThreadPriority(int)>
		do
		{
			ArrayList arraylist1;
			synchronized(models)
	//*   5   12:aload_0         
	//*   6   13:getfield        #70  <Field ArrayList models>
	//*   7   16:astore_1        
	//*   8   17:aload_1         
	//*   9   18:monitorenter    
			{
				arraylist1 = new ArrayList(((Collection) (models)));
	//   10   19:new             #65  <Class ArrayList>
	//   11   22:dup             
	//   12   23:aload_0         
	//   13   24:getfield        #70  <Field ArrayList models>
	//   14   27:invokespecial   #127 <Method void ArrayList(Collection)>
	//   15   30:astore_2        
				models.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #70  <Field ArrayList models>
	//   18   35:invokevirtual   #130 <Method void ArrayList.clear()>
			}
	//   19   38:aload_1         
	//   20   39:monitorexit     
			if(arraylist1.size() > 0)
	//*  21   40:aload_2         
	//*  22   41:invokevirtual   #88  <Method int ArrayList.size()>
	//*  23   44:ifle            112
				databaseDefinition.beginTransactionAsync(((com.raizlabs.android.dbflow.structure.database.transaction.ITransaction) ((new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.Builder(modelSaver)).addAll(((Collection) (arraylist1))).build()))).success(successCallback).error(errorCallback).build().execute();
	//   24   47:aload_0         
	//   25   48:getfield        #63  <Field DatabaseDefinition databaseDefinition>
	//   26   51:new             #132 <Class com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder>
	//   27   54:dup             
	//   28   55:aload_0         
	//   29   56:getfield        #55  <Field com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel modelSaver>
	//   30   59:invokespecial   #135 <Method void com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder(com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$ProcessModel)>
	//   31   62:aload_2         
	//   32   63:invokevirtual   #138 <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.addAll(Collection)>
	//   33   66:invokevirtual   #142 <Method com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction$Builder.build()>
	//   34   69:invokevirtual   #148 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder DatabaseDefinition.beginTransactionAsync(com.raizlabs.android.dbflow.structure.database.transaction.ITransaction)>
	//   35   72:aload_0         
	//   36   73:getfield        #58  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success successCallback>
	//   37   76:invokevirtual   #154 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.success(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success)>
	//   38   79:aload_0         
	//   39   80:getfield        #61  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error errorCallback>
	//   40   83:invokevirtual   #158 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.error(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error)>
	//   41   86:invokevirtual   #161 <Method Transaction com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.build()>
	//   42   89:invokevirtual   #166 <Method void Transaction.execute()>
			else
	//*  43   92:aload_0         
	//*  44   93:getfield        #48  <Field long modelSaveCheckTime>
	//*  45   96:invokestatic    #170 <Method void Thread.sleep(long)>
	//*  46   99:aload_0         
	//*  47  100:getfield        #50  <Field boolean isQuitting>
	//*  48  103:ifeq            12
	//*  49  106:return          
	//*  50  107:astore_2        
	//*  51  108:aload_1         
	//*  52  109:monitorexit     
	//*  53  110:aload_2         
	//*  54  111:athrow          
			if(emptyTransactionListener != null)
	//*  55  112:aload_0         
	//*  56  113:getfield        #172 <Field Runnable emptyTransactionListener>
	//*  57  116:ifnull          92
				emptyTransactionListener.run();
	//   58  119:aload_0         
	//   59  120:getfield        #172 <Field Runnable emptyTransactionListener>
	//   60  123:invokeinterface #175 <Method void Runnable.run()>
			try
			{
				Thread.sleep(modelSaveCheckTime);
			}
	//*  61  128:goto            92
			catch(InterruptedException interruptedexception)
	//*  62  131:astore_1        
			{
				FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.I, "DBRequestQueue Batch interrupted to start saving");
	//   63  132:getstatic       #180 <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.I>
	//   64  135:ldc1            #182 <String "DBRequestQueue Batch interrupted to start saving">
	//   65  137:invokestatic    #188 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
			}
		} while(!isQuitting);
		return;
		exception;
		arraylist;
		JVM INSTR monitorexit ;
		throw exception;
	//*  66  140:goto            99
	}

	public void setEmptyTransactionListener(Runnable runnable)
	{
		emptyTransactionListener = runnable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #172 <Field Runnable emptyTransactionListener>
	//    3    5:return          
	}

	public void setErrorListener(com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error error)
	{
		errorListener = error;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #79  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error errorListener>
	//    3    5:return          
	}

	public void setModelSaveCheckTime(long l)
	{
		modelSaveCheckTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #48  <Field long modelSaveCheckTime>
	//    3    5:return          
	}

	public void setModelSaveSize(int i)
	{
		modelSaveSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field int modelSaveSize>
	//    3    5:return          
	}

	public void setSuccessListener(com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success success)
	{
		successListener = success;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success successListener>
	//    3    5:return          
	}

	private static final int MODEL_SAVE_SIZE = 50;
	private static final int sMODEL_SAVE_CHECK_TIME = 30000;
	private DatabaseDefinition databaseDefinition;
	private Runnable emptyTransactionListener;
	private final com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error errorCallback = new com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error() {

		public void onError(Transaction transaction, Throwable throwable)
		{
			if(errorListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field DBBatchSaveQueue this$0>
		//*   2    4:invokestatic    #24  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error DBBatchSaveQueue.access$100(DBBatchSaveQueue)>
		//*   3    7:ifnull          24
				errorListener.onError(transaction, throwable);
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field DBBatchSaveQueue this$0>
		//    6   14:invokestatic    #24  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error DBBatchSaveQueue.access$100(DBBatchSaveQueue)>
		//    7   17:aload_1         
		//    8   18:aload_2         
		//    9   19:invokeinterface #26  <Method void com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error.onError(Transaction, Throwable)>
		//   10   24:return          
		}

		final DBBatchSaveQueue this$0;

			
			{
				this$0 = DBBatchSaveQueue.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field DBBatchSaveQueue this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error errorListener;
	private boolean isQuitting;
	private long modelSaveCheckTime;
	private int modelSaveSize;
	private final com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel modelSaver = new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel() {

		public void processModel(Object obj)
		{
			if(obj instanceof Model)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #22  <Class Model>
		//*   2    4:ifeq            17
				((Model)obj).save();
		//    3    7:aload_1         
		//    4    8:checkcast       #22  <Class Model>
		//    5   11:invokeinterface #25  <Method void Model.save()>
			else
		//*   6   16:return          
			if(obj != null)
		//*   7   17:aload_1         
		//*   8   18:ifnull          16
			{
				FlowManager.getModelAdapter(obj.getClass()).save(obj);
		//    9   21:aload_1         
		//   10   22:invokevirtual   #29  <Method Class Object.getClass()>
		//   11   25:invokestatic    #35  <Method ModelAdapter FlowManager.getModelAdapter(Class)>
		//   12   28:aload_1         
		//   13   29:invokevirtual   #39  <Method void ModelAdapter.save(Object)>
				return;
		//   14   32:return          
			}
		}

		final DBBatchSaveQueue this$0;

			
			{
				this$0 = DBBatchSaveQueue.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field DBBatchSaveQueue this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final ArrayList models = new ArrayList();
	private final com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success successCallback = new com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success() {

		public void onSuccess(Transaction transaction)
		{
			if(successListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field DBBatchSaveQueue this$0>
		//*   2    4:invokestatic    #24  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success DBBatchSaveQueue.access$000(DBBatchSaveQueue)>
		//*   3    7:ifnull          23
				successListener.onSuccess(transaction);
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field DBBatchSaveQueue this$0>
		//    6   14:invokestatic    #24  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success DBBatchSaveQueue.access$000(DBBatchSaveQueue)>
		//    7   17:aload_1         
		//    8   18:invokeinterface #26  <Method void com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success.onSuccess(Transaction)>
		//    9   23:return          
		}

		final DBBatchSaveQueue this$0;

			
			{
				this$0 = DBBatchSaveQueue.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field DBBatchSaveQueue this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success successListener;


/*
	static com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success access$000(DBBatchSaveQueue dbbatchsavequeue)
	{
		return dbbatchsavequeue.successListener;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success successListener>
	//    2    4:areturn         
	}

*/


/*
	static com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error access$100(DBBatchSaveQueue dbbatchsavequeue)
	{
		return dbbatchsavequeue.errorListener;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error errorListener>
	//    2    4:areturn         
	}

*/
}
