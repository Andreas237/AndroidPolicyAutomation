// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.*;
import com.firebase.client.authentication.NoopCredentialStore;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.utilities.*;
import java.util.List;
import java.util.concurrent.Executors;

// Referenced classes of package com.firebase.client.core:
//			Platform, ThreadPoolEventTarget, ThreadInitializer, Context

final class JvmPlatform extends Enum
	implements Platform
{

	private JvmPlatform(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #28  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static JvmPlatform valueOf(String s)
	{
		return (JvmPlatform)Enum.valueOf(com/firebase/client/core/JvmPlatform, s);
	//    0    0:ldc1            #2   <Class JvmPlatform>
	//    1    2:aload_0         
	//    2    3:invokestatic    #34  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JvmPlatform>
	//    4    9:areturn         
	}

	public static JvmPlatform[] values()
	{
		return (JvmPlatform[])((JvmPlatform []) ($VALUES)).clone();
	//    0    0:getstatic       #26  <Field JvmPlatform[] $VALUES>
	//    1    3:invokevirtual   #41  <Method Object _5B_Lcom.firebase.client.core.JvmPlatform_3B_.clone()>
	//    2    6:checkcast       #37  <Class JvmPlatform[]>
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
	//    0    0:new             #47  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("jvm-");
	//    4    8:aload_1         
	//    5    9:ldc1            #51  <String "jvm-">
	//    6   11:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Firebase.getSdkVersion());
	//    8   15:aload_1         
	//    9   16:invokestatic    #60  <Method String Firebase.getSdkVersion()>
	//   10   19:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		return stringbuilder.toString();
	//   12   23:aload_1         
	//   13   24:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   14   27:areturn         
	}

	public String getUserAgent(Context context)
	{
		context = ((Context) (System.getProperty("java.vm.name", "Unknown JVM")));
	//    0    0:ldc1            #67  <String "java.vm.name">
	//    1    2:ldc1            #69  <String "Unknown JVM">
	//    2    4:invokestatic    #75  <Method String System.getProperty(String, String)>
	//    3    7:astore_1        
		String s = System.getProperty("java.specification.version", "Unknown");
	//    4    8:ldc1            #77  <String "java.specification.version">
	//    5   10:ldc1            #79  <String "Unknown">
	//    6   12:invokestatic    #75  <Method String System.getProperty(String, String)>
	//    7   15:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    8   16:new             #47  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #49  <Method void StringBuilder()>
	//   11   23:astore_3        
		stringbuilder.append(s);
	//   12   24:aload_3         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		stringbuilder.append("/");
	//   16   30:aload_3         
	//   17   31:ldc1            #81  <String "/">
	//   18   33:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
		stringbuilder.append(((String) (context)));
	//   20   37:aload_3         
	//   21   38:aload_1         
	//   22   39:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   23   42:pop             
		return stringbuilder.toString();
	//   24   43:aload_3         
	//   25   44:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   26   47:areturn         
	}

	public CredentialStore newCredentialStore(Context context)
	{
		return ((CredentialStore) (new NoopCredentialStore(context)));
	//    0    0:new             #85  <Class NoopCredentialStore>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #88  <Method void NoopCredentialStore(Context)>
	//    4    8:areturn         
	}

	public EventTarget newEventTarget(Context context)
	{
		return ((EventTarget) (new ThreadPoolEventTarget(Executors.defaultThreadFactory(), ThreadInitializer.defaultInstance)));
	//    0    0:new             #92  <Class ThreadPoolEventTarget>
	//    1    3:dup             
	//    2    4:invokestatic    #98  <Method java.util.concurrent.ThreadFactory Executors.defaultThreadFactory()>
	//    3    7:getstatic       #104 <Field ThreadInitializer ThreadInitializer.defaultInstance>
	//    4   10:invokespecial   #107 <Method void ThreadPoolEventTarget(java.util.concurrent.ThreadFactory, ThreadInitializer)>
	//    5   13:areturn         
	}

	public Logger newLogger(Context context, com.firebase.client.Logger.Level level, List list)
	{
		return ((Logger) (new DefaultLogger(level, list)));
	//    0    0:new             #111 <Class DefaultLogger>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:invokespecial   #114 <Method void DefaultLogger(com.firebase.client.Logger$Level, List)>
	//    5    9:areturn         
	}

	public RunLoop newRunLoop(Context context)
	{
		return ((RunLoop) (new DefaultRunLoop() {

			public void handleException(Throwable throwable)
			{
				LogWrapper logwrapper = logger;
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field LogWrapper val$logger>
			//    2    4:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
			//    3    5:new             #27  <Class StringBuilder>
			//    4    8:dup             
			//    5    9:invokespecial   #28  <Method void StringBuilder()>
			//    6   12:astore_3        
				stringbuilder.append("Uncaught exception in Firebase runloop (");
			//    7   13:aload_3         
			//    8   14:ldc1            #30  <String "Uncaught exception in Firebase runloop (">
			//    9   16:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
			//   10   19:pop             
				stringbuilder.append(Firebase.getSdkVersion());
			//   11   20:aload_3         
			//   12   21:invokestatic    #40  <Method String Firebase.getSdkVersion()>
			//   13   24:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
			//   14   27:pop             
				stringbuilder.append("). Please report to support@firebase.com");
			//   15   28:aload_3         
			//   16   29:ldc1            #42  <String "). Please report to support@firebase.com">
			//   17   31:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
			//   18   34:pop             
				logwrapper.error(stringbuilder.toString(), throwable);
			//   19   35:aload_2         
			//   20   36:aload_3         
			//   21   37:invokevirtual   #45  <Method String StringBuilder.toString()>
			//   22   40:aload_1         
			//   23   41:invokevirtual   #51  <Method void LogWrapper.error(String, Throwable)>
			//   24   44:return          
			}

			final JvmPlatform this$0;
			final LogWrapper val$logger;

			
			{
				this$0 = JvmPlatform.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field JvmPlatform this$0>
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
	//    0    0:new             #9   <Class JvmPlatform$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #119 <String "RunLoop">
	//    5    8:invokevirtual   #125 <Method LogWrapper Context.getLogger(String)>
	//    6   11:invokespecial   #128 <Method void JvmPlatform$1(JvmPlatform, LogWrapper)>
	//    7   14:areturn         
	}

	public void runBackgroundTask(final Context ctx, final Runnable r)
	{
		((_cls2) (new Thread() {

			public void run()
			{
				try
				{
					r.run();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field Runnable val$r>
			//    2    4:invokeinterface #36  <Method void Runnable.run()>
					return;
			//    3    9:return          
				}
			//*   4   10:astore_1        
			//*   5   11:aload_0         
			//*   6   12:getfield        #23  <Field Context val$ctx>
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

			final JvmPlatform this$0;
			final Context val$ctx;
			final Runnable val$r;

			
			{
				this$0 = JvmPlatform.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field JvmPlatform this$0>
				r = runnable;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Runnable val$r>
				ctx = context;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field Context val$ctx>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Thread()>
			//   11   19:return          
			}
		}
)).start();
	//    0    0:new             #11  <Class JvmPlatform$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokespecial   #133 <Method void JvmPlatform$2(JvmPlatform, Runnable, Context)>
	//    6   10:invokevirtual   #136 <Method void JvmPlatform$2.start()>
	//    7   13:return          
	}

	private static final JvmPlatform $VALUES[];
	public static final JvmPlatform INSTANCE;

	static 
	{
		INSTANCE = new JvmPlatform("INSTANCE", 0);
	//    0    0:new             #2   <Class JvmPlatform>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "INSTANCE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void JvmPlatform(String, int)>
	//    5   10:putstatic       #24  <Field JvmPlatform INSTANCE>
		$VALUES = (new JvmPlatform[] {
			INSTANCE
		});
	//    6   13:iconst_1        
	//    7   14:anewarray       JvmPlatform[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:getstatic       #24  <Field JvmPlatform INSTANCE>
	//   11   22:aastore         
	//   12   23:putstatic       #26  <Field JvmPlatform[] $VALUES>
	//*  13   26:return          
	}
}
