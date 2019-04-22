// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

// Referenced classes of package androidx.work:
//			WorkerParameters, Data, WorkerFactory

public abstract class ListenableWorker
{
	public static final class Payload
	{

		public Data getOutputData()
		{
			return mOutput;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Data mOutput>
		//    2    4:areturn         
		}

		public Result getResult()
		{
			return mResult;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field ListenableWorker$Result mResult>
		//    2    4:areturn         
		}

		Data mOutput;
		Result mResult;

		public Payload(Result result, Data data)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mResult = result;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field ListenableWorker$Result mResult>
			mOutput = data;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field Data mOutput>
		//    8   14:return          
		}
	}

	public static final class Result extends Enum
	{

		public static Result valueOf(String s)
		{
			return (Result)Enum.valueOf(androidx/work/ListenableWorker$Result, s);
		//    0    0:ldc1            #2   <Class ListenableWorker$Result>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ListenableWorker$Result>
		//    4    9:areturn         
		}

		public static Result[] values()
		{
			return (Result[])((Result []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field ListenableWorker$Result[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Landroidx.work.ListenableWorker$Result_3B_.clone()>
		//    2    6:checkcast       #42  <Class ListenableWorker$Result[]>
		//    3    9:areturn         
		}

		private static final Result $VALUES[];
		public static final Result FAILURE;
		public static final Result RETRY;
		public static final Result SUCCESS;

		static 
		{
			SUCCESS = new Result("SUCCESS", 0);
		//    0    0:new             #2   <Class ListenableWorker$Result>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "SUCCESS">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void ListenableWorker$Result(String, int)>
		//    5   10:putstatic       #23  <Field ListenableWorker$Result SUCCESS>
			FAILURE = new Result("FAILURE", 1);
		//    6   13:new             #2   <Class ListenableWorker$Result>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "FAILURE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void ListenableWorker$Result(String, int)>
		//   11   23:putstatic       #26  <Field ListenableWorker$Result FAILURE>
			RETRY = new Result("RETRY", 2);
		//   12   26:new             #2   <Class ListenableWorker$Result>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "RETRY">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void ListenableWorker$Result(String, int)>
		//   17   36:putstatic       #29  <Field ListenableWorker$Result RETRY>
			$VALUES = (new Result[] {
				SUCCESS, FAILURE, RETRY
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       Result[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field ListenableWorker$Result SUCCESS>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field ListenableWorker$Result FAILURE>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field ListenableWorker$Result RETRY>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field ListenableWorker$Result[] $VALUES>
		//*  33   64:return          
		}

		private Result(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public ListenableWorker(Context context, WorkerParameters workerparameters)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		if(context != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          33
		{
			if(workerparameters != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          23
			{
				mAppContext = context;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #27  <Field Context mAppContext>
				mWorkerParams = workerparameters;
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:putfield        #29  <Field WorkerParameters mWorkerParams>
				return;
	//   12   22:return          
			} else
			{
				throw new IllegalArgumentException("WorkerParameters is null");
	//   13   23:new             #31  <Class IllegalArgumentException>
	//   14   26:dup             
	//   15   27:ldc1            #33  <String "WorkerParameters is null">
	//   16   29:invokespecial   #36  <Method void IllegalArgumentException(String)>
	//   17   32:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("Application Context is null");
	//   18   33:new             #31  <Class IllegalArgumentException>
	//   19   36:dup             
	//   20   37:ldc1            #38  <String "Application Context is null">
	//   21   39:invokespecial   #36  <Method void IllegalArgumentException(String)>
	//   22   42:athrow          
		}
	}

	public final Context getApplicationContext()
	{
		return mAppContext;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Context mAppContext>
	//    2    4:areturn         
	}

	public Executor getBackgroundExecutor()
	{
		return mWorkerParams.getBackgroundExecutor();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #53  <Method Executor WorkerParameters.getBackgroundExecutor()>
	//    3    7:areturn         
	}

	public final UUID getId()
	{
		return mWorkerParams.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #57  <Method UUID WorkerParameters.getId()>
	//    3    7:areturn         
	}

	public final Data getInputData()
	{
		return mWorkerParams.getInputData();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #61  <Method Data WorkerParameters.getInputData()>
	//    3    7:areturn         
	}

	public final Network getNetwork()
	{
		return mWorkerParams.getNetwork();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #68  <Method Network WorkerParameters.getNetwork()>
	//    3    7:areturn         
	}

	public final int getRunAttemptCount()
	{
		return mWorkerParams.getRunAttemptCount();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #72  <Method int WorkerParameters.getRunAttemptCount()>
	//    3    7:ireturn         
	}

	public final Set getTags()
	{
		return mWorkerParams.getTags();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #76  <Method Set WorkerParameters.getTags()>
	//    3    7:areturn         
	}

	public final String[] getTriggeredContentAuthorities()
	{
		return mWorkerParams.getTriggeredContentAuthorities();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #83  <Method String[] WorkerParameters.getTriggeredContentAuthorities()>
	//    3    7:areturn         
	}

	public final Uri[] getTriggeredContentUris()
	{
		return mWorkerParams.getTriggeredContentUris();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #87  <Method Uri[] WorkerParameters.getTriggeredContentUris()>
	//    3    7:areturn         
	}

	public WorkerFactory getWorkerFactory()
	{
		return mWorkerParams.getWorkerFactory();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #91  <Method WorkerFactory WorkerParameters.getWorkerFactory()>
	//    3    7:areturn         
	}

	public final boolean isCancelled()
	{
		return mCancelled;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field boolean mCancelled>
	//    2    4:ireturn         
	}

	public final boolean isStopped()
	{
		return mStopped;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field boolean mStopped>
	//    2    4:ireturn         
	}

	public final boolean isUsed()
	{
		return mUsed;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field boolean mUsed>
	//    2    4:ireturn         
	}

	public abstract ListenableFuture onStartWork();

	public void onStopped(boolean flag)
	{
	//    0    0:return          
	}

	public final void setUsed()
	{
		mUsed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #101 <Field boolean mUsed>
	//    3    5:return          
	}

	public final void stop(boolean flag)
	{
		mStopped = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #98  <Field boolean mStopped>
		mCancelled = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #95  <Field boolean mCancelled>
		onStopped(flag);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #110 <Method void onStopped(boolean)>
	//    9   15:return          
	}

	private Context mAppContext;
	private volatile boolean mCancelled;
	private volatile boolean mStopped;
	private boolean mUsed;
	private WorkerParameters mWorkerParams;
}
