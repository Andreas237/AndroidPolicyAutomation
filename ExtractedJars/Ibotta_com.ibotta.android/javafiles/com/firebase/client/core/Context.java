// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.CredentialStore;
import com.firebase.client.EventTarget;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseException;
import com.firebase.client.Logger;
import com.firebase.client.RunLoop;
import com.firebase.client.core.persistence.NoopPersistenceManager;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.utilities.LogWrapper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

// Referenced classes of package com.firebase.client.core:
//			AuthExpirationBehavior, Platform, AndroidSupport, GaePlatform, 
//			JvmPlatform

public class Context
{

	public Context()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		logLevel = com.firebase.client.Logger.Level.INFO;
	//    2    4:aload_0         
	//    3    5:getstatic       #47  <Field com.firebase.client.Logger$Level com.firebase.client.Logger$Level.INFO>
	//    4    8:putfield        #49  <Field com.firebase.client.Logger$Level logLevel>
		authExpirationBehavior = AuthExpirationBehavior.DEFAULT;
	//    5   11:aload_0         
	//    6   12:getstatic       #54  <Field AuthExpirationBehavior AuthExpirationBehavior.DEFAULT>
	//    7   15:putfield        #56  <Field AuthExpirationBehavior authExpirationBehavior>
		cacheSize = 0xa00000L;
	//    8   18:aload_0         
	//    9   19:ldc2w           #7   <Long 0xa00000L>
	//   10   22:putfield        #58  <Field long cacheSize>
		frozen = false;
	//   11   25:aload_0         
	//   12   26:iconst_0        
	//   13   27:putfield        #60  <Field boolean frozen>
		stopped = false;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #62  <Field boolean stopped>
	//   17   35:return          
	}

	private String buildUserAgent(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #67  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Firebase/");
	//    4    8:aload_2         
	//    5    9:ldc1            #70  <String "Firebase/">
	//    6   11:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("5");
	//    8   15:aload_2         
	//    9   16:ldc1            #76  <String "5">
	//   10   18:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append("/");
	//   12   22:aload_2         
	//   13   23:ldc1            #78  <String "/">
	//   14   25:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
		stringbuilder.append(Firebase.getSdkVersion());
	//   16   29:aload_2         
	//   17   30:invokestatic    #84  <Method String Firebase.getSdkVersion()>
	//   18   33:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
		stringbuilder.append("/");
	//   20   37:aload_2         
	//   21   38:ldc1            #78  <String "/">
	//   22   40:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		stringbuilder.append(s);
	//   24   44:aload_2         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   27   49:pop             
		return stringbuilder.toString();
	//   28   50:aload_2         
	//   29   51:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   30   54:areturn         
	}

	private void ensureCredentialStore()
	{
		if(credentialStore == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field CredentialStore credentialStore>
	//*   2    4:ifnonnull       21
			credentialStore = getPlatform().newCredentialStore(this);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #94  <Method Platform getPlatform()>
	//    6   12:aload_0         
	//    7   13:invokeinterface #100 <Method CredentialStore Platform.newCredentialStore(Context)>
	//    8   18:putfield        #90  <Field CredentialStore credentialStore>
	//    9   21:return          
	}

	private void ensureEventTarget()
	{
		if(eventTarget == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field EventTarget eventTarget>
	//*   2    4:ifnonnull       21
			eventTarget = getPlatform().newEventTarget(this);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #94  <Method Platform getPlatform()>
	//    6   12:aload_0         
	//    7   13:invokeinterface #107 <Method EventTarget Platform.newEventTarget(Context)>
	//    8   18:putfield        #103 <Field EventTarget eventTarget>
	//    9   21:return          
	}

	private void ensureLogger()
	{
		if(logger == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field Logger logger>
	//*   2    4:ifnonnull       29
			logger = getPlatform().newLogger(this, logLevel, loggedComponents);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #94  <Method Platform getPlatform()>
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #49  <Field com.firebase.client.Logger$Level logLevel>
	//    9   17:aload_0         
	//   10   18:getfield        #112 <Field List loggedComponents>
	//   11   21:invokeinterface #116 <Method Logger Platform.newLogger(Context, com.firebase.client.Logger$Level, List)>
	//   12   26:putfield        #110 <Field Logger logger>
	//   13   29:return          
	}

	private void ensureRunLoop()
	{
		if(runLoop == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #119 <Field RunLoop runLoop>
	//*   2    4:ifnonnull       20
			runLoop = platform.newRunLoop(this);
	//    3    7:aload_0         
	//    4    8:getstatic       #121 <Field Platform platform>
	//    5   11:aload_0         
	//    6   12:invokeinterface #125 <Method RunLoop Platform.newRunLoop(Context)>
	//    7   17:putfield        #119 <Field RunLoop runLoop>
	//    8   20:return          
	}

	private void ensureSessionIdentifier()
	{
		if(persistenceKey == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field String persistenceKey>
	//*   2    4:ifnonnull       13
			persistenceKey = "default";
	//    3    7:aload_0         
	//    4    8:ldc1            #130 <String "default">
	//    5   10:putfield        #128 <Field String persistenceKey>
	//    6   13:return          
	}

	private void ensureUserAgent()
	{
		if(userAgent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #133 <Field String userAgent>
	//*   2    4:ifnonnull       25
			userAgent = buildUserAgent(getPlatform().getUserAgent(this));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokespecial   #94  <Method Platform getPlatform()>
	//    7   13:aload_0         
	//    8   14:invokeinterface #137 <Method String Platform.getUserAgent(Context)>
	//    9   19:invokespecial   #139 <Method String buildUserAgent(String)>
	//   10   22:putfield        #133 <Field String userAgent>
	//   11   25:return          
	}

	private Platform getPlatform()
	{
		if(platform == null)
	//*   0    0:getstatic       #121 <Field Platform platform>
	//*   1    3:ifnonnull       52
			if(!AndroidSupport.isAndroid())
	//*   2    6:invokestatic    #145 <Method boolean AndroidSupport.isAndroid()>
	//*   3    9:ifne            42
			{
				if(GaePlatform.isActive())
	//*   4   12:invokestatic    #150 <Method boolean GaePlatform.isActive()>
	//*   5   15:ifeq            33
				{
					GaePlatform gaeplatform = GaePlatform.INSTANCE;
	//    6   18:getstatic       #154 <Field GaePlatform GaePlatform.INSTANCE>
	//    7   21:astore_1        
					gaeplatform.initialize();
	//    8   22:aload_1         
	//    9   23:invokevirtual   #157 <Method void GaePlatform.initialize()>
					platform = ((Platform) (gaeplatform));
	//   10   26:aload_1         
	//   11   27:putstatic       #121 <Field Platform platform>
				} else
	//*  12   30:goto            52
				{
					platform = ((Platform) (JvmPlatform.INSTANCE));
	//   13   33:getstatic       #162 <Field JvmPlatform JvmPlatform.INSTANCE>
	//   14   36:putstatic       #121 <Field Platform platform>
				}
			} else
	//*  15   39:goto            52
			{
				throw new RuntimeException("You need to set the Android context using Firebase.setAndroidContext() before using Firebase.");
	//   16   42:new             #164 <Class RuntimeException>
	//   17   45:dup             
	//   18   46:ldc1            #166 <String "You need to set the Android context using Firebase.setAndroidContext() before using Firebase.">
	//   19   48:invokespecial   #169 <Method void RuntimeException(String)>
	//   20   51:athrow          
			}
		return platform;
	//   21   52:getstatic       #121 <Field Platform platform>
	//   22   55:areturn         
	}

	private void initServices()
	{
		ensureLogger();
	//    0    0:aload_0         
	//    1    1:invokespecial   #172 <Method void ensureLogger()>
		getPlatform();
	//    2    4:aload_0         
	//    3    5:invokespecial   #94  <Method Platform getPlatform()>
	//    4    8:pop             
		ensureUserAgent();
	//    5    9:aload_0         
	//    6   10:invokespecial   #174 <Method void ensureUserAgent()>
		ensureEventTarget();
	//    7   13:aload_0         
	//    8   14:invokespecial   #176 <Method void ensureEventTarget()>
		ensureRunLoop();
	//    9   17:aload_0         
	//   10   18:invokespecial   #178 <Method void ensureRunLoop()>
		ensureSessionIdentifier();
	//   11   21:aload_0         
	//   12   22:invokespecial   #180 <Method void ensureSessionIdentifier()>
		ensureCredentialStore();
	//   13   25:aload_0         
	//   14   26:invokespecial   #182 <Method void ensureCredentialStore()>
	//   15   29:return          
	}

	private void restartServices()
	{
		eventTarget.restart();
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field EventTarget eventTarget>
	//    2    4:invokeinterface #188 <Method void EventTarget.restart()>
		runLoop.restart();
	//    3    9:aload_0         
	//    4   10:getfield        #119 <Field RunLoop runLoop>
	//    5   13:invokeinterface #191 <Method void RunLoop.restart()>
	//    6   18:return          
	}

	public static void setAndroidContext(android.content.Context context)
	{
		com/firebase/client/core/Context;
	//    0    0:ldc1            #2   <Class Context>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(androidContext != null) goto _L2; else goto _L1
	//    2    3:getstatic       #205 <Field android.content.Context androidContext>
	//    3    6:ifnonnull       111
_L1:
		androidContext = context.getApplicationContext();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #211 <Method android.content.Context android.content.Context.getApplicationContext()>
	//    6   13:putstatic       #205 <Field android.content.Context androidContext>
		platform = (Platform)Class.forName("com.firebase.client.android.AndroidPlatform").getConstructor(new Class[] {
			android/content/Context
		}).newInstance(new Object[] {
			context
		});
	//    7   16:ldc1            #213 <String "com.firebase.client.android.AndroidPlatform">
	//    8   18:invokestatic    #219 <Method Class Class.forName(String)>
	//    9   21:iconst_1        
	//   10   22:anewarray       Class[]
	//   11   25:dup             
	//   12   26:iconst_0        
	//   13   27:ldc1            #207 <Class android.content.Context>
	//   14   29:aastore         
	//   15   30:invokevirtual   #223 <Method Constructor Class.getConstructor(Class[])>
	//   16   33:iconst_1        
	//   17   34:anewarray       Object[]
	//   18   37:dup             
	//   19   38:iconst_0        
	//   20   39:aload_0         
	//   21   40:aastore         
	//   22   41:invokevirtual   #229 <Method Object Constructor.newInstance(Object[])>
	//   23   44:checkcast       #96  <Class Platform>
	//   24   47:putstatic       #121 <Field Platform platform>
		  goto _L2
	//*  25   50:goto            111
		context;
	//   26   53:astore_0        
		throw new RuntimeException("Failed to instantiate AndroidPlatform class.", ((Throwable) (context)));
	//   27   54:new             #164 <Class RuntimeException>
	//   28   57:dup             
	//   29   58:ldc1            #231 <String "Failed to instantiate AndroidPlatform class.">
	//   30   60:aload_0         
	//   31   61:invokespecial   #234 <Method void RuntimeException(String, Throwable)>
	//   32   64:athrow          
		context;
	//   33   65:astore_0        
		throw new RuntimeException("Failed to instantiate AndroidPlatform class.", ((Throwable) (context)));
	//   34   66:new             #164 <Class RuntimeException>
	//   35   69:dup             
	//   36   70:ldc1            #231 <String "Failed to instantiate AndroidPlatform class.">
	//   37   72:aload_0         
	//   38   73:invokespecial   #234 <Method void RuntimeException(String, Throwable)>
	//   39   76:athrow          
		context;
	//   40   77:astore_0        
		throw new RuntimeException("Failed to instantiate AndroidPlatform class.", ((Throwable) (context)));
	//   41   78:new             #164 <Class RuntimeException>
	//   42   81:dup             
	//   43   82:ldc1            #231 <String "Failed to instantiate AndroidPlatform class.">
	//   44   84:aload_0         
	//   45   85:invokespecial   #234 <Method void RuntimeException(String, Throwable)>
	//   46   88:athrow          
		context;
	//   47   89:astore_0        
		throw new RuntimeException("Failed to instantiate AndroidPlatform class.  Using ProGuard?  See http://stackoverflow.com/questions/26273929/what-proguard-configuration-do-i-need-for-firebase-on-android", ((Throwable) (context)));
	//   48   90:new             #164 <Class RuntimeException>
	//   49   93:dup             
	//   50   94:ldc1            #236 <String "Failed to instantiate AndroidPlatform class.  Using ProGuard?  See http://stackoverflow.com/questions/26273929/what-proguard-configuration-do-i-need-for-firebase-on-android">
	//   51   96:aload_0         
	//   52   97:invokespecial   #234 <Method void RuntimeException(String, Throwable)>
	//   53  100:athrow          
_L4:
		throw new RuntimeException("Android classes not found. Are you using the firebase-client-android artifact?");
	//   54  101:new             #164 <Class RuntimeException>
	//   55  104:dup             
	//   56  105:ldc1            #238 <String "Android classes not found. Are you using the firebase-client-android artifact?">
	//   57  107:invokespecial   #169 <Method void RuntimeException(String)>
	//   58  110:athrow          
_L2:
		com/firebase/client/core/Context;
	//   59  111:ldc1            #2   <Class Context>
		JVM INSTR monitorexit ;
	//   60  113:monitorexit     
		return;
	//   61  114:return          
		context;
	//   62  115:astore_0        
	//*  63  116:ldc1            #2   <Class Context>
		throw context;
	//   64  118:monitorexit     
	//   65  119:aload_0         
	//   66  120:athrow          
		context;
	//   67  121:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//*  68  122:goto            101
	}

	protected void assertUnfrozen()
	{
		if(!isFrozen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #242 <Method boolean isFrozen()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		else
			throw new FirebaseException("Modifications to Config objects must occur before they are in use");
	//    4    8:new             #244 <Class FirebaseException>
	//    5   11:dup             
	//    6   12:ldc1            #246 <String "Modifications to Config objects must occur before they are in use">
	//    7   14:invokespecial   #247 <Method void FirebaseException(String)>
	//    8   17:athrow          
	}

	void forcePersistenceManager(PersistenceManager persistencemanager)
	{
		forcedPersistenceManager = persistencemanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #251 <Field PersistenceManager forcedPersistenceManager>
	//    3    5:return          
	}

	void freeze()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!frozen)
	//*   2    2:aload_0         
	//*   3    3:getfield        #60  <Field boolean frozen>
	//*   4    6:ifne            18
		{
			frozen = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #60  <Field boolean frozen>
			initServices();
	//    8   14:aload_0         
	//    9   15:invokespecial   #254 <Method void initServices()>
		}
		this;
	//   10   18:aload_0         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		Exception exception;
		exception;
	//   13   21:astore_1        
	//*  14   22:aload_0         
		throw exception;
	//   15   23:monitorexit     
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public AuthExpirationBehavior getAuthExpirationBehavior()
	{
		return authExpirationBehavior;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field AuthExpirationBehavior authExpirationBehavior>
	//    2    4:areturn         
	}

	public String getAuthenticationServer()
	{
		String s = authenticationServer;
	//    0    0:aload_0         
	//    1    1:getfield        #259 <Field String authenticationServer>
	//    2    4:astore_1        
		if(s == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       13
			return "https://auth.firebase.com/";
	//    5    9:ldc2            #261 <String "https://auth.firebase.com/">
	//    6   12:areturn         
		else
			return s;
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public CredentialStore getCredentialStore()
	{
		return credentialStore;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field CredentialStore credentialStore>
	//    2    4:areturn         
	}

	public EventTarget getEventTarget()
	{
		return eventTarget;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field EventTarget eventTarget>
	//    2    4:areturn         
	}

	public LogWrapper getLogger(String s)
	{
		return new LogWrapper(logger, s);
	//    0    0:new             #269 <Class LogWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #110 <Field Logger logger>
	//    4    8:aload_1         
	//    5    9:invokespecial   #272 <Method void LogWrapper(Logger, String)>
	//    6   12:areturn         
	}

	public LogWrapper getLogger(String s, String s1)
	{
		return new LogWrapper(logger, s, s1);
	//    0    0:new             #269 <Class LogWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #110 <Field Logger logger>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #276 <Method void LogWrapper(Logger, String, String)>
	//    7   13:areturn         
	}

	public long getPersistenceCacheSizeBytes()
	{
		return cacheSize;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field long cacheSize>
	//    2    4:lreturn         
	}

	PersistenceManager getPersistenceManager(String s)
	{
		PersistenceManager persistencemanager = forcedPersistenceManager;
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field PersistenceManager forcedPersistenceManager>
	//    2    4:astore_2        
		if(persistencemanager != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          11
			return persistencemanager;
	//    5    9:aload_2         
	//    6   10:areturn         
		if(persistenceEnabled)
	//*   7   11:aload_0         
	//*   8   12:getfield        #282 <Field boolean persistenceEnabled>
	//*   9   15:ifeq            46
		{
			s = ((String) (platform.createPersistenceManager(this, s)));
	//   10   18:getstatic       #121 <Field Platform platform>
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokeinterface #286 <Method PersistenceManager Platform.createPersistenceManager(Context, String)>
	//   14   28:astore_1        
			if(s != null)
	//*  15   29:aload_1         
	//*  16   30:ifnull          35
				return ((PersistenceManager) (s));
	//   17   33:aload_1         
	//   18   34:areturn         
			else
				throw new IllegalArgumentException("You have enabled persistence, but persistence is not supported on this platform.");
	//   19   35:new             #288 <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:ldc2            #290 <String "You have enabled persistence, but persistence is not supported on this platform.">
	//   22   42:invokespecial   #291 <Method void IllegalArgumentException(String)>
	//   23   45:athrow          
		} else
		{
			return ((PersistenceManager) (new NoopPersistenceManager()));
	//   24   46:new             #293 <Class NoopPersistenceManager>
	//   25   49:dup             
	//   26   50:invokespecial   #294 <Method void NoopPersistenceManager()>
	//   27   53:areturn         
		}
	}

	public String getPlatformVersion()
	{
		return getPlatform().getPlatformVersion();
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method Platform getPlatform()>
	//    2    4:invokeinterface #297 <Method String Platform.getPlatformVersion()>
	//    3    9:areturn         
	}

	public RunLoop getRunLoop()
	{
		return runLoop;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field RunLoop runLoop>
	//    2    4:areturn         
	}

	public String getSessionPersistenceKey()
	{
		return persistenceKey;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field String persistenceKey>
	//    2    4:areturn         
	}

	public String getUserAgent()
	{
		return userAgent;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field String userAgent>
	//    2    4:areturn         
	}

	public boolean isCustomAuthenticationServerSet()
	{
		return authenticationServer != null;
	//    0    0:aload_0         
	//    1    1:getfield        #259 <Field String authenticationServer>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isFrozen()
	{
		return frozen;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean frozen>
	//    2    4:ireturn         
	}

	public boolean isPersistenceEnabled()
	{
		return persistenceEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #282 <Field boolean persistenceEnabled>
	//    2    4:ireturn         
	}

	public boolean isStopped()
	{
		return stopped;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean stopped>
	//    2    4:ireturn         
	}

	public void requireStarted()
	{
		if(stopped)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field boolean stopped>
	//*   2    4:ifeq            16
		{
			restartServices();
	//    3    7:aload_0         
	//    4    8:invokespecial   #306 <Method void restartServices()>
			stopped = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #62  <Field boolean stopped>
		}
	//    8   16:return          
	}

	public void runBackgroundTask(Runnable runnable)
	{
		getPlatform().runBackgroundTask(this, runnable);
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method Platform getPlatform()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #311 <Method void Platform.runBackgroundTask(Context, Runnable)>
	//    5   11:return          
	}

	void stop()
	{
		stopped = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #62  <Field boolean stopped>
		eventTarget.shutdown();
	//    3    5:aload_0         
	//    4    6:getfield        #103 <Field EventTarget eventTarget>
	//    5    9:invokeinterface #315 <Method void EventTarget.shutdown()>
		runLoop.shutdown();
	//    6   14:aload_0         
	//    7   15:getfield        #119 <Field RunLoop runLoop>
	//    8   18:invokeinterface #316 <Method void RunLoop.shutdown()>
	//    9   23:return          
	}

	private static final long DEFAULT_CACHE_SIZE = 0xa00000L;
	private static android.content.Context androidContext;
	private static Platform platform;
	protected AuthExpirationBehavior authExpirationBehavior;
	protected String authenticationServer;
	protected long cacheSize;
	protected CredentialStore credentialStore;
	protected EventTarget eventTarget;
	private PersistenceManager forcedPersistenceManager;
	private boolean frozen;
	protected com.firebase.client.Logger.Level logLevel;
	protected List loggedComponents;
	protected Logger logger;
	protected boolean persistenceEnabled;
	protected String persistenceKey;
	protected RunLoop runLoop;
	private boolean stopped;
	protected String userAgent;
}
