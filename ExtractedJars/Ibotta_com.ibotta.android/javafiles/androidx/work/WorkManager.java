// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.content.Context;
import androidx.work.impl.WorkManagerImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package androidx.work:
//			Configuration, ExistingWorkPolicy, WorkContinuation, WorkRequest

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

	public abstract WorkContinuation beginUniqueWork(String s, ExistingWorkPolicy existingworkpolicy, List list);

	public abstract ListenableFuture cancelAllWorkByTag(String s);

	public abstract ListenableFuture enqueue(List list);

	public final transient ListenableFuture enqueue(WorkRequest aworkrequest[])
	{
		return enqueue(Arrays.asList(((Object []) (aworkrequest))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #47  <Method List Arrays.asList(Object[])>
	//    3    5:invokevirtual   #49  <Method ListenableFuture enqueue(List)>
	//    4    8:areturn         
	}
}
