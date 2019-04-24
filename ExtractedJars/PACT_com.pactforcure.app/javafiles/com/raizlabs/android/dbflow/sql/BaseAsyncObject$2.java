// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql;

import com.raizlabs.android.dbflow.structure.database.transaction.Transaction;

// Referenced classes of package com.raizlabs.android.dbflow.sql:
//			BaseAsyncObject

class BaseAsyncObject$2
	implements com.raizlabs.android.dbflow.structure.database.transaction.s
{

	public void onSuccess(Transaction transaction)
	{
		if(BaseAsyncObject.access$200(BaseAsyncObject.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field BaseAsyncObject this$0>
	//*   2    4:invokestatic    #24  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success BaseAsyncObject.access$200(BaseAsyncObject)>
	//*   3    7:ifnull          23
			BaseAsyncObject.access$200(BaseAsyncObject.this).onSuccess(transaction);
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
		BaseAsyncObject.access$102(BaseAsyncObject.this, ((Transaction) (null)));
	//   13   31:aload_0         
	//   14   32:getfield        #14  <Field BaseAsyncObject this$0>
	//   15   35:aconst_null     
	//   16   36:invokestatic    #31  <Method Transaction BaseAsyncObject.access$102(BaseAsyncObject, Transaction)>
	//   17   39:pop             
	//   18   40:return          
	}

	final BaseAsyncObject this$0;

	BaseAsyncObject$2()
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
