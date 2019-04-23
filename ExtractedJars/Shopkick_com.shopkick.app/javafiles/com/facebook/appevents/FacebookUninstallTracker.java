// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.facebook.*;
import com.facebook.internal.*;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public class FacebookUninstallTracker
{

	public FacebookUninstallTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
	//    2    4:return          
	}

	private static GraphRequest buildPushDeviceTokenRequest(String s, String s1)
	{
		GraphRequest graphrequest = GraphRequest.newPostRequest(((com.facebook.AccessToken) (null)), String.format(Locale.US, "%s/app_push_device_token", new Object[] {
			s
		}), ((JSONObject) (null)), ((com.facebook.GraphRequest.Callback) (null)));
	//    0    0:aconst_null     
	//    1    1:getstatic       #62  <Field Locale Locale.US>
	//    2    4:ldc1            #64  <String "%s/app_push_device_token">
	//    3    6:iconst_1        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:aload_0         
	//    8   13:aastore         
	//    9   14:invokestatic    #70  <Method String String.format(Locale, String, Object[])>
	//   10   17:aconst_null     
	//   11   18:aconst_null     
	//   12   19:invokestatic    #76  <Method GraphRequest GraphRequest.newPostRequest(com.facebook.AccessToken, String, JSONObject, com.facebook.GraphRequest$Callback)>
	//   13   22:astore_3        
		graphrequest.setSkipClientToken(true);
	//   14   23:aload_3         
	//   15   24:iconst_1        
	//   16   25:invokevirtual   #80  <Method void GraphRequest.setSkipClientToken(boolean)>
		s = ((String) (AttributionIdentifiers.getAttributionIdentifiers(FacebookSdk.getApplicationContext())));
	//   17   28:invokestatic    #35  <Method Context FacebookSdk.getApplicationContext()>
	//   18   31:invokestatic    #86  <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(Context)>
	//   19   34:astore_0        
		if(s == null)
	//*  20   35:aload_0         
	//*  21   36:ifnonnull       41
			return null;
	//   22   39:aconst_null     
	//   23   40:areturn         
		String s2 = ((AttributionIdentifiers) (s)).getAndroidAdvertiserId();
	//   24   41:aload_0         
	//   25   42:invokevirtual   #89  <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//   26   45:astore          4
		Bundle bundle = graphrequest.getParameters();
	//   27   47:aload_3         
	//   28   48:invokevirtual   #93  <Method Bundle GraphRequest.getParameters()>
	//   29   51:astore_2        
		s = ((String) (bundle));
	//   30   52:aload_2         
	//   31   53:astore_0        
		if(bundle == null)
	//*  32   54:aload_2         
	//*  33   55:ifnonnull       66
			s = ((String) (new Bundle()));
	//   34   58:new             #95  <Class Bundle>
	//   35   61:dup             
	//   36   62:invokespecial   #96  <Method void Bundle()>
	//   37   65:astore_0        
		((Bundle) (s)).putString("device_id", s2);
	//   38   66:aload_0         
	//   39   67:ldc1            #98  <String "device_id">
	//   40   69:aload           4
	//   41   71:invokevirtual   #102 <Method void Bundle.putString(String, String)>
		((Bundle) (s)).putString("device_token", s1);
	//   42   74:aload_0         
	//   43   75:ldc1            #104 <String "device_token">
	//   44   77:aload_1         
	//   45   78:invokevirtual   #102 <Method void Bundle.putString(String, String)>
		((Bundle) (s)).putString("platform", "android");
	//   46   81:aload_0         
	//   47   82:ldc1            #106 <String "platform">
	//   48   84:ldc1            #10  <String "android">
	//   49   86:invokevirtual   #102 <Method void Bundle.putString(String, String)>
		graphrequest.setParameters(((Bundle) (s)));
	//   50   89:aload_3         
	//   51   90:aload_0         
	//   52   91:invokevirtual   #110 <Method void GraphRequest.setParameters(Bundle)>
		return graphrequest;
	//   53   94:aload_3         
	//   54   95:areturn         
	}

	private static void sendToServer(String s)
	{
		FacebookSdk.getExecutor().execute(new Runnable(s) {

			public void run()
			{
				Object obj;
				obj = ((Object) (FacebookUninstallTracker.buildPushDeviceTokenRequest(FacebookSdk.getApplicationId(), deviceToken)));
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
					FacebookUninstallTracker.uploadedTokenSharedPrefs.edit().putString("uploaded_token", deviceToken).putBoolean("pre_track_uninstall_enabled", true).apply();
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
					String s1 = FacebookUninstallTracker.TAG;
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
					Log.e(s1, stringbuilder.toString());
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
					Log.e(FacebookUninstallTracker.TAG, "Error decoding server response.", ((Throwable) (jsonexception)));
			//   58  124:invokestatic    #95  <Method String FacebookUninstallTracker.access$200()>
			//   59  127:ldc1            #122 <String "Error decoding server response.">
			//   60  129:aload_1         
			//   61  130:invokestatic    #125 <Method int Log.e(String, String, Throwable)>
			//   62  133:pop             
				}
			//   63  134:return          
			}

			final String val$deviceToken;

			
			{
				deviceToken = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field String val$deviceToken>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:invokestatic    #117 <Method Executor FacebookSdk.getExecutor()>
	//    1    3:new             #6   <Class FacebookUninstallTracker$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokespecial   #119 <Method void FacebookUninstallTracker$1(String)>
	//    5   11:invokeinterface #125 <Method void Executor.execute(Runnable)>
	//    6   16:return          
	}

	public static void updateDeviceToken(String s)
	{
		Object obj = ((Object) (FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId())));
	//    0    0:invokestatic    #129 <Method String FacebookSdk.getApplicationId()>
	//    1    3:invokestatic    #135 <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
	//    2    6:astore_3        
		if(obj == null)
	//*   3    7:aload_3         
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		boolean flag = ((FetchedAppSettings) (obj)).getTrackUninstallEnabled();
	//    6   12:aload_3         
	//    7   13:invokevirtual   #141 <Method boolean FetchedAppSettings.getTrackUninstallEnabled()>
	//    8   16:istore_1        
		obj = ((Object) (uploadedTokenSharedPrefs.getString("uploaded_token", ((String) (null)))));
	//    9   17:getstatic       #43  <Field SharedPreferences uploadedTokenSharedPrefs>
	//   10   20:ldc1            #143 <String "uploaded_token">
	//   11   22:aconst_null     
	//   12   23:invokeinterface #149 <Method String SharedPreferences.getString(String, String)>
	//   13   28:astore_3        
		boolean flag1 = uploadedTokenSharedPrefs.getBoolean("pre_track_uninstall_enabled", false);
	//   14   29:getstatic       #43  <Field SharedPreferences uploadedTokenSharedPrefs>
	//   15   32:ldc1            #151 <String "pre_track_uninstall_enabled">
	//   16   34:iconst_0        
	//   17   35:invokeinterface #155 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   18   40:istore_2        
		if(flag && (!flag1 || !s.equals(obj)))
	//*  19   41:iload_1         
	//*  20   42:ifeq            62
	//*  21   45:iload_2         
	//*  22   46:ifeq            57
	//*  23   49:aload_0         
	//*  24   50:aload_3         
	//*  25   51:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  26   54:ifne            62
		{
			sendToServer(s);
	//   27   57:aload_0         
	//   28   58:invokestatic    #161 <Method void sendToServer(String)>
			return;
	//   29   61:return          
		}
		if(!flag && flag1)
	//*  30   62:iload_1         
	//*  31   63:ifne            91
	//*  32   66:iload_2         
	//*  33   67:ifeq            91
			uploadedTokenSharedPrefs.edit().putBoolean("pre_track_uninstall_enabled", false).apply();
	//   34   70:getstatic       #43  <Field SharedPreferences uploadedTokenSharedPrefs>
	//   35   73:invokeinterface #165 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   36   78:ldc1            #151 <String "pre_track_uninstall_enabled">
	//   37   80:iconst_0        
	//   38   81:invokeinterface #171 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   39   86:invokeinterface #174 <Method void android.content.SharedPreferences$Editor.apply()>
	//   40   91:return          
	}

	private static final String PLATFORM = "android";
	private static final String SUCCESS = "success";
	private static final String TAG = ((Class) (com/facebook/appevents/FacebookUninstallTracker)).getCanonicalName();
	private static final String UPLOADED_TOKEN_STORE = "com.facebook.appevents.FacebookUninstallTracker.UPLOADED_TOKEN";
	private static final SharedPreferences uploadedTokenSharedPrefs = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.appevents.FacebookUninstallTracker.UPLOADED_TOKEN", 0);

	static 
	{
	//    0    0:ldc1            #2   <Class FacebookUninstallTracker>
	//    1    2:invokevirtual   #27  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #29  <Field String TAG>
	//    3    8:invokestatic    #35  <Method Context FacebookSdk.getApplicationContext()>
	//    4   11:ldc1            #17  <String "com.facebook.appevents.FacebookUninstallTracker.UPLOADED_TOKEN">
	//    5   13:iconst_0        
	//    6   14:invokevirtual   #41  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    7   17:putstatic       #43  <Field SharedPreferences uploadedTokenSharedPrefs>
	//*   8   20:return          
	}


/*
	static GraphRequest access$000(String s, String s1)
	{
		return buildPushDeviceTokenRequest(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #52  <Method GraphRequest buildPushDeviceTokenRequest(String, String)>
	//    3    5:areturn         
	}

*/


/*
	static SharedPreferences access$100()
	{
		return uploadedTokenSharedPrefs;
	//    0    0:getstatic       #43  <Field SharedPreferences uploadedTokenSharedPrefs>
	//    1    3:areturn         
	}

*/


/*
	static String access$200()
	{
		return TAG;
	//    0    0:getstatic       #29  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
