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
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
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
	//    1    1:invokespecial   #17  <Method void Object()>
		applicationId = s;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #19  <Field String applicationId>
		appEventsLogger = AppEventsLogger.newLogger(context, s);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokestatic    #25  <Method AppEventsLogger AppEventsLogger.newLogger(Context, String)>
	//    9   15:putfield        #27  <Field AppEventsLogger appEventsLogger>
		try
		{
			context = ((Context) (context.getPackageManager()));
	//   10   18:aload_1         
	//   11   19:invokevirtual   #33  <Method PackageManager Context.getPackageManager()>
	//   12   22:astore_1        
		}
	//*  13   23:aload_1         
	//*  14   24:ifnull          47
	//*  15   27:aload_1         
	//*  16   28:ldc1            #35  <String "com.facebook.katana">
	//*  17   30:iconst_0        
	//*  18   31:invokevirtual   #41  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//*  19   34:astore_1        
	//*  20   35:aload_1         
	//*  21   36:ifnull          47
	//*  22   39:aload_0         
	//*  23   40:aload_1         
	//*  24   41:getfield        #46  <Field String PackageInfo.versionName>
	//*  25   44:putfield        #48  <Field String facebookVersion>
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
	//    0    0:new             #53  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
	//    4    8:aload_1         
	//    5    9:ldc1            #56  <String "1_timestamp_ms">
	//    6   11:invokestatic    #62  <Method long System.currentTimeMillis()>
	//    7   14:invokevirtual   #66  <Method void Bundle.putLong(String, long)>
		bundle.putString("0_auth_logger_id", s);
	//    8   17:aload_1         
	//    9   18:ldc1            #68  <String "0_auth_logger_id">
	//   10   20:aload_0         
	//   11   21:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		bundle.putString("3_method", "");
	//   12   24:aload_1         
	//   13   25:ldc1            #74  <String "3_method">
	//   14   27:ldc1            #76  <String "">
	//   15   29:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		bundle.putString("2_result", "");
	//   16   32:aload_1         
	//   17   33:ldc1            #78  <String "2_result">
	//   18   35:ldc1            #76  <String "">
	//   19   37:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		bundle.putString("5_error_message", "");
	//   20   40:aload_1         
	//   21   41:ldc1            #80  <String "5_error_message">
	//   22   43:ldc1            #76  <String "">
	//   23   45:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		bundle.putString("4_error_code", "");
	//   24   48:aload_1         
	//   25   49:ldc1            #82  <String "4_error_code">
	//   26   51:ldc1            #76  <String "">
	//   27   53:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		bundle.putString("6_extras", "");
	//   28   56:aload_1         
	//   29   57:ldc1            #84  <String "6_extras">
	//   30   59:ldc1            #76  <String "">
	//   31   61:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		return bundle;
	//   32   64:aload_1         
	//   33   65:areturn         
	}

	public String getApplicationId()
	{
		return applicationId;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String applicationId>
	//    2    4:areturn         
	}

	public void logAuthorizationMethodComplete(String s, String s1, String s2, String s3, String s4, Map map)
	{
		Bundle bundle = newAuthorizationLoggingBundle(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #90  <Method Bundle newAuthorizationLoggingBundle(String)>
	//    2    4:astore          7
		if(s2 != null)
	//*   3    6:aload_3         
	//*   4    7:ifnull          18
			bundle.putString("2_result", s2);
	//    5   10:aload           7
	//    6   12:ldc1            #78  <String "2_result">
	//    7   14:aload_3         
	//    8   15:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		if(s3 != null)
	//*   9   18:aload           4
	//*  10   20:ifnull          32
			bundle.putString("5_error_message", s3);
	//   11   23:aload           7
	//   12   25:ldc1            #80  <String "5_error_message">
	//   13   27:aload           4
	//   14   29:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		if(s4 != null)
	//*  15   32:aload           5
	//*  16   34:ifnull          46
			bundle.putString("4_error_code", s4);
	//   17   37:aload           7
	//   18   39:ldc1            #82  <String "4_error_code">
	//   19   41:aload           5
	//   20   43:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		if(map != null && !map.isEmpty())
	//*  21   46:aload           6
	//*  22   48:ifnull          102
	//*  23   51:aload           6
	//*  24   53:invokeinterface #96  <Method boolean Map.isEmpty()>
	//*  25   58:ifne            102
		{
			s = ((String) (new JSONObject(map)));
	//   26   61:new             #98  <Class JSONObject>
	//   27   64:dup             
	//   28   65:aload           6
	//   29   67:invokespecial   #101 <Method void JSONObject(Map)>
	//   30   70:astore_1        
			if(!(s instanceof JSONObject))
	//*  31   71:aload_1         
	//*  32   72:instanceof      #98  <Class JSONObject>
	//*  33   75:ifne            86
				s = ((JSONObject) (s)).toString();
	//   34   78:aload_1         
	//   35   79:invokevirtual   #104 <Method String JSONObject.toString()>
	//   36   82:astore_1        
			else
	//*  37   83:goto            94
				s = JSONObjectInstrumentation.toString((JSONObject)s);
	//   38   86:aload_1         
	//   39   87:checkcast       #98  <Class JSONObject>
	//   40   90:invokestatic    #109 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   41   93:astore_1        
			bundle.putString("6_extras", s);
	//   42   94:aload           7
	//   43   96:ldc1            #84  <String "6_extras">
	//   44   98:aload_1         
	//   45   99:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		}
		bundle.putString("3_method", s1);
	//   46  102:aload           7
	//   47  104:ldc1            #74  <String "3_method">
	//   48  106:aload_2         
	//   49  107:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		appEventsLogger.logSdkEvent("fb_mobile_login_method_complete", ((Double) (null)), bundle);
	//   50  110:aload_0         
	//   51  111:getfield        #27  <Field AppEventsLogger appEventsLogger>
	//   52  114:ldc1            #111 <String "fb_mobile_login_method_complete">
	//   53  116:aconst_null     
	//   54  117:aload           7
	//   55  119:invokevirtual   #115 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//   56  122:return          
	}

	public void logAuthorizationMethodNotTried(String s, String s1)
	{
		s = ((String) (newAuthorizationLoggingBundle(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #90  <Method Bundle newAuthorizationLoggingBundle(String)>
	//    2    4:astore_1        
		((Bundle) (s)).putString("3_method", s1);
	//    3    5:aload_1         
	//    4    6:ldc1            #74  <String "3_method">
	//    5    8:aload_2         
	//    6    9:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		appEventsLogger.logSdkEvent("fb_mobile_login_method_not_tried", ((Double) (null)), ((Bundle) (s)));
	//    7   12:aload_0         
	//    8   13:getfield        #27  <Field AppEventsLogger appEventsLogger>
	//    9   16:ldc1            #120 <String "fb_mobile_login_method_not_tried">
	//   10   18:aconst_null     
	//   11   19:aload_1         
	//   12   20:invokevirtual   #115 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//   13   23:return          
	}

	public void logAuthorizationMethodStart(String s, String s1)
	{
		s = ((String) (newAuthorizationLoggingBundle(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #90  <Method Bundle newAuthorizationLoggingBundle(String)>
	//    2    4:astore_1        
		((Bundle) (s)).putString("3_method", s1);
	//    3    5:aload_1         
	//    4    6:ldc1            #74  <String "3_method">
	//    5    8:aload_2         
	//    6    9:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		appEventsLogger.logSdkEvent("fb_mobile_login_method_start", ((Double) (null)), ((Bundle) (s)));
	//    7   12:aload_0         
	//    8   13:getfield        #27  <Field AppEventsLogger appEventsLogger>
	//    9   16:ldc1            #123 <String "fb_mobile_login_method_start">
	//   10   18:aconst_null     
	//   11   19:aload_1         
	//   12   20:invokevirtual   #115 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//   13   23:return          
	}

	public void logCompleteLogin(String s, Map map, LoginClient.Result.Code code, Map map1, Exception exception)
	{
		Bundle bundle;
		bundle = newAuthorizationLoggingBundle(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #90  <Method Bundle newAuthorizationLoggingBundle(String)>
	//    2    4:astore          6
		if(code != null)
	//*   3    6:aload_3         
	//*   4    7:ifnull          21
			bundle.putString("2_result", code.getLoggingValue());
	//    5   10:aload           6
	//    6   12:ldc1            #78  <String "2_result">
	//    7   14:aload_3         
	//    8   15:invokevirtual   #132 <Method String LoginClient$Result$Code.getLoggingValue()>
	//    9   18:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		if(exception != null && exception.getMessage() != null)
	//*  10   21:aload           5
	//*  11   23:ifnull          46
	//*  12   26:aload           5
	//*  13   28:invokevirtual   #137 <Method String Exception.getMessage()>
	//*  14   31:ifnull          46
			bundle.putString("5_error_message", exception.getMessage());
	//   15   34:aload           6
	//   16   36:ldc1            #80  <String "5_error_message">
	//   17   38:aload           5
	//   18   40:invokevirtual   #137 <Method String Exception.getMessage()>
	//   19   43:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		if(!map.isEmpty())
	//*  20   46:aload_2         
	//*  21   47:invokeinterface #96  <Method boolean Map.isEmpty()>
	//*  22   52:ifne            67
			s = ((String) (new JSONObject(map)));
	//   23   55:new             #98  <Class JSONObject>
	//   24   58:dup             
	//   25   59:aload_2         
	//   26   60:invokespecial   #101 <Method void JSONObject(Map)>
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
	//   39   82:new             #98  <Class JSONObject>
	//   40   85:dup             
	//   41   86:invokespecial   #138 <Method void JSONObject()>
	//   42   89:astore_2        
		s = ((String) (map1.entrySet().iterator()));
	//   43   90:aload           4
	//   44   92:invokeinterface #142 <Method Set Map.entrySet()>
	//   45   97:invokeinterface #148 <Method Iterator Set.iterator()>
	//   46  102:astore_1        
_L3:
		code = ((LoginClient.Result.Code) (map));
	//   47  103:aload_2         
	//   48  104:astore_3        
		if(!((Iterator) (s)).hasNext())
			break; /* Loop/switch isn't completed */
	//   49  105:aload_1         
	//   50  106:invokeinterface #153 <Method boolean Iterator.hasNext()>
	//   51  111:ifeq            147
		code = ((LoginClient.Result.Code) ((java.util.Map.Entry)((Iterator) (s)).next()));
	//   52  114:aload_1         
	//   53  115:invokeinterface #157 <Method Object Iterator.next()>
	//   54  120:checkcast       #159 <Class java.util.Map$Entry>
	//   55  123:astore_3        
		((JSONObject) (map)).put((String)((java.util.Map.Entry) (code)).getKey(), ((java.util.Map.Entry) (code)).getValue());
	//   56  124:aload_2         
	//   57  125:aload_3         
	//   58  126:invokeinterface #162 <Method Object java.util.Map$Entry.getKey()>
	//   59  131:checkcast       #164 <Class String>
	//   60  134:aload_3         
	//   61  135:invokeinterface #167 <Method Object java.util.Map$Entry.getValue()>
	//   62  140:invokevirtual   #171 <Method JSONObject JSONObject.put(String, Object)>
	//   63  143:pop             
		if(true) goto _L3; else goto _L2
	//   64  144:goto            103
_L2:
		if(code != null)
	//*  65  147:aload_3         
	//*  66  148:ifnull          182
		{
			if(!(code instanceof JSONObject))
	//*  67  151:aload_3         
	//*  68  152:instanceof      #98  <Class JSONObject>
	//*  69  155:ifne            166
				s = ((JSONObject) (code)).toString();
	//   70  158:aload_3         
	//   71  159:invokevirtual   #104 <Method String JSONObject.toString()>
	//   72  162:astore_1        
			else
	//*  73  163:goto            174
				s = JSONObjectInstrumentation.toString((JSONObject)code);
	//   74  166:aload_3         
	//   75  167:checkcast       #98  <Class JSONObject>
	//   76  170:invokestatic    #109 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   77  173:astore_1        
			bundle.putString("6_extras", s);
	//   78  174:aload           6
	//   79  176:ldc1            #84  <String "6_extras">
	//   80  178:aload_1         
	//   81  179:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		}
		appEventsLogger.logSdkEvent("fb_mobile_login_complete", ((Double) (null)), bundle);
	//   82  182:aload_0         
	//   83  183:getfield        #27  <Field AppEventsLogger appEventsLogger>
	//   84  186:ldc1            #173 <String "fb_mobile_login_complete">
	//   85  188:aconst_null     
	//   86  189:aload           6
	//   87  191:invokevirtual   #115 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
		return;
	//   88  194:return          
		s;
	//   89  195:astore_1        
		code = ((LoginClient.Result.Code) (map));
	//   90  196:aload_2         
	//   91  197:astore_3        
		if(true) goto _L2; else goto _L4
	//   92  198:goto            147
_L4:
	}

	public void logStartLogin(LoginClient.Request request)
	{
		Bundle bundle = newAuthorizationLoggingBundle(request.getAuthId());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #181 <Method String LoginClient$Request.getAuthId()>
	//    2    4:invokestatic    #90  <Method Bundle newAuthorizationLoggingBundle(String)>
	//    3    7:astore_2        
		JSONObject jsonobject;
		jsonobject = new JSONObject();
	//    4    8:new             #98  <Class JSONObject>
	//    5   11:dup             
	//    6   12:invokespecial   #138 <Method void JSONObject()>
	//    7   15:astore_3        
		jsonobject.put("login_behavior", ((Object) (request.getLoginBehavior().toString())));
	//    8   16:aload_3         
	//    9   17:ldc1            #183 <String "login_behavior">
	//   10   19:aload_1         
	//   11   20:invokevirtual   #187 <Method LoginBehavior LoginClient$Request.getLoginBehavior()>
	//   12   23:invokevirtual   #190 <Method String LoginBehavior.toString()>
	//   13   26:invokevirtual   #171 <Method JSONObject JSONObject.put(String, Object)>
	//   14   29:pop             
		jsonobject.put("request_code", LoginClient.getLoginRequestCode());
	//   15   30:aload_3         
	//   16   31:ldc1            #192 <String "request_code">
	//   17   33:invokestatic    #198 <Method int LoginClient.getLoginRequestCode()>
	//   18   36:invokevirtual   #201 <Method JSONObject JSONObject.put(String, int)>
	//   19   39:pop             
		jsonobject.put("permissions", ((Object) (TextUtils.join(",", ((Iterable) (request.getPermissions()))))));
	//   20   40:aload_3         
	//   21   41:ldc1            #203 <String "permissions">
	//   22   43:ldc1            #205 <String ",">
	//   23   45:aload_1         
	//   24   46:invokevirtual   #208 <Method Set LoginClient$Request.getPermissions()>
	//   25   49:invokestatic    #214 <Method String TextUtils.join(CharSequence, Iterable)>
	//   26   52:invokevirtual   #171 <Method JSONObject JSONObject.put(String, Object)>
	//   27   55:pop             
		jsonobject.put("default_audience", ((Object) (request.getDefaultAudience().toString())));
	//   28   56:aload_3         
	//   29   57:ldc1            #216 <String "default_audience">
	//   30   59:aload_1         
	//   31   60:invokevirtual   #220 <Method DefaultAudience LoginClient$Request.getDefaultAudience()>
	//   32   63:invokevirtual   #223 <Method String DefaultAudience.toString()>
	//   33   66:invokevirtual   #171 <Method JSONObject JSONObject.put(String, Object)>
	//   34   69:pop             
		jsonobject.put("isReauthorize", request.isRerequest());
	//   35   70:aload_3         
	//   36   71:ldc1            #225 <String "isReauthorize">
	//   37   73:aload_1         
	//   38   74:invokevirtual   #228 <Method boolean LoginClient$Request.isRerequest()>
	//   39   77:invokevirtual   #231 <Method JSONObject JSONObject.put(String, boolean)>
	//   40   80:pop             
		if(facebookVersion != null)
	//*  41   81:aload_0         
	//*  42   82:getfield        #48  <Field String facebookVersion>
	//*  43   85:ifnull          99
			jsonobject.put("facebookVersion", ((Object) (facebookVersion)));
	//   44   88:aload_3         
	//   45   89:ldc1            #232 <String "facebookVersion">
	//   46   91:aload_0         
	//   47   92:getfield        #48  <Field String facebookVersion>
	//   48   95:invokevirtual   #171 <Method JSONObject JSONObject.put(String, Object)>
	//   49   98:pop             
		if(!(jsonobject instanceof JSONObject))
	//*  50   99:aload_3         
	//*  51  100:instanceof      #98  <Class JSONObject>
	//*  52  103:ifne            114
		{
			request = ((LoginClient.Request) (jsonobject.toString()));
	//   53  106:aload_3         
	//   54  107:invokevirtual   #104 <Method String JSONObject.toString()>
	//   55  110:astore_1        
			break MISSING_BLOCK_LABEL_122;
	//   56  111:goto            122
		}
		request = ((LoginClient.Request) (JSONObjectInstrumentation.toString((JSONObject)jsonobject)));
	//   57  114:aload_3         
	//   58  115:checkcast       #98  <Class JSONObject>
	//   59  118:invokestatic    #109 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   60  121:astore_1        
		bundle.putString("6_extras", ((String) (request)));
	//   61  122:aload_2         
	//   62  123:ldc1            #84  <String "6_extras">
	//   63  125:aload_1         
	//   64  126:invokevirtual   #72  <Method void Bundle.putString(String, String)>
_L2:
		appEventsLogger.logSdkEvent("fb_mobile_login_start", ((Double) (null)), bundle);
	//   65  129:aload_0         
	//   66  130:getfield        #27  <Field AppEventsLogger appEventsLogger>
	//   67  133:ldc1            #234 <String "fb_mobile_login_start">
	//   68  135:aconst_null     
	//   69  136:aload_2         
	//   70  137:invokevirtual   #115 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
		return;
	//   71  140:return          
		request;
	//   72  141:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  73  142:goto            129
	}

	public void logUnexpectedError(String s, String s1)
	{
		logUnexpectedError(s, s1, "");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #76  <String "">
	//    4    5:invokevirtual   #238 <Method void logUnexpectedError(String, String, String)>
	//    5    8:return          
	}

	public void logUnexpectedError(String s, String s1, String s2)
	{
		Bundle bundle = newAuthorizationLoggingBundle("");
	//    0    0:ldc1            #76  <String "">
	//    1    2:invokestatic    #90  <Method Bundle newAuthorizationLoggingBundle(String)>
	//    2    5:astore          4
		bundle.putString("2_result", LoginClient.Result.Code.ERROR.getLoggingValue());
	//    3    7:aload           4
	//    4    9:ldc1            #78  <String "2_result">
	//    5   11:getstatic       #242 <Field LoginClient$Result$Code LoginClient$Result$Code.ERROR>
	//    6   14:invokevirtual   #132 <Method String LoginClient$Result$Code.getLoggingValue()>
	//    7   17:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		bundle.putString("5_error_message", s1);
	//    8   20:aload           4
	//    9   22:ldc1            #80  <String "5_error_message">
	//   10   24:aload_2         
	//   11   25:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		bundle.putString("3_method", s2);
	//   12   28:aload           4
	//   13   30:ldc1            #74  <String "3_method">
	//   14   32:aload_3         
	//   15   33:invokevirtual   #72  <Method void Bundle.putString(String, String)>
		appEventsLogger.logSdkEvent(s, ((Double) (null)), bundle);
	//   16   36:aload_0         
	//   17   37:getfield        #27  <Field AppEventsLogger appEventsLogger>
	//   18   40:aload_1         
	//   19   41:aconst_null     
	//   20   42:aload           4
	//   21   44:invokevirtual   #115 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//   22   47:return          
	}

	private final AppEventsLogger appEventsLogger;
	private String applicationId;
	private String facebookVersion;
}
