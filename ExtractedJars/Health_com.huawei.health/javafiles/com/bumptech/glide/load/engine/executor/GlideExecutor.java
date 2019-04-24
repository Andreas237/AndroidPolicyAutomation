// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class GlideExecutor extends ThreadPoolExecutor
{
	static final class DefaultThreadFactory
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

				final DefaultThreadFactory this$0;

			
			{
				this$0 = DefaultThreadFactory.this;
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
		final UncaughtThrowableStrategy uncaughtThrowableStrategy;

		DefaultThreadFactory(String s, UncaughtThrowableStrategy uncaughtthrowablestrategy, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			name = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #26  <Field String name>
			uncaughtThrowableStrategy = uncaughtthrowablestrategy;
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

	public static class UncaughtThrowableStrategy extends Enum
	{

		public static UncaughtThrowableStrategy valueOf(String s)
		{
			return (UncaughtThrowableStrategy)Enum.valueOf(com/bumptech/glide/load/engine/executor/GlideExecutor$UncaughtThrowableStrategy, s);
		//    0    0:ldc1            #2   <Class GlideExecutor$UncaughtThrowableStrategy>
		//    1    2:aload_0         
		//    2    3:invokestatic    #49  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class GlideExecutor$UncaughtThrowableStrategy>
		//    4    9:areturn         
		}

		public static UncaughtThrowableStrategy[] values()
		{
			return (UncaughtThrowableStrategy[])((UncaughtThrowableStrategy []) ($VALUES)).clone();
		//    0    0:getstatic       #38  <Field GlideExecutor$UncaughtThrowableStrategy[] $VALUES>
		//    1    3:invokevirtual   #56  <Method Object _5B_Lcom.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy_3B_.clone()>
		//    2    6:checkcast       #52  <Class GlideExecutor$UncaughtThrowableStrategy[]>
		//    3    9:areturn         
		}

		protected void handle(Throwable throwable)
		{
		//    0    0:return          
		}

		private static final UncaughtThrowableStrategy $VALUES[];
		public static final UncaughtThrowableStrategy DEFAULT;
		public static final UncaughtThrowableStrategy IGNORE;
		public static final UncaughtThrowableStrategy LOG;
		public static final UncaughtThrowableStrategy THROW;

		static 
		{
			IGNORE = new UncaughtThrowableStrategy("IGNORE", 0);
		//    0    0:new             #2   <Class GlideExecutor$UncaughtThrowableStrategy>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "IGNORE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #26  <Method void GlideExecutor$UncaughtThrowableStrategy(String, int)>
		//    5   10:putstatic       #28  <Field GlideExecutor$UncaughtThrowableStrategy IGNORE>
			LOG = ((UncaughtThrowableStrategy) (new UncaughtThrowableStrategy("LOG", 1) {

				protected void handle(Throwable throwable)
				{
					if(throwable != null && Log.isLoggable("GlideExecutor", 6))
				//*   0    0:aload_1         
				//*   1    1:ifnull          23
				//*   2    4:ldc1            #17  <String "GlideExecutor">
				//*   3    6:bipush          6
				//*   4    8:invokestatic    #23  <Method boolean Log.isLoggable(String, int)>
				//*   5   11:ifeq            23
						Log.e("GlideExecutor", "Request threw uncaught throwable", throwable);
				//    6   14:ldc1            #17  <String "GlideExecutor">
				//    7   16:ldc1            #25  <String "Request threw uncaught throwable">
				//    8   18:aload_1         
				//    9   19:invokestatic    #29  <Method int Log.e(String, String, Throwable)>
				//   10   22:pop             
				//   11   23:return          
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void GlideExecutor$UncaughtThrowableStrategy(String, int, GlideExecutor$1)>
			//    5    7:return          
			}
			}
));
		//    6   13:new             #10  <Class GlideExecutor$UncaughtThrowableStrategy$1>
		//    7   16:dup             
		//    8   17:ldc1            #29  <String "LOG">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #30  <Method void GlideExecutor$UncaughtThrowableStrategy$1(String, int)>
		//   11   23:putstatic       #32  <Field GlideExecutor$UncaughtThrowableStrategy LOG>
			THROW = ((UncaughtThrowableStrategy) (new UncaughtThrowableStrategy("THROW", 2) {

				protected void handle(Throwable throwable)
				{
					super.handle(throwable);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokespecial   #17  <Method void GlideExecutor$UncaughtThrowableStrategy.handle(Throwable)>
					if(throwable != null)
				//*   3    5:aload_1         
				//*   4    6:ifnull          20
						throw new RuntimeException("Request threw uncaught throwable", throwable);
				//    5    9:new             #19  <Class RuntimeException>
				//    6   12:dup             
				//    7   13:ldc1            #21  <String "Request threw uncaught throwable">
				//    8   15:aload_1         
				//    9   16:invokespecial   #24  <Method void RuntimeException(String, Throwable)>
				//   10   19:athrow          
					else
						return;
				//   11   20:return          
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void GlideExecutor$UncaughtThrowableStrategy(String, int, GlideExecutor$1)>
			//    5    7:return          
			}
			}
));
		//   12   26:new             #12  <Class GlideExecutor$UncaughtThrowableStrategy$2>
		//   13   29:dup             
		//   14   30:ldc1            #33  <String "THROW">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #34  <Method void GlideExecutor$UncaughtThrowableStrategy$2(String, int)>
		//   17   36:putstatic       #36  <Field GlideExecutor$UncaughtThrowableStrategy THROW>
			$VALUES = (new UncaughtThrowableStrategy[] {
				IGNORE, LOG, THROW
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       UncaughtThrowableStrategy[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #28  <Field GlideExecutor$UncaughtThrowableStrategy IGNORE>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #32  <Field GlideExecutor$UncaughtThrowableStrategy LOG>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #36  <Field GlideExecutor$UncaughtThrowableStrategy THROW>
		//   31   60:aastore         
		//   32   61:putstatic       #38  <Field GlideExecutor$UncaughtThrowableStrategy[] $VALUES>
			DEFAULT = LOG;
		//   33   64:getstatic       #32  <Field GlideExecutor$UncaughtThrowableStrategy LOG>
		//   34   67:putstatic       #40  <Field GlideExecutor$UncaughtThrowableStrategy DEFAULT>
		//*  35   70:return          
		}

		private UncaughtThrowableStrategy(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #42  <Method void Enum(String, int)>
		//    4    6:return          
		}

	}


	GlideExecutor(int i, int j, long l, String s, UncaughtThrowableStrategy uncaughtthrowablestrategy, boolean flag, 
			boolean flag1)
	{
		this(i, j, l, s, uncaughtthrowablestrategy, flag, flag1, ((BlockingQueue) (new PriorityBlockingQueue())));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:lload_3         
	//    4    4:aload           5
	//    5    6:aload           6
	//    6    8:iload           7
	//    7   10:iload           8
	//    8   12:new             #67  <Class PriorityBlockingQueue>
	//    9   15:dup             
	//   10   16:invokespecial   #69  <Method void PriorityBlockingQueue()>
	//   11   19:invokespecial   #72  <Method void GlideExecutor(int, int, long, String, GlideExecutor$UncaughtThrowableStrategy, boolean, boolean, BlockingQueue)>
	//   12   22:return          
	}

	GlideExecutor(int i, int j, long l, String s, UncaughtThrowableStrategy uncaughtthrowablestrategy, boolean flag, 
			boolean flag1, BlockingQueue blockingqueue)
	{
		super(i, j, l, TimeUnit.MILLISECONDS, blockingqueue, ((ThreadFactory) (new DefaultThreadFactory(s, uncaughtthrowablestrategy, flag))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:lload_3         
	//    4    4:getstatic       #75  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    5    7:aload           9
	//    6    9:new             #8   <Class GlideExecutor$DefaultThreadFactory>
	//    7   12:dup             
	//    8   13:aload           5
	//    9   15:aload           6
	//   10   17:iload           7
	//   11   19:invokespecial   #78  <Method void GlideExecutor$DefaultThreadFactory(String, GlideExecutor$UncaughtThrowableStrategy, boolean)>
	//   12   22:invokespecial   #81  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, BlockingQueue, ThreadFactory)>
		executeSynchronously = flag1;
	//   13   25:aload_0         
	//   14   26:iload           8
	//   15   28:putfield        #83  <Field boolean executeSynchronously>
	//   16   31:return          
	}

	GlideExecutor(int i, String s, UncaughtThrowableStrategy uncaughtthrowablestrategy, boolean flag, boolean flag1)
	{
		this(i, i, 0L, s, uncaughtthrowablestrategy, flag, flag1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_1         
	//    3    3:lconst_0        
	//    4    4:aload_2         
	//    5    5:aload_3         
	//    6    6:iload           4
	//    7    8:iload           5
	//    8   10:invokespecial   #88  <Method void GlideExecutor(int, int, long, String, GlideExecutor$UncaughtThrowableStrategy, boolean, boolean)>
	//    9   13:return          
	}

	public static int calculateBestThreadCount()
	{
		Object obj;
		android.os.StrictMode.ThreadPolicy threadpolicy;
		threadpolicy = StrictMode.allowThreadDiskReads();
	//    0    0:invokestatic    #98  <Method android.os.StrictMode$ThreadPolicy StrictMode.allowThreadDiskReads()>
	//    1    3:astore_3        
		obj = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		File afile[] = (new File("/sys/devices/system/cpu/")).listFiles(new FilenameFilter(Pattern.compile("cpu[0-9]+")) {

			public boolean accept(File file, String s)
			{
				return cpuNamePattern.matcher(((CharSequence) (s))).matches();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field Pattern val$cpuNamePattern>
			//    2    4:aload_2         
			//    3    5:invokevirtual   #29  <Method Matcher Pattern.matcher(CharSequence)>
			//    4    8:invokevirtual   #35  <Method boolean Matcher.matches()>
			//    5   11:ireturn         
			}

			final Pattern val$cpuNamePattern;

			
			{
				cpuNamePattern = pattern;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Pattern val$cpuNamePattern>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    4    6:new             #100 <Class File>
	//    5    9:dup             
	//    6   10:ldc1            #22  <String "/sys/devices/system/cpu/">
	//    7   12:invokespecial   #103 <Method void File(String)>
	//    8   15:new             #6   <Class GlideExecutor$1>
	//    9   18:dup             
	//   10   19:ldc1            #25  <String "cpu[0-9]+">
	//   11   21:invokestatic    #109 <Method Pattern Pattern.compile(String)>
	//   12   24:invokespecial   #112 <Method void GlideExecutor$1(Pattern)>
	//   13   27:invokevirtual   #116 <Method File[] File.listFiles(FilenameFilter)>
	//   14   30:astore_2        
		obj = ((Object) (afile));
	//   15   31:aload_2         
	//   16   32:astore_1        
		StrictMode.setThreadPolicy(threadpolicy);
	//   17   33:aload_3         
	//   18   34:invokestatic    #120 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		break MISSING_BLOCK_LABEL_74;
	//   19   37:goto            74
		Throwable throwable;
		throwable;
	//   20   40:astore_2        
		if(Log.isLoggable("GlideExecutor", 6))
	//*  21   41:ldc1            #44  <String "GlideExecutor">
	//*  22   43:bipush          6
	//*  23   45:invokestatic    #126 <Method boolean Log.isLoggable(String, int)>
	//*  24   48:ifeq            60
			Log.e("GlideExecutor", "Failed to calculate accurate cpu count", throwable);
	//   25   51:ldc1            #44  <String "GlideExecutor">
	//   26   53:ldc1            #128 <String "Failed to calculate accurate cpu count">
	//   27   55:aload_2         
	//   28   56:invokestatic    #132 <Method int Log.e(String, String, Throwable)>
	//   29   59:pop             
		StrictMode.setThreadPolicy(threadpolicy);
	//   30   60:aload_3         
	//   31   61:invokestatic    #120 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		break MISSING_BLOCK_LABEL_74;
	//   32   64:goto            74
		obj;
	//   33   67:astore_1        
		StrictMode.setThreadPolicy(threadpolicy);
	//   34   68:aload_3         
	//   35   69:invokestatic    #120 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		throw obj;
	//   36   72:aload_1         
	//   37   73:athrow          
		int i;
		if(obj != null)
	//*  38   74:aload_1         
	//*  39   75:ifnull          84
			i = obj.length;
	//   40   78:aload_1         
	//   41   79:arraylength     
	//   42   80:istore_0        
		else
	//*  43   81:goto            86
			i = 0;
	//   44   84:iconst_0        
	//   45   85:istore_0        
		return Math.min(4, Math.max(Math.max(1, Runtime.getRuntime().availableProcessors()), i));
	//   46   86:iconst_4        
	//   47   87:iconst_1        
	//   48   88:invokestatic    #138 <Method Runtime Runtime.getRuntime()>
	//   49   91:invokevirtual   #141 <Method int Runtime.availableProcessors()>
	//   50   94:invokestatic    #147 <Method int Math.max(int, int)>
	//   51   97:iload_0         
	//   52   98:invokestatic    #147 <Method int Math.max(int, int)>
	//   53  101:invokestatic    #150 <Method int Math.min(int, int)>
	//   54  104:ireturn         
	}

	private Future maybeWait(Future future)
	{
		boolean flag;
		if(!executeSynchronously)
			break MISSING_BLOCK_LABEL_72;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field boolean executeSynchronously>
	//    2    4:ifeq            72
		flag = false;
	//    3    7:iconst_0        
	//    4    8:istore_2        
_L2:
		boolean flag1 = future.isDone();
	//    5    9:aload_1         
	//    6   10:invokeinterface #162 <Method boolean Future.isDone()>
	//    7   15:istore_3        
		if(flag1)
			break; /* Loop/switch isn't completed */
	//    8   16:iload_3         
	//    9   17:ifne            47
		future.get();
	//   10   20:aload_1         
	//   11   21:invokeinterface #166 <Method Object Future.get()>
	//   12   26:pop             
		continue; /* Loop/switch isn't completed */
	//   13   27:goto            9
		future;
	//   14   30:astore_1        
		throw new RuntimeException(((Throwable) (future)));
	//   15   31:new             #168 <Class RuntimeException>
	//   16   34:dup             
	//   17   35:aload_1         
	//   18   36:invokespecial   #171 <Method void RuntimeException(Throwable)>
	//   19   39:athrow          
		InterruptedException interruptedexception;
		interruptedexception;
	//   20   40:astore          4
		flag = true;
	//   21   42:iconst_1        
	//   22   43:istore_2        
		if(true) goto _L2; else goto _L1
	//   23   44:goto            9
_L1:
		if(flag)
	//*  24   47:iload_2         
	//*  25   48:ifeq            72
		{
			Thread.currentThread().interrupt();
	//   26   51:invokestatic    #177 <Method Thread Thread.currentThread()>
	//   27   54:invokevirtual   #180 <Method void Thread.interrupt()>
			return future;
	//   28   57:aload_1         
	//   29   58:areturn         
		}
		break MISSING_BLOCK_LABEL_72;
		future;
	//   30   59:astore_1        
		if(flag)
	//*  31   60:iload_2         
	//*  32   61:ifeq            70
			Thread.currentThread().interrupt();
	//   33   64:invokestatic    #177 <Method Thread Thread.currentThread()>
	//   34   67:invokevirtual   #180 <Method void Thread.interrupt()>
		throw future;
	//   35   70:aload_1         
	//   36   71:athrow          
		return future;
	//   37   72:aload_1         
	//   38   73:areturn         
	}

	public static GlideExecutor newDiskCacheExecutor()
	{
		return newDiskCacheExecutor(1, "disk-cache", UncaughtThrowableStrategy.DEFAULT);
	//    0    0:iconst_1        
	//    1    1:ldc1            #28  <String "disk-cache">
	//    2    3:getstatic       #187 <Field GlideExecutor$UncaughtThrowableStrategy GlideExecutor$UncaughtThrowableStrategy.DEFAULT>
	//    3    6:invokestatic    #190 <Method GlideExecutor newDiskCacheExecutor(int, String, GlideExecutor$UncaughtThrowableStrategy)>
	//    4    9:areturn         
	}

	public static GlideExecutor newDiskCacheExecutor(int i, String s, UncaughtThrowableStrategy uncaughtthrowablestrategy)
	{
		return new GlideExecutor(i, s, uncaughtthrowablestrategy, true, false);
	//    0    0:new             #2   <Class GlideExecutor>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iconst_1        
	//    6    8:iconst_0        
	//    7    9:invokespecial   #192 <Method void GlideExecutor(int, String, GlideExecutor$UncaughtThrowableStrategy, boolean, boolean)>
	//    8   12:areturn         
	}

	public static GlideExecutor newSourceExecutor()
	{
		return newSourceExecutor(calculateBestThreadCount(), "source", UncaughtThrowableStrategy.DEFAULT);
	//    0    0:invokestatic    #195 <Method int calculateBestThreadCount()>
	//    1    3:ldc1            #34  <String "source">
	//    2    5:getstatic       #187 <Field GlideExecutor$UncaughtThrowableStrategy GlideExecutor$UncaughtThrowableStrategy.DEFAULT>
	//    3    8:invokestatic    #197 <Method GlideExecutor newSourceExecutor(int, String, GlideExecutor$UncaughtThrowableStrategy)>
	//    4   11:areturn         
	}

	public static GlideExecutor newSourceExecutor(int i, String s, UncaughtThrowableStrategy uncaughtthrowablestrategy)
	{
		return new GlideExecutor(i, s, uncaughtthrowablestrategy, false, false);
	//    0    0:new             #2   <Class GlideExecutor>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:invokespecial   #192 <Method void GlideExecutor(int, String, GlideExecutor$UncaughtThrowableStrategy, boolean, boolean)>
	//    8   12:areturn         
	}

	public static GlideExecutor newUnlimitedSourceExecutor()
	{
		return new GlideExecutor(0, 0x7fffffff, SOURCE_UNLIMITED_EXECUTOR_KEEP_ALIVE_TIME_MS, "source-unlimited", UncaughtThrowableStrategy.DEFAULT, false, false, ((BlockingQueue) (new SynchronousQueue())));
	//    0    0:new             #2   <Class GlideExecutor>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:ldc1            #199 <Int 0x7fffffff>
	//    4    7:getstatic       #62  <Field long SOURCE_UNLIMITED_EXECUTOR_KEEP_ALIVE_TIME_MS>
	//    5   10:ldc1            #41  <String "source-unlimited">
	//    6   12:getstatic       #187 <Field GlideExecutor$UncaughtThrowableStrategy GlideExecutor$UncaughtThrowableStrategy.DEFAULT>
	//    7   15:iconst_0        
	//    8   16:iconst_0        
	//    9   17:new             #201 <Class SynchronousQueue>
	//   10   20:dup             
	//   11   21:invokespecial   #202 <Method void SynchronousQueue()>
	//   12   24:invokespecial   #72  <Method void GlideExecutor(int, int, long, String, GlideExecutor$UncaughtThrowableStrategy, boolean, boolean, BlockingQueue)>
	//   13   27:areturn         
	}

	public void execute(Runnable runnable)
	{
		if(executeSynchronously)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field boolean executeSynchronously>
	//*   2    4:ifeq            14
		{
			runnable.run();
	//    3    7:aload_1         
	//    4    8:invokeinterface #209 <Method void Runnable.run()>
			return;
	//    5   13:return          
		} else
		{
			super.execute(runnable);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokespecial   #211 <Method void ThreadPoolExecutor.execute(Runnable)>
			return;
	//    9   19:return          
		}
	}

	public Future submit(Runnable runnable)
	{
		return maybeWait(super.submit(runnable));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokespecial   #216 <Method Future ThreadPoolExecutor.submit(Runnable)>
	//    4    6:invokespecial   #218 <Method Future maybeWait(Future)>
	//    5    9:areturn         
	}

	public Future submit(Runnable runnable, Object obj)
	{
		return maybeWait(super.submit(runnable, obj));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #223 <Method Future ThreadPoolExecutor.submit(Runnable, Object)>
	//    5    7:invokespecial   #218 <Method Future maybeWait(Future)>
	//    6   10:areturn         
	}

	public Future submit(Callable callable)
	{
		return maybeWait(super.submit(callable));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokespecial   #227 <Method Future ThreadPoolExecutor.submit(Callable)>
	//    4    6:invokespecial   #218 <Method Future maybeWait(Future)>
	//    5    9:areturn         
	}

	private static final String CPU_LOCATION = "/sys/devices/system/cpu/";
	private static final String CPU_NAME_REGEX = "cpu[0-9]+";
	public static final String DEFAULT_DISK_CACHE_EXECUTOR_NAME = "disk-cache";
	public static final int DEFAULT_DISK_CACHE_EXECUTOR_THREADS = 1;
	public static final String DEFAULT_SOURCE_EXECUTOR_NAME = "source";
	private static final int MAXIMUM_AUTOMATIC_THREAD_COUNT = 4;
	private static final long SOURCE_UNLIMITED_EXECUTOR_KEEP_ALIVE_TIME_MS;
	private static final String SOURCE_UNLIMITED_EXECUTOR_NAME = "source-unlimited";
	private static final String TAG = "GlideExecutor";
	private final boolean executeSynchronously;

	static 
	{
		SOURCE_UNLIMITED_EXECUTOR_KEEP_ALIVE_TIME_MS = TimeUnit.SECONDS.toMillis(10L);
	//    0    0:getstatic       #54  <Field TimeUnit TimeUnit.SECONDS>
	//    1    3:ldc2w           #55  <Long 10L>
	//    2    6:invokevirtual   #60  <Method long TimeUnit.toMillis(long)>
	//    3    9:putstatic       #62  <Field long SOURCE_UNLIMITED_EXECUTOR_KEEP_ALIVE_TIME_MS>
	//*   4   12:return          
	}
}
