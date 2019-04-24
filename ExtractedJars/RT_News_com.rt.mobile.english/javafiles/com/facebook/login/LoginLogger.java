// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsLogger;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//			LoginBehavior, LoginClient, DefaultAudience

class LoginLogger
{

	LoginLogger(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void Object()>
		applicationId = s;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #86  <Field String applicationId>
		appEventsLogger = AppEventsLogger.newLogger(context, s);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokestatic    #92  <Method AppEventsLogger AppEventsLogger.newLogger(Context, String)>
	//    9   15:putfield        #94  <Field AppEventsLogger appEventsLogger>
		try
		{
			context = ((Context) (context.getPackageManager()));
	//   10   18:aload_1         
	//   11   19:invokevirtual   #100 <Method PackageManager Context.getPackageManager()>
	//   12   22:astore_1        
		}
	//*  13   23:aload_1         
	//*  14   24:ifnull          47
	//*  15   27:aload_1         
	//*  16   28:ldc1            #74  <String "com.facebook.katana">
	//*  17   30:iconst_0        
	//*  18   31:invokevirtual   #106 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//*  19   34:astore_1        
	//*  20   35:aload_1         
	//*  21   36:ifnull          47
	//*  22   39:aload_0         
	//*  23   40:aload_1         
	//*  24   41:getfield        #111 <Field String PackageInfo.versionName>
	//*  25   44:putfield        #113 <Field String facebookVersion>
	//*  26   47:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  27   48:astore_1        
		{
			return;
	//   28   49:return          
		}
		if(context == null)
			break MISSING_BLOCK_LABEL_47;
		context = ((Context) (((PackageManager) (context)).getPackageInfo("com.facebook.katana", 0)));
		if(context == null)
			break MISSING_BLOCK_LABEL_47;
		facebookVersion = ((PackageInfo) (context)).versionName;
	}

	static Bundle newAuthorizationLoggingBundle(String s)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #118 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #119 <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
	//    4    8:aload_1         
	//    5    9:ldc1            #71  <String "1_timestamp_ms">
	//    6   11:invokestatic    #125 <Method long System.currentTimeMillis()>
	//    7   14:invokevirtual   #129 <Method void Bundle.putLong(String, long)>
		bundle.putString("0_auth_logger_id", s);
	//    8   17:aload_1         
	//    9   18:ldc1            #50  <String "0_auth_logger_id">
	//   10   20:aload_0         
	//   11   21:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		bundle.putString("3_method", "");
	//   12   24:aload_1         
	//   13   25:ldc1            #65  <String "3_method">
	//   14   27:ldc1            #135 <String "">
	//   15   29:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		bundle.putString("2_result", "");
	//   16   32:aload_1         
	//   17   33:ldc1            #62  <String "2_result">
	//   18   35:ldc1            #135 <String "">
	//   19   37:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		bundle.putString("5_error_message", "");
	//   20   40:aload_1         
	//   21   41:ldc1            #56  <String "5_error_message">
	//   22   43:ldc1            #135 <String "">
	//   23   45:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		bundle.putString("4_error_code", "");
	//   24   48:aload_1         
	//   25   49:ldc1            #53  <String "4_error_code">
	//   26   51:ldc1            #135 <String "">
	//   27   53:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		bundle.putString("6_extras", "");
	//   28   56:aload_1         
	//   29   57:ldc1            #59  <String "6_extras">
	//   30   59:ldc1            #135 <String "">
	//   31   61:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		return bundle;
	//   32   64:aload_1         
	//   33   65:areturn         
	}

	public String getApplicationId()
	{
		return applicationId;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String applicationId>
	//    2    4:areturn         
	}

	public void logAuthorizationMethodComplete(String s, String s1, String s2, String s3, String s4, Map map)
	{
		s = ((String) (newAuthorizationLoggingBundle(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #141 <Method Bundle newAuthorizationLoggingBundle(String)>
	//    2    4:astore_1        
		if(s2 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          16
			((Bundle) (s)).putString("2_result", s2);
	//    5    9:aload_1         
	//    6   10:ldc1            #62  <String "2_result">
	//    7   12:aload_3         
	//    8   13:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		if(s3 != null)
	//*   9   16:aload           4
	//*  10   18:ifnull          29
			((Bundle) (s)).putString("5_error_message", s3);
	//   11   21:aload_1         
	//   12   22:ldc1            #56  <String "5_error_message">
	//   13   24:aload           4
	//   14   26:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		if(s4 != null)
	//*  15   29:aload           5
	//*  16   31:ifnull          42
			((Bundle) (s)).putString("4_error_code", s4);
	//   17   34:aload_1         
	//   18   35:ldc1            #53  <String "4_error_code">
	//   19   37:aload           5
	//   20   39:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		if(map != null && !map.isEmpty())
	//*  21   42:aload           6
	//*  22   44:ifnull          75
	//*  23   47:aload           6
	//*  24   49:invokeinterface #147 <Method boolean Map.isEmpty()>
	//*  25   54:ifne            75
			((Bundle) (s)).putString("6_extras", (new JSONObject(map)).toString());
	//   26   57:aload_1         
	//   27   58:ldc1            #59  <String "6_extras">
	//   28   60:new             #149 <Class JSONObject>
	//   29   63:dup             
	//   30   64:aload           6
	//   31   66:invokespecial   #152 <Method void JSONObject(Map)>
	//   32   69:invokevirtual   #155 <Method String JSONObject.toString()>
	//   33   72:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		((Bundle) (s)).putString("3_method", s1);
	//   34   75:aload_1         
	//   35   76:ldc1            #65  <String "3_method">
	//   36   78:aload_2         
	//   37   79:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		appEventsLogger.logSdkEvent("fb_mobile_login_method_complete", ((Double) (null)), ((Bundle) (s)));
	//   38   82:aload_0         
	//   39   83:getfield        #94  <Field AppEventsLogger appEventsLogger>
	//   40   86:ldc1            #41  <String "fb_mobile_login_method_complete">
	//   41   88:aconst_null     
	//   42   89:aload_1         
	//   43   90:invokevirtual   #159 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//   44   93:return          
	}

	public void logAuthorizationMethodStart(String s, String s1)
	{
		s = ((String) (newAuthorizationLoggingBundle(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #141 <Method Bundle newAuthorizationLoggingBundle(String)>
	//    2    4:astore_1        
		((Bundle) (s)).putString("3_method", s1);
	//    3    5:aload_1         
	//    4    6:ldc1            #65  <String "3_method">
	//    5    8:aload_2         
	//    6    9:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		appEventsLogger.logSdkEvent("fb_mobile_login_method_start", ((Double) (null)), ((Bundle) (s)));
	//    7   12:aload_0         
	//    8   13:getfield        #94  <Field AppEventsLogger appEventsLogger>
	//    9   16:ldc1            #44  <String "fb_mobile_login_method_start">
	//   10   18:aconst_null     
	//   11   19:aload_1         
	//   12   20:invokevirtual   #159 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//   13   23:return          
	}

	public void logCompleteLogin(String s, Map map, LoginClient.Result.Code code, Map map1, Exception exception)
	{
		Bundle bundle;
		bundle = newAuthorizationLoggingBundle(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #141 <Method Bundle newAuthorizationLoggingBundle(String)>
	//    2    4:astore          6
		if(code != null)
	//*   3    6:aload_3         
	//*   4    7:ifnull          21
			bundle.putString("2_result", code.getLoggingValue());
	//    5   10:aload           6
	//    6   12:ldc1            #62  <String "2_result">
	//    7   14:aload_3         
	//    8   15:invokevirtual   #171 <Method String LoginClient$Result$Code.getLoggingValue()>
	//    9   18:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		if(exception != null && exception.getMessage() != null)
	//*  10   21:aload           5
	//*  11   23:ifnull          46
	//*  12   26:aload           5
	//*  13   28:invokevirtual   #176 <Method String Exception.getMessage()>
	//*  14   31:ifnull          46
			bundle.putString("5_error_message", exception.getMessage());
	//   15   34:aload           6
	//   16   36:ldc1            #56  <String "5_error_message">
	//   17   38:aload           5
	//   18   40:invokevirtual   #176 <Method String Exception.getMessage()>
	//   19   43:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		if(!map.isEmpty())
	//*  20   46:aload_2         
	//*  21   47:invokeinterface #147 <Method boolean Map.isEmpty()>
	//*  22   52:ifne            67
			s = ((String) (new JSONObject(map)));
	//   23   55:new             #149 <Class JSONObject>
	//   24   58:dup             
	//   25   59:aload_2         
	//   26   60:invokespecial   #152 <Method void JSONObject(Map)>
	//   27   63:astore_1        
		else
	//*  28   64:goto            69
			s = null;
	//   29   67:aconst_null     
	//   30   68:astore_1        
		code = ((LoginClient.Result.Code) (s));
	//   31   69:aload_1         
	//   32   70:astore_3        
		if(map1 == null) goto _L2; else goto _L1
	//   33   71:aload           4
	//   34   73:ifnull          147
_L1:
		map = ((Map) (s));
	//   35   76:aload_1         
	//   36   77:astore_2        
		if(s == null)
	//*  37   78:aload_1         
	//*  38   79:ifnonnull       90
			map = ((Map) (new JSONObject()));
	//   39   82:new             #149 <Class JSONObject>
	//   40   85:dup             
	//   41   86:invokespecial   #177 <Method void JSONObject()>
	//   42   89:astore_2        
		s = ((String) (map1.entrySet().iterator()));
	//   43   90:aload           4
	//   44   92:invokeinterface #181 <Method Set Map.entrySet()>
	//   45   97:invokeinterface #187 <Method Iterator Set.iterator()>
	//   46  102:astore_1        
_L3:
		code = ((LoginClient.Result.Code) (map));
	//   47  103:aload_2         
	//   48  104:astore_3        
		if(!((Iterator) (s)).hasNext())
			break; /* Loop/switch isn't completed */
	//   49  105:aload_1         
	//   50  106:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//   51  111:ifeq            147
		code = ((LoginClient.Result.Code) ((java.util.Map.Entry)((Iterator) (s)).next()));
	//   52  114:aload_1         
	//   53  115:invokeinterface #196 <Method Object Iterator.next()>
	//   54  120:checkcast       #198 <Class java.util.Map$Entry>
	//   55  123:astore_3        
		((JSONObject) (map)).put((String)((java.util.Map.Entry) (code)).getKey(), ((java.util.Map.Entry) (code)).getValue());
	//   56  124:aload_2         
	//   57  125:aload_3         
	//   58  126:invokeinterface #201 <Method Object java.util.Map$Entry.getKey()>
	//   59  131:checkcast       #203 <Class String>
	//   60  134:aload_3         
	//   61  135:invokeinterface #206 <Method Object java.util.Map$Entry.getValue()>
	//   62  140:invokevirtual   #210 <Method JSONObject JSONObject.put(String, Object)>
	//   63  143:pop             
		if(true) goto _L3; else goto _L2
	//   64  144:goto            103
_L2:
		if(code != null)
	//*  65  147:aload_3         
	//*  66  148:ifnull          162
			bundle.putString("6_extras", ((JSONObject) (code)).toString());
	//   67  151:aload           6
	//   68  153:ldc1            #59  <String "6_extras">
	//   69  155:aload_3         
	//   70  156:invokevirtual   #155 <Method String JSONObject.toString()>
	//   71  159:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		appEventsLogger.logSdkEvent("fb_mobile_login_complete", ((Double) (null)), bundle);
	//   72  162:aload_0         
	//   73  163:getfield        #94  <Field AppEventsLogger appEventsLogger>
	//   74  166:ldc1            #38  <String "fb_mobile_login_complete">
	//   75  168:aconst_null     
	//   76  169:aload           6
	//   77  171:invokevirtual   #159 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
		return;
	//   78  174:return          
		s;
	//   79  175:astore_1        
		code = ((LoginClient.Result.Code) (map));
	//   80  176:aload_2         
	//   81  177:astore_3        
		if(true) goto _L2; else goto _L4
	//   82  178:goto            147
_L4:
	}

	public void logStartLogin(LoginClient.Request request)
	{
		Bundle bundle = newAuthorizationLoggingBundle(request.getAuthId());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #218 <Method String LoginClient$Request.getAuthId()>
	//    2    4:invokestatic    #141 <Method Bundle newAuthorizationLoggingBundle(String)>
	//    3    7:astore_2        
		try
		{
			JSONObject jsonobject = new JSONObject();
	//    4    8:new             #149 <Class JSONObject>
	//    5   11:dup             
	//    6   12:invokespecial   #177 <Method void JSONObject()>
	//    7   15:astore_3        
			jsonobject.put("login_behavior", ((Object) (request.getLoginBehavior().toString())));
	//    8   16:aload_3         
	//    9   17:ldc1            #17  <String "login_behavior">
	//   10   19:aload_1         
	//   11   20:invokevirtual   #222 <Method LoginBehavior LoginClient$Request.getLoginBehavior()>
	//   12   23:invokevirtual   #225 <Method String LoginBehavior.toString()>
	//   13   26:invokevirtual   #210 <Method JSONObject JSONObject.put(String, Object)>
	//   14   29:pop             
			jsonobject.put("request_code", LoginClient.getLoginRequestCode());
	//   15   30:aload_3         
	//   16   31:ldc1            #32  <String "request_code">
	//   17   33:invokestatic    #231 <Method int LoginClient.getLoginRequestCode()>
	//   18   36:invokevirtual   #234 <Method JSONObject JSONObject.put(String, int)>
	//   19   39:pop             
			jsonobject.put("permissions", ((Object) (TextUtils.join(",", ((Iterable) (request.getPermissions()))))));
	//   20   40:aload_3         
	//   21   41:ldc1            #29  <String "permissions">
	//   22   43:ldc1            #236 <String ",">
	//   23   45:aload_1         
	//   24   46:invokevirtual   #239 <Method Set LoginClient$Request.getPermissions()>
	//   25   49:invokestatic    #245 <Method String TextUtils.join(CharSequence, Iterable)>
	//   26   52:invokevirtual   #210 <Method JSONObject JSONObject.put(String, Object)>
	//   27   55:pop             
			jsonobject.put("default_audience", ((Object) (request.getDefaultAudience().toString())));
	//   28   56:aload_3         
	//   29   57:ldc1            #8   <String "default_audience">
	//   30   59:aload_1         
	//   31   60:invokevirtual   #249 <Method DefaultAudience LoginClient$Request.getDefaultAudience()>
	//   32   63:invokevirtual   #252 <Method String DefaultAudience.toString()>
	//   33   66:invokevirtual   #210 <Method JSONObject JSONObject.put(String, Object)>
	//   34   69:pop             
			jsonobject.put("isReauthorize", request.isRerequest());
	//   35   70:aload_3         
	//   36   71:ldc1            #14  <String "isReauthorize">
	//   37   73:aload_1         
	//   38   74:invokevirtual   #255 <Method boolean LoginClient$Request.isRerequest()>
	//   39   77:invokevirtual   #258 <Method JSONObject JSONObject.put(String, boolean)>
	//   40   80:pop             
			if(facebookVersion != null)
	//*  41   81:aload_0         
	//*  42   82:getfield        #113 <Field String facebookVersion>
	//*  43   85:ifnull          99
				jsonobject.put("facebookVersion", ((Object) (facebookVersion)));
	//   44   88:aload_3         
	//   45   89:ldc1            #11  <String "facebookVersion">
	//   46   91:aload_0         
	//   47   92:getfield        #113 <Field String facebookVersion>
	//   48   95:invokevirtual   #210 <Method JSONObject JSONObject.put(String, Object)>
	//   49   98:pop             
			bundle.putString("6_extras", jsonobject.toString());
	//   50   99:aload_2         
	//   51  100:ldc1            #59  <String "6_extras">
	//   52  102:aload_3         
	//   53  103:invokevirtual   #155 <Method String JSONObject.toString()>
	//   54  106:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		}
	//*  55  109:aload_0         
	//*  56  110:getfield        #94  <Field AppEventsLogger appEventsLogger>
	//*  57  113:ldc1            #47  <String "fb_mobile_login_start">
	//*  58  115:aconst_null     
	//*  59  116:aload_2         
	//*  60  117:invokevirtual   #159 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//*  61  120:return          
		// Misplaced declaration of an exception variable
		catch(LoginClient.Request request) { }
	//   62  121:astore_1        
		appEventsLogger.logSdkEvent("fb_mobile_login_start", ((Double) (null)), bundle);
	//*  63  122:goto            109
	}

	public void logUnexpectedError(String s, String s1)
	{
		logUnexpectedError(s, s1, "");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #135 <String "">
	//    4    5:invokevirtual   #262 <Method void logUnexpectedError(String, String, String)>
	//    5    8:return          
	}

	public void logUnexpectedError(String s, String s1, String s2)
	{
		Bundle bundle = newAuthorizationLoggingBundle("");
	//    0    0:ldc1            #135 <String "">
	//    1    2:invokestatic    #141 <Method Bundle newAuthorizationLoggingBundle(String)>
	//    2    5:astore          4
		bundle.putString("2_result", LoginClient.Result.Code.ERROR.getLoggingValue());
	//    3    7:aload           4
	//    4    9:ldc1            #62  <String "2_result">
	//    5   11:getstatic       #266 <Field LoginClient$Result$Code LoginClient$Result$Code.ERROR>
	//    6   14:invokevirtual   #171 <Method String LoginClient$Result$Code.getLoggingValue()>
	//    7   17:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		bundle.putString("5_error_message", s1);
	//    8   20:aload           4
	//    9   22:ldc1            #56  <String "5_error_message">
	//   10   24:aload_2         
	//   11   25:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		bundle.putString("3_method", s2);
	//   12   28:aload           4
	//   13   30:ldc1            #65  <String "3_method">
	//   14   32:aload_3         
	//   15   33:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		appEventsLogger.logSdkEvent(s, ((Double) (null)), bundle);
	//   16   36:aload_0         
	//   17   37:getfield        #94  <Field AppEventsLogger appEventsLogger>
	//   18   40:aload_1         
	//   19   41:aconst_null     
	//   20   42:aload           4
	//   21   44:invokevirtual   #159 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//   22   47:return          
	}

	static final String EVENT_EXTRAS_DEFAULT_AUDIENCE = "default_audience";
	static final String EVENT_EXTRAS_FACEBOOK_VERSION = "facebookVersion";
	static final String EVENT_EXTRAS_IS_REAUTHORIZE = "isReauthorize";
	static final String EVENT_EXTRAS_LOGIN_BEHAVIOR = "login_behavior";
	static final String EVENT_EXTRAS_MISSING_INTERNET_PERMISSION = "no_internet_permission";
	static final String EVENT_EXTRAS_NEW_PERMISSIONS = "new_permissions";
	static final String EVENT_EXTRAS_NOT_TRIED = "not_tried";
	static final String EVENT_EXTRAS_PERMISSIONS = "permissions";
	static final String EVENT_EXTRAS_REQUEST_CODE = "request_code";
	static final String EVENT_EXTRAS_TRY_LOGIN_ACTIVITY = "try_login_activity";
	static final String EVENT_NAME_LOGIN_COMPLETE = "fb_mobile_login_complete";
	static final String EVENT_NAME_LOGIN_METHOD_COMPLETE = "fb_mobile_login_method_complete";
	static final String EVENT_NAME_LOGIN_METHOD_START = "fb_mobile_login_method_start";
	static final String EVENT_NAME_LOGIN_START = "fb_mobile_login_start";
	static final String EVENT_PARAM_AUTH_LOGGER_ID = "0_auth_logger_id";
	static final String EVENT_PARAM_ERROR_CODE = "4_error_code";
	static final String EVENT_PARAM_ERROR_MESSAGE = "5_error_message";
	static final String EVENT_PARAM_EXTRAS = "6_extras";
	static final String EVENT_PARAM_LOGIN_RESULT = "2_result";
	static final String EVENT_PARAM_METHOD = "3_method";
	static final String EVENT_PARAM_METHOD_RESULT_SKIPPED = "skipped";
	static final String EVENT_PARAM_TIMESTAMP = "1_timestamp_ms";
	static final String FACEBOOK_PACKAGE_NAME = "com.facebook.katana";
	private final AppEventsLogger appEventsLogger;
	private String applicationId;
	private String facebookVersion;
}
