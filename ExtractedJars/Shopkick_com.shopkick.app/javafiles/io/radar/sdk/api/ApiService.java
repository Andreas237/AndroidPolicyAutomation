// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.*;
import io.radar.sdk.config.ConfigRepository;
import io.radar.sdk.internal.RadarLogger;
import io.radar.sdk.internal.repository.IdentityRepository;
import io.radar.sdk.internal.repository.OptionsRepository;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarUser;
import io.radar.sdk.util.DeviceHelper;
import io.radar.sdk.util.IntegrationHelper;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import kotlin.*;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package io.radar.sdk.api:
//			ApiClientRepository, Error, RadarResponse, Success

public final class ApiService
{
	private final class FacebookPlacesTask extends AsyncTask
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
			Object obj1 = ((Object) (configRepository.getFacebookApiVersion$sdk_release()));
		//    3    6:aload_0         
		//    4    7:getfield        #63  <Field ApiService this$0>
		//    5   10:invokestatic    #103 <Method ConfigRepository ApiService.access$getConfigRepository$p(ApiService)>
		//    6   13:invokevirtual   #108 <Method String ConfigRepository.getFacebookApiVersion$sdk_release()>
		//    7   16:astore          4
			Object obj = ((Object) (configRepository.getFacebookPlacesFields$sdk_release()));
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
			location = ((Location) (Uri.parse(apiRepository.getFacebookHost$sdk_release()).buildUpon()));
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
			if(isSuccessful(httpurlconnection))
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
		//   12   23:invokevirtual   #259 <Method InputStream HttpURLConnection.getInputStream()>
		//   13   26:astore_1        
				Intrinsics.checkExpressionValueIsNotNull(((Object) (httpurlconnection)), "httpURLConnection.inputStream");
		//   14   27:aload_1         
		//   15   28:ldc2            #261 <String "httpURLConnection.inputStream">
		//   16   31:invokestatic    #264 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
				return apiservice.readAll(((InputStream) (httpurlconnection)));
		//   17   34:aload_3         
		//   18   35:aload_1         
		//   19   36:invokestatic    #268 <Method String ApiService.access$readAll(ApiService, InputStream)>
		//   20   39:areturn         
			}
			if(httpurlconnection.getResponseCode() == 429)
		//*  21   40:aload_1         
		//*  22   41:invokevirtual   #272 <Method int HttpURLConnection.getResponseCode()>
		//*  23   44:sipush          429
		//*  24   47:icmpne          70
			{
				apiRepository.setPlacesLimitAt$sdk_release(new Date());
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
		//   37   76:invokevirtual   #282 <Method InputStream HttpURLConnection.getErrorStream()>
		//   38   79:astore_1        
				Intrinsics.checkExpressionValueIsNotNull(((Object) (httpurlconnection)), "httpURLConnection.errorStream");
		//   39   80:aload_1         
		//   40   81:ldc2            #284 <String "httpURLConnection.errorStream">
		//   41   84:invokestatic    #264 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
				httpurlconnection = ((HttpURLConnection) ((new JSONObject(apiservice1.readAll(((InputStream) (httpurlconnection))))).optJSONObject("error")));
		//   42   87:new             #115 <Class JSONObject>
		//   43   90:dup             
		//   44   91:aload_3         
		//   45   92:aload_1         
		//   46   93:invokestatic    #268 <Method String ApiService.access$readAll(ApiService, InputStream)>
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
						apiRepository.setPlacesLimitAt$sdk_release(new Date());
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

		public FacebookPlacesTask(String s, Function1 function1)
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

	private final class PutUserTask extends AsyncTask
	{

		protected transient RadarResponse doInBackground(Map amap[])
		{
			Intrinsics.checkParameterIsNotNull(((Object) (amap)), "params");
		//    0    0:aload_1         
		//    1    1:ldc1            #81  <String "params">
		//    2    3:invokestatic    #57  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			try
			{
				amap = ((Map []) (putUser((Map)ArraysKt.first(((Object []) (amap))))));
		//    3    6:aload_0         
		//    4    7:aload_1         
		//    5    8:invokestatic    #87  <Method Object ArraysKt.first(Object[])>
		//    6   11:checkcast       #89  <Class Map>
		//    7   14:invokevirtual   #92  <Method HttpURLConnection putUser(Map)>
		//    8   17:astore_1        
				amap = ((Map []) (handleResponse(location, ((HttpURLConnection) (amap)))));
		//    9   18:aload_0         
		//   10   19:aload_0         
		//   11   20:getfield        #68  <Field Location location>
		//   12   23:aload_1         
		//   13   24:invokevirtual   #95  <Method RadarResponse handleResponse(Location, HttpURLConnection)>
		//   14   27:astore_1        
			}
		//*  15   28:aload_1         
		//*  16   29:areturn         
		//*  17   30:new             #97  <Class Error>
		//*  18   33:dup             
		//*  19   34:getstatic       #103 <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_UNKNOWN>
		//*  20   37:invokespecial   #106 <Method void Error(io.radar.sdk.Radar$RadarStatus)>
		//*  21   40:checkcast       #108 <Class RadarResponse>
		//*  22   43:areturn         
		//*  23   44:new             #97  <Class Error>
		//*  24   47:dup             
		//*  25   48:getstatic       #111 <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_SERVER>
		//*  26   51:invokespecial   #106 <Method void Error(io.radar.sdk.Radar$RadarStatus)>
		//*  27   54:checkcast       #108 <Class RadarResponse>
		//*  28   57:areturn         
		//*  29   58:new             #97  <Class Error>
		//*  30   61:dup             
		//*  31   62:getstatic       #114 <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_NETWORK>
		//*  32   65:invokespecial   #106 <Method void Error(io.radar.sdk.Radar$RadarStatus)>
		//*  33   68:checkcast       #108 <Class RadarResponse>
		//*  34   71:areturn         
			// Misplaced declaration of an exception variable
			catch(Map amap[])
			{
				return (RadarResponse)new Error(io.radar.sdk.Radar.RadarStatus.ERROR_NETWORK);
			}
		//*  35   72:astore_1        
		//*  36   73:goto            58
			// Misplaced declaration of an exception variable
			catch(Map amap[])
			{
				return (RadarResponse)new Error(io.radar.sdk.Radar.RadarStatus.ERROR_SERVER);
			}
		//*  37   76:astore_1        
		//*  38   77:goto            44
			// Misplaced declaration of an exception variable
			catch(Map amap[])
			{
				return (RadarResponse)new Error(io.radar.sdk.Radar.RadarStatus.ERROR_UNKNOWN);
			}
			return ((RadarResponse) (amap));
		//*  39   80:astore_1        
		//*  40   81:goto            30
		}

		public volatile Object doInBackground(Object aobj[])
		{
			return ((Object) (doInBackground((Map[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #118 <Class Map[]>
		//    3    5:invokevirtual   #120 <Method RadarResponse doInBackground(Map[])>
		//    4    8:areturn         
		}

		public final RadarResponse handleResponse(Location location1, HttpURLConnection httpurlconnection)
		{
label0:
			{
label1:
				{
					boolean flag;
					Object obj;
					RadarUser radaruser;
label2:
					{
						Intrinsics.checkParameterIsNotNull(((Object) (location1)), "location");
		//    0    0:aload_1         
		//    1    1:ldc1            #58  <String "location">
		//    2    3:invokestatic    #57  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
						Intrinsics.checkParameterIsNotNull(((Object) (httpurlconnection)), "httpURLConnection");
		//    3    6:aload_2         
		//    4    7:ldc1            #121 <String "httpURLConnection">
		//    5    9:invokestatic    #57  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
						if(!isSuccessful(httpurlconnection))
							break label0;
		//    6   12:aload_0         
		//    7   13:getfield        #61  <Field ApiService this$0>
		//    8   16:aload_2         
		//    9   17:invokestatic    #125 <Method boolean ApiService.access$isSuccessful(ApiService, HttpURLConnection)>
		//   10   20:ifeq            253
						obj = ((Object) (ApiService.this));
		//   11   23:aload_0         
		//   12   24:getfield        #61  <Field ApiService this$0>
		//   13   27:astore          5
						httpurlconnection = ((HttpURLConnection) (httpurlconnection.getInputStream()));
		//   14   29:aload_2         
		//   15   30:invokevirtual   #131 <Method InputStream HttpURLConnection.getInputStream()>
		//   16   33:astore_2        
						Intrinsics.checkExpressionValueIsNotNull(((Object) (httpurlconnection)), "httpURLConnection.inputStream");
		//   17   34:aload_2         
		//   18   35:ldc1            #133 <String "httpURLConnection.inputStream">
		//   19   37:invokestatic    #136 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
						obj = ((Object) (new JSONObject(((ApiService) (obj)).readAll(((InputStream) (httpurlconnection))))));
		//   20   40:new             #138 <Class JSONObject>
		//   21   43:dup             
		//   22   44:aload           5
		//   23   46:aload_2         
		//   24   47:invokestatic    #142 <Method String ApiService.access$readAll(ApiService, InputStream)>
		//   25   50:invokespecial   #145 <Method void JSONObject(String)>
		//   26   53:astore          5
						httpurlconnection = ((HttpURLConnection) (((JSONObject) (obj)).optJSONObject("meta")));
		//   27   55:aload           5
		//   28   57:ldc1            #147 <String "meta">
		//   29   59:invokevirtual   #151 <Method JSONObject JSONObject.optJSONObject(String)>
		//   30   62:astore_2        
						if(httpurlconnection != null)
		//*  31   63:aload_2         
		//*  32   64:ifnull          89
						{
							httpurlconnection = ((HttpURLConnection) (((JSONObject) (httpurlconnection)).optJSONObject("config")));
		//   33   67:aload_2         
		//   34   68:ldc1            #153 <String "config">
		//   35   70:invokevirtual   #151 <Method JSONObject JSONObject.optJSONObject(String)>
		//   36   73:astore_2        
							if(httpurlconnection != null)
		//*  37   74:aload_2         
		//*  38   75:ifnull          89
								configRepository.saveConfigJson$sdk_release(((JSONObject) (httpurlconnection)));
		//   39   78:aload_0         
		//   40   79:getfield        #61  <Field ApiService this$0>
		//   41   82:invokestatic    #157 <Method ConfigRepository ApiService.access$getConfigRepository$p(ApiService)>
		//   42   85:aload_2         
		//   43   86:invokevirtual   #163 <Method void ConfigRepository.saveConfigJson$sdk_release(JSONObject)>
						}
						httpurlconnection = ((HttpURLConnection) (((JSONObject) (obj)).optJSONObject("user")));
		//   44   89:aload           5
		//   45   91:ldc1            #165 <String "user">
		//   46   93:invokevirtual   #151 <Method JSONObject JSONObject.optJSONObject(String)>
		//   47   96:astore_2        
						if(httpurlconnection == null)
							break label1;
		//   48   97:aload_2         
		//   49   98:ifnull          239
						radaruser = RadarUser.Companion.fromJson$sdk_release(((JSONObject) (httpurlconnection)));
		//   50  101:getstatic       #171 <Field io.radar.sdk.model.RadarUser$Companion RadarUser.Companion>
		//   51  104:aload_2         
		//   52  105:invokevirtual   #177 <Method RadarUser io.radar.sdk.model.RadarUser$Companion.fromJson$sdk_release(JSONObject)>
		//   53  108:astore          6
						if(radaruser == null)
							break label1;
		//   54  110:aload           6
		//   55  112:ifnull          239
						httpurlconnection = ((HttpURLConnection) (((JSONObject) (obj)).optJSONArray("events")));
		//   56  115:aload           5
		//   57  117:ldc1            #179 <String "events">
		//   58  119:invokevirtual   #183 <Method org.json.JSONArray JSONObject.optJSONArray(String)>
		//   59  122:astore_2        
						flag = false;
		//   60  123:iconst_0        
		//   61  124:istore          4
						if(httpurlconnection != null)
		//*  62  126:aload_2         
		//*  63  127:ifnull          145
						{
							httpurlconnection = ((HttpURLConnection) (RadarEvent.Companion.eventsFromJSONArray$sdk_release(((org.json.JSONArray) (httpurlconnection)))));
		//   64  130:getstatic       #188 <Field io.radar.sdk.model.RadarEvent$Companion RadarEvent.Companion>
		//   65  133:aload_2         
		//   66  134:invokevirtual   #194 <Method RadarEvent[] io.radar.sdk.model.RadarEvent$Companion.eventsFromJSONArray$sdk_release(org.json.JSONArray)>
		//   67  137:astore_2        
							if(httpurlconnection != null)
		//*  68  138:aload_2         
		//*  69  139:ifnull          145
								break label2;
		//   70  142:goto            150
						}
						httpurlconnection = ((HttpURLConnection) (new RadarEvent[0]));
		//   71  145:iconst_0        
		//   72  146:anewarray       RadarEvent[]
		//   73  149:astore_2        
					}
					identityRepository.setRadarId$sdk_release(radaruser.getId());
		//   74  150:aload_0         
		//   75  151:getfield        #61  <Field ApiService this$0>
		//   76  154:invokestatic    #198 <Method IdentityRepository ApiService.access$getIdentityRepository$p(ApiService)>
		//   77  157:aload           6
		//   78  159:invokevirtual   #202 <Method String RadarUser.getId()>
		//   79  162:invokevirtual   #207 <Method void IdentityRepository.setRadarId$sdk_release(String)>
					if(optionsRepository.getPlacesProvider$sdk_release() == io.radar.sdk.Radar.RadarPlacesProvider.FACEBOOK)
		//*  80  165:aload_0         
		//*  81  166:getfield        #61  <Field ApiService this$0>
		//*  82  169:invokestatic    #211 <Method OptionsRepository ApiService.access$getOptionsRepository$p(ApiService)>
		//*  83  172:invokevirtual   #217 <Method io.radar.sdk.Radar$RadarPlacesProvider OptionsRepository.getPlacesProvider$sdk_release()>
		//*  84  175:getstatic       #223 <Field io.radar.sdk.Radar$RadarPlacesProvider io.radar.sdk.Radar$RadarPlacesProvider.FACEBOOK>
		//*  85  178:if_acmpne       211
					{
						ApiClientRepository apiclientrepository = apiRepository;
		//   86  181:aload_0         
		//   87  182:getfield        #61  <Field ApiService this$0>
		//   88  185:invokestatic    #227 <Method ApiClientRepository ApiService.access$getApiRepository$p(ApiService)>
		//   89  188:astore          7
						if(radaruser.getPlace() != null)
		//*  90  190:aload           6
		//*  91  192:invokevirtual   #231 <Method io.radar.sdk.model.RadarPlace RadarUser.getPlace()>
		//*  92  195:ifnull          201
							flag = true;
		//   93  198:iconst_1        
		//   94  199:istore          4
						apiclientrepository.setAtPlace$sdk_release(flag);
		//   95  201:aload           7
		//   96  203:iload           4
		//   97  205:invokevirtual   #237 <Method void ApiClientRepository.setAtPlace$sdk_release(boolean)>
					} else
		//*  98  208:goto            222
					{
						apiRepository.setAtPlace$sdk_release(false);
		//   99  211:aload_0         
		//  100  212:getfield        #61  <Field ApiService this$0>
		//  101  215:invokestatic    #227 <Method ApiClientRepository ApiService.access$getApiRepository$p(ApiService)>
		//  102  218:iconst_0        
		//  103  219:invokevirtual   #237 <Method void ApiClientRepository.setAtPlace$sdk_release(boolean)>
					}
					return (RadarResponse)new Success(((JSONObject) (obj)), location1, ((RadarEvent []) (httpurlconnection)), radaruser);
		//  104  222:new             #239 <Class Success>
		//  105  225:dup             
		//  106  226:aload           5
		//  107  228:aload_1         
		//  108  229:aload_2         
		//  109  230:aload           6
		//  110  232:invokespecial   #242 <Method void Success(JSONObject, Location, RadarEvent[], RadarUser)>
		//  111  235:checkcast       #108 <Class RadarResponse>
		//  112  238:areturn         
				}
				return (RadarResponse)new Error(io.radar.sdk.Radar.RadarStatus.ERROR_SERVER);
		//  113  239:new             #97  <Class Error>
		//  114  242:dup             
		//  115  243:getstatic       #111 <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_SERVER>
		//  116  246:invokespecial   #106 <Method void Error(io.radar.sdk.Radar$RadarStatus)>
		//  117  249:checkcast       #108 <Class RadarResponse>
		//  118  252:areturn         
			}
			int i = httpurlconnection.getResponseCode();
		//  119  253:aload_2         
		//  120  254:invokevirtual   #246 <Method int HttpURLConnection.getResponseCode()>
		//  121  257:istore_3        
			if(i == 400)
		//* 122  258:iload_3         
		//* 123  259:sipush          400
		//* 124  262:icmpne          272
				location1 = ((Location) (io.radar.sdk.Radar.RadarStatus.ERROR_LOCATION));
		//  125  265:getstatic       #249 <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_LOCATION>
		//  126  268:astore_1        
			else
		//* 127  269:goto            328
			if(i == 401)
		//* 128  272:iload_3         
		//* 129  273:sipush          401
		//* 130  276:icmpne          286
				location1 = ((Location) (io.radar.sdk.Radar.RadarStatus.ERROR_UNAUTHORIZED));
		//  131  279:getstatic       #252 <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_UNAUTHORIZED>
		//  132  282:astore_1        
			else
		//* 133  283:goto            328
			if(i == 429)
		//* 134  286:iload_3         
		//* 135  287:sipush          429
		//* 136  290:icmpne          300
				location1 = ((Location) (io.radar.sdk.Radar.RadarStatus.ERROR_RATE_LIMIT));
		//  137  293:getstatic       #255 <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_RATE_LIMIT>
		//  138  296:astore_1        
			else
		//* 139  297:goto            328
			if(500 <= i && 600 > i)
		//* 140  300:sipush          500
		//* 141  303:iload_3         
		//* 142  304:icmple          310
		//* 143  307:goto            324
		//* 144  310:sipush          600
		//* 145  313:iload_3         
		//* 146  314:icmple          324
				location1 = ((Location) (io.radar.sdk.Radar.RadarStatus.ERROR_SERVER));
		//  147  317:getstatic       #111 <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_SERVER>
		//  148  320:astore_1        
			else
		//* 149  321:goto            328
				location1 = ((Location) (io.radar.sdk.Radar.RadarStatus.ERROR_UNKNOWN));
		//  150  324:getstatic       #103 <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_UNKNOWN>
		//  151  327:astore_1        
			return (RadarResponse)new Error(((io.radar.sdk.Radar.RadarStatus) (location1)));
		//  152  328:new             #97  <Class Error>
		//  153  331:dup             
		//  154  332:aload_1         
		//  155  333:invokespecial   #106 <Method void Error(io.radar.sdk.Radar$RadarStatus)>
		//  156  336:checkcast       #108 <Class RadarResponse>
		//  157  339:areturn         
		}

		protected void onPostExecute(RadarResponse radarresponse)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (radarresponse)), "result");
		//    0    0:aload_1         
		//    1    1:ldc2            #257 <String "result">
		//    2    4:invokestatic    #57  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			super.onPostExecute(((Object) (radarresponse)));
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokespecial   #260 <Method void AsyncTask.onPostExecute(Object)>
			RadarLogger radarlogger = RadarLogger.INSTANCE;
		//    6   12:getstatic       #266 <Field RadarLogger RadarLogger.INSTANCE>
		//    7   15:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
		//    8   16:new             #268 <Class StringBuilder>
		//    9   19:dup             
		//   10   20:invokespecial   #269 <Method void StringBuilder()>
		//   11   23:astore_3        
			stringbuilder.append("User upsert response: ");
		//   12   24:aload_3         
		//   13   25:ldc2            #271 <String "User upsert response: ">
		//   14   28:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
		//   15   31:pop             
			stringbuilder.append(((Object) (radarresponse)));
		//   16   32:aload_3         
		//   17   33:aload_1         
		//   18   34:invokevirtual   #278 <Method StringBuilder StringBuilder.append(Object)>
		//   19   37:pop             
			RadarLogger.v$default(radarlogger, stringbuilder.toString(), ((Throwable) (null)), 2, ((Object) (null)));
		//   20   38:aload_2         
		//   21   39:aload_3         
		//   22   40:invokevirtual   #281 <Method String StringBuilder.toString()>
		//   23   43:aconst_null     
		//   24   44:iconst_2        
		//   25   45:aconst_null     
		//   26   46:invokestatic    #285 <Method void RadarLogger.v$default(RadarLogger, String, Throwable, int, Object)>
			callback.invoke(((Object) (radarresponse)));
		//   27   49:aload_0         
		//   28   50:getfield        #70  <Field Function1 callback>
		//   29   53:aload_1         
		//   30   54:invokeinterface #291 <Method Object Function1.invoke(Object)>
		//   31   59:pop             
		//   32   60:return          
		}

		public volatile void onPostExecute(Object obj)
		{
			onPostExecute((RadarResponse)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #108 <Class RadarResponse>
		//    3    5:invokevirtual   #293 <Method void onPostExecute(RadarResponse)>
		//    4    8:return          
		}

		public final HttpURLConnection putUser(Map map)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (map)), "params");
		//    0    0:aload_1         
		//    1    1:ldc1            #81  <String "params">
		//    2    3:invokestatic    #57  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Object obj = ((Object) (new URL(Uri.parse(apiRepository.getRadarHost$sdk_release()).buildUpon().appendEncodedPath("v1/users").appendEncodedPath(getLookupId()).build().toString())));
		//    3    6:new             #295 <Class URL>
		//    4    9:dup             
		//    5   10:aload_0         
		//    6   11:getfield        #61  <Field ApiService this$0>
		//    7   14:invokestatic    #227 <Method ApiClientRepository ApiService.access$getApiRepository$p(ApiService)>
		//    8   17:invokevirtual   #298 <Method String ApiClientRepository.getRadarHost$sdk_release()>
		//    9   20:invokestatic    #304 <Method Uri Uri.parse(String)>
		//   10   23:invokevirtual   #308 <Method android.net.Uri$Builder Uri.buildUpon()>
		//   11   26:ldc2            #310 <String "v1/users">
		//   12   29:invokevirtual   #316 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
		//   13   32:aload_0         
		//   14   33:getfield        #61  <Field ApiService this$0>
		//   15   36:invokestatic    #320 <Method String ApiService.access$getLookupId(ApiService)>
		//   16   39:invokevirtual   #316 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
		//   17   42:invokevirtual   #324 <Method Uri android.net.Uri$Builder.build()>
		//   18   45:invokevirtual   #325 <Method String Uri.toString()>
		//   19   48:invokespecial   #326 <Method void URL(String)>
		//   20   51:astore_3        
			RadarLogger radarlogger = RadarLogger.INSTANCE;
		//   21   52:getstatic       #266 <Field RadarLogger RadarLogger.INSTANCE>
		//   22   55:astore          4
			StringBuilder stringbuilder = new StringBuilder();
		//   23   57:new             #268 <Class StringBuilder>
		//   24   60:dup             
		//   25   61:invokespecial   #269 <Method void StringBuilder()>
		//   26   64:astore          5
			stringbuilder.append("Sending request: ");
		//   27   66:aload           5
		//   28   68:ldc2            #328 <String "Sending request: ">
		//   29   71:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
		//   30   74:pop             
			stringbuilder.append(obj);
		//   31   75:aload           5
		//   32   77:aload_3         
		//   33   78:invokevirtual   #278 <Method StringBuilder StringBuilder.append(Object)>
		//   34   81:pop             
			stringbuilder.append("\n with params: ");
		//   35   82:aload           5
		//   36   84:ldc2            #330 <String "\n with params: ">
		//   37   87:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
		//   38   90:pop             
			stringbuilder.append(((Object) (map)));
		//   39   91:aload           5
		//   40   93:aload_1         
		//   41   94:invokevirtual   #278 <Method StringBuilder StringBuilder.append(Object)>
		//   42   97:pop             
			RadarLogger.v$default(radarlogger, stringbuilder.toString(), ((Throwable) (null)), 2, ((Object) (null)));
		//   43   98:aload           4
		//   44  100:aload           5
		//   45  102:invokevirtual   #281 <Method String StringBuilder.toString()>
		//   46  105:aconst_null     
		//   47  106:iconst_2        
		//   48  107:aconst_null     
		//   49  108:invokestatic    #285 <Method void RadarLogger.v$default(RadarLogger, String, Throwable, int, Object)>
			obj = ((Object) (((URL) (obj)).openConnection()));
		//   50  111:aload_3         
		//   51  112:invokevirtual   #334 <Method java.net.URLConnection URL.openConnection()>
		//   52  115:astore_3        
			if(obj != null)
		//*  53  116:aload_3         
		//*  54  117:ifnull          219
			{
				obj = ((Object) ((HttpURLConnection)obj));
		//   55  120:aload_3         
		//   56  121:checkcast       #127 <Class HttpURLConnection>
		//   57  124:astore_3        
				((HttpURLConnection) (obj)).setRequestProperty("Authorization", publishableKey);
		//   58  125:aload_3         
		//   59  126:ldc2            #336 <String "Authorization">
		//   60  129:aload_0         
		//   61  130:getfield        #66  <Field String publishableKey>
		//   62  133:invokevirtual   #340 <Method void HttpURLConnection.setRequestProperty(String, String)>
				((HttpURLConnection) (obj)).setRequestProperty("Content-Type", "application/json");
		//   63  136:aload_3         
		//   64  137:ldc2            #342 <String "Content-Type">
		//   65  140:ldc2            #344 <String "application/json">
		//   66  143:invokevirtual   #340 <Method void HttpURLConnection.setRequestProperty(String, String)>
				((HttpURLConnection) (obj)).setRequestProperty("X-Radar-Config", "true");
		//   67  146:aload_3         
		//   68  147:ldc2            #346 <String "X-Radar-Config">
		//   69  150:ldc2            #348 <String "true">
		//   70  153:invokevirtual   #340 <Method void HttpURLConnection.setRequestProperty(String, String)>
				((HttpURLConnection) (obj)).setRequestMethod("PUT");
		//   71  156:aload_3         
		//   72  157:ldc2            #350 <String "PUT">
		//   73  160:invokevirtual   #353 <Method void HttpURLConnection.setRequestMethod(String)>
				((HttpURLConnection) (obj)).setDoOutput(true);
		//   74  163:aload_3         
		//   75  164:iconst_1        
		//   76  165:invokevirtual   #356 <Method void HttpURLConnection.setDoOutput(boolean)>
				int i = (int)5000L;
		//   77  168:ldc2w           #357 <Long 5000L>
		//   78  171:l2i             
		//   79  172:istore_2        
				((HttpURLConnection) (obj)).setConnectTimeout(i);
		//   80  173:aload_3         
		//   81  174:iload_2         
		//   82  175:invokevirtual   #362 <Method void HttpURLConnection.setConnectTimeout(int)>
				((HttpURLConnection) (obj)).setReadTimeout(i);
		//   83  178:aload_3         
		//   84  179:iload_2         
		//   85  180:invokevirtual   #365 <Method void HttpURLConnection.setReadTimeout(int)>
				OutputStreamWriter outputstreamwriter = new OutputStreamWriter(((HttpURLConnection) (obj)).getOutputStream());
		//   86  183:new             #367 <Class OutputStreamWriter>
		//   87  186:dup             
		//   88  187:aload_3         
		//   89  188:invokevirtual   #371 <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
		//   90  191:invokespecial   #374 <Method void OutputStreamWriter(java.io.OutputStream)>
		//   91  194:astore          4
				outputstreamwriter.write((new JSONObject(map)).toString());
		//   92  196:aload           4
		//   93  198:new             #138 <Class JSONObject>
		//   94  201:dup             
		//   95  202:aload_1         
		//   96  203:invokespecial   #377 <Method void JSONObject(Map)>
		//   97  206:invokevirtual   #378 <Method String JSONObject.toString()>
		//   98  209:invokevirtual   #381 <Method void OutputStreamWriter.write(String)>
				outputstreamwriter.close();
		//   99  212:aload           4
		//  100  214:invokevirtual   #384 <Method void OutputStreamWriter.close()>
				return ((HttpURLConnection) (obj));
		//  101  217:aload_3         
		//  102  218:areturn         
			} else
			{
				throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
		//  103  219:new             #386 <Class TypeCastException>
		//  104  222:dup             
		//  105  223:ldc2            #388 <String "null cannot be cast to non-null type java.net.HttpURLConnection">
		//  106  226:invokespecial   #389 <Method void TypeCastException(String)>
		//  107  229:athrow          
			}
		}

		private final Function1 callback;
		private final Location location;
		private final String publishableKey;
		final ApiService this$0;

		public PutUserTask(String s, Location location1, Function1 function1)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (s)), "publishableKey");
		//    0    0:aload_2         
		//    1    1:ldc1            #51  <String "publishableKey">
		//    2    3:invokestatic    #57  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Intrinsics.checkParameterIsNotNull(((Object) (location1)), "location");
		//    3    6:aload_3         
		//    4    7:ldc1            #58  <String "location">
		//    5    9:invokestatic    #57  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Intrinsics.checkParameterIsNotNull(((Object) (function1)), "callback");
		//    6   12:aload           4
		//    7   14:ldc1            #59  <String "callback">
		//    8   16:invokestatic    #57  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			this$0 = ApiService.this;
		//    9   19:aload_0         
		//   10   20:aload_1         
		//   11   21:putfield        #61  <Field ApiService this$0>
			super();
		//   12   24:aload_0         
		//   13   25:invokespecial   #64  <Method void AsyncTask()>
			publishableKey = s;
		//   14   28:aload_0         
		//   15   29:aload_2         
		//   16   30:putfield        #66  <Field String publishableKey>
			location = location1;
		//   17   33:aload_0         
		//   18   34:aload_3         
		//   19   35:putfield        #68  <Field Location location>
			callback = function1;
		//   20   38:aload_0         
		//   21   39:aload           4
		//   22   41:putfield        #70  <Field Function1 callback>
		//   23   44:return          
		}
	}

	private final class VerifyEventTask extends AsyncTask
	{

		public volatile Object doInBackground(Object aobj[])
		{
			doInBackground((Map[])aobj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #66  <Class Map[]>
		//    3    5:invokevirtual   #68  <Method void doInBackground(Map[])>
			return ((Object) (Unit.INSTANCE));
		//    4    8:getstatic       #74  <Field Unit Unit.INSTANCE>
		//    5   11:areturn         
		}

		protected transient void doInBackground(Map amap[])
		{
			Intrinsics.checkParameterIsNotNull(((Object) (amap)), "params");
		//    0    0:aload_1         
		//    1    1:ldc1            #77  <String "params">
		//    2    3:invokestatic    #49  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			try
			{
				putVerification((Map)ArraysKt.first(((Object []) (amap))));
		//    3    6:aload_0         
		//    4    7:aload_1         
		//    5    8:invokestatic    #82  <Method Object ArraysKt.first(Object[])>
		//    6   11:checkcast       #84  <Class Map>
		//    7   14:invokevirtual   #87  <Method void putVerification(Map)>
				return;
		//    8   17:return          
			}
			// Misplaced declaration of an exception variable
			catch(Map amap[])
		//*   9   18:astore_1        
			{
				RadarLogger.INSTANCE.w("Error verifying event", (Throwable)amap);
		//   10   19:getstatic       #92  <Field RadarLogger RadarLogger.INSTANCE>
		//   11   22:ldc1            #94  <String "Error verifying event">
		//   12   24:aload_1         
		//   13   25:checkcast       #96  <Class Throwable>
		//   14   28:invokevirtual   #100 <Method void RadarLogger.w(String, Throwable)>
			}
		//   15   31:return          
		}

		public final String getEventId()
		{
			return eventId;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field String eventId>
		//    2    4:areturn         
		}

		public final String getPublishableKey()
		{
			return publishableKey;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field String publishableKey>
		//    2    4:areturn         
		}

		public final void putVerification(Map map)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (map)), "params");
		//    0    0:aload_1         
		//    1    1:ldc1            #77  <String "params">
		//    2    3:invokestatic    #49  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Object obj = ((Object) (new URL(Uri.parse(apiRepository.getRadarHost$sdk_release()).buildUpon().appendEncodedPath("v1/events").appendEncodedPath(eventId).appendEncodedPath("verification").build().toString())));
		//    3    6:new             #104 <Class URL>
		//    4    9:dup             
		//    5   10:aload_0         
		//    6   11:getfield        #52  <Field ApiService this$0>
		//    7   14:invokestatic    #108 <Method ApiClientRepository ApiService.access$getApiRepository$p(ApiService)>
		//    8   17:invokevirtual   #113 <Method String ApiClientRepository.getRadarHost$sdk_release()>
		//    9   20:invokestatic    #119 <Method Uri Uri.parse(String)>
		//   10   23:invokevirtual   #123 <Method android.net.Uri$Builder Uri.buildUpon()>
		//   11   26:ldc1            #125 <String "v1/events">
		//   12   28:invokevirtual   #131 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
		//   13   31:aload_0         
		//   14   32:getfield        #59  <Field String eventId>
		//   15   35:invokevirtual   #131 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
		//   16   38:ldc1            #133 <String "verification">
		//   17   40:invokevirtual   #131 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
		//   18   43:invokevirtual   #137 <Method Uri android.net.Uri$Builder.build()>
		//   19   46:invokevirtual   #140 <Method String Uri.toString()>
		//   20   49:invokespecial   #143 <Method void URL(String)>
		//   21   52:astore_3        
			RadarLogger radarlogger = RadarLogger.INSTANCE;
		//   22   53:getstatic       #92  <Field RadarLogger RadarLogger.INSTANCE>
		//   23   56:astore          4
			StringBuilder stringbuilder = new StringBuilder();
		//   24   58:new             #145 <Class StringBuilder>
		//   25   61:dup             
		//   26   62:invokespecial   #146 <Method void StringBuilder()>
		//   27   65:astore          5
			stringbuilder.append("Sending verification: ");
		//   28   67:aload           5
		//   29   69:ldc1            #148 <String "Sending verification: ">
		//   30   71:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
		//   31   74:pop             
			stringbuilder.append(obj);
		//   32   75:aload           5
		//   33   77:aload_3         
		//   34   78:invokevirtual   #155 <Method StringBuilder StringBuilder.append(Object)>
		//   35   81:pop             
			stringbuilder.append("\n with params: ");
		//   36   82:aload           5
		//   37   84:ldc1            #157 <String "\n with params: ">
		//   38   86:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
		//   39   89:pop             
			stringbuilder.append(((Object) (map)));
		//   40   90:aload           5
		//   41   92:aload_1         
		//   42   93:invokevirtual   #155 <Method StringBuilder StringBuilder.append(Object)>
		//   43   96:pop             
			RadarLogger.v$default(radarlogger, stringbuilder.toString(), ((Throwable) (null)), 2, ((Object) (null)));
		//   44   97:aload           4
		//   45   99:aload           5
		//   46  101:invokevirtual   #158 <Method String StringBuilder.toString()>
		//   47  104:aconst_null     
		//   48  105:iconst_2        
		//   49  106:aconst_null     
		//   50  107:invokestatic    #162 <Method void RadarLogger.v$default(RadarLogger, String, Throwable, int, Object)>
			obj = ((Object) (((URL) (obj)).openConnection()));
		//   51  110:aload_3         
		//   52  111:invokevirtual   #166 <Method java.net.URLConnection URL.openConnection()>
		//   53  114:astore_3        
			if(obj != null)
		//*  54  115:aload_3         
		//*  55  116:ifnull          214
			{
				obj = ((Object) ((HttpURLConnection)obj));
		//   56  119:aload_3         
		//   57  120:checkcast       #168 <Class HttpURLConnection>
		//   58  123:astore_3        
				((HttpURLConnection) (obj)).setRequestProperty("Authorization", publishableKey);
		//   59  124:aload_3         
		//   60  125:ldc1            #170 <String "Authorization">
		//   61  127:aload_0         
		//   62  128:getfield        #57  <Field String publishableKey>
		//   63  131:invokevirtual   #173 <Method void HttpURLConnection.setRequestProperty(String, String)>
				((HttpURLConnection) (obj)).setRequestProperty("Content-Type", "application/json");
		//   64  134:aload_3         
		//   65  135:ldc1            #175 <String "Content-Type">
		//   66  137:ldc1            #177 <String "application/json">
		//   67  139:invokevirtual   #173 <Method void HttpURLConnection.setRequestProperty(String, String)>
				((HttpURLConnection) (obj)).setRequestMethod("PUT");
		//   68  142:aload_3         
		//   69  143:ldc1            #179 <String "PUT">
		//   70  145:invokevirtual   #182 <Method void HttpURLConnection.setRequestMethod(String)>
				((HttpURLConnection) (obj)).setDoOutput(true);
		//   71  148:aload_3         
		//   72  149:iconst_1        
		//   73  150:invokevirtual   #186 <Method void HttpURLConnection.setDoOutput(boolean)>
				int i = (int)5000L;
		//   74  153:ldc2w           #187 <Long 5000L>
		//   75  156:l2i             
		//   76  157:istore_2        
				((HttpURLConnection) (obj)).setConnectTimeout(i);
		//   77  158:aload_3         
		//   78  159:iload_2         
		//   79  160:invokevirtual   #192 <Method void HttpURLConnection.setConnectTimeout(int)>
				((HttpURLConnection) (obj)).setReadTimeout(i);
		//   80  163:aload_3         
		//   81  164:iload_2         
		//   82  165:invokevirtual   #195 <Method void HttpURLConnection.setReadTimeout(int)>
				OutputStreamWriter outputstreamwriter = new OutputStreamWriter(((HttpURLConnection) (obj)).getOutputStream());
		//   83  168:new             #197 <Class OutputStreamWriter>
		//   84  171:dup             
		//   85  172:aload_3         
		//   86  173:invokevirtual   #201 <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
		//   87  176:invokespecial   #204 <Method void OutputStreamWriter(java.io.OutputStream)>
		//   88  179:astore          4
				outputstreamwriter.write((new JSONObject(map)).toString());
		//   89  181:aload           4
		//   90  183:new             #206 <Class JSONObject>
		//   91  186:dup             
		//   92  187:aload_1         
		//   93  188:invokespecial   #208 <Method void JSONObject(Map)>
		//   94  191:invokevirtual   #209 <Method String JSONObject.toString()>
		//   95  194:invokevirtual   #212 <Method void OutputStreamWriter.write(String)>
				outputstreamwriter.close();
		//   96  197:aload           4
		//   97  199:invokevirtual   #215 <Method void OutputStreamWriter.close()>
				((HttpURLConnection) (obj)).getInputStream().skip(0xffffffffL);
		//   98  202:aload_3         
		//   99  203:invokevirtual   #219 <Method InputStream HttpURLConnection.getInputStream()>
		//  100  206:ldc2w           #220 <Long 0xffffffffL>
		//  101  209:invokevirtual   #227 <Method long InputStream.skip(long)>
		//  102  212:pop2            
				return;
		//  103  213:return          
			} else
			{
				throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
		//  104  214:new             #229 <Class TypeCastException>
		//  105  217:dup             
		//  106  218:ldc1            #231 <String "null cannot be cast to non-null type java.net.HttpURLConnection">
		//  107  220:invokespecial   #232 <Method void TypeCastException(String)>
		//  108  223:athrow          
			}
		}

		private final String eventId;
		private final String publishableKey;
		final ApiService this$0;

		public VerifyEventTask(String s, String s1)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (s)), "publishableKey");
		//    0    0:aload_2         
		//    1    1:ldc1            #43  <String "publishableKey">
		//    2    3:invokestatic    #49  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Intrinsics.checkParameterIsNotNull(((Object) (s1)), "eventId");
		//    3    6:aload_3         
		//    4    7:ldc1            #50  <String "eventId">
		//    5    9:invokestatic    #49  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			this$0 = ApiService.this;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:putfield        #52  <Field ApiService this$0>
			super();
		//    9   17:aload_0         
		//   10   18:invokespecial   #55  <Method void AsyncTask()>
			publishableKey = s;
		//   11   21:aload_0         
		//   12   22:aload_2         
		//   13   23:putfield        #57  <Field String publishableKey>
			eventId = s1;
		//   14   26:aload_0         
		//   15   27:aload_3         
		//   16   28:putfield        #59  <Field String eventId>
		//   17   31:return          
		}
	}


	public ApiService(Context context1, IdentityRepository identityrepository, OptionsRepository optionsrepository, ApiClientRepository apiclientrepository, ConfigRepository configrepository, IntegrationHelper integrationhelper, DeviceHelper devicehelper)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context1)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #82  <String "context">
	//    2    3:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (identityrepository)), "identityRepository");
	//    3    6:aload_2         
	//    4    7:ldc1            #89  <String "identityRepository">
	//    5    9:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (optionsrepository)), "optionsRepository");
	//    6   12:aload_3         
	//    7   13:ldc1            #90  <String "optionsRepository">
	//    8   15:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (apiclientrepository)), "apiRepository");
	//    9   18:aload           4
	//   10   20:ldc1            #91  <String "apiRepository">
	//   11   22:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (configrepository)), "configRepository");
	//   12   25:aload           5
	//   13   27:ldc1            #92  <String "configRepository">
	//   14   29:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (integrationhelper)), "integrationHelper");
	//   15   32:aload           6
	//   16   34:ldc1            #93  <String "integrationHelper">
	//   17   36:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (devicehelper)), "deviceHelper");
	//   18   39:aload           7
	//   19   41:ldc1            #94  <String "deviceHelper">
	//   20   43:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super();
	//   21   46:aload_0         
	//   22   47:invokespecial   #97  <Method void Object()>
		context = context1;
	//   23   50:aload_0         
	//   24   51:aload_1         
	//   25   52:putfield        #99  <Field Context context>
		identityRepository = identityrepository;
	//   26   55:aload_0         
	//   27   56:aload_2         
	//   28   57:putfield        #101 <Field IdentityRepository identityRepository>
		optionsRepository = optionsrepository;
	//   29   60:aload_0         
	//   30   61:aload_3         
	//   31   62:putfield        #103 <Field OptionsRepository optionsRepository>
		apiRepository = apiclientrepository;
	//   32   65:aload_0         
	//   33   66:aload           4
	//   34   68:putfield        #105 <Field ApiClientRepository apiRepository>
		configRepository = configrepository;
	//   35   71:aload_0         
	//   36   72:aload           5
	//   37   74:putfield        #107 <Field ConfigRepository configRepository>
		integrationHelper = integrationhelper;
	//   38   77:aload_0         
	//   39   78:aload           6
	//   40   80:putfield        #109 <Field IntegrationHelper integrationHelper>
		deviceHelper = devicehelper;
	//   41   83:aload_0         
	//   42   84:aload           7
	//   43   86:putfield        #111 <Field DeviceHelper deviceHelper>
	//   44   89:aload_0         
	//   45   90:new             #113 <Class Handler>
	//   46   93:dup             
	//   47   94:invokestatic    #119 <Method Looper Looper.getMainLooper()>
	//   48   97:invokespecial   #122 <Method void Handler(Looper)>
	//   49  100:putfield        #124 <Field Handler handler>
	//   50  103:return          
	}

	private final String getIdType()
	{
		return (String)getLookupIdAndType().getSecond();
	//    0    0:aload_0         
	//    1    1:invokespecial   #155 <Method Pair getLookupIdAndType()>
	//    2    4:invokevirtual   #161 <Method Object Pair.getSecond()>
	//    3    7:checkcast       #163 <Class String>
	//    4   10:areturn         
	}

	private final String getLookupId()
	{
		return (String)getLookupIdAndType().getFirst();
	//    0    0:aload_0         
	//    1    1:invokespecial   #155 <Method Pair getLookupIdAndType()>
	//    2    4:invokevirtual   #166 <Method Object Pair.getFirst()>
	//    3    7:checkcast       #163 <Class String>
	//    4   10:areturn         
	}

	private final Pair getLookupIdAndType()
	{
		String s2 = identityRepository.getRadarId$sdk_release();
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field IdentityRepository identityRepository>
	//    2    4:invokevirtual   #171 <Method String IdentityRepository.getRadarId$sdk_release()>
	//    3    7:astore_3        
		String s1 = "_id";
	//    4    8:ldc1            #173 <String "_id">
	//    5   10:astore_2        
		String s = s2;
	//    6   11:aload_3         
	//    7   12:astore_1        
		if(s2 == null)
	//*   8   13:aload_3         
	//*   9   14:ifnonnull       50
		{
			s = identityRepository.getUserId$sdk_release();
	//   10   17:aload_0         
	//   11   18:getfield        #101 <Field IdentityRepository identityRepository>
	//   12   21:invokevirtual   #176 <Method String IdentityRepository.getUserId$sdk_release()>
	//   13   24:astore_1        
			if(s != null)
	//*  14   25:aload_1         
	//*  15   26:ifnull          35
			{
				s1 = "userId";
	//   16   29:ldc1            #178 <String "userId">
	//   17   31:astore_2        
			} else
	//*  18   32:goto            50
			{
				s = deviceHelper.getDeviceId$sdk_release(context);
	//   19   35:aload_0         
	//   20   36:getfield        #111 <Field DeviceHelper deviceHelper>
	//   21   39:aload_0         
	//   22   40:getfield        #99  <Field Context context>
	//   23   43:invokevirtual   #184 <Method String DeviceHelper.getDeviceId$sdk_release(Context)>
	//   24   46:astore_1        
				s1 = "deviceId";
	//   25   47:ldc1            #186 <String "deviceId">
	//   26   49:astore_2        
			}
		}
		return TuplesKt.to(((Object) (s)), ((Object) (s1)));
	//   27   50:aload_1         
	//   28   51:aload_2         
	//   29   52:invokestatic    #192 <Method Pair TuplesKt.to(Object, Object)>
	//   30   55:areturn         
	}

	private final boolean isSuccessful(HttpURLConnection httpurlconnection)
	{
		int i = httpurlconnection.getResponseCode();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #200 <Method int HttpURLConnection.getResponseCode()>
	//    2    4:istore_2        
		return 200 <= i && 300 > i;
	//    3    5:sipush          200
	//    4    8:iload_2         
	//    5    9:icmple          15
	//    6   12:goto            24
	//    7   15:sipush          300
	//    8   18:iload_2         
	//    9   19:icmple          24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	private final Map makeParams(Location location, boolean flag, boolean flag1, boolean flag2, String s)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #203 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #204 <Method void HashMap()>
	//    3    7:astore          8
		hashmap.put("longitude", ((Object) (Double.valueOf(location.getLongitude()))));
	//    4    9:aload           8
	//    5   11:ldc1            #206 <String "longitude">
	//    6   13:aload_1         
	//    7   14:invokevirtual   #212 <Method double Location.getLongitude()>
	//    8   17:invokestatic    #218 <Method Double Double.valueOf(double)>
	//    9   20:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//   10   23:pop             
		hashmap.put("latitude", ((Object) (Double.valueOf(location.getLatitude()))));
	//   11   24:aload           8
	//   12   26:ldc1            #224 <String "latitude">
	//   13   28:aload_1         
	//   14   29:invokevirtual   #227 <Method double Location.getLatitude()>
	//   15   32:invokestatic    #218 <Method Double Double.valueOf(double)>
	//   16   35:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//   17   38:pop             
		hashmap.put("accuracy", ((Object) (Float.valueOf(location.getAccuracy()))));
	//   18   39:aload           8
	//   19   41:ldc1            #229 <String "accuracy">
	//   20   43:aload_1         
	//   21   44:invokevirtual   #233 <Method float Location.getAccuracy()>
	//   22   47:invokestatic    #238 <Method Float Float.valueOf(float)>
	//   23   50:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//   24   53:pop             
		hashmap.put("altitude", ((Object) (Double.valueOf(location.getAltitude()))));
	//   25   54:aload           8
	//   26   56:ldc1            #240 <String "altitude">
	//   27   58:aload_1         
	//   28   59:invokevirtual   #243 <Method double Location.getAltitude()>
	//   29   62:invokestatic    #218 <Method Double Double.valueOf(double)>
	//   30   65:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//   31   68:pop             
		hashmap.put("speed", ((Object) (Float.valueOf(location.getSpeed()))));
	//   32   69:aload           8
	//   33   71:ldc1            #245 <String "speed">
	//   34   73:aload_1         
	//   35   74:invokevirtual   #248 <Method float Location.getSpeed()>
	//   36   77:invokestatic    #238 <Method Float Float.valueOf(float)>
	//   37   80:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//   38   83:pop             
		hashmap.put("course", ((Object) (Float.valueOf(location.getBearing()))));
	//   39   84:aload           8
	//   40   86:ldc1            #250 <String "course">
	//   41   88:aload_1         
	//   42   89:invokevirtual   #253 <Method float Location.getBearing()>
	//   43   92:invokestatic    #238 <Method Float Float.valueOf(float)>
	//   44   95:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//   45   98:pop             
		if(!flag1 && android.os.Build.VERSION.SDK_INT >= 17)
	//*  46   99:iload_3         
	//*  47  100:ifne            140
	//*  48  103:getstatic       #259 <Field int android.os.Build$VERSION.SDK_INT>
	//*  49  106:bipush          17
	//*  50  108:icmplt          140
		{
			long l = location.getElapsedRealtimeNanos();
	//   51  111:aload_1         
	//   52  112:invokevirtual   #263 <Method long Location.getElapsedRealtimeNanos()>
	//   53  115:lstore          6
			hashmap.put("updatedAtMsDiff", ((Object) (Long.valueOf((SystemClock.elapsedRealtimeNanos() - l) / (long)0xf4240))));
	//   54  117:aload           8
	//   55  119:ldc2            #265 <String "updatedAtMsDiff">
	//   56  122:invokestatic    #270 <Method long SystemClock.elapsedRealtimeNanos()>
	//   57  125:lload           6
	//   58  127:lsub            
	//   59  128:ldc2            #271 <Int 0xf4240>
	//   60  131:i2l             
	//   61  132:ldiv            
	//   62  133:invokestatic    #276 <Method Long Long.valueOf(long)>
	//   63  136:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//   64  139:pop             
		}
		if(flag2)
	//*  65  140:iload           4
	//*  66  142:ifeq            159
			hashmap.put("replayed", ((Object) (Boolean.valueOf(flag2))));
	//   67  145:aload           8
	//   68  147:ldc2            #277 <String "replayed">
	//   69  150:iload           4
	//   70  152:invokestatic    #282 <Method Boolean Boolean.valueOf(boolean)>
	//   71  155:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//   72  158:pop             
		hashmap.put("foreground", ((Object) (Boolean.valueOf(flag1))));
	//   73  159:aload           8
	//   74  161:ldc2            #283 <String "foreground">
	//   75  164:iload_3         
	//   76  165:invokestatic    #282 <Method Boolean Boolean.valueOf(boolean)>
	//   77  168:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//   78  171:pop             
		hashmap.put("stopped", ((Object) (Boolean.valueOf(flag))));
	//   79  172:aload           8
	//   80  174:ldc2            #284 <String "stopped">
	//   81  177:iload_2         
	//   82  178:invokestatic    #282 <Method Boolean Boolean.valueOf(boolean)>
	//   83  181:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//   84  184:pop             
		hashmap.put("deviceType", "Android");
	//   85  185:aload           8
	//   86  187:ldc2            #286 <String "deviceType">
	//   87  190:ldc2            #288 <String "Android">
	//   88  193:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//   89  196:pop             
		hashmap.put("deviceMake", ((Object) (deviceHelper.getMake$sdk_release())));
	//   90  197:aload           8
	//   91  199:ldc2            #290 <String "deviceMake">
	//   92  202:aload_0         
	//   93  203:getfield        #111 <Field DeviceHelper deviceHelper>
	//   94  206:invokevirtual   #293 <Method String DeviceHelper.getMake$sdk_release()>
	//   95  209:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//   96  212:pop             
		hashmap.put("deviceModel", ((Object) (deviceHelper.getModel$sdk_release())));
	//   97  213:aload           8
	//   98  215:ldc2            #295 <String "deviceModel">
	//   99  218:aload_0         
	//  100  219:getfield        #111 <Field DeviceHelper deviceHelper>
	//  101  222:invokevirtual   #298 <Method String DeviceHelper.getModel$sdk_release()>
	//  102  225:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  103  228:pop             
		hashmap.put("deviceOS", ((Object) (deviceHelper.getOs$sdk_release())));
	//  104  229:aload           8
	//  105  231:ldc2            #300 <String "deviceOS">
	//  106  234:aload_0         
	//  107  235:getfield        #111 <Field DeviceHelper deviceHelper>
	//  108  238:invokevirtual   #303 <Method String DeviceHelper.getOs$sdk_release()>
	//  109  241:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  110  244:pop             
		hashmap.put("country", ((Object) (deviceHelper.getCountry$sdk_release())));
	//  111  245:aload           8
	//  112  247:ldc2            #305 <String "country">
	//  113  250:aload_0         
	//  114  251:getfield        #111 <Field DeviceHelper deviceHelper>
	//  115  254:invokevirtual   #308 <Method String DeviceHelper.getCountry$sdk_release()>
	//  116  257:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  117  260:pop             
		hashmap.put("timeZoneOffset", ((Object) (Integer.valueOf(deviceHelper.getTimeZoneOffset$sdk_release()))));
	//  118  261:aload           8
	//  119  263:ldc2            #310 <String "timeZoneOffset">
	//  120  266:aload_0         
	//  121  267:getfield        #111 <Field DeviceHelper deviceHelper>
	//  122  270:invokevirtual   #313 <Method int DeviceHelper.getTimeZoneOffset$sdk_release()>
	//  123  273:invokestatic    #318 <Method Integer Integer.valueOf(int)>
	//  124  276:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  125  279:pop             
		location = ((Location) (deviceHelper));
	//  126  280:aload_0         
	//  127  281:getfield        #111 <Field DeviceHelper deviceHelper>
	//  128  284:astore_1        
		hashmap.put("sdkVersion", "2.1.5");
	//  129  285:aload           8
	//  130  287:ldc2            #320 <String "sdkVersion">
	//  131  290:ldc2            #322 <String "2.1.5">
	//  132  293:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  133  296:pop             
		hashmap.put("deviceId", ((Object) (deviceHelper.getDeviceId$sdk_release(context))));
	//  134  297:aload           8
	//  135  299:ldc1            #186 <String "deviceId">
	//  136  301:aload_0         
	//  137  302:getfield        #111 <Field DeviceHelper deviceHelper>
	//  138  305:aload_0         
	//  139  306:getfield        #99  <Field Context context>
	//  140  309:invokevirtual   #184 <Method String DeviceHelper.getDeviceId$sdk_release(Context)>
	//  141  312:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  142  315:pop             
		location = ((Location) (identityRepository.getUserId$sdk_release()));
	//  143  316:aload_0         
	//  144  317:getfield        #101 <Field IdentityRepository identityRepository>
	//  145  320:invokevirtual   #176 <Method String IdentityRepository.getUserId$sdk_release()>
	//  146  323:astore_1        
		if(location != null)
	//* 147  324:aload_1         
	//* 148  325:ifnull          337
			hashmap.put("userId", ((Object) (location)));
	//  149  328:aload           8
	//  150  330:ldc1            #178 <String "userId">
	//  151  332:aload_1         
	//  152  333:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  153  336:pop             
		location = ((Location) (identityRepository.getUserDescription$sdk_release()));
	//  154  337:aload_0         
	//  155  338:getfield        #101 <Field IdentityRepository identityRepository>
	//  156  341:invokevirtual   #325 <Method String IdentityRepository.getUserDescription$sdk_release()>
	//  157  344:astore_1        
		if(location != null)
	//* 158  345:aload_1         
	//* 159  346:ifnull          359
			hashmap.put("description", ((Object) (location)));
	//  160  349:aload           8
	//  161  351:ldc2            #327 <String "description">
	//  162  354:aload_1         
	//  163  355:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  164  358:pop             
		location = ((Location) (identityRepository.getUserMetadata$sdk_release()));
	//  165  359:aload_0         
	//  166  360:getfield        #101 <Field IdentityRepository identityRepository>
	//  167  363:invokevirtual   #330 <Method String IdentityRepository.getUserMetadata$sdk_release()>
	//  168  366:astore_1        
		if(location != null)
	//* 169  367:aload_1         
	//* 170  368:ifnull          381
			hashmap.put("metadata", ((Object) (location)));
	//  171  371:aload           8
	//  172  373:ldc2            #332 <String "metadata">
	//  173  376:aload_1         
	//  174  377:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  175  380:pop             
		hashmap.put("idType", ((Object) (getIdType())));
	//  176  381:aload           8
	//  177  383:ldc2            #334 <String "idType">
	//  178  386:aload_0         
	//  179  387:invokespecial   #336 <Method String getIdType()>
	//  180  390:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  181  393:pop             
		location = ((Location) (apiRepository.getAdId$sdk_release()));
	//  182  394:aload_0         
	//  183  395:getfield        #105 <Field ApiClientRepository apiRepository>
	//  184  398:invokevirtual   #341 <Method String ApiClientRepository.getAdId$sdk_release()>
	//  185  401:astore_1        
		if(location != null)
	//* 186  402:aload_1         
	//* 187  403:ifnull          416
			hashmap.put("adId", ((Object) (location)));
	//  188  406:aload           8
	//  189  408:ldc2            #343 <String "adId">
	//  190  411:aload_1         
	//  191  412:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  192  415:pop             
		if(s != null)
	//* 193  416:aload           5
	//* 194  418:ifnull          432
			hashmap.put("facebookPlaces", ((Object) (s)));
	//  195  421:aload           8
	//  196  423:ldc2            #344 <String "facebookPlaces">
	//  197  426:aload           5
	//  198  428:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  199  431:pop             
		if(optionsRepository.getPlacesProvider$sdk_release() == io.radar.sdk.Radar.RadarPlacesProvider.FACEBOOK)
	//* 200  432:aload_0         
	//* 201  433:getfield        #103 <Field OptionsRepository optionsRepository>
	//* 202  436:invokevirtual   #350 <Method io.radar.sdk.Radar$RadarPlacesProvider OptionsRepository.getPlacesProvider$sdk_release()>
	//* 203  439:getstatic       #356 <Field io.radar.sdk.Radar$RadarPlacesProvider io.radar.sdk.Radar$RadarPlacesProvider.FACEBOOK>
	//* 204  442:if_acmpne       457
			hashmap.put("placesProvider", "facebook");
	//  205  445:aload           8
	//  206  447:ldc2            #358 <String "placesProvider">
	//  207  450:ldc2            #360 <String "facebook">
	//  208  453:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  209  456:pop             
		hashmap.put("facebookVersion", ((Object) (configRepository.getFacebookApiVersion$sdk_release())));
	//  210  457:aload           8
	//  211  459:ldc2            #362 <String "facebookVersion">
	//  212  462:aload_0         
	//  213  463:getfield        #107 <Field ConfigRepository configRepository>
	//  214  466:invokevirtual   #367 <Method String ConfigRepository.getFacebookApiVersion$sdk_release()>
	//  215  469:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  216  472:pop             
		location = ((Location) (integrationHelper.getUrbanAirshipChannelId()));
	//  217  473:aload_0         
	//  218  474:getfield        #109 <Field IntegrationHelper integrationHelper>
	//  219  477:invokevirtual   #372 <Method String IntegrationHelper.getUrbanAirshipChannelId()>
	//  220  480:astore_1        
		if(location != null)
	//* 221  481:aload_1         
	//* 222  482:ifnull          507
		{
			hashmap.put("uaChannelId", ((Object) (location)));
	//  223  485:aload           8
	//  224  487:ldc2            #374 <String "uaChannelId">
	//  225  490:aload_1         
	//  226  491:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  227  494:pop             
			hashmap.put("uaSessionId", "radar");
	//  228  495:aload           8
	//  229  497:ldc2            #376 <String "uaSessionId">
	//  230  500:ldc2            #378 <String "radar">
	//  231  503:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  232  506:pop             
		}
		location = ((Location) (integrationHelper.getUrbanAirshipNamedUserId()));
	//  233  507:aload_0         
	//  234  508:getfield        #109 <Field IntegrationHelper integrationHelper>
	//  235  511:invokevirtual   #381 <Method String IntegrationHelper.getUrbanAirshipNamedUserId()>
	//  236  514:astore_1        
		if(location != null)
	//* 237  515:aload_1         
	//* 238  516:ifnull          529
			hashmap.put("uaNamedUserId", ((Object) (location)));
	//  239  519:aload           8
	//  240  521:ldc2            #383 <String "uaNamedUserId">
	//  241  524:aload_1         
	//  242  525:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  243  528:pop             
		location = ((Location) (integrationHelper.getUrbanAirshipSessionId()));
	//  244  529:aload_0         
	//  245  530:getfield        #109 <Field IntegrationHelper integrationHelper>
	//  246  533:invokevirtual   #386 <Method String IntegrationHelper.getUrbanAirshipSessionId()>
	//  247  536:astore_1        
		if(location != null)
	//* 248  537:aload_1         
	//* 249  538:ifnull          551
			hashmap.put("uaSessionId", ((Object) (location)));
	//  250  541:aload           8
	//  251  543:ldc2            #376 <String "uaSessionId">
	//  252  546:aload_1         
	//  253  547:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//  254  550:pop             
		return (Map)hashmap;
	//  255  551:aload           8
	//  256  553:checkcast       #388 <Class Map>
	//  257  556:areturn         
	}

	static Map makeParams$default(ApiService apiservice, Location location, boolean flag, boolean flag1, boolean flag2, String s, int i, Object obj)
	{
		if((i & 8) != 0)
	//*   0    0:iload           6
	//*   1    2:bipush          8
	//*   2    4:iand            
	//*   3    5:ifeq            14
			flag2 = false;
	//    4    8:iconst_0        
	//    5    9:istore          4
	//*   6   11:goto            14
		if((i & 0x10) != 0)
	//*   7   14:iload           6
	//*   8   16:bipush          16
	//*   9   18:iand            
	//*  10   19:ifeq            28
			s = (String)null;
	//   11   22:aconst_null     
	//   12   23:checkcast       #163 <Class String>
	//   13   26:astore          5
		return apiservice.makeParams(location, flag, flag1, flag2, s);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:iload_2         
	//   17   31:iload_3         
	//   18   32:iload           4
	//   19   34:aload           5
	//   20   36:invokespecial   #393 <Method Map makeParams(Location, boolean, boolean, boolean, String)>
	//   21   39:areturn         
	}

	private final String readAll(InputStream inputstream)
	{
		Object obj = ((Object) ((new Scanner(inputstream, "UTF-8")).useDelimiter("\\A")));
	//    0    0:new             #395 <Class Scanner>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc2            #397 <String "UTF-8">
	//    4    8:invokespecial   #400 <Method void Scanner(InputStream, String)>
	//    5   11:ldc2            #402 <String "\\A">
	//    6   14:invokevirtual   #406 <Method Scanner Scanner.useDelimiter(String)>
	//    7   17:astore_2        
		if(((Scanner) (obj)).hasNext())
	//*   8   18:aload_2         
	//*   9   19:invokevirtual   #410 <Method boolean Scanner.hasNext()>
	//*  10   22:ifeq            33
			obj = ((Object) (((Scanner) (obj)).next()));
	//   11   25:aload_2         
	//   12   26:invokevirtual   #413 <Method String Scanner.next()>
	//   13   29:astore_2        
		else
	//*  14   30:goto            35
			obj = null;
	//   15   33:aconst_null     
	//   16   34:astore_2        
		inputstream.close();
	//   17   35:aload_1         
	//   18   36:invokevirtual   #418 <Method void InputStream.close()>
		return ((String) (obj));
	//   19   39:aload_2         
	//   20   40:areturn         
	}

	public static void verifyEvent$default(ApiService apiservice, String s, String s1, io.radar.sdk.model.RadarEvent.RadarEventVerification radareventverification, String s2, int i, Object obj)
	{
		if((i & 8) != 0)
	//*   0    0:iload           5
	//*   1    2:bipush          8
	//*   2    4:iand            
	//*   3    5:ifeq            14
			s2 = (String)null;
	//    4    8:aconst_null     
	//    5    9:checkcast       #163 <Class String>
	//    6   12:astore          4
		apiservice.verifyEvent(s, s1, radareventverification, s2);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:aload_3         
	//   11   18:aload           4
	//   12   20:invokevirtual   #423 <Method void verifyEvent(String, String, io.radar.sdk.model.RadarEvent$RadarEventVerification, String)>
	//   13   23:return          
	}

	public final void fetchPlaces(Location location, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (location)), "location");
	//    0    0:aload_1         
	//    1    1:ldc2            #425 <String "location">
	//    2    4:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "callback");
	//    3    7:aload_2         
	//    4    8:ldc2            #426 <String "callback">
	//    5   11:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(optionsRepository.getPlacesProvider$sdk_release() != io.radar.sdk.Radar.RadarPlacesProvider.FACEBOOK)
	//*   6   14:aload_0         
	//*   7   15:getfield        #103 <Field OptionsRepository optionsRepository>
	//*   8   18:invokevirtual   #350 <Method io.radar.sdk.Radar$RadarPlacesProvider OptionsRepository.getPlacesProvider$sdk_release()>
	//*   9   21:getstatic       #356 <Field io.radar.sdk.Radar$RadarPlacesProvider io.radar.sdk.Radar$RadarPlacesProvider.FACEBOOK>
	//*  10   24:if_acmpeq       36
		{
			function1.invoke(((Object) (null)));
	//   11   27:aload_2         
	//   12   28:aconst_null     
	//   13   29:invokeinterface #432 <Method Object Function1.invoke(Object)>
	//   14   34:pop             
			return;
	//   15   35:return          
		}
		String s = integrationHelper.getFacebookAccessToken();
	//   16   36:aload_0         
	//   17   37:getfield        #109 <Field IntegrationHelper integrationHelper>
	//   18   40:invokevirtual   #435 <Method String IntegrationHelper.getFacebookAccessToken()>
	//   19   43:astore_3        
		if(s != null)
	//*  20   44:aload_3         
	//*  21   45:ifnull          144
		{
			Date date = new Date();
	//   22   48:new             #437 <Class Date>
	//   23   51:dup             
	//   24   52:invokespecial   #438 <Method void Date()>
	//   25   55:astore          4
			Date date1 = apiRepository.getPlacesLimitAt$sdk_release();
	//   26   57:aload_0         
	//   27   58:getfield        #105 <Field ApiClientRepository apiRepository>
	//   28   61:invokevirtual   #442 <Method Date ApiClientRepository.getPlacesLimitAt$sdk_release()>
	//   29   64:astore          5
			if(date1 != null)
	//*  30   66:aload           5
	//*  31   68:ifnull          121
			{
				if(date.getTime() - date1.getTime() < 0x5265c00L)
	//*  32   71:aload           4
	//*  33   73:invokevirtual   #445 <Method long Date.getTime()>
	//*  34   76:aload           5
	//*  35   78:invokevirtual   #445 <Method long Date.getTime()>
	//*  36   81:lsub            
	//*  37   82:ldc2w           #446 <Long 0x5265c00L>
	//*  38   85:lcmp            
	//*  39   86:ifge            110
				{
					RadarLogger.d$default(RadarLogger.INSTANCE, "Skipping places request, Facebook backoff in effect", ((Throwable) (null)), 2, ((Object) (null)));
	//   40   89:getstatic       #453 <Field RadarLogger RadarLogger.INSTANCE>
	//   41   92:ldc2            #455 <String "Skipping places request, Facebook backoff in effect">
	//   42   95:aconst_null     
	//   43   96:iconst_2        
	//   44   97:aconst_null     
	//   45   98:invokestatic    #459 <Method void RadarLogger.d$default(RadarLogger, String, Throwable, int, Object)>
					function1.invoke(((Object) (null)));
	//   46  101:aload_2         
	//   47  102:aconst_null     
	//   48  103:invokeinterface #432 <Method Object Function1.invoke(Object)>
	//   49  108:pop             
					return;
	//   50  109:return          
				}
				apiRepository.setPlacesLimitAt$sdk_release((Date)null);
	//   51  110:aload_0         
	//   52  111:getfield        #105 <Field ApiClientRepository apiRepository>
	//   53  114:aconst_null     
	//   54  115:checkcast       #437 <Class Date>
	//   55  118:invokevirtual   #463 <Method void ApiClientRepository.setPlacesLimitAt$sdk_release(Date)>
			}
			handler.post((Runnable)new Runnable(this, s, function1, location) {

				public final void run()
				{
					(new FacebookPlacesTask($fbAccessToken, $callback)).execute(((Object []) (new Location[] {
						$location
					})));
				//    0    0:new             #49  <Class ApiService$FacebookPlacesTask>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:getfield        #37  <Field ApiService this$0>
				//    4    8:aload_0         
				//    5    9:getfield        #39  <Field String $fbAccessToken>
				//    6   12:aload_0         
				//    7   13:getfield        #41  <Field Function1 $callback>
				//    8   16:invokespecial   #52  <Method void ApiService$FacebookPlacesTask(ApiService, String, Function1)>
				//    9   19:iconst_1        
				//   10   20:anewarray       Location[]
				//   11   23:dup             
				//   12   24:iconst_0        
				//   13   25:aload_0         
				//   14   26:getfield        #43  <Field Location $location>
				//   15   29:aastore         
				//   16   30:invokevirtual   #58  <Method AsyncTask ApiService$FacebookPlacesTask.execute(Object[])>
				//   17   33:pop             
				//   18   34:return          
				}

				final Function1 $callback;
				final String $fbAccessToken;
				final Location $location;
				final ApiService this$0;

			
			{
				this$0 = apiservice;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #37  <Field ApiService this$0>
				$fbAccessToken = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #39  <Field String $fbAccessToken>
				$callback = function1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #41  <Field Function1 $callback>
				$location = location;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #43  <Field Location $location>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #46  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   56  121:aload_0         
	//   57  122:getfield        #124 <Field Handler handler>
	//   58  125:new             #15  <Class ApiService$fetchPlaces$1>
	//   59  128:dup             
	//   60  129:aload_0         
	//   61  130:aload_3         
	//   62  131:aload_2         
	//   63  132:aload_1         
	//   64  133:invokespecial   #466 <Method void ApiService$fetchPlaces$1(ApiService, String, Function1, Location)>
	//   65  136:checkcast       #468 <Class Runnable>
	//   66  139:invokevirtual   #472 <Method boolean Handler.post(Runnable)>
	//   67  142:pop             
			return;
	//   68  143:return          
		} else
		{
			function1.invoke(((Object) (null)));
	//   69  144:aload_2         
	//   70  145:aconst_null     
	//   71  146:invokeinterface #432 <Method Object Function1.invoke(Object)>
	//   72  151:pop             
			return;
	//   73  152:return          
		}
	}

	public final void userUpsert(String s, Location location, boolean flag, boolean flag1, boolean flag2, String s1, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "publishableKey");
	//    0    0:aload_1         
	//    1    1:ldc2            #475 <String "publishableKey">
	//    2    4:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (location)), "location");
	//    3    7:aload_2         
	//    4    8:ldc2            #425 <String "location">
	//    5   11:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "callback");
	//    6   14:aload           7
	//    7   16:ldc2            #426 <String "callback">
	//    8   19:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		s1 = ((String) (makeParams(location, flag, flag1, flag2, s1)));
	//    9   22:aload_0         
	//   10   23:aload_2         
	//   11   24:iload_3         
	//   12   25:iload           4
	//   13   27:iload           5
	//   14   29:aload           6
	//   15   31:invokespecial   #393 <Method Map makeParams(Location, boolean, boolean, boolean, String)>
	//   16   34:astore          6
		handler.post((Runnable)new Runnable(this, s, location, function1, ((Map) (s1))) {

			public final void run()
			{
				(new PutUserTask($publishableKey, $location, $callback)).execute(((Object []) (new Map[] {
					$params
				})));
			//    0    0:new             #53  <Class ApiService$PutUserTask>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #39  <Field ApiService this$0>
			//    4    8:aload_0         
			//    5    9:getfield        #41  <Field String $publishableKey>
			//    6   12:aload_0         
			//    7   13:getfield        #43  <Field Location $location>
			//    8   16:aload_0         
			//    9   17:getfield        #45  <Field Function1 $callback>
			//   10   20:invokespecial   #56  <Method void ApiService$PutUserTask(ApiService, String, Location, Function1)>
			//   11   23:iconst_1        
			//   12   24:anewarray       Map[]
			//   13   27:dup             
			//   14   28:iconst_0        
			//   15   29:aload_0         
			//   16   30:getfield        #47  <Field Map $params>
			//   17   33:aastore         
			//   18   34:invokevirtual   #62  <Method AsyncTask ApiService$PutUserTask.execute(Object[])>
			//   19   37:pop             
			//   20   38:return          
			}

			final Function1 $callback;
			final Location $location;
			final Map $params;
			final String $publishableKey;
			final ApiService this$0;

			
			{
				this$0 = apiservice;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #39  <Field ApiService this$0>
				$publishableKey = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #41  <Field String $publishableKey>
				$location = location;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #43  <Field Location $location>
				$callback = function1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #45  <Field Function1 $callback>
				$params = map;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #47  <Field Map $params>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #50  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//   17   36:aload_0         
	//   18   37:getfield        #124 <Field Handler handler>
	//   19   40:new             #17  <Class ApiService$userUpsert$1>
	//   20   43:dup             
	//   21   44:aload_0         
	//   22   45:aload_1         
	//   23   46:aload_2         
	//   24   47:aload           7
	//   25   49:aload           6
	//   26   51:invokespecial   #478 <Method void ApiService$userUpsert$1(ApiService, String, Location, Function1, Map)>
	//   27   54:checkcast       #468 <Class Runnable>
	//   28   57:invokevirtual   #472 <Method boolean Handler.post(Runnable)>
	//   29   60:pop             
	//   30   61:return          
	}

	public final void verifyEvent(String s, String s1, io.radar.sdk.model.RadarEvent.RadarEventVerification radareventverification, String s2)
	{
		HashMap hashmap;
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "publishableKey");
	//    0    0:aload_1         
	//    1    1:ldc2            #475 <String "publishableKey">
	//    2    4:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "eventId");
	//    3    7:aload_2         
	//    4    8:ldc2            #480 <String "eventId">
	//    5   11:invokestatic    #88  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		hashmap = new HashMap();
	//    6   14:new             #203 <Class HashMap>
	//    7   17:dup             
	//    8   18:invokespecial   #204 <Method void HashMap()>
	//    9   21:astore          5
		if(radareventverification != null) goto _L2; else goto _L1
	//   10   23:aload_3         
	//   11   24:ifnonnull       30
	//*  12   27:goto            77
_L2:
		WhenMappings..EnumSwitchMapping._fld0[radareventverification.ordinal()];
	//   13   30:getstatic       #486 <Field int[] ApiService$WhenMappings.$EnumSwitchMapping$0>
	//   14   33:aload_3         
	//   15   34:invokevirtual   #491 <Method int io.radar.sdk.model.RadarEvent$RadarEventVerification.ordinal()>
	//   16   37:iaload          
		JVM INSTR tableswitch 1 2: default 60
	//	               1 70
	//	               2 63;
	//   17   38:tableswitch     1 2: default 60
	//	               1 70
	//	               2 63
		   goto _L1 _L3 _L4
	//*  18   60:goto            77
_L4:
		radareventverification = "-1";
	//   19   63:ldc2            #493 <String "-1">
	//   20   66:astore_3        
		break; /* Loop/switch isn't completed */
	//   21   67:goto            81
_L3:
		radareventverification = "1";
	//   22   70:ldc2            #495 <String "1">
	//   23   73:astore_3        
		break; /* Loop/switch isn't completed */
	//   24   74:goto            81
_L1:
		radareventverification = "0";
	//   25   77:ldc2            #497 <String "0">
	//   26   80:astore_3        
		hashmap.put("verification", ((Object) (radareventverification)));
	//   27   81:aload           5
	//   28   83:ldc2            #498 <String "verification">
	//   29   86:aload_3         
	//   30   87:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//   31   90:pop             
		if(s2 != null)
	//*  32   91:aload           4
	//*  33   93:ifnull          107
			hashmap.put("verifiedPlaceId", ((Object) (s2)));
	//   34   96:aload           5
	//   35   98:ldc2            #500 <String "verifiedPlaceId">
	//   36  101:aload           4
	//   37  103:invokevirtual   #222 <Method Object HashMap.put(Object, Object)>
	//   38  106:pop             
		handler.post((Runnable)new Runnable(this, s, s1, hashmap) {

			public final void run()
			{
				(new VerifyEventTask($publishableKey, $eventId)).execute(((Object []) (new Map[] {
					(Map)$params
				})));
			//    0    0:new             #48  <Class ApiService$VerifyEventTask>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #36  <Field ApiService this$0>
			//    4    8:aload_0         
			//    5    9:getfield        #38  <Field String $publishableKey>
			//    6   12:aload_0         
			//    7   13:getfield        #40  <Field String $eventId>
			//    8   16:invokespecial   #51  <Method void ApiService$VerifyEventTask(ApiService, String, String)>
			//    9   19:iconst_1        
			//   10   20:anewarray       Map[]
			//   11   23:dup             
			//   12   24:iconst_0        
			//   13   25:aload_0         
			//   14   26:getfield        #42  <Field HashMap $params>
			//   15   29:checkcast       #53  <Class Map>
			//   16   32:aastore         
			//   17   33:invokevirtual   #57  <Method AsyncTask ApiService$VerifyEventTask.execute(Object[])>
			//   18   36:pop             
			//   19   37:return          
			}

			final String $eventId;
			final HashMap $params;
			final String $publishableKey;
			final ApiService this$0;

			
			{
				this$0 = apiservice;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #36  <Field ApiService this$0>
				$publishableKey = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #38  <Field String $publishableKey>
				$eventId = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #40  <Field String $eventId>
				$params = hashmap;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #42  <Field HashMap $params>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #45  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//   39  107:aload_0         
	//   40  108:getfield        #124 <Field Handler handler>
	//   41  111:new             #19  <Class ApiService$verifyEvent$1>
	//   42  114:dup             
	//   43  115:aload_0         
	//   44  116:aload_1         
	//   45  117:aload_2         
	//   46  118:aload           5
	//   47  120:invokespecial   #503 <Method void ApiService$verifyEvent$1(ApiService, String, String, HashMap)>
	//   48  123:checkcast       #468 <Class Runnable>
	//   49  126:invokevirtual   #472 <Method boolean Handler.post(Runnable)>
	//   50  129:pop             
		return;
	//   51  130:return          
	}

	private final ApiClientRepository apiRepository;
	private final ConfigRepository configRepository;
	private final Context context;
	private final DeviceHelper deviceHelper;
	private final Handler handler = new Handler(Looper.getMainLooper());
	private final IdentityRepository identityRepository;
	private final IntegrationHelper integrationHelper;
	private final OptionsRepository optionsRepository;


/*
	public static final ApiClientRepository access$getApiRepository$p(ApiService apiservice)
	{
		return apiservice.apiRepository;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ApiClientRepository apiRepository>
	//    2    4:areturn         
	}

*/


/*
	public static final ConfigRepository access$getConfigRepository$p(ApiService apiservice)
	{
		return apiservice.configRepository;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field ConfigRepository configRepository>
	//    2    4:areturn         
	}

*/


/*
	public static final IdentityRepository access$getIdentityRepository$p(ApiService apiservice)
	{
		return apiservice.identityRepository;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field IdentityRepository identityRepository>
	//    2    4:areturn         
	}

*/


/*
	public static final String access$getLookupId(ApiService apiservice)
	{
		return apiservice.getLookupId();
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method String getLookupId()>
	//    2    4:areturn         
	}

*/


/*
	public static final OptionsRepository access$getOptionsRepository$p(ApiService apiservice)
	{
		return apiservice.optionsRepository;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field OptionsRepository optionsRepository>
	//    2    4:areturn         
	}

*/


/*
	public static final boolean access$isSuccessful(ApiService apiservice, HttpURLConnection httpurlconnection)
	{
		return apiservice.isSuccessful(httpurlconnection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #146 <Method boolean isSuccessful(HttpURLConnection)>
	//    3    5:ireturn         
	}

*/


/*
	public static final String access$readAll(ApiService apiservice, InputStream inputstream)
	{
		return apiservice.readAll(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #152 <Method String readAll(InputStream)>
	//    3    5:areturn         
	}

*/

	private class WhenMappings
	{

		public static final int $EnumSwitchMapping$0[];

		static 
		{
			$EnumSwitchMapping$0 = new int[io.radar.sdk.model.RadarEvent.RadarEventVerification.values().length];
		//    0    0:invokestatic    #22  <Method io.radar.sdk.model.RadarEvent$RadarEventVerification[] io.radar.sdk.model.RadarEvent$RadarEventVerification.values()>
		//    1    3:arraylength     
		//    2    4:newarray        int[]
		//    3    6:putstatic       #24  <Field int[] $EnumSwitchMapping$0>
			$EnumSwitchMapping$0[io.radar.sdk.model.RadarEvent.RadarEventVerification.ACCEPT.ordinal()] = 1;
		//    4    9:getstatic       #24  <Field int[] $EnumSwitchMapping$0>
		//    5   12:getstatic       #28  <Field io.radar.sdk.model.RadarEvent$RadarEventVerification io.radar.sdk.model.RadarEvent$RadarEventVerification.ACCEPT>
		//    6   15:invokevirtual   #32  <Method int io.radar.sdk.model.RadarEvent$RadarEventVerification.ordinal()>
		//    7   18:iconst_1        
		//    8   19:iastore         
			$EnumSwitchMapping$0[io.radar.sdk.model.RadarEvent.RadarEventVerification.REJECT.ordinal()] = 2;
		//    9   20:getstatic       #24  <Field int[] $EnumSwitchMapping$0>
		//   10   23:getstatic       #35  <Field io.radar.sdk.model.RadarEvent$RadarEventVerification io.radar.sdk.model.RadarEvent$RadarEventVerification.REJECT>
		//   11   26:invokevirtual   #32  <Method int io.radar.sdk.model.RadarEvent$RadarEventVerification.ordinal()>
		//   12   29:iconst_2        
		//   13   30:iastore         
		//*  14   31:return          
		}
	}

}
