// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.appevents:
//			FacebookUninstallTracker

static final class FacebookUninstallTracker$1
	implements Runnable
{

	public void run()
	{
		Object obj;
		obj = ((Object) (FacebookUninstallTracker.access$000(FacebookSdk.getApplicationId(), val$deviceToken)));
	//    0    0:invokestatic    #29  <Method String FacebookSdk.getApplicationId()>
	//    1    3:aload_0         
	//    2    4:getfield        #16  <Field String val$deviceToken>
	//    3    7:invokestatic    #33  <Method GraphRequest FacebookUninstallTracker.access$000(String, String)>
	//    4   10:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_134;
	//    5   11:aload_1         
	//    6   12:ifnull          134
		obj = ((Object) (((GraphRequest) (obj)).executeAndWait()));
	//    7   15:aload_1         
	//    8   16:invokevirtual   #39  <Method GraphResponse GraphRequest.executeAndWait()>
	//    9   19:astore_1        
		JSONObject jsonobject = ((GraphResponse) (obj)).getJSONObject();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #45  <Method JSONObject GraphResponse.getJSONObject()>
	//   12   24:astore_2        
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_134;
	//   13   25:aload_2         
	//   14   26:ifnull          134
		if(jsonobject.has("success") && jsonobject.getString("success").equals("true"))
	//*  15   29:aload_2         
	//*  16   30:ldc1            #47  <String "success">
	//*  17   32:invokevirtual   #53  <Method boolean JSONObject.has(String)>
	//*  18   35:ifeq            85
	//*  19   38:aload_2         
	//*  20   39:ldc1            #47  <String "success">
	//*  21   41:invokevirtual   #57  <Method String JSONObject.getString(String)>
	//*  22   44:ldc1            #59  <String "true">
	//*  23   46:invokevirtual   #65  <Method boolean String.equals(Object)>
	//*  24   49:ifeq            85
		{
			FacebookUninstallTracker.access$100().edit().putString("uploaded_token", val$deviceToken).putBoolean("pre_track_uninstall_enabled", true).apply();
	//   25   52:invokestatic    #69  <Method SharedPreferences FacebookUninstallTracker.access$100()>
	//   26   55:invokeinterface #75  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   27   60:ldc1            #77  <String "uploaded_token">
	//   28   62:aload_0         
	//   29   63:getfield        #16  <Field String val$deviceToken>
	//   30   66:invokeinterface #83  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   31   71:ldc1            #85  <String "pre_track_uninstall_enabled">
	//   32   73:iconst_1        
	//   33   74:invokeinterface #89  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   34   79:invokeinterface #92  <Method void android.content.SharedPreferences$Editor.apply()>
			return;
	//   35   84:return          
		}
		try
		{
			String s = FacebookUninstallTracker.access$200();
	//   36   85:invokestatic    #95  <Method String FacebookUninstallTracker.access$200()>
	//   37   88:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   38   89:new             #97  <Class StringBuilder>
	//   39   92:dup             
	//   40   93:invokespecial   #98  <Method void StringBuilder()>
	//   41   96:astore_3        
			stringbuilder.append("Error sending device token to Facebook: ");
	//   42   97:aload_3         
	//   43   98:ldc1            #100 <String "Error sending device token to Facebook: ">
	//   44  100:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   45  103:pop             
			stringbuilder.append(((Object) (((GraphResponse) (obj)).getError())));
	//   46  104:aload_3         
	//   47  105:aload_1         
	//   48  106:invokevirtual   #108 <Method com.facebook.FacebookRequestError GraphResponse.getError()>
	//   49  109:invokevirtual   #111 <Method StringBuilder StringBuilder.append(Object)>
	//   50  112:pop             
			Log.e(s, stringbuilder.toString());
	//   51  113:aload_2         
	//   52  114:aload_3         
	//   53  115:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   54  118:invokestatic    #120 <Method int Log.e(String, String)>
	//   55  121:pop             
			return;
	//   56  122:return          
		}
		catch(JSONException jsonexception)
	//*  57  123:astore_1        
		{
			Log.e(FacebookUninstallTracker.access$200(), "Error decoding server response.", ((Throwable) (jsonexception)));
	//   58  124:invokestatic    #95  <Method String FacebookUninstallTracker.access$200()>
	//   59  127:ldc1            #122 <String "Error decoding server response.">
	//   60  129:aload_1         
	//   61  130:invokestatic    #125 <Method int Log.e(String, String, Throwable)>
	//   62  133:pop             
		}
	//   63  134:return          
	}

	final String val$deviceToken;

	FacebookUninstallTracker$1(String s)
	{
		val$deviceToken = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field String val$deviceToken>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
