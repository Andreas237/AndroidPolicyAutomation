// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.*;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.internal.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.*;
import org.json.JSONException;

// Referenced classes of package com.facebook.appevents:
//			AccessTokenAppIdPair, AnalyticsUserIDStore, FlushReason, AppEventQueue, 
//			AppEvent

public class AppEventsLogger
{
	public static final class FlushBehavior extends Enum
	{

		public static FlushBehavior valueOf(String s)
		{
			return (FlushBehavior)Enum.valueOf(com/facebook/appevents/AppEventsLogger$FlushBehavior, s);
		//    0    0:ldc1            #2   <Class AppEventsLogger$FlushBehavior>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AppEventsLogger$FlushBehavior>
		//    4    9:areturn         
		}

		public static FlushBehavior[] values()
		{
			return (FlushBehavior[])((FlushBehavior []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field AppEventsLogger$FlushBehavior[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.appevents.AppEventsLogger$FlushBehavior_3B_.clone()>
		//    2    6:checkcast       #38  <Class AppEventsLogger$FlushBehavior[]>
		//    3    9:areturn         
		}

		private static final FlushBehavior $VALUES[];
		public static final FlushBehavior AUTO;
		public static final FlushBehavior EXPLICIT_ONLY;

		static 
		{
			AUTO = new FlushBehavior("AUTO", 0);
		//    0    0:new             #2   <Class AppEventsLogger$FlushBehavior>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "AUTO">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void AppEventsLogger$FlushBehavior(String, int)>
		//    5   10:putstatic       #22  <Field AppEventsLogger$FlushBehavior AUTO>
			EXPLICIT_ONLY = new FlushBehavior("EXPLICIT_ONLY", 1);
		//    6   13:new             #2   <Class AppEventsLogger$FlushBehavior>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "EXPLICIT_ONLY">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void AppEventsLogger$FlushBehavior(String, int)>
		//   11   23:putstatic       #25  <Field AppEventsLogger$FlushBehavior EXPLICIT_ONLY>
			$VALUES = (new FlushBehavior[] {
				AUTO, EXPLICIT_ONLY
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       FlushBehavior[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field AppEventsLogger$FlushBehavior AUTO>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field AppEventsLogger$FlushBehavior EXPLICIT_ONLY>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field AppEventsLogger$FlushBehavior[] $VALUES>
		//*  23   45:return          
		}

		private FlushBehavior(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	private AppEventsLogger(Context context, String s, AccessToken accesstoken)
	{
		this(Utility.getActivityName(context), s, accesstoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #55  <Method String Utility.getActivityName(Context)>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #58  <Method void AppEventsLogger(String, String, AccessToken)>
	//    6   10:return          
	}

	protected AppEventsLogger(String s, String s1, AccessToken accesstoken)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		Validate.sdkInitialized();
	//    2    4:invokestatic    #63  <Method void Validate.sdkInitialized()>
		contextName = s;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #65  <Field String contextName>
		s = ((String) (accesstoken));
	//    6   12:aload_3         
	//    7   13:astore_1        
		if(accesstoken == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       22
			s = ((String) (AccessToken.getCurrentAccessToken()));
	//   10   18:invokestatic    #71  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   11   21:astore_1        
		if(AccessToken.isCurrentAccessTokenActive() && (s1 == null || s1.equals(((Object) (((AccessToken) (s)).getApplicationId())))))
	//*  12   22:invokestatic    #75  <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//*  13   25:ifeq            58
	//*  14   28:aload_2         
	//*  15   29:ifnull          43
	//*  16   32:aload_2         
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #78  <Method String AccessToken.getApplicationId()>
	//*  19   37:invokevirtual   #84  <Method boolean String.equals(Object)>
	//*  20   40:ifeq            58
		{
			accessTokenAppId = new AccessTokenAppIdPair(((AccessToken) (s)));
	//   21   43:aload_0         
	//   22   44:new             #86  <Class AccessTokenAppIdPair>
	//   23   47:dup             
	//   24   48:aload_1         
	//   25   49:invokespecial   #89  <Method void AccessTokenAppIdPair(AccessToken)>
	//   26   52:putfield        #91  <Field AccessTokenAppIdPair accessTokenAppId>
		} else
	//*  27   55:goto            84
		{
			s = s1;
	//   28   58:aload_2         
	//   29   59:astore_1        
			if(s1 == null)
	//*  30   60:aload_2         
	//*  31   61:ifnonnull       71
				s = Utility.getMetadataApplicationId(FacebookSdk.getApplicationContext());
	//   32   64:invokestatic    #97  <Method Context FacebookSdk.getApplicationContext()>
	//   33   67:invokestatic    #100 <Method String Utility.getMetadataApplicationId(Context)>
	//   34   70:astore_1        
			accessTokenAppId = new AccessTokenAppIdPair(((String) (null)), s);
	//   35   71:aload_0         
	//   36   72:new             #86  <Class AccessTokenAppIdPair>
	//   37   75:dup             
	//   38   76:aconst_null     
	//   39   77:aload_1         
	//   40   78:invokespecial   #103 <Method void AccessTokenAppIdPair(String, String)>
	//   41   81:putfield        #91  <Field AccessTokenAppIdPair accessTokenAppId>
		}
		initializeTimersIfNeeded();
	//   42   84:invokestatic    #106 <Method void initializeTimersIfNeeded()>
	//   43   87:return          
	}

	public static void activateApp(Application application, String s)
	{
		if(FacebookSdk.isInitialized())
	//*   0    0:invokestatic    #111 <Method boolean FacebookSdk.isInitialized()>
	//*   1    3:ifeq            30
		{
			AnalyticsUserIDStore.initStore();
	//    2    6:invokestatic    #116 <Method void AnalyticsUserIDStore.initStore()>
			String s1 = s;
	//    3    9:aload_1         
	//    4   10:astore_2        
			if(s == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       19
				s1 = FacebookSdk.getApplicationId();
	//    7   15:invokestatic    #117 <Method String FacebookSdk.getApplicationId()>
	//    8   18:astore_2        
			FacebookSdk.publishInstallAsync(((Context) (application)), s1);
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:invokestatic    #121 <Method void FacebookSdk.publishInstallAsync(Context, String)>
			ActivityLifecycleTracker.startTracking(application, s1);
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:invokestatic    #126 <Method void ActivityLifecycleTracker.startTracking(Application, String)>
			return;
	//   15   29:return          
		} else
		{
			throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
	//   16   30:new             #128 <Class FacebookException>
	//   17   33:dup             
	//   18   34:ldc1            #130 <String "The Facebook sdk must be initialized before calling activateApp">
	//   19   36:invokespecial   #133 <Method void FacebookException(String)>
	//   20   39:athrow          
		}
	}

	static void eagerFlush()
	{
		if(getFlushBehavior() != FlushBehavior.EXPLICIT_ONLY)
	//*   0    0:invokestatic    #138 <Method AppEventsLogger$FlushBehavior getFlushBehavior()>
	//*   1    3:getstatic       #141 <Field AppEventsLogger$FlushBehavior AppEventsLogger$FlushBehavior.EXPLICIT_ONLY>
	//*   2    6:if_acmpeq       15
			AppEventQueue.flush(FlushReason.EAGER_FLUSHING_EVENT);
	//    3    9:getstatic       #147 <Field FlushReason FlushReason.EAGER_FLUSHING_EVENT>
	//    4   12:invokestatic    #153 <Method void AppEventQueue.flush(FlushReason)>
	//    5   15:return          
	}

	static Executor getAnalyticsExecutor()
	{
		if(backgroundExecutor == null)
	//*   0    0:getstatic       #157 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//*   1    3:ifnonnull       9
			initializeTimersIfNeeded();
	//    2    6:invokestatic    #106 <Method void initializeTimersIfNeeded()>
		return ((Executor) (backgroundExecutor));
	//    3    9:getstatic       #157 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//    4   12:areturn         
	}

	public static String getAnonymousAppDeviceGUID(Context context)
	{
		if(anonymousAppDeviceGUID == null)
	//*   0    0:getstatic       #160 <Field String anonymousAppDeviceGUID>
	//*   1    3:ifnonnull       112
			synchronized(staticLock)
	//*   2    6:getstatic       #47  <Field Object staticLock>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:monitorenter    
			{
				if(anonymousAppDeviceGUID == null)
	//*   6   12:getstatic       #160 <Field String anonymousAppDeviceGUID>
	//*   7   15:ifnonnull       102
				{
					anonymousAppDeviceGUID = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", ((String) (null)));
	//    8   18:aload_0         
	//    9   19:ldc1            #162 <String "com.facebook.sdk.appEventPreferences">
	//   10   21:iconst_0        
	//   11   22:invokevirtual   #168 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   12   25:ldc1            #169 <String "anonymousAppDeviceGUID">
	//   13   27:aconst_null     
	//   14   28:invokeinterface #175 <Method String SharedPreferences.getString(String, String)>
	//   15   33:putstatic       #160 <Field String anonymousAppDeviceGUID>
					if(anonymousAppDeviceGUID == null)
	//*  16   36:getstatic       #160 <Field String anonymousAppDeviceGUID>
	//*  17   39:ifnonnull       102
					{
						StringBuilder stringbuilder = new StringBuilder();
	//   18   42:new             #177 <Class StringBuilder>
	//   19   45:dup             
	//   20   46:invokespecial   #178 <Method void StringBuilder()>
	//   21   49:astore_2        
						stringbuilder.append("XZ");
	//   22   50:aload_2         
	//   23   51:ldc1            #180 <String "XZ">
	//   24   53:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   25   56:pop             
						stringbuilder.append(UUID.randomUUID().toString());
	//   26   57:aload_2         
	//   27   58:invokestatic    #190 <Method UUID UUID.randomUUID()>
	//   28   61:invokevirtual   #193 <Method String UUID.toString()>
	//   29   64:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   30   67:pop             
						anonymousAppDeviceGUID = stringbuilder.toString();
	//   31   68:aload_2         
	//   32   69:invokevirtual   #194 <Method String StringBuilder.toString()>
	//   33   72:putstatic       #160 <Field String anonymousAppDeviceGUID>
						context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", anonymousAppDeviceGUID).apply();
	//   34   75:aload_0         
	//   35   76:ldc1            #162 <String "com.facebook.sdk.appEventPreferences">
	//   36   78:iconst_0        
	//   37   79:invokevirtual   #168 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   38   82:invokeinterface #198 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   39   87:ldc1            #169 <String "anonymousAppDeviceGUID">
	//   40   89:getstatic       #160 <Field String anonymousAppDeviceGUID>
	//   41   92:invokeinterface #204 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   42   97:invokeinterface #207 <Method void android.content.SharedPreferences$Editor.apply()>
					}
				}
			}
	//   43  102:aload_1         
	//   44  103:monitorexit     
		break MISSING_BLOCK_LABEL_112;
	//   45  104:goto            112
		context;
	//   46  107:astore_0        
		obj;
	//   47  108:aload_1         
		JVM INSTR monitorexit ;
	//   48  109:monitorexit     
		throw context;
	//   49  110:aload_0         
	//   50  111:athrow          
		return anonymousAppDeviceGUID;
	//   51  112:getstatic       #160 <Field String anonymousAppDeviceGUID>
	//   52  115:areturn         
	}

	public static FlushBehavior getFlushBehavior()
	{
		FlushBehavior flushbehavior;
		synchronized(staticLock)
	//*   0    0:getstatic       #47  <Field Object staticLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			flushbehavior = flushBehavior;
	//    4    6:getstatic       #42  <Field AppEventsLogger$FlushBehavior flushBehavior>
	//    5    9:astore_1        
		}
	//    6   10:aload_0         
	//    7   11:monitorexit     
		return flushbehavior;
	//    8   12:aload_1         
	//    9   13:areturn         
		exception;
	//   10   14:astore_1        
		obj;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	static String getPushNotificationsRegistrationId()
	{
		String s;
		synchronized(staticLock)
	//*   0    0:getstatic       #47  <Field Object staticLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			s = pushNotificationsRegistrationId;
	//    4    6:getstatic       #210 <Field String pushNotificationsRegistrationId>
	//    5    9:astore_1        
		}
	//    6   10:aload_0         
	//    7   11:monitorexit     
		return s;
	//    8   12:aload_1         
	//    9   13:areturn         
		exception;
	//   10   14:astore_1        
		obj;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public static String getUserID()
	{
		return AnalyticsUserIDStore.getUserID();
	//    0    0:invokestatic    #213 <Method String AnalyticsUserIDStore.getUserID()>
	//    1    3:areturn         
	}

	public static void initializeLib(Context context, String s)
	{
		if(!FacebookSdk.getAutoLogAppEventsEnabled())
	//*   0    0:invokestatic    #217 <Method boolean FacebookSdk.getAutoLogAppEventsEnabled()>
	//*   1    3:ifne            7
		{
			return;
	//    2    6:return          
		} else
		{
			context = ((Context) (new AppEventsLogger(context, s, ((AccessToken) (null)))));
	//    3    7:new             #2   <Class AppEventsLogger>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aconst_null     
	//    8   14:invokespecial   #219 <Method void AppEventsLogger(Context, String, AccessToken)>
	//    9   17:astore_0        
			backgroundExecutor.execute(new Runnable(((AppEventsLogger) (context))) {

				public void run()
				{
					Bundle bundle = new Bundle();
				//    0    0:new             #26  <Class Bundle>
				//    1    3:dup             
				//    2    4:invokespecial   #27  <Method void Bundle()>
				//    3    7:astore_1        
					try
					{
						Class.forName("com.facebook.core.Core");
				//    4    8:ldc1            #29  <String "com.facebook.core.Core">
				//    5   10:invokestatic    #35  <Method Class Class.forName(String)>
				//    6   13:pop             
						bundle.putInt("core_lib_included", 1);
				//    7   14:aload_1         
				//    8   15:ldc1            #37  <String "core_lib_included">
				//    9   17:iconst_1        
				//   10   18:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
					}
				//*  11   21:ldc1            #43  <String "com.facebook.login.Login">
				//*  12   23:invokestatic    #35  <Method Class Class.forName(String)>
				//*  13   26:pop             
				//*  14   27:aload_1         
				//*  15   28:ldc1            #45  <String "login_lib_included">
				//*  16   30:iconst_1        
				//*  17   31:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
				//*  18   34:ldc1            #47  <String "com.facebook.share.Share">
				//*  19   36:invokestatic    #35  <Method Class Class.forName(String)>
				//*  20   39:pop             
				//*  21   40:aload_1         
				//*  22   41:ldc1            #49  <String "share_lib_included">
				//*  23   43:iconst_1        
				//*  24   44:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
				//*  25   47:ldc1            #51  <String "com.facebook.places.Places">
				//*  26   49:invokestatic    #35  <Method Class Class.forName(String)>
				//*  27   52:pop             
				//*  28   53:aload_1         
				//*  29   54:ldc1            #53  <String "places_lib_included">
				//*  30   56:iconst_1        
				//*  31   57:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
				//*  32   60:ldc1            #55  <String "com.facebook.messenger.Messenger">
				//*  33   62:invokestatic    #35  <Method Class Class.forName(String)>
				//*  34   65:pop             
				//*  35   66:aload_1         
				//*  36   67:ldc1            #57  <String "messenger_lib_included">
				//*  37   69:iconst_1        
				//*  38   70:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
				//*  39   73:ldc1            #59  <String "com.facebook.applinks.AppLinks">
				//*  40   75:invokestatic    #35  <Method Class Class.forName(String)>
				//*  41   78:pop             
				//*  42   79:aload_1         
				//*  43   80:ldc1            #61  <String "applinks_lib_included">
				//*  44   82:iconst_1        
				//*  45   83:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
				//*  46   86:ldc1            #63  <String "com.facebook.all.All">
				//*  47   88:invokestatic    #35  <Method Class Class.forName(String)>
				//*  48   91:pop             
				//*  49   92:aload_1         
				//*  50   93:ldc1            #65  <String "all_lib_included">
				//*  51   95:iconst_1        
				//*  52   96:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
				//*  53   99:aload_0         
				//*  54  100:getfield        #17  <Field AppEventsLogger val$logger>
				//*  55  103:ldc1            #67  <String "fb_sdk_initialize">
				//*  56  105:aconst_null     
				//*  57  106:aload_1         
				//*  58  107:invokevirtual   #71  <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
				//*  59  110:return          
					catch(ClassNotFoundException classnotfoundexception) { }
				//   60  111:astore_2        
					try
					{
						Class.forName("com.facebook.login.Login");
						bundle.putInt("login_lib_included", 1);
					}
				//*  61  112:goto            21
					catch(ClassNotFoundException classnotfoundexception1) { }
				//   62  115:astore_2        
					try
					{
						Class.forName("com.facebook.share.Share");
						bundle.putInt("share_lib_included", 1);
					}
				//*  63  116:goto            34
					catch(ClassNotFoundException classnotfoundexception2) { }
				//   64  119:astore_2        
					try
					{
						Class.forName("com.facebook.places.Places");
						bundle.putInt("places_lib_included", 1);
					}
				//*  65  120:goto            47
					catch(ClassNotFoundException classnotfoundexception3) { }
				//   66  123:astore_2        
					try
					{
						Class.forName("com.facebook.messenger.Messenger");
						bundle.putInt("messenger_lib_included", 1);
					}
				//*  67  124:goto            60
					catch(ClassNotFoundException classnotfoundexception4) { }
				//   68  127:astore_2        
					try
					{
						Class.forName("com.facebook.applinks.AppLinks");
						bundle.putInt("applinks_lib_included", 1);
					}
				//*  69  128:goto            73
					catch(ClassNotFoundException classnotfoundexception5) { }
				//   70  131:astore_2        
					try
					{
						Class.forName("com.facebook.all.All");
						bundle.putInt("all_lib_included", 1);
					}
				//*  71  132:goto            86
					catch(ClassNotFoundException classnotfoundexception6) { }
				//   72  135:astore_2        
					logger.logSdkEvent("fb_sdk_initialize", ((Double) (null)), bundle);
				//*  73  136:goto            99
				}

				final AppEventsLogger val$logger;

			
			{
				logger = appeventslogger;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppEventsLogger val$logger>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   10   18:getstatic       #157 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//   11   21:new             #6   <Class AppEventsLogger$3>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #222 <Method void AppEventsLogger$3(AppEventsLogger)>
	//   15   29:invokevirtual   #228 <Method void ScheduledThreadPoolExecutor.execute(Runnable)>
			return;
	//   16   32:return          
		}
	}

	private static void initializeTimersIfNeeded()
	{
label0:
		{
			synchronized(staticLock)
	//*   0    0:getstatic       #47  <Field Object staticLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
			{
				if(backgroundExecutor == null)
					break label0;
	//    4    6:getstatic       #157 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//    5    9:ifnull          15
			}
	//    6   12:aload_0         
	//    7   13:monitorexit     
			return;
	//    8   14:return          
		}
		backgroundExecutor = new ScheduledThreadPoolExecutor(1);
	//    9   15:new             #224 <Class ScheduledThreadPoolExecutor>
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:invokespecial   #231 <Method void ScheduledThreadPoolExecutor(int)>
	//   13   23:putstatic       #157 <Field ScheduledThreadPoolExecutor backgroundExecutor>
		obj;
	//   14   26:aload_0         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		obj = ((Object) (new Runnable() {

			public void run()
			{
				Object obj1 = ((Object) (new HashSet()));
			//    0    0:new             #18  <Class HashSet>
			//    1    3:dup             
			//    2    4:invokespecial   #19  <Method void HashSet()>
			//    3    7:astore_1        
				for(Iterator iterator = AppEventQueue.getKeySet().iterator(); iterator.hasNext(); ((Set) (obj1)).add(((Object) (((AccessTokenAppIdPair)iterator.next()).getApplicationId()))));
			//    4    8:invokestatic    #25  <Method Set AppEventQueue.getKeySet()>
			//    5   11:invokeinterface #31  <Method Iterator Set.iterator()>
			//    6   16:astore_2        
			//    7   17:aload_2         
			//    8   18:invokeinterface #37  <Method boolean Iterator.hasNext()>
			//    9   23:ifeq            48
			//   10   26:aload_1         
			//   11   27:aload_2         
			//   12   28:invokeinterface #41  <Method Object Iterator.next()>
			//   13   33:checkcast       #43  <Class AccessTokenAppIdPair>
			//   14   36:invokevirtual   #47  <Method String AccessTokenAppIdPair.getApplicationId()>
			//   15   39:invokeinterface #51  <Method boolean Set.add(Object)>
			//   16   44:pop             
			//*  17   45:goto            17
				for(obj1 = ((Object) (((Set) (obj1)).iterator())); ((Iterator) (obj1)).hasNext(); FetchedAppSettingsManager.queryAppSettings((String)((Iterator) (obj1)).next(), true));
			//   18   48:aload_1         
			//   19   49:invokeinterface #31  <Method Iterator Set.iterator()>
			//   20   54:astore_1        
			//   21   55:aload_1         
			//   22   56:invokeinterface #37  <Method boolean Iterator.hasNext()>
			//   23   61:ifeq            81
			//   24   64:aload_1         
			//   25   65:invokeinterface #41  <Method Object Iterator.next()>
			//   26   70:checkcast       #53  <Class String>
			//   27   73:iconst_1        
			//   28   74:invokestatic    #59  <Method com.facebook.internal.FetchedAppSettings FetchedAppSettingsManager.queryAppSettings(String, boolean)>
			//   29   77:pop             
			//*  30   78:goto            55
			//   31   81:return          
			}

		}
));
	//   16   28:new             #8   <Class AppEventsLogger$5>
	//   17   31:dup             
	//   18   32:invokespecial   #232 <Method void AppEventsLogger$5()>
	//   19   35:astore_0        
		backgroundExecutor.scheduleAtFixedRate(((Runnable) (obj)), 0L, 0x15180L, TimeUnit.SECONDS);
	//   20   36:getstatic       #157 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//   21   39:aload_0         
	//   22   40:lconst_0        
	//   23   41:ldc2w           #233 <Long 0x15180L>
	//   24   44:getstatic       #240 <Field TimeUnit TimeUnit.SECONDS>
	//   25   47:invokevirtual   #244 <Method java.util.concurrent.ScheduledFuture ScheduledThreadPoolExecutor.scheduleAtFixedRate(Runnable, long, long, TimeUnit)>
	//   26   50:pop             
		return;
	//   27   51:return          
		exception;
	//   28   52:astore_1        
		obj;
	//   29   53:aload_0         
		JVM INSTR monitorexit ;
	//   30   54:monitorexit     
		throw exception;
	//   31   55:aload_1         
	//   32   56:athrow          
	}

	private static void logEvent(Context context, AppEvent appevent, AccessTokenAppIdPair accesstokenappidpair)
	{
		AppEventQueue.add(accesstokenappidpair, appevent);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokestatic    #250 <Method void AppEventQueue.add(AccessTokenAppIdPair, AppEvent)>
		if(!appevent.getIsImplicit() && !isActivateAppEventRequested)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #255 <Method boolean AppEvent.getIsImplicit()>
	//*   5    9:ifne            45
	//*   6   12:getstatic       #257 <Field boolean isActivateAppEventRequested>
	//*   7   15:ifne            45
		{
			if(appevent.getName() == "fb_mobile_activate_app")
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #260 <Method String AppEvent.getName()>
	//*  10   22:ldc2            #262 <String "fb_mobile_activate_app">
	//*  11   25:if_acmpne       33
			{
				isActivateAppEventRequested = true;
	//   12   28:iconst_1        
	//   13   29:putstatic       #257 <Field boolean isActivateAppEventRequested>
				return;
	//   14   32:return          
			}
			Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
	//   15   33:getstatic       #268 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   16   36:ldc2            #270 <String "AppEvents">
	//   17   39:ldc2            #272 <String "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.">
	//   18   42:invokestatic    #278 <Method void Logger.log(LoggingBehavior, String, String)>
		}
	//   19   45:return          
	}

	private void logEvent(String s, Double double1, Bundle bundle, boolean flag, UUID uuid)
	{
		try
		{
			s = ((String) (new AppEvent(contextName, s, double1, bundle, flag, uuid)));
	//    0    0:new             #252 <Class AppEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field String contextName>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:iload           4
	//    8   13:aload           5
	//    9   15:invokespecial   #285 <Method void AppEvent(String, String, Double, Bundle, boolean, UUID)>
	//   10   18:astore_1        
			logEvent(FacebookSdk.getApplicationContext(), ((AppEvent) (s)), accessTokenAppId);
	//   11   19:invokestatic    #97  <Method Context FacebookSdk.getApplicationContext()>
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #91  <Field AccessTokenAppIdPair accessTokenAppId>
	//   15   27:invokestatic    #287 <Method void logEvent(Context, AppEvent, AccessTokenAppIdPair)>
			return;
	//   16   30:return          
		}
	//*  17   31:astore_1        
	//*  18   32:getstatic       #268 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//*  19   35:ldc2            #270 <String "AppEvents">
	//*  20   38:ldc2            #289 <String "Invalid app event: %s">
	//*  21   41:iconst_1        
	//*  22   42:anewarray       Object[]
	//*  23   45:dup             
	//*  24   46:iconst_0        
	//*  25   47:aload_1         
	//*  26   48:invokevirtual   #290 <Method String FacebookException.toString()>
	//*  27   51:aastore         
	//*  28   52:invokestatic    #293 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
	//*  29   55:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  30   56:astore_1        
		{
			Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", new Object[] {
				((JSONException) (s)).toString()
			});
	//   31   57:getstatic       #268 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   32   60:ldc2            #270 <String "AppEvents">
	//   33   63:ldc2            #295 <String "JSON encoding for app event failed: '%s'">
	//   34   66:iconst_1        
	//   35   67:anewarray       Object[]
	//   36   70:dup             
	//   37   71:iconst_0        
	//   38   72:aload_1         
	//   39   73:invokevirtual   #296 <Method String JSONException.toString()>
	//   40   76:aastore         
	//   41   77:invokestatic    #293 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", new Object[] {
				((FacebookException) (s)).toString()
			});
			return;
		}
	//   42   80:return          
	}

	private void logPurchase(BigDecimal bigdecimal, Currency currency, Bundle bundle, boolean flag)
	{
		if(bigdecimal == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			notifyDeveloperError("purchaseAmount cannot be null");
	//    2    4:ldc2            #301 <String "purchaseAmount cannot be null">
	//    3    7:invokestatic    #304 <Method void notifyDeveloperError(String)>
			return;
	//    4   10:return          
		}
		if(currency == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       22
		{
			notifyDeveloperError("currency cannot be null");
	//    7   15:ldc2            #306 <String "currency cannot be null">
	//    8   18:invokestatic    #304 <Method void notifyDeveloperError(String)>
			return;
	//    9   21:return          
		}
		if(bundle == null)
	//*  10   22:aload_3         
	//*  11   23:ifnonnull       37
			bundle = new Bundle();
	//   12   26:new             #308 <Class Bundle>
	//   13   29:dup             
	//   14   30:invokespecial   #309 <Method void Bundle()>
	//   15   33:astore_3        
	//*  16   34:goto            37
		bundle.putString("fb_currency", currency.getCurrencyCode());
	//   17   37:aload_3         
	//   18   38:ldc2            #311 <String "fb_currency">
	//   19   41:aload_2         
	//   20   42:invokevirtual   #316 <Method String Currency.getCurrencyCode()>
	//   21   45:invokevirtual   #318 <Method void Bundle.putString(String, String)>
		logEvent("fb_mobile_purchase", Double.valueOf(bigdecimal.doubleValue()), bundle, flag, ActivityLifecycleTracker.getCurrentSessionGuid());
	//   22   48:aload_0         
	//   23   49:ldc2            #320 <String "fb_mobile_purchase">
	//   24   52:aload_1         
	//   25   53:invokevirtual   #326 <Method double BigDecimal.doubleValue()>
	//   26   56:invokestatic    #332 <Method Double Double.valueOf(double)>
	//   27   59:aload_3         
	//   28   60:iload           4
	//   29   62:invokestatic    #335 <Method UUID ActivityLifecycleTracker.getCurrentSessionGuid()>
	//   30   65:invokespecial   #337 <Method void logEvent(String, Double, Bundle, boolean, UUID)>
		eagerFlush();
	//   31   68:invokestatic    #339 <Method void eagerFlush()>
	//   32   71:return          
	}

	public static AppEventsLogger newLogger(Context context)
	{
		return new AppEventsLogger(context, ((String) (null)), ((AccessToken) (null)));
	//    0    0:new             #2   <Class AppEventsLogger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokespecial   #219 <Method void AppEventsLogger(Context, String, AccessToken)>
	//    6   10:areturn         
	}

	public static AppEventsLogger newLogger(Context context, String s)
	{
		return new AppEventsLogger(context, s, ((AccessToken) (null)));
	//    0    0:new             #2   <Class AppEventsLogger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #219 <Method void AppEventsLogger(Context, String, AccessToken)>
	//    6   10:areturn         
	}

	private static void notifyDeveloperError(String s)
	{
		Logger.log(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", s);
	//    0    0:getstatic       #345 <Field LoggingBehavior LoggingBehavior.DEVELOPER_ERRORS>
	//    1    3:ldc2            #270 <String "AppEvents">
	//    2    6:aload_0         
	//    3    7:invokestatic    #278 <Method void Logger.log(LoggingBehavior, String, String)>
	//    4   10:return          
	}

	public static void onContextStop()
	{
		AppEventQueue.persistToDisk();
	//    0    0:invokestatic    #349 <Method void AppEventQueue.persistToDisk()>
	//    1    3:return          
	}

	public void flush()
	{
		AppEventQueue.flush(FlushReason.EXPLICIT);
	//    0    0:getstatic       #352 <Field FlushReason FlushReason.EXPLICIT>
	//    1    3:invokestatic    #153 <Method void AppEventQueue.flush(FlushReason)>
	//    2    6:return          
	}

	public void logEvent(String s, double d, Bundle bundle)
	{
		logEvent(s, Double.valueOf(d), bundle, false, ActivityLifecycleTracker.getCurrentSessionGuid());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:invokestatic    #332 <Method Double Double.valueOf(double)>
	//    4    6:aload           4
	//    5    8:iconst_0        
	//    6    9:invokestatic    #335 <Method UUID ActivityLifecycleTracker.getCurrentSessionGuid()>
	//    7   12:invokespecial   #337 <Method void logEvent(String, Double, Bundle, boolean, UUID)>
	//    8   15:return          
	}

	public void logEvent(String s, Bundle bundle)
	{
		logEvent(s, ((Double) (null)), bundle, false, ActivityLifecycleTracker.getCurrentSessionGuid());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:iconst_0        
	//    5    5:invokestatic    #335 <Method UUID ActivityLifecycleTracker.getCurrentSessionGuid()>
	//    6    8:invokespecial   #337 <Method void logEvent(String, Double, Bundle, boolean, UUID)>
	//    7   11:return          
	}

	public void logPurchaseImplicitly(BigDecimal bigdecimal, Currency currency, Bundle bundle)
	{
		logPurchase(bigdecimal, currency, bundle, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokespecial   #358 <Method void logPurchase(BigDecimal, Currency, Bundle, boolean)>
	//    6    8:return          
	}

	public void logSdkEvent(String s, Double double1, Bundle bundle)
	{
		logEvent(s, double1, bundle, true, ActivityLifecycleTracker.getCurrentSessionGuid());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokestatic    #335 <Method UUID ActivityLifecycleTracker.getCurrentSessionGuid()>
	//    6    8:invokespecial   #337 <Method void logEvent(String, Double, Bundle, boolean, UUID)>
	//    7   11:return          
	}

	private static final String TAG = ((Class) (com/facebook/appevents/AppEventsLogger)).getCanonicalName();
	private static String anonymousAppDeviceGUID;
	private static ScheduledThreadPoolExecutor backgroundExecutor;
	private static FlushBehavior flushBehavior;
	private static boolean isActivateAppEventRequested;
	private static String pushNotificationsRegistrationId;
	private static Object staticLock = new Object();
	private final AccessTokenAppIdPair accessTokenAppId;
	private final String contextName;

	static 
	{
	//    0    0:ldc1            #2   <Class AppEventsLogger>
	//    1    2:invokevirtual   #35  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #37  <Field String TAG>
		flushBehavior = FlushBehavior.AUTO;
	//    3    8:getstatic       #40  <Field AppEventsLogger$FlushBehavior AppEventsLogger$FlushBehavior.AUTO>
	//    4   11:putstatic       #42  <Field AppEventsLogger$FlushBehavior flushBehavior>
	//    5   14:new             #4   <Class Object>
	//    6   17:dup             
	//    7   18:invokespecial   #45  <Method void Object()>
	//    8   21:putstatic       #47  <Field Object staticLock>
	//*   9   24:return          
	}
}
