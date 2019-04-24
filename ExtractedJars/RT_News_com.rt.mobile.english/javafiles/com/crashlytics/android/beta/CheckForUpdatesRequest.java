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
		httprequest = httprequest.header("Accept", "application/json");
	//    0    0:aload_1         
	//    1    1:ldc1            #44  <String "Accept">
	//    2    3:ldc1            #46  <String "application/json">
	//    3    5:invokevirtual   #52  <Method HttpRequest HttpRequest.header(String, String)>
	//    4    8:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #54  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #57  <Method void StringBuilder()>
	//    8   16:astore          4
		stringbuilder.append("Crashlytics Android SDK/");
	//    9   18:aload           4
	//   10   20:ldc1            #59  <String "Crashlytics Android SDK/">
	//   11   22:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		stringbuilder.append(kit.getVersion());
	//   13   26:aload           4
	//   14   28:aload_0         
	//   15   29:getfield        #67  <Field Kit kit>
	//   16   32:invokevirtual   #73  <Method String Kit.getVersion()>
	//   17   35:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		return httprequest.header("User-Agent", stringbuilder.toString()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa").header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-API-CLIENT-VERSION", kit.getVersion()).header("X-CRASHLYTICS-API-KEY", s).header("X-CRASHLYTICS-BETA-TOKEN", createBetaTokenHeaderValueFor(s1));
	//   19   39:aload_1         
	//   20   40:ldc1            #75  <String "User-Agent">
	//   21   42:aload           4
	//   22   44:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   23   47:invokevirtual   #52  <Method HttpRequest HttpRequest.header(String, String)>
	//   24   50:ldc1            #80  <String "X-CRASHLYTICS-DEVELOPER-TOKEN">
	//   25   52:ldc1            #82  <String "470fa2b4ae81cd56ecbcda9735803434cec591fa">
	//   26   54:invokevirtual   #52  <Method HttpRequest HttpRequest.header(String, String)>
	//   27   57:ldc1            #84  <String "X-CRASHLYTICS-API-CLIENT-TYPE">
	//   28   59:ldc1            #86  <String "android">
	//   29   61:invokevirtual   #52  <Method HttpRequest HttpRequest.header(String, String)>
	//   30   64:ldc1            #88  <String "X-CRASHLYTICS-API-CLIENT-VERSION">
	//   31   66:aload_0         
	//   32   67:getfield        #67  <Field Kit kit>
	//   33   70:invokevirtual   #73  <Method String Kit.getVersion()>
	//   34   73:invokevirtual   #52  <Method HttpRequest HttpRequest.header(String, String)>
	//   35   76:ldc1            #90  <String "X-CRASHLYTICS-API-KEY">
	//   36   78:aload_2         
	//   37   79:invokevirtual   #52  <Method HttpRequest HttpRequest.header(String, String)>
	//   38   82:ldc1            #17  <String "X-CRASHLYTICS-BETA-TOKEN">
	//   39   84:aload_3         
	//   40   85:invokestatic    #94  <Method String createBetaTokenHeaderValueFor(String)>
	//   41   88:invokevirtual   #52  <Method HttpRequest HttpRequest.header(String, String)>
	//   42   91:areturn         
	}

	static String createBetaTokenHeaderValueFor(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #54  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("3:");
	//    4    8:aload_1         
	//    5    9:ldc1            #96  <String "3:">
	//    6   11:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		return stringbuilder.toString();
	//   12   21:aload_1         
	//   13   22:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   14   25:areturn         
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
		obj = ((Object) (getQueryParamsFor(buildproperties)));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #126 <Method Map getQueryParamsFor(BuildProperties)>
	//    3    5:astore          4
		buildproperties = ((BuildProperties) (getHttpRequest(((Map) (obj)))));
	//    4    7:aload_0         
	//    5    8:aload           4
	//    6   10:invokevirtual   #130 <Method HttpRequest getHttpRequest(Map)>
	//    7   13:astore_3        
		StringBuilder stringbuilder1;
		try
		{
			s = ((String) (applyHeadersTo(((HttpRequest) (buildproperties)), s, s1)));
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokespecial   #132 <Method HttpRequest applyHeadersTo(HttpRequest, String, String)>
	//   13   21:astore_1        
		}
	//*  14   22:aload_1         
	//*  15   23:astore_2        
	//*  16   24:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//*  17   27:astore_3        
	//*  18   28:aload_1         
	//*  19   29:astore_2        
	//*  20   30:new             #54  <Class StringBuilder>
	//*  21   33:dup             
	//*  22   34:invokespecial   #57  <Method void StringBuilder()>
	//*  23   37:astore          5
	//*  24   39:aload_1         
	//*  25   40:astore_2        
	//*  26   41:aload           5
	//*  27   43:ldc1            #140 <String "Checking for updates from ">
	//*  28   45:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//*  29   48:pop             
	//*  30   49:aload_1         
	//*  31   50:astore_2        
	//*  32   51:aload           5
	//*  33   53:aload_0         
	//*  34   54:invokevirtual   #143 <Method String getUrl()>
	//*  35   57:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//*  36   60:pop             
	//*  37   61:aload_1         
	//*  38   62:astore_2        
	//*  39   63:aload_3         
	//*  40   64:ldc1            #145 <String "Beta">
	//*  41   66:aload           5
	//*  42   68:invokevirtual   #78  <Method String StringBuilder.toString()>
	//*  43   71:invokeinterface #151 <Method void Logger.d(String, String)>
	//*  44   76:aload_1         
	//*  45   77:astore_2        
	//*  46   78:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//*  47   81:astore_3        
	//*  48   82:aload_1         
	//*  49   83:astore_2        
	//*  50   84:new             #54  <Class StringBuilder>
	//*  51   87:dup             
	//*  52   88:invokespecial   #57  <Method void StringBuilder()>
	//*  53   91:astore          5
	//*  54   93:aload_1         
	//*  55   94:astore_2        
	//*  56   95:aload           5
	//*  57   97:ldc1            #153 <String "Checking for updates query params are: ">
	//*  58   99:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//*  59  102:pop             
	//*  60  103:aload_1         
	//*  61  104:astore_2        
	//*  62  105:aload           5
	//*  63  107:aload           4
	//*  64  109:invokevirtual   #156 <Method StringBuilder StringBuilder.append(Object)>
	//*  65  112:pop             
	//*  66  113:aload_1         
	//*  67  114:astore_2        
	//*  68  115:aload_3         
	//*  69  116:ldc1            #145 <String "Beta">
	//*  70  118:aload           5
	//*  71  120:invokevirtual   #78  <Method String StringBuilder.toString()>
	//*  72  123:invokeinterface #151 <Method void Logger.d(String, String)>
	//*  73  128:aload_1         
	//*  74  129:astore_2        
	//*  75  130:aload_1         
	//*  76  131:invokevirtual   #160 <Method boolean HttpRequest.ok()>
	//*  77  134:ifeq            230
	//*  78  137:aload_1         
	//*  79  138:astore_2        
	//*  80  139:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//*  81  142:ldc1            #145 <String "Beta">
	//*  82  144:ldc1            #162 <String "Checking for updates was successful">
	//*  83  146:invokeinterface #151 <Method void Logger.d(String, String)>
	//*  84  151:aload_1         
	//*  85  152:astore_2        
	//*  86  153:new             #164 <Class JSONObject>
	//*  87  156:dup             
	//*  88  157:aload_1         
	//*  89  158:invokevirtual   #167 <Method String HttpRequest.body()>
	//*  90  161:invokespecial   #170 <Method void JSONObject(String)>
	//*  91  164:astore_3        
	//*  92  165:aload_1         
	//*  93  166:astore_2        
	//*  94  167:aload_0         
	//*  95  168:getfield        #39  <Field CheckForUpdatesResponseTransform responseTransform>
	//*  96  171:aload_3         
	//*  97  172:invokevirtual   #176 <Method CheckForUpdatesResponse CheckForUpdatesResponseTransform.fromJson(JSONObject)>
	//*  98  175:astore_3        
	//*  99  176:aload_1         
	//* 100  177:ifnull          228
	//* 101  180:aload_1         
	//* 102  181:ldc1            #178 <String "X-REQUEST-ID">
	//* 103  183:invokevirtual   #180 <Method String HttpRequest.header(String)>
	//* 104  186:astore_1        
	//* 105  187:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//* 106  190:astore_2        
	//* 107  191:new             #54  <Class StringBuilder>
	//* 108  194:dup             
	//* 109  195:invokespecial   #57  <Method void StringBuilder()>
	//* 110  198:astore          4
	//* 111  200:aload           4
	//* 112  202:ldc1            #182 <String "Checking for updates request ID: ">
	//* 113  204:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//* 114  207:pop             
	//* 115  208:aload           4
	//* 116  210:aload_1         
	//* 117  211:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//* 118  214:pop             
	//* 119  215:aload_2         
	//* 120  216:ldc1            #184 <String "Fabric">
	//* 121  218:aload           4
	//* 122  220:invokevirtual   #78  <Method String StringBuilder.toString()>
	//* 123  223:invokeinterface #151 <Method void Logger.d(String, String)>
	//* 124  228:aload_3         
	//* 125  229:areturn         
	//* 126  230:aload_1         
	//* 127  231:astore_2        
	//* 128  232:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//* 129  235:astore_3        
	//* 130  236:aload_1         
	//* 131  237:astore_2        
	//* 132  238:new             #54  <Class StringBuilder>
	//* 133  241:dup             
	//* 134  242:invokespecial   #57  <Method void StringBuilder()>
	//* 135  245:astore          4
	//* 136  247:aload_1         
	//* 137  248:astore_2        
	//* 138  249:aload           4
	//* 139  251:ldc1            #186 <String "Checking for updates failed. Response code: ">
	//* 140  253:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//* 141  256:pop             
	//* 142  257:aload_1         
	//* 143  258:astore_2        
	//* 144  259:aload           4
	//* 145  261:aload_1         
	//* 146  262:invokevirtual   #190 <Method int HttpRequest.code()>
	//* 147  265:invokevirtual   #193 <Method StringBuilder StringBuilder.append(int)>
	//* 148  268:pop             
	//* 149  269:aload_1         
	//* 150  270:astore_2        
	//* 151  271:aload_3         
	//* 152  272:ldc1            #145 <String "Beta">
	//* 153  274:aload           4
	//* 154  276:invokevirtual   #78  <Method String StringBuilder.toString()>
	//* 155  279:invokeinterface #196 <Method void Logger.e(String, String)>
	//* 156  284:aload_1         
	//* 157  285:ifnull          442
	//* 158  288:aload_1         
	//* 159  289:ldc1            #178 <String "X-REQUEST-ID">
	//* 160  291:invokevirtual   #180 <Method String HttpRequest.header(String)>
	//* 161  294:astore_2        
	//* 162  295:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//* 163  298:astore_3        
	//* 164  299:new             #54  <Class StringBuilder>
	//* 165  302:dup             
	//* 166  303:invokespecial   #57  <Method void StringBuilder()>
	//* 167  306:astore_1        
	//* 168  307:goto            417
	//* 169  310:astore_3        
	//* 170  311:goto            337
	//* 171  314:astore_1        
	//* 172  315:aload_3         
	//* 173  316:astore_2        
	//* 174  317:goto            445
		// Misplaced declaration of an exception variable
		catch(String s1)
	//* 175  320:astore_2        
		{
			s = ((String) (buildproperties));
	//  176  321:aload_3         
	//  177  322:astore_1        
			buildproperties = ((BuildProperties) (s1));
	//  178  323:aload_2         
	//  179  324:astore_3        
			break MISSING_BLOCK_LABEL_337;
	//  180  325:goto            337
		}
		s1 = s;
		try
		{
			buildproperties = ((BuildProperties) (Fabric.getLogger()));
		}
		// Misplaced declaration of an exception variable
		catch(BuildProperties buildproperties)
		{
			break MISSING_BLOCK_LABEL_337;
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
			break MISSING_BLOCK_LABEL_230;
		s1 = s;
		Fabric.getLogger().d("Beta", "Checking for updates was successful");
		s1 = s;
		buildproperties = ((BuildProperties) (new JSONObject(((HttpRequest) (s)).body())));
		s1 = s;
		buildproperties = ((BuildProperties) (responseTransform.fromJson(((JSONObject) (buildproperties)))));
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
			break MISSING_BLOCK_LABEL_442;
		s1 = ((HttpRequest) (s)).header("X-REQUEST-ID");
		buildproperties = ((BuildProperties) (Fabric.getLogger()));
		s = ((String) (new StringBuilder()));
		break MISSING_BLOCK_LABEL_417;
		s;
		s1 = ((String) (buildproperties));
		break MISSING_BLOCK_LABEL_445;
		s;
	//  181  328:astore_1        
		s1 = null;
	//  182  329:aconst_null     
	//  183  330:astore_2        
		break MISSING_BLOCK_LABEL_445;
	//  184  331:goto            445
		buildproperties;
	//  185  334:astore_3        
		s = null;
	//  186  335:aconst_null     
	//  187  336:astore_1        
		s1 = s;
	//  188  337:aload_1         
	//  189  338:astore_2        
		obj = ((Object) (Fabric.getLogger()));
	//  190  339:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//  191  342:astore          4
		s1 = s;
	//  192  344:aload_1         
	//  193  345:astore_2        
		StringBuilder stringbuilder2 = new StringBuilder();
	//  194  346:new             #54  <Class StringBuilder>
	//  195  349:dup             
	//  196  350:invokespecial   #57  <Method void StringBuilder()>
	//  197  353:astore          5
		s1 = s;
	//  198  355:aload_1         
	//  199  356:astore_2        
		stringbuilder2.append("Error while checking for updates from ");
	//  200  357:aload           5
	//  201  359:ldc1            #198 <String "Error while checking for updates from ">
	//  202  361:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//  203  364:pop             
		s1 = s;
	//  204  365:aload_1         
	//  205  366:astore_2        
		stringbuilder2.append(getUrl());
	//  206  367:aload           5
	//  207  369:aload_0         
	//  208  370:invokevirtual   #143 <Method String getUrl()>
	//  209  373:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//  210  376:pop             
		s1 = s;
	//  211  377:aload_1         
	//  212  378:astore_2        
		((Logger) (obj)).e("Beta", stringbuilder2.toString(), ((Throwable) (buildproperties)));
	//  213  379:aload           4
	//  214  381:ldc1            #145 <String "Beta">
	//  215  383:aload           5
	//  216  385:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  217  388:aload_3         
	//  218  389:invokeinterface #201 <Method void Logger.e(String, String, Throwable)>
		if(s == null)
			break MISSING_BLOCK_LABEL_442;
	//  219  394:aload_1         
	//  220  395:ifnull          442
		s1 = ((HttpRequest) (s)).header("X-REQUEST-ID");
	//  221  398:aload_1         
	//  222  399:ldc1            #178 <String "X-REQUEST-ID">
	//  223  401:invokevirtual   #180 <Method String HttpRequest.header(String)>
	//  224  404:astore_2        
		buildproperties = ((BuildProperties) (Fabric.getLogger()));
	//  225  405:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//  226  408:astore_3        
		s = ((String) (new StringBuilder()));
	//  227  409:new             #54  <Class StringBuilder>
	//  228  412:dup             
	//  229  413:invokespecial   #57  <Method void StringBuilder()>
	//  230  416:astore_1        
		((StringBuilder) (s)).append("Checking for updates request ID: ");
	//  231  417:aload_1         
	//  232  418:ldc1            #182 <String "Checking for updates request ID: ">
	//  233  420:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//  234  423:pop             
		((StringBuilder) (s)).append(s1);
	//  235  424:aload_1         
	//  236  425:aload_2         
	//  237  426:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//  238  429:pop             
		((Logger) (buildproperties)).d("Fabric", ((StringBuilder) (s)).toString());
	//  239  430:aload_3         
	//  240  431:ldc1            #184 <String "Fabric">
	//  241  433:aload_1         
	//  242  434:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  243  437:invokeinterface #151 <Method void Logger.d(String, String)>
		return null;
	//  244  442:aconst_null     
	//  245  443:areturn         
		s;
	//  246  444:astore_1        
		if(s1 != null)
	//* 247  445:aload_2         
	//* 248  446:ifnull          497
		{
			s1 = ((HttpRequest) (s1)).header("X-REQUEST-ID");
	//  249  449:aload_2         
	//  250  450:ldc1            #178 <String "X-REQUEST-ID">
	//  251  452:invokevirtual   #180 <Method String HttpRequest.header(String)>
	//  252  455:astore_2        
			buildproperties = ((BuildProperties) (Fabric.getLogger()));
	//  253  456:invokestatic    #138 <Method Logger Fabric.getLogger()>
	//  254  459:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//  255  460:new             #54  <Class StringBuilder>
	//  256  463:dup             
	//  257  464:invokespecial   #57  <Method void StringBuilder()>
	//  258  467:astore          4
			stringbuilder.append("Checking for updates request ID: ");
	//  259  469:aload           4
	//  260  471:ldc1            #182 <String "Checking for updates request ID: ">
	//  261  473:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//  262  476:pop             
			stringbuilder.append(s1);
	//  263  477:aload           4
	//  264  479:aload_2         
	//  265  480:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//  266  483:pop             
			((Logger) (buildproperties)).d("Fabric", stringbuilder.toString());
	//  267  484:aload_3         
	//  268  485:ldc1            #184 <String "Fabric">
	//  269  487:aload           4
	//  270  489:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  271  492:invokeinterface #151 <Method void Logger.d(String, String)>
		}
		throw s;
	//  272  497:aload_1         
	//  273  498:athrow          
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
