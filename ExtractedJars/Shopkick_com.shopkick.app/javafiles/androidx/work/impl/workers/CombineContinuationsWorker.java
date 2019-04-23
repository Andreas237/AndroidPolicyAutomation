// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class CombineContinuationsWorker extends Worker
{

	public CombineContinuationsWorker(Context context, WorkerParameters workerparameters)
	{
		super(context, workerparameters);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void Worker(Context, WorkerParameters)>
	//    4    6:return          
	}

	public androidx.work.ListenableWorker.Result doWork()
	{
		return androidx.work.ListenableWorker.Result.success(getInputData());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method androidx.work.Data getInputData()>
	//    2    4:invokestatic    #27  <Method androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.success(androidx.work.Data)>
	//    3    7:areturn         
	}
}
