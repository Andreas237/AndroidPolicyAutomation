// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//			Utility, BundleJSONConverter, Logger

public final class ServerProtocol
{

	public ServerProtocol()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method void Object()>
	//    2    4:return          
	}

	public static final String getDefaultAPIVersion()
	{
		return "v3.2";
	//    0    0:ldc1            #97  <String "v3.2">
	//    1    2:areturn         
	}

	public static final String getDialogAuthority()
	{
		return String.format("m.%s", new Object[] {
			FacebookSdk.getFacebookDomain()
		});
	//    0    0:ldc1            #8   <String "m.%s">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:invokestatic    #147 <Method String FacebookSdk.getFacebookDomain()>
	//    6   11:aastore         
	//    7   12:invokestatic    #151 <Method String String.format(String, Object[])>
	//    8   15:areturn         
	}

	public static final String getGraphUrlBase()
	{
		return String.format("https://graph.%s", new Object[] {
			FacebookSdk.getFacebookDomain()
		});
	//    0    0:ldc1            #100 <String "https://graph.%s">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:invokestatic    #147 <Method String FacebookSdk.getFacebookDomain()>
	//    6   11:aastore         
	//    7   12:invokestatic    #151 <Method String String.format(String, Object[])>
	//    8   15:areturn         
	}

	public static final String getGraphVideoUrlBase()
	{
		return String.format("https://graph-video.%s", new Object[] {
			FacebookSdk.getFacebookDomain()
		});
	//    0    0:ldc1            #103 <String "https://graph-video.%s">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:invokestatic    #147 <Method String FacebookSdk.getFacebookDomain()>
	//    6   11:aastore         
	//    7   12:invokestatic    #151 <Method String String.format(String, Object[])>
	//    8   15:areturn         
	}

	public static Bundle getQueryParamsForPlatformActivityIntentWebFallback(String s, int i, Bundle bundle)
	{
		Object obj = ((Object) (FacebookSdk.getApplicationSignature(FacebookSdk.getApplicationContext())));
	//    0    0:invokestatic    #161 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:invokestatic    #165 <Method String FacebookSdk.getApplicationSignature(android.content.Context)>
	//    2    6:astore          4
		if(Utility.isNullOrEmpty(((String) (obj))))
	//*   3    8:aload           4
	//*   4   10:invokestatic    #169 <Method boolean Utility.isNullOrEmpty(String)>
	//*   5   13:ifeq            18
			return null;
	//    6   16:aconst_null     
	//    7   17:areturn         
		Bundle bundle1 = new Bundle();
	//    8   18:new             #171 <Class Bundle>
	//    9   21:dup             
	//   10   22:invokespecial   #172 <Method void Bundle()>
	//   11   25:astore_3        
		bundle1.putString("android_key_hash", ((String) (obj)));
	//   12   26:aload_3         
	//   13   27:ldc1            #85  <String "android_key_hash">
	//   14   29:aload           4
	//   15   31:invokevirtual   #176 <Method void Bundle.putString(String, String)>
		bundle1.putString("app_id", FacebookSdk.getApplicationId());
	//   16   34:aload_3         
	//   17   35:ldc1            #17  <String "app_id">
	//   18   37:invokestatic    #179 <Method String FacebookSdk.getApplicationId()>
	//   19   40:invokevirtual   #176 <Method void Bundle.putString(String, String)>
		bundle1.putInt("version", i);
	//   20   43:aload_3         
	//   21   44:ldc1            #94  <String "version">
	//   22   46:iload_1         
	//   23   47:invokevirtual   #183 <Method void Bundle.putInt(String, int)>
		bundle1.putString("display", "touch");
	//   24   50:aload_3         
	//   25   51:ldc1            #29  <String "display">
	//   26   53:ldc1            #32  <String "touch">
	//   27   55:invokevirtual   #176 <Method void Bundle.putString(String, String)>
		obj = ((Object) (new Bundle()));
	//   28   58:new             #171 <Class Bundle>
	//   29   61:dup             
	//   30   62:invokespecial   #172 <Method void Bundle()>
	//   31   65:astore          4
		((Bundle) (obj)).putString("action_id", s);
	//   32   67:aload           4
	//   33   69:ldc1            #185 <String "action_id">
	//   34   71:aload_0         
	//   35   72:invokevirtual   #176 <Method void Bundle.putString(String, String)>
		s = ((String) (bundle));
	//   36   75:aload_2         
	//   37   76:astore_0        
		if(bundle == null)
	//*  38   77:aload_2         
	//*  39   78:ifnonnull       89
			s = ((String) (new Bundle()));
	//   40   81:new             #171 <Class Bundle>
	//   41   84:dup             
	//   42   85:invokespecial   #172 <Method void Bundle()>
	//   43   88:astore_0        
		try
		{
			bundle = ((Bundle) (BundleJSONConverter.convertToJSON(((Bundle) (obj)))));
	//   44   89:aload           4
	//   45   91:invokestatic    #191 <Method JSONObject BundleJSONConverter.convertToJSON(Bundle)>
	//   46   94:astore_2        
			s = ((String) (BundleJSONConverter.convertToJSON(((Bundle) (s)))));
	//   47   95:aload_0         
	//   48   96:invokestatic    #191 <Method JSONObject BundleJSONConverter.convertToJSON(Bundle)>
	//   49   99:astore_0        
		}
	//*  50  100:aload_2         
	//*  51  101:ifnull          132
	//*  52  104:aload_0         
	//*  53  105:ifnonnull       110
	//*  54  108:aconst_null     
	//*  55  109:areturn         
	//*  56  110:aload_3         
	//*  57  111:ldc1            #82  <String "bridge_args">
	//*  58  113:aload_2         
	//*  59  114:invokevirtual   #196 <Method String JSONObject.toString()>
	//*  60  117:invokevirtual   #176 <Method void Bundle.putString(String, String)>
	//*  61  120:aload_3         
	//*  62  121:ldc1            #88  <String "method_args">
	//*  63  123:aload_0         
	//*  64  124:invokevirtual   #196 <Method String JSONObject.toString()>
	//*  65  127:invokevirtual   #176 <Method void Bundle.putString(String, String)>
	//*  66  130:aload_3         
	//*  67  131:areturn         
	//*  68  132:aconst_null     
	//*  69  133:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  70  134:astore_0        
		{
			bundle = ((Bundle) (LoggingBehavior.DEVELOPER_ERRORS));
	//   71  135:getstatic       #202 <Field LoggingBehavior LoggingBehavior.DEVELOPER_ERRORS>
	//   72  138:astore_2        
			String s1 = TAG;
	//   73  139:getstatic       #204 <Field String TAG>
	//   74  142:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   75  143:new             #206 <Class StringBuilder>
	//   76  146:dup             
	//   77  147:invokespecial   #207 <Method void StringBuilder()>
	//   78  150:astore          4
			stringbuilder.append("Error creating Url -- ");
	//   79  152:aload           4
	//   80  154:ldc1            #209 <String "Error creating Url -- ">
	//   81  156:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   82  159:pop             
			stringbuilder.append(((Object) (s)));
	//   83  160:aload           4
	//   84  162:aload_0         
	//   85  163:invokevirtual   #216 <Method StringBuilder StringBuilder.append(Object)>
	//   86  166:pop             
			Logger.log(((LoggingBehavior) (bundle)), 6, s1, stringbuilder.toString());
	//   87  167:aload_2         
	//   88  168:bipush          6
	//   89  170:aload_3         
	//   90  171:aload           4
	//   91  173:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   92  176:invokestatic    #223 <Method void Logger.log(LoggingBehavior, int, String, String)>
			return null;
	//   93  179:aconst_null     
	//   94  180:areturn         
		}
		if(bundle == null)
			break MISSING_BLOCK_LABEL_132;
		if(s == null)
			return null;
		bundle1.putString("bridge_args", ((JSONObject) (bundle)).toString());
		bundle1.putString("method_args", ((JSONObject) (s)).toString());
		return bundle1;
		return null;
	}

	private static final String DIALOG_AUTHORITY_FORMAT = "m.%s";
	public static final String DIALOG_CANCEL_URI = "fbconnect://cancel";
	public static final String DIALOG_PARAM_ACCESS_TOKEN = "access_token";
	public static final String DIALOG_PARAM_APP_ID = "app_id";
	public static final String DIALOG_PARAM_AUTH_TYPE = "auth_type";
	public static final String DIALOG_PARAM_CLIENT_ID = "client_id";
	public static final String DIALOG_PARAM_DEFAULT_AUDIENCE = "default_audience";
	public static final String DIALOG_PARAM_DISPLAY = "display";
	public static final String DIALOG_PARAM_DISPLAY_TOUCH = "touch";
	public static final String DIALOG_PARAM_E2E = "e2e";
	public static final String DIALOG_PARAM_LEGACY_OVERRIDE = "legacy_override";
	public static final String DIALOG_PARAM_REDIRECT_URI = "redirect_uri";
	public static final String DIALOG_PARAM_RESPONSE_TYPE = "response_type";
	public static final String DIALOG_PARAM_RETURN_SCOPES = "return_scopes";
	public static final String DIALOG_PARAM_SCOPE = "scope";
	public static final String DIALOG_PARAM_SDK_VERSION = "sdk";
	public static final String DIALOG_PARAM_SSO_DEVICE = "sso";
	public static final String DIALOG_PARAM_STATE = "state";
	public static final String DIALOG_PATH = "dialog/";
	public static final String DIALOG_REDIRECT_CHROME_OS_URI = "fbconnect://chrome_os_success";
	public static final String DIALOG_REDIRECT_URI = "fbconnect://success";
	public static final String DIALOG_REREQUEST_AUTH_TYPE = "rerequest";
	public static final String DIALOG_RESPONSE_TYPE_TOKEN_AND_SIGNED_REQUEST = "token,signed_request";
	public static final String DIALOG_RETURN_SCOPES_TRUE = "true";
	public static final String FALLBACK_DIALOG_DISPLAY_VALUE_TOUCH = "touch";
	public static final String FALLBACK_DIALOG_PARAM_APP_ID = "app_id";
	public static final String FALLBACK_DIALOG_PARAM_BRIDGE_ARGS = "bridge_args";
	public static final String FALLBACK_DIALOG_PARAM_KEY_HASH = "android_key_hash";
	public static final String FALLBACK_DIALOG_PARAM_METHOD_ARGS = "method_args";
	public static final String FALLBACK_DIALOG_PARAM_METHOD_RESULTS = "method_results";
	public static final String FALLBACK_DIALOG_PARAM_VERSION = "version";
	private static final String GRAPH_API_VERSION = "v3.2";
	private static final String GRAPH_URL_FORMAT = "https://graph.%s";
	private static final String GRAPH_VIDEO_URL_FORMAT = "https://graph-video.%s";
	private static final String TAG = "com.facebook.internal.ServerProtocol";
	public static final String errorConnectionFailure = "CONNECTION_FAILURE";
	public static final Collection errorsProxyAuthDisabled = Utility.unmodifiableCollection(((Object []) (new String[] {
		"service_disabled", "AndroidAuthKillSwitchException"
	})));
	public static final Collection errorsUserCanceled = Utility.unmodifiableCollection(((Object []) (new String[] {
		"access_denied", "OAuthAccessDeniedException"
	})));

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #119 <String "service_disabled">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #121 <String "AndroidAuthKillSwitchException">
	//    9   13:aastore         
	//   10   14:invokestatic    #127 <Method Collection Utility.unmodifiableCollection(Object[])>
	//   11   17:putstatic       #129 <Field Collection errorsProxyAuthDisabled>
	//   12   20:iconst_2        
	//   13   21:anewarray       String[]
	//   14   24:dup             
	//   15   25:iconst_0        
	//   16   26:ldc1            #131 <String "access_denied">
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_1        
	//   20   31:ldc1            #133 <String "OAuthAccessDeniedException">
	//   21   33:aastore         
	//   22   34:invokestatic    #127 <Method Collection Utility.unmodifiableCollection(Object[])>
	//   23   37:putstatic       #135 <Field Collection errorsUserCanceled>
	//*  24   40:return          
	}
}
