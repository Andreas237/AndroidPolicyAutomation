// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.List;

// Referenced classes of package androidx.work.impl:
//			WorkerWrapper, WorkDatabase

public static class WorkerWrapper$Builder
{

	public WorkerWrapper build()
	{
		return new WorkerWrapper(this);
	//    0    0:new             #6   <Class WorkerWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #63  <Method void WorkerWrapper(WorkerWrapper$Builder)>
	//    4    8:areturn         
	}

	public WorkerWrapper$Builder withRuntimeExtras(androidx.work.meExtras meextras)
	{
		if(meextras != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			mRuntimeExtras = meextras;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field androidx.work.WorkerParameters$RuntimeExtras mRuntimeExtras>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public WorkerWrapper$Builder withSchedulers(List list)
	{
		mSchedulers = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field List mSchedulers>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public WorkerWrapper$Builder withWorker(ListenableWorker listenableworker)
	{
		mWorker = listenableworker;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field ListenableWorker mWorker>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	Context mAppContext;
	Configuration mConfiguration;
	androidx.work.meExtras mRuntimeExtras;
	List mSchedulers;
	WorkDatabase mWorkDatabase;
	String mWorkSpecId;
	TaskExecutor mWorkTaskExecutor;
	ListenableWorker mWorker;

	public WorkerWrapper$Builder(Context context, Configuration configuration, TaskExecutor taskexecutor, WorkDatabase workdatabase, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		mRuntimeExtras = new androidx.work.meExtras();
	//    2    4:aload_0         
	//    3    5:new             #37  <Class androidx.work.WorkerParameters$RuntimeExtras>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void androidx.work.WorkerParameters$RuntimeExtras()>
	//    6   12:putfield        #40  <Field androidx.work.WorkerParameters$RuntimeExtras mRuntimeExtras>
		mAppContext = context.getApplicationContext();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #46  <Method Context Context.getApplicationContext()>
	//   10   20:putfield        #48  <Field Context mAppContext>
		mWorkTaskExecutor = taskexecutor;
	//   11   23:aload_0         
	//   12   24:aload_3         
	//   13   25:putfield        #50  <Field TaskExecutor mWorkTaskExecutor>
		mConfiguration = configuration;
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:putfield        #52  <Field Configuration mConfiguration>
		mWorkDatabase = workdatabase;
	//   17   33:aload_0         
	//   18   34:aload           4
	//   19   36:putfield        #54  <Field WorkDatabase mWorkDatabase>
		mWorkSpecId = s;
	//   20   39:aload_0         
	//   21   40:aload           5
	//   22   42:putfield        #56  <Field String mWorkSpecId>
	//   23   45:return          
	}
}
