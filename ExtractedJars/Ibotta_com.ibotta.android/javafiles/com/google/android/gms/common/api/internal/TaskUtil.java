// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzcg

public class TaskUtil
{

	public TaskUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static void setResultOrApiException(Status status, TaskCompletionSource taskcompletionsource)
	{
		setResultOrApiException(status, ((Object) (null)), taskcompletionsource);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokestatic    #15  <Method void setResultOrApiException(Status, Object, TaskCompletionSource)>
	//    4    6:return          
	}

	public static void setResultOrApiException(Status status, Object obj, TaskCompletionSource taskcompletionsource)
	{
		if(status.isSuccess())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #24  <Method boolean Status.isSuccess()>
	//*   2    4:ifeq            13
		{
			taskcompletionsource.setResult(obj);
	//    3    7:aload_2         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #30  <Method void TaskCompletionSource.setResult(Object)>
			return;
	//    6   12:return          
		} else
		{
			taskcompletionsource.setException(((Exception) (new ApiException(status))));
	//    7   13:aload_2         
	//    8   14:new             #32  <Class ApiException>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #35  <Method void ApiException(Status)>
	//   12   22:invokevirtual   #39  <Method void TaskCompletionSource.setException(Exception)>
			return;
	//   13   25:return          
		}
	}

	public static Task toVoidTaskThatFailsOnFalse(Task task)
	{
		return task.continueWith(((com.google.android.gms.tasks.Continuation) (new zzcg())));
	//    0    0:aload_0         
	//    1    1:new             #45  <Class zzcg>
	//    2    4:dup             
	//    3    5:invokespecial   #46  <Method void zzcg()>
	//    4    8:invokevirtual   #52  <Method Task Task.continueWith(com.google.android.gms.tasks.Continuation)>
	//    5   11:areturn         
	}
}
