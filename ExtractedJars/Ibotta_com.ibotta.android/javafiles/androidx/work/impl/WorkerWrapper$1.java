// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.SettableFuture;

// Referenced classes of package androidx.work.impl:
//			WorkerWrapper

class WorkerWrapper$1
	implements Runnable
{

	public void run()
	{
		try
		{
			mInnerFuture = mWorker.onStartWork();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field WorkerWrapper this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field WorkerWrapper this$0>
	//    4    8:getfield        #31  <Field ListenableWorker WorkerWrapper.mWorker>
	//    5   11:invokevirtual   #37  <Method com.google.common.util.concurrent.ListenableFuture ListenableWorker.onStartWork()>
	//    6   14:putfield        #41  <Field com.google.common.util.concurrent.ListenableFuture WorkerWrapper.mInnerFuture>
			val$future.setFuture(mInnerFuture);
	//    7   17:aload_0         
	//    8   18:getfield        #21  <Field SettableFuture val$future>
	//    9   21:aload_0         
	//   10   22:getfield        #19  <Field WorkerWrapper this$0>
	//   11   25:getfield        #41  <Field com.google.common.util.concurrent.ListenableFuture WorkerWrapper.mInnerFuture>
	//   12   28:invokevirtual   #47  <Method boolean SettableFuture.setFuture(com.google.common.util.concurrent.ListenableFuture)>
	//   13   31:pop             
			return;
	//   14   32:return          
		}
		catch(Throwable throwable)
	//*  15   33:astore_1        
		{
			val$future.setException(throwable);
	//   16   34:aload_0         
	//   17   35:getfield        #21  <Field SettableFuture val$future>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #51  <Method boolean SettableFuture.setException(Throwable)>
	//   20   42:pop             
		}
	//   21   43:return          
	}

	final WorkerWrapper this$0;
	final SettableFuture val$future;

	WorkerWrapper$1()
	{
		this$0 = final_workerwrapper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field WorkerWrapper this$0>
		val$future = SettableFuture.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field SettableFuture val$future>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
