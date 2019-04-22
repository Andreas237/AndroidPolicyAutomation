// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.*;
import com.firebase.client.authentication.NoopCredentialStore;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.utilities.*;
import com.firebase.tubesock.ThreadInitializer;
import com.firebase.tubesock.WebSocket;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.firebase.client.core:
//			Platform, ThreadPoolEventTarget, Context, ThreadInitializer

final class GaePlatform extends Enum
	implements Platform
{

	private GaePlatform(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #40  <Method void Enum(String, int)>
	//    4    6:return          
	}

	private static ThreadFactory getGaeThreadFactory()
	{
		if(threadFactoryInstance != null)
			break MISSING_BLOCK_LABEL_73;
	//    0    0:getstatic       #53  <Field ThreadFactory threadFactoryInstance>
	//    1    3:ifnonnull       73
		Class class1;
		try
		{
			class1 = Class.forName("com.google.appengine.api.ThreadManager");
	//    2    6:ldc1            #55  <String "com.google.appengine.api.ThreadManager">
	//    3    8:invokestatic    #61  <Method Class Class.forName(String)>
	//    4   11:astore_0        
		}
	//*   5   12:aload_0         
	//*   6   13:ifnull          73
	//*   7   16:aload_0         
	//*   8   17:ldc1            #63  <String "backgroundThreadFactory">
	//*   9   19:iconst_0        
	//*  10   20:anewarray       Class[]
	//*  11   23:invokevirtual   #67  <Method Method Class.getMethod(String, Class[])>
	//*  12   26:aconst_null     
	//*  13   27:iconst_0        
	//*  14   28:anewarray       Object[]
	//*  15   31:invokevirtual   #75  <Method Object Method.invoke(Object, Object[])>
	//*  16   34:checkcast       #77  <Class ThreadFactory>
	//*  17   37:putstatic       #53  <Field ThreadFactory threadFactoryInstance>
	//*  18   40:goto            73
	//*  19   43:astore_0        
	//*  20   44:new             #79  <Class RuntimeException>
	//*  21   47:dup             
	//*  22   48:aload_0         
	//*  23   49:invokespecial   #82  <Method void RuntimeException(Throwable)>
	//*  24   52:athrow          
	//*  25   53:astore_0        
	//*  26   54:new             #79  <Class RuntimeException>
	//*  27   57:dup             
	//*  28   58:aload_0         
	//*  29   59:invokespecial   #82  <Method void RuntimeException(Throwable)>
	//*  30   62:athrow          
	//*  31   63:astore_0        
	//*  32   64:new             #79  <Class RuntimeException>
	//*  33   67:dup             
	//*  34   68:aload_0         
	//*  35   69:invokespecial   #82  <Method void RuntimeException(Throwable)>
	//*  36   72:athrow          
	//*  37   73:getstatic       #53  <Field ThreadFactory threadFactoryInstance>
	//*  38   76:areturn         
		catch(ClassNotFoundException classnotfoundexception)
	//*  39   77:astore_0        
		{
			return null;
	//   40   78:aconst_null     
	//   41   79:areturn         
		}
		catch(InvocationTargetException invocationtargetexception)
		{
			throw new RuntimeException(((Throwable) (invocationtargetexception)));
		}
		catch(NoSuchMethodException nosuchmethodexception)
		{
			throw new RuntimeException(((Throwable) (nosuchmethodexception)));
		}
		catch(IllegalAccessException illegalaccessexception)
		{
			throw new RuntimeException(((Throwable) (illegalaccessexception)));
		}
		if(class1 == null)
			break MISSING_BLOCK_LABEL_73;
		threadFactoryInstance = (ThreadFactory)class1.getMethod("backgroundThreadFactory", new Class[0]).invoke(((Object) (null)), new Object[0]);
		return threadFactoryInstance;
	}

	public static boolean isActive()
	{
		return getGaeThreadFactory() != null;
	//    0    0:invokestatic    #86  <Method ThreadFactory getGaeThreadFactory()>
	//    1    3:ifnull          8
	//    2    6:iconst_1        
	//    3    7:ireturn         
	//    4    8:iconst_0        
	//    5    9:ireturn         
	}

	public static GaePlatform valueOf(String s)
	{
		return (GaePlatform)Enum.valueOf(com/firebase/client/core/GaePlatform, s);
	//    0    0:ldc1            #2   <Class GaePlatform>
	//    1    2:aload_0         
	//    2    3:invokestatic    #91  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class GaePlatform>
	//    4    9:areturn         
	}

	public static GaePlatform[] values()
	{
		return (GaePlatform[])((GaePlatform []) ($VALUES)).clone();
	//    0    0:getstatic       #34  <Field GaePlatform[] $VALUES>
	//    1    3:invokevirtual   #98  <Method Object _5B_Lcom.firebase.client.core.GaePlatform_3B_.clone()>
	//    2    6:checkcast       #94  <Class GaePlatform[]>
	//    3    9:areturn         
	}

	public PersistenceManager createPersistenceManager(Context context, String s)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String getPlatformVersion()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #104 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #105 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("gae-");
	//    4    8:aload_1         
	//    5    9:ldc1            #107 <String "gae-">
	//    6   11:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Firebase.getSdkVersion());
	//    8   15:aload_1         
	//    9   16:invokestatic    #116 <Method String Firebase.getSdkVersion()>
	//   10   19:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		return stringbuilder.toString();
	//   12   23:aload_1         
	//   13   24:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   14   27:areturn         
	}

	public String getUserAgent(Context context)
	{
		context = ((Context) (System.getProperty("java.specification.version", "Unknown")));
	//    0    0:ldc1            #123 <String "java.specification.version">
	//    1    2:ldc1            #125 <String "Unknown">
	//    2    4:invokestatic    #131 <Method String System.getProperty(String, String)>
	//    3    7:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #104 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #105 <Method void StringBuilder()>
	//    7   15:astore_2        
		stringbuilder.append(((String) (context)));
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append("/");
	//   12   22:aload_2         
	//   13   23:ldc1            #133 <String "/">
	//   14   25:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
		stringbuilder.append("AppEngine");
	//   16   29:aload_2         
	//   17   30:ldc1            #135 <String "AppEngine">
	//   18   32:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
		return stringbuilder.toString();
	//   20   36:aload_2         
	//   21   37:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   22   40:areturn         
	}

	public void initialize()
	{
		WebSocket.setThreadFactory(threadFactoryInstance, new ThreadInitializer() {

			public void setName(Thread thread, String s)
			{
				GaePlatform.threadInitializerInstance.setName(thread, s);
			//    0    0:getstatic       #26  <Field com.firebase.client.core.ThreadInitializer GaePlatform.threadInitializerInstance>
			//    1    3:aload_1         
			//    2    4:aload_2         
			//    3    5:invokeinterface #30  <Method void ThreadInitializer.setName(Thread, String)>
			//    4   10:return          
			}

			final GaePlatform this$0;

			
			{
				this$0 = GaePlatform.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GaePlatform this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:getstatic       #53  <Field ThreadFactory threadFactoryInstance>
	//    1    3:new             #11  <Class GaePlatform$2>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokespecial   #139 <Method void GaePlatform$2(GaePlatform)>
	//    5   11:invokestatic    #145 <Method void WebSocket.setThreadFactory(ThreadFactory, ThreadInitializer)>
	//    6   14:return          
	}

	public CredentialStore newCredentialStore(Context context)
	{
		return ((CredentialStore) (new NoopCredentialStore(context)));
	//    0    0:new             #149 <Class NoopCredentialStore>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #152 <Method void NoopCredentialStore(Context)>
	//    4    8:areturn         
	}

	public EventTarget newEventTarget(Context context)
	{
		return ((EventTarget) (new ThreadPoolEventTarget(getGaeThreadFactory(), threadInitializerInstance)));
	//    0    0:new             #156 <Class ThreadPoolEventTarget>
	//    1    3:dup             
	//    2    4:invokestatic    #86  <Method ThreadFactory getGaeThreadFactory()>
	//    3    7:getstatic       #38  <Field com.firebase.client.core.ThreadInitializer threadInitializerInstance>
	//    4   10:invokespecial   #159 <Method void ThreadPoolEventTarget(ThreadFactory, com.firebase.client.core.ThreadInitializer)>
	//    5   13:areturn         
	}

	public Logger newLogger(Context context, com.firebase.client.Logger.Level level, List list)
	{
		return ((Logger) (new DefaultLogger(level, list)));
	//    0    0:new             #163 <Class DefaultLogger>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:invokespecial   #166 <Method void DefaultLogger(com.firebase.client.Logger$Level, List)>
	//    5    9:areturn         
	}

	public RunLoop newRunLoop(Context context)
	{
		return ((RunLoop) (new DefaultRunLoop() {

			protected ThreadFactory getThreadFactory()
			{
				return GaePlatform.threadFactoryInstance;
			//    0    0:getstatic       #29  <Field ThreadFactory GaePlatform.threadFactoryInstance>
			//    1    3:areturn         
			}

			protected com.firebase.client.core.ThreadInitializer getThreadInitializer()
			{
				return GaePlatform.threadInitializerInstance;
			//    0    0:getstatic       #35  <Field com.firebase.client.core.ThreadInitializer GaePlatform.threadInitializerInstance>
			//    1    3:areturn         
			}

			public void handleException(Throwable throwable)
			{
				LogWrapper logwrapper = logger;
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field LogWrapper val$logger>
			//    2    4:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
			//    3    5:new             #39  <Class StringBuilder>
			//    4    8:dup             
			//    5    9:invokespecial   #40  <Method void StringBuilder()>
			//    6   12:astore_3        
				stringbuilder.append("Uncaught exception in Firebase runloop (");
			//    7   13:aload_3         
			//    8   14:ldc1            #42  <String "Uncaught exception in Firebase runloop (">
			//    9   16:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
			//   10   19:pop             
				stringbuilder.append(Firebase.getSdkVersion());
			//   11   20:aload_3         
			//   12   21:invokestatic    #52  <Method String Firebase.getSdkVersion()>
			//   13   24:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
			//   14   27:pop             
				stringbuilder.append("). Please report to support@firebase.com");
			//   15   28:aload_3         
			//   16   29:ldc1            #54  <String "). Please report to support@firebase.com">
			//   17   31:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
			//   18   34:pop             
				logwrapper.error(stringbuilder.toString(), throwable);
			//   19   35:aload_2         
			//   20   36:aload_3         
			//   21   37:invokevirtual   #57  <Method String StringBuilder.toString()>
			//   22   40:aload_1         
			//   23   41:invokevirtual   #63  <Method void LogWrapper.error(String, Throwable)>
			//   24   44:return          
			}

			final GaePlatform this$0;
			final LogWrapper val$logger;

			
			{
				this$0 = GaePlatform.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GaePlatform this$0>
				logger = logwrapper;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field LogWrapper val$logger>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void DefaultRunLoop()>
			//    8   14:return          
			}
		}
));
	//    0    0:new             #13  <Class GaePlatform$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #171 <String "RunLoop">
	//    5    8:invokevirtual   #177 <Method LogWrapper Context.getLogger(String)>
	//    6   11:invokespecial   #180 <Method void GaePlatform$3(GaePlatform, LogWrapper)>
	//    7   14:areturn         
	}

	public void runBackgroundTask(final Context ctx, final Runnable r)
	{
		threadFactoryInstance.newThread(new Runnable() {

			public void run()
			{
				try
				{
					r.run();
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field Runnable val$r>
			//    2    4:invokeinterface #36  <Method void Runnable.run()>
					return;
			//    3    9:return          
				}
			//*   4   10:astore_1        
			//*   5   11:aload_0         
			//*   6   12:getfield        #25  <Field Context val$ctx>
			//*   7   15:ldc1            #38  <String "BackgroundTask">
			//*   8   17:invokevirtual   #44  <Method LogWrapper Context.getLogger(String)>
			//*   9   20:ldc1            #46  <String "An unexpected error occurred. Please contact support@firebase.com. Details: ">
			//*  10   22:aload_1         
			//*  11   23:invokevirtual   #52  <Method void LogWrapper.error(String, Throwable)>
			//*  12   26:new             #54  <Class RuntimeException>
			//*  13   29:dup             
			//*  14   30:aload_1         
			//*  15   31:invokespecial   #57  <Method void RuntimeException(Throwable)>
			//*  16   34:athrow          
				catch(OutOfMemoryError outofmemoryerror)
			//*  17   35:astore_1        
				{
					throw outofmemoryerror;
			//   18   36:aload_1         
			//   19   37:athrow          
				}
				catch(Throwable throwable)
				{
					ctx.getLogger("BackgroundTask").error("An unexpected error occurred. Please contact support@firebase.com. Details: ", throwable);
					throw new RuntimeException(throwable);
				}
			}

			final GaePlatform this$0;
			final Context val$ctx;
			final Runnable val$r;

			
			{
				this$0 = GaePlatform.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GaePlatform this$0>
				r = runnable;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Runnable val$r>
				ctx = context;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Context val$ctx>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
).start();
	//    0    0:getstatic       #53  <Field ThreadFactory threadFactoryInstance>
	//    1    3:new             #15  <Class GaePlatform$4>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokespecial   #185 <Method void GaePlatform$4(GaePlatform, Runnable, Context)>
	//    7   13:invokeinterface #189 <Method Thread ThreadFactory.newThread(Runnable)>
	//    8   18:invokevirtual   #194 <Method void Thread.start()>
	//    9   21:return          
	}

	private static final GaePlatform $VALUES[];
	public static final GaePlatform INSTANCE;
	static ThreadFactory threadFactoryInstance;
	static final com.firebase.client.core.ThreadInitializer threadInitializerInstance = new com.firebase.client.core.ThreadInitializer() {

		public void setDaemon(Thread thread, boolean flag)
		{
		//    0    0:return          
		}

		public void setName(Thread thread, String s)
		{
		//    0    0:return          
		}

		public void setUncaughtExceptionHandler(Thread thread, Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
		{
			thread.setUncaughtExceptionHandler(uncaughtexceptionhandler);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #24  <Method void Thread.setUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
		//    3    5:return          
		}

	}
;

	static 
	{
		INSTANCE = new GaePlatform("INSTANCE", 0);
	//    0    0:new             #2   <Class GaePlatform>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "INSTANCE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #30  <Method void GaePlatform(String, int)>
	//    5   10:putstatic       #32  <Field GaePlatform INSTANCE>
		$VALUES = (new GaePlatform[] {
			INSTANCE
		});
	//    6   13:iconst_1        
	//    7   14:anewarray       GaePlatform[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:getstatic       #32  <Field GaePlatform INSTANCE>
	//   11   22:aastore         
	//   12   23:putstatic       #34  <Field GaePlatform[] $VALUES>
	//   13   26:new             #9   <Class GaePlatform$1>
	//   14   29:dup             
	//   15   30:invokespecial   #36  <Method void GaePlatform$1()>
	//   16   33:putstatic       #38  <Field com.firebase.client.core.ThreadInitializer threadInitializerInstance>
	//*  17   36:return          
	}
}
