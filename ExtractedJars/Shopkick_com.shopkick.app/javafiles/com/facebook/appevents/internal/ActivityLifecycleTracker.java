// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.facebook.*;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.*;
import com.facebook.internal.*;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.appevents.internal:
//			SessionInfo, Constants, AppEventUtility, SessionLogger, 
//			AutomaticAnalyticsLogger

public class ActivityLifecycleTracker
{

	public ActivityLifecycleTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void Object()>
	//    2    4:return          
	}

	private static void cancelCurrentTask()
	{
		synchronized(currentFutureLock)
	//*   0    0:getstatic       #77  <Field Object currentFutureLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			if(currentFuture != null)
	//*   4    6:getstatic       #153 <Field ScheduledFuture currentFuture>
	//*   5    9:ifnull          22
				currentFuture.cancel(false);
	//    6   12:getstatic       #153 <Field ScheduledFuture currentFuture>
	//    7   15:iconst_0        
	//    8   16:invokeinterface #165 <Method boolean ScheduledFuture.cancel(boolean)>
	//    9   21:pop             
			currentFuture = null;
	//   10   22:aconst_null     
	//   11   23:putstatic       #153 <Field ScheduledFuture currentFuture>
		}
	//   12   26:aload_0         
	//   13   27:monitorexit     
		return;
	//   14   28:return          
		exception;
	//   15   29:astore_1        
		obj;
	//   16   30:aload_0         
		JVM INSTR monitorexit ;
	//   17   31:monitorexit     
		throw exception;
	//   18   32:aload_1         
	//   19   33:athrow          
	}

	public static void checkCodelessSession(String s)
	{
		if(isCheckingSession.booleanValue())
	//*   0    0:getstatic       #113 <Field Boolean isCheckingSession>
	//*   1    3:invokevirtual   #171 <Method boolean Boolean.booleanValue()>
	//*   2    6:ifeq            10
		{
			return;
	//    3    9:return          
		} else
		{
			isCheckingSession = Boolean.valueOf(true);
	//    4   10:iconst_1        
	//    5   11:invokestatic    #109 <Method Boolean Boolean.valueOf(boolean)>
	//    6   14:putstatic       #113 <Field Boolean isCheckingSession>
			FacebookSdk.getExecutor().execute(new Runnable(s) {

				public void run()
				{
					Object obj = ((Object) (Locale.US));
				//    0    0:getstatic       #27  <Field Locale Locale.US>
				//    1    3:astore_2        
					boolean flag = true;
				//    2    4:iconst_1        
				//    3    5:istore_1        
					GraphRequest graphrequest = GraphRequest.newPostRequest(((com.facebook.AccessToken) (null)), String.format(((Locale) (obj)), "%s/app_indexing_session", new Object[] {
						applicationId
					}), ((JSONObject) (null)), ((com.facebook.GraphRequest.Callback) (null)));
				//    4    6:aconst_null     
				//    5    7:aload_2         
				//    6    8:ldc1            #29  <String "%s/app_indexing_session">
				//    7   10:iconst_1        
				//    8   11:anewarray       Object[]
				//    9   14:dup             
				//   10   15:iconst_0        
				//   11   16:aload_0         
				//   12   17:getfield        #16  <Field String val$applicationId>
				//   13   20:aastore         
				//   14   21:invokestatic    #35  <Method String String.format(Locale, String, Object[])>
				//   15   24:aconst_null     
				//   16   25:aconst_null     
				//   17   26:invokestatic    #41  <Method GraphRequest GraphRequest.newPostRequest(com.facebook.AccessToken, String, JSONObject, com.facebook.GraphRequest$Callback)>
				//   18   29:astore          4
					Object obj1 = ((Object) (graphrequest.getParameters()));
				//   19   31:aload           4
				//   20   33:invokevirtual   #45  <Method Bundle GraphRequest.getParameters()>
				//   21   36:astore_3        
					obj = obj1;
				//   22   37:aload_3         
				//   23   38:astore_2        
					if(obj1 == null)
				//*  24   39:aload_3         
				//*  25   40:ifnonnull       51
						obj = ((Object) (new Bundle()));
				//   26   43:new             #47  <Class Bundle>
				//   27   46:dup             
				//   28   47:invokespecial   #48  <Method void Bundle()>
				//   29   50:astore_2        
					Object obj2 = ((Object) (AttributionIdentifiers.getAttributionIdentifiers(FacebookSdk.getApplicationContext())));
				//   30   51:invokestatic    #54  <Method Context FacebookSdk.getApplicationContext()>
				//   31   54:invokestatic    #60  <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(Context)>
				//   32   57:astore          6
					JSONArray jsonarray = new JSONArray();
				//   33   59:new             #62  <Class JSONArray>
				//   34   62:dup             
				//   35   63:invokespecial   #63  <Method void JSONArray()>
				//   36   66:astore          5
					if(Build.MODEL != null)
				//*  37   68:getstatic       #68  <Field String Build.MODEL>
				//*  38   71:ifnull          81
						obj1 = ((Object) (Build.MODEL));
				//   39   74:getstatic       #68  <Field String Build.MODEL>
				//   40   77:astore_3        
					else
				//*  41   78:goto            84
						obj1 = "";
				//   42   81:ldc1            #70  <String "">
				//   43   83:astore_3        
					jsonarray.put(obj1);
				//   44   84:aload           5
				//   45   86:aload_3         
				//   46   87:invokevirtual   #74  <Method JSONArray JSONArray.put(Object)>
				//   47   90:pop             
					if(obj2 != null && ((AttributionIdentifiers) (obj2)).getAndroidAdvertiserId() != null)
				//*  48   91:aload           6
				//*  49   93:ifnull          118
				//*  50   96:aload           6
				//*  51   98:invokevirtual   #78  <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
				//*  52  101:ifnull          118
						jsonarray.put(((Object) (((AttributionIdentifiers) (obj2)).getAndroidAdvertiserId())));
				//   53  104:aload           5
				//   54  106:aload           6
				//   55  108:invokevirtual   #78  <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
				//   56  111:invokevirtual   #74  <Method JSONArray JSONArray.put(Object)>
				//   57  114:pop             
					else
				//*  58  115:goto            126
						jsonarray.put("");
				//   59  118:aload           5
				//   60  120:ldc1            #70  <String "">
				//   61  122:invokevirtual   #74  <Method JSONArray JSONArray.put(Object)>
				//   62  125:pop             
					jsonarray.put("0");
				//   63  126:aload           5
				//   64  128:ldc1            #80  <String "0">
				//   65  130:invokevirtual   #74  <Method JSONArray JSONArray.put(Object)>
				//   66  133:pop             
					if(AppEventUtility.isEmulator())
				//*  67  134:invokestatic    #86  <Method boolean AppEventUtility.isEmulator()>
				//*  68  137:ifeq            146
						obj1 = "1";
				//   69  140:ldc1            #88  <String "1">
				//   70  142:astore_3        
					else
				//*  71  143:goto            149
						obj1 = "0";
				//   72  146:ldc1            #80  <String "0">
				//   73  148:astore_3        
					jsonarray.put(obj1);
				//   74  149:aload           5
				//   75  151:aload_3         
				//   76  152:invokevirtual   #74  <Method JSONArray JSONArray.put(Object)>
				//   77  155:pop             
					obj1 = ((Object) (Utility.getCurrentLocale()));
				//   78  156:invokestatic    #94  <Method Locale Utility.getCurrentLocale()>
				//   79  159:astore_3        
					obj2 = ((Object) (new StringBuilder()));
				//   80  160:new             #96  <Class StringBuilder>
				//   81  163:dup             
				//   82  164:invokespecial   #97  <Method void StringBuilder()>
				//   83  167:astore          6
					((StringBuilder) (obj2)).append(((Locale) (obj1)).getLanguage());
				//   84  169:aload           6
				//   85  171:aload_3         
				//   86  172:invokevirtual   #100 <Method String Locale.getLanguage()>
				//   87  175:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
				//   88  178:pop             
					((StringBuilder) (obj2)).append("_");
				//   89  179:aload           6
				//   90  181:ldc1            #106 <String "_">
				//   91  183:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
				//   92  186:pop             
					((StringBuilder) (obj2)).append(((Locale) (obj1)).getCountry());
				//   93  187:aload           6
				//   94  189:aload_3         
				//   95  190:invokevirtual   #109 <Method String Locale.getCountry()>
				//   96  193:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
				//   97  196:pop             
					jsonarray.put(((Object) (((StringBuilder) (obj2)).toString())));
				//   98  197:aload           5
				//   99  199:aload           6
				//  100  201:invokevirtual   #112 <Method String StringBuilder.toString()>
				//  101  204:invokevirtual   #74  <Method JSONArray JSONArray.put(Object)>
				//  102  207:pop             
					obj1 = ((Object) (jsonarray.toString()));
				//  103  208:aload           5
				//  104  210:invokevirtual   #113 <Method String JSONArray.toString()>
				//  105  213:astore_3        
					((Bundle) (obj)).putString("device_session_id", ActivityLifecycleTracker.getCurrentDeviceSessionID());
				//  106  214:aload_2         
				//  107  215:ldc1            #115 <String "device_session_id">
				//  108  217:invokestatic    #118 <Method String ActivityLifecycleTracker.getCurrentDeviceSessionID()>
				//  109  220:invokevirtual   #122 <Method void Bundle.putString(String, String)>
					((Bundle) (obj)).putString("extinfo", ((String) (obj1)));
				//  110  223:aload_2         
				//  111  224:ldc1            #124 <String "extinfo">
				//  112  226:aload_3         
				//  113  227:invokevirtual   #122 <Method void Bundle.putString(String, String)>
					graphrequest.setParameters(((Bundle) (obj)));
				//  114  230:aload           4
				//  115  232:aload_2         
				//  116  233:invokevirtual   #128 <Method void GraphRequest.setParameters(Bundle)>
					if(graphrequest != null)
				//* 117  236:aload           4
				//* 118  238:ifnull          300
					{
						JSONObject jsonobject = graphrequest.executeAndWait().getJSONObject();
				//  119  241:aload           4
				//  120  243:invokevirtual   #132 <Method GraphResponse GraphRequest.executeAndWait()>
				//  121  246:invokevirtual   #138 <Method JSONObject GraphResponse.getJSONObject()>
				//  122  249:astore_2        
						if(jsonobject == null || !jsonobject.optBoolean("is_app_indexing_enabled", false))
				//* 123  250:aload_2         
				//* 124  251:ifnull          267
				//* 125  254:aload_2         
				//* 126  255:ldc1            #140 <String "is_app_indexing_enabled">
				//* 127  257:iconst_0        
				//* 128  258:invokevirtual   #146 <Method boolean JSONObject.optBoolean(String, boolean)>
				//* 129  261:ifeq            267
				//* 130  264:goto            269
							flag = false;
				//  131  267:iconst_0        
				//  132  268:istore_1        
						ActivityLifecycleTracker.isAppIndexingEnabled = Boolean.valueOf(flag);
				//  133  269:iload_1         
				//  134  270:invokestatic    #152 <Method Boolean Boolean.valueOf(boolean)>
				//  135  273:invokestatic    #156 <Method Boolean ActivityLifecycleTracker.access$1002(Boolean)>
				//  136  276:pop             
						if(!ActivityLifecycleTracker.isAppIndexingEnabled.booleanValue())
				//* 137  277:invokestatic    #160 <Method Boolean ActivityLifecycleTracker.access$1000()>
				//* 138  280:invokevirtual   #163 <Method boolean Boolean.booleanValue()>
				//* 139  283:ifne            294
							ActivityLifecycleTracker.deviceSessionID = null;
				//  140  286:aconst_null     
				//  141  287:invokestatic    #167 <Method String ActivityLifecycleTracker.access$1102(String)>
				//  142  290:pop             
						else
				//* 143  291:goto            300
							ActivityLifecycleTracker.viewIndexer.schedule();
				//  144  294:invokestatic    #171 <Method ViewIndexer ActivityLifecycleTracker.access$1200()>
				//  145  297:invokevirtual   #176 <Method void ViewIndexer.schedule()>
					}
					ActivityLifecycleTracker.isCheckingSession = Boolean.valueOf(false);
				//  146  300:iconst_0        
				//  147  301:invokestatic    #152 <Method Boolean Boolean.valueOf(boolean)>
				//  148  304:invokestatic    #179 <Method Boolean ActivityLifecycleTracker.access$1302(Boolean)>
				//  149  307:pop             
				//  150  308:return          
				}

				final String val$applicationId;

			
			{
				applicationId = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field String val$applicationId>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    7   17:invokestatic    #177 <Method Executor FacebookSdk.getExecutor()>
	//    8   20:new             #18  <Class ActivityLifecycleTracker$6>
	//    9   23:dup             
	//   10   24:aload_0         
	//   11   25:invokespecial   #179 <Method void ActivityLifecycleTracker$6(String)>
	//   12   28:invokeinterface #185 <Method void Executor.execute(Runnable)>
			return;
	//   13   33:return          
		}
	}

	public static String getCurrentDeviceSessionID()
	{
		if(deviceSessionID == null)
	//*   0    0:getstatic       #103 <Field String deviceSessionID>
	//*   1    3:ifnonnull       15
			deviceSessionID = UUID.randomUUID().toString();
	//    2    6:invokestatic    #192 <Method UUID UUID.randomUUID()>
	//    3    9:invokevirtual   #195 <Method String UUID.toString()>
	//    4   12:putstatic       #103 <Field String deviceSessionID>
		return deviceSessionID;
	//    5   15:getstatic       #103 <Field String deviceSessionID>
	//    6   18:areturn         
	}

	public static UUID getCurrentSessionGuid()
	{
		if(currentSession != null)
	//*   0    0:getstatic       #135 <Field SessionInfo currentSession>
	//*   1    3:ifnull          13
			return currentSession.getSessionId();
	//    2    6:getstatic       #135 <Field SessionInfo currentSession>
	//    3    9:invokevirtual   #201 <Method UUID SessionInfo.getSessionId()>
	//    4   12:areturn         
		else
			return null;
	//    5   13:aconst_null     
	//    6   14:areturn         
	}

	public static boolean getIsAppIndexingEnabled()
	{
		return isAppIndexingEnabled.booleanValue();
	//    0    0:getstatic       #111 <Field Boolean isAppIndexingEnabled>
	//    1    3:invokevirtual   #171 <Method boolean Boolean.booleanValue()>
	//    2    6:ireturn         
	}

	private static int getSessionTimeoutInSeconds()
	{
		FetchedAppSettings fetchedappsettings = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
	//    0    0:invokestatic    #205 <Method String FacebookSdk.getApplicationId()>
	//    1    3:invokestatic    #211 <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
	//    2    6:astore_0        
		if(fetchedappsettings == null)
	//*   3    7:aload_0         
	//*   4    8:ifnonnull       15
			return Constants.getDefaultAppEventsSessionTimeoutInSeconds();
	//    5   11:invokestatic    #216 <Method int Constants.getDefaultAppEventsSessionTimeoutInSeconds()>
	//    6   14:ireturn         
		else
			return fetchedappsettings.getSessionTimeoutInSeconds();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #219 <Method int FetchedAppSettings.getSessionTimeoutInSeconds()>
	//    9   19:ireturn         
	}

	public static boolean isTracking()
	{
		return tracking.get();
	//    0    0:getstatic       #91  <Field AtomicBoolean tracking>
	//    1    3:invokevirtual   #223 <Method boolean AtomicBoolean.get()>
	//    2    6:ireturn         
	}

	public static void onActivityCreated(Activity activity)
	{
		System.currentTimeMillis();
	//    0    0:invokestatic    #229 <Method long System.currentTimeMillis()>
	//    1    3:pop2            
		activity.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #235 <Method Context Activity.getApplicationContext()>
	//    4    8:pop             
		Utility.getActivityName(((Context) (activity)));
	//    5    9:aload_0         
	//    6   10:invokestatic    #241 <Method String Utility.getActivityName(Context)>
	//    7   13:pop             
		SourceApplicationInfo.Factory.create(activity);
	//    8   14:aload_0         
	//    9   15:invokestatic    #247 <Method SourceApplicationInfo SourceApplicationInfo$Factory.create(Activity)>
	//   10   18:pop             
		activity = ((Activity) (new Runnable() {

			public void run()
			{
				if(ActivityLifecycleTracker.currentSession == null)
			//*   0    0:invokestatic    #21  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//*   1    3:ifnonnull       13
					ActivityLifecycleTracker.currentSession = SessionInfo.getStoredSessionInfo();
			//    2    6:invokestatic    #26  <Method SessionInfo SessionInfo.getStoredSessionInfo()>
			//    3    9:invokestatic    #30  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
			//    4   12:pop             
			//    5   13:return          
			}

		}
));
	//   11   19:new             #8   <Class ActivityLifecycleTracker$2>
	//   12   22:dup             
	//   13   23:invokespecial   #248 <Method void ActivityLifecycleTracker$2()>
	//   14   26:astore_0        
		singleThreadExecutor.execute(((Runnable) (activity)));
	//   15   27:getstatic       #72  <Field ScheduledExecutorService singleThreadExecutor>
	//   16   30:aload_0         
	//   17   31:invokeinterface #251 <Method void ScheduledExecutorService.execute(Runnable)>
	//   18   36:return          
	}

	private static void onActivityPaused(Activity activity)
	{
		if(foregroundActivityCount.decrementAndGet() < 0)
	//*   0    0:getstatic       #84  <Field AtomicInteger foregroundActivityCount>
	//*   1    3:invokevirtual   #254 <Method int AtomicInteger.decrementAndGet()>
	//*   2    6:ifge            25
		{
			foregroundActivityCount.set(0);
	//    3    9:getstatic       #84  <Field AtomicInteger foregroundActivityCount>
	//    4   12:iconst_0        
	//    5   13:invokevirtual   #257 <Method void AtomicInteger.set(int)>
			Log.w(TAG, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
	//    6   16:getstatic       #64  <Field String TAG>
	//    7   19:ldc1            #22  <String "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method">
	//    8   21:invokestatic    #263 <Method int Log.w(String, String)>
	//    9   24:pop             
		}
		cancelCurrentTask();
	//   10   25:invokestatic    #265 <Method void cancelCurrentTask()>
		long l = System.currentTimeMillis();
	//   11   28:invokestatic    #229 <Method long System.currentTimeMillis()>
	//   12   31:lstore_1        
		String s = Utility.getActivityName(((Context) (activity)));
	//   13   32:aload_0         
	//   14   33:invokestatic    #241 <Method String Utility.getActivityName(Context)>
	//   15   36:astore_3        
		codelessMatcher.remove(activity);
	//   16   37:getstatic       #96  <Field CodelessMatcher codelessMatcher>
	//   17   40:aload_0         
	//   18   41:invokevirtual   #268 <Method void CodelessMatcher.remove(Activity)>
		activity = ((Activity) (new Runnable(l, s) {

			public void run()
			{
				if(ActivityLifecycleTracker.currentSession == null)
			//*   0    0:invokestatic    #32  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//*   1    3:ifnonnull       25
					ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(currentTime), ((Long) (null)));
			//    2    6:new             #34  <Class SessionInfo>
			//    3    9:dup             
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field long val$currentTime>
			//    6   14:invokestatic    #40  <Method Long Long.valueOf(long)>
			//    7   17:aconst_null     
			//    8   18:invokespecial   #43  <Method void SessionInfo(Long, Long)>
			//    9   21:invokestatic    #47  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
			//   10   24:pop             
				ActivityLifecycleTracker.currentSession.setSessionLastEventTime(Long.valueOf(currentTime));
			//   11   25:invokestatic    #32  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//   12   28:aload_0         
			//   13   29:getfield        #21  <Field long val$currentTime>
			//   14   32:invokestatic    #40  <Method Long Long.valueOf(long)>
			//   15   35:invokevirtual   #51  <Method void SessionInfo.setSessionLastEventTime(Long)>
				if(ActivityLifecycleTracker.foregroundActivityCount.get() <= 0)
			//*  16   38:invokestatic    #55  <Method AtomicInteger ActivityLifecycleTracker.access$500()>
			//*  17   41:invokevirtual   #61  <Method int AtomicInteger.get()>
			//*  18   44:ifgt            100
				{
					Runnable runnable = new Runnable() {

						public void run()
						{
							if(ActivityLifecycleTracker.foregroundActivityCount.get() <= 0)
						//*   0    0:invokestatic    #26  <Method AtomicInteger ActivityLifecycleTracker.access$500()>
						//*   1    3:invokevirtual   #32  <Method int AtomicInteger.get()>
						//*   2    6:ifgt            33
							{
								SessionLogger.logDeactivateApp(activityName, ActivityLifecycleTracker.currentSession, ActivityLifecycleTracker.appId);
						//    3    9:aload_0         
						//    4   10:getfield        #17  <Field ActivityLifecycleTracker$5 this$0>
						//    5   13:getfield        #36  <Field String ActivityLifecycleTracker$5.val$activityName>
						//    6   16:invokestatic    #40  <Method SessionInfo ActivityLifecycleTracker.access$200()>
						//    7   19:invokestatic    #44  <Method String ActivityLifecycleTracker.access$300()>
						//    8   22:invokestatic    #50  <Method void SessionLogger.logDeactivateApp(String, SessionInfo, String)>
								SessionInfo.clearSavedSessionFromDisk();
						//    9   25:invokestatic    #55  <Method void SessionInfo.clearSavedSessionFromDisk()>
								ActivityLifecycleTracker.currentSession = null;
						//   10   28:aconst_null     
						//   11   29:invokestatic    #59  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
						//   12   32:pop             
							}
							synchronized(ActivityLifecycleTracker.currentFutureLock)
						//*  13   33:invokestatic    #63  <Method Object ActivityLifecycleTracker.access$600()>
						//*  14   36:astore_1        
						//*  15   37:aload_1         
						//*  16   38:monitorenter    
							{
								ActivityLifecycleTracker.currentFuture = null;
						//   17   39:aconst_null     
						//   18   40:invokestatic    #67  <Method ScheduledFuture ActivityLifecycleTracker.access$702(ScheduledFuture)>
						//   19   43:pop             
							}
						//   20   44:aload_1         
						//   21   45:monitorexit     
							return;
						//   22   46:return          
							exception;
						//   23   47:astore_2        
							obj;
						//   24   48:aload_1         
							JVM INSTR monitorexit ;
						//   25   49:monitorexit     
							throw exception;
						//   26   50:aload_2         
						//   27   51:athrow          
						}

						final _cls5 this$0;

			
			{
				this$0 = _cls5.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ActivityLifecycleTracker$5 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
					}
;
			//   19   47:new             #13  <Class ActivityLifecycleTracker$5$1>
			//   20   50:dup             
			//   21   51:aload_0         
			//   22   52:invokespecial   #64  <Method void ActivityLifecycleTracker$5$1(ActivityLifecycleTracker$5)>
			//   23   55:astore          6
					synchronized(ActivityLifecycleTracker.currentFutureLock)
			//*  24   57:invokestatic    #68  <Method Object ActivityLifecycleTracker.access$600()>
			//*  25   60:astore          5
			//*  26   62:aload           5
			//*  27   64:monitorenter    
					{
						ActivityLifecycleTracker.currentFuture = ActivityLifecycleTracker.singleThreadExecutor.schedule(runnable, ActivityLifecycleTracker.getSessionTimeoutInSeconds(), TimeUnit.SECONDS);
			//   28   65:invokestatic    #72  <Method ScheduledExecutorService ActivityLifecycleTracker.access$800()>
			//   29   68:aload           6
			//   30   70:invokestatic    #75  <Method int ActivityLifecycleTracker.access$400()>
			//   31   73:i2l             
			//   32   74:getstatic       #81  <Field TimeUnit TimeUnit.SECONDS>
			//   33   77:invokeinterface #87  <Method ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
			//   34   82:invokestatic    #91  <Method ScheduledFuture ActivityLifecycleTracker.access$702(ScheduledFuture)>
			//   35   85:pop             
					}
			//   36   86:aload           5
			//   37   88:monitorexit     
				}
				break MISSING_BLOCK_LABEL_100;
			//   38   89:goto            100
				exception;
			//   39   92:astore          6
				obj;
			//   40   94:aload           5
				JVM INSTR monitorexit ;
			//   41   96:monitorexit     
				throw exception;
			//   42   97:aload           6
			//   43   99:athrow          
				long l2 = ActivityLifecycleTracker.currentActivityAppearTime;
			//   44  100:invokestatic    #95  <Method long ActivityLifecycleTracker.access$900()>
			//   45  103:lstore_3        
				long l1 = 0L;
			//   46  104:lconst_0        
			//   47  105:lstore_1        
				if(l2 > 0L)
			//*  48  106:lload_3         
			//*  49  107:lconst_0        
			//*  50  108:lcmp            
			//*  51  109:ifle            123
					l1 = (currentTime - l2) / 1000L;
			//   52  112:aload_0         
			//   53  113:getfield        #21  <Field long val$currentTime>
			//   54  116:lload_3         
			//   55  117:lsub            
			//   56  118:ldc2w           #96  <Long 1000L>
			//   57  121:ldiv            
			//   58  122:lstore_1        
				AutomaticAnalyticsLogger.logActivityTimeSpentEvent(activityName, l1);
			//   59  123:aload_0         
			//   60  124:getfield        #23  <Field String val$activityName>
			//   61  127:lload_1         
			//   62  128:invokestatic    #103 <Method void AutomaticAnalyticsLogger.logActivityTimeSpentEvent(String, long)>
				ActivityLifecycleTracker.currentSession.writeSessionToDisk();
			//   63  131:invokestatic    #32  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//   64  134:invokevirtual   #106 <Method void SessionInfo.writeSessionToDisk()>
				return;
			//   65  137:return          
			}

			final String val$activityName;
			final long val$currentTime;

			
			{
				currentTime = l;
			//    0    0:aload_0         
			//    1    1:lload_1         
			//    2    2:putfield        #21  <Field long val$currentTime>
				activityName = s;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field String val$activityName>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
		}
));
	//   19   44:new             #14  <Class ActivityLifecycleTracker$5>
	//   20   47:dup             
	//   21   48:lload_1         
	//   22   49:aload_3         
	//   23   50:invokespecial   #271 <Method void ActivityLifecycleTracker$5(long, String)>
	//   24   53:astore_0        
		singleThreadExecutor.execute(((Runnable) (activity)));
	//   25   54:getstatic       #72  <Field ScheduledExecutorService singleThreadExecutor>
	//   26   57:aload_0         
	//   27   58:invokeinterface #251 <Method void ScheduledExecutorService.execute(Runnable)>
		activity = ((Activity) (viewIndexer));
	//   28   63:getstatic       #130 <Field ViewIndexer viewIndexer>
	//   29   66:astore_0        
		if(activity != null)
	//*  30   67:aload_0         
	//*  31   68:ifnull          75
			((ViewIndexer) (activity)).unschedule();
	//   32   71:aload_0         
	//   33   72:invokevirtual   #276 <Method void ViewIndexer.unschedule()>
		activity = ((Activity) (sensorManager));
	//   34   75:getstatic       #278 <Field SensorManager sensorManager>
	//   35   78:astore_0        
		if(activity != null)
	//*  36   79:aload_0         
	//*  37   80:ifnull          90
			((SensorManager) (activity)).unregisterListener(((android.hardware.SensorEventListener) (viewIndexingTrigger)));
	//   38   83:aload_0         
	//   39   84:getstatic       #101 <Field ViewIndexingTrigger viewIndexingTrigger>
	//   40   87:invokevirtual   #284 <Method void SensorManager.unregisterListener(android.hardware.SensorEventListener)>
	//   41   90:return          
	}

	public static void onActivityResumed(Activity activity)
	{
		foregroundActivityCount.incrementAndGet();
	//    0    0:getstatic       #84  <Field AtomicInteger foregroundActivityCount>
	//    1    3:invokevirtual   #288 <Method int AtomicInteger.incrementAndGet()>
	//    2    6:pop             
		cancelCurrentTask();
	//    3    7:invokestatic    #265 <Method void cancelCurrentTask()>
		long l = System.currentTimeMillis();
	//    4   10:invokestatic    #229 <Method long System.currentTimeMillis()>
	//    5   13:lstore_1        
		currentActivityAppearTime = l;
	//    6   14:lload_1         
	//    7   15:putstatic       #158 <Field long currentActivityAppearTime>
		Object obj = ((Object) (Utility.getActivityName(((Context) (activity)))));
	//    8   18:aload_0         
	//    9   19:invokestatic    #241 <Method String Utility.getActivityName(Context)>
	//   10   22:astore_3        
		codelessMatcher.add(activity);
	//   11   23:getstatic       #96  <Field CodelessMatcher codelessMatcher>
	//   12   26:aload_0         
	//   13   27:invokevirtual   #291 <Method void CodelessMatcher.add(Activity)>
		obj = ((Object) (new Runnable(l, ((String) (obj))) {

			public void run()
			{
				if(ActivityLifecycleTracker.currentSession == null)
			//*   0    0:invokestatic    #30  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//*   1    3:ifnonnull       39
				{
					ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(currentTime), ((Long) (null)));
			//    2    6:new             #32  <Class SessionInfo>
			//    3    9:dup             
			//    4   10:aload_0         
			//    5   11:getfield        #19  <Field long val$currentTime>
			//    6   14:invokestatic    #38  <Method Long Long.valueOf(long)>
			//    7   17:aconst_null     
			//    8   18:invokespecial   #41  <Method void SessionInfo(Long, Long)>
			//    9   21:invokestatic    #45  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
			//   10   24:pop             
					SessionLogger.logActivateApp(activityName, ((SourceApplicationInfo) (null)), ActivityLifecycleTracker.appId);
			//   11   25:aload_0         
			//   12   26:getfield        #21  <Field String val$activityName>
			//   13   29:aconst_null     
			//   14   30:invokestatic    #49  <Method String ActivityLifecycleTracker.access$300()>
			//   15   33:invokestatic    #55  <Method void SessionLogger.logActivateApp(String, SourceApplicationInfo, String)>
				} else
			//*  16   36:goto            136
				if(ActivityLifecycleTracker.currentSession.getSessionLastEventTime() != null)
			//*  17   39:invokestatic    #30  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//*  18   42:invokevirtual   #59  <Method Long SessionInfo.getSessionLastEventTime()>
			//*  19   45:ifnull          136
				{
					long l1 = currentTime - ActivityLifecycleTracker.currentSession.getSessionLastEventTime().longValue();
			//   20   48:aload_0         
			//   21   49:getfield        #19  <Field long val$currentTime>
			//   22   52:invokestatic    #30  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//   23   55:invokevirtual   #59  <Method Long SessionInfo.getSessionLastEventTime()>
			//   24   58:invokevirtual   #63  <Method long Long.longValue()>
			//   25   61:lsub            
			//   26   62:lstore_1        
					if(l1 > (long)(ActivityLifecycleTracker.getSessionTimeoutInSeconds() * 1000))
			//*  27   63:lload_1         
			//*  28   64:invokestatic    #67  <Method int ActivityLifecycleTracker.access$400()>
			//*  29   67:sipush          1000
			//*  30   70:imul            
			//*  31   71:i2l             
			//*  32   72:lcmp            
			//*  33   73:ifle            122
					{
						SessionLogger.logDeactivateApp(activityName, ActivityLifecycleTracker.currentSession, ActivityLifecycleTracker.appId);
			//   34   76:aload_0         
			//   35   77:getfield        #21  <Field String val$activityName>
			//   36   80:invokestatic    #30  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//   37   83:invokestatic    #49  <Method String ActivityLifecycleTracker.access$300()>
			//   38   86:invokestatic    #71  <Method void SessionLogger.logDeactivateApp(String, SessionInfo, String)>
						SessionLogger.logActivateApp(activityName, ((SourceApplicationInfo) (null)), ActivityLifecycleTracker.appId);
			//   39   89:aload_0         
			//   40   90:getfield        #21  <Field String val$activityName>
			//   41   93:aconst_null     
			//   42   94:invokestatic    #49  <Method String ActivityLifecycleTracker.access$300()>
			//   43   97:invokestatic    #55  <Method void SessionLogger.logActivateApp(String, SourceApplicationInfo, String)>
						ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(currentTime), ((Long) (null)));
			//   44  100:new             #32  <Class SessionInfo>
			//   45  103:dup             
			//   46  104:aload_0         
			//   47  105:getfield        #19  <Field long val$currentTime>
			//   48  108:invokestatic    #38  <Method Long Long.valueOf(long)>
			//   49  111:aconst_null     
			//   50  112:invokespecial   #41  <Method void SessionInfo(Long, Long)>
			//   51  115:invokestatic    #45  <Method SessionInfo ActivityLifecycleTracker.access$202(SessionInfo)>
			//   52  118:pop             
					} else
			//*  53  119:goto            136
					if(l1 > 1000L)
			//*  54  122:lload_1         
			//*  55  123:ldc2w           #72  <Long 1000L>
			//*  56  126:lcmp            
			//*  57  127:ifle            136
						ActivityLifecycleTracker.currentSession.incrementInterruptionCount();
			//   58  130:invokestatic    #30  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//   59  133:invokevirtual   #76  <Method void SessionInfo.incrementInterruptionCount()>
				}
				ActivityLifecycleTracker.currentSession.setSessionLastEventTime(Long.valueOf(currentTime));
			//   60  136:invokestatic    #30  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//   61  139:aload_0         
			//   62  140:getfield        #19  <Field long val$currentTime>
			//   63  143:invokestatic    #38  <Method Long Long.valueOf(long)>
			//   64  146:invokevirtual   #80  <Method void SessionInfo.setSessionLastEventTime(Long)>
				ActivityLifecycleTracker.currentSession.writeSessionToDisk();
			//   65  149:invokestatic    #30  <Method SessionInfo ActivityLifecycleTracker.access$200()>
			//   66  152:invokevirtual   #83  <Method void SessionInfo.writeSessionToDisk()>
			//   67  155:return          
			}

			final String val$activityName;
			final long val$currentTime;

			
			{
				currentTime = l;
			//    0    0:aload_0         
			//    1    1:lload_1         
			//    2    2:putfield        #19  <Field long val$currentTime>
				activityName = s;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #21  <Field String val$activityName>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
));
	//   14   30:new             #10  <Class ActivityLifecycleTracker$3>
	//   15   33:dup             
	//   16   34:lload_1         
	//   17   35:aload_3         
	//   18   36:invokespecial   #292 <Method void ActivityLifecycleTracker$3(long, String)>
	//   19   39:astore_3        
		singleThreadExecutor.execute(((Runnable) (obj)));
	//   20   40:getstatic       #72  <Field ScheduledExecutorService singleThreadExecutor>
	//   21   43:aload_3         
	//   22   44:invokeinterface #251 <Method void ScheduledExecutorService.execute(Runnable)>
		Object obj1 = ((Object) (activity.getApplicationContext()));
	//   23   49:aload_0         
	//   24   50:invokevirtual   #235 <Method Context Activity.getApplicationContext()>
	//   25   53:astore          5
		obj = ((Object) (FacebookSdk.getApplicationId()));
	//   26   55:invokestatic    #205 <Method String FacebookSdk.getApplicationId()>
	//   27   58:astore_3        
		FetchedAppSettings fetchedappsettings = FetchedAppSettingsManager.getAppSettingsWithoutQuery(((String) (obj)));
	//   28   59:aload_3         
	//   29   60:invokestatic    #211 <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
	//   30   63:astore          4
		if(fetchedappsettings != null)
	//*  31   65:aload           4
	//*  32   67:ifnull          171
		{
			if(!fetchedappsettings.getCodelessSetupEnabled())
	//*  33   70:aload           4
	//*  34   72:invokevirtual   #295 <Method boolean FetchedAppSettings.getCodelessSetupEnabled()>
	//*  35   75:ifne            79
				return;
	//   36   78:return          
			sensorManager = (SensorManager)((Context) (obj1)).getSystemService("sensor");
	//   37   79:aload           5
	//   38   81:ldc2            #297 <String "sensor">
	//   39   84:invokevirtual   #303 <Method Object Context.getSystemService(String)>
	//   40   87:checkcast       #280 <Class SensorManager>
	//   41   90:putstatic       #278 <Field SensorManager sensorManager>
			obj1 = ((Object) (sensorManager));
	//   42   93:getstatic       #278 <Field SensorManager sensorManager>
	//   43   96:astore          5
			if(obj1 == null)
	//*  44   98:aload           5
	//*  45  100:ifnonnull       104
				return;
	//   46  103:return          
			obj1 = ((Object) (((SensorManager) (obj1)).getDefaultSensor(1)));
	//   47  104:aload           5
	//   48  106:iconst_1        
	//   49  107:invokevirtual   #307 <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//   50  110:astore          5
			viewIndexer = new ViewIndexer(activity);
	//   51  112:new             #273 <Class ViewIndexer>
	//   52  115:dup             
	//   53  116:aload_0         
	//   54  117:invokespecial   #309 <Method void ViewIndexer(Activity)>
	//   55  120:putstatic       #130 <Field ViewIndexer viewIndexer>
			viewIndexingTrigger.setOnShakeListener(new com.facebook.appevents.codeless.ViewIndexingTrigger.OnShakeListener(fetchedappsettings, ((String) (obj))) {

				public void onShake()
				{
					FetchedAppSettings fetchedappsettings1 = appSettings;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field FetchedAppSettings val$appSettings>
				//    2    4:astore_1        
					if(fetchedappsettings1 != null && fetchedappsettings1.getCodelessEventsEnabled())
				//*   3    5:aload_1         
				//*   4    6:ifnull          23
				//*   5    9:aload_1         
				//*   6   10:invokevirtual   #32  <Method boolean FetchedAppSettings.getCodelessEventsEnabled()>
				//*   7   13:ifeq            23
						ActivityLifecycleTracker.checkCodelessSession(appId);
				//    8   16:aload_0         
				//    9   17:getfield        #21  <Field String val$appId>
				//   10   20:invokestatic    #36  <Method void ActivityLifecycleTracker.checkCodelessSession(String)>
				//   11   23:return          
				}

				final String val$appId;
				final FetchedAppSettings val$appSettings;

			
			{
				appSettings = fetchedappsettings;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FetchedAppSettings val$appSettings>
				appId = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$appId>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   56  123:getstatic       #101 <Field ViewIndexingTrigger viewIndexingTrigger>
	//   57  126:new             #12  <Class ActivityLifecycleTracker$4>
	//   58  129:dup             
	//   59  130:aload           4
	//   60  132:aload_3         
	//   61  133:invokespecial   #312 <Method void ActivityLifecycleTracker$4(FetchedAppSettings, String)>
	//   62  136:invokevirtual   #316 <Method void ViewIndexingTrigger.setOnShakeListener(com.facebook.appevents.codeless.ViewIndexingTrigger$OnShakeListener)>
			sensorManager.registerListener(((android.hardware.SensorEventListener) (viewIndexingTrigger)), ((android.hardware.Sensor) (obj1)), 2);
	//   63  139:getstatic       #278 <Field SensorManager sensorManager>
	//   64  142:getstatic       #101 <Field ViewIndexingTrigger viewIndexingTrigger>
	//   65  145:aload           5
	//   66  147:iconst_2        
	//   67  148:invokevirtual   #320 <Method boolean SensorManager.registerListener(android.hardware.SensorEventListener, android.hardware.Sensor, int)>
	//   68  151:pop             
			if(fetchedappsettings != null && fetchedappsettings.getCodelessEventsEnabled())
	//*  69  152:aload           4
	//*  70  154:ifnull          171
	//*  71  157:aload           4
	//*  72  159:invokevirtual   #323 <Method boolean FetchedAppSettings.getCodelessEventsEnabled()>
	//*  73  162:ifeq            171
				viewIndexer.schedule();
	//   74  165:getstatic       #130 <Field ViewIndexer viewIndexer>
	//   75  168:invokevirtual   #326 <Method void ViewIndexer.schedule()>
		}
	//   76  171:return          
	}

	public static void startTracking(Application application, String s)
	{
		if(!tracking.compareAndSet(false, true))
	//*   0    0:getstatic       #91  <Field AtomicBoolean tracking>
	//*   1    3:iconst_0        
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #332 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   4    8:ifne            12
		{
			return;
	//    5   11:return          
		} else
		{
			appId = s;
	//    6   12:aload_1         
	//    7   13:putstatic       #140 <Field String appId>
			application.registerActivityLifecycleCallbacks(new android.app.Application.ActivityLifecycleCallbacks() {

				public void onActivityCreated(Activity activity, Bundle bundle)
				{
					Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityCreated");
				//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
				//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
				//    2    6:ldc1            #29  <String "onActivityCreated">
				//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
					AppEventUtility.assertIsMainThread();
				//    4   11:invokestatic    #40  <Method void AppEventUtility.assertIsMainThread()>
					ActivityLifecycleTracker.onActivityCreated(activity);
				//    5   14:aload_1         
				//    6   15:invokestatic    #43  <Method void ActivityLifecycleTracker.onActivityCreated(Activity)>
				//    7   18:return          
				}

				public void onActivityDestroyed(Activity activity)
				{
					Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityDestroyed");
				//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
				//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
				//    2    6:ldc1            #45  <String "onActivityDestroyed">
				//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
				//    4   11:return          
				}

				public void onActivityPaused(Activity activity)
				{
					Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityPaused");
				//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
				//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
				//    2    6:ldc1            #47  <String "onActivityPaused">
				//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
					AppEventUtility.assertIsMainThread();
				//    4   11:invokestatic    #40  <Method void AppEventUtility.assertIsMainThread()>
					ActivityLifecycleTracker.onActivityPaused(activity);
				//    5   14:aload_1         
				//    6   15:invokestatic    #50  <Method void ActivityLifecycleTracker.access$100(Activity)>
				//    7   18:return          
				}

				public void onActivityResumed(Activity activity)
				{
					Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityResumed");
				//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
				//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
				//    2    6:ldc1            #52  <String "onActivityResumed">
				//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
					AppEventUtility.assertIsMainThread();
				//    4   11:invokestatic    #40  <Method void AppEventUtility.assertIsMainThread()>
					ActivityLifecycleTracker.onActivityResumed(activity);
				//    5   14:aload_1         
				//    6   15:invokestatic    #54  <Method void ActivityLifecycleTracker.onActivityResumed(Activity)>
				//    7   18:return          
				}

				public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
				{
					Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivitySaveInstanceState");
				//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
				//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
				//    2    6:ldc1            #56  <String "onActivitySaveInstanceState">
				//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
				//    4   11:return          
				}

				public void onActivityStarted(Activity activity)
				{
					Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityStarted");
				//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
				//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
				//    2    6:ldc1            #58  <String "onActivityStarted">
				//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
				//    4   11:return          
				}

				public void onActivityStopped(Activity activity)
				{
					Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityStopped");
				//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
				//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
				//    2    6:ldc1            #60  <String "onActivityStopped">
				//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
					AppEventsLogger.onContextStop();
				//    4   11:invokestatic    #65  <Method void AppEventsLogger.onContextStop()>
				//    5   14:return          
				}

			}
);
	//    8   16:aload_0         
	//    9   17:new             #6   <Class ActivityLifecycleTracker$1>
	//   10   20:dup             
	//   11   21:invokespecial   #333 <Method void ActivityLifecycleTracker$1()>
	//   12   24:invokevirtual   #339 <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
			return;
	//   13   27:return          
		}
	}

	public static void updateAppIndexing(Boolean boolean1)
	{
		isAppIndexingEnabled = boolean1;
	//    0    0:aload_0         
	//    1    1:putstatic       #111 <Field Boolean isAppIndexingEnabled>
	//    2    4:return          
	}

	private static final String INCORRECT_IMPL_WARNING = "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method";
	private static final long INTERRUPTION_THRESHOLD_MILLISECONDS = 1000L;
	private static final String TAG = ((Class) (com/facebook/appevents/internal/ActivityLifecycleTracker)).getCanonicalName();
	private static String appId;
	private static final CodelessMatcher codelessMatcher = new CodelessMatcher();
	private static long currentActivityAppearTime;
	private static volatile ScheduledFuture currentFuture;
	private static final Object currentFutureLock = new Object();
	private static volatile SessionInfo currentSession;
	private static String deviceSessionID = null;
	private static AtomicInteger foregroundActivityCount = new AtomicInteger(0);
	private static Boolean isAppIndexingEnabled = Boolean.valueOf(false);
	private static volatile Boolean isCheckingSession = Boolean.valueOf(false);
	private static SensorManager sensorManager;
	private static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
	private static AtomicBoolean tracking = new AtomicBoolean(false);
	private static ViewIndexer viewIndexer;
	private static final ViewIndexingTrigger viewIndexingTrigger = new ViewIndexingTrigger();

	static 
	{
	//    0    0:ldc1            #2   <Class ActivityLifecycleTracker>
	//    1    2:invokevirtual   #62  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #64  <Field String TAG>
	//    3    8:invokestatic    #70  <Method ScheduledExecutorService Executors.newSingleThreadScheduledExecutor()>
	//    4   11:putstatic       #72  <Field ScheduledExecutorService singleThreadExecutor>
	//    5   14:new             #4   <Class Object>
	//    6   17:dup             
	//    7   18:invokespecial   #75  <Method void Object()>
	//    8   21:putstatic       #77  <Field Object currentFutureLock>
	//    9   24:new             #79  <Class AtomicInteger>
	//   10   27:dup             
	//   11   28:iconst_0        
	//   12   29:invokespecial   #82  <Method void AtomicInteger(int)>
	//   13   32:putstatic       #84  <Field AtomicInteger foregroundActivityCount>
	//   14   35:new             #86  <Class AtomicBoolean>
	//   15   38:dup             
	//   16   39:iconst_0        
	//   17   40:invokespecial   #89  <Method void AtomicBoolean(boolean)>
	//   18   43:putstatic       #91  <Field AtomicBoolean tracking>
	//   19   46:new             #93  <Class CodelessMatcher>
	//   20   49:dup             
	//   21   50:invokespecial   #94  <Method void CodelessMatcher()>
	//   22   53:putstatic       #96  <Field CodelessMatcher codelessMatcher>
	//   23   56:new             #98  <Class ViewIndexingTrigger>
	//   24   59:dup             
	//   25   60:invokespecial   #99  <Method void ViewIndexingTrigger()>
	//   26   63:putstatic       #101 <Field ViewIndexingTrigger viewIndexingTrigger>
	//   27   66:aconst_null     
	//   28   67:putstatic       #103 <Field String deviceSessionID>
	//   29   70:iconst_0        
	//   30   71:invokestatic    #109 <Method Boolean Boolean.valueOf(boolean)>
	//   31   74:putstatic       #111 <Field Boolean isAppIndexingEnabled>
	//   32   77:iconst_0        
	//   33   78:invokestatic    #109 <Method Boolean Boolean.valueOf(boolean)>
	//   34   81:putstatic       #113 <Field Boolean isCheckingSession>
	//*  35   84:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #64  <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static void access$100(Activity activity)
	{
		onActivityPaused(activity);
	//    0    0:aload_0         
	//    1    1:invokestatic    #120 <Method void onActivityPaused(Activity)>
		return;
	//    2    4:return          
	}

*/


/*
	static Boolean access$1000()
	{
		return isAppIndexingEnabled;
	//    0    0:getstatic       #111 <Field Boolean isAppIndexingEnabled>
	//    1    3:areturn         
	}

*/


/*
	static Boolean access$1002(Boolean boolean1)
	{
		isAppIndexingEnabled = boolean1;
	//    0    0:aload_0         
	//    1    1:putstatic       #111 <Field Boolean isAppIndexingEnabled>
		return boolean1;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static String access$1102(String s)
	{
		deviceSessionID = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #103 <Field String deviceSessionID>
		return s;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static ViewIndexer access$1200()
	{
		return viewIndexer;
	//    0    0:getstatic       #130 <Field ViewIndexer viewIndexer>
	//    1    3:areturn         
	}

*/


/*
	static Boolean access$1302(Boolean boolean1)
	{
		isCheckingSession = boolean1;
	//    0    0:aload_0         
	//    1    1:putstatic       #113 <Field Boolean isCheckingSession>
		return boolean1;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static SessionInfo access$200()
	{
		return currentSession;
	//    0    0:getstatic       #135 <Field SessionInfo currentSession>
	//    1    3:areturn         
	}

*/


/*
	static SessionInfo access$202(SessionInfo sessioninfo)
	{
		currentSession = sessioninfo;
	//    0    0:aload_0         
	//    1    1:putstatic       #135 <Field SessionInfo currentSession>
		return sessioninfo;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static String access$300()
	{
		return appId;
	//    0    0:getstatic       #140 <Field String appId>
	//    1    3:areturn         
	}

*/


/*
	static int access$400()
	{
		return getSessionTimeoutInSeconds();
	//    0    0:invokestatic    #145 <Method int getSessionTimeoutInSeconds()>
	//    1    3:ireturn         
	}

*/


/*
	static AtomicInteger access$500()
	{
		return foregroundActivityCount;
	//    0    0:getstatic       #84  <Field AtomicInteger foregroundActivityCount>
	//    1    3:areturn         
	}

*/


/*
	static Object access$600()
	{
		return currentFutureLock;
	//    0    0:getstatic       #77  <Field Object currentFutureLock>
	//    1    3:areturn         
	}

*/


/*
	static ScheduledFuture access$702(ScheduledFuture scheduledfuture)
	{
		currentFuture = scheduledfuture;
	//    0    0:aload_0         
	//    1    1:putstatic       #153 <Field ScheduledFuture currentFuture>
		return scheduledfuture;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static ScheduledExecutorService access$800()
	{
		return singleThreadExecutor;
	//    0    0:getstatic       #72  <Field ScheduledExecutorService singleThreadExecutor>
	//    1    3:areturn         
	}

*/


/*
	static long access$900()
	{
		return currentActivityAppearTime;
	//    0    0:getstatic       #158 <Field long currentActivityAppearTime>
	//    1    3:lreturn         
	}

*/
}
