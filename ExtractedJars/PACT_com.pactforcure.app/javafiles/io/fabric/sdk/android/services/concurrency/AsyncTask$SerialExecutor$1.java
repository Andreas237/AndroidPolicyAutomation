// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;


// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//			AsyncTask

class AsyncTask$SerialExecutor$1
	implements Runnable
{

	public void run()
	{
		val$r.run();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Runnable val$r>
	//    2    4:invokeinterface #31  <Method void Runnable.run()>
		scheduleNext();
	//    3    9:aload_0         
	//    4   10:getfield        #22  <Field AsyncTask$SerialExecutor this$0>
	//    5   13:invokevirtual   #34  <Method void AsyncTask$SerialExecutor.scheduleNext()>
		return;
	//    6   16:return          
		Exception exception;
		exception;
	//    7   17:astore_1        
		scheduleNext();
	//    8   18:aload_0         
	//    9   19:getfield        #22  <Field AsyncTask$SerialExecutor this$0>
	//   10   22:invokevirtual   #34  <Method void AsyncTask$SerialExecutor.scheduleNext()>
		throw exception;
	//   11   25:aload_1         
	//   12   26:athrow          
	}

	final AsyncTask.SerialExecutor this$0;
	final Runnable val$r;

	AsyncTask$SerialExecutor$1()
	{
		this$0 = final_serialexecutor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AsyncTask$SerialExecutor this$0>
		val$r = Runnable.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Runnable val$r>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
