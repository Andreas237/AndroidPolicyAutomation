// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;


// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			ProcessModelTransaction

class ProcessModelTransaction$1
	implements Runnable
{

	public void run()
	{
		processListener.onModelProcessed(val$finalI, val$size, val$model);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ProcessModelTransaction this$0>
	//    2    4:getfield        #37  <Field ProcessModelTransaction$OnModelProcessListener ProcessModelTransaction.processListener>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field int val$finalI>
	//    5   11:i2l             
	//    6   12:aload_0         
	//    7   13:getfield        #26  <Field int val$size>
	//    8   16:i2l             
	//    9   17:aload_0         
	//   10   18:getfield        #28  <Field Object val$model>
	//   11   21:invokeinterface #43  <Method void ProcessModelTransaction$OnModelProcessListener.onModelProcessed(long, long, Object)>
	//   12   26:return          
	}

	final ProcessModelTransaction this$0;
	final int val$finalI;
	final Object val$model;
	final int val$size;

	ProcessModelTransaction$1()
	{
		this$0 = final_processmodeltransaction;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field ProcessModelTransaction this$0>
		val$finalI = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #24  <Field int val$finalI>
		val$size = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #26  <Field int val$size>
		val$model = Object.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field Object val$model>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
