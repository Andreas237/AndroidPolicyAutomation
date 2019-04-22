// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.marketing;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.*;
import com.facebook.internal.*;
import com.facebook.marketing.internal.MarketingLogger;
import com.facebook.marketing.internal.MarketingUtils;
import com.newrelic.agent.android.instrumentation.JSONArrayInstrumentation;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.marketing:
//			ViewIndexingTrigger, ViewIndexer

public class CodelessActivityLifecycleTracker
{

	public CodelessActivityLifecycleTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
	//    2    4:return          
	}

	public static void checkCodelessSession(String s, MarketingLogger marketinglogger)
	{
		if(isCheckingSession.booleanValue())
	//*   0    0:getstatic       #51  <Field Boolean isCheckingSession>
	//*   1    3:invokevirtual   #80  <Method boolean Boolean.booleanValue()>
	//*   2    6:ifeq            10
		{
			return;
	//    3    9:return          
		} else
		{
			isCheckingSession = Boolean.valueOf(true);
	//    4   10:iconst_1        
	//    5   11:invokestatic    #47  <Method Boolean Boolean.valueOf(boolean)>
	//    6   14:putstatic       #51  <Field Boolean isCheckingSession>
			FacebookSdk.getExecutor().execute(new Runnable(s, marketinglogger) {

				public void run()
				{
					Object obj = ((Object) (Locale.US));
				//    0    0:getstatic       #32  <Field Locale Locale.US>
				//    1    3:astore_2        
					boolean flag = true;
				//    2    4:iconst_1        
				//    3    5:istore_1        
					GraphRequest graphrequest = GraphRequest.newPostRequest(((com.facebook.AccessToken) (null)), String.format(((Locale) (obj)), "%s/app_indexing_session", new Object[] {
						applicationId
					}), ((JSONObject) (null)), ((com.facebook.GraphRequest.Callback) (null)));
				//    4    6:aconst_null     
				//    5    7:aload_2         
				//    6    8:ldc1            #34  <String "%s/app_indexing_session">
				//    7   10:iconst_1        
				//    8   11:anewarray       Object[]
				//    9   14:dup             
				//   10   15:iconst_0        
				//   11   16:aload_0         
				//   12   17:getfield        #19  <Field String val$applicationId>
				//   13   20:aastore         
				//   14   21:invokestatic    #40  <Method String String.format(Locale, String, Object[])>
				//   15   24:aconst_null     
				//   16   25:aconst_null     
				//   17   26:invokestatic    #46  <Method GraphRequest GraphRequest.newPostRequest(com.facebook.AccessToken, String, JSONObject, com.facebook.GraphRequest$Callback)>
				//   18   29:astore          4
					Object obj1 = ((Object) (graphrequest.getParameters()));
				//   19   31:aload           4
				//   20   33:invokevirtual   #50  <Method Bundle GraphRequest.getParameters()>
				//   21   36:astore_3        
					obj = obj1;
				//   22   37:aload_3         
				//   23   38:astore_2        
					if(obj1 == null)
				//*  24   39:aload_3         
				//*  25   40:ifnonnull       51
						obj = ((Object) (new Bundle()));
				//   26   43:new             #52  <Class Bundle>
				//   27   46:dup             
				//   28   47:invokespecial   #53  <Method void Bundle()>
				//   29   50:astore_2        
					Object obj2 = ((Object) (AttributionIdentifiers.getAttributionIdentifiers(FacebookSdk.getApplicationContext())));
				//   30   51:invokestatic    #59  <Method Context FacebookSdk.getApplicationContext()>
				//   31   54:invokestatic    #65  <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(Context)>
				//   32   57:astore          6
					JSONArray jsonarray = new JSONArray();
				//   33   59:new             #67  <Class JSONArray>
				//   34   62:dup             
				//   35   63:invokespecial   #68  <Method void JSONArray()>
				//   36   66:astore          5
					if(Build.MODEL != null)
				//*  37   68:getstatic       #73  <Field String Build.MODEL>
				//*  38   71:ifnull          81
						obj1 = ((Object) (Build.MODEL));
				//   39   74:getstatic       #73  <Field String Build.MODEL>
				//   40   77:astore_3        
					else
				//*  41   78:goto            84
						obj1 = "";
				//   42   81:ldc1            #75  <String "">
				//   43   83:astore_3        
					jsonarray.put(obj1);
				//   44   84:aload           5
				//   45   86:aload_3         
				//   46   87:invokevirtual   #79  <Method JSONArray JSONArray.put(Object)>
				//   47   90:pop             
					if(obj2 != null && ((AttributionIdentifiers) (obj2)).getAndroidAdvertiserId() != null)
				//*  48   91:aload           6
				//*  49   93:ifnull          118
				//*  50   96:aload           6
				//*  51   98:invokevirtual   #83  <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
				//*  52  101:ifnull          118
						jsonarray.put(((Object) (((AttributionIdentifiers) (obj2)).getAndroidAdvertiserId())));
				//   53  104:aload           5
				//   54  106:aload           6
				//   55  108:invokevirtual   #83  <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
				//   56  111:invokevirtual   #79  <Method JSONArray JSONArray.put(Object)>
				//   57  114:pop             
					else
				//*  58  115:goto            126
						jsonarray.put("");
				//   59  118:aload           5
				//   60  120:ldc1            #75  <String "">
				//   61  122:invokevirtual   #79  <Method JSONArray JSONArray.put(Object)>
				//   62  125:pop             
					jsonarray.put("0");
				//   63  126:aload           5
				//   64  128:ldc1            #85  <String "0">
				//   65  130:invokevirtual   #79  <Method JSONArray JSONArray.put(Object)>
				//   66  133:pop             
					if(MarketingUtils.isEmulator())
				//*  67  134:invokestatic    #91  <Method boolean MarketingUtils.isEmulator()>
				//*  68  137:ifeq            146
						obj1 = "1";
				//   69  140:ldc1            #93  <String "1">
				//   70  142:astore_3        
					else
				//*  71  143:goto            149
						obj1 = "0";
				//   72  146:ldc1            #85  <String "0">
				//   73  148:astore_3        
					jsonarray.put(obj1);
				//   74  149:aload           5
				//   75  151:aload_3         
				//   76  152:invokevirtual   #79  <Method JSONArray JSONArray.put(Object)>
				//   77  155:pop             
					obj1 = ((Object) (Utility.getCurrentLocale()));
				//   78  156:invokestatic    #99  <Method Locale Utility.getCurrentLocale()>
				//   79  159:astore_3        
					obj2 = ((Object) (new StringBuilder()));
				//   80  160:new             #101 <Class StringBuilder>
				//   81  163:dup             
				//   82  164:invokespecial   #102 <Method void StringBuilder()>
				//   83  167:astore          6
					((StringBuilder) (obj2)).append(((Locale) (obj1)).getLanguage());
				//   84  169:aload           6
				//   85  171:aload_3         
				//   86  172:invokevirtual   #105 <Method String Locale.getLanguage()>
				//   87  175:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
				//   88  178:pop             
					((StringBuilder) (obj2)).append("_");
				//   89  179:aload           6
				//   90  181:ldc1            #111 <String "_">
				//   91  183:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
				//   92  186:pop             
					((StringBuilder) (obj2)).append(((Locale) (obj1)).getCountry());
				//   93  187:aload           6
				//   94  189:aload_3         
				//   95  190:invokevirtual   #114 <Method String Locale.getCountry()>
				//   96  193:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
				//   97  196:pop             
					jsonarray.put(((Object) (((StringBuilder) (obj2)).toString())));
				//   98  197:aload           5
				//   99  199:aload           6
				//  100  201:invokevirtual   #117 <Method String StringBuilder.toString()>
				//  101  204:invokevirtual   #79  <Method JSONArray JSONArray.put(Object)>
				//  102  207:pop             
					if(!(jsonarray instanceof JSONArray))
				//* 103  208:aload           5
				//* 104  210:instanceof      #67  <Class JSONArray>
				//* 105  213:ifne            225
						obj1 = ((Object) (jsonarray.toString()));
				//  106  216:aload           5
				//  107  218:invokevirtual   #118 <Method String JSONArray.toString()>
				//  108  221:astore_3        
					else
				//* 109  222:goto            234
						obj1 = ((Object) (JSONArrayInstrumentation.toString((JSONArray)jsonarray)));
				//  110  225:aload           5
				//  111  227:checkcast       #67  <Class JSONArray>
				//  112  230:invokestatic    #123 <Method String JSONArrayInstrumentation.toString(JSONArray)>
				//  113  233:astore_3        
					((Bundle) (obj)).putString("device_session_id", CodelessActivityLifecycleTracker.getCurrentDeviceSessionID());
				//  114  234:aload_2         
				//  115  235:ldc1            #125 <String "device_session_id">
				//  116  237:invokestatic    #128 <Method String CodelessActivityLifecycleTracker.getCurrentDeviceSessionID()>
				//  117  240:invokevirtual   #132 <Method void Bundle.putString(String, String)>
					((Bundle) (obj)).putString("extinfo", ((String) (obj1)));
				//  118  243:aload_2         
				//  119  244:ldc1            #134 <String "extinfo">
				//  120  246:aload_3         
				//  121  247:invokevirtual   #132 <Method void Bundle.putString(String, String)>
					graphrequest.setParameters(((Bundle) (obj)));
				//  122  250:aload           4
				//  123  252:aload_2         
				//  124  253:invokevirtual   #138 <Method void GraphRequest.setParameters(Bundle)>
					if(graphrequest != null)
				//* 125  256:aload           4
				//* 126  258:ifnull          327
					{
						JSONObject jsonobject = graphrequest.executeAndWait().getJSONObject();
				//  127  261:aload           4
				//  128  263:invokevirtual   #142 <Method GraphResponse GraphRequest.executeAndWait()>
				//  129  266:invokevirtual   #148 <Method JSONObject GraphResponse.getJSONObject()>
				//  130  269:astore_2        
						if(jsonobject == null || !jsonobject.optBoolean("is_app_indexing_enabled", false))
				//* 131  270:aload_2         
				//* 132  271:ifnull          287
				//* 133  274:aload_2         
				//* 134  275:ldc1            #150 <String "is_app_indexing_enabled">
				//* 135  277:iconst_0        
				//* 136  278:invokevirtual   #156 <Method boolean JSONObject.optBoolean(String, boolean)>
				//* 137  281:ifeq            287
				//* 138  284:goto            289
							flag = false;
				//  139  287:iconst_0        
				//  140  288:istore_1        
						CodelessActivityLifecycleTracker.isAppIndexingEnabled = Boolean.valueOf(flag);
				//  141  289:iload_1         
				//  142  290:invokestatic    #162 <Method Boolean Boolean.valueOf(boolean)>
				//  143  293:invokestatic    #166 <Method Boolean CodelessActivityLifecycleTracker.access$302(Boolean)>
				//  144  296:pop             
						if(!CodelessActivityLifecycleTracker.isAppIndexingEnabled.booleanValue())
				//* 145  297:invokestatic    #170 <Method Boolean CodelessActivityLifecycleTracker.access$300()>
				//* 146  300:invokevirtual   #173 <Method boolean Boolean.booleanValue()>
				//* 147  303:ifne            314
						{
							CodelessActivityLifecycleTracker.deviceSessionID = null;
				//  148  306:aconst_null     
				//  149  307:invokestatic    #177 <Method String CodelessActivityLifecycleTracker.access$402(String)>
				//  150  310:pop             
						} else
				//* 151  311:goto            327
						{
							logger.logSessionReady();
				//  152  314:aload_0         
				//  153  315:getfield        #21  <Field MarketingLogger val$logger>
				//  154  318:invokevirtual   #182 <Method void MarketingLogger.logSessionReady()>
							CodelessActivityLifecycleTracker.viewIndexer.schedule();
				//  155  321:invokestatic    #186 <Method ViewIndexer CodelessActivityLifecycleTracker.access$100()>
				//  156  324:invokevirtual   #191 <Method void ViewIndexer.schedule()>
						}
					}
					CodelessActivityLifecycleTracker.isCheckingSession = Boolean.valueOf(false);
				//  157  327:iconst_0        
				//  158  328:invokestatic    #162 <Method Boolean Boolean.valueOf(boolean)>
				//  159  331:invokestatic    #194 <Method Boolean CodelessActivityLifecycleTracker.access$502(Boolean)>
				//  160  334:pop             
				//  161  335:return          
				}

				final String val$applicationId;
				final MarketingLogger val$logger;

			
			{
				applicationId = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field String val$applicationId>
				logger = marketinglogger;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field MarketingLogger val$logger>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    7   17:invokestatic    #86  <Method Executor FacebookSdk.getExecutor()>
	//    8   20:new             #10  <Class CodelessActivityLifecycleTracker$2>
	//    9   23:dup             
	//   10   24:aload_0         
	//   11   25:aload_1         
	//   12   26:invokespecial   #88  <Method void CodelessActivityLifecycleTracker$2(String, MarketingLogger)>
	//   13   29:invokeinterface #94  <Method void Executor.execute(Runnable)>
			return;
	//   14   34:return          
		}
	}

	public static String getCurrentDeviceSessionID()
	{
		if(deviceSessionID == null)
	//*   0    0:getstatic       #41  <Field String deviceSessionID>
	//*   1    3:ifnonnull       15
			deviceSessionID = UUID.randomUUID().toString();
	//    2    6:invokestatic    #101 <Method UUID UUID.randomUUID()>
	//    3    9:invokevirtual   #104 <Method String UUID.toString()>
	//    4   12:putstatic       #41  <Field String deviceSessionID>
		return deviceSessionID;
	//    5   15:getstatic       #41  <Field String deviceSessionID>
	//    6   18:areturn         
	}

	public static boolean getIsAppIndexingEnabled()
	{
		return isAppIndexingEnabled.booleanValue();
	//    0    0:getstatic       #49  <Field Boolean isAppIndexingEnabled>
	//    1    3:invokevirtual   #80  <Method boolean Boolean.booleanValue()>
	//    2    6:ireturn         
	}

	public static void startTracking(Application application, String s)
	{
		application.registerActivityLifecycleCallbacks(new android.app.Application.ActivityLifecycleCallbacks() {

			public void onActivityCreated(Activity activity, Bundle bundle)
			{
			//    0    0:return          
			}

			public void onActivityDestroyed(Activity activity)
			{
			//    0    0:return          
			}

			public void onActivityPaused(Activity activity)
			{
				CodelessActivityLifecycleTracker.viewIndexer.unschedule();
			//    0    0:invokestatic    #27  <Method ViewIndexer CodelessActivityLifecycleTracker.access$100()>
			//    1    3:invokevirtual   #32  <Method void ViewIndexer.unschedule()>
				CodelessActivityLifecycleTracker.sensorManager.unregisterListener(((android.hardware.SensorEventListener) (CodelessActivityLifecycleTracker.viewIndexingTrigger)));
			//    2    6:invokestatic    #36  <Method SensorManager CodelessActivityLifecycleTracker.access$000()>
			//    3    9:invokestatic    #40  <Method ViewIndexingTrigger CodelessActivityLifecycleTracker.access$200()>
			//    4   12:invokevirtual   #46  <Method void SensorManager.unregisterListener(android.hardware.SensorEventListener)>
			//    5   15:return          
			}

			public void onActivityResumed(Activity activity)
			{
				final Context applicationContext = activity.getApplicationContext();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #53  <Method Context Activity.getApplicationContext()>
			//    2    4:astore_2        
				final String appId = FacebookSdk.getApplicationId();
			//    3    5:invokestatic    #59  <Method String FacebookSdk.getApplicationId()>
			//    4    8:astore_3        
				FetchedAppSettings fetchedappsettings = FetchedAppSettingsManager.getAppSettingsWithoutQuery(appId);
			//    5    9:aload_3         
			//    6   10:invokestatic    #65  <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
			//    7   13:astore          4
				CodelessActivityLifecycleTracker.sensorManager = (SensorManager)applicationContext.getSystemService("sensor");
			//    8   15:aload_2         
			//    9   16:ldc1            #67  <String "sensor">
			//   10   18:invokevirtual   #73  <Method Object Context.getSystemService(String)>
			//   11   21:checkcast       #42  <Class SensorManager>
			//   12   24:invokestatic    #77  <Method SensorManager CodelessActivityLifecycleTracker.access$002(SensorManager)>
			//   13   27:pop             
				android.hardware.Sensor sensor = CodelessActivityLifecycleTracker.sensorManager.getDefaultSensor(1);
			//   14   28:invokestatic    #36  <Method SensorManager CodelessActivityLifecycleTracker.access$000()>
			//   15   31:iconst_1        
			//   16   32:invokevirtual   #81  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
			//   17   35:astore          5
				CodelessActivityLifecycleTracker.viewIndexer = new ViewIndexer(activity);
			//   18   37:new             #29  <Class ViewIndexer>
			//   19   40:dup             
			//   20   41:aload_1         
			//   21   42:invokespecial   #83  <Method void ViewIndexer(Activity)>
			//   22   45:invokestatic    #87  <Method ViewIndexer CodelessActivityLifecycleTracker.access$102(ViewIndexer)>
			//   23   48:pop             
				CodelessActivityLifecycleTracker.viewIndexingTrigger.setOnShakeListener(((_cls1) (fetchedappsettings)). new ViewIndexingTrigger.OnShakeListener() {

					public void onShake(int i)
					{
						if(i >= 3)
					//*   0    0:iload_1         
					//*   1    1:iconst_3        
					//*   2    2:icmplt          55
						{
							CodelessActivityLifecycleTracker.viewIndexingTrigger.resetCount();
					//    3    5:invokestatic    #41  <Method ViewIndexingTrigger CodelessActivityLifecycleTracker.access$200()>
					//    4    8:invokevirtual   #46  <Method void ViewIndexingTrigger.resetCount()>
							MarketingLogger marketinglogger = new MarketingLogger(applicationContext, appId);
					//    5   11:new             #48  <Class MarketingLogger>
					//    6   14:dup             
					//    7   15:aload_0         
					//    8   16:getfield        #25  <Field Context val$applicationContext>
					//    9   19:aload_0         
					//   10   20:getfield        #27  <Field String val$appId>
					//   11   23:invokespecial   #51  <Method void MarketingLogger(Context, String)>
					//   12   26:astore_2        
							marketinglogger.logGestureTriggered();
					//   13   27:aload_2         
					//   14   28:invokevirtual   #54  <Method void MarketingLogger.logGestureTriggered()>
							FetchedAppSettings fetchedappsettings = appSettings;
					//   15   31:aload_0         
					//   16   32:getfield        #29  <Field FetchedAppSettings val$appSettings>
					//   17   35:astore_3        
							if(fetchedappsettings != null && fetchedappsettings.getCodelessEventsEnabled())
					//*  18   36:aload_3         
					//*  19   37:ifnull          55
					//*  20   40:aload_3         
					//*  21   41:invokevirtual   #60  <Method boolean FetchedAppSettings.getCodelessEventsEnabled()>
					//*  22   44:ifeq            55
								CodelessActivityLifecycleTracker.checkCodelessSession(appId, marketinglogger);
					//   23   47:aload_0         
					//   24   48:getfield        #27  <Field String val$appId>
					//   25   51:aload_2         
					//   26   52:invokestatic    #64  <Method void CodelessActivityLifecycleTracker.checkCodelessSession(String, MarketingLogger)>
						}
					//   27   55:return          
					}

					final _cls1 this$0;
					final String val$appId;
					final FetchedAppSettings val$appSettings;
					final Context val$applicationContext;

			
			{
				this$0 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CodelessActivityLifecycleTracker$1 this$0>
				applicationContext = context;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Context val$applicationContext>
				appId = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field String val$appId>
				appSettings = FetchedAppSettings.this;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field FetchedAppSettings val$appSettings>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
				}
);
			//   24   49:invokestatic    #40  <Method ViewIndexingTrigger CodelessActivityLifecycleTracker.access$200()>
			//   25   52:new             #13  <Class CodelessActivityLifecycleTracker$1$1>
			//   26   55:dup             
			//   27   56:aload_0         
			//   28   57:aload_2         
			//   29   58:aload_3         
			//   30   59:aload           4
			//   31   61:invokespecial   #90  <Method void CodelessActivityLifecycleTracker$1$1(CodelessActivityLifecycleTracker$1, Context, String, FetchedAppSettings)>
			//   32   64:invokevirtual   #96  <Method void ViewIndexingTrigger.setOnShakeListener(ViewIndexingTrigger$OnShakeListener)>
				CodelessActivityLifecycleTracker.sensorManager.registerListener(((android.hardware.SensorEventListener) (CodelessActivityLifecycleTracker.viewIndexingTrigger)), sensor, 2);
			//   33   67:invokestatic    #36  <Method SensorManager CodelessActivityLifecycleTracker.access$000()>
			//   34   70:invokestatic    #40  <Method ViewIndexingTrigger CodelessActivityLifecycleTracker.access$200()>
			//   35   73:aload           5
			//   36   75:iconst_2        
			//   37   76:invokevirtual   #100 <Method boolean SensorManager.registerListener(android.hardware.SensorEventListener, android.hardware.Sensor, int)>
			//   38   79:pop             
				if(fetchedappsettings != null && fetchedappsettings.getCodelessEventsEnabled())
			//*  39   80:aload           4
			//*  40   82:ifnull          99
			//*  41   85:aload           4
			//*  42   87:invokevirtual   #106 <Method boolean FetchedAppSettings.getCodelessEventsEnabled()>
			//*  43   90:ifeq            99
					CodelessActivityLifecycleTracker.viewIndexer.schedule();
			//   44   93:invokestatic    #27  <Method ViewIndexer CodelessActivityLifecycleTracker.access$100()>
			//   45   96:invokevirtual   #109 <Method void ViewIndexer.schedule()>
			//   46   99:return          
			}

			public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
			{
			//    0    0:return          
			}

			public void onActivityStarted(Activity activity)
			{
			//    0    0:return          
			}

			public void onActivityStopped(Activity activity)
			{
			//    0    0:return          
			}

		}
);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class CodelessActivityLifecycleTracker$1>
	//    2    4:dup             
	//    3    5:invokespecial   #108 <Method void CodelessActivityLifecycleTracker$1()>
	//    4    8:invokevirtual   #114 <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
	//    5   11:return          
	}

	public static void updateAppIndexing(Boolean boolean1)
	{
		isAppIndexingEnabled = boolean1;
	//    0    0:aload_0         
	//    1    1:putstatic       #49  <Field Boolean isAppIndexingEnabled>
	//    2    4:return          
	}

	private static final String TAG = ((Class) (com/facebook/marketing/CodelessActivityLifecycleTracker)).getCanonicalName();
	private static String deviceSessionID = null;
	private static Boolean isAppIndexingEnabled = Boolean.valueOf(false);
	private static volatile Boolean isCheckingSession = Boolean.valueOf(false);
	private static SensorManager sensorManager;
	private static ViewIndexer viewIndexer;
	private static final ViewIndexingTrigger viewIndexingTrigger = new ViewIndexingTrigger();

	static 
	{
	//    0    0:ldc1            #2   <Class CodelessActivityLifecycleTracker>
	//    1    2:invokevirtual   #30  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #32  <Field String TAG>
	//    3    8:new             #34  <Class ViewIndexingTrigger>
	//    4   11:dup             
	//    5   12:invokespecial   #37  <Method void ViewIndexingTrigger()>
	//    6   15:putstatic       #39  <Field ViewIndexingTrigger viewIndexingTrigger>
	//    7   18:aconst_null     
	//    8   19:putstatic       #41  <Field String deviceSessionID>
	//    9   22:iconst_0        
	//   10   23:invokestatic    #47  <Method Boolean Boolean.valueOf(boolean)>
	//   11   26:putstatic       #49  <Field Boolean isAppIndexingEnabled>
	//   12   29:iconst_0        
	//   13   30:invokestatic    #47  <Method Boolean Boolean.valueOf(boolean)>
	//   14   33:putstatic       #51  <Field Boolean isCheckingSession>
	//*  15   36:return          
	}


/*
	static SensorManager access$000()
	{
		return sensorManager;
	//    0    0:getstatic       #57  <Field SensorManager sensorManager>
	//    1    3:areturn         
	}

*/


/*
	static SensorManager access$002(SensorManager sensormanager)
	{
		sensorManager = sensormanager;
	//    0    0:aload_0         
	//    1    1:putstatic       #57  <Field SensorManager sensorManager>
		return sensormanager;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static ViewIndexer access$100()
	{
		return viewIndexer;
	//    0    0:getstatic       #63  <Field ViewIndexer viewIndexer>
	//    1    3:areturn         
	}

*/


/*
	static ViewIndexer access$102(ViewIndexer viewindexer)
	{
		viewIndexer = viewindexer;
	//    0    0:aload_0         
	//    1    1:putstatic       #63  <Field ViewIndexer viewIndexer>
		return viewindexer;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static ViewIndexingTrigger access$200()
	{
		return viewIndexingTrigger;
	//    0    0:getstatic       #39  <Field ViewIndexingTrigger viewIndexingTrigger>
	//    1    3:areturn         
	}

*/


/*
	static Boolean access$300()
	{
		return isAppIndexingEnabled;
	//    0    0:getstatic       #49  <Field Boolean isAppIndexingEnabled>
	//    1    3:areturn         
	}

*/


/*
	static Boolean access$302(Boolean boolean1)
	{
		isAppIndexingEnabled = boolean1;
	//    0    0:aload_0         
	//    1    1:putstatic       #49  <Field Boolean isAppIndexingEnabled>
		return boolean1;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static String access$402(String s)
	{
		deviceSessionID = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #41  <Field String deviceSessionID>
		return s;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static Boolean access$502(Boolean boolean1)
	{
		isCheckingSession = boolean1;
	//    0    0:aload_0         
	//    1    1:putstatic       #51  <Field Boolean isCheckingSession>
		return boolean1;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/
}
