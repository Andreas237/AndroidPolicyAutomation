// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;

// Referenced classes of package com.bumptech.glide.load.engine.executor:
//			GlideExecutor

class GlideExecutor$DefaultThreadFactory$1 extends Thread
{

	public void run()
	{
		Process.setThreadPriority(9);
	//    0    0:bipush          9
	//    1    2:invokestatic    #32  <Method void Process.setThreadPriority(int)>
		if(preventNetworkOperations)
	//*   2    5:aload_0         
	//*   3    6:getfield        #18  <Field GlideExecutor$DefaultThreadFactory this$0>
	//*   4    9:getfield        #36  <Field boolean GlideExecutor$DefaultThreadFactory.preventNetworkOperations>
	//*   5   12:ifeq            34
			StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder()).detectNetwork().penaltyDeath().build());
	//    6   15:new             #38  <Class android.os.StrictMode$ThreadPolicy$Builder>
	//    7   18:dup             
	//    8   19:invokespecial   #40  <Method void android.os.StrictMode$ThreadPolicy$Builder()>
	//    9   22:invokevirtual   #44  <Method android.os.StrictMode$ThreadPolicy$Builder android.os.StrictMode$ThreadPolicy$Builder.detectNetwork()>
	//   10   25:invokevirtual   #47  <Method android.os.StrictMode$ThreadPolicy$Builder android.os.StrictMode$ThreadPolicy$Builder.penaltyDeath()>
	//   11   28:invokevirtual   #51  <Method android.os.StrictMode$ThreadPolicy android.os.StrictMode$ThreadPolicy$Builder.build()>
	//   12   31:invokestatic    #57  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		try
		{
			super.run();
	//   13   34:aload_0         
	//   14   35:invokespecial   #59  <Method void Thread.run()>
			return;
	//   15   38:return          
		}
		catch(Throwable throwable)
	//*  16   39:astore_1        
		{
			uncaughtThrowableStrategy.handle(throwable);
	//   17   40:aload_0         
	//   18   41:getfield        #18  <Field GlideExecutor$DefaultThreadFactory this$0>
	//   19   44:getfield        #63  <Field GlideExecutor$UncaughtThrowableStrategy GlideExecutor$DefaultThreadFactory.uncaughtThrowableStrategy>
	//   20   47:aload_1         
	//   21   48:invokevirtual   #69  <Method void GlideExecutor$UncaughtThrowableStrategy.handle(Throwable)>
		}
	//   22   51:return          
	}

	final GlideExecutor.DefaultThreadFactory this$0;

	GlideExecutor$DefaultThreadFactory$1(Runnable runnable, String s)
	{
		this$0 = GlideExecutor.DefaultThreadFactory.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field GlideExecutor$DefaultThreadFactory this$0>
		super(runnable, s);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #21  <Method void Thread(Runnable, String)>
	//    7   11:return          
	}
}
