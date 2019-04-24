// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.bumptech.glide.load.engine.executor:
//			GlideExecutor

static final class GlideExecutor$DefaultThreadFactory
	implements ThreadFactory
{

	public Thread newThread(Runnable runnable)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		runnable = ((Runnable) (new Thread(runnable, (new StringBuilder()).append("glide-").append(name).append("-thread-").append(threadNum).toString()) {

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
));
	//    2    2:new             #11  <Class GlideExecutor$DefaultThreadFactory$1>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:new             #36  <Class StringBuilder>
	//    7   11:dup             
	//    8   12:invokespecial   #37  <Method void StringBuilder()>
	//    9   15:ldc1            #39  <String "glide-">
	//   10   17:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:aload_0         
	//   12   21:getfield        #26  <Field String name>
	//   13   24:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:ldc1            #45  <String "-thread-">
	//   15   29:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:aload_0         
	//   17   33:getfield        #47  <Field int threadNum>
	//   18   36:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
	//   19   39:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   20   42:invokespecial   #57  <Method void GlideExecutor$DefaultThreadFactory$1(GlideExecutor$DefaultThreadFactory, Runnable, String)>
	//   21   45:astore_1        
		threadNum = threadNum + 1;
	//   22   46:aload_0         
	//   23   47:aload_0         
	//   24   48:getfield        #47  <Field int threadNum>
	//   25   51:iconst_1        
	//   26   52:iadd            
	//   27   53:putfield        #47  <Field int threadNum>
		this;
	//   28   56:aload_0         
		JVM INSTR monitorexit ;
	//   29   57:monitorexit     
		return ((Thread) (runnable));
	//   30   58:aload_1         
	//   31   59:areturn         
		runnable;
	//   32   60:astore_1        
	//*  33   61:aload_0         
		throw runnable;
	//   34   62:monitorexit     
	//   35   63:aload_1         
	//   36   64:athrow          
	}

	private final String name;
	final boolean preventNetworkOperations;
	private int threadNum;
	final tegy uncaughtThrowableStrategy;

	GlideExecutor$DefaultThreadFactory(String s, tegy tegy, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field String name>
		uncaughtThrowableStrategy = tegy;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field GlideExecutor$UncaughtThrowableStrategy uncaughtThrowableStrategy>
		preventNetworkOperations = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #30  <Field boolean preventNetworkOperations>
	//   11   19:return          
	}
}
