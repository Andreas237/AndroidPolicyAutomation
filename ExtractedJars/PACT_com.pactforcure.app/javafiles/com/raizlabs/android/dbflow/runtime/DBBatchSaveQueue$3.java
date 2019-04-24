// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.runtime;

import com.raizlabs.android.dbflow.structure.database.transaction.Transaction;

// Referenced classes of package com.raizlabs.android.dbflow.runtime:
//			DBBatchSaveQueue

class DBBatchSaveQueue$3
	implements com.raizlabs.android.dbflow.structure.database.transaction.Transaction.Error
{

	public void onError(Transaction transaction, Throwable throwable)
	{
		if(DBBatchSaveQueue.access$100(DBBatchSaveQueue.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field DBBatchSaveQueue this$0>
	//*   2    4:invokestatic    #24  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error DBBatchSaveQueue.access$100(DBBatchSaveQueue)>
	//*   3    7:ifnull          24
			DBBatchSaveQueue.access$100(DBBatchSaveQueue.this).onError(transaction, throwable);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field DBBatchSaveQueue this$0>
	//    6   14:invokestatic    #24  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error DBBatchSaveQueue.access$100(DBBatchSaveQueue)>
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokeinterface #26  <Method void com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error.onError(Transaction, Throwable)>
	//   10   24:return          
	}

	final DBBatchSaveQueue this$0;

	DBBatchSaveQueue$3()
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
