// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import android.os.Handler;
import android.os.Looper;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.FlowLog;
import com.raizlabs.android.dbflow.runtime.BaseTransactionManager;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			ITransaction

public final class Transaction
{
	public static final class Builder
	{

		public Transaction build()
		{
			return new Transaction(this);
		//    0    0:new             #6   <Class Transaction>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #43  <Method void Transaction(Transaction$Builder)>
		//    4    8:areturn         
		}

		public Builder error(Error error1)
		{
			errorCallback = error1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #47  <Field Transaction$Error errorCallback>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder name(String s)
		{
			name = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #50  <Field String name>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder runCallbacksOnSameThread(boolean flag)
		{
			runCallbacksOnSameThread = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #38  <Field boolean runCallbacksOnSameThread>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder shouldRunInTransaction(boolean flag)
		{
			shouldRunInTransaction = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #28  <Field boolean shouldRunInTransaction>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder success(Success success1)
		{
			successCallback = success1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #55  <Field Transaction$Success successCallback>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		final DatabaseDefinition databaseDefinition;
		Error errorCallback;
		String name;
		private boolean runCallbacksOnSameThread;
		boolean shouldRunInTransaction;
		Success successCallback;
		final ITransaction transaction;


/*
		static boolean access$000(Builder builder)
		{
			return builder.runCallbacksOnSameThread;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field boolean runCallbacksOnSameThread>
		//    2    4:ireturn         
		}

*/

		public Builder(ITransaction itransaction, DatabaseDefinition databasedefinition)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			shouldRunInTransaction = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #28  <Field boolean shouldRunInTransaction>
			transaction = itransaction;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #30  <Field ITransaction transaction>
			databaseDefinition = databasedefinition;
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:putfield        #32  <Field DatabaseDefinition databaseDefinition>
		//   11   19:return          
		}
	}

	public static interface Error
	{

		public abstract void onError(Transaction transaction1, Throwable throwable);
	}

	public static interface Success
	{

		public abstract void onSuccess(Transaction transaction1);
	}


	Transaction(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		databaseDefinition = builder.databaseDefinition;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #39  <Field DatabaseDefinition Transaction$Builder.databaseDefinition>
	//    5    9:putfield        #40  <Field DatabaseDefinition databaseDefinition>
		errorCallback = builder.errorCallback;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #42  <Field Transaction$Error Transaction$Builder.errorCallback>
	//    9   17:putfield        #43  <Field Transaction$Error errorCallback>
		successCallback = builder.successCallback;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #45  <Field Transaction$Success Transaction$Builder.successCallback>
	//   13   25:putfield        #46  <Field Transaction$Success successCallback>
		transaction = builder.transaction;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #48  <Field ITransaction Transaction$Builder.transaction>
	//   17   33:putfield        #49  <Field ITransaction transaction>
		name = builder.name;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #51  <Field String Transaction$Builder.name>
	//   21   41:putfield        #52  <Field String name>
		shouldRunInTransaction = builder.shouldRunInTransaction;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #54  <Field boolean Transaction$Builder.shouldRunInTransaction>
	//   25   49:putfield        #55  <Field boolean shouldRunInTransaction>
		runCallbacksOnSameThread = builder.runCallbacksOnSameThread;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokestatic    #59  <Method boolean Transaction$Builder.access$000(Transaction$Builder)>
	//   29   57:putfield        #61  <Field boolean runCallbacksOnSameThread>
	//   30   60:return          
	}

	static Handler getTransactionHandler()
	{
		if(TRANSACTION_HANDLER == null)
	//*   0    0:getstatic       #66  <Field Handler TRANSACTION_HANDLER>
	//*   1    3:ifnonnull       19
			TRANSACTION_HANDLER = new Handler(Looper.getMainLooper());
	//    2    6:new             #68  <Class Handler>
	//    3    9:dup             
	//    4   10:invokestatic    #74  <Method Looper Looper.getMainLooper()>
	//    5   13:invokespecial   #77  <Method void Handler(Looper)>
	//    6   16:putstatic       #66  <Field Handler TRANSACTION_HANDLER>
		return TRANSACTION_HANDLER;
	//    7   19:getstatic       #66  <Field Handler TRANSACTION_HANDLER>
	//    8   22:areturn         
	}

	public void cancel()
	{
		databaseDefinition.getTransactionManager().cancelTransaction(this);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field DatabaseDefinition databaseDefinition>
	//    2    4:invokevirtual   #84  <Method BaseTransactionManager DatabaseDefinition.getTransactionManager()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #90  <Method void BaseTransactionManager.cancelTransaction(Transaction)>
	//    5   11:return          
	}

	public Error error()
	{
		return errorCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Transaction$Error errorCallback>
	//    2    4:areturn         
	}

	public void execute()
	{
		databaseDefinition.getTransactionManager().addTransaction(this);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field DatabaseDefinition databaseDefinition>
	//    2    4:invokevirtual   #84  <Method BaseTransactionManager DatabaseDefinition.getTransactionManager()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #96  <Method void BaseTransactionManager.addTransaction(Transaction)>
	//    5   11:return          
	}

	public void executeSync()
	{
		if(!shouldRunInTransaction)
			break MISSING_BLOCK_LABEL_43;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field boolean shouldRunInTransaction>
	//    2    4:ifeq            43
		databaseDefinition.executeTransaction(transaction);
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field DatabaseDefinition databaseDefinition>
	//    5   11:aload_0         
	//    6   12:getfield        #49  <Field ITransaction transaction>
	//    7   15:invokevirtual   #103 <Method void DatabaseDefinition.executeTransaction(ITransaction)>
_L1:
		if(successCallback == null)
			break MISSING_BLOCK_LABEL_137;
	//    8   18:aload_0         
	//    9   19:getfield        #46  <Field Transaction$Success successCallback>
	//   10   22:ifnull          137
		if(runCallbacksOnSameThread)
	//*  11   25:aload_0         
	//*  12   26:getfield        #61  <Field boolean runCallbacksOnSameThread>
	//*  13   29:ifeq            93
		{
			successCallback.onSuccess(this);
	//   14   32:aload_0         
	//   15   33:getfield        #46  <Field Transaction$Success successCallback>
	//   16   36:aload_0         
	//   17   37:invokeinterface #106 <Method void Transaction$Success.onSuccess(Transaction)>
			return;
	//   18   42:return          
		}
		break MISSING_BLOCK_LABEL_93;
		try
		{
			transaction.execute(databaseDefinition.getWritableDatabase());
	//   19   43:aload_0         
	//   20   44:getfield        #49  <Field ITransaction transaction>
	//   21   47:aload_0         
	//   22   48:getfield        #40  <Field DatabaseDefinition databaseDefinition>
	//   23   51:invokevirtual   #110 <Method com.raizlabs.android.dbflow.structure.database.DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//   24   54:invokeinterface #115 <Method void ITransaction.execute(com.raizlabs.android.dbflow.structure.database.DatabaseWrapper)>
		}
	//*  25   59:goto            18
		catch(final Throwable throwable)
	//*  26   62:astore_1        
		{
			FlowLog.logError(throwable);
	//   27   63:aload_1         
	//   28   64:invokestatic    #121 <Method void FlowLog.logError(Throwable)>
			if(errorCallback != null)
	//*  29   67:aload_0         
	//*  30   68:getfield        #43  <Field Transaction$Error errorCallback>
	//*  31   71:ifnull          126
			{
				if(runCallbacksOnSameThread)
	//*  32   74:aload_0         
	//*  33   75:getfield        #61  <Field boolean runCallbacksOnSameThread>
	//*  34   78:ifeq            109
				{
					errorCallback.onError(this, throwable);
	//   35   81:aload_0         
	//   36   82:getfield        #43  <Field Transaction$Error errorCallback>
	//   37   85:aload_0         
	//   38   86:aload_1         
	//   39   87:invokeinterface #125 <Method void Transaction$Error.onError(Transaction, Throwable)>
					return;
	//   40   92:return          
				} else
	//*  41   93:invokestatic    #127 <Method Handler getTransactionHandler()>
	//*  42   96:new             #6   <Class Transaction$1>
	//*  43   99:dup             
	//*  44  100:aload_0         
	//*  45  101:invokespecial   #129 <Method void Transaction$1(Transaction)>
	//*  46  104:invokevirtual   #133 <Method boolean Handler.post(Runnable)>
	//*  47  107:pop             
	//*  48  108:return          
				{
					getTransactionHandler().post(new Runnable() {

						public void run()
						{
							errorCallback.onError(Transaction.this, throwable);
						//    0    0:aload_0         
						//    1    1:getfield        #19  <Field Transaction this$0>
						//    2    4:getfield        #29  <Field Transaction$Error Transaction.errorCallback>
						//    3    7:aload_0         
						//    4    8:getfield        #19  <Field Transaction this$0>
						//    5   11:aload_0         
						//    6   12:getfield        #21  <Field Throwable val$throwable>
						//    7   15:invokeinterface #34  <Method void Transaction$Error.onError(Transaction, Throwable)>
						//    8   20:return          
						}

						final Transaction this$0;
						final Throwable val$throwable;

			
			{
				this$0 = Transaction.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Transaction this$0>
				throwable = throwable1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Throwable val$throwable>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
					}
);
	//   49  109:invokestatic    #127 <Method Handler getTransactionHandler()>
	//   50  112:new             #8   <Class Transaction$2>
	//   51  115:dup             
	//   52  116:aload_0         
	//   53  117:aload_1         
	//   54  118:invokespecial   #135 <Method void Transaction$2(Transaction, Throwable)>
	//   55  121:invokevirtual   #133 <Method boolean Handler.post(Runnable)>
	//   56  124:pop             
					return;
	//   57  125:return          
				}
			} else
			{
				throw new RuntimeException("An exception occurred while executing a transaction", throwable);
	//   58  126:new             #137 <Class RuntimeException>
	//   59  129:dup             
	//   60  130:ldc1            #139 <String "An exception occurred while executing a transaction">
	//   61  132:aload_1         
	//   62  133:invokespecial   #142 <Method void RuntimeException(String, Throwable)>
	//   63  136:athrow          
			}
		}
		  goto _L1
		getTransactionHandler().post(new Runnable() {

			public void run()
			{
				successCallback.onSuccess(Transaction.this);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field Transaction this$0>
			//    2    4:getfield        #25  <Field Transaction$Success Transaction.successCallback>
			//    3    7:aload_0         
			//    4    8:getfield        #17  <Field Transaction this$0>
			//    5   11:invokeinterface #30  <Method void Transaction$Success.onSuccess(Transaction)>
			//    6   16:return          
			}

			final Transaction this$0;

			
			{
				this$0 = Transaction.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Transaction this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
		return;
	//   64  137:return          
	}

	public String name()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String name>
	//    2    4:areturn         
	}

	public Builder newBuilder()
	{
		return (new Builder(transaction, databaseDefinition)).error(errorCallback).success(successCallback).name(name).shouldRunInTransaction(shouldRunInTransaction).runCallbacksOnSameThread(runCallbacksOnSameThread);
	//    0    0:new             #10  <Class Transaction$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field ITransaction transaction>
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field DatabaseDefinition databaseDefinition>
	//    6   12:invokespecial   #148 <Method void Transaction$Builder(ITransaction, DatabaseDefinition)>
	//    7   15:aload_0         
	//    8   16:getfield        #43  <Field Transaction$Error errorCallback>
	//    9   19:invokevirtual   #151 <Method Transaction$Builder Transaction$Builder.error(Transaction$Error)>
	//   10   22:aload_0         
	//   11   23:getfield        #46  <Field Transaction$Success successCallback>
	//   12   26:invokevirtual   #155 <Method Transaction$Builder Transaction$Builder.success(Transaction$Success)>
	//   13   29:aload_0         
	//   14   30:getfield        #52  <Field String name>
	//   15   33:invokevirtual   #158 <Method Transaction$Builder Transaction$Builder.name(String)>
	//   16   36:aload_0         
	//   17   37:getfield        #55  <Field boolean shouldRunInTransaction>
	//   18   40:invokevirtual   #161 <Method Transaction$Builder Transaction$Builder.shouldRunInTransaction(boolean)>
	//   19   43:aload_0         
	//   20   44:getfield        #61  <Field boolean runCallbacksOnSameThread>
	//   21   47:invokevirtual   #163 <Method Transaction$Builder Transaction$Builder.runCallbacksOnSameThread(boolean)>
	//   22   50:areturn         
	}

	public Success success()
	{
		return successCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Transaction$Success successCallback>
	//    2    4:areturn         
	}

	public ITransaction transaction()
	{
		return transaction;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ITransaction transaction>
	//    2    4:areturn         
	}

	private static Handler TRANSACTION_HANDLER;
	final DatabaseDefinition databaseDefinition;
	final Error errorCallback;
	final String name;
	final boolean runCallbacksOnSameThread;
	final boolean shouldRunInTransaction;
	final Success successCallback;
	final ITransaction transaction;
}
