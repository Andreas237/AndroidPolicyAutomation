// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.impl.utils.futures.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package androidx.work.impl:
//			WorkerWrapper

class WorkerWrapper$2
	implements Runnable
{

	public void run()
	{
		mPayload = (androidx.work..Payload)val$future.get();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field WorkerWrapper this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field SettableFuture val$future>
	//    4    8:invokevirtual   #41  <Method Object SettableFuture.get()>
	//    5   11:checkcast       #43  <Class androidx.work.ListenableWorker$Payload>
	//    6   14:putfield        #47  <Field androidx.work.ListenableWorker$Payload WorkerWrapper.mPayload>
_L2:
		onWorkFinished();
	//    7   17:aload_0         
	//    8   18:getfield        #21  <Field WorkerWrapper this$0>
	//    9   21:invokevirtual   #50  <Method void WorkerWrapper.onWorkFinished()>
		return;
	//   10   24:return          
		Object obj;
		obj;
	//   11   25:astore_1        
		break; /* Loop/switch isn't completed */
	//   12   26:goto            90
		obj;
	//   13   29:astore_1        
		break MISSING_BLOCK_LABEL_38;
	//   14   30:goto            38
		obj;
	//   15   33:astore_1        
		break MISSING_BLOCK_LABEL_38;
	//   16   34:goto            38
		obj;
	//   17   37:astore_1        
		Logger.error("WorkerWrapper", String.format("%s failed because it threw an exception/error", new Object[] {
			val$workDescription
		}), new Throwable[] {
			obj
		});
	//   18   38:ldc1            #52  <String "WorkerWrapper">
	//   19   40:ldc1            #54  <String "%s failed because it threw an exception/error">
	//   20   42:iconst_1        
	//   21   43:anewarray       Object[]
	//   22   46:dup             
	//   23   47:iconst_0        
	//   24   48:aload_0         
	//   25   49:getfield        #25  <Field String val$workDescription>
	//   26   52:aastore         
	//   27   53:invokestatic    #60  <Method String String.format(String, Object[])>
	//   28   56:iconst_1        
	//   29   57:anewarray       Throwable[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:aload_1         
	//   33   63:aastore         
	//   34   64:invokestatic    #68  <Method void Logger.error(String, String, Throwable[])>
		mPayload = new androidx.work..Payload(androidx.work..Result.FAILURE, Data.EMPTY);
	//   35   67:aload_0         
	//   36   68:getfield        #21  <Field WorkerWrapper this$0>
	//   37   71:new             #43  <Class androidx.work.ListenableWorker$Payload>
	//   38   74:dup             
	//   39   75:getstatic       #74  <Field androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.FAILURE>
	//   40   78:getstatic       #80  <Field Data Data.EMPTY>
	//   41   81:invokespecial   #83  <Method void androidx.work.ListenableWorker$Payload(androidx.work.ListenableWorker$Result, Data)>
	//   42   84:putfield        #47  <Field androidx.work.ListenableWorker$Payload WorkerWrapper.mPayload>
		if(true) goto _L2; else goto _L1
	//   43   87:goto            17
_L1:
		onWorkFinished();
	//   44   90:aload_0         
	//   45   91:getfield        #21  <Field WorkerWrapper this$0>
	//   46   94:invokevirtual   #50  <Method void WorkerWrapper.onWorkFinished()>
		throw obj;
	//   47   97:aload_1         
	//   48   98:athrow          
	}

	final WorkerWrapper this$0;
	final SettableFuture val$future;
	final String val$workDescription;

	WorkerWrapper$2()
	{
		this$0 = final_workerwrapper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field WorkerWrapper this$0>
		val$future = settablefuture;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field SettableFuture val$future>
		val$workDescription = String.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field String val$workDescription>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
