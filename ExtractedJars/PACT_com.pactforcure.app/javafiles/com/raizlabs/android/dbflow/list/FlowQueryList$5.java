// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.list;

import com.raizlabs.android.dbflow.structure.database.transaction.Transaction;

// Referenced classes of package com.raizlabs.android.dbflow.list:
//			FlowQueryList

class FlowQueryList$5
	implements com.raizlabs.android.dbflow.structure.database.transaction.ess
{

	public void onSuccess(Transaction transaction)
	{
		if(!FlowQueryList.access$1200(FlowQueryList.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field FlowQueryList this$0>
	//*   2    4:invokestatic    #24  <Method boolean FlowQueryList.access$1200(FlowQueryList)>
	//*   3    7:ifne            41
			refreshAsync();
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field FlowQueryList this$0>
	//    6   14:invokevirtual   #27  <Method void FlowQueryList.refreshAsync()>
		else
	//*   7   17:aload_0         
	//*   8   18:getfield        #14  <Field FlowQueryList this$0>
	//*   9   21:invokestatic    #31  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success FlowQueryList.access$1400(FlowQueryList)>
	//*  10   24:ifnull          40
	//*  11   27:aload_0         
	//*  12   28:getfield        #14  <Field FlowQueryList this$0>
	//*  13   31:invokestatic    #31  <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success FlowQueryList.access$1400(FlowQueryList)>
	//*  14   34:aload_1         
	//*  15   35:invokeinterface #33  <Method void com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Success.onSuccess(Transaction)>
	//*  16   40:return          
			FlowQueryList.access$1302(FlowQueryList.this, true);
	//   17   41:aload_0         
	//   18   42:getfield        #14  <Field FlowQueryList this$0>
	//   19   45:iconst_1        
	//   20   46:invokestatic    #37  <Method boolean FlowQueryList.access$1302(FlowQueryList, boolean)>
	//   21   49:pop             
		if(FlowQueryList.access$1400(FlowQueryList.this) != null)
			FlowQueryList.access$1400(FlowQueryList.this).onSuccess(transaction);
	//*  22   50:goto            17
	}

	final FlowQueryList this$0;

	FlowQueryList$5()
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
