// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql;

import com.raizlabs.android.dbflow.structure.database.transaction.Transaction;

// Referenced classes of package com.raizlabs.android.dbflow.sql:
//			BaseAsyncObject

class BaseAsyncObject$1
	implements com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error
{

	public void onError(Transaction transaction, Throwable throwable)
	{
		if(BaseAsyncObject.access$000(BaseAsyncObject.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field BaseAsyncObject this$0>
	//*   2    4:invokestatic    #24  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error BaseAsyncObject.access$000(BaseAsyncObject)>
	//*   3    7:ifnull          24
			BaseAsyncObject.access$000(BaseAsyncObject.this).onError(transaction, throwable);
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
		BaseAsyncObject.access$102(BaseAsyncObject.this, ((Transaction) (null)));
	//   15   33:aload_0         
	//   16   34:getfield        #14  <Field BaseAsyncObject this$0>
	//   17   37:aconst_null     
	//   18   38:invokestatic    #31  <Method Transaction BaseAsyncObject.access$102(BaseAsyncObject, Transaction)>
	//   19   41:pop             
	//   20   42:return          
	}

	final BaseAsyncObject this$0;

	BaseAsyncObject$1()
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
