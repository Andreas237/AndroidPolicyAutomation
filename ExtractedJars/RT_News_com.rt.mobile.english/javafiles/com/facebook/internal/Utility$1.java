// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//			Utility

static final class Utility$1
	implements Runnable
{

	public void run()
	{
		JSONObject jsonobject;
		Object obj;
		SharedPreferences sharedpreferences;
		sharedpreferences = val$context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Context val$context>
	//    2    4:ldc1            #33  <String "com.facebook.internal.preferences.APP_SETTINGS">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #39  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5   10:astore_3        
		obj = ((Object) (val$settingsKey));
	//    6   11:aload_0         
	//    7   12:getfield        #22  <Field String val$settingsKey>
	//    8   15:astore_2        
		jsonobject = null;
	//    9   16:aconst_null     
	//   10   17:astore_1        
		obj = ((Object) (sharedpreferences.getString(((String) (obj)), ((String) (null)))));
	//   11   18:aload_3         
	//   12   19:aload_2         
	//   13   20:aconst_null     
	//   14   21:invokeinterface #45  <Method String SharedPreferences.getString(String, String)>
	//   15   26:astore_2        
		if(Utility.isNullOrEmpty(((String) (obj))))
			break MISSING_BLOCK_LABEL_68;
	//   16   27:aload_2         
	//   17   28:invokestatic    #49  <Method boolean Utility.isNullOrEmpty(String)>
	//   18   31:ifne            68
		obj = ((Object) (new JSONObject(((String) (obj)))));
	//   19   34:new             #51  <Class JSONObject>
	//   20   37:dup             
	//   21   38:aload_2         
	//   22   39:invokespecial   #54  <Method void JSONObject(String)>
	//   23   42:astore_2        
		jsonobject = ((JSONObject) (obj));
	//   24   43:aload_2         
	//   25   44:astore_1        
		break MISSING_BLOCK_LABEL_55;
	//   26   45:goto            55
		JSONException jsonexception;
		jsonexception;
	//   27   48:astore_2        
		Utility.logd("FacebookSDK", ((Exception) (jsonexception)));
	//   28   49:ldc1            #56  <String "FacebookSDK">
	//   29   51:aload_2         
	//   30   52:invokestatic    #60  <Method void Utility.logd(String, Exception)>
		if(jsonobject != null)
	//*  31   55:aload_1         
	//*  32   56:ifnull          68
			Utility.access$000(val$applicationId, jsonobject);
	//   33   59:aload_0         
	//   34   60:getfield        #24  <Field String val$applicationId>
	//   35   63:aload_1         
	//   36   64:invokestatic    #64  <Method Utility$FetchedAppSettings Utility.access$000(String, JSONObject)>
	//   37   67:pop             
		JSONObject jsonobject1 = Utility.access$100(val$applicationId);
	//   38   68:aload_0         
	//   39   69:getfield        #24  <Field String val$applicationId>
	//   40   72:invokestatic    #68  <Method JSONObject Utility.access$100(String)>
	//   41   75:astore_1        
		if(jsonobject1 != null)
	//*  42   76:aload_1         
	//*  43   77:ifnull          113
		{
			Utility.access$000(val$applicationId, jsonobject1);
	//   44   80:aload_0         
	//   45   81:getfield        #24  <Field String val$applicationId>
	//   46   84:aload_1         
	//   47   85:invokestatic    #64  <Method Utility$FetchedAppSettings Utility.access$000(String, JSONObject)>
	//   48   88:pop             
			sharedpreferences.edit().putString(val$settingsKey, jsonobject1.toString()).apply();
	//   49   89:aload_3         
	//   50   90:invokeinterface #72  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   51   95:aload_0         
	//   52   96:getfield        #22  <Field String val$settingsKey>
	//   53   99:aload_1         
	//   54  100:invokevirtual   #76  <Method String JSONObject.toString()>
	//   55  103:invokeinterface #82  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   56  108:invokeinterface #85  <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Utility.access$200().set(false);
	//   57  113:invokestatic    #89  <Method AtomicBoolean Utility.access$200()>
	//   58  116:iconst_0        
	//   59  117:invokevirtual   #95  <Method void AtomicBoolean.set(boolean)>
		return;
	//   60  120:return          
	}

	final String val$applicationId;
	final Context val$context;
	final String val$settingsKey;

	Utility$1(Context context1, String s, String s1)
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
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
