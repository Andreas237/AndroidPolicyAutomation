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
	//    1    1:invokespecial   #16  <Method void Object()>
		methodLoggingExtras = Utility.readStringMapFromParcel(parcel);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #22  <Method Map Utility.readStringMapFromParcel(Parcel)>
	//    5    9:putfield        #24  <Field Map methodLoggingExtras>
	//    6   12:return          
	}

	LoginMethodHandler(LoginClient loginclient)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		loginClient = loginclient;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field LoginClient loginClient>
	//    5    9:return          
	}

	static AccessToken createAccessTokenFromNativeLogin(Bundle bundle, AccessTokenSource accesstokensource, String s)
	{
		Date date = Utility.getBundleLongAsDate(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
	//    0    0:aload_0         
	//    1    1:ldc1            #32  <String "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH">
	//    2    3:new             #34  <Class Date>
	//    3    6:dup             
	//    4    7:lconst_0        
	//    5    8:invokespecial   #37  <Method void Date(long)>
	//    6   11:invokestatic    #41  <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
	//    7   14:astore_3        
		ArrayList arraylist = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
	//    8   15:aload_0         
	//    9   16:ldc1            #43  <String "com.facebook.platform.extra.PERMISSIONS">
	//   10   18:invokevirtual   #49  <Method ArrayList Bundle.getStringArrayList(String)>
	//   11   21:astore          4
		String s1 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
	//   12   23:aload_0         
	//   13   24:ldc1            #51  <String "com.facebook.platform.extra.ACCESS_TOKEN">
	//   14   26:invokevirtual   #55  <Method String Bundle.getString(String)>
	//   15   29:astore          5
		Date date1 = Utility.getBundleLongAsDate(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
	//   16   31:aload_0         
	//   17   32:ldc1            #57  <String "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME">
	//   18   34:new             #34  <Class Date>
	//   19   37:dup             
	//   20   38:lconst_0        
	//   21   39:invokespecial   #37  <Method void Date(long)>
	//   22   42:invokestatic    #41  <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
	//   23   45:astore          6
		if(Utility.isNullOrEmpty(s1))
	//*  24   47:aload           5
	//*  25   49:invokestatic    #61  <Method boolean Utility.isNullOrEmpty(String)>
	//*  26   52:ifeq            57
			return null;
	//   27   55:aconst_null     
	//   28   56:areturn         
		else
			return new AccessToken(s1, s, bundle.getString("com.facebook.platform.extra.USER_ID"), ((Collection) (arraylist)), ((Collection) (null)), accesstokensource, date, new Date(), date1);
	//   29   57:new             #63  <Class AccessToken>
	//   30   60:dup             
	//   31   61:aload           5
	//   32   63:aload_2         
	//   33   64:aload_0         
	//   34   65:ldc1            #65  <String "com.facebook.platform.extra.USER_ID">
	//   35   67:invokevirtual   #55  <Method String Bundle.getString(String)>
	//   36   70:aload           4
	//   37   72:aconst_null     
	//   38   73:aload_1         
	//   39   74:aload_3         
	//   40   75:new             #34  <Class Date>
	//   41   78:dup             
	//   42   79:invokespecial   #66  <Method void Date()>
	//   43   82:aload           6
	//   44   84:invokespecial   #69  <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date, Date)>
	//   45   87:areturn         
	}

	public static AccessToken createAccessTokenFromWebBundle(Collection collection, Bundle bundle, AccessTokenSource accesstokensource, String s)
		throws FacebookException
	{
		Date date = Utility.getBundleLongAsDate(bundle, "expires_in", new Date());
	//    0    0:aload_1         
	//    1    1:ldc1            #75  <String "expires_in">
	//    2    3:new             #34  <Class Date>
	//    3    6:dup             
	//    4    7:invokespecial   #66  <Method void Date()>
	//    5   10:invokestatic    #41  <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
	//    6   13:astore          5
		String s1 = bundle.getString("access_token");
	//    7   15:aload_1         
	//    8   16:ldc1            #77  <String "access_token">
	//    9   18:invokevirtual   #55  <Method String Bundle.getString(String)>
	//   10   21:astore          6
		Date date1 = Utility.getBundleLongAsDate(bundle, "data_access_expiration_time", new Date(0L));
	//   11   23:aload_1         
	//   12   24:ldc1            #79  <String "data_access_expiration_time">
	//   13   26:new             #34  <Class Date>
	//   14   29:dup             
	//   15   30:lconst_0        
	//   16   31:invokespecial   #37  <Method void Date(long)>
	//   17   34:invokestatic    #41  <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
	//   18   37:astore          7
		Object obj = ((Object) (bundle.getString("granted_scopes")));
	//   19   39:aload_1         
	//   20   40:ldc1            #81  <String "granted_scopes">
	//   21   42:invokevirtual   #55  <Method String Bundle.getString(String)>
	//   22   45:astore          4
		if(!Utility.isNullOrEmpty(((String) (obj))))
	//*  23   47:aload           4
	//*  24   49:invokestatic    #61  <Method boolean Utility.isNullOrEmpty(String)>
	//*  25   52:ifne            76
			collection = ((Collection) (new ArrayList(((Collection) (Arrays.asList(((Object []) (((String) (obj)).split(",")))))))));
	//   26   55:new             #83  <Class ArrayList>
	//   27   58:dup             
	//   28   59:aload           4
	//   29   61:ldc1            #85  <String ",">
	//   30   63:invokevirtual   #91  <Method String[] String.split(String)>
	//   31   66:invokestatic    #97  <Method java.util.List Arrays.asList(Object[])>
	//   32   69:invokespecial   #100 <Method void ArrayList(Collection)>
	//   33   72:astore_0        
	//*  34   73:goto            76
		obj = ((Object) (bundle.getString("denied_scopes")));
	//   35   76:aload_1         
	//   36   77:ldc1            #102 <String "denied_scopes">
	//   37   79:invokevirtual   #55  <Method String Bundle.getString(String)>
	//   38   82:astore          4
		if(!Utility.isNullOrEmpty(((String) (obj))))
	//*  39   84:aload           4
	//*  40   86:invokestatic    #61  <Method boolean Utility.isNullOrEmpty(String)>
	//*  41   89:ifne            114
			obj = ((Object) (new ArrayList(((Collection) (Arrays.asList(((Object []) (((String) (obj)).split(",")))))))));
	//   42   92:new             #83  <Class ArrayList>
	//   43   95:dup             
	//   44   96:aload           4
	//   45   98:ldc1            #85  <String ",">
	//   46  100:invokevirtual   #91  <Method String[] String.split(String)>
	//   47  103:invokestatic    #97  <Method java.util.List Arrays.asList(Object[])>
	//   48  106:invokespecial   #100 <Method void ArrayList(Collection)>
	//   49  109:astore          4
		else
	//*  50  111:goto            117
			obj = null;
	//   51  114:aconst_null     
	//   52  115:astore          4
		if(Utility.isNullOrEmpty(s1))
	//*  53  117:aload           6
	//*  54  119:invokestatic    #61  <Method boolean Utility.isNullOrEmpty(String)>
	//*  55  122:ifeq            127
			return null;
	//   56  125:aconst_null     
	//   57  126:areturn         
		else
			return new AccessToken(s1, s, getUserIDFromSignedRequest(bundle.getString("signed_request")), collection, ((Collection) (obj)), accesstokensource, date, new Date(), date1);
	//   58  127:new             #63  <Class AccessToken>
	//   59  130:dup             
	//   60  131:aload           6
	//   61  133:aload_3         
	//   62  134:aload_1         
	//   63  135:ldc1            #104 <String "signed_request">
	//   64  137:invokevirtual   #55  <Method String Bundle.getString(String)>
	//   65  140:invokestatic    #107 <Method String getUserIDFromSignedRequest(String)>
	//   66  143:aload_0         
	//   67  144:aload           4
	//   68  146:aload_2         
	//   69  147:aload           5
	//   70  149:new             #34  <Class Date>
	//   71  152:dup             
	//   72  153:invokespecial   #66  <Method void Date()>
	//   73  156:aload           7
	//   74  158:invokespecial   #69  <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date, Date)>
	//   75  161:areturn         
	}

	static String getUserIDFromSignedRequest(String s)
		throws FacebookException
	{
		if(s == null || s.isEmpty()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnull          65
	//    2    4:aload_0         
	//    3    5:invokevirtual   #118 <Method boolean String.isEmpty()>
	//    4    8:ifne            65
_L1:
		s = ((String) (s.split("\\.")));
	//    5   11:aload_0         
	//    6   12:ldc1            #120 <String "\\.">
	//    7   14:invokevirtual   #91  <Method String[] String.split(String)>
	//    8   17:astore_0        
		if(s.length != 2)
			break MISSING_BLOCK_LABEL_55;
	//    9   18:aload_0         
	//   10   19:arraylength     
	//   11   20:iconst_2        
	//   12   21:icmpne          55
		s = (new JSONObject(new String(Base64.decode(((String) (s[1])), 0), "UTF-8"))).getString("user_id");
	//   13   24:new             #122 <Class JSONObject>
	//   14   27:dup             
	//   15   28:new             #87  <Class String>
	//   16   31:dup             
	//   17   32:aload_0         
	//   18   33:iconst_1        
	//   19   34:aaload          
	//   20   35:iconst_0        
	//   21   36:invokestatic    #128 <Method byte[] Base64.decode(String, int)>
	//   22   39:ldc1            #130 <String "UTF-8">
	//   23   41:invokespecial   #133 <Method void String(byte[], String)>
	//   24   44:invokespecial   #136 <Method void JSONObject(String)>
	//   25   47:ldc1            #138 <String "user_id">
	//   26   49:invokevirtual   #139 <Method String JSONObject.getString(String)>
	//   27   52:astore_0        
		return s;
	//   28   53:aload_0         
	//   29   54:areturn         
_L4:
		throw new FacebookException("Failed to retrieve user_id from signed_request");
	//   30   55:new             #73  <Class FacebookException>
	//   31   58:dup             
	//   32   59:ldc1            #141 <String "Failed to retrieve user_id from signed_request">
	//   33   61:invokespecial   #142 <Method void FacebookException(String)>
	//   34   64:athrow          
_L2:
		throw new FacebookException("Authorization response does not contain the signed_request");
	//   35   65:new             #73  <Class FacebookException>
	//   36   68:dup             
	//   37   69:ldc1            #144 <String "Authorization response does not contain the signed_request">
	//   38   71:invokespecial   #142 <Method void FacebookException(String)>
	//   39   74:athrow          
		s;
	//   40   75:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//*  41   76:goto            55
	}

	protected void addLoggingExtra(String s, Object obj)
	{
		if(methodLoggingExtras == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Map methodLoggingExtras>
	//*   2    4:ifnonnull       18
			methodLoggingExtras = ((Map) (new HashMap()));
	//    3    7:aload_0         
	//    4    8:new             #148 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #149 <Method void HashMap()>
	//    7   15:putfield        #24  <Field Map methodLoggingExtras>
		Map map = methodLoggingExtras;
	//    8   18:aload_0         
	//    9   19:getfield        #24  <Field Map methodLoggingExtras>
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
	//   17   33:invokevirtual   #153 <Method String Object.toString()>
	//   18   36:astore_2        
		map.put(((Object) (s)), obj);
	//   19   37:aload_3         
	//   20   38:aload_1         
	//   21   39:aload_2         
	//   22   40:invokeinterface #159 <Method Object Map.put(Object, Object)>
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
	//    0    0:new             #122 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #162 <Method void JSONObject()>
	//    3    7:astore_2        
		try
		{
			jsonobject.put("0_auth_logger_id", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc1            #164 <String "0_auth_logger_id">
	//    6   11:aload_1         
	//    7   12:invokevirtual   #167 <Method JSONObject JSONObject.put(String, Object)>
	//    8   15:pop             
			jsonobject.put("3_method", ((Object) (getNameForLogging())));
	//    9   16:aload_2         
	//   10   17:ldc1            #169 <String "3_method">
	//   11   19:aload_0         
	//   12   20:invokevirtual   #172 <Method String getNameForLogging()>
	//   13   23:invokevirtual   #167 <Method JSONObject JSONObject.put(String, Object)>
	//   14   26:pop             
			putChallengeParam(jsonobject);
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:invokevirtual   #176 <Method void putChallengeParam(JSONObject)>
		}
	//*  18   32:goto            70
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  19   35:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   20   36:new             #178 <Class StringBuilder>
	//   21   39:dup             
	//   22   40:invokespecial   #179 <Method void StringBuilder()>
	//   23   43:astore_3        
			stringbuilder.append("Error creating client state json: ");
	//   24   44:aload_3         
	//   25   45:ldc1            #181 <String "Error creating client state json: ">
	//   26   47:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
			stringbuilder.append(((JSONException) (s)).getMessage());
	//   28   51:aload_3         
	//   29   52:aload_1         
	//   30   53:invokevirtual   #188 <Method String JSONException.getMessage()>
	//   31   56:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
			Log.w("LoginMethodHandler", stringbuilder.toString());
	//   33   60:ldc1            #190 <String "LoginMethodHandler">
	//   34   62:aload_3         
	//   35   63:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   36   66:invokestatic    #197 <Method int Log.w(String, String)>
	//   37   69:pop             
		}
		return jsonobject.toString();
	//   38   70:aload_2         
	//   39   71:invokevirtual   #198 <Method String JSONObject.toString()>
	//   40   74:areturn         
	}

	abstract String getNameForLogging();

	protected void logWebLoginCompleted(String s)
	{
		String s1 = loginClient.getPendingRequest().getApplicationId();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field LoginClient loginClient>
	//    2    4:invokevirtual   #205 <Method LoginClient$Request LoginClient.getPendingRequest()>
	//    3    7:invokevirtual   #210 <Method String LoginClient$Request.getApplicationId()>
	//    4   10:astore_2        
		AppEventsLogger appeventslogger = AppEventsLogger.newLogger(((android.content.Context) (loginClient.getActivity())), s1);
	//    5   11:aload_0         
	//    6   12:getfield        #28  <Field LoginClient loginClient>
	//    7   15:invokevirtual   #214 <Method android.support.v4.app.FragmentActivity LoginClient.getActivity()>
	//    8   18:aload_2         
	//    9   19:invokestatic    #220 <Method AppEventsLogger AppEventsLogger.newLogger(android.content.Context, String)>
	//   10   22:astore_3        
		Bundle bundle = new Bundle();
	//   11   23:new             #45  <Class Bundle>
	//   12   26:dup             
	//   13   27:invokespecial   #221 <Method void Bundle()>
	//   14   30:astore          4
		bundle.putString("fb_web_login_e2e", s);
	//   15   32:aload           4
	//   16   34:ldc1            #223 <String "fb_web_login_e2e">
	//   17   36:aload_1         
	//   18   37:invokevirtual   #227 <Method void Bundle.putString(String, String)>
		bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
	//   19   40:aload           4
	//   20   42:ldc1            #229 <String "fb_web_login_switchback_time">
	//   21   44:invokestatic    #235 <Method long System.currentTimeMillis()>
	//   22   47:invokevirtual   #239 <Method void Bundle.putLong(String, long)>
		bundle.putString("app_id", s1);
	//   23   50:aload           4
	//   24   52:ldc1            #241 <String "app_id">
	//   25   54:aload_2         
	//   26   55:invokevirtual   #227 <Method void Bundle.putString(String, String)>
		appeventslogger.logSdkEvent("fb_dialogs_web_login_dialog_complete", ((Double) (null)), bundle);
	//   27   58:aload_3         
	//   28   59:ldc1            #243 <String "fb_dialogs_web_login_dialog_complete">
	//   29   61:aconst_null     
	//   30   62:aload           4
	//   31   64:invokevirtual   #247 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
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
	//*   1    1:getfield        #28  <Field LoginClient loginClient>
	//*   2    4:ifnonnull       13
		{
			loginClient = loginclient;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #28  <Field LoginClient loginClient>
			return;
	//    6   12:return          
		} else
		{
			throw new FacebookException("Can't set LoginClient if it is already set.");
	//    7   13:new             #73  <Class FacebookException>
	//    8   16:dup             
	//    9   17:ldc1            #253 <String "Can't set LoginClient if it is already set.">
	//   10   19:invokespecial   #142 <Method void FacebookException(String)>
	//   11   22:athrow          
		}
	}

	abstract boolean tryAuthorize(LoginClient.Request request);

	public void writeToParcel(Parcel parcel, int i)
	{
		Utility.writeStringMapToParcel(parcel, methodLoggingExtras);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field Map methodLoggingExtras>
	//    3    5:invokestatic    #261 <Method void Utility.writeStringMapToParcel(Parcel, Map)>
	//    4    8:return          
	}

	protected LoginClient loginClient;
	Map methodLoggingExtras;
}
