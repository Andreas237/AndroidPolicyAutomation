// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.network.*;
import java.io.File;
import java.util.*;

// Referenced classes of package com.crashlytics.android.core:
//			CreateReportSpiCall, CreateReportRequest, Report

class DefaultCreateReportSpiCall extends AbstractSpiCall
	implements CreateReportSpiCall
{

	public DefaultCreateReportSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory)
	{
		super(kit, s, s1, httprequestfactory, HttpMethod.POST);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:getstatic       #27  <Field HttpMethod HttpMethod.POST>
	//    6    9:invokespecial   #30  <Method void AbstractSpiCall(Kit, String, String, HttpRequestFactory, HttpMethod)>
	//    7   12:return          
	}

	DefaultCreateReportSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory, HttpMethod httpmethod)
	{
		super(kit, s, s1, httprequestfactory, httpmethod);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #30  <Method void AbstractSpiCall(Kit, String, String, HttpRequestFactory, HttpMethod)>
	//    7   11:return          
	}

	private HttpRequest applyHeadersTo(HttpRequest httprequest, CreateReportRequest createreportrequest)
	{
		httprequest = httprequest.header("X-CRASHLYTICS-API-KEY", createreportrequest.apiKey).header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-API-CLIENT-VERSION", kit.getVersion());
	//    0    0:aload_1         
	//    1    1:ldc1            #35  <String "X-CRASHLYTICS-API-KEY">
	//    2    3:aload_2         
	//    3    4:getfield        #40  <Field String CreateReportRequest.apiKey>
	//    4    7:invokevirtual   #46  <Method HttpRequest HttpRequest.header(String, String)>
	//    5   10:ldc1            #48  <String "X-CRASHLYTICS-API-CLIENT-TYPE">
	//    6   12:ldc1            #50  <String "android">
	//    7   14:invokevirtual   #46  <Method HttpRequest HttpRequest.header(String, String)>
	//    8   17:ldc1            #52  <String "X-CRASHLYTICS-API-CLIENT-VERSION">
	//    9   19:aload_0         
	//   10   20:getfield        #56  <Field Kit kit>
	//   11   23:invokevirtual   #62  <Method String Kit.getVersion()>
	//   12   26:invokevirtual   #46  <Method HttpRequest HttpRequest.header(String, String)>
	//   13   29:astore_1        
		for(createreportrequest = ((CreateReportRequest) (createreportrequest.report.getCustomHeaders().entrySet().iterator())); ((Iterator) (createreportrequest)).hasNext();)
	//*  14   30:aload_2         
	//*  15   31:getfield        #66  <Field Report CreateReportRequest.report>
	//*  16   34:invokeinterface #72  <Method Map Report.getCustomHeaders()>
	//*  17   39:invokeinterface #78  <Method Set Map.entrySet()>
	//*  18   44:invokeinterface #84  <Method Iterator Set.iterator()>
	//*  19   49:astore_2        
	//*  20   50:aload_2         
	//*  21   51:invokeinterface #90  <Method boolean Iterator.hasNext()>
	//*  22   56:ifeq            76
			httprequest = httprequest.header((java.util.Map.Entry)((Iterator) (createreportrequest)).next());
	//   23   59:aload_1         
	//   24   60:aload_2         
	//   25   61:invokeinterface #94  <Method Object Iterator.next()>
	//   26   66:checkcast       #96  <Class java.util.Map$Entry>
	//   27   69:invokevirtual   #99  <Method HttpRequest HttpRequest.header(java.util.Map$Entry)>
	//   28   72:astore_1        

	//*  29   73:goto            50
		return httprequest;
	//   30   76:aload_1         
	//   31   77:areturn         
	}

	private HttpRequest applyMultipartDataTo(HttpRequest httprequest, Report report)
	{
		httprequest.part("report[identifier]", report.getIdentifier());
	//    0    0:aload_1         
	//    1    1:ldc1            #16  <String "report[identifier]">
	//    2    3:aload_2         
	//    3    4:invokeinterface #104 <Method String Report.getIdentifier()>
	//    4    9:invokevirtual   #107 <Method HttpRequest HttpRequest.part(String, String)>
	//    5   12:pop             
		if(report.getFiles().length != 1) goto _L2; else goto _L1
	//    6   13:aload_2         
	//    7   14:invokeinterface #111 <Method File[] Report.getFiles()>
	//    8   19:arraylength     
	//    9   20:iconst_1        
	//   10   21:icmpne          97
_L1:
		Object obj;
		Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Adding single file ").append(report.getFileName()).append(" to report ").append(report.getIdentifier()).toString());
	//   11   24:invokestatic    #117 <Method Logger Fabric.getLogger()>
	//   12   27:ldc1            #119 <String "CrashlyticsCore">
	//   13   29:new             #121 <Class StringBuilder>
	//   14   32:dup             
	//   15   33:invokespecial   #124 <Method void StringBuilder()>
	//   16   36:ldc1            #126 <String "Adding single file ">
	//   17   38:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   18   41:aload_2         
	//   19   42:invokeinterface #133 <Method String Report.getFileName()>
	//   20   47:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   21   50:ldc1            #135 <String " to report ">
	//   22   52:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   23   55:aload_2         
	//   24   56:invokeinterface #104 <Method String Report.getIdentifier()>
	//   25   61:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   26   64:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   27   67:invokeinterface #144 <Method void Logger.d(String, String)>
		obj = ((Object) (httprequest.part("report[file]", report.getFileName(), "application/octet-stream", report.getFile())));
	//   28   72:aload_1         
	//   29   73:ldc1            #13  <String "report[file]">
	//   30   75:aload_2         
	//   31   76:invokeinterface #133 <Method String Report.getFileName()>
	//   32   81:ldc1            #10  <String "application/octet-stream">
	//   33   83:aload_2         
	//   34   84:invokeinterface #148 <Method File Report.getFile()>
	//   35   89:invokevirtual   #151 <Method HttpRequest HttpRequest.part(String, String, String, File)>
	//   36   92:astore          6
_L4:
		return ((HttpRequest) (obj));
	//   37   94:aload           6
	//   38   96:areturn         
_L2:
		int j = 0;
	//   39   97:iconst_0        
	//   40   98:istore          4
		File afile[] = report.getFiles();
	//   41  100:aload_2         
	//   42  101:invokeinterface #111 <Method File[] Report.getFiles()>
	//   43  106:astore          7
		int k = afile.length;
	//   44  108:aload           7
	//   45  110:arraylength     
	//   46  111:istore          5
		int i = 0;
	//   47  113:iconst_0        
	//   48  114:istore_3        
		do
		{
			obj = ((Object) (httprequest));
	//   49  115:aload_1         
	//   50  116:astore          6
			if(i >= k)
				continue;
	//   51  118:iload_3         
	//   52  119:iload           5
	//   53  121:icmpge          94
			obj = ((Object) (afile[i]));
	//   54  124:aload           7
	//   55  126:iload_3         
	//   56  127:aaload          
	//   57  128:astore          6
			Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Adding file ").append(((File) (obj)).getName()).append(" to report ").append(report.getIdentifier()).toString());
	//   58  130:invokestatic    #117 <Method Logger Fabric.getLogger()>
	//   59  133:ldc1            #119 <String "CrashlyticsCore">
	//   60  135:new             #121 <Class StringBuilder>
	//   61  138:dup             
	//   62  139:invokespecial   #124 <Method void StringBuilder()>
	//   63  142:ldc1            #153 <String "Adding file ">
	//   64  144:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   65  147:aload           6
	//   66  149:invokevirtual   #158 <Method String File.getName()>
	//   67  152:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   68  155:ldc1            #135 <String " to report ">
	//   69  157:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   70  160:aload_2         
	//   71  161:invokeinterface #104 <Method String Report.getIdentifier()>
	//   72  166:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   73  169:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   74  172:invokeinterface #144 <Method void Logger.d(String, String)>
			httprequest.part((new StringBuilder()).append("report[file").append(j).append("]").toString(), ((File) (obj)).getName(), "application/octet-stream", ((File) (obj)));
	//   75  177:aload_1         
	//   76  178:new             #121 <Class StringBuilder>
	//   77  181:dup             
	//   78  182:invokespecial   #124 <Method void StringBuilder()>
	//   79  185:ldc1            #19  <String "report[file">
	//   80  187:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   81  190:iload           4
	//   82  192:invokevirtual   #161 <Method StringBuilder StringBuilder.append(int)>
	//   83  195:ldc1            #163 <String "]">
	//   84  197:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   85  200:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   86  203:aload           6
	//   87  205:invokevirtual   #158 <Method String File.getName()>
	//   88  208:ldc1            #10  <String "application/octet-stream">
	//   89  210:aload           6
	//   90  212:invokevirtual   #151 <Method HttpRequest HttpRequest.part(String, String, String, File)>
	//   91  215:pop             
			j++;
	//   92  216:iload           4
	//   93  218:iconst_1        
	//   94  219:iadd            
	//   95  220:istore          4
			i++;
	//   96  222:iload_3         
	//   97  223:iconst_1        
	//   98  224:iadd            
	//   99  225:istore_3        
		} while(true);
	//  100  226:goto            115
		if(true) goto _L4; else goto _L3
_L3:
	}

	public boolean invoke(CreateReportRequest createreportrequest)
	{
		createreportrequest = ((CreateReportRequest) (applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createreportrequest), createreportrequest.report)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #169 <Method HttpRequest getHttpRequest()>
	//    4    6:aload_1         
	//    5    7:invokespecial   #171 <Method HttpRequest applyHeadersTo(HttpRequest, CreateReportRequest)>
	//    6   10:aload_1         
	//    7   11:getfield        #66  <Field Report CreateReportRequest.report>
	//    8   14:invokespecial   #173 <Method HttpRequest applyMultipartDataTo(HttpRequest, Report)>
	//    9   17:astore_1        
		Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Sending report to: ").append(getUrl()).toString());
	//   10   18:invokestatic    #117 <Method Logger Fabric.getLogger()>
	//   11   21:ldc1            #119 <String "CrashlyticsCore">
	//   12   23:new             #121 <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #124 <Method void StringBuilder()>
	//   15   30:ldc1            #175 <String "Sending report to: ">
	//   16   32:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:aload_0         
	//   18   36:invokevirtual   #178 <Method String getUrl()>
	//   19   39:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   21   45:invokeinterface #144 <Method void Logger.d(String, String)>
		int i = ((HttpRequest) (createreportrequest)).code();
	//   22   50:aload_1         
	//   23   51:invokevirtual   #182 <Method int HttpRequest.code()>
	//   24   54:istore_2        
		Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Create report request ID: ").append(((HttpRequest) (createreportrequest)).header("X-REQUEST-ID")).toString());
	//   25   55:invokestatic    #117 <Method Logger Fabric.getLogger()>
	//   26   58:ldc1            #119 <String "CrashlyticsCore">
	//   27   60:new             #121 <Class StringBuilder>
	//   28   63:dup             
	//   29   64:invokespecial   #124 <Method void StringBuilder()>
	//   30   67:ldc1            #184 <String "Create report request ID: ">
	//   31   69:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   32   72:aload_1         
	//   33   73:ldc1            #186 <String "X-REQUEST-ID">
	//   34   75:invokevirtual   #189 <Method String HttpRequest.header(String)>
	//   35   78:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   36   81:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   37   84:invokeinterface #144 <Method void Logger.d(String, String)>
		Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Result was: ").append(i).toString());
	//   38   89:invokestatic    #117 <Method Logger Fabric.getLogger()>
	//   39   92:ldc1            #119 <String "CrashlyticsCore">
	//   40   94:new             #121 <Class StringBuilder>
	//   41   97:dup             
	//   42   98:invokespecial   #124 <Method void StringBuilder()>
	//   43  101:ldc1            #191 <String "Result was: ">
	//   44  103:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   45  106:iload_2         
	//   46  107:invokevirtual   #161 <Method StringBuilder StringBuilder.append(int)>
	//   47  110:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   48  113:invokeinterface #144 <Method void Logger.d(String, String)>
		return ResponseParser.parse(i) == 0;
	//   49  118:iload_2         
	//   50  119:invokestatic    #197 <Method int ResponseParser.parse(int)>
	//   51  122:ifne            127
	//   52  125:iconst_1        
	//   53  126:ireturn         
	//   54  127:iconst_0        
	//   55  128:ireturn         
	}

	static final String FILE_CONTENT_TYPE = "application/octet-stream";
	static final String FILE_PARAM = "report[file]";
	static final String IDENTIFIER_PARAM = "report[identifier]";
	static final String MULTI_FILE_PARAM = "report[file";
}
