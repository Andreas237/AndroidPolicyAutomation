// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.*;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.*;
import com.facebook.appevents.codeless.internal.UnityReflection;
import com.facebook.appevents.internal.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import org.json.*;

// Referenced classes of package com.facebook.internal:
//			AttributionIdentifiers, FetchedAppSettings, Utility, FacebookRequestErrorClassification, 
//			InternalSettings, SmartLoginOption, FetchedAppGateKeepersManager

public final class FetchedAppSettingsManager
{
	static final class FetchAppSettingState extends Enum
	{

		public static FetchAppSettingState valueOf(String s)
		{
			return (FetchAppSettingState)Enum.valueOf(com/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState, s);
		//    0    0:ldc1            #2   <Class FetchedAppSettingsManager$FetchAppSettingState>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class FetchedAppSettingsManager$FetchAppSettingState>
		//    4    9:areturn         
		}

		public static FetchAppSettingState[] values()
		{
			return (FetchAppSettingState[])((FetchAppSettingState []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field FetchedAppSettingsManager$FetchAppSettingState[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState_3B_.clone()>
		//    2    6:checkcast       #46  <Class FetchedAppSettingsManager$FetchAppSettingState[]>
		//    3    9:areturn         
		}

		private static final FetchAppSettingState $VALUES[];
		public static final FetchAppSettingState ERROR;
		public static final FetchAppSettingState LOADING;
		public static final FetchAppSettingState NOT_LOADED;
		public static final FetchAppSettingState SUCCESS;

		static 
		{
			NOT_LOADED = new FetchAppSettingState("NOT_LOADED", 0);
		//    0    0:new             #2   <Class FetchedAppSettingsManager$FetchAppSettingState>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "NOT_LOADED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void FetchedAppSettingsManager$FetchAppSettingState(String, int)>
		//    5   10:putstatic       #24  <Field FetchedAppSettingsManager$FetchAppSettingState NOT_LOADED>
			LOADING = new FetchAppSettingState("LOADING", 1);
		//    6   13:new             #2   <Class FetchedAppSettingsManager$FetchAppSettingState>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "LOADING">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void FetchedAppSettingsManager$FetchAppSettingState(String, int)>
		//   11   23:putstatic       #27  <Field FetchedAppSettingsManager$FetchAppSettingState LOADING>
			SUCCESS = new FetchAppSettingState("SUCCESS", 2);
		//   12   26:new             #2   <Class FetchedAppSettingsManager$FetchAppSettingState>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "SUCCESS">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void FetchedAppSettingsManager$FetchAppSettingState(String, int)>
		//   17   36:putstatic       #30  <Field FetchedAppSettingsManager$FetchAppSettingState SUCCESS>
			ERROR = new FetchAppSettingState("ERROR", 3);
		//   18   39:new             #2   <Class FetchedAppSettingsManager$FetchAppSettingState>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "ERROR">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void FetchedAppSettingsManager$FetchAppSettingState(String, int)>
		//   23   49:putstatic       #33  <Field FetchedAppSettingsManager$FetchAppSettingState ERROR>
			$VALUES = (new FetchAppSettingState[] {
				NOT_LOADED, LOADING, SUCCESS, ERROR
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       FetchAppSettingState[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field FetchedAppSettingsManager$FetchAppSettingState NOT_LOADED>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field FetchedAppSettingsManager$FetchAppSettingState LOADING>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field FetchedAppSettingsManager$FetchAppSettingState SUCCESS>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field FetchedAppSettingsManager$FetchAppSettingState ERROR>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field FetchedAppSettingsManager$FetchAppSettingState[] $VALUES>
		//*  43   83:return          
		}

		private FetchAppSettingState(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static interface FetchedAppSettingsCallback
	{

		public abstract void onError();

		public abstract void onSuccess(FetchedAppSettings fetchedappsettings);
	}


	public FetchedAppSettingsManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #137 <Method void Object()>
	//    2    4:return          
	}

	public static void getAppSettingsAsync(FetchedAppSettingsCallback fetchedappsettingscallback)
	{
		fetchedAppSettingsCallbacks.add(((Object) (fetchedappsettingscallback)));
	//    0    0:getstatic       #129 <Field ConcurrentLinkedQueue fetchedAppSettingsCallbacks>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #169 <Method boolean ConcurrentLinkedQueue.add(Object)>
	//    3    7:pop             
		loadAppSettingsAsync();
	//    4    8:invokestatic    #172 <Method void loadAppSettingsAsync()>
	//    5   11:return          
	}

	private static JSONObject getAppSettingsQueryResponse(String s)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #174 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #175 <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("fields", TextUtils.join(",", ((Iterable) (new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (APP_SETTING_FIELDS))))))))));
	//    4    8:aload_1         
	//    5    9:ldc1            #23  <String "fields">
	//    6   11:ldc1            #177 <String ",">
	//    7   13:new             #179 <Class ArrayList>
	//    8   16:dup             
	//    9   17:getstatic       #106 <Field String[] APP_SETTING_FIELDS>
	//   10   20:invokestatic    #185 <Method java.util.List Arrays.asList(Object[])>
	//   11   23:invokespecial   #188 <Method void ArrayList(java.util.Collection)>
	//   12   26:invokestatic    #194 <Method String TextUtils.join(CharSequence, Iterable)>
	//   13   29:invokevirtual   #198 <Method void Bundle.putString(String, String)>
		AttributionIdentifiers attributionidentifiers = AttributionIdentifiers.getAttributionIdentifiers(FacebookSdk.getApplicationContext());
	//   14   32:invokestatic    #204 <Method Context FacebookSdk.getApplicationContext()>
	//   15   35:invokestatic    #210 <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(Context)>
	//   16   38:astore_2        
		if(attributionidentifiers != null && attributionidentifiers.getAndroidAdvertiserId() != null)
	//*  17   39:aload_2         
	//*  18   40:ifnull          60
	//*  19   43:aload_2         
	//*  20   44:invokevirtual   #213 <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//*  21   47:ifnull          60
			bundle.putString("advertiser_id", attributionidentifiers.getAndroidAdvertiserId());
	//   22   50:aload_1         
	//   23   51:ldc1            #20  <String "advertiser_id">
	//   24   53:aload_2         
	//   25   54:invokevirtual   #213 <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//   26   57:invokevirtual   #198 <Method void Bundle.putString(String, String)>
		s = ((String) (GraphRequest.newGraphPathRequest(((com.facebook.AccessToken) (null)), s, ((com.facebook.GraphRequest.Callback) (null)))));
	//   27   60:aconst_null     
	//   28   61:aload_0         
	//   29   62:aconst_null     
	//   30   63:invokestatic    #219 <Method GraphRequest GraphRequest.newGraphPathRequest(com.facebook.AccessToken, String, com.facebook.GraphRequest$Callback)>
	//   31   66:astore_0        
		((GraphRequest) (s)).setSkipClientToken(true);
	//   32   67:aload_0         
	//   33   68:iconst_1        
	//   34   69:invokevirtual   #223 <Method void GraphRequest.setSkipClientToken(boolean)>
		((GraphRequest) (s)).setParameters(bundle);
	//   35   72:aload_0         
	//   36   73:aload_1         
	//   37   74:invokevirtual   #227 <Method void GraphRequest.setParameters(Bundle)>
		return ((GraphRequest) (s)).executeAndWait().getJSONObject();
	//   38   77:aload_0         
	//   39   78:invokevirtual   #231 <Method GraphResponse GraphRequest.executeAndWait()>
	//   40   81:invokevirtual   #237 <Method JSONObject GraphResponse.getJSONObject()>
	//   41   84:areturn         
	}

	public static FetchedAppSettings getAppSettingsWithoutQuery(String s)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          17
			return (FetchedAppSettings)fetchedAppSettings.get(((Object) (s)));
	//    2    4:getstatic       #113 <Field Map fetchedAppSettings>
	//    3    7:aload_0         
	//    4    8:invokeinterface #245 <Method Object Map.get(Object)>
	//    5   13:checkcast       #247 <Class FetchedAppSettings>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public static void loadAppSettingsAsync()
	{
		Context context = FacebookSdk.getApplicationContext();
	//    0    0:invokestatic    #204 <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:astore_1        
		String s = FacebookSdk.getApplicationId();
	//    2    4:invokestatic    #250 <Method String FacebookSdk.getApplicationId()>
	//    3    7:astore_2        
		if(Utility.isNullOrEmpty(s))
	//*   4    8:aload_2         
	//*   5    9:invokestatic    #256 <Method boolean Utility.isNullOrEmpty(String)>
	//*   6   12:ifeq            28
		{
			loadingState.set(((Object) (FetchAppSettingState.ERROR)));
	//    7   15:getstatic       #124 <Field AtomicReference loadingState>
	//    8   18:getstatic       #259 <Field FetchedAppSettingsManager$FetchAppSettingState FetchedAppSettingsManager$FetchAppSettingState.ERROR>
	//    9   21:invokevirtual   #262 <Method void AtomicReference.set(Object)>
			pollCallbacks();
	//   10   24:invokestatic    #163 <Method void pollCallbacks()>
			return;
	//   11   27:return          
		}
		if(fetchedAppSettings.containsKey(((Object) (s))))
	//*  12   28:getstatic       #113 <Field Map fetchedAppSettings>
	//*  13   31:aload_2         
	//*  14   32:invokeinterface #265 <Method boolean Map.containsKey(Object)>
	//*  15   37:ifeq            53
		{
			loadingState.set(((Object) (FetchAppSettingState.SUCCESS)));
	//   16   40:getstatic       #124 <Field AtomicReference loadingState>
	//   17   43:getstatic       #268 <Field FetchedAppSettingsManager$FetchAppSettingState FetchedAppSettingsManager$FetchAppSettingState.SUCCESS>
	//   18   46:invokevirtual   #262 <Method void AtomicReference.set(Object)>
			pollCallbacks();
	//   19   49:invokestatic    #163 <Method void pollCallbacks()>
			return;
	//   20   52:return          
		}
		boolean flag;
		if(!loadingState.compareAndSet(((Object) (FetchAppSettingState.NOT_LOADED)), ((Object) (FetchAppSettingState.LOADING))) && !loadingState.compareAndSet(((Object) (FetchAppSettingState.ERROR)), ((Object) (FetchAppSettingState.LOADING))))
	//*  21   53:getstatic       #124 <Field AtomicReference loadingState>
	//*  22   56:getstatic       #119 <Field FetchedAppSettingsManager$FetchAppSettingState FetchedAppSettingsManager$FetchAppSettingState.NOT_LOADED>
	//*  23   59:getstatic       #271 <Field FetchedAppSettingsManager$FetchAppSettingState FetchedAppSettingsManager$FetchAppSettingState.LOADING>
	//*  24   62:invokevirtual   #275 <Method boolean AtomicReference.compareAndSet(Object, Object)>
	//*  25   65:ifne            91
	//*  26   68:getstatic       #124 <Field AtomicReference loadingState>
	//*  27   71:getstatic       #259 <Field FetchedAppSettingsManager$FetchAppSettingState FetchedAppSettingsManager$FetchAppSettingState.ERROR>
	//*  28   74:getstatic       #271 <Field FetchedAppSettingsManager$FetchAppSettingState FetchedAppSettingsManager$FetchAppSettingState.LOADING>
	//*  29   77:invokevirtual   #275 <Method boolean AtomicReference.compareAndSet(Object, Object)>
	//*  30   80:ifeq            86
	//*  31   83:goto            91
			flag = false;
	//   32   86:iconst_0        
	//   33   87:istore_0        
		else
	//*  34   88:goto            93
			flag = true;
	//   35   91:iconst_1        
	//   36   92:istore_0        
		if(!flag)
	//*  37   93:iload_0         
	//*  38   94:ifne            101
		{
			pollCallbacks();
	//   39   97:invokestatic    #163 <Method void pollCallbacks()>
			return;
	//   40  100:return          
		} else
		{
			String s1 = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[] {
				s
			});
	//   41  101:ldc1            #26  <String "com.facebook.internal.APP_SETTINGS.%s">
	//   42  103:iconst_1        
	//   43  104:anewarray       Object[]
	//   44  107:dup             
	//   45  108:iconst_0        
	//   46  109:aload_2         
	//   47  110:aastore         
	//   48  111:invokestatic    #279 <Method String String.format(String, Object[])>
	//   49  114:astore_3        
			FacebookSdk.getExecutor().execute(new Runnable(context, s1, s) {

				public void run()
				{
					SharedPreferences sharedpreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field Context val$context>
				//    2    4:ldc1            #32  <String "com.facebook.internal.preferences.APP_SETTINGS">
				//    3    6:iconst_0        
				//    4    7:invokevirtual   #38  <Method SharedPreferences Context.getSharedPreferences(String, int)>
				//    5   10:astore          4
					Object obj = ((Object) (settingsKey));
				//    6   12:aload_0         
				//    7   13:getfield        #22  <Field String val$settingsKey>
				//    8   16:astore_1        
					Object obj2 = null;
				//    9   17:aconst_null     
				//   10   18:astore_3        
					Object obj1 = ((Object) (sharedpreferences.getString(((String) (obj)), ((String) (null)))));
				//   11   19:aload           4
				//   12   21:aload_1         
				//   13   22:aconst_null     
				//   14   23:invokeinterface #44  <Method String SharedPreferences.getString(String, String)>
				//   15   28:astore_2        
					obj = ((Object) (obj2));
				//   16   29:aload_3         
				//   17   30:astore_1        
					if(!Utility.isNullOrEmpty(((String) (obj1))))
				//*  18   31:aload_2         
				//*  19   32:invokestatic    #50  <Method boolean Utility.isNullOrEmpty(String)>
				//*  20   35:ifne            74
					{
						try
						{
							obj1 = ((Object) (new JSONObject(((String) (obj1)))));
				//   21   38:new             #52  <Class JSONObject>
				//   22   41:dup             
				//   23   42:aload_2         
				//   24   43:invokespecial   #55  <Method void JSONObject(String)>
				//   25   46:astore_2        
						}
				//*  26   47:goto            59
						// Misplaced declaration of an exception variable
						catch(Object obj)
				//*  27   50:astore_1        
						{
							Utility.logd("FacebookSDK", ((Exception) (obj)));
				//   28   51:ldc1            #57  <String "FacebookSDK">
				//   29   53:aload_1         
				//   30   54:invokestatic    #61  <Method void Utility.logd(String, Exception)>
							obj1 = null;
				//   31   57:aconst_null     
				//   32   58:astore_2        
						}
						obj = ((Object) (obj2));
				//   33   59:aload_3         
				//   34   60:astore_1        
						if(obj1 != null)
				//*  35   61:aload_2         
				//*  36   62:ifnull          74
							obj = ((Object) (FetchedAppSettingsManager.parseAppSettingsFromJSON(applicationId, ((JSONObject) (obj1)))));
				//   37   65:aload_0         
				//   38   66:getfield        #24  <Field String val$applicationId>
				//   39   69:aload_2         
				//   40   70:invokestatic    #65  <Method FetchedAppSettings FetchedAppSettingsManager.access$000(String, JSONObject)>
				//   41   73:astore_1        
					}
					obj1 = ((Object) (FetchedAppSettingsManager.getAppSettingsQueryResponse(applicationId)));
				//   42   74:aload_0         
				//   43   75:getfield        #24  <Field String val$applicationId>
				//   44   78:invokestatic    #69  <Method JSONObject FetchedAppSettingsManager.access$100(String)>
				//   45   81:astore_2        
					if(obj1 != null)
				//*  46   82:aload_2         
				//*  47   83:ifnull          120
					{
						FetchedAppSettingsManager.parseAppSettingsFromJSON(applicationId, ((JSONObject) (obj1)));
				//   48   86:aload_0         
				//   49   87:getfield        #24  <Field String val$applicationId>
				//   50   90:aload_2         
				//   51   91:invokestatic    #65  <Method FetchedAppSettings FetchedAppSettingsManager.access$000(String, JSONObject)>
				//   52   94:pop             
						sharedpreferences.edit().putString(settingsKey, ((JSONObject) (obj1)).toString()).apply();
				//   53   95:aload           4
				//   54   97:invokeinterface #73  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
				//   55  102:aload_0         
				//   56  103:getfield        #22  <Field String val$settingsKey>
				//   57  106:aload_2         
				//   58  107:invokevirtual   #77  <Method String JSONObject.toString()>
				//   59  110:invokeinterface #83  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
				//   60  115:invokeinterface #86  <Method void android.content.SharedPreferences$Editor.apply()>
					}
					if(obj != null)
				//*  61  120:aload_1         
				//*  62  121:ifnull          159
					{
						obj = ((Object) (((FetchedAppSettings) (obj)).getSdkUpdateMessage()));
				//   63  124:aload_1         
				//   64  125:invokevirtual   #91  <Method String FetchedAppSettings.getSdkUpdateMessage()>
				//   65  128:astore_1        
						if(!FetchedAppSettingsManager.printedSDKUpdatedMessage && obj != null && ((String) (obj)).length() > 0)
				//*  66  129:invokestatic    #95  <Method boolean FetchedAppSettingsManager.access$200()>
				//*  67  132:ifne            159
				//*  68  135:aload_1         
				//*  69  136:ifnull          159
				//*  70  139:aload_1         
				//*  71  140:invokevirtual   #101 <Method int String.length()>
				//*  72  143:ifle            159
						{
							FetchedAppSettingsManager.printedSDKUpdatedMessage = true;
				//   73  146:iconst_1        
				//   74  147:invokestatic    #105 <Method boolean FetchedAppSettingsManager.access$202(boolean)>
				//   75  150:pop             
							Log.w(FetchedAppSettingsManager.TAG, ((String) (obj)));
				//   76  151:invokestatic    #108 <Method String FetchedAppSettingsManager.access$300()>
				//   77  154:aload_1         
				//   78  155:invokestatic    #114 <Method int Log.w(String, String)>
				//   79  158:pop             
						}
					}
					FetchedAppGateKeepersManager.queryAppGateKeepers(applicationId, true);
				//   80  159:aload_0         
				//   81  160:getfield        #24  <Field String val$applicationId>
				//   82  163:iconst_1        
				//   83  164:invokestatic    #120 <Method JSONObject FetchedAppGateKeepersManager.queryAppGateKeepers(String, boolean)>
				//   84  167:pop             
					AutomaticAnalyticsLogger.logActivateAppEvent();
				//   85  168:invokestatic    #125 <Method void AutomaticAnalyticsLogger.logActivateAppEvent()>
					InAppPurchaseActivityLifecycleTracker.update();
				//   86  171:invokestatic    #130 <Method void InAppPurchaseActivityLifecycleTracker.update()>
					obj1 = ((Object) (FetchedAppSettingsManager.loadingState));
				//   87  174:invokestatic    #134 <Method AtomicReference FetchedAppSettingsManager.access$500()>
				//   88  177:astore_2        
					if(FetchedAppSettingsManager.fetchedAppSettings.containsKey(((Object) (applicationId))))
				//*  89  178:invokestatic    #138 <Method Map FetchedAppSettingsManager.access$400()>
				//*  90  181:aload_0         
				//*  91  182:getfield        #24  <Field String val$applicationId>
				//*  92  185:invokeinterface #144 <Method boolean Map.containsKey(Object)>
				//*  93  190:ifeq            200
						obj = ((Object) (FetchAppSettingState.SUCCESS));
				//   94  193:getstatic       #150 <Field FetchedAppSettingsManager$FetchAppSettingState FetchedAppSettingsManager$FetchAppSettingState.SUCCESS>
				//   95  196:astore_1        
					else
				//*  96  197:goto            204
						obj = ((Object) (FetchAppSettingState.ERROR));
				//   97  200:getstatic       #153 <Field FetchedAppSettingsManager$FetchAppSettingState FetchedAppSettingsManager$FetchAppSettingState.ERROR>
				//   98  203:astore_1        
					((AtomicReference) (obj1)).set(obj);
				//   99  204:aload_2         
				//  100  205:aload_1         
				//  101  206:invokevirtual   #159 <Method void AtomicReference.set(Object)>
					FetchedAppSettingsManager.pollCallbacks();
				//  102  209:invokestatic    #162 <Method void FetchedAppSettingsManager.access$600()>
				//  103  212:return          
				}

				final String val$applicationId;
				final Context val$context;
				final String val$settingsKey;

			
			{
				context = context1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Context val$context>
				settingsKey = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field String val$settingsKey>
				applicationId = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field String val$applicationId>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   50  115:invokestatic    #283 <Method Executor FacebookSdk.getExecutor()>
	//   51  118:new             #6   <Class FetchedAppSettingsManager$1>
	//   52  121:dup             
	//   53  122:aload_1         
	//   54  123:aload_3         
	//   55  124:aload_2         
	//   56  125:invokespecial   #286 <Method void FetchedAppSettingsManager$1(Context, String, String)>
	//   57  128:invokeinterface #292 <Method void Executor.execute(Runnable)>
			return;
	//   58  133:return          
		}
	}

	private static FetchedAppSettings parseAppSettingsFromJSON(String s, JSONObject jsonobject)
	{
		Object obj = ((Object) (jsonobject.optJSONArray("android_sdk_error_categories")));
	//    0    0:aload_1         
	//    1    1:ldc1            #32  <String "android_sdk_error_categories">
	//    2    3:invokevirtual   #298 <Method JSONArray JSONObject.optJSONArray(String)>
	//    3    6:astore          8
		if(obj == null)
	//*   4    8:aload           8
	//*   5   10:ifnonnull       21
			obj = ((Object) (FacebookRequestErrorClassification.getDefaultErrorClassification()));
	//    6   13:invokestatic    #304 <Method FacebookRequestErrorClassification FacebookRequestErrorClassification.getDefaultErrorClassification()>
	//    7   16:astore          8
		else
	//*   8   18:goto            28
			obj = ((Object) (FacebookRequestErrorClassification.createFromJSON(((JSONArray) (obj)))));
	//    9   21:aload           8
	//   10   23:invokestatic    #308 <Method FacebookRequestErrorClassification FacebookRequestErrorClassification.createFromJSON(JSONArray)>
	//   11   26:astore          8
		int i = jsonobject.optInt("app_events_feature_bitmask", 0);
	//   12   28:aload_1         
	//   13   29:ldc1            #41  <String "app_events_feature_bitmask">
	//   14   31:iconst_0        
	//   15   32:invokevirtual   #312 <Method int JSONObject.optInt(String, int)>
	//   16   35:istore_2        
		boolean flag;
		if((i & 8) != 0)
	//*  17   36:iload_2         
	//*  18   37:bipush          8
	//*  19   39:iand            
	//*  20   40:ifeq            48
			flag = true;
	//   21   43:iconst_1        
	//   22   44:istore_3        
		else
	//*  23   45:goto            50
			flag = false;
	//   24   48:iconst_0        
	//   25   49:istore_3        
		boolean flag1;
		if((i & 0x10) != 0)
	//*  26   50:iload_2         
	//*  27   51:bipush          16
	//*  28   53:iand            
	//*  29   54:ifeq            63
			flag1 = true;
	//   30   57:iconst_1        
	//   31   58:istore          4
		else
	//*  32   60:goto            66
			flag1 = false;
	//   33   63:iconst_0        
	//   34   64:istore          4
		boolean flag2;
		if((i & 0x20) != 0)
	//*  35   66:iload_2         
	//*  36   67:bipush          32
	//*  37   69:iand            
	//*  38   70:ifeq            79
			flag2 = true;
	//   39   73:iconst_1        
	//   40   74:istore          5
		else
	//*  41   76:goto            82
			flag2 = false;
	//   42   79:iconst_0        
	//   43   80:istore          5
		boolean flag3;
		if((i & 0x100) != 0)
	//*  44   82:iload_2         
	//*  45   83:sipush          256
	//*  46   86:iand            
	//*  47   87:ifeq            96
			flag3 = true;
	//   48   90:iconst_1        
	//   49   91:istore          6
		else
	//*  50   93:goto            99
			flag3 = false;
	//   51   96:iconst_0        
	//   52   97:istore          6
		boolean flag4 = jsonobject.optBoolean("auto_event_setup_enabled", false);
	//   53   99:aload_1         
	//   54  100:ldc1            #35  <String "auto_event_setup_enabled">
	//   55  102:iconst_0        
	//   56  103:invokevirtual   #316 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   57  106:istore          7
		JSONArray jsonarray = jsonobject.optJSONArray("auto_event_mapping_android");
	//   58  108:aload_1         
	//   59  109:ldc1            #38  <String "auto_event_mapping_android">
	//   60  111:invokevirtual   #298 <Method JSONArray JSONObject.optJSONArray(String)>
	//   61  114:astore          9
		unityEventBindings = jsonarray;
	//   62  116:aload           9
	//   63  118:putstatic       #135 <Field JSONArray unityEventBindings>
		if(unityEventBindings != null && InternalSettings.isUnityApp())
	//*  64  121:getstatic       #135 <Field JSONArray unityEventBindings>
	//*  65  124:ifnull          141
	//*  66  127:invokestatic    #321 <Method boolean InternalSettings.isUnityApp()>
	//*  67  130:ifeq            141
			UnityReflection.sendEventMapping(jsonarray.toString());
	//   68  133:aload           9
	//   69  135:invokevirtual   #326 <Method String JSONArray.toString()>
	//   70  138:invokestatic    #332 <Method void UnityReflection.sendEventMapping(String)>
		jsonobject = ((JSONObject) (new FetchedAppSettings(jsonobject.optBoolean("supports_implicit_sdk_logging", false), jsonobject.optString("gdpv4_nux_content", ""), jsonobject.optBoolean("gdpv4_nux_enabled", false), jsonobject.optBoolean("gdpv4_chrome_custom_tabs_enabled", false), jsonobject.optInt("app_events_session_timeout", Constants.getDefaultAppEventsSessionTimeoutInSeconds()), SmartLoginOption.parseOptions(jsonobject.optLong("seamless_login")), parseDialogConfigurations(jsonobject.optJSONObject("android_dialog_configs")), flag, ((FacebookRequestErrorClassification) (obj)), jsonobject.optString("smart_login_bookmark_icon_url"), jsonobject.optString("smart_login_menu_icon_url"), flag1, flag2, jsonarray, jsonobject.optString("sdk_update_message"), flag3, flag4)));
	//   71  141:new             #247 <Class FetchedAppSettings>
	//   72  144:dup             
	//   73  145:aload_1         
	//   74  146:ldc1            #64  <String "supports_implicit_sdk_logging">
	//   75  148:iconst_0        
	//   76  149:invokevirtual   #316 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   77  152:aload_1         
	//   78  153:ldc1            #55  <String "gdpv4_nux_content">
	//   79  155:ldc2            #334 <String "">
	//   80  158:invokevirtual   #338 <Method String JSONObject.optString(String, String)>
	//   81  161:aload_1         
	//   82  162:ldc1            #58  <String "gdpv4_nux_enabled">
	//   83  164:iconst_0        
	//   84  165:invokevirtual   #316 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   85  168:aload_1         
	//   86  169:ldc1            #47  <String "gdpv4_chrome_custom_tabs_enabled">
	//   87  171:iconst_0        
	//   88  172:invokevirtual   #316 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   89  175:aload_1         
	//   90  176:ldc1            #44  <String "app_events_session_timeout">
	//   91  178:invokestatic    #344 <Method int Constants.getDefaultAppEventsSessionTimeoutInSeconds()>
	//   92  181:invokevirtual   #312 <Method int JSONObject.optInt(String, int)>
	//   93  184:aload_1         
	//   94  185:ldc1            #61  <String "seamless_login">
	//   95  187:invokevirtual   #348 <Method long JSONObject.optLong(String)>
	//   96  190:invokestatic    #354 <Method java.util.EnumSet SmartLoginOption.parseOptions(long)>
	//   97  193:aload_1         
	//   98  194:ldc1            #50  <String "android_dialog_configs">
	//   99  196:invokevirtual   #357 <Method JSONObject JSONObject.optJSONObject(String)>
	//  100  199:invokestatic    #361 <Method Map parseDialogConfigurations(JSONObject)>
	//  101  202:iload_3         
	//  102  203:aload           8
	//  103  205:aload_1         
	//  104  206:ldc1            #77  <String "smart_login_bookmark_icon_url">
	//  105  208:invokevirtual   #364 <Method String JSONObject.optString(String)>
	//  106  211:aload_1         
	//  107  212:ldc1            #80  <String "smart_login_menu_icon_url">
	//  108  214:invokevirtual   #364 <Method String JSONObject.optString(String)>
	//  109  217:iload           4
	//  110  219:iload           5
	//  111  221:aload           9
	//  112  223:aload_1         
	//  113  224:ldc1            #74  <String "sdk_update_message">
	//  114  226:invokevirtual   #364 <Method String JSONObject.optString(String)>
	//  115  229:iload           6
	//  116  231:iload           7
	//  117  233:invokespecial   #367 <Method void FetchedAppSettings(boolean, String, boolean, boolean, int, java.util.EnumSet, Map, boolean, FacebookRequestErrorClassification, String, String, boolean, boolean, JSONArray, String, boolean, boolean)>
	//  118  236:astore_1        
		fetchedAppSettings.put(((Object) (s)), ((Object) (jsonobject)));
	//  119  237:getstatic       #113 <Field Map fetchedAppSettings>
	//  120  240:aload_0         
	//  121  241:aload_1         
	//  122  242:invokeinterface #371 <Method Object Map.put(Object, Object)>
	//  123  247:pop             
		return ((FetchedAppSettings) (jsonobject));
	//  124  248:aload_1         
	//  125  249:areturn         
	}

	private static Map parseDialogConfigurations(JSONObject jsonobject)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #373 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #374 <Method void HashMap()>
	//    3    7:astore_3        
		if(jsonobject != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          116
		{
			JSONArray jsonarray = jsonobject.optJSONArray("data");
	//    6   12:aload_0         
	//    7   13:ldc2            #376 <String "data">
	//    8   16:invokevirtual   #298 <Method JSONArray JSONObject.optJSONArray(String)>
	//    9   19:astore          4
			if(jsonarray != null)
	//*  10   21:aload           4
	//*  11   23:ifnull          116
			{
				for(int i = 0; i < jsonarray.length(); i++)
	//*  12   26:iconst_0        
	//*  13   27:istore_1        
	//*  14   28:iload_1         
	//*  15   29:aload           4
	//*  16   31:invokevirtual   #379 <Method int JSONArray.length()>
	//*  17   34:icmpge          116
				{
					FetchedAppSettings.DialogFeatureConfig dialogfeatureconfig = FetchedAppSettings.DialogFeatureConfig.parseDialogConfig(jsonarray.optJSONObject(i));
	//   18   37:aload           4
	//   19   39:iload_1         
	//   20   40:invokevirtual   #382 <Method JSONObject JSONArray.optJSONObject(int)>
	//   21   43:invokestatic    #388 <Method FetchedAppSettings$DialogFeatureConfig FetchedAppSettings$DialogFeatureConfig.parseDialogConfig(JSONObject)>
	//   22   46:astore          5
					if(dialogfeatureconfig == null)
	//*  23   48:aload           5
	//*  24   50:ifnonnull       56
						continue;
	//   25   53:goto            109
					String s = dialogfeatureconfig.getDialogName();
	//   26   56:aload           5
	//   27   58:invokevirtual   #391 <Method String FetchedAppSettings$DialogFeatureConfig.getDialogName()>
	//   28   61:astore          6
					Map map = (Map)hashmap.get(((Object) (s)));
	//   29   63:aload_3         
	//   30   64:aload           6
	//   31   66:invokevirtual   #392 <Method Object HashMap.get(Object)>
	//   32   69:checkcast       #241 <Class Map>
	//   33   72:astore_2        
					jsonobject = ((JSONObject) (map));
	//   34   73:aload_2         
	//   35   74:astore_0        
					if(map == null)
	//*  36   75:aload_2         
	//*  37   76:ifnonnull       95
					{
						jsonobject = ((JSONObject) (new HashMap()));
	//   38   79:new             #373 <Class HashMap>
	//   39   82:dup             
	//   40   83:invokespecial   #374 <Method void HashMap()>
	//   41   86:astore_0        
						hashmap.put(((Object) (s)), ((Object) (jsonobject)));
	//   42   87:aload_3         
	//   43   88:aload           6
	//   44   90:aload_0         
	//   45   91:invokevirtual   #393 <Method Object HashMap.put(Object, Object)>
	//   46   94:pop             
					}
					((Map) (jsonobject)).put(((Object) (dialogfeatureconfig.getFeatureName())), ((Object) (dialogfeatureconfig)));
	//   47   95:aload_0         
	//   48   96:aload           5
	//   49   98:invokevirtual   #396 <Method String FetchedAppSettings$DialogFeatureConfig.getFeatureName()>
	//   50  101:aload           5
	//   51  103:invokeinterface #371 <Method Object Map.put(Object, Object)>
	//   52  108:pop             
				}

	//   53  109:iload_1         
	//   54  110:iconst_1        
	//   55  111:iadd            
	//   56  112:istore_1        
			}
		}
	//*  57  113:goto            28
		return ((Map) (hashmap));
	//   58  116:aload_3         
	//   59  117:areturn         
	}

	private static void pollCallbacks()
	{
		com/facebook/internal/FetchedAppSettingsManager;
	//    0    0:ldc1            #2   <Class FetchedAppSettingsManager>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		FetchAppSettingState fetchappsettingstate;
		fetchappsettingstate = (FetchAppSettingState)loadingState.get();
	//    2    3:getstatic       #124 <Field AtomicReference loadingState>
	//    3    6:invokevirtual   #401 <Method Object AtomicReference.get()>
	//    4    9:checkcast       #12  <Class FetchedAppSettingsManager$FetchAppSettingState>
	//    5   12:astore_0        
		if(FetchAppSettingState.NOT_LOADED.equals(((Object) (fetchappsettingstate))) || FetchAppSettingState.LOADING.equals(((Object) (fetchappsettingstate))))
	//*   6   13:getstatic       #119 <Field FetchedAppSettingsManager$FetchAppSettingState FetchedAppSettingsManager$FetchAppSettingState.NOT_LOADED>
	//*   7   16:aload_0         
	//*   8   17:invokevirtual   #404 <Method boolean FetchedAppSettingsManager$FetchAppSettingState.equals(Object)>
	//*   9   20:ifne            149
	//*  10   23:getstatic       #271 <Field FetchedAppSettingsManager$FetchAppSettingState FetchedAppSettingsManager$FetchAppSettingState.LOADING>
	//*  11   26:aload_0         
	//*  12   27:invokevirtual   #404 <Method boolean FetchedAppSettingsManager$FetchAppSettingState.equals(Object)>
	//*  13   30:ifeq            36
			break MISSING_BLOCK_LABEL_149;
	//   14   33:goto            149
		Object obj;
		Handler handler;
		obj = ((Object) (FacebookSdk.getApplicationId()));
	//   15   36:invokestatic    #250 <Method String FacebookSdk.getApplicationId()>
	//   16   39:astore_1        
		obj = ((Object) ((FetchedAppSettings)fetchedAppSettings.get(obj)));
	//   17   40:getstatic       #113 <Field Map fetchedAppSettings>
	//   18   43:aload_1         
	//   19   44:invokeinterface #245 <Method Object Map.get(Object)>
	//   20   49:checkcast       #247 <Class FetchedAppSettings>
	//   21   52:astore_1        
		handler = new Handler(Looper.getMainLooper());
	//   22   53:new             #406 <Class Handler>
	//   23   56:dup             
	//   24   57:invokestatic    #412 <Method Looper Looper.getMainLooper()>
	//   25   60:invokespecial   #415 <Method void Handler(Looper)>
	//   26   63:astore_2        
		if(!FetchAppSettingState.ERROR.equals(((Object) (fetchappsettingstate))))
			break MISSING_BLOCK_LABEL_111;
	//   27   64:getstatic       #259 <Field FetchedAppSettingsManager$FetchAppSettingState FetchedAppSettingsManager$FetchAppSettingState.ERROR>
	//   28   67:aload_0         
	//   29   68:invokevirtual   #404 <Method boolean FetchedAppSettingsManager$FetchAppSettingState.equals(Object)>
	//   30   71:ifeq            111
		for(; !fetchedAppSettingsCallbacks.isEmpty(); handler.post(new Runnable((FetchedAppSettingsCallback)fetchedAppSettingsCallbacks.poll()) {

		public void run()
		{
			callback.onError();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field FetchedAppSettingsManager$FetchedAppSettingsCallback val$callback>
		//    2    4:invokeinterface #26  <Method void FetchedAppSettingsManager$FetchedAppSettingsCallback.onError()>
		//    3    9:return          
		}

		final FetchedAppSettingsCallback val$callback;

			
			{
				callback = fetchedappsettingscallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FetchedAppSettingsManager$FetchedAppSettingsCallback val$callback>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
	}
));
	//   31   74:getstatic       #129 <Field ConcurrentLinkedQueue fetchedAppSettingsCallbacks>
	//   32   77:invokevirtual   #418 <Method boolean ConcurrentLinkedQueue.isEmpty()>
	//   33   80:ifne            107
	//   34   83:aload_2         
	//   35   84:new             #8   <Class FetchedAppSettingsManager$2>
	//   36   87:dup             
	//   37   88:getstatic       #129 <Field ConcurrentLinkedQueue fetchedAppSettingsCallbacks>
	//   38   91:invokevirtual   #421 <Method Object ConcurrentLinkedQueue.poll()>
	//   39   94:checkcast       #15  <Class FetchedAppSettingsManager$FetchedAppSettingsCallback>
	//   40   97:invokespecial   #423 <Method void FetchedAppSettingsManager$2(FetchedAppSettingsManager$FetchedAppSettingsCallback)>
	//   41  100:invokevirtual   #427 <Method boolean Handler.post(Runnable)>
	//   42  103:pop             
	//*  43  104:goto            74
		com/facebook/internal/FetchedAppSettingsManager;
	//   44  107:ldc1            #2   <Class FetchedAppSettingsManager>
		JVM INSTR monitorexit ;
	//   45  109:monitorexit     
		return;
	//   46  110:return          
		for(; !fetchedAppSettingsCallbacks.isEmpty(); handler.post(new Runnable((FetchedAppSettingsCallback)fetchedAppSettingsCallbacks.poll(), ((FetchedAppSettings) (obj))) {

		public void run()
		{
			callback.onSuccess(appSettings);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field FetchedAppSettingsManager$FetchedAppSettingsCallback val$callback>
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field FetchedAppSettings val$appSettings>
		//    4    8:invokeinterface #31  <Method void FetchedAppSettingsManager$FetchedAppSettingsCallback.onSuccess(FetchedAppSettings)>
		//    5   13:return          
		}

		final FetchedAppSettings val$appSettings;
		final FetchedAppSettingsCallback val$callback;

			
			{
				callback = fetchedappsettingscallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FetchedAppSettingsManager$FetchedAppSettingsCallback val$callback>
				appSettings = fetchedappsettings;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field FetchedAppSettings val$appSettings>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
	}
));
	//   47  111:getstatic       #129 <Field ConcurrentLinkedQueue fetchedAppSettingsCallbacks>
	//   48  114:invokevirtual   #418 <Method boolean ConcurrentLinkedQueue.isEmpty()>
	//   49  117:ifne            145
	//   50  120:aload_2         
	//   51  121:new             #10  <Class FetchedAppSettingsManager$3>
	//   52  124:dup             
	//   53  125:getstatic       #129 <Field ConcurrentLinkedQueue fetchedAppSettingsCallbacks>
	//   54  128:invokevirtual   #421 <Method Object ConcurrentLinkedQueue.poll()>
	//   55  131:checkcast       #15  <Class FetchedAppSettingsManager$FetchedAppSettingsCallback>
	//   56  134:aload_1         
	//   57  135:invokespecial   #430 <Method void FetchedAppSettingsManager$3(FetchedAppSettingsManager$FetchedAppSettingsCallback, FetchedAppSettings)>
	//   58  138:invokevirtual   #427 <Method boolean Handler.post(Runnable)>
	//   59  141:pop             
	//*  60  142:goto            111
		com/facebook/internal/FetchedAppSettingsManager;
	//   61  145:ldc1            #2   <Class FetchedAppSettingsManager>
		JVM INSTR monitorexit ;
	//   62  147:monitorexit     
		return;
	//   63  148:return          
		com/facebook/internal/FetchedAppSettingsManager;
	//   64  149:ldc1            #2   <Class FetchedAppSettingsManager>
		JVM INSTR monitorexit ;
	//   65  151:monitorexit     
		return;
	//   66  152:return          
		Exception exception;
		exception;
	//   67  153:astore_0        
	//*  68  154:ldc1            #2   <Class FetchedAppSettingsManager>
		throw exception;
	//   69  156:monitorexit     
	//   70  157:aload_0         
	//   71  158:athrow          
	}

	public static FetchedAppSettings queryAppSettings(String s, boolean flag)
	{
		if(!flag && fetchedAppSettings.containsKey(((Object) (s))))
	//*   0    0:iload_1         
	//*   1    1:ifne            29
	//*   2    4:getstatic       #113 <Field Map fetchedAppSettings>
	//*   3    7:aload_0         
	//*   4    8:invokeinterface #265 <Method boolean Map.containsKey(Object)>
	//*   5   13:ifeq            29
			return (FetchedAppSettings)fetchedAppSettings.get(((Object) (s)));
	//    6   16:getstatic       #113 <Field Map fetchedAppSettings>
	//    7   19:aload_0         
	//    8   20:invokeinterface #245 <Method Object Map.get(Object)>
	//    9   25:checkcast       #247 <Class FetchedAppSettings>
	//   10   28:areturn         
		Object obj = ((Object) (getAppSettingsQueryResponse(s)));
	//   11   29:aload_0         
	//   12   30:invokestatic    #147 <Method JSONObject getAppSettingsQueryResponse(String)>
	//   13   33:astore_2        
		if(obj == null)
	//*  14   34:aload_2         
	//*  15   35:ifnonnull       40
			return null;
	//   16   38:aconst_null     
	//   17   39:areturn         
		obj = ((Object) (parseAppSettingsFromJSON(s, ((JSONObject) (obj)))));
	//   18   40:aload_0         
	//   19   41:aload_2         
	//   20   42:invokestatic    #142 <Method FetchedAppSettings parseAppSettingsFromJSON(String, JSONObject)>
	//   21   45:astore_2        
		if(s.equals(((Object) (FacebookSdk.getApplicationId()))))
	//*  22   46:aload_0         
	//*  23   47:invokestatic    #250 <Method String FacebookSdk.getApplicationId()>
	//*  24   50:invokevirtual   #433 <Method boolean String.equals(Object)>
	//*  25   53:ifeq            68
		{
			loadingState.set(((Object) (FetchAppSettingState.SUCCESS)));
	//   26   56:getstatic       #124 <Field AtomicReference loadingState>
	//   27   59:getstatic       #268 <Field FetchedAppSettingsManager$FetchAppSettingState FetchedAppSettingsManager$FetchAppSettingState.SUCCESS>
	//   28   62:invokevirtual   #262 <Method void AtomicReference.set(Object)>
			pollCallbacks();
	//   29   65:invokestatic    #163 <Method void pollCallbacks()>
		}
		return ((FetchedAppSettings) (obj));
	//   30   68:aload_2         
	//   31   69:areturn         
	}

	public static void setIsUnityInit(boolean flag)
	{
		isUnityInit = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #133 <Field boolean isUnityInit>
		JSONArray jsonarray = unityEventBindings;
	//    2    4:getstatic       #135 <Field JSONArray unityEventBindings>
	//    3    7:astore_1        
		if(jsonarray != null && isUnityInit)
	//*   4    8:aload_1         
	//*   5    9:ifnull          25
	//*   6   12:getstatic       #133 <Field boolean isUnityInit>
	//*   7   15:ifeq            25
			UnityReflection.sendEventMapping(jsonarray.toString());
	//    8   18:aload_1         
	//    9   19:invokevirtual   #326 <Method String JSONArray.toString()>
	//   10   22:invokestatic    #332 <Method void UnityReflection.sendEventMapping(String)>
	//   11   25:return          
	}

	private static final String ADVERTISER_ID_KEY = "advertiser_id";
	private static final String APPLICATION_FIELDS = "fields";
	private static final String APP_SETTINGS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_SETTINGS.%s";
	private static final String APP_SETTINGS_PREFS_STORE = "com.facebook.internal.preferences.APP_SETTINGS";
	private static final String APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES = "android_sdk_error_categories";
	private static final String APP_SETTING_APP_EVENTS_CODELESS_SETUP_ENABLED = "auto_event_setup_enabled";
	private static final String APP_SETTING_APP_EVENTS_EVENT_BINDINGS = "auto_event_mapping_android";
	private static final String APP_SETTING_APP_EVENTS_FEATURE_BITMASK = "app_events_feature_bitmask";
	private static final String APP_SETTING_APP_EVENTS_SESSION_TIMEOUT = "app_events_session_timeout";
	private static final String APP_SETTING_CUSTOM_TABS_ENABLED = "gdpv4_chrome_custom_tabs_enabled";
	private static final String APP_SETTING_DIALOG_CONFIGS = "android_dialog_configs";
	private static final String APP_SETTING_FIELDS[] = {
		"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "gdpv4_chrome_custom_tabs_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "auto_event_setup_enabled", 
		"seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url"
	};
	private static final String APP_SETTING_NUX_CONTENT = "gdpv4_nux_content";
	private static final String APP_SETTING_NUX_ENABLED = "gdpv4_nux_enabled";
	private static final String APP_SETTING_SMART_LOGIN_OPTIONS = "seamless_login";
	private static final String APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING = "supports_implicit_sdk_logging";
	private static final int AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 8;
	private static final int CODELESS_EVENTS_ENABLED_BITMASK_FIELD = 32;
	private static final int IAP_AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 16;
	private static final String SDK_UPDATE_MESSAGE = "sdk_update_message";
	private static final String SMART_LOGIN_BOOKMARK_ICON_URL = "smart_login_bookmark_icon_url";
	private static final String SMART_LOGIN_MENU_ICON_URL = "smart_login_menu_icon_url";
	private static final String TAG = "FetchedAppSettingsManager";
	private static final int TRACK_UNINSTALL_ENABLED_BITMASK_FIELD = 256;
	private static final Map fetchedAppSettings = new ConcurrentHashMap();
	private static final ConcurrentLinkedQueue fetchedAppSettingsCallbacks = new ConcurrentLinkedQueue();
	private static boolean isUnityInit = false;
	private static final AtomicReference loadingState;
	private static boolean printedSDKUpdatedMessage = false;
	private static JSONArray unityEventBindings = null;

	static 
	{
	//    0    0:bipush          13
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #64  <String "supports_implicit_sdk_logging">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #55  <String "gdpv4_nux_content">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #58  <String "gdpv4_nux_enabled">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #47  <String "gdpv4_chrome_custom_tabs_enabled">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #50  <String "android_dialog_configs">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #32  <String "android_sdk_error_categories">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #44  <String "app_events_session_timeout">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #41  <String "app_events_feature_bitmask">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #38  <String "auto_event_mapping_android">
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #35  <String "auto_event_setup_enabled">
	//   41   58:aastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #61  <String "seamless_login">
	//   45   64:aastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #77  <String "smart_login_bookmark_icon_url">
	//   49   70:aastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #80  <String "smart_login_menu_icon_url">
	//   53   76:aastore         
	//   54   77:putstatic       #106 <Field String[] APP_SETTING_FIELDS>
	//   55   80:new             #108 <Class ConcurrentHashMap>
	//   56   83:dup             
	//   57   84:invokespecial   #111 <Method void ConcurrentHashMap()>
	//   58   87:putstatic       #113 <Field Map fetchedAppSettings>
		loadingState = new AtomicReference(((Object) (FetchAppSettingState.NOT_LOADED)));
	//   59   90:new             #115 <Class AtomicReference>
	//   60   93:dup             
	//   61   94:getstatic       #119 <Field FetchedAppSettingsManager$FetchAppSettingState FetchedAppSettingsManager$FetchAppSettingState.NOT_LOADED>
	//   62   97:invokespecial   #122 <Method void AtomicReference(Object)>
	//   63  100:putstatic       #124 <Field AtomicReference loadingState>
	//   64  103:new             #126 <Class ConcurrentLinkedQueue>
	//   65  106:dup             
	//   66  107:invokespecial   #127 <Method void ConcurrentLinkedQueue()>
	//   67  110:putstatic       #129 <Field ConcurrentLinkedQueue fetchedAppSettingsCallbacks>
	//   68  113:iconst_0        
	//   69  114:putstatic       #131 <Field boolean printedSDKUpdatedMessage>
	//   70  117:iconst_0        
	//   71  118:putstatic       #133 <Field boolean isUnityInit>
	//   72  121:aconst_null     
	//   73  122:putstatic       #135 <Field JSONArray unityEventBindings>
	//*  74  125:return          
	}


/*
	static FetchedAppSettings access$000(String s, JSONObject jsonobject)
	{
		return parseAppSettingsFromJSON(s, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #142 <Method FetchedAppSettings parseAppSettingsFromJSON(String, JSONObject)>
	//    3    5:areturn         
	}

*/


/*
	static JSONObject access$100(String s)
	{
		return getAppSettingsQueryResponse(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #147 <Method JSONObject getAppSettingsQueryResponse(String)>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$200()
	{
		return printedSDKUpdatedMessage;
	//    0    0:getstatic       #131 <Field boolean printedSDKUpdatedMessage>
	//    1    3:ireturn         
	}

*/


/*
	static boolean access$202(boolean flag)
	{
		printedSDKUpdatedMessage = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #131 <Field boolean printedSDKUpdatedMessage>
		return flag;
	//    2    4:iload_0         
	//    3    5:ireturn         
	}

*/


/*
	static String access$300()
	{
		return TAG;
	//    0    0:getstatic       #155 <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static Map access$400()
	{
		return fetchedAppSettings;
	//    0    0:getstatic       #113 <Field Map fetchedAppSettings>
	//    1    3:areturn         
	}

*/


/*
	static AtomicReference access$500()
	{
		return loadingState;
	//    0    0:getstatic       #124 <Field AtomicReference loadingState>
	//    1    3:areturn         
	}

*/


/*
	static void access$600()
	{
		pollCallbacks();
	//    0    0:invokestatic    #163 <Method void pollCallbacks()>
		return;
	//    1    3:return          
	}

*/
}
