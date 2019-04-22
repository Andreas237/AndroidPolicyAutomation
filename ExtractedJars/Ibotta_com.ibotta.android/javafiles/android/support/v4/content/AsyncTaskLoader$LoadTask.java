// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.support.v4.os.OperationCanceledException;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package android.support.v4.content:
//			ModernAsyncTask, AsyncTaskLoader

final class AsyncTaskLoader$LoadTask extends ModernAsyncTask
	implements Runnable
{

	protected volatile Object doInBackground(Object aobj[])
	{
		return doInBackground((Void[])aobj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class Void[]>
	//    3    5:invokevirtual   #38  <Method Object doInBackground(Void[])>
	//    4    8:areturn         
	}

	protected transient Object doInBackground(Void avoid[])
	{
		try
		{
			avoid = ((Void []) (onLoadInBackground()));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AsyncTaskLoader this$0>
	//    2    4:invokevirtual   #44  <Method Object AsyncTaskLoader.onLoadInBackground()>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
		// Misplaced declaration of an exception variable
		catch(Void avoid[])
	//*   6   10:astore_1        
		{
			if(isCancelled())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #48  <Method boolean isCancelled()>
	//*   9   15:ifeq            20
				return ((Object) (null));
	//   10   18:aconst_null     
	//   11   19:areturn         
			else
				throw avoid;
	//   12   20:aload_1         
	//   13   21:athrow          
		}
		return ((Object) (avoid));
	}

	protected void onCancelled(Object obj)
	{
		dispatchOnCancelled(this, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AsyncTaskLoader this$0>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #56  <Method void AsyncTaskLoader.dispatchOnCancelled(AsyncTaskLoader$LoadTask, Object)>
		mDone.countDown();
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field CountDownLatch mDone>
	//    7   13:invokevirtual   #59  <Method void CountDownLatch.countDown()>
		return;
	//    8   16:return          
		obj;
	//    9   17:astore_1        
		mDone.countDown();
	//   10   18:aload_0         
	//   11   19:getfield        #30  <Field CountDownLatch mDone>
	//   12   22:invokevirtual   #59  <Method void CountDownLatch.countDown()>
		throw obj;
	//   13   25:aload_1         
	//   14   26:athrow          
	}

	protected void onPostExecute(Object obj)
	{
		dispatchOnLoadComplete(this, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AsyncTaskLoader this$0>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #64  <Method void AsyncTaskLoader.dispatchOnLoadComplete(AsyncTaskLoader$LoadTask, Object)>
		mDone.countDown();
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field CountDownLatch mDone>
	//    7   13:invokevirtual   #59  <Method void CountDownLatch.countDown()>
		return;
	//    8   16:return          
		obj;
	//    9   17:astore_1        
		mDone.countDown();
	//   10   18:aload_0         
	//   11   19:getfield        #30  <Field CountDownLatch mDone>
	//   12   22:invokevirtual   #59  <Method void CountDownLatch.countDown()>
		throw obj;
	//   13   25:aload_1         
	//   14   26:athrow          
	}

	public void run()
	{
		waiting = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #67  <Field boolean waiting>
		executePendingTask();
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field AsyncTaskLoader this$0>
	//    5    9:invokevirtual   #70  <Method void AsyncTaskLoader.executePendingTask()>
	//    6   12:return          
	}

	public void waitForLoader()
	{
		try
		{
			mDone.await();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field CountDownLatch mDone>
	//    2    4:invokevirtual   #76  <Method void CountDownLatch.await()>
			return;
	//    3    7:return          
		}
		catch(InterruptedException interruptedexception)
	//*   4    8:astore_1        
		{
			return;
	//    5    9:return          
		}
	}

	private final CountDownLatch mDone = new CountDownLatch(1);
	final AsyncTaskLoader this$0;
	boolean waiting;

	AsyncTaskLoader$LoadTask()
	{
		this$0 = AsyncTaskLoader.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field AsyncTaskLoader this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void ModernAsyncTask()>
	//    5    9:aload_0         
	//    6   10:new             #25  <Class CountDownLatch>
	//    7   13:dup             
	//    8   14:iconst_1        
	//    9   15:invokespecial   #28  <Method void CountDownLatch(int)>
	//   10   18:putfield        #30  <Field CountDownLatch mDone>
	//   11   21:return          
	}
}
