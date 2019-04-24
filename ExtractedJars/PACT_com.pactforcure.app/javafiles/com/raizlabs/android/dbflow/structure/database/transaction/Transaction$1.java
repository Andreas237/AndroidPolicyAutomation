// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;


// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			Transaction

class Transaction$1
	implements Runnable
{

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

	Transaction$1()
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
