// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;


// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			Transaction

class Transaction$2
	implements Runnable
{

	public void run()
	{
		errorCallback.onError(Transaction.this, val$throwable);
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

	Transaction$2()
	{
		this$0 = final_transaction;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Transaction this$0>
		val$throwable = Throwable.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Throwable val$throwable>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
