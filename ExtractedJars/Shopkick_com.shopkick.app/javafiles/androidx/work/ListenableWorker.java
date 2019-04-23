// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.content.Context;
import android.net.Network;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.*;
import java.util.concurrent.Executor;

// Referenced classes of package androidx.work:
//			WorkerParameters, Data, WorkerFactory

public abstract class ListenableWorker
{
	public static abstract class Result
	{

		public static Result failure()
		{
			return ((Result) (new Failure()));
		//    0    0:new             #9   <Class ListenableWorker$Result$Failure>
		//    1    3:dup             
		//    2    4:invokespecial   #30  <Method void ListenableWorker$Result$Failure()>
		//    3    7:areturn         
		}

		public static Result failure(Data data)
		{
			return ((Result) (new Failure(data)));
		//    0    0:new             #9   <Class ListenableWorker$Result$Failure>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #34  <Method void ListenableWorker$Result$Failure(Data)>
		//    4    8:areturn         
		}

		public static Result retry()
		{
			return ((Result) (new Retry()));
		//    0    0:new             #12  <Class ListenableWorker$Result$Retry>
		//    1    3:dup             
		//    2    4:invokespecial   #37  <Method void ListenableWorker$Result$Retry()>
		//    3    7:areturn         
		}

		public static Result success()
		{
			return ((Result) (new Success()));
		//    0    0:new             #15  <Class ListenableWorker$Result$Success>
		//    1    3:dup             
		//    2    4:invokespecial   #39  <Method void ListenableWorker$Result$Success()>
		//    3    7:areturn         
		}

		public static Result success(Data data)
		{
			return ((Result) (new Success(data)));
		//    0    0:new             #15  <Class ListenableWorker$Result$Success>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #40  <Method void ListenableWorker$Result$Success(Data)>
		//    4    8:areturn         
		}

		Result()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class Result.Failure extends Result
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj != null && ((Object)this).getClass() == obj.getClass())
		//*   5    7:aload_1         
		//*   6    8:ifnull          42
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #39  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #39  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       25
		//*  12   22:goto            42
			{
				obj = ((Object) ((Result.Failure)obj));
		//   13   25:aload_1         
		//   14   26:checkcast       #2   <Class ListenableWorker$Result$Failure>
		//   15   29:astore_1        
				return mOutputData.equals(((Object) (((Result.Failure) (obj)).mOutputData)));
		//   16   30:aload_0         
		//   17   31:getfield        #30  <Field Data mOutputData>
		//   18   34:aload_1         
		//   19   35:getfield        #30  <Field Data mOutputData>
		//   20   38:invokevirtual   #41  <Method boolean Data.equals(Object)>
		//   21   41:ireturn         
			} else
			{
				return false;
		//   22   42:iconst_0        
		//   23   43:ireturn         
			}
		}

		public Data getOutputData()
		{
			return mOutputData;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Data mOutputData>
		//    2    4:areturn         
		}

		public int hashCode()
		{
			return ((Class) (androidx/work/ListenableWorker$Result$Failure)).getName().hashCode() * 31 + mOutputData.hashCode();
		//    0    0:ldc1            #2   <Class ListenableWorker$Result$Failure>
		//    1    2:invokevirtual   #52  <Method String Class.getName()>
		//    2    5:invokevirtual   #56  <Method int String.hashCode()>
		//    3    8:bipush          31
		//    4   10:imul            
		//    5   11:aload_0         
		//    6   12:getfield        #30  <Field Data mOutputData>
		//    7   15:invokevirtual   #57  <Method int Data.hashCode()>
		//    8   18:iadd            
		//    9   19:ireturn         
		}

		private final Data mOutputData;

		public Result.Failure()
		{
			this(Data.EMPTY);
		//    0    0:aload_0         
		//    1    1:getstatic       #21  <Field Data Data.EMPTY>
		//    2    4:invokespecial   #24  <Method void ListenableWorker$Result$Failure(Data)>
		//    3    7:return          
		}

		public Result.Failure(Data data)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void ListenableWorker$Result()>
			mOutputData = data;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #30  <Field Data mOutputData>
		//    5    9:return          
		}
	}

	public static final class Result.Retry extends Result
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			return obj != null && ((Object)this).getClass() == obj.getClass();
		//    5    7:aload_1         
		//    6    8:ifnull          24
		//    7   11:aload_0         
		//    8   12:invokevirtual   #25  <Method Class Object.getClass()>
		//    9   15:aload_1         
		//   10   16:invokevirtual   #25  <Method Class Object.getClass()>
		//   11   19:if_acmpne       24
		//   12   22:iconst_1        
		//   13   23:ireturn         
		//   14   24:iconst_0        
		//   15   25:ireturn         
		}

		public int hashCode()
		{
			return ((Class) (androidx/work/ListenableWorker$Result$Retry)).getName().hashCode();
		//    0    0:ldc1            #2   <Class ListenableWorker$Result$Retry>
		//    1    2:invokevirtual   #33  <Method String Class.getName()>
		//    2    5:invokevirtual   #37  <Method int String.hashCode()>
		//    3    8:ireturn         
		}

		public Result.Retry()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void ListenableWorker$Result()>
		//    2    4:return          
		}
	}

	public static final class Result.Success extends Result
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj != null && ((Object)this).getClass() == obj.getClass())
		//*   5    7:aload_1         
		//*   6    8:ifnull          42
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #39  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #39  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       25
		//*  12   22:goto            42
			{
				obj = ((Object) ((Result.Success)obj));
		//   13   25:aload_1         
		//   14   26:checkcast       #2   <Class ListenableWorker$Result$Success>
		//   15   29:astore_1        
				return mOutputData.equals(((Object) (((Result.Success) (obj)).mOutputData)));
		//   16   30:aload_0         
		//   17   31:getfield        #30  <Field Data mOutputData>
		//   18   34:aload_1         
		//   19   35:getfield        #30  <Field Data mOutputData>
		//   20   38:invokevirtual   #41  <Method boolean Data.equals(Object)>
		//   21   41:ireturn         
			} else
			{
				return false;
		//   22   42:iconst_0        
		//   23   43:ireturn         
			}
		}

		public Data getOutputData()
		{
			return mOutputData;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Data mOutputData>
		//    2    4:areturn         
		}

		public int hashCode()
		{
			return ((Class) (androidx/work/ListenableWorker$Result$Success)).getName().hashCode() * 31 + mOutputData.hashCode();
		//    0    0:ldc1            #2   <Class ListenableWorker$Result$Success>
		//    1    2:invokevirtual   #52  <Method String Class.getName()>
		//    2    5:invokevirtual   #56  <Method int String.hashCode()>
		//    3    8:bipush          31
		//    4   10:imul            
		//    5   11:aload_0         
		//    6   12:getfield        #30  <Field Data mOutputData>
		//    7   15:invokevirtual   #57  <Method int Data.hashCode()>
		//    8   18:iadd            
		//    9   19:ireturn         
		}

		private final Data mOutputData;

		public Result.Success()
		{
			this(Data.EMPTY);
		//    0    0:aload_0         
		//    1    1:getstatic       #21  <Field Data Data.EMPTY>
		//    2    4:invokespecial   #24  <Method void ListenableWorker$Result$Success(Data)>
		//    3    7:return          
		}

		public Result.Success(Data data)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void ListenableWorker$Result()>
			mOutputData = data;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #30  <Field Data mOutputData>
		//    5    9:return          
		}
	}


	public ListenableWorker(Context context, WorkerParameters workerparameters)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
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
	//    8   14:putfield        #35  <Field Context mAppContext>
				mWorkerParams = workerparameters;
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:putfield        #37  <Field WorkerParameters mWorkerParams>
				return;
	//   12   22:return          
			} else
			{
				throw new IllegalArgumentException("WorkerParameters is null");
	//   13   23:new             #39  <Class IllegalArgumentException>
	//   14   26:dup             
	//   15   27:ldc1            #41  <String "WorkerParameters is null">
	//   16   29:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//   17   32:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("Application Context is null");
	//   18   33:new             #39  <Class IllegalArgumentException>
	//   19   36:dup             
	//   20   37:ldc1            #46  <String "Application Context is null">
	//   21   39:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//   22   42:athrow          
		}
	}

	public final Context getApplicationContext()
	{
		return mAppContext;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Context mAppContext>
	//    2    4:areturn         
	}

	public Executor getBackgroundExecutor()
	{
		return mWorkerParams.getBackgroundExecutor();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #60  <Method Executor WorkerParameters.getBackgroundExecutor()>
	//    3    7:areturn         
	}

	public final UUID getId()
	{
		return mWorkerParams.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #64  <Method UUID WorkerParameters.getId()>
	//    3    7:areturn         
	}

	public final Data getInputData()
	{
		return mWorkerParams.getInputData();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #68  <Method Data WorkerParameters.getInputData()>
	//    3    7:areturn         
	}

	public final Network getNetwork()
	{
		return mWorkerParams.getNetwork();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #75  <Method Network WorkerParameters.getNetwork()>
	//    3    7:areturn         
	}

	public final int getRunAttemptCount()
	{
		return mWorkerParams.getRunAttemptCount();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #79  <Method int WorkerParameters.getRunAttemptCount()>
	//    3    7:ireturn         
	}

	public final Set getTags()
	{
		return mWorkerParams.getTags();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #83  <Method Set WorkerParameters.getTags()>
	//    3    7:areturn         
	}

	public TaskExecutor getTaskExecutor()
	{
		return mWorkerParams.getTaskExecutor();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #89  <Method TaskExecutor WorkerParameters.getTaskExecutor()>
	//    3    7:areturn         
	}

	public final List getTriggeredContentAuthorities()
	{
		return mWorkerParams.getTriggeredContentAuthorities();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #94  <Method List WorkerParameters.getTriggeredContentAuthorities()>
	//    3    7:areturn         
	}

	public final List getTriggeredContentUris()
	{
		return mWorkerParams.getTriggeredContentUris();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #98  <Method List WorkerParameters.getTriggeredContentUris()>
	//    3    7:areturn         
	}

	public WorkerFactory getWorkerFactory()
	{
		return mWorkerParams.getWorkerFactory();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WorkerParameters mWorkerParams>
	//    2    4:invokevirtual   #103 <Method WorkerFactory WorkerParameters.getWorkerFactory()>
	//    3    7:areturn         
	}

	public final boolean isStopped()
	{
		return mStopped;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field boolean mStopped>
	//    2    4:ireturn         
	}

	public final boolean isUsed()
	{
		return mUsed;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field boolean mUsed>
	//    2    4:ireturn         
	}

	public void onStopped()
	{
	//    0    0:return          
	}

	public final void setUsed()
	{
		mUsed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #110 <Field boolean mUsed>
	//    3    5:return          
	}

	public abstract ListenableFuture startWork();

	public final void stop()
	{
		mStopped = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #107 <Field boolean mStopped>
		onStopped();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #118 <Method void onStopped()>
	//    5    9:return          
	}

	private Context mAppContext;
	private volatile boolean mStopped;
	private boolean mUsed;
	private WorkerParameters mWorkerParams;
}
