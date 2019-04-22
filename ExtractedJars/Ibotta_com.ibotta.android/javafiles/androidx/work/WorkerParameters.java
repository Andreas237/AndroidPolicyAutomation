// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.*;
import java.util.concurrent.Executor;

// Referenced classes of package androidx.work:
//			Data, WorkerFactory

public final class WorkerParameters
{
	public static class RuntimeExtras
	{

		public Network network;
		public String triggeredContentAuthorities[];
		public Uri triggeredContentUris[];

		public RuntimeExtras()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
		//    2    4:return          
		}
	}


	public WorkerParameters(UUID uuid, Data data, Collection collection, RuntimeExtras runtimeextras, int i, Executor executor, TaskExecutor taskexecutor, 
			WorkerFactory workerfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		mId = uuid;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field UUID mId>
		mInputData = data;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field Data mInputData>
		mTags = ((Set) (new HashSet(collection)));
	//    8   14:aload_0         
	//    9   15:new             #40  <Class HashSet>
	//   10   18:dup             
	//   11   19:aload_3         
	//   12   20:invokespecial   #43  <Method void HashSet(Collection)>
	//   13   23:putfield        #45  <Field Set mTags>
		mRuntimeExtras = runtimeextras;
	//   14   26:aload_0         
	//   15   27:aload           4
	//   16   29:putfield        #47  <Field WorkerParameters$RuntimeExtras mRuntimeExtras>
		mRunAttemptCount = i;
	//   17   32:aload_0         
	//   18   33:iload           5
	//   19   35:putfield        #49  <Field int mRunAttemptCount>
		mBackgroundExecutor = executor;
	//   20   38:aload_0         
	//   21   39:aload           6
	//   22   41:putfield        #51  <Field Executor mBackgroundExecutor>
		mWorkTaskExecutor = taskexecutor;
	//   23   44:aload_0         
	//   24   45:aload           7
	//   25   47:putfield        #53  <Field TaskExecutor mWorkTaskExecutor>
		mWorkerFactory = workerfactory;
	//   26   50:aload_0         
	//   27   51:aload           8
	//   28   53:putfield        #55  <Field WorkerFactory mWorkerFactory>
	//   29   56:return          
	}

	public Executor getBackgroundExecutor()
	{
		return mBackgroundExecutor;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Executor mBackgroundExecutor>
	//    2    4:areturn         
	}

	public UUID getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field UUID mId>
	//    2    4:areturn         
	}

	public Data getInputData()
	{
		return mInputData;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Data mInputData>
	//    2    4:areturn         
	}

	public Network getNetwork()
	{
		return mRuntimeExtras.network;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field WorkerParameters$RuntimeExtras mRuntimeExtras>
	//    2    4:getfield        #75  <Field Network WorkerParameters$RuntimeExtras.network>
	//    3    7:areturn         
	}

	public int getRunAttemptCount()
	{
		return mRunAttemptCount;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int mRunAttemptCount>
	//    2    4:ireturn         
	}

	public Set getTags()
	{
		return mTags;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Set mTags>
	//    2    4:areturn         
	}

	public String[] getTriggeredContentAuthorities()
	{
		return mRuntimeExtras.triggeredContentAuthorities;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field WorkerParameters$RuntimeExtras mRuntimeExtras>
	//    2    4:getfield        #87  <Field String[] WorkerParameters$RuntimeExtras.triggeredContentAuthorities>
	//    3    7:areturn         
	}

	public Uri[] getTriggeredContentUris()
	{
		return mRuntimeExtras.triggeredContentUris;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field WorkerParameters$RuntimeExtras mRuntimeExtras>
	//    2    4:getfield        #93  <Field Uri[] WorkerParameters$RuntimeExtras.triggeredContentUris>
	//    3    7:areturn         
	}

	public WorkerFactory getWorkerFactory()
	{
		return mWorkerFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field WorkerFactory mWorkerFactory>
	//    2    4:areturn         
	}

	private Executor mBackgroundExecutor;
	private UUID mId;
	private Data mInputData;
	private int mRunAttemptCount;
	private RuntimeExtras mRuntimeExtras;
	private Set mTags;
	private TaskExecutor mWorkTaskExecutor;
	private WorkerFactory mWorkerFactory;
}
