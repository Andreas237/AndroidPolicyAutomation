// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import io.radar.sdk.config.ConfigRepository;
import io.radar.sdk.internal.RadarLogger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

// Referenced classes of package io.radar.sdk.api:
//			ApiService, ApiClientRepository

private final class ApiService$FacebookPlacesTask extends AsyncTask
{

	public volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Location[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #77  <Class Location[]>
	//    3    5:invokevirtual   #79  <Method String doInBackground(Location[])>
	//    4    8:areturn         
	}

	protected transient String doInBackground(Location alocation[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (alocation)), "params");
	//    0    0:aload_1         
	//    1    1:ldc1            #83  <String "params">
	//    2    3:invokestatic    #60  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		try
		{
			alocation = ((Location []) (handleFacebookResponse(getPlaces((Location)ArraysKt.first(((Object []) (alocation)))))));
	//    3    6:aload_0         
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:invokestatic    #88  <Method Object ArraysKt.first(Object[])>
	//    7   12:checkcast       #90  <Class Location>
	//    8   15:invokevirtual   #93  <Method HttpURLConnection getPlaces(Location)>
	//    9   18:invokevirtual   #96  <Method String handleFacebookResponse(HttpURLConnection)>
	//   10   21:astore_1        
		}
	//*  11   22:aload_1         
	//*  12   23:areturn         
	//*  13   24:aconst_null     
	//*  14   25:areturn         
		// Misplaced declaration of an exception variable
		catch(Location alocation[])
		{
			return null;
		}
		return ((String) (alocation));
	//*  15   26:astore_1        
	//*  16   27:goto            24
	}

	public final Function1 getCallback()
	{
		return callback;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Function1 callback>
	//    2    4:areturn         
	}

	public final String getFbAccessToken()
	{
		return fbAccessToken;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field String fbAccessToken>
	//    2    4:areturn         
	}

	public final HttpURLConnection getPlaces(Location location)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (location)), "location");
	//    0    0:aload_1         
	//    1    1:ldc1            #99  <String "location">
	//    2    3:invokestatic    #60  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj1 = ((Object) (ApiService.access$getConfigRepository$p(ApiService.this).getFacebookApiVersion$sdk_release()));
	//    3    6:aload_0         
	//    4    7:getfield        #63  <Field ApiService this$0>
	//    5   10:invokestatic    #103 <Method ConfigRepository ApiService.access$getConfigRepository$p(ApiService)>
	//    6   13:invokevirtual   #108 <Method String ConfigRepository.getFacebookApiVersion$sdk_release()>
	//    7   16:astore          4
		Object obj = ((Object) (ApiService.access$getConfigRepository$p(ApiService.this).getFacebookPlacesFields$sdk_release()));
	//    8   18:aload_0         
	//    9   19:getfield        #63  <Field ApiService this$0>
	//   10   22:invokestatic    #103 <Method ConfigRepository ApiService.access$getConfigRepository$p(ApiService)>
	//   11   25:invokevirtual   #111 <Method String ConfigRepository.getFacebookPlacesFields$sdk_release()>
	//   12   28:astore_3        
		if(obj == null)
	//*  13   29:aload_3         
	//*  14   30:ifnull          36
	//*  15   33:goto            39
			obj = "confidence_level,category_list,website,name,single_line_address,location,checkins";
	//   16   36:ldc1            #113 <String "confidence_level,category_list,website,name,single_line_address,location,checkins">
	//   17   38:astore_3        
		JSONObject jsonobject = new JSONObject();
	//   18   39:new             #115 <Class JSONObject>
	//   19   42:dup             
	//   20   43:invokespecial   #116 <Method void JSONObject()>
	//   21   46:astore          5
		jsonobject.put("latitude", location.getLatitude());
	//   22   48:aload           5
	//   23   50:ldc1            #118 <String "latitude">
	//   24   52:aload_1         
	//   25   53:invokevirtual   #122 <Method double Location.getLatitude()>
	//   26   56:invokevirtual   #126 <Method JSONObject JSONObject.put(String, double)>
	//   27   59:pop             
		jsonobject.put("longitude", location.getLongitude());
	//   28   60:aload           5
	//   29   62:ldc1            #128 <String "longitude">
	//   30   64:aload_1         
	//   31   65:invokevirtual   #131 <Method double Location.getLongitude()>
	//   32   68:invokevirtual   #126 <Method JSONObject JSONObject.put(String, double)>
	//   33   71:pop             
		jsonobject.put("accuracy", ((Object) (Float.valueOf(location.getAccuracy()))));
	//   34   72:aload           5
	//   35   74:ldc1            #133 <String "accuracy">
	//   36   76:aload_1         
	//   37   77:invokevirtual   #137 <Method float Location.getAccuracy()>
	//   38   80:invokestatic    #143 <Method Float Float.valueOf(float)>
	//   39   83:invokevirtual   #146 <Method JSONObject JSONObject.put(String, Object)>
	//   40   86:pop             
		location = ((Location) (Uri.parse(ApiService.access$getApiRepository$p(ApiService.this).getFacebookHost$sdk_release()).buildUpon()));
	//   41   87:aload_0         
	//   42   88:getfield        #63  <Field ApiService this$0>
	//   43   91:invokestatic    #150 <Method ApiClientRepository ApiService.access$getApiRepository$p(ApiService)>
	//   44   94:invokevirtual   #155 <Method String ApiClientRepository.getFacebookHost$sdk_release()>
	//   45   97:invokestatic    #161 <Method Uri Uri.parse(String)>
	//   46  100:invokevirtual   #165 <Method android.net.Uri$Builder Uri.buildUpon()>
	//   47  103:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   48  104:new             #167 <Class StringBuilder>
	//   49  107:dup             
	//   50  108:invokespecial   #168 <Method void StringBuilder()>
	//   51  111:astore          6
		stringbuilder.append('v');
	//   52  113:aload           6
	//   53  115:bipush          118
	//   54  117:invokevirtual   #172 <Method StringBuilder StringBuilder.append(char)>
	//   55  120:pop             
		stringbuilder.append(((String) (obj1)));
	//   56  121:aload           6
	//   57  123:aload           4
	//   58  125:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   59  128:pop             
		stringbuilder.append("/current_place/results");
	//   60  129:aload           6
	//   61  131:ldc1            #177 <String "/current_place/results">
	//   62  133:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   63  136:pop             
		location = ((Location) (new URL(((android.net.Uri.Builder) (location)).appendEncodedPath(stringbuilder.toString()).appendQueryParameter("coordinates", jsonobject.toString()).appendQueryParameter("summary", "tracking").appendQueryParameter("limit", "10").appendQueryParameter("fields", ((String) (obj))).appendQueryParameter("access_token", fbAccessToken).build().toString())));
	//   64  137:new             #179 <Class URL>
	//   65  140:dup             
	//   66  141:aload_1         
	//   67  142:aload           6
	//   68  144:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   69  147:invokevirtual   #188 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
	//   70  150:ldc1            #190 <String "coordinates">
	//   71  152:aload           5
	//   72  154:invokevirtual   #191 <Method String JSONObject.toString()>
	//   73  157:invokevirtual   #195 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   74  160:ldc1            #197 <String "summary">
	//   75  162:ldc1            #199 <String "tracking">
	//   76  164:invokevirtual   #195 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   77  167:ldc1            #201 <String "limit">
	//   78  169:ldc1            #203 <String "10">
	//   79  171:invokevirtual   #195 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   80  174:ldc1            #205 <String "fields">
	//   81  176:aload_3         
	//   82  177:invokevirtual   #195 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   83  180:ldc1            #207 <String "access_token">
	//   84  182:aload_0         
	//   85  183:getfield        #68  <Field String fbAccessToken>
	//   86  186:invokevirtual   #195 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   87  189:invokevirtual   #211 <Method Uri android.net.Uri$Builder.build()>
	//   88  192:invokevirtual   #212 <Method String Uri.toString()>
	//   89  195:invokespecial   #215 <Method void URL(String)>
	//   90  198:astore_1        
		obj = ((Object) (RadarLogger.INSTANCE));
	//   91  199:getstatic       #221 <Field RadarLogger RadarLogger.INSTANCE>
	//   92  202:astore_3        
		obj1 = ((Object) (new StringBuilder()));
	//   93  203:new             #167 <Class StringBuilder>
	//   94  206:dup             
	//   95  207:invokespecial   #168 <Method void StringBuilder()>
	//   96  210:astore          4
		((StringBuilder) (obj1)).append("Sending places request: ");
	//   97  212:aload           4
	//   98  214:ldc1            #223 <String "Sending places request: ">
	//   99  216:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//  100  219:pop             
		((StringBuilder) (obj1)).append(((Object) (location)));
	//  101  220:aload           4
	//  102  222:aload_1         
	//  103  223:invokevirtual   #226 <Method StringBuilder StringBuilder.append(Object)>
	//  104  226:pop             
		RadarLogger.v$default(((RadarLogger) (obj)), ((StringBuilder) (obj1)).toString(), ((Throwable) (null)), 2, ((Object) (null)));
	//  105  227:aload_3         
	//  106  228:aload           4
	//  107  230:invokevirtual   #182 <Method String StringBuilder.toString()>
	//  108  233:aconst_null     
	//  109  234:iconst_2        
	//  110  235:aconst_null     
	//  111  236:invokestatic    #230 <Method void RadarLogger.v$default(RadarLogger, String, Throwable, int, Object)>
		location = ((Location) (((URL) (location)).openConnection()));
	//  112  239:aload_1         
	//  113  240:invokevirtual   #234 <Method java.net.URLConnection URL.openConnection()>
	//  114  243:astore_1        
		if(location != null)
	//* 115  244:aload_1         
	//* 116  245:ifnull          270
		{
			location = ((Location) ((HttpURLConnection)location));
	//  117  248:aload_1         
	//  118  249:checkcast       #236 <Class HttpURLConnection>
	//  119  252:astore_1        
			int i = (int)5000L;
	//  120  253:ldc2w           #237 <Long 5000L>
	//  121  256:l2i             
	//  122  257:istore_2        
			((HttpURLConnection) (location)).setConnectTimeout(i);
	//  123  258:aload_1         
	//  124  259:iload_2         
	//  125  260:invokevirtual   #242 <Method void HttpURLConnection.setConnectTimeout(int)>
			((HttpURLConnection) (location)).setReadTimeout(i);
	//  126  263:aload_1         
	//  127  264:iload_2         
	//  128  265:invokevirtual   #245 <Method void HttpURLConnection.setReadTimeout(int)>
			return ((HttpURLConnection) (location));
	//  129  268:aload_1         
	//  130  269:areturn         
		} else
		{
			throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
	//  131  270:new             #247 <Class TypeCastException>
	//  132  273:dup             
	//  133  274:ldc1            #249 <String "null cannot be cast to non-null type java.net.HttpURLConnection">
	//  134  276:invokespecial   #250 <Method void TypeCastException(String)>
	//  135  279:athrow          
		}
	}

	public final String handleFacebookResponse(HttpURLConnection httpurlconnection)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (httpurlconnection)), "httpURLConnection");
	//    0    0:aload_1         
	//    1    1:ldc1            #251 <String "httpURLConnection">
	//    2    3:invokestatic    #60  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(ApiService.access$isSuccessful(ApiService.this, httpurlconnection))
	//*   3    6:aload_0         
	//*   4    7:getfield        #63  <Field ApiService this$0>
	//*   5   10:aload_1         
	//*   6   11:invokestatic    #255 <Method boolean ApiService.access$isSuccessful(ApiService, HttpURLConnection)>
	//*   7   14:ifeq            40
		{
			ApiService apiservice = ApiService.this;
	//    8   17:aload_0         
	//    9   18:getfield        #63  <Field ApiService this$0>
	//   10   21:astore_3        
			httpurlconnection = ((HttpURLConnection) (httpurlconnection.getInputStream()));
	//   11   22:aload_1         
	//   12   23:invokevirtual   #259 <Method java.io.InputStream HttpURLConnection.getInputStream()>
	//   13   26:astore_1        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (httpurlconnection)), "httpURLConnection.inputStream");
	//   14   27:aload_1         
	//   15   28:ldc2            #261 <String "httpURLConnection.inputStream">
	//   16   31:invokestatic    #264 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return ApiService.access$readAll(apiservice, ((java.io.InputStream) (httpurlconnection)));
	//   17   34:aload_3         
	//   18   35:aload_1         
	//   19   36:invokestatic    #268 <Method String ApiService.access$readAll(ApiService, java.io.InputStream)>
	//   20   39:areturn         
		}
		if(httpurlconnection.getResponseCode() == 429)
	//*  21   40:aload_1         
	//*  22   41:invokevirtual   #272 <Method int HttpURLConnection.getResponseCode()>
	//*  23   44:sipush          429
	//*  24   47:icmpne          70
		{
			ApiService.access$getApiRepository$p(ApiService.this).setPlacesLimitAt$sdk_release(new Date());
	//   25   50:aload_0         
	//   26   51:getfield        #63  <Field ApiService this$0>
	//   27   54:invokestatic    #150 <Method ApiClientRepository ApiService.access$getApiRepository$p(ApiService)>
	//   28   57:new             #274 <Class Date>
	//   29   60:dup             
	//   30   61:invokespecial   #275 <Method void Date()>
	//   31   64:invokevirtual   #279 <Method void ApiClientRepository.setPlacesLimitAt$sdk_release(Date)>
		} else
	//*  32   67:goto            153
		{
			ApiService apiservice1 = ApiService.this;
	//   33   70:aload_0         
	//   34   71:getfield        #63  <Field ApiService this$0>
	//   35   74:astore_3        
			httpurlconnection = ((HttpURLConnection) (httpurlconnection.getErrorStream()));
	//   36   75:aload_1         
	//   37   76:invokevirtual   #282 <Method java.io.InputStream HttpURLConnection.getErrorStream()>
	//   38   79:astore_1        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (httpurlconnection)), "httpURLConnection.errorStream");
	//   39   80:aload_1         
	//   40   81:ldc2            #284 <String "httpURLConnection.errorStream">
	//   41   84:invokestatic    #264 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			httpurlconnection = ((HttpURLConnection) ((new JSONObject(ApiService.access$readAll(apiservice1, ((java.io.InputStream) (httpurlconnection))))).optJSONObject("error")));
	//   42   87:new             #115 <Class JSONObject>
	//   43   90:dup             
	//   44   91:aload_3         
	//   45   92:aload_1         
	//   46   93:invokestatic    #268 <Method String ApiService.access$readAll(ApiService, java.io.InputStream)>
	//   47   96:invokespecial   #285 <Method void JSONObject(String)>
	//   48   99:ldc2            #287 <String "error">
	//   49  102:invokevirtual   #291 <Method JSONObject JSONObject.optJSONObject(String)>
	//   50  105:astore_1        
			if(httpurlconnection != null)
	//*  51  106:aload_1         
	//*  52  107:ifnull          153
			{
				int i = ((JSONObject) (httpurlconnection)).optInt("code");
	//   53  110:aload_1         
	//   54  111:ldc2            #293 <String "code">
	//   55  114:invokevirtual   #297 <Method int JSONObject.optInt(String)>
	//   56  117:istore_2        
				if(i == 4 || i == 17 || i == 341)
	//*  57  118:iload_2         
	//*  58  119:iconst_4        
	//*  59  120:icmpeq          136
	//*  60  123:iload_2         
	//*  61  124:bipush          17
	//*  62  126:icmpeq          136
	//*  63  129:iload_2         
	//*  64  130:sipush          341
	//*  65  133:icmpne          153
					ApiService.access$getApiRepository$p(ApiService.this).setPlacesLimitAt$sdk_release(new Date());
	//   66  136:aload_0         
	//   67  137:getfield        #63  <Field ApiService this$0>
	//   68  140:invokestatic    #150 <Method ApiClientRepository ApiService.access$getApiRepository$p(ApiService)>
	//   69  143:new             #274 <Class Date>
	//   70  146:dup             
	//   71  147:invokespecial   #275 <Method void Date()>
	//   72  150:invokevirtual   #279 <Method void ApiClientRepository.setPlacesLimitAt$sdk_release(Date)>
			}
		}
		return null;
	//   73  153:aconst_null     
	//   74  154:areturn         
	}

	public volatile void onPostExecute(Object obj)
	{
		onPostExecute((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #300 <Class String>
	//    3    5:invokevirtual   #302 <Method void onPostExecute(String)>
	//    4    8:return          
	}

	protected void onPostExecute(String s)
	{
		super.onPostExecute(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #304 <Method void AsyncTask.onPostExecute(Object)>
		RadarLogger radarlogger = RadarLogger.INSTANCE;
	//    3    5:getstatic       #221 <Field RadarLogger RadarLogger.INSTANCE>
	//    4    8:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #167 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #168 <Method void StringBuilder()>
	//    8   16:astore_3        
		stringbuilder.append("Places response: ");
	//    9   17:aload_3         
	//   10   18:ldc2            #306 <String "Places response: ">
	//   11   21:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(s);
	//   13   25:aload_3         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		RadarLogger.v$default(radarlogger, stringbuilder.toString(), ((Throwable) (null)), 2, ((Object) (null)));
	//   17   31:aload_2         
	//   18   32:aload_3         
	//   19   33:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   20   36:aconst_null     
	//   21   37:iconst_2        
	//   22   38:aconst_null     
	//   23   39:invokestatic    #230 <Method void RadarLogger.v$default(RadarLogger, String, Throwable, int, Object)>
		callback.invoke(((Object) (s)));
	//   24   42:aload_0         
	//   25   43:getfield        #70  <Field Function1 callback>
	//   26   46:aload_1         
	//   27   47:invokeinterface #312 <Method Object Function1.invoke(Object)>
	//   28   52:pop             
	//   29   53:return          
	}

	private final Function1 callback;
	private final String fbAccessToken;
	final ApiService this$0;

	public ApiService$FacebookPlacesTask(String s, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "fbAccessToken");
	//    0    0:aload_2         
	//    1    1:ldc1            #54  <String "fbAccessToken">
	//    2    3:invokestatic    #60  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "callback");
	//    3    6:aload_3         
	//    4    7:ldc1            #61  <String "callback">
	//    5    9:invokestatic    #60  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		this$0 = ApiService.this;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #63  <Field ApiService this$0>
		super();
	//    9   17:aload_0         
	//   10   18:invokespecial   #66  <Method void AsyncTask()>
		fbAccessToken = s;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #68  <Field String fbAccessToken>
		callback = function1;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #70  <Field Function1 callback>
	//   17   31:return          
	}
}
