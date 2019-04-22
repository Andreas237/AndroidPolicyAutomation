// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import androidx.work.impl.utils.futures.SettableFuture;

// Referenced classes of package androidx.work:
//			Worker

class Worker$1
	implements Runnable
{

	public void run()
	{
		eWorker.Result result = doWork();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Worker this$0>
	//    2    4:invokevirtual   #26  <Method ListenableWorker$Result Worker.doWork()>
	//    3    7:astore_1        
		mFuture.set(((Object) (new eWorker.Payload(result, getOutputData()))));
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field Worker this$0>
	//    6   12:getfield        #30  <Field SettableFuture Worker.mFuture>
	//    7   15:new             #32  <Class ListenableWorker$Payload>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field Worker this$0>
	//   12   24:invokevirtual   #36  <Method Data Worker.getOutputData()>
	//   13   27:invokespecial   #39  <Method void ListenableWorker$Payload(ListenableWorker$Result, Data)>
	//   14   30:invokevirtual   #45  <Method boolean SettableFuture.set(Object)>
	//   15   33:pop             
	//   16   34:return          
	}

	final Worker this$0;

	Worker$1()
	{
		this$0 = Worker.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Worker this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
