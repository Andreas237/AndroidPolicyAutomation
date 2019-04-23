// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.InAppPurchaseActivityLifecycleTracker;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//			FetchedAppSettingsManager, Utility, FetchedAppSettings, FetchedAppGateKeepersManager

static final class FetchedAppSettingsManager$1
	implements Runnable
{

	public void run()
	{
		SharedPreferences sharedpreferences = val$context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Context val$context>
	//    2    4:ldc1            #32  <String "com.facebook.internal.preferences.APP_SETTINGS">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #38  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5   10:astore          4
		Object obj = ((Object) (val$settingsKey));
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
				obj = ((Object) (FetchedAppSettingsManager.access$000(val$applicationId, ((JSONObject) (obj1)))));
	//   37   65:aload_0         
	//   38   66:getfield        #24  <Field String val$applicationId>
	//   39   69:aload_2         
	//   40   70:invokestatic    #65  <Method FetchedAppSettings FetchedAppSettingsManager.access$000(String, JSONObject)>
	//   41   73:astore_1        
		}
		obj1 = ((Object) (FetchedAppSettingsManager.access$100(val$applicationId)));
	//   42   74:aload_0         
	//   43   75:getfield        #24  <Field String val$applicationId>
	//   44   78:invokestatic    #69  <Method JSONObject FetchedAppSettingsManager.access$100(String)>
	//   45   81:astore_2        
		if(obj1 != null)
	//*  46   82:aload_2         
	//*  47   83:ifnull          120
		{
			FetchedAppSettingsManager.access$000(val$applicationId, ((JSONObject) (obj1)));
	//   48   86:aload_0         
	//   49   87:getfield        #24  <Field String val$applicationId>
	//   50   90:aload_2         
	//   51   91:invokestatic    #65  <Method FetchedAppSettings FetchedAppSettingsManager.access$000(String, JSONObject)>
	//   52   94:pop             
			sharedpreferences.edit().putString(val$settingsKey, ((JSONObject) (obj1)).toString()).apply();
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
			if(!FetchedAppSettingsManager.access$200() && obj != null && ((String) (obj)).length() > 0)
	//*  66  129:invokestatic    #95  <Method boolean FetchedAppSettingsManager.access$200()>
	//*  67  132:ifne            159
	//*  68  135:aload_1         
	//*  69  136:ifnull          159
	//*  70  139:aload_1         
	//*  71  140:invokevirtual   #101 <Method int String.length()>
	//*  72  143:ifle            159
			{
				boolean _tmp = FetchedAppSettingsManager.access$202(true);
	//   73  146:iconst_1        
	//   74  147:invokestatic    #105 <Method boolean FetchedAppSettingsManager.access$202(boolean)>
	//   75  150:pop             
				Log.w(FetchedAppSettingsManager.access$300(), ((String) (obj)));
	//   76  151:invokestatic    #108 <Method String FetchedAppSettingsManager.access$300()>
	//   77  154:aload_1         
	//   78  155:invokestatic    #114 <Method int Log.w(String, String)>
	//   79  158:pop             
			}
		}
		FetchedAppGateKeepersManager.queryAppGateKeepers(val$applicationId, true);
	//   80  159:aload_0         
	//   81  160:getfield        #24  <Field String val$applicationId>
	//   82  163:iconst_1        
	//   83  164:invokestatic    #120 <Method JSONObject FetchedAppGateKeepersManager.queryAppGateKeepers(String, boolean)>
	//   84  167:pop             
		AutomaticAnalyticsLogger.logActivateAppEvent();
	//   85  168:invokestatic    #125 <Method void AutomaticAnalyticsLogger.logActivateAppEvent()>
		InAppPurchaseActivityLifecycleTracker.update();
	//   86  171:invokestatic    #130 <Method void InAppPurchaseActivityLifecycleTracker.update()>
		obj1 = ((Object) (FetchedAppSettingsManager.access$500()));
	//   87  174:invokestatic    #134 <Method AtomicReference FetchedAppSettingsManager.access$500()>
	//   88  177:astore_2        
		if(FetchedAppSettingsManager.access$400().containsKey(((Object) (val$applicationId))))
	//*  89  178:invokestatic    #138 <Method Map FetchedAppSettingsManager.access$400()>
	//*  90  181:aload_0         
	//*  91  182:getfield        #24  <Field String val$applicationId>
	//*  92  185:invokeinterface #144 <Method boolean Map.containsKey(Object)>
	//*  93  190:ifeq            200
			obj = ((Object) (tchAppSettingState.SUCCESS));
	//   94  193:getstatic       #150 <Field FetchedAppSettingsManager$FetchAppSettingState FetchedAppSettingsManager$FetchAppSettingState.SUCCESS>
	//   95  196:astore_1        
		else
	//*  96  197:goto            204
			obj = ((Object) (tchAppSettingState.ERROR));
	//   97  200:getstatic       #153 <Field FetchedAppSettingsManager$FetchAppSettingState FetchedAppSettingsManager$FetchAppSettingState.ERROR>
	//   98  203:astore_1        
		((AtomicReference) (obj1)).set(obj);
	//   99  204:aload_2         
	//  100  205:aload_1         
	//  101  206:invokevirtual   #159 <Method void AtomicReference.set(Object)>
		FetchedAppSettingsManager.access$600();
	//  102  209:invokestatic    #162 <Method void FetchedAppSettingsManager.access$600()>
	//  103  212:return          
	}

	final String val$applicationId;
	final Context val$context;
	final String val$settingsKey;

	FetchedAppSettingsManager$1(Context context1, String s, String s1)
	{
		val$context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Context val$context>
		val$settingsKey = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field String val$settingsKey>
		val$applicationId = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field String val$applicationId>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void Object()>
	//   11   19:return          
	}
}
