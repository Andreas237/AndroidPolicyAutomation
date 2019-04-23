// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzad;
import com.google.android.gms.internal.location.zzak;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.location:
//			FusedLocationProviderClient

private static final class FusedLocationProviderClient$zza extends zzak
{

	public final void zza(zzad zzad1)
	{
		TaskUtil.setResultOrApiException(zzad1.getStatus(), zzac);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method com.google.android.gms.common.api.Status zzad.getStatus()>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field TaskCompletionSource zzac>
	//    4    8:invokestatic    #33  <Method void TaskUtil.setResultOrApiException(com.google.android.gms.common.api.Status, TaskCompletionSource)>
	//    5   11:return          
	}

	private final TaskCompletionSource zzac;

	public FusedLocationProviderClient$zza(TaskCompletionSource taskcompletionsource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzak()>
		zzac = taskcompletionsource;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field TaskCompletionSource zzac>
	//    5    9:return          
	}
}
