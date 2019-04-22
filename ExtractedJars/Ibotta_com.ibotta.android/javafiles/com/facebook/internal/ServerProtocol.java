// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
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
	//    1    1:invokespecial   #39  <Method void Object()>
	//    2    4:return          
	}

	public static final String getDefaultAPIVersion()
	{
		return "v3.0";
	//    0    0:ldc1            #43  <String "v3.0">
	//    1    2:areturn         
	}

	public static final String getDialogAuthority()
	{
		return String.format("m.%s", new Object[] {
			FacebookSdk.getFacebookDomain()
		});
	//    0    0:ldc1            #46  <String "m.%s">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:invokestatic    #51  <Method String FacebookSdk.getFacebookDomain()>
	//    6   11:aastore         
	//    7   12:invokestatic    #55  <Method String String.format(String, Object[])>
	//    8   15:areturn         
	}

	public static final String getGraphUrlBase()
	{
		return String.format("https://graph.%s", new Object[] {
			FacebookSdk.getFacebookDomain()
		});
	//    0    0:ldc1            #58  <String "https://graph.%s">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:invokestatic    #51  <Method String FacebookSdk.getFacebookDomain()>
	//    6   11:aastore         
	//    7   12:invokestatic    #55  <Method String String.format(String, Object[])>
	//    8   15:areturn         
	}

	public static final String getGraphVideoUrlBase()
	{
		return String.format("https://graph-video.%s", new Object[] {
			FacebookSdk.getFacebookDomain()
		});
	//    0    0:ldc1            #61  <String "https://graph-video.%s">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:invokestatic    #51  <Method String FacebookSdk.getFacebookDomain()>
	//    6   11:aastore         
	//    7   12:invokestatic    #55  <Method String String.format(String, Object[])>
	//    8   15:areturn         
	}

	public static Bundle getQueryParamsForPlatformActivityIntentWebFallback(String s, int i, Bundle bundle)
	{
		Object obj = ((Object) (FacebookSdk.getApplicationSignature(FacebookSdk.getApplicationContext())));
	//    0    0:invokestatic    #69  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:invokestatic    #73  <Method String FacebookSdk.getApplicationSignature(android.content.Context)>
	//    2    6:astore          4
		if(Utility.isNullOrEmpty(((String) (obj))))
	//*   3    8:aload           4
	//*   4   10:invokestatic    #77  <Method boolean Utility.isNullOrEmpty(String)>
	//*   5   13:ifeq            18
			return null;
	//    6   16:aconst_null     
	//    7   17:areturn         
		Bundle bundle1 = new Bundle();
	//    8   18:new             #79  <Class Bundle>
	//    9   21:dup             
	//   10   22:invokespecial   #80  <Method void Bundle()>
	//   11   25:astore_3        
		bundle1.putString("android_key_hash", ((String) (obj)));
	//   12   26:aload_3         
	//   13   27:ldc1            #82  <String "android_key_hash">
	//   14   29:aload           4
	//   15   31:invokevirtual   #86  <Method void Bundle.putString(String, String)>
		bundle1.putString("app_id", FacebookSdk.getApplicationId());
	//   16   34:aload_3         
	//   17   35:ldc1            #88  <String "app_id">
	//   18   37:invokestatic    #91  <Method String FacebookSdk.getApplicationId()>
	//   19   40:invokevirtual   #86  <Method void Bundle.putString(String, String)>
		bundle1.putInt("version", i);
	//   20   43:aload_3         
	//   21   44:ldc1            #93  <String "version">
	//   22   46:iload_1         
	//   23   47:invokevirtual   #97  <Method void Bundle.putInt(String, int)>
		bundle1.putString("display", "touch");
	//   24   50:aload_3         
	//   25   51:ldc1            #99  <String "display">
	//   26   53:ldc1            #101 <String "touch">
	//   27   55:invokevirtual   #86  <Method void Bundle.putString(String, String)>
		obj = ((Object) (new Bundle()));
	//   28   58:new             #79  <Class Bundle>
	//   29   61:dup             
	//   30   62:invokespecial   #80  <Method void Bundle()>
	//   31   65:astore          4
		((Bundle) (obj)).putString("action_id", s);
	//   32   67:aload           4
	//   33   69:ldc1            #103 <String "action_id">
	//   34   71:aload_0         
	//   35   72:invokevirtual   #86  <Method void Bundle.putString(String, String)>
		s = ((String) (bundle));
	//   36   75:aload_2         
	//   37   76:astore_0        
		if(bundle == null)
	//*  38   77:aload_2         
	//*  39   78:ifnonnull       89
			s = ((String) (new Bundle()));
	//   40   81:new             #79  <Class Bundle>
	//   41   84:dup             
	//   42   85:invokespecial   #80  <Method void Bundle()>
	//   43   88:astore_0        
		try
		{
			obj = ((Object) (BundleJSONConverter.convertToJSON(((Bundle) (obj)))));
	//   44   89:aload           4
	//   45   91:invokestatic    #109 <Method JSONObject BundleJSONConverter.convertToJSON(Bundle)>
	//   46   94:astore          4
			bundle = ((Bundle) (BundleJSONConverter.convertToJSON(((Bundle) (s)))));
	//   47   96:aload_0         
	//   48   97:invokestatic    #109 <Method JSONObject BundleJSONConverter.convertToJSON(Bundle)>
	//   49  100:astore_2        
		}
	//*  50  101:aload           4
	//*  51  103:ifnull          177
	//*  52  106:aload_2         
	//*  53  107:ifnonnull       112
	//*  54  110:aconst_null     
	//*  55  111:areturn         
	//*  56  112:aload           4
	//*  57  114:instanceof      #111 <Class JSONObject>
	//*  58  117:ifne            129
	//*  59  120:aload           4
	//*  60  122:invokevirtual   #114 <Method String JSONObject.toString()>
	//*  61  125:astore_0        
	//*  62  126:goto            138
	//*  63  129:aload           4
	//*  64  131:checkcast       #111 <Class JSONObject>
	//*  65  134:invokestatic    #119 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//*  66  137:astore_0        
	//*  67  138:aload_3         
	//*  68  139:ldc1            #121 <String "bridge_args">
	//*  69  141:aload_0         
	//*  70  142:invokevirtual   #86  <Method void Bundle.putString(String, String)>
	//*  71  145:aload_2         
	//*  72  146:instanceof      #111 <Class JSONObject>
	//*  73  149:ifne            160
	//*  74  152:aload_2         
	//*  75  153:invokevirtual   #114 <Method String JSONObject.toString()>
	//*  76  156:astore_0        
	//*  77  157:goto            168
	//*  78  160:aload_2         
	//*  79  161:checkcast       #111 <Class JSONObject>
	//*  80  164:invokestatic    #119 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//*  81  167:astore_0        
	//*  82  168:aload_3         
	//*  83  169:ldc1            #123 <String "method_args">
	//*  84  171:aload_0         
	//*  85  172:invokevirtual   #86  <Method void Bundle.putString(String, String)>
	//*  86  175:aload_3         
	//*  87  176:areturn         
	//*  88  177:aconst_null     
	//*  89  178:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  90  179:astore_0        
		{
			bundle = ((Bundle) (LoggingBehavior.DEVELOPER_ERRORS));
	//   91  180:getstatic       #129 <Field LoggingBehavior LoggingBehavior.DEVELOPER_ERRORS>
	//   92  183:astore_2        
			String s1 = TAG;
	//   93  184:getstatic       #131 <Field String TAG>
	//   94  187:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   95  188:new             #133 <Class StringBuilder>
	//   96  191:dup             
	//   97  192:invokespecial   #134 <Method void StringBuilder()>
	//   98  195:astore          4
			stringbuilder.append("Error creating Url -- ");
	//   99  197:aload           4
	//  100  199:ldc1            #136 <String "Error creating Url -- ">
	//  101  201:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//  102  204:pop             
			stringbuilder.append(((Object) (s)));
	//  103  205:aload           4
	//  104  207:aload_0         
	//  105  208:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//  106  211:pop             
			Logger.log(((LoggingBehavior) (bundle)), 6, s1, stringbuilder.toString());
	//  107  212:aload_2         
	//  108  213:bipush          6
	//  109  215:aload_3         
	//  110  216:aload           4
	//  111  218:invokevirtual   #144 <Method String StringBuilder.toString()>
	//  112  221:invokestatic    #150 <Method void Logger.log(LoggingBehavior, int, String, String)>
			return null;
	//  113  224:aconst_null     
	//  114  225:areturn         
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_177;
		if(bundle == null)
			return null;
		if(!(obj instanceof JSONObject))
		{
			s = ((JSONObject) (obj)).toString();
			break MISSING_BLOCK_LABEL_138;
		}
		s = JSONObjectInstrumentation.toString((JSONObject)obj);
		bundle1.putString("bridge_args", s);
		if(!(bundle instanceof JSONObject))
		{
			s = ((JSONObject) (bundle)).toString();
			break MISSING_BLOCK_LABEL_168;
		}
		s = JSONObjectInstrumentation.toString((JSONObject)bundle);
		bundle1.putString("method_args", s);
		return bundle1;
		return null;
	}

	private static final String TAG = "com.facebook.internal.ServerProtocol";
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
	//    4    6:ldc1            #19  <String "service_disabled">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #21  <String "AndroidAuthKillSwitchException">
	//    9   13:aastore         
	//   10   14:invokestatic    #27  <Method Collection Utility.unmodifiableCollection(Object[])>
	//   11   17:putstatic       #29  <Field Collection errorsProxyAuthDisabled>
	//   12   20:iconst_2        
	//   13   21:anewarray       String[]
	//   14   24:dup             
	//   15   25:iconst_0        
	//   16   26:ldc1            #31  <String "access_denied">
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_1        
	//   20   31:ldc1            #33  <String "OAuthAccessDeniedException">
	//   21   33:aastore         
	//   22   34:invokestatic    #27  <Method Collection Utility.unmodifiableCollection(Object[])>
	//   23   37:putstatic       #35  <Field Collection errorsUserCanceled>
	//*  24   40:return          
	}
}
