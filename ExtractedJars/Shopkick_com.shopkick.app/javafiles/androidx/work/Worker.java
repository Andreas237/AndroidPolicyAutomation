// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// Referenced classes of package androidx.work:
//			ListenableWorker, WorkerParameters

public abstract class Worker extends ListenableWorker
{

	public Worker(Context context, WorkerParameters workerparameters)
	{
		super(context, workerparameters);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void ListenableWorker(Context, WorkerParameters)>
	//    4    6:return          
	}

	public abstract ListenableWorker.Result doWork();

	public final ListenableFuture startWork()
	{
		mFuture = SettableFuture.create();
	//    0    0:aload_0         
	//    1    1:invokestatic    #32  <Method SettableFuture SettableFuture.create()>
	//    2    4:putfield        #34  <Field SettableFuture mFuture>
		getBackgroundExecutor().execute(new Runnable() {

			public void run()
			{
				ListenableWorker.Result result = doWork();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field Worker this$0>
			//    2    4:invokevirtual   #26  <Method ListenableWorker$Result Worker.doWork()>
			//    3    7:astore_1        
				mFuture.set(((Object) (result)));
			//    4    8:aload_0         
			//    5    9:getfield        #17  <Field Worker this$0>
			//    6   12:getfield        #30  <Field SettableFuture Worker.mFuture>
			//    7   15:aload_1         
			//    8   16:invokevirtual   #36  <Method boolean SettableFuture.set(Object)>
			//    9   19:pop             
			//   10   20:return          
			}

			final Worker this$0;

			
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
);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #38  <Method Executor getBackgroundExecutor()>
	//    5   11:new             #6   <Class Worker$1>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #41  <Method void Worker$1(Worker)>
	//    9   19:invokeinterface #47  <Method void Executor.execute(Runnable)>
		return ((ListenableFuture) (mFuture));
	//   10   24:aload_0         
	//   11   25:getfield        #34  <Field SettableFuture mFuture>
	//   12   28:areturn         
	}

	SettableFuture mFuture;
}
