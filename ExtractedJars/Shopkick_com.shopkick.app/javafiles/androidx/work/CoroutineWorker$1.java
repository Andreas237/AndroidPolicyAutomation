// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import androidx.work.impl.utils.futures.SettableFuture;
import kotlinx.coroutines.Job;

// Referenced classes of package androidx.work:
//			CoroutineWorker

static final class CoroutineWorker$1
	implements Runnable
{

	public final void run()
	{
		if(getFuture$work_runtime_ktx_release().isCancelled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field CoroutineWorker this$0>
	//*   2    4:invokevirtual   #38  <Method SettableFuture CoroutineWorker.getFuture$work_runtime_ktx_release()>
	//*   3    7:invokevirtual   #44  <Method boolean SettableFuture.isCancelled()>
	//*   4   10:ifeq            25
			getJob$work_runtime_ktx_release().cancel();
	//    5   13:aload_0         
	//    6   14:getfield        #30  <Field CoroutineWorker this$0>
	//    7   17:invokevirtual   #48  <Method Job CoroutineWorker.getJob$work_runtime_ktx_release()>
	//    8   20:invokeinterface #53  <Method void Job.cancel()>
	//    9   25:return          
	}

	final CoroutineWorker this$0;

	CoroutineWorker$1(CoroutineWorker coroutineworker)
	{
		this$0 = coroutineworker;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field CoroutineWorker this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #33  <Method void Object()>
	//    5    9:return          
	}
}
