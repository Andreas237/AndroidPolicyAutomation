// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure;


// Referenced classes of package com.raizlabs.android.dbflow.structure:
//			AsyncModel, ModelAdapter

class AsyncModel$5
	implements com.raizlabs.android.dbflow.structure.database.transaction.ransaction.ProcessModel
{

	public void processModel(Object obj)
	{
		AsyncModel.access$000(AsyncModel.this).load(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field AsyncModel this$0>
	//    2    4:invokestatic    #27  <Method ModelAdapter AsyncModel.access$000(AsyncModel)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #31  <Method void ModelAdapter.load(Object)>
	//    5   11:return          
	}

	final AsyncModel this$0;

	AsyncModel$5()
	{
		this$0 = AsyncModel.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AsyncModel this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
