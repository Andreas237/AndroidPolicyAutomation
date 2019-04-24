// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.content.Intent;
import android.os.*;
import android.util.Base64;
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
		if(Utility.isNullOrEmpty(s1))
	//*  16   31:aload           5
	//*  17   33:invokestatic    #59  <Method boolean Utility.isNullOrEmpty(String)>
	//*  18   36:ifeq            41
			return null;
	//   19   39:aconst_null     
	//   20   40:areturn         
		else
			return new AccessToken(s1, s, bundle.getString("com.facebook.platform.extra.USER_ID"), ((Collection) (arraylist)), ((Collection) (null)), accesstokensource, date, new Date());
	//   21   41:new             #61  <Class AccessToken>
	//   22   44:dup             
	//   23   45:aload           5
	//   24   47:aload_2         
	//   25   48:aload_0         
	//   26   49:ldc1            #63  <String "com.facebook.platform.extra.USER_ID">
	//   27   51:invokevirtual   #55  <Method String Bundle.getString(String)>
	//   28   54:aload           4
	//   29   56:aconst_null     
	//   30   57:aload_1         
	//   31   58:aload_3         
	//   32   59:new             #34  <Class Date>
	//   33   62:dup             
	//   34   63:invokespecial   #64  <Method void Date()>
	//   35   66:invokespecial   #67  <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date)>
	//   36   69:areturn         
	}

	public static AccessToken createAccessTokenFromWebBundle(Collection collection, Bundle bundle, AccessTokenSource accesstokensource, String s)
		throws FacebookException
	{
		Date date = Utility.getBundleLongAsDate(bundle, "expires_in", new Date());
	//    0    0:aload_1         
	//    1    1:ldc1            #73  <String "expires_in">
	//    2    3:new             #34  <Class Date>
	//    3    6:dup             
	//    4    7:invokespecial   #64  <Method void Date()>
	//    5   10:invokestatic    #41  <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
	//    6   13:astore          5
		String s1 = bundle.getString("access_token");
	//    7   15:aload_1         
	//    8   16:ldc1            #75  <String "access_token">
	//    9   18:invokevirtual   #55  <Method String Bundle.getString(String)>
	//   10   21:astore          6
		Object obj = ((Object) (bundle.getString("granted_scopes")));
	//   11   23:aload_1         
	//   12   24:ldc1            #77  <String "granted_scopes">
	//   13   26:invokevirtual   #55  <Method String Bundle.getString(String)>
	//   14   29:astore          4
		if(!Utility.isNullOrEmpty(((String) (obj))))
	//*  15   31:aload           4
	//*  16   33:invokestatic    #59  <Method boolean Utility.isNullOrEmpty(String)>
	//*  17   36:ifne            57
			collection = ((Collection) (new ArrayList(((Collection) (Arrays.asList(((Object []) (((String) (obj)).split(",")))))))));
	//   18   39:new             #79  <Class ArrayList>
	//   19   42:dup             
	//   20   43:aload           4
	//   21   45:ldc1            #81  <String ",">
	//   22   47:invokevirtual   #87  <Method String[] String.split(String)>
	//   23   50:invokestatic    #93  <Method java.util.List Arrays.asList(Object[])>
	//   24   53:invokespecial   #96  <Method void ArrayList(Collection)>
	//   25   56:astore_0        
		obj = ((Object) (bundle.getString("denied_scopes")));
	//   26   57:aload_1         
	//   27   58:ldc1            #98  <String "denied_scopes">
	//   28   60:invokevirtual   #55  <Method String Bundle.getString(String)>
	//   29   63:astore          4
		if(!Utility.isNullOrEmpty(((String) (obj))))
	//*  30   65:aload           4
	//*  31   67:invokestatic    #59  <Method boolean Utility.isNullOrEmpty(String)>
	//*  32   70:ifne            95
			obj = ((Object) (new ArrayList(((Collection) (Arrays.asList(((Object []) (((String) (obj)).split(",")))))))));
	//   33   73:new             #79  <Class ArrayList>
	//   34   76:dup             
	//   35   77:aload           4
	//   36   79:ldc1            #81  <String ",">
	//   37   81:invokevirtual   #87  <Method String[] String.split(String)>
	//   38   84:invokestatic    #93  <Method java.util.List Arrays.asList(Object[])>
	//   39   87:invokespecial   #96  <Method void ArrayList(Collection)>
	//   40   90:astore          4
		else
	//*  41   92:goto            98
			obj = null;
	//   42   95:aconst_null     
	//   43   96:astore          4
		if(Utility.isNullOrEmpty(s1))
	//*  44   98:aload           6
	//*  45  100:invokestatic    #59  <Method boolean Utility.isNullOrEmpty(String)>
	//*  46  103:ifeq            108
			return null;
	//   47  106:aconst_null     
	//   48  107:areturn         
		else
			return new AccessToken(s1, s, getUserIDFromSignedRequest(bundle.getString("signed_request")), collection, ((Collection) (obj)), accesstokensource, date, new Date());
	//   49  108:new             #61  <Class AccessToken>
	//   50  111:dup             
	//   51  112:aload           6
	//   52  114:aload_3         
	//   53  115:aload_1         
	//   54  116:ldc1            #100 <String "signed_request">
	//   55  118:invokevirtual   #55  <Method String Bundle.getString(String)>
	//   56  121:invokestatic    #103 <Method String getUserIDFromSignedRequest(String)>
	//   57  124:aload_0         
	//   58  125:aload           4
	//   59  127:aload_2         
	//   60  128:aload           5
	//   61  130:new             #34  <Class Date>
	//   62  133:dup             
	//   63  134:invokespecial   #64  <Method void Date()>
	//   64  137:invokespecial   #67  <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date)>
	//   65  140:areturn         
	}

	private static String getUserIDFromSignedRequest(String s)
		throws FacebookException
	{
		if(s != null && !s.isEmpty()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnull          68
	//    2    4:aload_0         
	//    3    5:invokevirtual   #114 <Method boolean String.isEmpty()>
	//    4    8:ifeq            14
	//*   5   11:goto            68
_L2:
		s = ((String) (s.split("\\.")));
	//    6   14:aload_0         
	//    7   15:ldc1            #116 <String "\\.">
	//    8   17:invokevirtual   #87  <Method String[] String.split(String)>
	//    9   20:astore_0        
		if(s.length != 2)
			break MISSING_BLOCK_LABEL_58;
	//   10   21:aload_0         
	//   11   22:arraylength     
	//   12   23:iconst_2        
	//   13   24:icmpne          58
		s = (new JSONObject(new String(Base64.decode(((String) (s[1])), 0), "UTF-8"))).getString("user_id");
	//   14   27:new             #118 <Class JSONObject>
	//   15   30:dup             
	//   16   31:new             #83  <Class String>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:iconst_1        
	//   20   37:aaload          
	//   21   38:iconst_0        
	//   22   39:invokestatic    #124 <Method byte[] Base64.decode(String, int)>
	//   23   42:ldc1            #126 <String "UTF-8">
	//   24   44:invokespecial   #129 <Method void String(byte[], String)>
	//   25   47:invokespecial   #132 <Method void JSONObject(String)>
	//   26   50:ldc1            #134 <String "user_id">
	//   27   52:invokevirtual   #135 <Method String JSONObject.getString(String)>
	//   28   55:astore_0        
		return s;
	//   29   56:aload_0         
	//   30   57:areturn         
_L4:
		throw new FacebookException("Failed to retrieve user_id from signed_request");
	//   31   58:new             #71  <Class FacebookException>
	//   32   61:dup             
	//   33   62:ldc1            #137 <String "Failed to retrieve user_id from signed_request">
	//   34   64:invokespecial   #138 <Method void FacebookException(String)>
	//   35   67:athrow          
_L1:
		throw new FacebookException("Authorization response does not contain the signed_request");
	//   36   68:new             #71  <Class FacebookException>
	//   37   71:dup             
	//   38   72:ldc1            #140 <String "Authorization response does not contain the signed_request">
	//   39   74:invokespecial   #138 <Method void FacebookException(String)>
	//   40   77:athrow          
		s;
	//   41   78:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//*  42   79:goto            58
	}

	protected void addLoggingExtra(String s, Object obj)
	{
		if(methodLoggingExtras == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Map methodLoggingExtras>
	//*   2    4:ifnonnull       18
			methodLoggingExtras = ((Map) (new HashMap()));
	//    3    7:aload_0         
	//    4    8:new             #144 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #145 <Method void HashMap()>
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
	//   17   33:invokevirtual   #149 <Method String Object.toString()>
	//   18   36:astore_2        
		map.put(((Object) (s)), obj);
	//   19   37:aload_3         
	//   20   38:aload_1         
	//   21   39:aload_2         
	//   22   40:invokeinterface #155 <Method Object Map.put(Object, Object)>
	//   23   45:pop             
	//   24   46:return          
	}

	void cancel()
	{
	//    0    0:return          
	}

	abstract String getNameForLogging();

	protected void logWebLoginCompleted(String s)
	{
		String s1 = loginClient.getPendingRequest().getApplicationId();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field LoginClient loginClient>
	//    2    4:invokevirtual   #164 <Method LoginClient$Request LoginClient.getPendingRequest()>
	//    3    7:invokevirtual   #169 <Method String LoginClient$Request.getApplicationId()>
	//    4   10:astore_2        
		AppEventsLogger appeventslogger = AppEventsLogger.newLogger(((android.content.Context) (loginClient.getActivity())), s1);
	//    5   11:aload_0         
	//    6   12:getfield        #28  <Field LoginClient loginClient>
	//    7   15:invokevirtual   #173 <Method android.support.v4.app.FragmentActivity LoginClient.getActivity()>
	//    8   18:aload_2         
	//    9   19:invokestatic    #179 <Method AppEventsLogger AppEventsLogger.newLogger(android.content.Context, String)>
	//   10   22:astore_3        
		Bundle bundle = new Bundle();
	//   11   23:new             #45  <Class Bundle>
	//   12   26:dup             
	//   13   27:invokespecial   #180 <Method void Bundle()>
	//   14   30:astore          4
		bundle.putString("fb_web_login_e2e", s);
	//   15   32:aload           4
	//   16   34:ldc1            #182 <String "fb_web_login_e2e">
	//   17   36:aload_1         
	//   18   37:invokevirtual   #186 <Method void Bundle.putString(String, String)>
		bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
	//   19   40:aload           4
	//   20   42:ldc1            #188 <String "fb_web_login_switchback_time">
	//   21   44:invokestatic    #194 <Method long System.currentTimeMillis()>
	//   22   47:invokevirtual   #198 <Method void Bundle.putLong(String, long)>
		bundle.putString("app_id", s1);
	//   23   50:aload           4
	//   24   52:ldc1            #200 <String "app_id">
	//   25   54:aload_2         
	//   26   55:invokevirtual   #186 <Method void Bundle.putString(String, String)>
		appeventslogger.logSdkEvent("fb_dialogs_web_login_dialog_complete", ((Double) (null)), bundle);
	//   27   58:aload_3         
	//   28   59:ldc1            #202 <String "fb_dialogs_web_login_dialog_complete">
	//   29   61:aconst_null     
	//   30   62:aload           4
	//   31   64:invokevirtual   #206 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
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

	void setLoginClient(LoginClient loginclient)
	{
		if(loginClient != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field LoginClient loginClient>
	//*   2    4:ifnull          17
		{
			throw new FacebookException("Can't set LoginClient if it is already set.");
	//    3    7:new             #71  <Class FacebookException>
	//    4   10:dup             
	//    5   11:ldc1            #212 <String "Can't set LoginClient if it is already set.">
	//    6   13:invokespecial   #138 <Method void FacebookException(String)>
	//    7   16:athrow          
		} else
		{
			loginClient = loginclient;
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:putfield        #28  <Field LoginClient loginClient>
			return;
	//   11   22:return          
		}
	}

	abstract boolean tryAuthorize(LoginClient.Request request);

	public void writeToParcel(Parcel parcel, int i)
	{
		Utility.writeStringMapToParcel(parcel, methodLoggingExtras);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field Map methodLoggingExtras>
	//    3    5:invokestatic    #220 <Method void Utility.writeStringMapToParcel(Parcel, Map)>
	//    4    8:return          
	}

	protected LoginClient loginClient;
	Map methodLoggingExtras;
}
