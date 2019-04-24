// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.tasks.TaskCompletionSource;

public class zzabo
{

	public static void zza(Status status, Object obj, TaskCompletionSource taskcompletionsource)
	{
		if(status.isSuccess())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #12  <Method boolean Status.isSuccess()>
	//*   2    4:ifeq            13
		{
			taskcompletionsource.setResult(obj);
	//    3    7:aload_2         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #18  <Method void TaskCompletionSource.setResult(Object)>
			return;
	//    6   12:return          
		} else
		{
			taskcompletionsource.setException(((Exception) (new zza(status))));
	//    7   13:aload_2         
	//    8   14:new             #20  <Class zza>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #24  <Method void zza(Status)>
	//   12   22:invokevirtual   #28  <Method void TaskCompletionSource.setException(Exception)>
			return;
	//   13   25:return          
		}
	}
}
