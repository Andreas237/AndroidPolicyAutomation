// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.*;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.*;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.Constants;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.*;

// Referenced classes of package com.facebook.internal:
//			FetchedAppSettings, Utility, FacebookRequestErrorClassification, SmartLoginOption, 
//			CallbackManagerImpl

public final class FetchedAppSettingsManager
{

	public FetchedAppSettingsManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
	//    2    4:return          
	}

	private static JSONObject getAppSettingsQueryResponse(String s)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #101 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #102 <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("fields", TextUtils.join(",", ((Iterable) (new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (APP_SETTING_FIELDS))))))))));
	//    4    8:aload_1         
	//    5    9:ldc1            #104 <String "fields">
	//    6   11:ldc1            #106 <String ",">
	//    7   13:new             #108 <Class ArrayList>
	//    8   16:dup             
	//    9   17:getstatic       #59  <Field String[] APP_SETTING_FIELDS>
	//   10   20:invokestatic    #114 <Method java.util.List Arrays.asList(Object[])>
	//   11   23:invokespecial   #117 <Method void ArrayList(java.util.Collection)>
	//   12   26:invokestatic    #123 <Method String TextUtils.join(CharSequence, Iterable)>
	//   13   29:invokevirtual   #127 <Method void Bundle.putString(String, String)>
		s = ((String) (GraphRequest.newGraphPathRequest(((com.facebook.AccessToken) (null)), s, ((com.facebook.GraphRequest.Callback) (null)))));
	//   14   32:aconst_null     
	//   15   33:aload_0         
	//   16   34:aconst_null     
	//   17   35:invokestatic    #133 <Method GraphRequest GraphRequest.newGraphPathRequest(com.facebook.AccessToken, String, com.facebook.GraphRequest$Callback)>
	//   18   38:astore_0        
		((GraphRequest) (s)).setSkipClientToken(true);
	//   19   39:aload_0         
	//   20   40:iconst_1        
	//   21   41:invokevirtual   #136 <Method void GraphRequest.setSkipClientToken(boolean)>
		((GraphRequest) (s)).setParameters(bundle);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #140 <Method void GraphRequest.setParameters(Bundle)>
		return ((GraphRequest) (s)).executeAndWait().getJSONObject();
	//   25   49:aload_0         
	//   26   50:invokevirtual   #144 <Method GraphResponse GraphRequest.executeAndWait()>
	//   27   53:invokevirtual   #150 <Method JSONObject GraphResponse.getJSONObject()>
	//   28   56:areturn         
	}

	public static FetchedAppSettings getAppSettingsWithoutQuery(String s)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          17
			return (FetchedAppSettings)fetchedAppSettings.get(((Object) (s)));
	//    2    4:getstatic       #66  <Field Map fetchedAppSettings>
	//    3    7:aload_0         
	//    4    8:invokeinterface #158 <Method Object Map.get(Object)>
	//    5   13:checkcast       #160 <Class FetchedAppSettings>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public static void loadAppSettingsAsync()
	{
		Context context = FacebookSdk.getApplicationContext();
	//    0    0:invokestatic    #167 <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:astore_1        
		String s = FacebookSdk.getApplicationId();
	//    2    4:invokestatic    #170 <Method String FacebookSdk.getApplicationId()>
	//    3    7:astore_2        
		boolean flag = loadingSettings.compareAndSet(false, true);
	//    4    8:getstatic       #73  <Field AtomicBoolean loadingSettings>
	//    5   11:iconst_0        
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #174 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//    8   16:istore_0        
		if(!Utility.isNullOrEmpty(s) && !fetchedAppSettings.containsKey(((Object) (s))))
	//*   9   17:aload_2         
	//*  10   18:invokestatic    #180 <Method boolean Utility.isNullOrEmpty(String)>
	//*  11   21:ifne            74
	//*  12   24:getstatic       #66  <Field Map fetchedAppSettings>
	//*  13   27:aload_2         
	//*  14   28:invokeinterface #184 <Method boolean Map.containsKey(Object)>
	//*  15   33:ifne            74
		{
			if(!flag)
	//*  16   36:iload_0         
	//*  17   37:ifne            41
			{
				return;
	//   18   40:return          
			} else
			{
				String s1 = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[] {
					s
				});
	//   19   41:ldc1            #186 <String "com.facebook.internal.APP_SETTINGS.%s">
	//   20   43:iconst_1        
	//   21   44:anewarray       Object[]
	//   22   47:dup             
	//   23   48:iconst_0        
	//   24   49:aload_2         
	//   25   50:aastore         
	//   26   51:invokestatic    #190 <Method String String.format(String, Object[])>
	//   27   54:astore_3        
				FacebookSdk.getExecutor().execute(new Runnable(context, s1, s) {

					public void run()
					{
						Object obj3 = ((Object) (context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0)));
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field Context val$context>
					//    2    4:ldc1            #33  <String "com.facebook.internal.preferences.APP_SETTINGS">
					//    3    6:iconst_0        
					//    4    7:invokevirtual   #39  <Method SharedPreferences Context.getSharedPreferences(String, int)>
					//    5   10:astore          4
						Object obj = ((Object) (settingsKey));
					//    6   12:aload_0         
					//    7   13:getfield        #23  <Field String val$settingsKey>
					//    8   16:astore_1        
						Object obj2 = null;
					//    9   17:aconst_null     
					//   10   18:astore_3        
						Object obj1 = ((Object) (((SharedPreferences) (obj3)).getString(((String) (obj)), ((String) (null)))));
					//   11   19:aload           4
					//   12   21:aload_1         
					//   13   22:aconst_null     
					//   14   23:invokeinterface #45  <Method String SharedPreferences.getString(String, String)>
					//   15   28:astore_2        
						obj = ((Object) (obj2));
					//   16   29:aload_3         
					//   17   30:astore_1        
						if(!Utility.isNullOrEmpty(((String) (obj1))))
					//*  18   31:aload_2         
					//*  19   32:invokestatic    #51  <Method boolean Utility.isNullOrEmpty(String)>
					//*  20   35:ifne            70
						{
							try
							{
								obj1 = ((Object) (JSONObjectInstrumentation.init(((String) (obj1)))));
					//   21   38:aload_2         
					//   22   39:invokestatic    #57  <Method JSONObject JSONObjectInstrumentation.init(String)>
					//   23   42:astore_2        
							}
					//*  24   43:goto            55
							// Misplaced declaration of an exception variable
							catch(Object obj)
					//*  25   46:astore_1        
							{
								Utility.logd("FacebookSDK", ((Exception) (obj)));
					//   26   47:ldc1            #59  <String "FacebookSDK">
					//   27   49:aload_1         
					//   28   50:invokestatic    #63  <Method void Utility.logd(String, Exception)>
								obj1 = null;
					//   29   53:aconst_null     
					//   30   54:astore_2        
							}
							obj = ((Object) (obj2));
					//   31   55:aload_3         
					//   32   56:astore_1        
							if(obj1 != null)
					//*  33   57:aload_2         
					//*  34   58:ifnull          70
								obj = ((Object) (FetchedAppSettingsManager.parseAppSettingsFromJSON(applicationId, ((JSONObject) (obj1)))));
					//   35   61:aload_0         
					//   36   62:getfield        #25  <Field String val$applicationId>
					//   37   65:aload_2         
					//   38   66:invokestatic    #67  <Method FetchedAppSettings FetchedAppSettingsManager.access$000(String, JSONObject)>
					//   39   69:astore_1        
						}
						obj1 = ((Object) (FetchedAppSettingsManager.getAppSettingsQueryResponse(applicationId)));
					//   40   70:aload_0         
					//   41   71:getfield        #25  <Field String val$applicationId>
					//   42   74:invokestatic    #70  <Method JSONObject FetchedAppSettingsManager.access$100(String)>
					//   43   77:astore_2        
						if(obj1 != null)
					//*  44   78:aload_2         
					//*  45   79:ifnull          142
						{
							FetchedAppSettingsManager.parseAppSettingsFromJSON(applicationId, ((JSONObject) (obj1)));
					//   46   82:aload_0         
					//   47   83:getfield        #25  <Field String val$applicationId>
					//   48   86:aload_2         
					//   49   87:invokestatic    #67  <Method FetchedAppSettings FetchedAppSettingsManager.access$000(String, JSONObject)>
					//   50   90:pop             
							android.content.SharedPreferences.Editor editor = ((SharedPreferences) (obj3)).edit();
					//   51   91:aload           4
					//   52   93:invokeinterface #74  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
					//   53   98:astore_3        
							obj3 = ((Object) (settingsKey));
					//   54   99:aload_0         
					//   55  100:getfield        #23  <Field String val$settingsKey>
					//   56  103:astore          4
							if(!(obj1 instanceof JSONObject))
					//*  57  105:aload_2         
					//*  58  106:instanceof      #76  <Class JSONObject>
					//*  59  109:ifne            120
								obj1 = ((Object) (((JSONObject) (obj1)).toString()));
					//   60  112:aload_2         
					//   61  113:invokevirtual   #80  <Method String JSONObject.toString()>
					//   62  116:astore_2        
							else
					//*  63  117:goto            128
								obj1 = ((Object) (JSONObjectInstrumentation.toString((JSONObject)obj1)));
					//   64  120:aload_2         
					//   65  121:checkcast       #76  <Class JSONObject>
					//   66  124:invokestatic    #83  <Method String JSONObjectInstrumentation.toString(JSONObject)>
					//   67  127:astore_2        
							editor.putString(((String) (obj3)), ((String) (obj1))).apply();
					//   68  128:aload_3         
					//   69  129:aload           4
					//   70  131:aload_2         
					//   71  132:invokeinterface #89  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
					//   72  137:invokeinterface #92  <Method void android.content.SharedPreferences$Editor.apply()>
						}
						if(obj != null)
					//*  73  142:aload_1         
					//*  74  143:ifnull          181
						{
							obj = ((Object) (((FetchedAppSettings) (obj)).getSdkUpdateMessage()));
					//   75  146:aload_1         
					//   76  147:invokevirtual   #97  <Method String FetchedAppSettings.getSdkUpdateMessage()>
					//   77  150:astore_1        
							if(!FetchedAppSettingsManager.printedSDKUpdatedMessage && obj != null && ((String) (obj)).length() > 0)
					//*  78  151:invokestatic    #101 <Method boolean FetchedAppSettingsManager.access$200()>
					//*  79  154:ifne            181
					//*  80  157:aload_1         
					//*  81  158:ifnull          181
					//*  82  161:aload_1         
					//*  83  162:invokevirtual   #107 <Method int String.length()>
					//*  84  165:ifle            181
							{
								FetchedAppSettingsManager.printedSDKUpdatedMessage = true;
					//   85  168:iconst_1        
					//   86  169:invokestatic    #111 <Method boolean FetchedAppSettingsManager.access$202(boolean)>
					//   87  172:pop             
								Log.w(FetchedAppSettingsManager.TAG, ((String) (obj)));
					//   88  173:invokestatic    #114 <Method String FetchedAppSettingsManager.access$300()>
					//   89  176:aload_1         
					//   90  177:invokestatic    #120 <Method int Log.w(String, String)>
					//   91  180:pop             
							}
						}
						AutomaticAnalyticsLogger.logActivateAppEvent();
					//   92  181:invokestatic    #125 <Method void AutomaticAnalyticsLogger.logActivateAppEvent()>
						FetchedAppSettingsManager.startInAppPurchaseAutoLogging(context);
					//   93  184:aload_0         
					//   94  185:getfield        #21  <Field Context val$context>
					//   95  188:invokestatic    #129 <Method void FetchedAppSettingsManager.access$400(Context)>
						FetchedAppSettingsManager.loadingSettings.set(false);
					//   96  191:invokestatic    #133 <Method AtomicBoolean FetchedAppSettingsManager.access$500()>
					//   97  194:iconst_0        
					//   98  195:invokevirtual   #139 <Method void AtomicBoolean.set(boolean)>
					//   99  198:return          
					}

					final String val$applicationId;
					final Context val$context;
					final String val$settingsKey;

			
			{
				context = context1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Context val$context>
				settingsKey = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String val$settingsKey>
				applicationId = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String val$applicationId>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
				}
);
	//   28   55:invokestatic    #194 <Method Executor FacebookSdk.getExecutor()>
	//   29   58:new             #6   <Class FetchedAppSettingsManager$1>
	//   30   61:dup             
	//   31   62:aload_1         
	//   32   63:aload_3         
	//   33   64:aload_2         
	//   34   65:invokespecial   #197 <Method void FetchedAppSettingsManager$1(Context, String, String)>
	//   35   68:invokeinterface #203 <Method void Executor.execute(Runnable)>
				return;
	//   36   73:return          
			}
		} else
		{
			return;
	//   37   74:return          
		}
	}

	private static FetchedAppSettings parseAppSettingsFromJSON(String s, JSONObject jsonobject)
	{
		Object obj = ((Object) (jsonobject.optJSONArray("android_sdk_error_categories")));
	//    0    0:aload_1         
	//    1    1:ldc1            #45  <String "android_sdk_error_categories">
	//    2    3:invokevirtual   #209 <Method JSONArray JSONObject.optJSONArray(String)>
	//    3    6:astore          6
		if(obj == null)
	//*   4    8:aload           6
	//*   5   10:ifnonnull       21
			obj = ((Object) (FacebookRequestErrorClassification.getDefaultErrorClassification()));
	//    6   13:invokestatic    #215 <Method FacebookRequestErrorClassification FacebookRequestErrorClassification.getDefaultErrorClassification()>
	//    7   16:astore          6
		else
	//*   8   18:goto            28
			obj = ((Object) (FacebookRequestErrorClassification.createFromJSON(((JSONArray) (obj)))));
	//    9   21:aload           6
	//   10   23:invokestatic    #219 <Method FacebookRequestErrorClassification FacebookRequestErrorClassification.createFromJSON(JSONArray)>
	//   11   26:astore          6
		int i = jsonobject.optInt("app_events_feature_bitmask", 0);
	//   12   28:aload_1         
	//   13   29:ldc1            #49  <String "app_events_feature_bitmask">
	//   14   31:iconst_0        
	//   15   32:invokevirtual   #223 <Method int JSONObject.optInt(String, int)>
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
		JSONArray jsonarray = jsonobject.optJSONArray("auto_event_mapping_android");
	//   44   82:aload_1         
	//   45   83:ldc1            #51  <String "auto_event_mapping_android">
	//   46   85:invokevirtual   #209 <Method JSONArray JSONObject.optJSONArray(String)>
	//   47   88:astore          7
		jsonobject = ((JSONObject) (new FetchedAppSettings(jsonobject.optBoolean("supports_implicit_sdk_logging", false), jsonobject.optString("gdpv4_nux_content", ""), jsonobject.optBoolean("gdpv4_nux_enabled", false), jsonobject.optBoolean("gdpv4_chrome_custom_tabs_enabled", false), jsonobject.optInt("app_events_session_timeout", Constants.getDefaultAppEventsSessionTimeoutInSeconds()), SmartLoginOption.parseOptions(jsonobject.optLong("seamless_login")), parseDialogConfigurations(jsonobject.optJSONObject("android_dialog_configs")), flag, ((FacebookRequestErrorClassification) (obj)), jsonobject.optString("smart_login_bookmark_icon_url"), jsonobject.optString("smart_login_menu_icon_url"), flag1, flag2, jsonarray, jsonobject.optString("sdk_update_message"))));
	//   48   90:new             #160 <Class FetchedAppSettings>
	//   49   93:dup             
	//   50   94:aload_1         
	//   51   95:ldc1            #35  <String "supports_implicit_sdk_logging">
	//   52   97:iconst_0        
	//   53   98:invokevirtual   #227 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   54  101:aload_1         
	//   55  102:ldc1            #37  <String "gdpv4_nux_content">
	//   56  104:ldc1            #229 <String "">
	//   57  106:invokevirtual   #233 <Method String JSONObject.optString(String, String)>
	//   58  109:aload_1         
	//   59  110:ldc1            #39  <String "gdpv4_nux_enabled">
	//   60  112:iconst_0        
	//   61  113:invokevirtual   #227 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   62  116:aload_1         
	//   63  117:ldc1            #41  <String "gdpv4_chrome_custom_tabs_enabled">
	//   64  119:iconst_0        
	//   65  120:invokevirtual   #227 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   66  123:aload_1         
	//   67  124:ldc1            #47  <String "app_events_session_timeout">
	//   68  126:invokestatic    #239 <Method int Constants.getDefaultAppEventsSessionTimeoutInSeconds()>
	//   69  129:invokevirtual   #223 <Method int JSONObject.optInt(String, int)>
	//   70  132:aload_1         
	//   71  133:ldc1            #53  <String "seamless_login">
	//   72  135:invokevirtual   #243 <Method long JSONObject.optLong(String)>
	//   73  138:invokestatic    #249 <Method java.util.EnumSet SmartLoginOption.parseOptions(long)>
	//   74  141:aload_1         
	//   75  142:ldc1            #43  <String "android_dialog_configs">
	//   76  144:invokevirtual   #252 <Method JSONObject JSONObject.optJSONObject(String)>
	//   77  147:invokestatic    #256 <Method Map parseDialogConfigurations(JSONObject)>
	//   78  150:iload_3         
	//   79  151:aload           6
	//   80  153:aload_1         
	//   81  154:ldc1            #55  <String "smart_login_bookmark_icon_url">
	//   82  156:invokevirtual   #259 <Method String JSONObject.optString(String)>
	//   83  159:aload_1         
	//   84  160:ldc1            #57  <String "smart_login_menu_icon_url">
	//   85  162:invokevirtual   #259 <Method String JSONObject.optString(String)>
	//   86  165:iload           4
	//   87  167:iload           5
	//   88  169:aload           7
	//   89  171:aload_1         
	//   90  172:ldc2            #261 <String "sdk_update_message">
	//   91  175:invokevirtual   #259 <Method String JSONObject.optString(String)>
	//   92  178:invokespecial   #264 <Method void FetchedAppSettings(boolean, String, boolean, boolean, int, java.util.EnumSet, Map, boolean, FacebookRequestErrorClassification, String, String, boolean, boolean, JSONArray, String)>
	//   93  181:astore_1        
		fetchedAppSettings.put(((Object) (s)), ((Object) (jsonobject)));
	//   94  182:getstatic       #66  <Field Map fetchedAppSettings>
	//   95  185:aload_0         
	//   96  186:aload_1         
	//   97  187:invokeinterface #268 <Method Object Map.put(Object, Object)>
	//   98  192:pop             
		return ((FetchedAppSettings) (jsonobject));
	//   99  193:aload_1         
	//  100  194:areturn         
	}

	private static Map parseDialogConfigurations(JSONObject jsonobject)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #270 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #271 <Method void HashMap()>
	//    3    7:astore_3        
		if(jsonobject != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          116
		{
			JSONArray jsonarray = jsonobject.optJSONArray("data");
	//    6   12:aload_0         
	//    7   13:ldc2            #273 <String "data">
	//    8   16:invokevirtual   #209 <Method JSONArray JSONObject.optJSONArray(String)>
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
	//*  16   31:invokevirtual   #278 <Method int JSONArray.length()>
	//*  17   34:icmpge          116
				{
					FetchedAppSettings.DialogFeatureConfig dialogfeatureconfig = FetchedAppSettings.DialogFeatureConfig.parseDialogConfig(jsonarray.optJSONObject(i));
	//   18   37:aload           4
	//   19   39:iload_1         
	//   20   40:invokevirtual   #281 <Method JSONObject JSONArray.optJSONObject(int)>
	//   21   43:invokestatic    #287 <Method FetchedAppSettings$DialogFeatureConfig FetchedAppSettings$DialogFeatureConfig.parseDialogConfig(JSONObject)>
	//   22   46:astore          5
					if(dialogfeatureconfig == null)
	//*  23   48:aload           5
	//*  24   50:ifnonnull       56
						continue;
	//   25   53:goto            109
					String s = dialogfeatureconfig.getDialogName();
	//   26   56:aload           5
	//   27   58:invokevirtual   #290 <Method String FetchedAppSettings$DialogFeatureConfig.getDialogName()>
	//   28   61:astore          6
					Map map = (Map)hashmap.get(((Object) (s)));
	//   29   63:aload_3         
	//   30   64:aload           6
	//   31   66:invokevirtual   #291 <Method Object HashMap.get(Object)>
	//   32   69:checkcast       #154 <Class Map>
	//   33   72:astore_2        
					jsonobject = ((JSONObject) (map));
	//   34   73:aload_2         
	//   35   74:astore_0        
					if(map == null)
	//*  36   75:aload_2         
	//*  37   76:ifnonnull       95
					{
						jsonobject = ((JSONObject) (new HashMap()));
	//   38   79:new             #270 <Class HashMap>
	//   39   82:dup             
	//   40   83:invokespecial   #271 <Method void HashMap()>
	//   41   86:astore_0        
						hashmap.put(((Object) (s)), ((Object) (jsonobject)));
	//   42   87:aload_3         
	//   43   88:aload           6
	//   44   90:aload_0         
	//   45   91:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//   46   94:pop             
					}
					((Map) (jsonobject)).put(((Object) (dialogfeatureconfig.getFeatureName())), ((Object) (dialogfeatureconfig)));
	//   47   95:aload_0         
	//   48   96:aload           5
	//   49   98:invokevirtual   #295 <Method String FetchedAppSettings$DialogFeatureConfig.getFeatureName()>
	//   50  101:aload           5
	//   51  103:invokeinterface #268 <Method Object Map.put(Object, Object)>
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

	public static FetchedAppSettings queryAppSettings(String s, boolean flag)
	{
		if(!flag && fetchedAppSettings.containsKey(((Object) (s))))
	//*   0    0:iload_1         
	//*   1    1:ifne            29
	//*   2    4:getstatic       #66  <Field Map fetchedAppSettings>
	//*   3    7:aload_0         
	//*   4    8:invokeinterface #184 <Method boolean Map.containsKey(Object)>
	//*   5   13:ifeq            29
			return (FetchedAppSettings)fetchedAppSettings.get(((Object) (s)));
	//    6   16:getstatic       #66  <Field Map fetchedAppSettings>
	//    7   19:aload_0         
	//    8   20:invokeinterface #158 <Method Object Map.get(Object)>
	//    9   25:checkcast       #160 <Class FetchedAppSettings>
	//   10   28:areturn         
		JSONObject jsonobject = getAppSettingsQueryResponse(s);
	//   11   29:aload_0         
	//   12   30:invokestatic    #87  <Method JSONObject getAppSettingsQueryResponse(String)>
	//   13   33:astore_2        
		if(jsonobject == null)
	//*  14   34:aload_2         
	//*  15   35:ifnonnull       40
			return null;
	//   16   38:aconst_null     
	//   17   39:areturn         
		else
			return parseAppSettingsFromJSON(s, jsonobject);
	//   18   40:aload_0         
	//   19   41:aload_2         
	//   20   42:invokestatic    #82  <Method FetchedAppSettings parseAppSettingsFromJSON(String, JSONObject)>
	//   21   45:areturn         
	}

	private static void startInAppPurchaseAutoLogging(Context context)
	{
		CallbackManagerImpl.registerStaticCallback(CallbackManagerImpl.RequestCodeOffset.InAppPurchase.toRequestCode(), new CallbackManagerImpl.Callback(context) {

			public boolean onActivityResult(final int finalResultCode, Intent intent)
			{
				FacebookSdk.getExecutor().execute(((_cls1) (intent)). new Runnable() {

					public void run()
					{
						AutomaticAnalyticsLogger.logInAppPurchaseEvent(context, finalResultCode, finalData);
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field FetchedAppSettingsManager$2 this$0>
					//    2    4:getfield        #34  <Field Context FetchedAppSettingsManager$2.val$context>
					//    3    7:aload_0         
					//    4    8:getfield        #23  <Field int val$finalResultCode>
					//    5   11:aload_0         
					//    6   12:getfield        #25  <Field Intent val$finalData>
					//    7   15:invokestatic    #40  <Method boolean AutomaticAnalyticsLogger.logInAppPurchaseEvent(Context, int, Intent)>
					//    8   18:pop             
					//    9   19:return          
					}

					final _cls2 this$0;
					final Intent val$finalData;
					final int val$finalResultCode;

			
			{
				this$0 = final__pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field FetchedAppSettingsManager$2 this$0>
				finalResultCode = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field int val$finalResultCode>
				finalData = Intent.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Intent val$finalData>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
				}
);
			//    0    0:invokestatic    #30  <Method Executor FacebookSdk.getExecutor()>
			//    1    3:new             #13  <Class FetchedAppSettingsManager$2$1>
			//    2    6:dup             
			//    3    7:aload_0         
			//    4    8:iload_1         
			//    5    9:aload_2         
			//    6   10:invokespecial   #33  <Method void FetchedAppSettingsManager$2$1(FetchedAppSettingsManager$2, int, Intent)>
			//    7   13:invokeinterface #39  <Method void Executor.execute(Runnable)>
				return true;
			//    8   18:iconst_1        
			//    9   19:ireturn         
			}

			final Context val$context;

			
			{
				context = context1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Context val$context>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:getstatic       #305 <Field CallbackManagerImpl$RequestCodeOffset CallbackManagerImpl$RequestCodeOffset.InAppPurchase>
	//    1    3:invokevirtual   #308 <Method int CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:new             #8   <Class FetchedAppSettingsManager$2>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #310 <Method void FetchedAppSettingsManager$2(Context)>
	//    6   14:invokestatic    #316 <Method void CallbackManagerImpl.registerStaticCallback(int, CallbackManagerImpl$Callback)>
	//    7   17:return          
	}

	private static final String APP_SETTING_FIELDS[] = {
		"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "gdpv4_chrome_custom_tabs_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", 
		"smart_login_bookmark_icon_url", "smart_login_menu_icon_url"
	};
	private static final String TAG = ((Class) (com/facebook/internal/FetchedAppSettingsManager)).getCanonicalName();
	private static Map fetchedAppSettings = new ConcurrentHashMap();
	private static AtomicBoolean loadingSettings = new AtomicBoolean(false);
	private static boolean printedSDKUpdatedMessage = false;

	static 
	{
	//    0    0:ldc1            #2   <Class FetchedAppSettingsManager>
	//    1    2:invokevirtual   #29  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #31  <Field String TAG>
	//    3    8:bipush          12
	//    4   10:anewarray       String[]
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:ldc1            #35  <String "supports_implicit_sdk_logging">
	//    8   17:aastore         
	//    9   18:dup             
	//   10   19:iconst_1        
	//   11   20:ldc1            #37  <String "gdpv4_nux_content">
	//   12   22:aastore         
	//   13   23:dup             
	//   14   24:iconst_2        
	//   15   25:ldc1            #39  <String "gdpv4_nux_enabled">
	//   16   27:aastore         
	//   17   28:dup             
	//   18   29:iconst_3        
	//   19   30:ldc1            #41  <String "gdpv4_chrome_custom_tabs_enabled">
	//   20   32:aastore         
	//   21   33:dup             
	//   22   34:iconst_4        
	//   23   35:ldc1            #43  <String "android_dialog_configs">
	//   24   37:aastore         
	//   25   38:dup             
	//   26   39:iconst_5        
	//   27   40:ldc1            #45  <String "android_sdk_error_categories">
	//   28   42:aastore         
	//   29   43:dup             
	//   30   44:bipush          6
	//   31   46:ldc1            #47  <String "app_events_session_timeout">
	//   32   48:aastore         
	//   33   49:dup             
	//   34   50:bipush          7
	//   35   52:ldc1            #49  <String "app_events_feature_bitmask">
	//   36   54:aastore         
	//   37   55:dup             
	//   38   56:bipush          8
	//   39   58:ldc1            #51  <String "auto_event_mapping_android">
	//   40   60:aastore         
	//   41   61:dup             
	//   42   62:bipush          9
	//   43   64:ldc1            #53  <String "seamless_login">
	//   44   66:aastore         
	//   45   67:dup             
	//   46   68:bipush          10
	//   47   70:ldc1            #55  <String "smart_login_bookmark_icon_url">
	//   48   72:aastore         
	//   49   73:dup             
	//   50   74:bipush          11
	//   51   76:ldc1            #57  <String "smart_login_menu_icon_url">
	//   52   78:aastore         
	//   53   79:putstatic       #59  <Field String[] APP_SETTING_FIELDS>
	//   54   82:new             #61  <Class ConcurrentHashMap>
	//   55   85:dup             
	//   56   86:invokespecial   #64  <Method void ConcurrentHashMap()>
	//   57   89:putstatic       #66  <Field Map fetchedAppSettings>
	//   58   92:new             #68  <Class AtomicBoolean>
	//   59   95:dup             
	//   60   96:iconst_0        
	//   61   97:invokespecial   #71  <Method void AtomicBoolean(boolean)>
	//   62  100:putstatic       #73  <Field AtomicBoolean loadingSettings>
	//   63  103:iconst_0        
	//   64  104:putstatic       #75  <Field boolean printedSDKUpdatedMessage>
	//*  65  107:return          
	}


/*
	static FetchedAppSettings access$000(String s, JSONObject jsonobject)
	{
		return parseAppSettingsFromJSON(s, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #82  <Method FetchedAppSettings parseAppSettingsFromJSON(String, JSONObject)>
	//    3    5:areturn         
	}

*/


/*
	static JSONObject access$100(String s)
	{
		return getAppSettingsQueryResponse(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #87  <Method JSONObject getAppSettingsQueryResponse(String)>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$200()
	{
		return printedSDKUpdatedMessage;
	//    0    0:getstatic       #75  <Field boolean printedSDKUpdatedMessage>
	//    1    3:ireturn         
	}

*/


/*
	static boolean access$202(boolean flag)
	{
		printedSDKUpdatedMessage = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #75  <Field boolean printedSDKUpdatedMessage>
		return flag;
	//    2    4:iload_0         
	//    3    5:ireturn         
	}

*/


/*
	static String access$300()
	{
		return TAG;
	//    0    0:getstatic       #31  <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static void access$400(Context context)
	{
		startInAppPurchaseAutoLogging(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #97  <Method void startInAppPurchaseAutoLogging(Context)>
		return;
	//    2    4:return          
	}

*/


/*
	static AtomicBoolean access$500()
	{
		return loadingSettings;
	//    0    0:getstatic       #73  <Field AtomicBoolean loadingSettings>
	//    1    3:areturn         
	}

*/
}
