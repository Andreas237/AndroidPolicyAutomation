// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.*;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.common.internal:
//			zai, zak, zaj, zal

public class PendingResultUtil
{
	public static interface ResultConverter
	{

		public abstract Object convert(Result result);
	}

	public static interface zaa
	{

		public abstract ApiException zaf(Status status);
	}


	public PendingResultUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public static Task toResponseTask(PendingResult pendingresult, Response response)
	{
		return toTask(pendingresult, ((ResultConverter) (new zak(response))));
	//    0    0:aload_0         
	//    1    1:new             #28  <Class zak>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #31  <Method void zak(Response)>
	//    5    9:invokestatic    #35  <Method Task toTask(PendingResult, PendingResultUtil$ResultConverter)>
	//    6   12:areturn         
	}

	public static Task toTask(PendingResult pendingresult, ResultConverter resultconverter)
	{
		zaa zaa1 = zaot;
	//    0    0:getstatic       #22  <Field PendingResultUtil$zaa zaot>
	//    1    3:astore_2        
		TaskCompletionSource taskcompletionsource = new TaskCompletionSource();
	//    2    4:new             #40  <Class TaskCompletionSource>
	//    3    7:dup             
	//    4    8:invokespecial   #41  <Method void TaskCompletionSource()>
	//    5   11:astore_3        
		pendingresult.addStatusListener(((com.google.android.gms.common.api.PendingResult.StatusListener) (new zaj(pendingresult, taskcompletionsource, resultconverter, zaa1))));
	//    6   12:aload_0         
	//    7   13:new             #43  <Class zaj>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:invokespecial   #46  <Method void zaj(PendingResult, TaskCompletionSource, PendingResultUtil$ResultConverter, PendingResultUtil$zaa)>
	//   14   24:invokevirtual   #52  <Method void PendingResult.addStatusListener(com.google.android.gms.common.api.PendingResult$StatusListener)>
		return taskcompletionsource.getTask();
	//   15   27:aload_3         
	//   16   28:invokevirtual   #56  <Method Task TaskCompletionSource.getTask()>
	//   17   31:areturn         
	}

	public static Task toVoidTask(PendingResult pendingresult)
	{
		return toTask(pendingresult, ((ResultConverter) (new zal())));
	//    0    0:aload_0         
	//    1    1:new             #61  <Class zal>
	//    2    4:dup             
	//    3    5:invokespecial   #62  <Method void zal()>
	//    4    8:invokestatic    #35  <Method Task toTask(PendingResult, PendingResultUtil$ResultConverter)>
	//    5   11:areturn         
	}

	private static final zaa zaot = new zai();

	static 
	{
	//    0    0:new             #17  <Class zai>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void zai()>
	//    3    7:putstatic       #22  <Field PendingResultUtil$zaa zaot>
	//*   4   10:return          
	}
}
