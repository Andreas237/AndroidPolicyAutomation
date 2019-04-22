// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.android;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.firebase.client.CredentialStore;
import com.firebase.client.EventTarget;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseException;
import com.firebase.client.Logger;
import com.firebase.client.RunLoop;
import com.firebase.client.core.Platform;
import com.firebase.client.core.persistence.DefaultPersistenceManager;
import com.firebase.client.core.persistence.LRUCachePolicy;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.utilities.DefaultRunLoop;
import com.firebase.client.utilities.LogWrapper;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.firebase.client.android:
//			SqlPersistenceStorageEngine, AndroidCredentialStore, AndroidEventTarget, AndroidLogger

public class AndroidPlatform
	implements Platform
{

	public AndroidPlatform(Context context)
	{
label0:
		{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
			createdPersistenceCaches = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #32  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void HashSet()>
	//    6   12:putfield        #35  <Field Set createdPersistenceCaches>
			applicationContext = context.getApplicationContext();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #41  <Method Context Context.getApplicationContext()>
	//   10   20:putfield        #43  <Field Context applicationContext>
			synchronized(mutex)
	//*  11   23:getstatic       #28  <Field Object mutex>
	//*  12   26:astore_1        
	//*  13   27:aload_1         
	//*  14   28:monitorenter    
			{
				if(platform != null)
					break label0;
	//   15   29:getstatic       #45  <Field AndroidPlatform platform>
	//   16   32:ifnonnull       42
				platform = this;
	//   17   35:aload_0         
	//   18   36:putstatic       #45  <Field AndroidPlatform platform>
			}
	//   19   39:aload_1         
	//   20   40:monitorexit     
			return;
	//   21   41:return          
		}
		throw new IllegalStateException("Created more than one AndroidPlatform instance!");
	//   22   42:new             #47  <Class IllegalStateException>
	//   23   45:dup             
	//   24   46:ldc1            #49  <String "Created more than one AndroidPlatform instance!">
	//   25   48:invokespecial   #52  <Method void IllegalStateException(String)>
	//   26   51:athrow          
		exception;
	//   27   52:astore_2        
		context;
	//   28   53:aload_1         
		JVM INSTR monitorexit ;
	//   29   54:monitorexit     
		throw exception;
	//   30   55:aload_2         
	//   31   56:athrow          
	}

	public PersistenceManager createPersistenceManager(com.firebase.client.core.Context context, String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s1;
		s1 = context.getSessionPersistenceKey();
	//    2    2:aload_1         
	//    3    3:invokevirtual   #62  <Method String com.firebase.client.core.Context.getSessionPersistenceKey()>
	//    4    6:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    5    7:new             #64  <Class StringBuilder>
	//    6   10:dup             
	//    7   11:invokespecial   #65  <Method void StringBuilder()>
	//    8   14:astore          4
		stringbuilder.append(s);
	//    9   16:aload           4
	//   10   18:aload_2         
	//   11   19:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   12   22:pop             
		stringbuilder.append("_");
	//   13   23:aload           4
	//   14   25:ldc1            #71  <String "_">
	//   15   27:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(s1);
	//   17   31:aload           4
	//   18   33:aload_3         
	//   19   34:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		s = stringbuilder.toString();
	//   21   38:aload           4
	//   22   40:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   23   43:astore_2        
		if(createdPersistenceCaches.contains(((Object) (s))))
			break MISSING_BLOCK_LABEL_105;
	//   24   44:aload_0         
	//   25   45:getfield        #35  <Field Set createdPersistenceCaches>
	//   26   48:aload_2         
	//   27   49:invokeinterface #80  <Method boolean Set.contains(Object)>
	//   28   54:ifne            105
		createdPersistenceCaches.add(((Object) (s)));
	//   29   57:aload_0         
	//   30   58:getfield        #35  <Field Set createdPersistenceCaches>
	//   31   61:aload_2         
	//   32   62:invokeinterface #83  <Method boolean Set.add(Object)>
	//   33   67:pop             
		context = ((com.firebase.client.core.Context) (new DefaultPersistenceManager(context, ((com.firebase.client.core.persistence.PersistenceStorageEngine) (new SqlPersistenceStorageEngine(applicationContext, context, s))), ((com.firebase.client.core.persistence.CachePolicy) (new LRUCachePolicy(context.getPersistenceCacheSizeBytes()))))));
	//   34   68:new             #85  <Class DefaultPersistenceManager>
	//   35   71:dup             
	//   36   72:aload_1         
	//   37   73:new             #87  <Class SqlPersistenceStorageEngine>
	//   38   76:dup             
	//   39   77:aload_0         
	//   40   78:getfield        #43  <Field Context applicationContext>
	//   41   81:aload_1         
	//   42   82:aload_2         
	//   43   83:invokespecial   #90  <Method void SqlPersistenceStorageEngine(Context, com.firebase.client.core.Context, String)>
	//   44   86:new             #92  <Class LRUCachePolicy>
	//   45   89:dup             
	//   46   90:aload_1         
	//   47   91:invokevirtual   #96  <Method long com.firebase.client.core.Context.getPersistenceCacheSizeBytes()>
	//   48   94:invokespecial   #99  <Method void LRUCachePolicy(long)>
	//   49   97:invokespecial   #102 <Method void DefaultPersistenceManager(com.firebase.client.core.Context, com.firebase.client.core.persistence.PersistenceStorageEngine, com.firebase.client.core.persistence.CachePolicy)>
	//   50  100:astore_1        
		this;
	//   51  101:aload_0         
		JVM INSTR monitorexit ;
	//   52  102:monitorexit     
		return ((PersistenceManager) (context));
	//   53  103:aload_1         
	//   54  104:areturn         
		context = ((com.firebase.client.core.Context) (new StringBuilder()));
	//   55  105:new             #64  <Class StringBuilder>
	//   56  108:dup             
	//   57  109:invokespecial   #65  <Method void StringBuilder()>
	//   58  112:astore_1        
		((StringBuilder) (context)).append("SessionPersistenceKey '");
	//   59  113:aload_1         
	//   60  114:ldc1            #104 <String "SessionPersistenceKey '">
	//   61  116:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   62  119:pop             
		((StringBuilder) (context)).append(s1);
	//   63  120:aload_1         
	//   64  121:aload_3         
	//   65  122:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   66  125:pop             
		((StringBuilder) (context)).append("' has already been used.");
	//   67  126:aload_1         
	//   68  127:ldc1            #106 <String "' has already been used.">
	//   69  129:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   70  132:pop             
		throw new FirebaseException(((StringBuilder) (context)).toString());
	//   71  133:new             #108 <Class FirebaseException>
	//   72  136:dup             
	//   73  137:aload_1         
	//   74  138:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   75  141:invokespecial   #109 <Method void FirebaseException(String)>
	//   76  144:athrow          
		context;
	//   77  145:astore_1        
		this;
	//   78  146:aload_0         
		JVM INSTR monitorexit ;
	//   79  147:monitorexit     
		throw context;
	//   80  148:aload_1         
	//   81  149:athrow          
	}

	public String getPlatformVersion()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #64  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("android-");
	//    4    8:aload_1         
	//    5    9:ldc1            #112 <String "android-">
	//    6   11:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Firebase.getSdkVersion());
	//    8   15:aload_1         
	//    9   16:invokestatic    #117 <Method String Firebase.getSdkVersion()>
	//   10   19:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		return stringbuilder.toString();
	//   12   23:aload_1         
	//   13   24:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   14   27:areturn         
	}

	public String getUserAgent(com.firebase.client.core.Context context)
	{
		context = ((com.firebase.client.core.Context) (new StringBuilder()));
	//    0    0:new             #64  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (context)).append(android.os.Build.VERSION.SDK_INT);
	//    4    8:aload_1         
	//    5    9:getstatic       #125 <Field int android.os.Build$VERSION.SDK_INT>
	//    6   12:invokevirtual   #128 <Method StringBuilder StringBuilder.append(int)>
	//    7   15:pop             
		((StringBuilder) (context)).append("/Android");
	//    8   16:aload_1         
	//    9   17:ldc1            #130 <String "/Android">
	//   10   19:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		return ((StringBuilder) (context)).toString();
	//   12   23:aload_1         
	//   13   24:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   14   27:areturn         
	}

	public CredentialStore newCredentialStore(com.firebase.client.core.Context context)
	{
		return ((CredentialStore) (new AndroidCredentialStore(applicationContext)));
	//    0    0:new             #134 <Class AndroidCredentialStore>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field Context applicationContext>
	//    4    8:invokespecial   #136 <Method void AndroidCredentialStore(Context)>
	//    5   11:areturn         
	}

	public EventTarget newEventTarget(com.firebase.client.core.Context context)
	{
		return ((EventTarget) (new AndroidEventTarget()));
	//    0    0:new             #140 <Class AndroidEventTarget>
	//    1    3:dup             
	//    2    4:invokespecial   #141 <Method void AndroidEventTarget()>
	//    3    7:areturn         
	}

	public Logger newLogger(com.firebase.client.core.Context context, com.firebase.client.Logger.Level level, List list)
	{
		return ((Logger) (new AndroidLogger(level, list)));
	//    0    0:new             #145 <Class AndroidLogger>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:invokespecial   #148 <Method void AndroidLogger(com.firebase.client.Logger$Level, List)>
	//    5    9:areturn         
	}

	public RunLoop newRunLoop(com.firebase.client.core.Context context)
	{
		return ((RunLoop) (new DefaultRunLoop() {

			public void handleException(Throwable throwable)
			{
				final String message = ((String) (new StringBuilder()));
			//    0    0:new             #29  <Class StringBuilder>
			//    1    3:dup             
			//    2    4:invokespecial   #30  <Method void StringBuilder()>
			//    3    7:astore_2        
				((StringBuilder) (message)).append("Uncaught exception in Firebase runloop (");
			//    4    8:aload_2         
			//    5    9:ldc1            #32  <String "Uncaught exception in Firebase runloop (">
			//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
			//    7   14:pop             
				((StringBuilder) (message)).append(Firebase.getSdkVersion());
			//    8   15:aload_2         
			//    9   16:invokestatic    #42  <Method String Firebase.getSdkVersion()>
			//   10   19:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
			//   11   22:pop             
				((StringBuilder) (message)).append("). Please report to support@firebase.com");
			//   12   23:aload_2         
			//   13   24:ldc1            #44  <String "). Please report to support@firebase.com">
			//   14   26:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
			//   15   29:pop             
				message = ((StringBuilder) (message)).toString();
			//   16   30:aload_2         
			//   17   31:invokevirtual   #47  <Method String StringBuilder.toString()>
			//   18   34:astore_2        
				logger.error(message, throwable);
			//   19   35:aload_0         
			//   20   36:getfield        #21  <Field LogWrapper val$logger>
			//   21   39:aload_2         
			//   22   40:aload_1         
			//   23   41:invokevirtual   #53  <Method void LogWrapper.error(String, Throwable)>
				(new Handler(applicationContext.getMainLooper())).post(((_cls1) (throwable)). new Runnable() {

					public void run()
					{
						throw new RuntimeException(message, e);
					//    0    0:new             #32  <Class RuntimeException>
					//    1    3:dup             
					//    2    4:aload_0         
					//    3    5:getfield        #23  <Field String val$message>
					//    4    8:aload_0         
					//    5    9:getfield        #25  <Field Throwable val$e>
					//    6   12:invokespecial   #35  <Method void RuntimeException(String, Throwable)>
					//    7   15:athrow          
					}

					final _cls1 this$1;
					final Throwable val$e;
					final String val$message;

			
			{
				this$1 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AndroidPlatform$1 this$1>
				message = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String val$message>
				e = Throwable.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Throwable val$e>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
				}
);
			//   24   44:new             #55  <Class Handler>
			//   25   47:dup             
			//   26   48:aload_0         
			//   27   49:getfield        #19  <Field AndroidPlatform this$0>
			//   28   52:invokestatic    #59  <Method Context AndroidPlatform.access$000(AndroidPlatform)>
			//   29   55:invokevirtual   #65  <Method android.os.Looper Context.getMainLooper()>
			//   30   58:invokespecial   #68  <Method void Handler(android.os.Looper)>
			//   31   61:new             #11  <Class AndroidPlatform$1$1>
			//   32   64:dup             
			//   33   65:aload_0         
			//   34   66:aload_2         
			//   35   67:aload_1         
			//   36   68:invokespecial   #71  <Method void AndroidPlatform$1$1(AndroidPlatform$1, String, Throwable)>
			//   37   71:invokevirtual   #75  <Method boolean Handler.post(Runnable)>
			//   38   74:pop             
			//   39   75:return          
			}

			final AndroidPlatform this$0;
			final LogWrapper val$logger;

			
			{
				this$0 = AndroidPlatform.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AndroidPlatform this$0>
				logger = logwrapper;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field LogWrapper val$logger>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void DefaultRunLoop()>
			//    8   14:return          
			}
		}
));
	//    0    0:new             #8   <Class AndroidPlatform$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #154 <String "RunLoop">
	//    5    8:invokevirtual   #158 <Method LogWrapper com.firebase.client.core.Context.getLogger(String)>
	//    6   11:invokespecial   #161 <Method void AndroidPlatform$1(AndroidPlatform, LogWrapper)>
	//    7   14:areturn         
	}

	public void runBackgroundTask(com.firebase.client.core.Context context, final Runnable r)
	{
		((_cls2) (new Thread() {

			public void run()
			{
				try
				{
					r.run();
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field Runnable val$r>
			//    2    4:invokeinterface #32  <Method void Runnable.run()>
					return;
			//    3    9:return          
				}
			//*   4   10:astore_1        
			//*   5   11:ldc1            #34  <String "Firebase">
			//*   6   13:ldc1            #36  <String "An unexpected error occurred. Please contact support@firebase.com. Details: ">
			//*   7   15:aload_1         
			//*   8   16:invokestatic    #42  <Method int Log.e(String, String, Throwable)>
			//*   9   19:pop             
			//*  10   20:new             #44  <Class RuntimeException>
			//*  11   23:dup             
			//*  12   24:aload_1         
			//*  13   25:invokespecial   #47  <Method void RuntimeException(Throwable)>
			//*  14   28:athrow          
				catch(OutOfMemoryError outofmemoryerror)
			//*  15   29:astore_1        
				{
					throw outofmemoryerror;
			//   16   30:aload_1         
			//   17   31:athrow          
				}
				catch(Throwable throwable)
				{
					Log.e("Firebase", "An unexpected error occurred. Please contact support@firebase.com. Details: ", throwable);
					throw new RuntimeException(throwable);
				}
			}

			final AndroidPlatform this$0;
			final Runnable val$r;

			
			{
				this$0 = AndroidPlatform.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AndroidPlatform this$0>
				r = runnable;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field Runnable val$r>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void Thread()>
			//    8   14:return          
			}
		}
)).start();
	//    0    0:new             #12  <Class AndroidPlatform$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokespecial   #166 <Method void AndroidPlatform$2(AndroidPlatform, Runnable)>
	//    5    9:invokevirtual   #169 <Method void AndroidPlatform$2.start()>
	//    6   12:return          
	}

	private static final Object mutex = new Object();
	private static AndroidPlatform platform;
	private final Context applicationContext;
	private final Set createdPersistenceCaches;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void Object()>
	//    3    7:putstatic       #28  <Field Object mutex>
	//*   4   10:return          
	}


/*
	static Context access$000(AndroidPlatform androidplatform)
	{
		return androidplatform.applicationContext;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Context applicationContext>
	//    2    4:areturn         
	}

*/
}
