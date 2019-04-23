// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

public class StartWorkRunnable
	implements Runnable
{

	public StartWorkRunnable(WorkManagerImpl workmanagerimpl, String s, androidx.work.WorkerParameters.RuntimeExtras runtimeextras)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mWorkManagerImpl = workmanagerimpl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field WorkManagerImpl mWorkManagerImpl>
		mWorkSpecId = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field String mWorkSpecId>
		mRuntimeExtras = runtimeextras;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field androidx.work.WorkerParameters$RuntimeExtras mRuntimeExtras>
	//   11   19:aload_0         
	//   12   20:invokestatic    #36  <Method SettableFuture SettableFuture.create()>
	//   13   23:putfield        #38  <Field SettableFuture mEnqueuedFuture>
	//   14   26:return          
	}

	public ListenableFuture getEnqueuedFuture()
	{
		return ((ListenableFuture) (mEnqueuedFuture));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field SettableFuture mEnqueuedFuture>
	//    2    4:areturn         
	}

	public void run()
	{
		mEnqueuedFuture.set(((Object) (Boolean.valueOf(mWorkManagerImpl.getProcessor().startWork(mWorkSpecId, mRuntimeExtras)))));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field SettableFuture mEnqueuedFuture>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field WorkManagerImpl mWorkManagerImpl>
	//    4    8:invokevirtual   #50  <Method Processor WorkManagerImpl.getProcessor()>
	//    5   11:aload_0         
	//    6   12:getfield        #28  <Field String mWorkSpecId>
	//    7   15:aload_0         
	//    8   16:getfield        #30  <Field androidx.work.WorkerParameters$RuntimeExtras mRuntimeExtras>
	//    9   19:invokevirtual   #56  <Method boolean Processor.startWork(String, androidx.work.WorkerParameters$RuntimeExtras)>
	//   10   22:invokestatic    #62  <Method Boolean Boolean.valueOf(boolean)>
	//   11   25:invokevirtual   #66  <Method boolean SettableFuture.set(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	private final SettableFuture mEnqueuedFuture = SettableFuture.create();
	private androidx.work.WorkerParameters.RuntimeExtras mRuntimeExtras;
	private WorkManagerImpl mWorkManagerImpl;
	private String mWorkSpecId;
}
