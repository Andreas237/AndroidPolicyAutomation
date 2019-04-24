// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql;

import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.structure.database.transaction.ITransaction;
import com.raizlabs.android.dbflow.structure.database.transaction.Transaction;

public class BaseAsyncObject
{

	public BaseAsyncObject(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #7   <Class BaseAsyncObject$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #27  <Method void BaseAsyncObject$1(BaseAsyncObject)>
	//    7   13:putfield        #29  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error error>
	//    8   16:aload_0         
	//    9   17:new             #9   <Class BaseAsyncObject$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #30  <Method void BaseAsyncObject$2(BaseAsyncObject)>
	//   13   25:putfield        #32  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success success>
		databaseDefinition = FlowManager.getDatabaseForTable(class1);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #38  <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//   17   33:putfield        #40  <Field DatabaseDefinition databaseDefinition>
	//   18   36:return          
	}

	public void cancel()
	{
		if(currentTransaction != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field Transaction currentTransaction>
	//*   2    4:ifnull          14
			currentTransaction.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field Transaction currentTransaction>
	//    5   11:invokevirtual   #60  <Method void Transaction.cancel()>
	//    6   14:return          
	}

	public Object error(com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error error1)
	{
		errorCallback = error1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error errorCallback>
		return ((Object) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	protected void executeTransaction(ITransaction itransaction)
	{
		cancel();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method void cancel()>
		currentTransaction = databaseDefinition.beginTransactionAsync(itransaction).error(error).success(success).build();
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field DatabaseDefinition databaseDefinition>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #71  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder DatabaseDefinition.beginTransactionAsync(ITransaction)>
	//    7   13:aload_0         
	//    8   14:getfield        #29  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error error>
	//    9   17:invokevirtual   #76  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.error(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error)>
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success success>
	//   12   24:invokevirtual   #79  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.success(com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success)>
	//   13   27:invokevirtual   #83  <Method Transaction com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.build()>
	//   14   30:putfield        #51  <Field Transaction currentTransaction>
		currentTransaction.execute();
	//   15   33:aload_0         
	//   16   34:getfield        #51  <Field Transaction currentTransaction>
	//   17   37:invokevirtual   #86  <Method void Transaction.execute()>
	//   18   40:return          
	}

	protected void onError(Transaction transaction, Throwable throwable)
	{
	//    0    0:return          
	}

	protected void onSuccess(Transaction transaction)
	{
	//    0    0:return          
	}

	public Object success(com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success success1)
	{
		successCallback = success1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success successCallback>
		return ((Object) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private Transaction currentTransaction;
	private final DatabaseDefinition databaseDefinition;
	private final com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error error = new com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error() {

		public void onError(Transaction transaction, Throwable throwable)
		{
			if(errorCallback != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field BaseAsyncObject this$0>
		//*   2    4:invokestatic    #24  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error BaseAsyncObject.access$000(BaseAsyncObject)>
		//*   3    7:ifnull          24
				errorCallback.onError(transaction, throwable);
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field BaseAsyncObject this$0>
		//    6   14:invokestatic    #24  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error BaseAsyncObject.access$000(BaseAsyncObject)>
		//    7   17:aload_1         
		//    8   18:aload_2         
		//    9   19:invokeinterface #26  <Method void com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error.onError(Transaction, Throwable)>
			BaseAsyncObject.this.onError(transaction, throwable);
		//   10   24:aload_0         
		//   11   25:getfield        #14  <Field BaseAsyncObject this$0>
		//   12   28:aload_1         
		//   13   29:aload_2         
		//   14   30:invokevirtual   #27  <Method void BaseAsyncObject.onError(Transaction, Throwable)>
			currentTransaction = null;
		//   15   33:aload_0         
		//   16   34:getfield        #14  <Field BaseAsyncObject this$0>
		//   17   37:aconst_null     
		//   18   38:invokestatic    #31  <Method Transaction BaseAsyncObject.access$102(BaseAsyncObject, Transaction)>
		//   19   41:pop             
		//   20   42:return          
		}

		final BaseAsyncObject this$0;

			
			{
				this$0 = BaseAsyncObject.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field BaseAsyncObject this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error errorCallback;
	private final com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success success = new com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success() {

		public void onSuccess(Transaction transaction)
		{
			if(successCallback != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field BaseAsyncObject this$0>
		//*   2    4:invokestatic    #24  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success BaseAsyncObject.access$200(BaseAsyncObject)>
		//*   3    7:ifnull          23
				successCallback.onSuccess(transaction);
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field BaseAsyncObject this$0>
		//    6   14:invokestatic    #24  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success BaseAsyncObject.access$200(BaseAsyncObject)>
		//    7   17:aload_1         
		//    8   18:invokeinterface #26  <Method void com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success.onSuccess(Transaction)>
			BaseAsyncObject.this.onSuccess(transaction);
		//    9   23:aload_0         
		//   10   24:getfield        #14  <Field BaseAsyncObject this$0>
		//   11   27:aload_1         
		//   12   28:invokevirtual   #27  <Method void BaseAsyncObject.onSuccess(Transaction)>
			currentTransaction = null;
		//   13   31:aload_0         
		//   14   32:getfield        #14  <Field BaseAsyncObject this$0>
		//   15   35:aconst_null     
		//   16   36:invokestatic    #31  <Method Transaction BaseAsyncObject.access$102(BaseAsyncObject, Transaction)>
		//   17   39:pop             
		//   18   40:return          
		}

		final BaseAsyncObject this$0;

			
			{
				this$0 = BaseAsyncObject.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field BaseAsyncObject this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success successCallback;


/*
	static com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error access$000(BaseAsyncObject baseasyncobject)
	{
		return baseasyncobject.errorCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error errorCallback>
	//    2    4:areturn         
	}

*/


/*
	static Transaction access$102(BaseAsyncObject baseasyncobject, Transaction transaction)
	{
		baseasyncobject.currentTransaction = transaction;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field Transaction currentTransaction>
		return transaction;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Success access$200(BaseAsyncObject baseasyncobject)
	{
		return baseasyncobject.successCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success successCallback>
	//    2    4:areturn         
	}

*/
}
