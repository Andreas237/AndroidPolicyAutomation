// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//			FetchedAppGateKeepersManager, Utility

static final class FetchedAppGateKeepersManager$1
	implements Runnable
{

	public void run()
	{
		JSONObject jsonobject;
		Object obj;
		SharedPreferences sharedpreferences;
		sharedpreferences = val$context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Context val$context>
	//    2    4:ldc1            #32  <String "com.facebook.internal.preferences.APP_GATEKEEPERS">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #38  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5   10:astore_3        
		obj = ((Object) (val$gateKeepersKey));
	//    6   11:aload_0         
	//    7   12:getfield        #22  <Field String val$gateKeepersKey>
	//    8   15:astore_2        
		jsonobject = null;
	//    9   16:aconst_null     
	//   10   17:astore_1        
		obj = ((Object) (sharedpreferences.getString(((String) (obj)), ((String) (null)))));
	//   11   18:aload_3         
	//   12   19:aload_2         
	//   13   20:aconst_null     
	//   14   21:invokeinterface #44  <Method String SharedPreferences.getString(String, String)>
	//   15   26:astore_2        
		if(Utility.isNullOrEmpty(((String) (obj))))
			break MISSING_BLOCK_LABEL_68;
	//   16   27:aload_2         
	//   17   28:invokestatic    #50  <Method boolean Utility.isNullOrEmpty(String)>
	//   18   31:ifne            68
		obj = ((Object) (new JSONObject(((String) (obj)))));
	//   19   34:new             #52  <Class JSONObject>
	//   20   37:dup             
	//   21   38:aload_2         
	//   22   39:invokespecial   #55  <Method void JSONObject(String)>
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
	//   28   49:ldc1            #57  <String "FacebookSDK">
	//   29   51:aload_2         
	//   30   52:invokestatic    #61  <Method void Utility.logd(String, Exception)>
		if(jsonobject != null)
	//*  31   55:aload_1         
	//*  32   56:ifnull          68
			FetchedAppGateKeepersManager.access$000(val$applicationId, jsonobject);
	//   33   59:aload_0         
	//   34   60:getfield        #24  <Field String val$applicationId>
	//   35   63:aload_1         
	//   36   64:invokestatic    #65  <Method JSONObject FetchedAppGateKeepersManager.access$000(String, JSONObject)>
	//   37   67:pop             
		JSONObject jsonobject1 = FetchedAppGateKeepersManager.access$100(val$applicationId);
	//   38   68:aload_0         
	//   39   69:getfield        #24  <Field String val$applicationId>
	//   40   72:invokestatic    #69  <Method JSONObject FetchedAppGateKeepersManager.access$100(String)>
	//   41   75:astore_1        
		if(jsonobject1 != null)
	//*  42   76:aload_1         
	//*  43   77:ifnull          123
		{
			FetchedAppGateKeepersManager.access$202(Long.valueOf(System.currentTimeMillis()));
	//   44   80:invokestatic    #75  <Method long System.currentTimeMillis()>
	//   45   83:invokestatic    #81  <Method Long Long.valueOf(long)>
	//   46   86:invokestatic    #85  <Method Long FetchedAppGateKeepersManager.access$202(Long)>
	//   47   89:pop             
			FetchedAppGateKeepersManager.access$000(val$applicationId, jsonobject1);
	//   48   90:aload_0         
	//   49   91:getfield        #24  <Field String val$applicationId>
	//   50   94:aload_1         
	//   51   95:invokestatic    #65  <Method JSONObject FetchedAppGateKeepersManager.access$000(String, JSONObject)>
	//   52   98:pop             
			sharedpreferences.edit().putString(val$gateKeepersKey, jsonobject1.toString()).apply();
	//   53   99:aload_3         
	//   54  100:invokeinterface #89  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   55  105:aload_0         
	//   56  106:getfield        #22  <Field String val$gateKeepersKey>
	//   57  109:aload_1         
	//   58  110:invokevirtual   #93  <Method String JSONObject.toString()>
	//   59  113:invokeinterface #99  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   60  118:invokeinterface #102 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		return;
	//   61  123:return          
	}

	final String val$applicationId;
	final Context val$context;
	final String val$gateKeepersKey;

	FetchedAppGateKeepersManager$1(Context context1, String s, String s1)
	{
		val$context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Context val$context>
		val$gateKeepersKey = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field String val$gateKeepersKey>
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
