// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.list;

import com.raizlabs.android.dbflow.structure.ModelAdapter;

// Referenced classes of package com.raizlabs.android.dbflow.list:
//			FlowQueryList

class FlowQueryList$1
	implements com.raizlabs.android.dbflow.structure.database.transaction.saction.ProcessModel
{

	public void processModel(Object obj)
	{
		getModelAdapter().save(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FlowQueryList this$0>
	//    2    4:invokevirtual   #25  <Method ModelAdapter FlowQueryList.getModelAdapter()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #30  <Method void ModelAdapter.save(Object)>
	//    5   11:return          
	}

	final FlowQueryList this$0;

	FlowQueryList$1()
	{
		this$0 = FlowQueryList.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field FlowQueryList this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
