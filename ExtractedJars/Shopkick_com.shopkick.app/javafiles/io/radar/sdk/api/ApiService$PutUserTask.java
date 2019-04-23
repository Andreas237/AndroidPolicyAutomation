// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import io.radar.sdk.config.ConfigRepository;
import io.radar.sdk.internal.RadarLogger;
import io.radar.sdk.internal.repository.IdentityRepository;
import io.radar.sdk.internal.repository.OptionsRepository;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarUser;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package io.radar.sdk.api:
//			ApiService, Error, RadarResponse, ApiClientRepository, 
//			Success

private final class ApiService$PutUserTask extends AsyncTask
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
					if(!ApiService.access$isSuccessful(ApiService.this, httpurlconnection))
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
	//   15   30:invokevirtual   #131 <Method java.io.InputStream HttpURLConnection.getInputStream()>
	//   16   33:astore_2        
					Intrinsics.checkExpressionValueIsNotNull(((Object) (httpurlconnection)), "httpURLConnection.inputStream");
	//   17   34:aload_2         
	//   18   35:ldc1            #133 <String "httpURLConnection.inputStream">
	//   19   37:invokestatic    #136 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
					obj = ((Object) (new JSONObject(ApiService.access$readAll(((ApiService) (obj)), ((java.io.InputStream) (httpurlconnection))))));
	//   20   40:new             #138 <Class JSONObject>
	//   21   43:dup             
	//   22   44:aload           5
	//   23   46:aload_2         
	//   24   47:invokestatic    #142 <Method String ApiService.access$readAll(ApiService, java.io.InputStream)>
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
							ApiService.access$getConfigRepository$p(ApiService.this).saveConfigJson$sdk_release(((JSONObject) (httpurlconnection)));
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
				ApiService.access$getIdentityRepository$p(ApiService.this).setRadarId$sdk_release(radaruser.getId());
	//   74  150:aload_0         
	//   75  151:getfield        #61  <Field ApiService this$0>
	//   76  154:invokestatic    #198 <Method IdentityRepository ApiService.access$getIdentityRepository$p(ApiService)>
	//   77  157:aload           6
	//   78  159:invokevirtual   #202 <Method String RadarUser.getId()>
	//   79  162:invokevirtual   #207 <Method void IdentityRepository.setRadarId$sdk_release(String)>
				if(ApiService.access$getOptionsRepository$p(ApiService.this).getPlacesProvider$sdk_release() == io.radar.sdk.er.FACEBOOK)
	//*  80  165:aload_0         
	//*  81  166:getfield        #61  <Field ApiService this$0>
	//*  82  169:invokestatic    #211 <Method OptionsRepository ApiService.access$getOptionsRepository$p(ApiService)>
	//*  83  172:invokevirtual   #217 <Method io.radar.sdk.Radar$RadarPlacesProvider OptionsRepository.getPlacesProvider$sdk_release()>
	//*  84  175:getstatic       #223 <Field io.radar.sdk.Radar$RadarPlacesProvider io.radar.sdk.Radar$RadarPlacesProvider.FACEBOOK>
	//*  85  178:if_acmpne       211
				{
					ApiClientRepository apiclientrepository = ApiService.access$getApiRepository$p(ApiService.this);
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
					ApiService.access$getApiRepository$p(ApiService.this).setAtPlace$sdk_release(false);
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
		Object obj = ((Object) (new URL(Uri.parse(ApiService.access$getApiRepository$p(ApiService.this).getRadarHost$sdk_release()).buildUpon().appendEncodedPath("v1/users").appendEncodedPath(ApiService.access$getLookupId(ApiService.this)).build().toString())));
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

	public ApiService$PutUserTask(String s, Location location1, Function1 function1)
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
