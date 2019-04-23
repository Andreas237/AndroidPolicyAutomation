// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.bumptech.glide.load.engine.executor:
//			GlideExecutor

private static final class GlideExecutor$DefaultThreadFactory
	implements ThreadFactory
{

	public Thread newThread(Runnable runnable)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		StringBuilder stringbuilder = new StringBuilder();
	//    2    2:new             #38  <Class StringBuilder>
	//    3    5:dup             
	//    4    6:invokespecial   #39  <Method void StringBuilder()>
	//    5    9:astore_2        
		stringbuilder.append("glide-");
	//    6   10:aload_2         
	//    7   11:ldc1            #41  <String "glide-">
	//    8   13:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//    9   16:pop             
		stringbuilder.append(name);
	//   10   17:aload_2         
	//   11   18:aload_0         
	//   12   19:getfield        #28  <Field String name>
	//   13   22:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
		stringbuilder.append("-thread-");
	//   15   26:aload_2         
	//   16   27:ldc1            #47  <String "-thread-">
	//   17   29:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
		stringbuilder.append(threadNum);
	//   19   33:aload_2         
	//   20   34:aload_0         
	//   21   35:getfield        #49  <Field int threadNum>
	//   22   38:invokevirtual   #52  <Method StringBuilder StringBuilder.append(int)>
	//   23   41:pop             
		runnable = ((Runnable) (new Thread(runnable, stringbuilder.toString()) {

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
			//   21   48:invokeinterface #69  <Method void GlideExecutor$UncaughtThrowableStrategy.handle(Throwable)>
				}
			//   22   53:return          
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
	//   24   42:new             #11  <Class GlideExecutor$DefaultThreadFactory$1>
	//   25   45:dup             
	//   26   46:aload_0         
	//   27   47:aload_1         
	//   28   48:aload_2         
	//   29   49:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   30   52:invokespecial   #59  <Method void GlideExecutor$DefaultThreadFactory$1(GlideExecutor$DefaultThreadFactory, Runnable, String)>
	//   31   55:astore_1        
		threadNum = threadNum + 1;
	//   32   56:aload_0         
	//   33   57:aload_0         
	//   34   58:getfield        #49  <Field int threadNum>
	//   35   61:iconst_1        
	//   36   62:iadd            
	//   37   63:putfield        #49  <Field int threadNum>
		this;
	//   38   66:aload_0         
		JVM INSTR monitorexit ;
	//   39   67:monitorexit     
		return ((Thread) (runnable));
	//   40   68:aload_1         
	//   41   69:areturn         
		runnable;
	//   42   70:astore_1        
	//*  43   71:aload_0         
		throw runnable;
	//   44   72:monitorexit     
	//   45   73:aload_1         
	//   46   74:athrow          
	}

	private static final int DEFAULT_PRIORITY = 9;
	private final String name;
	final boolean preventNetworkOperations;
	private int threadNum;
	final tegy uncaughtThrowableStrategy;

	GlideExecutor$DefaultThreadFactory(String s, tegy tegy, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field String name>
		uncaughtThrowableStrategy = tegy;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field GlideExecutor$UncaughtThrowableStrategy uncaughtThrowableStrategy>
		preventNetworkOperations = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #32  <Field boolean preventNetworkOperations>
	//   11   19:return          
	}
}
