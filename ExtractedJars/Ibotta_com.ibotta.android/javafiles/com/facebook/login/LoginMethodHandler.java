// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.content.Intent;
import android.os.*;
import android.util.Base64;
import android.util.Log;
import com.facebook.*;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.Utility;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.io.UnsupportedEncodingException;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//			LoginClient

abstract class LoginMethodHandler
	implements Parcelable
{

	LoginMethodHandler(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		methodLoggingExtras = Utility.readStringMapFromParcel(parcel);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #23  <Method Map Utility.readStringMapFromParcel(Parcel)>
	//    5    9:putfield        #25  <Field Map methodLoggingExtras>
	//    6   12:return          
	}

	LoginMethodHandler(LoginClient loginclient)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		loginClient = loginclient;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field LoginClient loginClient>
	//    5    9:return          
	}

	static AccessToken createAccessTokenFromNativeLogin(Bundle bundle, AccessTokenSource accesstokensource, String s)
	{
		Date date = Utility.getBundleLongAsDate(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
	//    0    0:aload_0         
	//    1    1:ldc1            #33  <String "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH">
	//    2    3:new             #35  <Class Date>
	//    3    6:dup             
	//    4    7:lconst_0        
	//    5    8:invokespecial   #38  <Method void Date(long)>
	//    6   11:invokestatic    #42  <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
	//    7   14:astore_3        
		ArrayList arraylist = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
	//    8   15:aload_0         
	//    9   16:ldc1            #44  <String "com.facebook.platform.extra.PERMISSIONS">
	//   10   18:invokevirtual   #50  <Method ArrayList Bundle.getStringArrayList(String)>
	//   11   21:astore          4
		String s1 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
	//   12   23:aload_0         
	//   13   24:ldc1            #52  <String "com.facebook.platform.extra.ACCESS_TOKEN">
	//   14   26:invokevirtual   #56  <Method String Bundle.getString(String)>
	//   15   29:astore          5
		if(Utility.isNullOrEmpty(s1))
	//*  16   31:aload           5
	//*  17   33:invokestatic    #60  <Method boolean Utility.isNullOrEmpty(String)>
	//*  18   36:ifeq            41
			return null;
	//   19   39:aconst_null     
	//   20   40:areturn         
		else
			return new AccessToken(s1, s, bundle.getString("com.facebook.platform.extra.USER_ID"), ((Collection) (arraylist)), ((Collection) (null)), accesstokensource, date, new Date());
	//   21   41:new             #62  <Class AccessToken>
	//   22   44:dup             
	//   23   45:aload           5
	//   24   47:aload_2         
	//   25   48:aload_0         
	//   26   49:ldc1            #64  <String "com.facebook.platform.extra.USER_ID">
	//   27   51:invokevirtual   #56  <Method String Bundle.getString(String)>
	//   28   54:aload           4
	//   29   56:aconst_null     
	//   30   57:aload_1         
	//   31   58:aload_3         
	//   32   59:new             #35  <Class Date>
	//   33   62:dup             
	//   34   63:invokespecial   #65  <Method void Date()>
	//   35   66:invokespecial   #68  <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date)>
	//   36   69:areturn         
	}

	public static AccessToken createAccessTokenFromWebBundle(Collection collection, Bundle bundle, AccessTokenSource accesstokensource, String s)
		throws FacebookException
	{
		Date date = Utility.getBundleLongAsDate(bundle, "expires_in", new Date());
	//    0    0:aload_1         
	//    1    1:ldc1            #74  <String "expires_in">
	//    2    3:new             #35  <Class Date>
	//    3    6:dup             
	//    4    7:invokespecial   #65  <Method void Date()>
	//    5   10:invokestatic    #42  <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
	//    6   13:astore          5
		String s1 = bundle.getString("access_token");
	//    7   15:aload_1         
	//    8   16:ldc1            #76  <String "access_token">
	//    9   18:invokevirtual   #56  <Method String Bundle.getString(String)>
	//   10   21:astore          6
		Object obj = ((Object) (bundle.getString("granted_scopes")));
	//   11   23:aload_1         
	//   12   24:ldc1            #78  <String "granted_scopes">
	//   13   26:invokevirtual   #56  <Method String Bundle.getString(String)>
	//   14   29:astore          4
		if(!Utility.isNullOrEmpty(((String) (obj))))
	//*  15   31:aload           4
	//*  16   33:invokestatic    #60  <Method boolean Utility.isNullOrEmpty(String)>
	//*  17   36:ifne            60
			collection = ((Collection) (new ArrayList(((Collection) (Arrays.asList(((Object []) (((String) (obj)).split(",")))))))));
	//   18   39:new             #80  <Class ArrayList>
	//   19   42:dup             
	//   20   43:aload           4
	//   21   45:ldc1            #82  <String ",">
	//   22   47:invokevirtual   #88  <Method String[] String.split(String)>
	//   23   50:invokestatic    #94  <Method java.util.List Arrays.asList(Object[])>
	//   24   53:invokespecial   #97  <Method void ArrayList(Collection)>
	//   25   56:astore_0        
	//*  26   57:goto            60
		obj = ((Object) (bundle.getString("denied_scopes")));
	//   27   60:aload_1         
	//   28   61:ldc1            #99  <String "denied_scopes">
	//   29   63:invokevirtual   #56  <Method String Bundle.getString(String)>
	//   30   66:astore          4
		if(!Utility.isNullOrEmpty(((String) (obj))))
	//*  31   68:aload           4
	//*  32   70:invokestatic    #60  <Method boolean Utility.isNullOrEmpty(String)>
	//*  33   73:ifne            98
			obj = ((Object) (new ArrayList(((Collection) (Arrays.asList(((Object []) (((String) (obj)).split(",")))))))));
	//   34   76:new             #80  <Class ArrayList>
	//   35   79:dup             
	//   36   80:aload           4
	//   37   82:ldc1            #82  <String ",">
	//   38   84:invokevirtual   #88  <Method String[] String.split(String)>
	//   39   87:invokestatic    #94  <Method java.util.List Arrays.asList(Object[])>
	//   40   90:invokespecial   #97  <Method void ArrayList(Collection)>
	//   41   93:astore          4
		else
	//*  42   95:goto            101
			obj = null;
	//   43   98:aconst_null     
	//   44   99:astore          4
		if(Utility.isNullOrEmpty(s1))
	//*  45  101:aload           6
	//*  46  103:invokestatic    #60  <Method boolean Utility.isNullOrEmpty(String)>
	//*  47  106:ifeq            111
			return null;
	//   48  109:aconst_null     
	//   49  110:areturn         
		else
			return new AccessToken(s1, s, getUserIDFromSignedRequest(bundle.getString("signed_request")), collection, ((Collection) (obj)), accesstokensource, date, new Date());
	//   50  111:new             #62  <Class AccessToken>
	//   51  114:dup             
	//   52  115:aload           6
	//   53  117:aload_3         
	//   54  118:aload_1         
	//   55  119:ldc1            #101 <String "signed_request">
	//   56  121:invokevirtual   #56  <Method String Bundle.getString(String)>
	//   57  124:invokestatic    #104 <Method String getUserIDFromSignedRequest(String)>
	//   58  127:aload_0         
	//   59  128:aload           4
	//   60  130:aload_2         
	//   61  131:aload           5
	//   62  133:new             #35  <Class Date>
	//   63  136:dup             
	//   64  137:invokespecial   #65  <Method void Date()>
	//   65  140:invokespecial   #68  <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date)>
	//   66  143:areturn         
	}

	static String getUserIDFromSignedRequest(String s)
		throws FacebookException
	{
		if(s == null || s.isEmpty()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnull          61
	//    2    4:aload_0         
	//    3    5:invokevirtual   #115 <Method boolean String.isEmpty()>
	//    4    8:ifne            61
_L1:
		s = ((String) (s.split("\\.")));
	//    5   11:aload_0         
	//    6   12:ldc1            #117 <String "\\.">
	//    7   14:invokevirtual   #88  <Method String[] String.split(String)>
	//    8   17:astore_0        
		if(s.length != 2)
			break MISSING_BLOCK_LABEL_51;
	//    9   18:aload_0         
	//   10   19:arraylength     
	//   11   20:iconst_2        
	//   12   21:icmpne          51
		s = JSONObjectInstrumentation.init(new String(Base64.decode(((String) (s[1])), 0), "UTF-8")).getString("user_id");
	//   13   24:new             #84  <Class String>
	//   14   27:dup             
	//   15   28:aload_0         
	//   16   29:iconst_1        
	//   17   30:aaload          
	//   18   31:iconst_0        
	//   19   32:invokestatic    #123 <Method byte[] Base64.decode(String, int)>
	//   20   35:ldc1            #125 <String "UTF-8">
	//   21   37:invokespecial   #128 <Method void String(byte[], String)>
	//   22   40:invokestatic    #134 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   23   43:ldc1            #136 <String "user_id">
	//   24   45:invokevirtual   #139 <Method String JSONObject.getString(String)>
	//   25   48:astore_0        
		return s;
	//   26   49:aload_0         
	//   27   50:areturn         
_L4:
		throw new FacebookException("Failed to retrieve user_id from signed_request");
	//   28   51:new             #72  <Class FacebookException>
	//   29   54:dup             
	//   30   55:ldc1            #141 <String "Failed to retrieve user_id from signed_request">
	//   31   57:invokespecial   #144 <Method void FacebookException(String)>
	//   32   60:athrow          
_L2:
		throw new FacebookException("Authorization response does not contain the signed_request");
	//   33   61:new             #72  <Class FacebookException>
	//   34   64:dup             
	//   35   65:ldc1            #146 <String "Authorization response does not contain the signed_request">
	//   36   67:invokespecial   #144 <Method void FacebookException(String)>
	//   37   70:athrow          
		s;
	//   38   71:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//*  39   72:goto            51
	}

	protected void addLoggingExtra(String s, Object obj)
	{
		if(methodLoggingExtras == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Map methodLoggingExtras>
	//*   2    4:ifnonnull       18
			methodLoggingExtras = ((Map) (new HashMap()));
	//    3    7:aload_0         
	//    4    8:new             #150 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #151 <Method void HashMap()>
	//    7   15:putfield        #25  <Field Map methodLoggingExtras>
		Map map = methodLoggingExtras;
	//    8   18:aload_0         
	//    9   19:getfield        #25  <Field Map methodLoggingExtras>
	//   10   22:astore_3        
		if(obj == null)
	//*  11   23:aload_2         
	//*  12   24:ifnonnull       32
			obj = null;
	//   13   27:aconst_null     
	//   14   28:astore_2        
		else
	//*  15   29:goto            37
			obj = ((Object) (obj.toString()));
	//   16   32:aload_2         
	//   17   33:invokevirtual   #155 <Method String Object.toString()>
	//   18   36:astore_2        
		map.put(((Object) (s)), obj);
	//   19   37:aload_3         
	//   20   38:aload_1         
	//   21   39:aload_2         
	//   22   40:invokeinterface #161 <Method Object Map.put(Object, Object)>
	//   23   45:pop             
	//   24   46:return          
	}

	void cancel()
	{
	//    0    0:return          
	}

	protected String getClientState(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #138 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #164 <Method void JSONObject()>
	//    3    7:astore_2        
		try
		{
			jsonobject.put("0_auth_logger_id", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc1            #166 <String "0_auth_logger_id">
	//    6   11:aload_1         
	//    7   12:invokevirtual   #169 <Method JSONObject JSONObject.put(String, Object)>
	//    8   15:pop             
			jsonobject.put("3_method", ((Object) (getNameForLogging())));
	//    9   16:aload_2         
	//   10   17:ldc1            #171 <String "3_method">
	//   11   19:aload_0         
	//   12   20:invokevirtual   #174 <Method String getNameForLogging()>
	//   13   23:invokevirtual   #169 <Method JSONObject JSONObject.put(String, Object)>
	//   14   26:pop             
			putChallengeParam(jsonobject);
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:invokevirtual   #178 <Method void putChallengeParam(JSONObject)>
		}
	//*  18   32:goto            70
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  19   35:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   20   36:new             #180 <Class StringBuilder>
	//   21   39:dup             
	//   22   40:invokespecial   #181 <Method void StringBuilder()>
	//   23   43:astore_3        
			stringbuilder.append("Error creating client state json: ");
	//   24   44:aload_3         
	//   25   45:ldc1            #183 <String "Error creating client state json: ">
	//   26   47:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
			stringbuilder.append(((JSONException) (s)).getMessage());
	//   28   51:aload_3         
	//   29   52:aload_1         
	//   30   53:invokevirtual   #190 <Method String JSONException.getMessage()>
	//   31   56:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
			Log.w("LoginMethodHandler", stringbuilder.toString());
	//   33   60:ldc1            #192 <String "LoginMethodHandler">
	//   34   62:aload_3         
	//   35   63:invokevirtual   #193 <Method String StringBuilder.toString()>
	//   36   66:invokestatic    #199 <Method int Log.w(String, String)>
	//   37   69:pop             
		}
		if(!(jsonobject instanceof JSONObject))
	//*  38   70:aload_2         
	//*  39   71:instanceof      #138 <Class JSONObject>
	//*  40   74:ifne            82
			return jsonobject.toString();
	//   41   77:aload_2         
	//   42   78:invokevirtual   #200 <Method String JSONObject.toString()>
	//   43   81:areturn         
		else
			return JSONObjectInstrumentation.toString((JSONObject)jsonobject);
	//   44   82:aload_2         
	//   45   83:checkcast       #138 <Class JSONObject>
	//   46   86:invokestatic    #203 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   47   89:areturn         
	}

	abstract String getNameForLogging();

	protected void logWebLoginCompleted(String s)
	{
		String s1 = loginClient.getPendingRequest().getApplicationId();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field LoginClient loginClient>
	//    2    4:invokevirtual   #210 <Method LoginClient$Request LoginClient.getPendingRequest()>
	//    3    7:invokevirtual   #215 <Method String LoginClient$Request.getApplicationId()>
	//    4   10:astore_2        
		AppEventsLogger appeventslogger = AppEventsLogger.newLogger(((android.content.Context) (loginClient.getActivity())), s1);
	//    5   11:aload_0         
	//    6   12:getfield        #29  <Field LoginClient loginClient>
	//    7   15:invokevirtual   #219 <Method android.support.v4.app.FragmentActivity LoginClient.getActivity()>
	//    8   18:aload_2         
	//    9   19:invokestatic    #225 <Method AppEventsLogger AppEventsLogger.newLogger(android.content.Context, String)>
	//   10   22:astore_3        
		Bundle bundle = new Bundle();
	//   11   23:new             #46  <Class Bundle>
	//   12   26:dup             
	//   13   27:invokespecial   #226 <Method void Bundle()>
	//   14   30:astore          4
		bundle.putString("fb_web_login_e2e", s);
	//   15   32:aload           4
	//   16   34:ldc1            #228 <String "fb_web_login_e2e">
	//   17   36:aload_1         
	//   18   37:invokevirtual   #232 <Method void Bundle.putString(String, String)>
		bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
	//   19   40:aload           4
	//   20   42:ldc1            #234 <String "fb_web_login_switchback_time">
	//   21   44:invokestatic    #240 <Method long System.currentTimeMillis()>
	//   22   47:invokevirtual   #244 <Method void Bundle.putLong(String, long)>
		bundle.putString("app_id", s1);
	//   23   50:aload           4
	//   24   52:ldc1            #246 <String "app_id">
	//   25   54:aload_2         
	//   26   55:invokevirtual   #232 <Method void Bundle.putString(String, String)>
		appeventslogger.logSdkEvent("fb_dialogs_web_login_dialog_complete", ((Double) (null)), bundle);
	//   27   58:aload_3         
	//   28   59:ldc1            #248 <String "fb_dialogs_web_login_dialog_complete">
	//   29   61:aconst_null     
	//   30   62:aload           4
	//   31   64:invokevirtual   #252 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//   32   67:return          
	}

	boolean needsInternetPermission()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	boolean onActivityResult(int i, int j, Intent intent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	void putChallengeParam(JSONObject jsonobject)
		throws JSONException
	{
	//    0    0:return          
	}

	void setLoginClient(LoginClient loginclient)
	{
		if(loginClient == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field LoginClient loginClient>
	//*   2    4:ifnonnull       13
		{
			loginClient = loginclient;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #29  <Field LoginClient loginClient>
			return;
	//    6   12:return          
		} else
		{
			throw new FacebookException("Can't set LoginClient if it is already set.");
	//    7   13:new             #72  <Class FacebookException>
	//    8   16:dup             
	//    9   17:ldc2            #258 <String "Can't set LoginClient if it is already set.">
	//   10   20:invokespecial   #144 <Method void FacebookException(String)>
	//   11   23:athrow          
		}
	}

	abstract boolean tryAuthorize(LoginClient.Request request);

	public void writeToParcel(Parcel parcel, int i)
	{
		Utility.writeStringMapToParcel(parcel, methodLoggingExtras);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field Map methodLoggingExtras>
	//    3    5:invokestatic    #266 <Method void Utility.writeStringMapToParcel(Parcel, Map)>
	//    4    8:return          
	}

	protected LoginClient loginClient;
	Map methodLoggingExtras;
}
