// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.core.executor;

import java.util.concurrent.Executor;

// Referenced classes of package android.arch.core.executor:
//			TaskExecutor, DefaultTaskExecutor

public class ArchTaskExecutor extends TaskExecutor
{

	private ArchTaskExecutor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void TaskExecutor()>
		mDefaultTaskExecutor = ((TaskExecutor) (new DefaultTaskExecutor()));
	//    2    4:aload_0         
	//    3    5:new             #35  <Class DefaultTaskExecutor>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void DefaultTaskExecutor()>
	//    6   12:putfield        #38  <Field TaskExecutor mDefaultTaskExecutor>
		mDelegate = mDefaultTaskExecutor;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #38  <Field TaskExecutor mDefaultTaskExecutor>
	//   10   20:putfield        #40  <Field TaskExecutor mDelegate>
	//   11   23:return          
	}

	public static Executor getIOThreadExecutor()
	{
		return sIOThreadExecutor;
	//    0    0:getstatic       #31  <Field Executor sIOThreadExecutor>
	//    1    3:areturn         
	}

	public static ArchTaskExecutor getInstance()
	{
		if(sInstance != null)
	//*   0    0:getstatic       #47  <Field ArchTaskExecutor sInstance>
	//*   1    3:ifnull          10
			return sInstance;
	//    2    6:getstatic       #47  <Field ArchTaskExecutor sInstance>
	//    3    9:areturn         
		android/arch/core/executor/ArchTaskExecutor;
	//    4   10:ldc1            #2   <Class ArchTaskExecutor>
		JVM INSTR monitorenter ;
	//    5   12:monitorenter    
		if(sInstance == null)
	//*   6   13:getstatic       #47  <Field ArchTaskExecutor sInstance>
	//*   7   16:ifnonnull       29
			sInstance = new ArchTaskExecutor();
	//    8   19:new             #2   <Class ArchTaskExecutor>
	//    9   22:dup             
	//   10   23:invokespecial   #48  <Method void ArchTaskExecutor()>
	//   11   26:putstatic       #47  <Field ArchTaskExecutor sInstance>
		android/arch/core/executor/ArchTaskExecutor;
	//   12   29:ldc1            #2   <Class ArchTaskExecutor>
		JVM INSTR monitorexit ;
	//   13   31:monitorexit     
		return sInstance;
	//   14   32:getstatic       #47  <Field ArchTaskExecutor sInstance>
	//   15   35:areturn         
		Exception exception;
		exception;
	//   16   36:astore_0        
		android/arch/core/executor/ArchTaskExecutor;
	//   17   37:ldc1            #2   <Class ArchTaskExecutor>
		JVM INSTR monitorexit ;
	//   18   39:monitorexit     
		throw exception;
	//   19   40:aload_0         
	//   20   41:athrow          
	}

	public void executeOnDiskIO(Runnable runnable)
	{
		mDelegate.executeOnDiskIO(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field TaskExecutor mDelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method void TaskExecutor.executeOnDiskIO(Runnable)>
	//    4    8:return          
	}

	public boolean isMainThread()
	{
		return mDelegate.isMainThread();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field TaskExecutor mDelegate>
	//    2    4:invokevirtual   #56  <Method boolean TaskExecutor.isMainThread()>
	//    3    7:ireturn         
	}

	public void postToMainThread(Runnable runnable)
	{
		mDelegate.postToMainThread(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field TaskExecutor mDelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #59  <Method void TaskExecutor.postToMainThread(Runnable)>
	//    4    8:return          
	}

	private static final Executor sIOThreadExecutor = new Executor() {

		public void execute(Runnable runnable)
		{
			ArchTaskExecutor.getInstance().executeOnDiskIO(runnable);
		//    0    0:invokestatic    #19  <Method ArchTaskExecutor ArchTaskExecutor.getInstance()>
		//    1    3:aload_1         
		//    2    4:invokevirtual   #22  <Method void ArchTaskExecutor.executeOnDiskIO(Runnable)>
		//    3    7:return          
		}

	}
;
	private static volatile ArchTaskExecutor sInstance;
	private static final Executor sMainThreadExecutor = new Executor() {

		public void execute(Runnable runnable)
		{
			ArchTaskExecutor.getInstance().postToMainThread(runnable);
		//    0    0:invokestatic    #19  <Method ArchTaskExecutor ArchTaskExecutor.getInstance()>
		//    1    3:aload_1         
		//    2    4:invokevirtual   #22  <Method void ArchTaskExecutor.postToMainThread(Runnable)>
		//    3    7:return          
		}

	}
;
	private TaskExecutor mDefaultTaskExecutor;
	private TaskExecutor mDelegate;

	static 
	{
	//    0    0:new             #6   <Class ArchTaskExecutor$1>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ArchTaskExecutor$1()>
	//    3    7:putstatic       #28  <Field Executor sMainThreadExecutor>
	//    4   10:new             #8   <Class ArchTaskExecutor$2>
	//    5   13:dup             
	//    6   14:invokespecial   #29  <Method void ArchTaskExecutor$2()>
	//    7   17:putstatic       #31  <Field Executor sIOThreadExecutor>
	//*   8   20:return          
	}
}
