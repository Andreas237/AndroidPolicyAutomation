// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.beta;

import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.network.*;
import java.util.HashMap;
import java.util.Map;

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
	//    5    6:getstatic       #15  <Field HttpMethod HttpMethod.GET>
	//    6    9:invokespecial   #18  <Method void AbstractSpiCall(Kit, String, String, HttpRequestFactory, HttpMethod)>
		responseTransform = checkforupdatesresponsetransform;
	//    7   12:aload_0         
	//    8   13:aload           5
	//    9   15:putfield        #20  <Field CheckForUpdatesResponseTransform responseTransform>
	//   10   18:return          
	}

	private HttpRequest applyHeadersTo(HttpRequest httprequest, String s, String s1)
	{
		httprequest = httprequest.header("Accept", "application/json");
	//    0    0:aload_1         
	//    1    1:ldc1            #25  <String "Accept">
	//    2    3:ldc1            #27  <String "application/json">
	//    3    5:invokevirtual   #33  <Method HttpRequest HttpRequest.header(String, String)>
	//    4    8:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #35  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #38  <Method void StringBuilder()>
	//    8   16:astore          4
		stringbuilder.append("Crashlytics Android SDK/");
	//    9   18:aload           4
	//   10   20:ldc1            #40  <String "Crashlytics Android SDK/">
	//   11   22:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		stringbuilder.append(kit.getVersion());
	//   13   26:aload           4
	//   14   28:aload_0         
	//   15   29:getfield        #48  <Field Kit kit>
	//   16   32:invokevirtual   #54  <Method String Kit.getVersion()>
	//   17   35:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		return httprequest.header("User-Agent", stringbuilder.toString()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa").header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-API-CLIENT-VERSION", kit.getVersion()).header("X-CRASHLYTICS-API-KEY", s).header("X-CRASHLYTICS-BETA-TOKEN", createBetaTokenHeaderValueFor(s1));
	//   19   39:aload_1         
	//   20   40:ldc1            #56  <String "User-Agent">
	//   21   42:aload           4
	//   22   44:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   23   47:invokevirtual   #33  <Method HttpRequest HttpRequest.header(String, String)>
	//   24   50:ldc1            #61  <String "X-CRASHLYTICS-DEVELOPER-TOKEN">
	//   25   52:ldc1            #63  <String "470fa2b4ae81cd56ecbcda9735803434cec591fa">
	//   26   54:invokevirtual   #33  <Method HttpRequest HttpRequest.header(String, String)>
	//   27   57:ldc1            #65  <String "X-CRASHLYTICS-API-CLIENT-TYPE">
	//   28   59:ldc1            #67  <String "android">
	//   29   61:invokevirtual   #33  <Method HttpRequest HttpRequest.header(String, String)>
	//   30   64:ldc1            #69  <String "X-CRASHLYTICS-API-CLIENT-VERSION">
	//   31   66:aload_0         
	//   32   67:getfield        #48  <Field Kit kit>
	//   33   70:invokevirtual   #54  <Method String Kit.getVersion()>
	//   34   73:invokevirtual   #33  <Method HttpRequest HttpRequest.header(String, String)>
	//   35   76:ldc1            #71  <String "X-CRASHLYTICS-API-KEY">
	//   36   78:aload_2         
	//   37   79:invokevirtual   #33  <Method HttpRequest HttpRequest.header(String, String)>
	//   38   82:ldc1            #73  <String "X-CRASHLYTICS-BETA-TOKEN">
	//   39   84:aload_3         
	//   40   85:invokestatic    #77  <Method String createBetaTokenHeaderValueFor(String)>
	//   41   88:invokevirtual   #33  <Method HttpRequest HttpRequest.header(String, String)>
	//   42   91:areturn         
	}

	static String createBetaTokenHeaderValueFor(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #35  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("3:");
	//    4    8:aload_1         
	//    5    9:ldc1            #79  <String "3:">
	//    6   11:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		return stringbuilder.toString();
	//   12   21:aload_1         
	//   13   22:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   14   25:areturn         
	}

	private Map getQueryParamsFor(BuildProperties buildproperties)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #83  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #84  <Method void HashMap()>
	//    3    7:astore_2        
		((Map) (hashmap)).put("build_version", ((Object) (buildproperties.versionCode)));
	//    4    8:aload_2         
	//    5    9:ldc1            #86  <String "build_version">
	//    6   11:aload_1         
	//    7   12:getfield        #92  <Field String BuildProperties.versionCode>
	//    8   15:invokeinterface #98  <Method Object Map.put(Object, Object)>
	//    9   20:pop             
		((Map) (hashmap)).put("display_version", ((Object) (buildproperties.versionName)));
	//   10   21:aload_2         
	//   11   22:ldc1            #100 <String "display_version">
	//   12   24:aload_1         
	//   13   25:getfield        #103 <Field String BuildProperties.versionName>
	//   14   28:invokeinterface #98  <Method Object Map.put(Object, Object)>
	//   15   33:pop             
		((Map) (hashmap)).put("instance", ((Object) (buildproperties.buildId)));
	//   16   34:aload_2         
	//   17   35:ldc1            #105 <String "instance">
	//   18   37:aload_1         
	//   19   38:getfield        #108 <Field String BuildProperties.buildId>
	//   20   41:invokeinterface #98  <Method Object Map.put(Object, Object)>
	//   21   46:pop             
		((Map) (hashmap)).put("source", "3");
	//   22   47:aload_2         
	//   23   48:ldc1            #110 <String "source">
	//   24   50:ldc1            #112 <String "3">
	//   25   52:invokeinterface #98  <Method Object Map.put(Object, Object)>
	//   26   57:pop             
		return ((Map) (hashmap));
	//   27   58:aload_2         
	//   28   59:areturn         
	}

	public CheckForUpdatesResponse invoke(String s, String s1, BuildProperties buildproperties)
	{
		Object obj;
		obj = ((Object) (getQueryParamsFor(buildproperties)));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #120 <Method Map getQueryParamsFor(BuildProperties)>
	//    3    5:astore          4
		buildproperties = ((BuildProperties) (getHttpRequest(((Map) (obj)))));
	//    4    7:aload_0         
	//    5    8:aload           4
	//    6   10:invokevirtual   #124 <Method HttpRequest getHttpRequest(Map)>
	//    7   13:astore_3        
		StringBuilder stringbuilder1;
		try
		{
			s = ((String) (applyHeadersTo(((HttpRequest) (buildproperties)), s, s1)));
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokespecial   #126 <Method HttpRequest applyHeadersTo(HttpRequest, String, String)>
	//   13   21:astore_1        
		}
	//*  14   22:aload_1         
	//*  15   23:astore_2        
	//*  16   24:invokestatic    #132 <Method Logger Fabric.getLogger()>
	//*  17   27:astore_3        
	//*  18   28:aload_1         
	//*  19   29:astore_2        
	//*  20   30:new             #35  <Class StringBuilder>
	//*  21   33:dup             
	//*  22   34:invokespecial   #38  <Method void StringBuilder()>
	//*  23   37:astore          5
	//*  24   39:aload_1         
	//*  25   40:astore_2        
	//*  26   41:aload           5
	//*  27   43:ldc1            #134 <String "Checking for updates from ">
	//*  28   45:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//*  29   48:pop             
	//*  30   49:aload_1         
	//*  31   50:astore_2        
	//*  32   51:aload           5
	//*  33   53:aload_0         
	//*  34   54:invokevirtual   #137 <Method String getUrl()>
	//*  35   57:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//*  36   60:pop             
	//*  37   61:aload_1         
	//*  38   62:astore_2        
	//*  39   63:aload_3         
	//*  40   64:ldc1            #139 <String "Beta">
	//*  41   66:aload           5
	//*  42   68:invokevirtual   #59  <Method String StringBuilder.toString()>
	//*  43   71:invokeinterface #145 <Method void Logger.d(String, String)>
	//*  44   76:aload_1         
	//*  45   77:astore_2        
	//*  46   78:invokestatic    #132 <Method Logger Fabric.getLogger()>
	//*  47   81:astore_3        
	//*  48   82:aload_1         
	//*  49   83:astore_2        
	//*  50   84:new             #35  <Class StringBuilder>
	//*  51   87:dup             
	//*  52   88:invokespecial   #38  <Method void StringBuilder()>
	//*  53   91:astore          5
	//*  54   93:aload_1         
	//*  55   94:astore_2        
	//*  56   95:aload           5
	//*  57   97:ldc1            #147 <String "Checking for updates query params are: ">
	//*  58   99:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//*  59  102:pop             
	//*  60  103:aload_1         
	//*  61  104:astore_2        
	//*  62  105:aload           5
	//*  63  107:aload           4
	//*  64  109:invokevirtual   #150 <Method StringBuilder StringBuilder.append(Object)>
	//*  65  112:pop             
	//*  66  113:aload_1         
	//*  67  114:astore_2        
	//*  68  115:aload_3         
	//*  69  116:ldc1            #139 <String "Beta">
	//*  70  118:aload           5
	//*  71  120:invokevirtual   #59  <Method String StringBuilder.toString()>
	//*  72  123:invokeinterface #145 <Method void Logger.d(String, String)>
	//*  73  128:aload_1         
	//*  74  129:astore_2        
	//*  75  130:aload_1         
	//*  76  131:invokevirtual   #154 <Method boolean HttpRequest.ok()>
	//*  77  134:ifeq            226
	//*  78  137:aload_1         
	//*  79  138:astore_2        
	//*  80  139:invokestatic    #132 <Method Logger Fabric.getLogger()>
	//*  81  142:ldc1            #139 <String "Beta">
	//*  82  144:ldc1            #156 <String "Checking for updates was successful">
	//*  83  146:invokeinterface #145 <Method void Logger.d(String, String)>
	//*  84  151:aload_1         
	//*  85  152:astore_2        
	//*  86  153:aload_1         
	//*  87  154:invokevirtual   #159 <Method String HttpRequest.body()>
	//*  88  157:invokestatic    #165 <Method org.json.JSONObject JSONObjectInstrumentation.init(String)>
	//*  89  160:astore_3        
	//*  90  161:aload_1         
	//*  91  162:astore_2        
	//*  92  163:aload_0         
	//*  93  164:getfield        #20  <Field CheckForUpdatesResponseTransform responseTransform>
	//*  94  167:aload_3         
	//*  95  168:invokevirtual   #171 <Method CheckForUpdatesResponse CheckForUpdatesResponseTransform.fromJson(org.json.JSONObject)>
	//*  96  171:astore_3        
	//*  97  172:aload_1         
	//*  98  173:ifnull          224
	//*  99  176:aload_1         
	//* 100  177:ldc1            #173 <String "X-REQUEST-ID">
	//* 101  179:invokevirtual   #175 <Method String HttpRequest.header(String)>
	//* 102  182:astore_1        
	//* 103  183:invokestatic    #132 <Method Logger Fabric.getLogger()>
	//* 104  186:astore_2        
	//* 105  187:new             #35  <Class StringBuilder>
	//* 106  190:dup             
	//* 107  191:invokespecial   #38  <Method void StringBuilder()>
	//* 108  194:astore          4
	//* 109  196:aload           4
	//* 110  198:ldc1            #177 <String "Checking for updates request ID: ">
	//* 111  200:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//* 112  203:pop             
	//* 113  204:aload           4
	//* 114  206:aload_1         
	//* 115  207:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//* 116  210:pop             
	//* 117  211:aload_2         
	//* 118  212:ldc1            #179 <String "Fabric">
	//* 119  214:aload           4
	//* 120  216:invokevirtual   #59  <Method String StringBuilder.toString()>
	//* 121  219:invokeinterface #145 <Method void Logger.d(String, String)>
	//* 122  224:aload_3         
	//* 123  225:areturn         
	//* 124  226:aload_1         
	//* 125  227:astore_2        
	//* 126  228:invokestatic    #132 <Method Logger Fabric.getLogger()>
	//* 127  231:astore_3        
	//* 128  232:aload_1         
	//* 129  233:astore_2        
	//* 130  234:new             #35  <Class StringBuilder>
	//* 131  237:dup             
	//* 132  238:invokespecial   #38  <Method void StringBuilder()>
	//* 133  241:astore          4
	//* 134  243:aload_1         
	//* 135  244:astore_2        
	//* 136  245:aload           4
	//* 137  247:ldc1            #181 <String "Checking for updates failed. Response code: ">
	//* 138  249:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//* 139  252:pop             
	//* 140  253:aload_1         
	//* 141  254:astore_2        
	//* 142  255:aload           4
	//* 143  257:aload_1         
	//* 144  258:invokevirtual   #185 <Method int HttpRequest.code()>
	//* 145  261:invokevirtual   #188 <Method StringBuilder StringBuilder.append(int)>
	//* 146  264:pop             
	//* 147  265:aload_1         
	//* 148  266:astore_2        
	//* 149  267:aload_3         
	//* 150  268:ldc1            #139 <String "Beta">
	//* 151  270:aload           4
	//* 152  272:invokevirtual   #59  <Method String StringBuilder.toString()>
	//* 153  275:invokeinterface #191 <Method void Logger.e(String, String)>
	//* 154  280:aload_1         
	//* 155  281:ifnull          438
	//* 156  284:aload_1         
	//* 157  285:ldc1            #173 <String "X-REQUEST-ID">
	//* 158  287:invokevirtual   #175 <Method String HttpRequest.header(String)>
	//* 159  290:astore_2        
	//* 160  291:invokestatic    #132 <Method Logger Fabric.getLogger()>
	//* 161  294:astore_3        
	//* 162  295:new             #35  <Class StringBuilder>
	//* 163  298:dup             
	//* 164  299:invokespecial   #38  <Method void StringBuilder()>
	//* 165  302:astore_1        
	//* 166  303:goto            413
	//* 167  306:astore_3        
	//* 168  307:goto            333
	//* 169  310:astore_1        
	//* 170  311:aload_3         
	//* 171  312:astore_2        
	//* 172  313:goto            441
		// Misplaced declaration of an exception variable
		catch(String s1)
	//* 173  316:astore_2        
		{
			s = ((String) (buildproperties));
	//  174  317:aload_3         
	//  175  318:astore_1        
			buildproperties = ((BuildProperties) (s1));
	//  176  319:aload_2         
	//  177  320:astore_3        
			break MISSING_BLOCK_LABEL_333;
	//  178  321:goto            333
		}
		s1 = s;
		try
		{
			buildproperties = ((BuildProperties) (Fabric.getLogger()));
		}
		// Misplaced declaration of an exception variable
		catch(BuildProperties buildproperties)
		{
			break MISSING_BLOCK_LABEL_333;
		}
		s1 = s;
		stringbuilder1 = new StringBuilder();
		s1 = s;
		stringbuilder1.append("Checking for updates from ");
		s1 = s;
		stringbuilder1.append(getUrl());
		s1 = s;
		((Logger) (buildproperties)).d("Beta", stringbuilder1.toString());
		s1 = s;
		buildproperties = ((BuildProperties) (Fabric.getLogger()));
		s1 = s;
		stringbuilder1 = new StringBuilder();
		s1 = s;
		stringbuilder1.append("Checking for updates query params are: ");
		s1 = s;
		stringbuilder1.append(obj);
		s1 = s;
		((Logger) (buildproperties)).d("Beta", stringbuilder1.toString());
		s1 = s;
		if(!((HttpRequest) (s)).ok())
			break MISSING_BLOCK_LABEL_226;
		s1 = s;
		Fabric.getLogger().d("Beta", "Checking for updates was successful");
		s1 = s;
		buildproperties = ((BuildProperties) (JSONObjectInstrumentation.init(((HttpRequest) (s)).body())));
		s1 = s;
		buildproperties = ((BuildProperties) (responseTransform.fromJson(((org.json.JSONObject) (buildproperties)))));
		if(s != null)
		{
			s = ((HttpRequest) (s)).header("X-REQUEST-ID");
			s1 = ((String) (Fabric.getLogger()));
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Checking for updates request ID: ");
			((StringBuilder) (obj)).append(s);
			((Logger) (s1)).d("Fabric", ((StringBuilder) (obj)).toString());
		}
		return ((CheckForUpdatesResponse) (buildproperties));
		s1 = s;
		buildproperties = ((BuildProperties) (Fabric.getLogger()));
		s1 = s;
		obj = ((Object) (new StringBuilder()));
		s1 = s;
		((StringBuilder) (obj)).append("Checking for updates failed. Response code: ");
		s1 = s;
		((StringBuilder) (obj)).append(((HttpRequest) (s)).code());
		s1 = s;
		((Logger) (buildproperties)).e("Beta", ((StringBuilder) (obj)).toString());
		if(s == null)
			break MISSING_BLOCK_LABEL_438;
		s1 = ((HttpRequest) (s)).header("X-REQUEST-ID");
		buildproperties = ((BuildProperties) (Fabric.getLogger()));
		s = ((String) (new StringBuilder()));
		break MISSING_BLOCK_LABEL_413;
		s;
		s1 = ((String) (buildproperties));
		break MISSING_BLOCK_LABEL_441;
		s;
	//  179  324:astore_1        
		s1 = null;
	//  180  325:aconst_null     
	//  181  326:astore_2        
		break MISSING_BLOCK_LABEL_441;
	//  182  327:goto            441
		buildproperties;
	//  183  330:astore_3        
		s = null;
	//  184  331:aconst_null     
	//  185  332:astore_1        
		s1 = s;
	//  186  333:aload_1         
	//  187  334:astore_2        
		obj = ((Object) (Fabric.getLogger()));
	//  188  335:invokestatic    #132 <Method Logger Fabric.getLogger()>
	//  189  338:astore          4
		s1 = s;
	//  190  340:aload_1         
	//  191  341:astore_2        
		StringBuilder stringbuilder2 = new StringBuilder();
	//  192  342:new             #35  <Class StringBuilder>
	//  193  345:dup             
	//  194  346:invokespecial   #38  <Method void StringBuilder()>
	//  195  349:astore          5
		s1 = s;
	//  196  351:aload_1         
	//  197  352:astore_2        
		stringbuilder2.append("Error while checking for updates from ");
	//  198  353:aload           5
	//  199  355:ldc1            #193 <String "Error while checking for updates from ">
	//  200  357:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//  201  360:pop             
		s1 = s;
	//  202  361:aload_1         
	//  203  362:astore_2        
		stringbuilder2.append(getUrl());
	//  204  363:aload           5
	//  205  365:aload_0         
	//  206  366:invokevirtual   #137 <Method String getUrl()>
	//  207  369:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//  208  372:pop             
		s1 = s;
	//  209  373:aload_1         
	//  210  374:astore_2        
		((Logger) (obj)).e("Beta", stringbuilder2.toString(), ((Throwable) (buildproperties)));
	//  211  375:aload           4
	//  212  377:ldc1            #139 <String "Beta">
	//  213  379:aload           5
	//  214  381:invokevirtual   #59  <Method String StringBuilder.toString()>
	//  215  384:aload_3         
	//  216  385:invokeinterface #196 <Method void Logger.e(String, String, Throwable)>
		if(s == null)
			break MISSING_BLOCK_LABEL_438;
	//  217  390:aload_1         
	//  218  391:ifnull          438
		s1 = ((HttpRequest) (s)).header("X-REQUEST-ID");
	//  219  394:aload_1         
	//  220  395:ldc1            #173 <String "X-REQUEST-ID">
	//  221  397:invokevirtual   #175 <Method String HttpRequest.header(String)>
	//  222  400:astore_2        
		buildproperties = ((BuildProperties) (Fabric.getLogger()));
	//  223  401:invokestatic    #132 <Method Logger Fabric.getLogger()>
	//  224  404:astore_3        
		s = ((String) (new StringBuilder()));
	//  225  405:new             #35  <Class StringBuilder>
	//  226  408:dup             
	//  227  409:invokespecial   #38  <Method void StringBuilder()>
	//  228  412:astore_1        
		((StringBuilder) (s)).append("Checking for updates request ID: ");
	//  229  413:aload_1         
	//  230  414:ldc1            #177 <String "Checking for updates request ID: ">
	//  231  416:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//  232  419:pop             
		((StringBuilder) (s)).append(s1);
	//  233  420:aload_1         
	//  234  421:aload_2         
	//  235  422:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//  236  425:pop             
		((Logger) (buildproperties)).d("Fabric", ((StringBuilder) (s)).toString());
	//  237  426:aload_3         
	//  238  427:ldc1            #179 <String "Fabric">
	//  239  429:aload_1         
	//  240  430:invokevirtual   #59  <Method String StringBuilder.toString()>
	//  241  433:invokeinterface #145 <Method void Logger.d(String, String)>
		return null;
	//  242  438:aconst_null     
	//  243  439:areturn         
		s;
	//  244  440:astore_1        
		if(s1 != null)
	//* 245  441:aload_2         
	//* 246  442:ifnull          493
		{
			s1 = ((HttpRequest) (s1)).header("X-REQUEST-ID");
	//  247  445:aload_2         
	//  248  446:ldc1            #173 <String "X-REQUEST-ID">
	//  249  448:invokevirtual   #175 <Method String HttpRequest.header(String)>
	//  250  451:astore_2        
			buildproperties = ((BuildProperties) (Fabric.getLogger()));
	//  251  452:invokestatic    #132 <Method Logger Fabric.getLogger()>
	//  252  455:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//  253  456:new             #35  <Class StringBuilder>
	//  254  459:dup             
	//  255  460:invokespecial   #38  <Method void StringBuilder()>
	//  256  463:astore          4
			stringbuilder.append("Checking for updates request ID: ");
	//  257  465:aload           4
	//  258  467:ldc1            #177 <String "Checking for updates request ID: ">
	//  259  469:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//  260  472:pop             
			stringbuilder.append(s1);
	//  261  473:aload           4
	//  262  475:aload_2         
	//  263  476:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//  264  479:pop             
			((Logger) (buildproperties)).d("Fabric", stringbuilder.toString());
	//  265  480:aload_3         
	//  266  481:ldc1            #179 <String "Fabric">
	//  267  483:aload           4
	//  268  485:invokevirtual   #59  <Method String StringBuilder.toString()>
	//  269  488:invokeinterface #145 <Method void Logger.d(String, String)>
		}
		throw s;
	//  270  493:aload_1         
	//  271  494:athrow          
	}

	private final CheckForUpdatesResponseTransform responseTransform;
}
