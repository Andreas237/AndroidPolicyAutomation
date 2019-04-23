// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.*;
import com.facebook.internal.*;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

static final class AppEventsLogger$4
	implements Runnable
{

	public void run()
	{
		Object obj1 = ((Object) (AppEventsLogger.getUserID()));
	//    0    0:invokestatic    #35  <Method String AppEventsLogger.getUserID()>
	//    1    3:astore_2        
		if(obj1 != null && !((String) (obj1)).isEmpty())
	//*   2    4:aload_2         
	//*   3    5:ifnull          169
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #41  <Method boolean String.isEmpty()>
	//*   6   12:ifeq            18
	//*   7   15:goto            169
		{
			Object obj = ((Object) (new Bundle()));
	//    8   18:new             #43  <Class Bundle>
	//    9   21:dup             
	//   10   22:invokespecial   #44  <Method void Bundle()>
	//   11   25:astore_1        
			((Bundle) (obj)).putString("user_unique_id", ((String) (obj1)));
	//   12   26:aload_1         
	//   13   27:ldc1            #46  <String "user_unique_id">
	//   14   29:aload_2         
	//   15   30:invokevirtual   #50  <Method void Bundle.putString(String, String)>
			((Bundle) (obj)).putBundle("custom_data", val$parameters);
	//   16   33:aload_1         
	//   17   34:ldc1            #52  <String "custom_data">
	//   18   36:aload_0         
	//   19   37:getfield        #20  <Field Bundle val$parameters>
	//   20   40:invokevirtual   #56  <Method void Bundle.putBundle(String, Bundle)>
			obj1 = ((Object) (AttributionIdentifiers.getAttributionIdentifiers(FacebookSdk.getApplicationContext())));
	//   21   43:invokestatic    #62  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   22   46:invokestatic    #68  <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(android.content.Context)>
	//   23   49:astore_2        
			if(obj1 != null && ((AttributionIdentifiers) (obj1)).getAndroidAdvertiserId() != null)
	//*  24   50:aload_2         
	//*  25   51:ifnull          71
	//*  26   54:aload_2         
	//*  27   55:invokevirtual   #71  <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//*  28   58:ifnull          71
				((Bundle) (obj)).putString("advertiser_id", ((AttributionIdentifiers) (obj1)).getAndroidAdvertiserId());
	//   29   61:aload_1         
	//   30   62:ldc1            #73  <String "advertiser_id">
	//   31   64:aload_2         
	//   32   65:invokevirtual   #71  <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//   33   68:invokevirtual   #50  <Method void Bundle.putString(String, String)>
			obj1 = ((Object) (new Bundle()));
	//   34   71:new             #43  <Class Bundle>
	//   35   74:dup             
	//   36   75:invokespecial   #44  <Method void Bundle()>
	//   37   78:astore_2        
			try
			{
				obj = ((Object) (BundleJSONConverter.convertToJSON(((Bundle) (obj)))));
	//   38   79:aload_1         
	//   39   80:invokestatic    #79  <Method org.json.JSONObject BundleJSONConverter.convertToJSON(Bundle)>
	//   40   83:astore_1        
				JSONArray jsonarray = new JSONArray();
	//   41   84:new             #81  <Class JSONArray>
	//   42   87:dup             
	//   43   88:invokespecial   #82  <Method void JSONArray()>
	//   44   91:astore_3        
				jsonarray.put(obj);
	//   45   92:aload_3         
	//   46   93:aload_1         
	//   47   94:invokevirtual   #86  <Method JSONArray JSONArray.put(Object)>
	//   48   97:pop             
				((Bundle) (obj1)).putString("data", jsonarray.toString());
	//   49   98:aload_2         
	//   50   99:ldc1            #88  <String "data">
	//   51  101:aload_3         
	//   52  102:invokevirtual   #91  <Method String JSONArray.toString()>
	//   53  105:invokevirtual   #50  <Method void Bundle.putString(String, String)>
			}
	//*  54  108:new             #93  <Class GraphRequest>
	//*  55  111:dup             
	//*  56  112:invokestatic    #99  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//*  57  115:getstatic       #105 <Field Locale Locale.US>
	//*  58  118:ldc1            #107 <String "%s/user_properties">
	//*  59  120:iconst_1        
	//*  60  121:anewarray       Object[]
	//*  61  124:dup             
	//*  62  125:iconst_0        
	//*  63  126:aload_0         
	//*  64  127:getfield        #22  <Field String val$applicationID>
	//*  65  130:aastore         
	//*  66  131:invokestatic    #111 <Method String String.format(Locale, String, Object[])>
	//*  67  134:aload_2         
	//*  68  135:getstatic       #117 <Field HttpMethod HttpMethod.POST>
	//*  69  138:aload_0         
	//*  70  139:getfield        #24  <Field com.facebook.GraphRequest$Callback val$callback>
	//*  71  142:invokespecial   #120 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//*  72  145:astore_1        
	//*  73  146:aload_1         
	//*  74  147:iconst_1        
	//*  75  148:invokevirtual   #124 <Method void GraphRequest.setSkipClientToken(boolean)>
	//*  76  151:aload_1         
	//*  77  152:invokevirtual   #128 <Method com.facebook.GraphRequestAsyncTask GraphRequest.executeAsync()>
	//*  78  155:pop             
	//*  79  156:return          
			catch(JSONException jsonexception)
	//*  80  157:astore_1        
			{
				throw new FacebookException("Failed to construct request", ((Throwable) (jsonexception)));
	//   81  158:new             #130 <Class FacebookException>
	//   82  161:dup             
	//   83  162:ldc1            #132 <String "Failed to construct request">
	//   84  164:aload_1         
	//   85  165:invokespecial   #135 <Method void FacebookException(String, Throwable)>
	//   86  168:athrow          
			}
			obj = ((Object) (new GraphRequest(AccessToken.getCurrentAccessToken(), String.format(Locale.US, "%s/user_properties", new Object[] {
				val$applicationID
			}), ((Bundle) (obj1)), HttpMethod.POST, val$callback)));
			((GraphRequest) (obj)).setSkipClientToken(true);
			((GraphRequest) (obj)).executeAsync();
			return;
		} else
		{
			Logger.log(LoggingBehavior.APP_EVENTS, AppEventsLogger.access$200(), "AppEventsLogger userID cannot be null or empty");
	//   87  169:getstatic       #141 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   88  172:invokestatic    #144 <Method String AppEventsLogger.access$200()>
	//   89  175:ldc1            #146 <String "AppEventsLogger userID cannot be null or empty">
	//   90  177:invokestatic    #152 <Method void Logger.log(LoggingBehavior, String, String)>
			return;
	//   91  180:return          
		}
	}

	final String val$applicationID;
	final com.facebook.ack val$callback;
	final Bundle val$parameters;

	AppEventsLogger$4(Bundle bundle, String s, com.facebook.ack ack)
	{
		val$parameters = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Bundle val$parameters>
		val$applicationID = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field String val$applicationID>
		val$callback = ack;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field com.facebook.GraphRequest$Callback val$callback>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
