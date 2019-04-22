// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.core.executor;

import java.util.concurrent.Executor;

// Referenced classes of package android.arch.core.executor:
//			ArchTaskExecutor

static final class ArchTaskExecutor$1
	implements Executor
{

	public void execute(Runnable runnable)
	{
		ArchTaskExecutor.getInstance().postToMainThread(runnable);
	//    0    0:invokestatic    #19  <Method ArchTaskExecutor ArchTaskExecutor.getInstance()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #22  <Method void ArchTaskExecutor.postToMainThread(Runnable)>
	//    3    7:return          
	}

	ArchTaskExecutor$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
