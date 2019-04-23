// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.arch.lifecycle.LiveData;
import android.content.Context;
import androidx.work.impl.WorkManagerImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.*;

// Referenced classes of package androidx.work:
//			Configuration, ExistingWorkPolicy, OneTimeWorkRequest, WorkContinuation, 
//			Operation, WorkRequest, ExistingPeriodicWorkPolicy, PeriodicWorkRequest

public abstract class WorkManager
{

	protected WorkManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static WorkManager getInstance()
	{
		WorkManagerImpl workmanagerimpl = WorkManagerImpl.getInstance();
	//    0    0:invokestatic    #22  <Method WorkManagerImpl WorkManagerImpl.getInstance()>
	//    1    3:astore_0        
		if(workmanagerimpl != null)
	//*   2    4:aload_0         
	//*   3    5:ifnull          10
			return ((WorkManager) (workmanagerimpl));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
	//    6   10:new             #24  <Class IllegalStateException>
	//    7   13:dup             
	//    8   14:ldc1            #26  <String "WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.">
	//    9   16:invokespecial   #29  <Method void IllegalStateException(String)>
	//   10   19:athrow          
	}

	public static void initialize(Context context, Configuration configuration)
	{
		WorkManagerImpl.initialize(context, configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #33  <Method void WorkManagerImpl.initialize(Context, Configuration)>
	//    3    5:return          
	}

	public final WorkContinuation beginUniqueWork(String s, ExistingWorkPolicy existingworkpolicy, OneTimeWorkRequest onetimeworkrequest)
	{
		return beginUniqueWork(s, existingworkpolicy, Collections.singletonList(((Object) (onetimeworkrequest))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #42  <Method List Collections.singletonList(Object)>
	//    5    7:invokevirtual   #45  <Method WorkContinuation beginUniqueWork(String, ExistingWorkPolicy, List)>
	//    6   10:areturn         
	}

	public abstract WorkContinuation beginUniqueWork(String s, ExistingWorkPolicy existingworkpolicy, List list);

	public final WorkContinuation beginWith(OneTimeWorkRequest onetimeworkrequest)
	{
		return beginWith(Collections.singletonList(((Object) (onetimeworkrequest))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #42  <Method List Collections.singletonList(Object)>
	//    3    5:invokevirtual   #50  <Method WorkContinuation beginWith(List)>
	//    4    8:areturn         
	}

	public abstract WorkContinuation beginWith(List list);

	public abstract Operation cancelAllWork();

	public abstract Operation cancelAllWorkByTag(String s);

	public abstract Operation cancelUniqueWork(String s);

	public abstract Operation cancelWorkById(UUID uuid);

	public final Operation enqueue(WorkRequest workrequest)
	{
		return enqueue(Collections.singletonList(((Object) (workrequest))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #42  <Method List Collections.singletonList(Object)>
	//    3    5:invokevirtual   #62  <Method Operation enqueue(List)>
	//    4    8:areturn         
	}

	public abstract Operation enqueue(List list);

	public abstract Operation enqueueUniquePeriodicWork(String s, ExistingPeriodicWorkPolicy existingperiodicworkpolicy, PeriodicWorkRequest periodicworkrequest);

	public Operation enqueueUniqueWork(String s, ExistingWorkPolicy existingworkpolicy, OneTimeWorkRequest onetimeworkrequest)
	{
		return enqueueUniqueWork(s, existingworkpolicy, Collections.singletonList(((Object) (onetimeworkrequest))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #42  <Method List Collections.singletonList(Object)>
	//    5    7:invokevirtual   #69  <Method Operation enqueueUniqueWork(String, ExistingWorkPolicy, List)>
	//    6   10:areturn         
	}

	public abstract Operation enqueueUniqueWork(String s, ExistingWorkPolicy existingworkpolicy, List list);

	public abstract ListenableFuture getLastCancelAllTimeMillis();

	public abstract LiveData getLastCancelAllTimeMillisLiveData();

	public abstract ListenableFuture getWorkInfoById(UUID uuid);

	public abstract LiveData getWorkInfoByIdLiveData(UUID uuid);

	public abstract ListenableFuture getWorkInfosByTag(String s);

	public abstract LiveData getWorkInfosByTagLiveData(String s);

	public abstract ListenableFuture getWorkInfosForUniqueWork(String s);

	public abstract LiveData getWorkInfosForUniqueWorkLiveData(String s);

	public abstract Operation pruneWork();
}
