// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.list;

import com.raizlabs.android.dbflow.structure.database.transaction.Transaction;

// Referenced classes of package com.raizlabs.android.dbflow.list:
//			FlowQueryList

class FlowQueryList$4
	implements com.raizlabs.android.dbflow.structure.database.transaction.r
{

	public void onError(Transaction transaction, Throwable throwable)
	{
		if(FlowQueryList.access$1100(FlowQueryList.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field FlowQueryList this$0>
	//*   2    4:invokestatic    #24  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error FlowQueryList.access$1100(FlowQueryList)>
	//*   3    7:ifnull          24
			FlowQueryList.access$1100(FlowQueryList.this).onError(transaction, throwable);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field FlowQueryList this$0>
	//    6   14:invokestatic    #24  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error FlowQueryList.access$1100(FlowQueryList)>
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokeinterface #26  <Method void com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Error.onError(Transaction, Throwable)>
	//   10   24:return          
	}

	final FlowQueryList this$0;

	FlowQueryList$4()
	{
		this$0 = FlowQueryList.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field FlowQueryList this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
