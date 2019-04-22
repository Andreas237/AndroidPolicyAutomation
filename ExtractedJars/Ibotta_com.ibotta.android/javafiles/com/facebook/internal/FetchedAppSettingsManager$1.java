// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//			FetchedAppSettingsManager, Utility, FetchedAppSettings

static final class FetchedAppSettingsManager$1
	implements Runnable
{

	public void run()
	{
		Object obj3 = ((Object) (val$context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Context val$context>
	//    2    4:ldc1            #33  <String "com.facebook.internal.preferences.APP_SETTINGS">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #39  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5   10:astore          4
		Object obj = ((Object) (val$settingsKey));
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
				obj = ((Object) (FetchedAppSettingsManager.access$000(val$applicationId, ((JSONObject) (obj1)))));
	//   35   61:aload_0         
	//   36   62:getfield        #25  <Field String val$applicationId>
	//   37   65:aload_2         
	//   38   66:invokestatic    #67  <Method FetchedAppSettings FetchedAppSettingsManager.access$000(String, JSONObject)>
	//   39   69:astore_1        
		}
		obj1 = ((Object) (FetchedAppSettingsManager.access$100(val$applicationId)));
	//   40   70:aload_0         
	//   41   71:getfield        #25  <Field String val$applicationId>
	//   42   74:invokestatic    #70  <Method JSONObject FetchedAppSettingsManager.access$100(String)>
	//   43   77:astore_2        
		if(obj1 != null)
	//*  44   78:aload_2         
	//*  45   79:ifnull          142
		{
			FetchedAppSettingsManager.access$000(val$applicationId, ((JSONObject) (obj1)));
	//   46   82:aload_0         
	//   47   83:getfield        #25  <Field String val$applicationId>
	//   48   86:aload_2         
	//   49   87:invokestatic    #67  <Method FetchedAppSettings FetchedAppSettingsManager.access$000(String, JSONObject)>
	//   50   90:pop             
			android.content.SharedPreferences.Editor editor = ((SharedPreferences) (obj3)).edit();
	//   51   91:aload           4
	//   52   93:invokeinterface #74  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   53   98:astore_3        
			obj3 = ((Object) (val$settingsKey));
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
			if(!FetchedAppSettingsManager.access$200() && obj != null && ((String) (obj)).length() > 0)
	//*  78  151:invokestatic    #101 <Method boolean FetchedAppSettingsManager.access$200()>
	//*  79  154:ifne            181
	//*  80  157:aload_1         
	//*  81  158:ifnull          181
	//*  82  161:aload_1         
	//*  83  162:invokevirtual   #107 <Method int String.length()>
	//*  84  165:ifle            181
			{
				boolean _tmp = FetchedAppSettingsManager.access$202(true);
	//   85  168:iconst_1        
	//   86  169:invokestatic    #111 <Method boolean FetchedAppSettingsManager.access$202(boolean)>
	//   87  172:pop             
				Log.w(FetchedAppSettingsManager.access$300(), ((String) (obj)));
	//   88  173:invokestatic    #114 <Method String FetchedAppSettingsManager.access$300()>
	//   89  176:aload_1         
	//   90  177:invokestatic    #120 <Method int Log.w(String, String)>
	//   91  180:pop             
			}
		}
		AutomaticAnalyticsLogger.logActivateAppEvent();
	//   92  181:invokestatic    #125 <Method void AutomaticAnalyticsLogger.logActivateAppEvent()>
		FetchedAppSettingsManager.access$400(val$context);
	//   93  184:aload_0         
	//   94  185:getfield        #21  <Field Context val$context>
	//   95  188:invokestatic    #129 <Method void FetchedAppSettingsManager.access$400(Context)>
		FetchedAppSettingsManager.access$500().set(false);
	//   96  191:invokestatic    #133 <Method AtomicBoolean FetchedAppSettingsManager.access$500()>
	//   97  194:iconst_0        
	//   98  195:invokevirtual   #139 <Method void AtomicBoolean.set(boolean)>
	//   99  198:return          
	}

	final String val$applicationId;
	final Context val$context;
	final String val$settingsKey;

	FetchedAppSettingsManager$1(Context context1, String s, String s1)
	{
		val$context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Context val$context>
		val$settingsKey = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field String val$settingsKey>
		val$applicationId = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field String val$applicationId>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
