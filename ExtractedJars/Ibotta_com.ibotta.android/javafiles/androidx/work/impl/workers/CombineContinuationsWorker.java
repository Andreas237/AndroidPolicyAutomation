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
		setOutputData(getInputData());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #21  <Method androidx.work.Data getInputData()>
	//    3    5:invokevirtual   #25  <Method void setOutputData(androidx.work.Data)>
		return androidx.work.ListenableWorker.Result.SUCCESS;
	//    4    8:getstatic       #31  <Field androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.SUCCESS>
	//    5   11:areturn         
	}
}
