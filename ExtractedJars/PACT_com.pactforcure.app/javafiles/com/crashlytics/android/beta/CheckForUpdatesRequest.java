// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.beta;

import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.network.*;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.beta:
//			BuildProperties, CheckForUpdatesResponseTransform, CheckForUpdatesResponse

class CheckForUpdatesRequest extends AbstractSpiCall
{

	public CheckForUpdatesRequest(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory, CheckForUpdatesResponseTransform checkforupdatesresponsetransform)
	{
		super(kit, s, s1, httprequestfactory, HttpMethod.GET);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:getstatic       #34  <Field HttpMethod HttpMethod.GET>
	//    6    9:invokespecial   #37  <Method void AbstractSpiCall(Kit, String, String, HttpRequestFactory, HttpMethod)>
		responseTransform = checkforupdatesresponsetransform;
	//    7   12:aload_0         
	//    8   13:aload           5
	//    9   15:putfield        #39  <Field CheckForUpdatesResponseTransform responseTransform>
	//   10   18:return          
	}

	private HttpRequest applyHeadersTo(HttpRequest httprequest, String s, String s1)
	{
		return httprequest.header("Accept", "application/json").header("User-Agent", (new StringBuilder()).append("Crashlytics Android SDK/").append(kit.getVersion()).toString()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa").header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-API-CLIENT-VERSION", kit.getVersion()).header("X-CRASHLYTICS-API-KEY", s).header("X-CRASHLYTICS-BETA-TOKEN", createBetaTokenHeaderValueFor(s1));
	//    0    0:aload_1         
	//    1    1:ldc1            #44  <String "Accept">
	//    2    3:ldc1            #46  <String "application/json">
	//    3    5:invokevirtual   #52  <Method HttpRequest HttpRequest.header(String, String)>
	//    4    8:ldc1            #54  <String "User-Agent">
	//    5   10:new             #56  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #59  <Method void StringBuilder()>
	//    8   17:ldc1            #61  <String "Crashlytics Android SDK/">
	//    9   19:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:aload_0         
	//   11   23:getfield        #69  <Field Kit kit>
	//   12   26:invokevirtual   #75  <Method String Kit.getVersion()>
	//   13   29:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   14   32:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   15   35:invokevirtual   #52  <Method HttpRequest HttpRequest.header(String, String)>
	//   16   38:ldc1            #80  <String "X-CRASHLYTICS-DEVELOPER-TOKEN">
	//   17   40:ldc1            #82  <String "470fa2b4ae81cd56ecbcda9735803434cec591fa">
	//   18   42:invokevirtual   #52  <Method HttpRequest HttpRequest.header(String, String)>
	//   19   45:ldc1            #84  <String "X-CRASHLYTICS-API-CLIENT-TYPE">
	//   20   47:ldc1            #86  <String "android">
	//   21   49:invokevirtual   #52  <Method HttpRequest HttpRequest.header(String, String)>
	//   22   52:ldc1            #88  <String "X-CRASHLYTICS-API-CLIENT-VERSION">
	//   23   54:aload_0         
	//   24   55:getfield        #69  <Field Kit kit>
	//   25   58:invokevirtual   #75  <Method String Kit.getVersion()>
	//   26   61:invokevirtual   #52  <Method HttpRequest HttpRequest.header(String, String)>
	//   27   64:ldc1            #90  <String "X-CRASHLYTICS-API-KEY">
	//   28   66:aload_2         
	//   29   67:invokevirtual   #52  <Method HttpRequest HttpRequest.header(String, String)>
	//   30   70:ldc1            #17  <String "X-CRASHLYTICS-BETA-TOKEN">
	//   31   72:aload_3         
	//   32   73:invokestatic    #94  <Method String createBetaTokenHeaderValueFor(String)>
	//   33   76:invokevirtual   #52  <Method HttpRequest HttpRequest.header(String, String)>
	//   34   79:areturn         
	}

	static String createBetaTokenHeaderValueFor(String s)
	{
		return (new StringBuilder()).append("3:").append(s).toString();
	//    0    0:new             #56  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void StringBuilder()>
	//    3    7:ldc1            #96  <String "3:">
	//    4    9:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:invokevirtual   #78  <Method String StringBuilder.toString()>
	//    8   19:areturn         
	}

	private Map getQueryParamsFor(BuildProperties buildproperties)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #100 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #101 <Method void HashMap()>
	//    3    7:astore_2        
		((Map) (hashmap)).put("build_version", ((Object) (buildproperties.versionCode)));
	//    4    8:aload_2         
	//    5    9:ldc1            #11  <String "build_version">
	//    6   11:aload_1         
	//    7   12:getfield        #106 <Field String BuildProperties.versionCode>
	//    8   15:invokeinterface #112 <Method Object Map.put(Object, Object)>
	//    9   20:pop             
		((Map) (hashmap)).put("display_version", ((Object) (buildproperties.versionName)));
	//   10   21:aload_2         
	//   11   22:ldc1            #14  <String "display_version">
	//   12   24:aload_1         
	//   13   25:getfield        #115 <Field String BuildProperties.versionName>
	//   14   28:invokeinterface #112 <Method Object Map.put(Object, Object)>
	//   15   33:pop             
		((Map) (hashmap)).put("instance", ((Object) (buildproperties.buildId)));
	//   16   34:aload_2         
	//   17   35:ldc1            #20  <String "instance">
	//   18   37:aload_1         
	//   19   38:getfield        #118 <Field String BuildProperties.buildId>
	//   20   41:invokeinterface #112 <Method Object Map.put(Object, Object)>
	//   21   46:pop             
		((Map) (hashmap)).put("source", "3");
	//   22   47:aload_2         
	//   23   48:ldc1            #24  <String "source">
	//   24   50:ldc1            #8   <String "3">
	//   25   52:invokeinterface #112 <Method Object Map.put(Object, Object)>
	//   26   57:pop             
		return ((Map) (hashmap));
	//   27   58:aload_2         
	//   28   59:areturn         
	}

	public CheckForUpdatesResponse invoke(String s, String s1, BuildProperties buildproperties)
	{
		Object obj;
		Object obj1;
		Object obj2;
		Object obj3;
		obj3 = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		obj2 = null;
	//    2    3:aconst_null     
	//    3    4:astore          6
		obj1 = ((Object) (obj2));
	//    4    6:aload           6
	//    5    8:astore          5
		obj = ((Object) (obj3));
	//    6   10:aload           7
	//    7   12:astore          4
		Map map = getQueryParamsFor(buildproperties);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokespecial   #126 <Method Map getQueryParamsFor(BuildProperties)>
	//   11   19:astore          8
		obj1 = ((Object) (obj2));
	//   12   21:aload           6
	//   13   23:astore          5
		obj = ((Object) (obj3));
	//   14   25:aload           7
	//   15   27:astore          4
		buildproperties = ((BuildProperties) (getHttpRequest(map)));
	//   16   29:aload_0         
	//   17   30:aload           8
	//   18   32:invokevirtual   #130 <Method HttpRequest getHttpRequest(Map)>
	//   19   35:astore_3        
		obj1 = ((Object) (buildproperties));
	//   20   36:aload_3         
	//   21   37:astore          5
		obj = ((Object) (buildproperties));
	//   22   39:aload_3         
	//   23   40:astore          4
		s = ((String) (applyHeadersTo(((HttpRequest) (buildproperties)), s, s1)));
	//   24   42:aload_0         
	//   25   43:aload_3         
	//   26   44:aload_1         
	//   27   45:aload_2         
	//   28   46:invokespecial   #132 <Method HttpRequest applyHeadersTo(HttpRequest, String, String)>
	//   29   49:astore_1        
		obj1 = ((Object) (s));
	//   30   50:aload_1         
	//   31   51:astore          5
		obj = ((Object) (s));
	//   32   53:aload_1         
	//   33   54:astore          4
		Fabric.getLogger().d("Beta", (new StringBuilder()).append("Checking for updates from ").append(getUrl()).toString());
	//   34   56:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//   35   59:ldc1            #140 <String "Beta">
	//   36   61:new             #56  <Class StringBuilder>
	//   37   64:dup             
	//   38   65:invokespecial   #59  <Method void StringBuilder()>
	//   39   68:ldc1            #142 <String "Checking for updates from ">
	//   40   70:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   41   73:aload_0         
	//   42   74:invokevirtual   #145 <Method String getUrl()>
	//   43   77:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   44   80:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   45   83:invokeinterface #151 <Method void Logger.d(String, String)>
		obj1 = ((Object) (s));
	//   46   88:aload_1         
	//   47   89:astore          5
		obj = ((Object) (s));
	//   48   91:aload_1         
	//   49   92:astore          4
		Fabric.getLogger().d("Beta", (new StringBuilder()).append("Checking for updates query params are: ").append(((Object) (map))).toString());
	//   50   94:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//   51   97:ldc1            #140 <String "Beta">
	//   52   99:new             #56  <Class StringBuilder>
	//   53  102:dup             
	//   54  103:invokespecial   #59  <Method void StringBuilder()>
	//   55  106:ldc1            #153 <String "Checking for updates query params are: ">
	//   56  108:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   57  111:aload           8
	//   58  113:invokevirtual   #156 <Method StringBuilder StringBuilder.append(Object)>
	//   59  116:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   60  119:invokeinterface #151 <Method void Logger.d(String, String)>
		obj1 = ((Object) (s));
	//   61  124:aload_1         
	//   62  125:astore          5
		obj = ((Object) (s));
	//   63  127:aload_1         
	//   64  128:astore          4
		if(!((HttpRequest) (s)).ok())
			break MISSING_BLOCK_LABEL_230;
	//   65  130:aload_1         
	//   66  131:invokevirtual   #160 <Method boolean HttpRequest.ok()>
	//   67  134:ifeq            230
		obj1 = ((Object) (s));
	//   68  137:aload_1         
	//   69  138:astore          5
		obj = ((Object) (s));
	//   70  140:aload_1         
	//   71  141:astore          4
		Fabric.getLogger().d("Beta", "Checking for updates was successful");
	//   72  143:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//   73  146:ldc1            #140 <String "Beta">
	//   74  148:ldc1            #162 <String "Checking for updates was successful">
	//   75  150:invokeinterface #151 <Method void Logger.d(String, String)>
		obj1 = ((Object) (s));
	//   76  155:aload_1         
	//   77  156:astore          5
		obj = ((Object) (s));
	//   78  158:aload_1         
	//   79  159:astore          4
		s1 = ((String) (new JSONObject(((HttpRequest) (s)).body())));
	//   80  161:new             #164 <Class JSONObject>
	//   81  164:dup             
	//   82  165:aload_1         
	//   83  166:invokevirtual   #167 <Method String HttpRequest.body()>
	//   84  169:invokespecial   #170 <Method void JSONObject(String)>
	//   85  172:astore_2        
		obj1 = ((Object) (s));
	//   86  173:aload_1         
	//   87  174:astore          5
		obj = ((Object) (s));
	//   88  176:aload_1         
	//   89  177:astore          4
		s1 = ((String) (responseTransform.fromJson(((JSONObject) (s1)))));
	//   90  179:aload_0         
	//   91  180:getfield        #39  <Field CheckForUpdatesResponseTransform responseTransform>
	//   92  183:aload_2         
	//   93  184:invokevirtual   #176 <Method CheckForUpdatesResponse CheckForUpdatesResponseTransform.fromJson(JSONObject)>
	//   94  187:astore_2        
		if(s != null)
	//*  95  188:aload_1         
	//*  96  189:ifnull          228
		{
			s = ((HttpRequest) (s)).header("X-REQUEST-ID");
	//   97  192:aload_1         
	//   98  193:ldc1            #178 <String "X-REQUEST-ID">
	//   99  195:invokevirtual   #180 <Method String HttpRequest.header(String)>
	//  100  198:astore_1        
			Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Checking for updates request ID: ").append(s).toString());
	//  101  199:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//  102  202:ldc1            #182 <String "Fabric">
	//  103  204:new             #56  <Class StringBuilder>
	//  104  207:dup             
	//  105  208:invokespecial   #59  <Method void StringBuilder()>
	//  106  211:ldc1            #184 <String "Checking for updates request ID: ">
	//  107  213:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  108  216:aload_1         
	//  109  217:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  110  220:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  111  223:invokeinterface #151 <Method void Logger.d(String, String)>
		}
		return ((CheckForUpdatesResponse) (s1));
	//  112  228:aload_2         
	//  113  229:areturn         
		obj1 = ((Object) (s));
	//  114  230:aload_1         
	//  115  231:astore          5
		obj = ((Object) (s));
	//  116  233:aload_1         
	//  117  234:astore          4
		Fabric.getLogger().e("Beta", (new StringBuilder()).append("Checking for updates failed. Response code: ").append(((HttpRequest) (s)).code()).toString());
	//  118  236:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//  119  239:ldc1            #140 <String "Beta">
	//  120  241:new             #56  <Class StringBuilder>
	//  121  244:dup             
	//  122  245:invokespecial   #59  <Method void StringBuilder()>
	//  123  248:ldc1            #186 <String "Checking for updates failed. Response code: ">
	//  124  250:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  125  253:aload_1         
	//  126  254:invokevirtual   #190 <Method int HttpRequest.code()>
	//  127  257:invokevirtual   #193 <Method StringBuilder StringBuilder.append(int)>
	//  128  260:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  129  263:invokeinterface #196 <Method void Logger.e(String, String)>
		if(s != null)
	//* 130  268:aload_1         
	//* 131  269:ifnull          308
		{
			s = ((HttpRequest) (s)).header("X-REQUEST-ID");
	//  132  272:aload_1         
	//  133  273:ldc1            #178 <String "X-REQUEST-ID">
	//  134  275:invokevirtual   #180 <Method String HttpRequest.header(String)>
	//  135  278:astore_1        
			Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Checking for updates request ID: ").append(s).toString());
	//  136  279:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//  137  282:ldc1            #182 <String "Fabric">
	//  138  284:new             #56  <Class StringBuilder>
	//  139  287:dup             
	//  140  288:invokespecial   #59  <Method void StringBuilder()>
	//  141  291:ldc1            #184 <String "Checking for updates request ID: ">
	//  142  293:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  143  296:aload_1         
	//  144  297:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  145  300:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  146  303:invokeinterface #151 <Method void Logger.d(String, String)>
		}
_L2:
		return null;
	//  147  308:aconst_null     
	//  148  309:areturn         
		s;
	//  149  310:astore_1        
		obj = obj1;
	//  150  311:aload           5
	//  151  313:astore          4
		Fabric.getLogger().e("Beta", (new StringBuilder()).append("Error while checking for updates from ").append(getUrl()).toString(), ((Throwable) (s)));
	//  152  315:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//  153  318:ldc1            #140 <String "Beta">
	//  154  320:new             #56  <Class StringBuilder>
	//  155  323:dup             
	//  156  324:invokespecial   #59  <Method void StringBuilder()>
	//  157  327:ldc1            #198 <String "Error while checking for updates from ">
	//  158  329:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  159  332:aload_0         
	//  160  333:invokevirtual   #145 <Method String getUrl()>
	//  161  336:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  162  339:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  163  342:aload_1         
	//  164  343:invokeinterface #201 <Method void Logger.e(String, String, Throwable)>
		if(obj1 != null)
	//* 165  348:aload           5
	//* 166  350:ifnull          308
		{
			s = ((HttpRequest) (obj1)).header("X-REQUEST-ID");
	//  167  353:aload           5
	//  168  355:ldc1            #178 <String "X-REQUEST-ID">
	//  169  357:invokevirtual   #180 <Method String HttpRequest.header(String)>
	//  170  360:astore_1        
			Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Checking for updates request ID: ").append(s).toString());
	//  171  361:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//  172  364:ldc1            #182 <String "Fabric">
	//  173  366:new             #56  <Class StringBuilder>
	//  174  369:dup             
	//  175  370:invokespecial   #59  <Method void StringBuilder()>
	//  176  373:ldc1            #184 <String "Checking for updates request ID: ">
	//  177  375:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  178  378:aload_1         
	//  179  379:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  180  382:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  181  385:invokeinterface #151 <Method void Logger.d(String, String)>
		}
		if(true) goto _L2; else goto _L1
	//  182  390:goto            308
_L1:
		s;
	//  183  393:astore_1        
		if(obj != null)
	//* 184  394:aload           4
	//* 185  396:ifnull          436
		{
			s1 = ((HttpRequest) (obj)).header("X-REQUEST-ID");
	//  186  399:aload           4
	//  187  401:ldc1            #178 <String "X-REQUEST-ID">
	//  188  403:invokevirtual   #180 <Method String HttpRequest.header(String)>
	//  189  406:astore_2        
			Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Checking for updates request ID: ").append(s1).toString());
	//  190  407:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//  191  410:ldc1            #182 <String "Fabric">
	//  192  412:new             #56  <Class StringBuilder>
	//  193  415:dup             
	//  194  416:invokespecial   #59  <Method void StringBuilder()>
	//  195  419:ldc1            #184 <String "Checking for updates request ID: ">
	//  196  421:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  197  424:aload_2         
	//  198  425:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  199  428:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  200  431:invokeinterface #151 <Method void Logger.d(String, String)>
		}
		throw s;
	//  201  436:aload_1         
	//  202  437:athrow          
	}

	static final String BETA_SOURCE = "3";
	static final String BUILD_VERSION = "build_version";
	static final String DISPLAY_VERSION = "display_version";
	static final String HEADER_BETA_TOKEN = "X-CRASHLYTICS-BETA-TOKEN";
	static final String INSTANCE = "instance";
	static final String SDK_ANDROID_DIR_TOKEN_TYPE = "3";
	static final String SOURCE = "source";
	private final CheckForUpdatesResponseTransform responseTransform;
}
