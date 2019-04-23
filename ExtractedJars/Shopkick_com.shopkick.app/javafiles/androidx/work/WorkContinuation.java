// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.arch.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

// Referenced classes of package androidx.work:
//			Operation, OneTimeWorkRequest

public abstract class WorkContinuation
{

	public WorkContinuation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static WorkContinuation combine(List list)
	{
		return ((WorkContinuation)list.get(0)).combineInternal(list);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokeinterface #18  <Method Object List.get(int)>
	//    3    7:checkcast       #2   <Class WorkContinuation>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #21  <Method WorkContinuation combineInternal(List)>
	//    6   14:areturn         
	}

	protected abstract WorkContinuation combineInternal(List list);

	public abstract Operation enqueue();

	public abstract ListenableFuture getWorkInfos();

	public abstract LiveData getWorkInfosLiveData();

	public final WorkContinuation then(OneTimeWorkRequest onetimeworkrequest)
	{
		return then(Collections.singletonList(((Object) (onetimeworkrequest))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #43  <Method List Collections.singletonList(Object)>
	//    3    5:invokevirtual   #45  <Method WorkContinuation then(List)>
	//    4    8:areturn         
	}

	public abstract WorkContinuation then(List list);
}
