// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzcj

final class zzck extends com.google.android.gms.common.api.internal.IStatusCallback.Stub
{

	zzck(zzcj zzcj, TaskCompletionSource taskcompletionsource)
	{
		zzbj = taskcompletionsource;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #10  <Field TaskCompletionSource zzbj>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void com.google.android.gms.common.api.internal.IStatusCallback$Stub()>
	//    5    9:return          
	}

	public final void onResult(Status status)
		throws RemoteException
	{
		TaskUtil.setResultOrApiException(status, zzbj);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #10  <Field TaskCompletionSource zzbj>
	//    3    5:invokestatic    #24  <Method void TaskUtil.setResultOrApiException(Status, TaskCompletionSource)>
	//    4    8:return          
	}

	private final TaskCompletionSource zzbj;
}
