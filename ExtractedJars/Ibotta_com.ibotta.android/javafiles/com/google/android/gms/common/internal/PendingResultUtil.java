// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.*;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzk, zzm, zzl, zzn

public class PendingResultUtil
{
	public static interface ResultConverter
	{

		public abstract Object convert(Result result);
	}

	public static interface StatusConverter
	{

		public abstract ApiException convert(Status status);
	}


	public PendingResultUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public static Task toResponseTask(PendingResult pendingresult, Response response)
	{
		return toTask(pendingresult, ((ResultConverter) (new zzm(response))));
	//    0    0:aload_0         
	//    1    1:new             #27  <Class zzm>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #30  <Method void zzm(Response)>
	//    5    9:invokestatic    #34  <Method Task toTask(PendingResult, PendingResultUtil$ResultConverter)>
	//    6   12:areturn         
	}

	public static Task toTask(PendingResult pendingresult, ResultConverter resultconverter)
	{
		return toTask(pendingresult, resultconverter, zzun);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #21  <Field PendingResultUtil$StatusConverter zzun>
	//    3    5:invokestatic    #39  <Method Task toTask(PendingResult, PendingResultUtil$ResultConverter, PendingResultUtil$StatusConverter)>
	//    4    8:areturn         
	}

	public static Task toTask(PendingResult pendingresult, ResultConverter resultconverter, StatusConverter statusconverter)
	{
		TaskCompletionSource taskcompletionsource = new TaskCompletionSource();
	//    0    0:new             #42  <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void TaskCompletionSource()>
	//    3    7:astore_3        
		pendingresult.addStatusListener(((com.google.android.gms.common.api.PendingResult.StatusListener) (new zzl(pendingresult, taskcompletionsource, resultconverter, statusconverter))));
	//    4    8:aload_0         
	//    5    9:new             #45  <Class zzl>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #48  <Method void zzl(PendingResult, TaskCompletionSource, PendingResultUtil$ResultConverter, PendingResultUtil$StatusConverter)>
	//   12   20:invokevirtual   #54  <Method void PendingResult.addStatusListener(com.google.android.gms.common.api.PendingResult$StatusListener)>
		return taskcompletionsource.getTask();
	//   13   23:aload_3         
	//   14   24:invokevirtual   #58  <Method Task TaskCompletionSource.getTask()>
	//   15   27:areturn         
	}

	public static Task toVoidTask(PendingResult pendingresult)
	{
		return toTask(pendingresult, ((ResultConverter) (new zzn())));
	//    0    0:aload_0         
	//    1    1:new             #63  <Class zzn>
	//    2    4:dup             
	//    3    5:invokespecial   #64  <Method void zzn()>
	//    4    8:invokestatic    #34  <Method Task toTask(PendingResult, PendingResultUtil$ResultConverter)>
	//    5   11:areturn         
	}

	private static final StatusConverter zzun = new zzk();

	static 
	{
	//    0    0:new             #16  <Class zzk>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void zzk()>
	//    3    7:putstatic       #21  <Field PendingResultUtil$StatusConverter zzun>
	//*   4   10:return          
	}
}
