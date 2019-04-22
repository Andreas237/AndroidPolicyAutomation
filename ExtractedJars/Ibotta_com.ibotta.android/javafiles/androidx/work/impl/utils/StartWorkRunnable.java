// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;

public class StartWorkRunnable
	implements Runnable
{

	public StartWorkRunnable(WorkManagerImpl workmanagerimpl, String s, androidx.work.WorkerParameters.RuntimeExtras runtimeextras)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mWorkManagerImpl = workmanagerimpl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field WorkManagerImpl mWorkManagerImpl>
		mWorkSpecId = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field String mWorkSpecId>
		mRuntimeExtras = runtimeextras;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field androidx.work.WorkerParameters$RuntimeExtras mRuntimeExtras>
	//   11   19:return          
	}

	public void run()
	{
		mWorkManagerImpl.getProcessor().startWork(mWorkSpecId, mRuntimeExtras);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field WorkManagerImpl mWorkManagerImpl>
	//    2    4:invokevirtual   #35  <Method Processor WorkManagerImpl.getProcessor()>
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field String mWorkSpecId>
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field androidx.work.WorkerParameters$RuntimeExtras mRuntimeExtras>
	//    7   15:invokevirtual   #41  <Method boolean Processor.startWork(String, androidx.work.WorkerParameters$RuntimeExtras)>
	//    8   18:pop             
	//    9   19:return          
	}

	private androidx.work.WorkerParameters.RuntimeExtras mRuntimeExtras;
	private WorkManagerImpl mWorkManagerImpl;
	private String mWorkSpecId;
}
