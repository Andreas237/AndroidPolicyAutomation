// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package androidx.work.impl.background.systemalarm:
//			WorkTimer

class WorkTimer$1
	implements ThreadFactory
{

	public Thread newThread(Runnable runnable)
	{
		runnable = ((Runnable) (Executors.defaultThreadFactory().newThread(runnable)));
	//    0    0:invokestatic    #31  <Method ThreadFactory Executors.defaultThreadFactory()>
	//    1    3:aload_1         
	//    2    4:invokeinterface #33  <Method Thread ThreadFactory.newThread(Runnable)>
	//    3    9:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #35  <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #36  <Method void StringBuilder()>
	//    7   17:astore_2        
		stringbuilder.append("WorkManager-WorkTimer-thread-");
	//    8   18:aload_2         
	//    9   19:ldc1            #38  <String "WorkManager-WorkTimer-thread-">
	//   10   21:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		stringbuilder.append(mThreadsCreated);
	//   12   25:aload_2         
	//   13   26:aload_0         
	//   14   27:getfield        #21  <Field int mThreadsCreated>
	//   15   30:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//   16   33:pop             
		((Thread) (runnable)).setName(stringbuilder.toString());
	//   17   34:aload_1         
	//   18   35:aload_2         
	//   19   36:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   20   39:invokevirtual   #55  <Method void Thread.setName(String)>
		mThreadsCreated = mThreadsCreated + 1;
	//   21   42:aload_0         
	//   22   43:aload_0         
	//   23   44:getfield        #21  <Field int mThreadsCreated>
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:putfield        #21  <Field int mThreadsCreated>
		return ((Thread) (runnable));
	//   27   52:aload_1         
	//   28   53:areturn         
	}

	private int mThreadsCreated;
	final WorkTimer this$0;

	WorkTimer$1()
	{
		this$0 = WorkTimer.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field WorkTimer this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
		mThreadsCreated = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #21  <Field int mThreadsCreated>
	//    8   14:return          
	}
}
