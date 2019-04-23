// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
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
		androidx.work..Result result = (androidx.work..Result)val$future.get();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SettableFuture val$future>
	//    2    4:invokevirtual   #44  <Method Object SettableFuture.get()>
	//    3    7:checkcast       #46  <Class androidx.work.ListenableWorker$Result>
	//    4   10:astore_1        
		if(result != null)
			break MISSING_BLOCK_LABEL_53;
	//    5   11:aload_1         
	//    6   12:ifnonnull       53
		Logger.get().error(WorkerWrapper.access$000(), String.format("%s returned a null result. Treating it as a failure.", new Object[] {
			WorkerWrapper.access$100(WorkerWrapper.this).workerClassName
		}), new Throwable[0]);
	//    7   15:invokestatic    #51  <Method Logger Logger.get()>
	//    8   18:invokestatic    #55  <Method String WorkerWrapper.access$000()>
	//    9   21:ldc1            #57  <String "%s returned a null result. Treating it as a failure.">
	//   10   23:iconst_1        
	//   11   24:anewarray       Object[]
	//   12   27:dup             
	//   13   28:iconst_0        
	//   14   29:aload_0         
	//   15   30:getfield        #21  <Field WorkerWrapper this$0>
	//   16   33:invokestatic    #61  <Method WorkSpec WorkerWrapper.access$100(WorkerWrapper)>
	//   17   36:getfield        #66  <Field String WorkSpec.workerClassName>
	//   18   39:aastore         
	//   19   40:invokestatic    #72  <Method String String.format(String, Object[])>
	//   20   43:iconst_0        
	//   21   44:anewarray       Throwable[]
	//   22   47:invokevirtual   #78  <Method void Logger.error(String, String, Throwable[])>
		break MISSING_BLOCK_LABEL_61;
	//   23   50:goto            61
		mResult = result;
	//   24   53:aload_0         
	//   25   54:getfield        #21  <Field WorkerWrapper this$0>
	//   26   57:aload_1         
	//   27   58:putfield        #82  <Field androidx.work.ListenableWorker$Result WorkerWrapper.mResult>
_L2:
		onWorkFinished();
	//   28   61:aload_0         
	//   29   62:getfield        #21  <Field WorkerWrapper this$0>
	//   30   65:invokevirtual   #85  <Method void WorkerWrapper.onWorkFinished()>
		return;
	//   31   68:return          
		Object obj;
		obj;
	//   32   69:astore_1        
		break; /* Loop/switch isn't completed */
	//   33   70:goto            151
		obj;
	//   34   73:astore_1        
		break MISSING_BLOCK_LABEL_78;
	//   35   74:goto            78
		obj;
	//   36   77:astore_1        
		Logger.get().error(WorkerWrapper.access$000(), String.format("%s failed because it threw an exception/error", new Object[] {
			val$workDescription
		}), new Throwable[] {
			obj
		});
	//   37   78:invokestatic    #51  <Method Logger Logger.get()>
	//   38   81:invokestatic    #55  <Method String WorkerWrapper.access$000()>
	//   39   84:ldc1            #87  <String "%s failed because it threw an exception/error">
	//   40   86:iconst_1        
	//   41   87:anewarray       Object[]
	//   42   90:dup             
	//   43   91:iconst_0        
	//   44   92:aload_0         
	//   45   93:getfield        #25  <Field String val$workDescription>
	//   46   96:aastore         
	//   47   97:invokestatic    #72  <Method String String.format(String, Object[])>
	//   48  100:iconst_1        
	//   49  101:anewarray       Throwable[]
	//   50  104:dup             
	//   51  105:iconst_0        
	//   52  106:aload_1         
	//   53  107:aastore         
	//   54  108:invokevirtual   #78  <Method void Logger.error(String, String, Throwable[])>
		continue; /* Loop/switch isn't completed */
	//   55  111:goto            61
		obj;
	//   56  114:astore_1        
		Logger.get().info(WorkerWrapper.access$000(), String.format("%s was cancelled", new Object[] {
			val$workDescription
		}), new Throwable[] {
			obj
		});
	//   57  115:invokestatic    #51  <Method Logger Logger.get()>
	//   58  118:invokestatic    #55  <Method String WorkerWrapper.access$000()>
	//   59  121:ldc1            #89  <String "%s was cancelled">
	//   60  123:iconst_1        
	//   61  124:anewarray       Object[]
	//   62  127:dup             
	//   63  128:iconst_0        
	//   64  129:aload_0         
	//   65  130:getfield        #25  <Field String val$workDescription>
	//   66  133:aastore         
	//   67  134:invokestatic    #72  <Method String String.format(String, Object[])>
	//   68  137:iconst_1        
	//   69  138:anewarray       Throwable[]
	//   70  141:dup             
	//   71  142:iconst_0        
	//   72  143:aload_1         
	//   73  144:aastore         
	//   74  145:invokevirtual   #92  <Method void Logger.info(String, String, Throwable[])>
		if(true) goto _L2; else goto _L1
	//   75  148:goto            61
_L1:
		onWorkFinished();
	//   76  151:aload_0         
	//   77  152:getfield        #21  <Field WorkerWrapper this$0>
	//   78  155:invokevirtual   #85  <Method void WorkerWrapper.onWorkFinished()>
		throw obj;
	//   79  158:aload_1         
	//   80  159:athrow          
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
