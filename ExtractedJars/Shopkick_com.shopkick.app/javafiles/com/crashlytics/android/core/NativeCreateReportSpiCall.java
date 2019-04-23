// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.network.*;
import java.io.File;

// Referenced classes of package com.crashlytics.android.core:
//			CreateReportSpiCall, Report, CreateReportRequest

class NativeCreateReportSpiCall extends AbstractSpiCall
	implements CreateReportSpiCall
{

	public NativeCreateReportSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory)
	{
		super(kit, s, s1, httprequestfactory, HttpMethod.POST);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:getstatic       #51  <Field HttpMethod HttpMethod.POST>
	//    6    9:invokespecial   #54  <Method void AbstractSpiCall(Kit, String, String, HttpRequestFactory, HttpMethod)>
	//    7   12:return          
	}

	private HttpRequest applyHeadersTo(HttpRequest httprequest, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #59  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Crashlytics Android SDK/");
	//    4    8:aload_3         
	//    5    9:ldc1            #64  <String "Crashlytics Android SDK/">
	//    6   11:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(kit.getVersion());
	//    8   15:aload_3         
	//    9   16:aload_0         
	//   10   17:getfield        #72  <Field Kit kit>
	//   11   20:invokevirtual   #78  <Method String Kit.getVersion()>
	//   12   23:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		httprequest.header("User-Agent", stringbuilder.toString()).header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-API-CLIENT-VERSION", kit.getVersion()).header("X-CRASHLYTICS-API-KEY", s);
	//   14   27:aload_1         
	//   15   28:ldc1            #80  <String "User-Agent">
	//   16   30:aload_3         
	//   17   31:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   18   34:invokevirtual   #89  <Method HttpRequest HttpRequest.header(String, String)>
	//   19   37:ldc1            #91  <String "X-CRASHLYTICS-API-CLIENT-TYPE">
	//   20   39:ldc1            #93  <String "android">
	//   21   41:invokevirtual   #89  <Method HttpRequest HttpRequest.header(String, String)>
	//   22   44:ldc1            #95  <String "X-CRASHLYTICS-API-CLIENT-VERSION">
	//   23   46:aload_0         
	//   24   47:getfield        #72  <Field Kit kit>
	//   25   50:invokevirtual   #78  <Method String Kit.getVersion()>
	//   26   53:invokevirtual   #89  <Method HttpRequest HttpRequest.header(String, String)>
	//   27   56:ldc1            #97  <String "X-CRASHLYTICS-API-KEY">
	//   28   58:aload_2         
	//   29   59:invokevirtual   #89  <Method HttpRequest HttpRequest.header(String, String)>
	//   30   62:pop             
		return httprequest;
	//   31   63:aload_1         
	//   32   64:areturn         
	}

	private HttpRequest applyMultipartDataTo(HttpRequest httprequest, Report report)
	{
		httprequest.part("report_id", report.getIdentifier());
	//    0    0:aload_1         
	//    1    1:ldc1            #37  <String "report_id">
	//    2    3:aload_2         
	//    3    4:invokeinterface #104 <Method String Report.getIdentifier()>
	//    4    9:invokevirtual   #107 <Method HttpRequest HttpRequest.part(String, String)>
	//    5   12:pop             
		report = ((Report) (report.getFiles()));
	//    6   13:aload_2         
	//    7   14:invokeinterface #111 <Method File[] Report.getFiles()>
	//    8   19:astore_2        
		int j = report.length;
	//    9   20:aload_2         
	//   10   21:arraylength     
	//   11   22:istore          4
		for(int i = 0; i < j; i++)
	//*  12   24:iconst_0        
	//*  13   25:istore_3        
	//*  14   26:iload_3         
	//*  15   27:iload           4
	//*  16   29:icmpge          361
		{
			File file = ((File) (report[i]));
	//   17   32:aload_2         
	//   18   33:iload_3         
	//   19   34:aaload          
	//   20   35:astore          5
			if(file.getName().equals("minidump"))
	//*  21   37:aload           5
	//*  22   39:invokevirtual   #116 <Method String File.getName()>
	//*  23   42:ldc1            #118 <String "minidump">
	//*  24   44:invokevirtual   #124 <Method boolean String.equals(Object)>
	//*  25   47:ifeq            69
			{
				httprequest.part("minidump_file", file.getName(), "application/octet-stream", file);
	//   26   50:aload_1         
	//   27   51:ldc1            #31  <String "minidump_file">
	//   28   53:aload           5
	//   29   55:invokevirtual   #116 <Method String File.getName()>
	//   30   58:ldc1            #19  <String "application/octet-stream">
	//   31   60:aload           5
	//   32   62:invokevirtual   #127 <Method HttpRequest HttpRequest.part(String, String, String, File)>
	//   33   65:pop             
				continue;
	//   34   66:goto            354
			}
			if(file.getName().equals("metadata"))
	//*  35   69:aload           5
	//*  36   71:invokevirtual   #116 <Method String File.getName()>
	//*  37   74:ldc1            #129 <String "metadata">
	//*  38   76:invokevirtual   #124 <Method boolean String.equals(Object)>
	//*  39   79:ifeq            101
			{
				httprequest.part("crash_meta_file", file.getName(), "application/octet-stream", file);
	//   40   82:aload_1         
	//   41   83:ldc1            #28  <String "crash_meta_file">
	//   42   85:aload           5
	//   43   87:invokevirtual   #116 <Method String File.getName()>
	//   44   90:ldc1            #19  <String "application/octet-stream">
	//   45   92:aload           5
	//   46   94:invokevirtual   #127 <Method HttpRequest HttpRequest.part(String, String, String, File)>
	//   47   97:pop             
				continue;
	//   48   98:goto            354
			}
			if(file.getName().equals("binaryImages"))
	//*  49  101:aload           5
	//*  50  103:invokevirtual   #116 <Method String File.getName()>
	//*  51  106:ldc1            #131 <String "binaryImages">
	//*  52  108:invokevirtual   #124 <Method boolean String.equals(Object)>
	//*  53  111:ifeq            133
			{
				httprequest.part("binary_images_file", file.getName(), "application/octet-stream", file);
	//   54  114:aload_1         
	//   55  115:ldc1            #13  <String "binary_images_file">
	//   56  117:aload           5
	//   57  119:invokevirtual   #116 <Method String File.getName()>
	//   58  122:ldc1            #19  <String "application/octet-stream">
	//   59  124:aload           5
	//   60  126:invokevirtual   #127 <Method HttpRequest HttpRequest.part(String, String, String, File)>
	//   61  129:pop             
				continue;
	//   62  130:goto            354
			}
			if(file.getName().equals("session"))
	//*  63  133:aload           5
	//*  64  135:invokevirtual   #116 <Method String File.getName()>
	//*  65  138:ldc1            #133 <String "session">
	//*  66  140:invokevirtual   #124 <Method boolean String.equals(Object)>
	//*  67  143:ifeq            165
			{
				httprequest.part("session_meta_file", file.getName(), "application/octet-stream", file);
	//   68  146:aload_1         
	//   69  147:ldc1            #40  <String "session_meta_file">
	//   70  149:aload           5
	//   71  151:invokevirtual   #116 <Method String File.getName()>
	//   72  154:ldc1            #19  <String "application/octet-stream">
	//   73  156:aload           5
	//   74  158:invokevirtual   #127 <Method HttpRequest HttpRequest.part(String, String, String, File)>
	//   75  161:pop             
				continue;
	//   76  162:goto            354
			}
			if(file.getName().equals("app"))
	//*  77  165:aload           5
	//*  78  167:invokevirtual   #116 <Method String File.getName()>
	//*  79  170:ldc1            #135 <String "app">
	//*  80  172:invokevirtual   #124 <Method boolean String.equals(Object)>
	//*  81  175:ifeq            197
			{
				httprequest.part("app_meta_file", file.getName(), "application/octet-stream", file);
	//   82  178:aload_1         
	//   83  179:ldc1            #10  <String "app_meta_file">
	//   84  181:aload           5
	//   85  183:invokevirtual   #116 <Method String File.getName()>
	//   86  186:ldc1            #19  <String "application/octet-stream">
	//   87  188:aload           5
	//   88  190:invokevirtual   #127 <Method HttpRequest HttpRequest.part(String, String, String, File)>
	//   89  193:pop             
				continue;
	//   90  194:goto            354
			}
			if(file.getName().equals("device"))
	//*  91  197:aload           5
	//*  92  199:invokevirtual   #116 <Method String File.getName()>
	//*  93  202:ldc1            #137 <String "device">
	//*  94  204:invokevirtual   #124 <Method boolean String.equals(Object)>
	//*  95  207:ifeq            229
			{
				httprequest.part("device_meta_file", file.getName(), "application/octet-stream", file);
	//   96  210:aload_1         
	//   97  211:ldc1            #16  <String "device_meta_file">
	//   98  213:aload           5
	//   99  215:invokevirtual   #116 <Method String File.getName()>
	//  100  218:ldc1            #19  <String "application/octet-stream">
	//  101  220:aload           5
	//  102  222:invokevirtual   #127 <Method HttpRequest HttpRequest.part(String, String, String, File)>
	//  103  225:pop             
				continue;
	//  104  226:goto            354
			}
			if(file.getName().equals("os"))
	//* 105  229:aload           5
	//* 106  231:invokevirtual   #116 <Method String File.getName()>
	//* 107  234:ldc1            #139 <String "os">
	//* 108  236:invokevirtual   #124 <Method boolean String.equals(Object)>
	//* 109  239:ifeq            261
			{
				httprequest.part("os_meta_file", file.getName(), "application/octet-stream", file);
	//  110  242:aload_1         
	//  111  243:ldc1            #34  <String "os_meta_file">
	//  112  245:aload           5
	//  113  247:invokevirtual   #116 <Method String File.getName()>
	//  114  250:ldc1            #19  <String "application/octet-stream">
	//  115  252:aload           5
	//  116  254:invokevirtual   #127 <Method HttpRequest HttpRequest.part(String, String, String, File)>
	//  117  257:pop             
				continue;
	//  118  258:goto            354
			}
			if(file.getName().equals("user"))
	//* 119  261:aload           5
	//* 120  263:invokevirtual   #116 <Method String File.getName()>
	//* 121  266:ldc1            #141 <String "user">
	//* 122  268:invokevirtual   #124 <Method boolean String.equals(Object)>
	//* 123  271:ifeq            293
			{
				httprequest.part("user_meta_file", file.getName(), "application/octet-stream", file);
	//  124  274:aload_1         
	//  125  275:ldc1            #43  <String "user_meta_file">
	//  126  277:aload           5
	//  127  279:invokevirtual   #116 <Method String File.getName()>
	//  128  282:ldc1            #19  <String "application/octet-stream">
	//  129  284:aload           5
	//  130  286:invokevirtual   #127 <Method HttpRequest HttpRequest.part(String, String, String, File)>
	//  131  289:pop             
				continue;
	//  132  290:goto            354
			}
			if(file.getName().equals("logs"))
	//* 133  293:aload           5
	//* 134  295:invokevirtual   #116 <Method String File.getName()>
	//* 135  298:ldc1            #143 <String "logs">
	//* 136  300:invokevirtual   #124 <Method boolean String.equals(Object)>
	//* 137  303:ifeq            325
			{
				httprequest.part("logs_file", file.getName(), "application/octet-stream", file);
	//  138  306:aload_1         
	//  139  307:ldc1            #25  <String "logs_file">
	//  140  309:aload           5
	//  141  311:invokevirtual   #116 <Method String File.getName()>
	//  142  314:ldc1            #19  <String "application/octet-stream">
	//  143  316:aload           5
	//  144  318:invokevirtual   #127 <Method HttpRequest HttpRequest.part(String, String, String, File)>
	//  145  321:pop             
				continue;
	//  146  322:goto            354
			}
			if(file.getName().equals("keys"))
	//* 147  325:aload           5
	//* 148  327:invokevirtual   #116 <Method String File.getName()>
	//* 149  330:ldc1            #145 <String "keys">
	//* 150  332:invokevirtual   #124 <Method boolean String.equals(Object)>
	//* 151  335:ifeq            354
				httprequest.part("keys_file", file.getName(), "application/octet-stream", file);
	//  152  338:aload_1         
	//  153  339:ldc1            #22  <String "keys_file">
	//  154  341:aload           5
	//  155  343:invokevirtual   #116 <Method String File.getName()>
	//  156  346:ldc1            #19  <String "application/octet-stream">
	//  157  348:aload           5
	//  158  350:invokevirtual   #127 <Method HttpRequest HttpRequest.part(String, String, String, File)>
	//  159  353:pop             
		}

	//  160  354:iload_3         
	//  161  355:iconst_1        
	//  162  356:iadd            
	//  163  357:istore_3        
	//* 164  358:goto            26
		return httprequest;
	//  165  361:aload_1         
	//  166  362:areturn         
	}

	public boolean invoke(CreateReportRequest createreportrequest)
	{
		createreportrequest = ((CreateReportRequest) (applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createreportrequest.apiKey), createreportrequest.report)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #151 <Method HttpRequest getHttpRequest()>
	//    4    6:aload_1         
	//    5    7:getfield        #156 <Field String CreateReportRequest.apiKey>
	//    6   10:invokespecial   #158 <Method HttpRequest applyHeadersTo(HttpRequest, String)>
	//    7   13:aload_1         
	//    8   14:getfield        #162 <Field Report CreateReportRequest.report>
	//    9   17:invokespecial   #164 <Method HttpRequest applyMultipartDataTo(HttpRequest, Report)>
	//   10   20:astore_1        
		Object obj = ((Object) (Fabric.getLogger()));
	//   11   21:invokestatic    #170 <Method Logger Fabric.getLogger()>
	//   12   24:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   13   25:new             #59  <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #62  <Method void StringBuilder()>
	//   16   32:astore          4
		stringbuilder.append("Sending report to: ");
	//   17   34:aload           4
	//   18   36:ldc1            #172 <String "Sending report to: ">
	//   19   38:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
		stringbuilder.append(getUrl());
	//   21   42:aload           4
	//   22   44:aload_0         
	//   23   45:invokevirtual   #175 <Method String getUrl()>
	//   24   48:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		((Logger) (obj)).d("CrashlyticsCore", stringbuilder.toString());
	//   26   52:aload_3         
	//   27   53:ldc1            #177 <String "CrashlyticsCore">
	//   28   55:aload           4
	//   29   57:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   30   60:invokeinterface #183 <Method void Logger.d(String, String)>
		int i = ((HttpRequest) (createreportrequest)).code();
	//   31   65:aload_1         
	//   32   66:invokevirtual   #187 <Method int HttpRequest.code()>
	//   33   69:istore_2        
		createreportrequest = ((CreateReportRequest) (Fabric.getLogger()));
	//   34   70:invokestatic    #170 <Method Logger Fabric.getLogger()>
	//   35   73:astore_1        
		obj = ((Object) (new StringBuilder()));
	//   36   74:new             #59  <Class StringBuilder>
	//   37   77:dup             
	//   38   78:invokespecial   #62  <Method void StringBuilder()>
	//   39   81:astore_3        
		((StringBuilder) (obj)).append("Result was: ");
	//   40   82:aload_3         
	//   41   83:ldc1            #189 <String "Result was: ">
	//   42   85:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   43   88:pop             
		((StringBuilder) (obj)).append(i);
	//   44   89:aload_3         
	//   45   90:iload_2         
	//   46   91:invokevirtual   #192 <Method StringBuilder StringBuilder.append(int)>
	//   47   94:pop             
		((Logger) (createreportrequest)).d("CrashlyticsCore", ((StringBuilder) (obj)).toString());
	//   48   95:aload_1         
	//   49   96:ldc1            #177 <String "CrashlyticsCore">
	//   50   98:aload_3         
	//   51   99:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   52  102:invokeinterface #183 <Method void Logger.d(String, String)>
		return ResponseParser.parse(i) == 0;
	//   53  107:iload_2         
	//   54  108:invokestatic    #198 <Method int ResponseParser.parse(int)>
	//   55  111:ifne            116
	//   56  114:iconst_1        
	//   57  115:ireturn         
	//   58  116:iconst_0        
	//   59  117:ireturn         
	}

	private static final String APP_META_FILE_MULTIPART_PARAM = "app_meta_file";
	private static final String BINARY_IMAGES_FILE_MULTIPART_PARAM = "binary_images_file";
	private static final String DEVICE_META_FILE_MULTIPART_PARAM = "device_meta_file";
	private static final String GZIP_FILE_CONTENT_TYPE = "application/octet-stream";
	private static final String KEYS_FILE_MULTIPART_PARAM = "keys_file";
	private static final String LOGS_FILE_MULTIPART_PARAM = "logs_file";
	private static final String METADATA_FILE_MULTIPART_PARAM = "crash_meta_file";
	private static final String MINIDUMP_FILE_MULTIPART_PARAM = "minidump_file";
	private static final String OS_META_FILE_MULTIPART_PARAM = "os_meta_file";
	private static final String REPORT_IDENTIFIER_PARAM = "report_id";
	private static final String SESSION_META_FILE_MULTIPART_PARAM = "session_meta_file";
	private static final String USER_META_FILE_MULTIPART_PARAM = "user_meta_file";
}
