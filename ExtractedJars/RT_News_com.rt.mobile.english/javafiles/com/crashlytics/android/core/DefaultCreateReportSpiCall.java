// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.network.*;
import java.util.*;

// Referenced classes of package com.crashlytics.android.core:
//			CreateReportSpiCall, CreateReportRequest, CrashlyticsCore, Report

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
	//    5    6:getstatic       #24  <Field HttpMethod HttpMethod.POST>
	//    6    9:invokespecial   #27  <Method void AbstractSpiCall(Kit, String, String, HttpRequestFactory, HttpMethod)>
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
	//    6    8:invokespecial   #27  <Method void AbstractSpiCall(Kit, String, String, HttpRequestFactory, HttpMethod)>
	//    7   11:return          
	}

	private HttpRequest applyHeadersTo(HttpRequest httprequest, CreateReportRequest createreportrequest)
	{
		httprequest = httprequest.header("X-CRASHLYTICS-API-KEY", createreportrequest.apiKey).header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-API-CLIENT-VERSION", CrashlyticsCore.getInstance().getVersion());
	//    0    0:aload_1         
	//    1    1:ldc1            #32  <String "X-CRASHLYTICS-API-KEY">
	//    2    3:aload_2         
	//    3    4:getfield        #37  <Field String CreateReportRequest.apiKey>
	//    4    7:invokevirtual   #43  <Method HttpRequest HttpRequest.header(String, String)>
	//    5   10:ldc1            #45  <String "X-CRASHLYTICS-API-CLIENT-TYPE">
	//    6   12:ldc1            #47  <String "android">
	//    7   14:invokevirtual   #43  <Method HttpRequest HttpRequest.header(String, String)>
	//    8   17:ldc1            #49  <String "X-CRASHLYTICS-API-CLIENT-VERSION">
	//    9   19:invokestatic    #55  <Method CrashlyticsCore CrashlyticsCore.getInstance()>
	//   10   22:invokevirtual   #59  <Method String CrashlyticsCore.getVersion()>
	//   11   25:invokevirtual   #43  <Method HttpRequest HttpRequest.header(String, String)>
	//   12   28:astore_1        
		for(createreportrequest = ((CreateReportRequest) (createreportrequest.report.getCustomHeaders().entrySet().iterator())); ((Iterator) (createreportrequest)).hasNext();)
	//*  13   29:aload_2         
	//*  14   30:getfield        #63  <Field Report CreateReportRequest.report>
	//*  15   33:invokeinterface #69  <Method Map Report.getCustomHeaders()>
	//*  16   38:invokeinterface #75  <Method Set Map.entrySet()>
	//*  17   43:invokeinterface #81  <Method Iterator Set.iterator()>
	//*  18   48:astore_2        
	//*  19   49:aload_2         
	//*  20   50:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//*  21   55:ifeq            75
			httprequest = httprequest.header((java.util.Map.Entry)((Iterator) (createreportrequest)).next());
	//   22   58:aload_1         
	//   23   59:aload_2         
	//   24   60:invokeinterface #91  <Method Object Iterator.next()>
	//   25   65:checkcast       #93  <Class java.util.Map$Entry>
	//   26   68:invokevirtual   #96  <Method HttpRequest HttpRequest.header(java.util.Map$Entry)>
	//   27   71:astore_1        

	//*  28   72:goto            49
		return httprequest;
	//   29   75:aload_1         
	//   30   76:areturn         
	}

	private HttpRequest applyMultipartDataTo(HttpRequest httprequest, CreateReportRequest createreportrequest)
	{
		createreportrequest = ((CreateReportRequest) (createreportrequest.report));
	//    0    0:aload_2         
	//    1    1:getfield        #63  <Field Report CreateReportRequest.report>
	//    2    4:astore_2        
		return httprequest.part("report[file]", ((Report) (createreportrequest)).getFileName(), "application/octet-stream", ((Report) (createreportrequest)).getFile()).part("report[identifier]", ((Report) (createreportrequest)).getIdentifier());
	//    3    5:aload_1         
	//    4    6:ldc1            #13  <String "report[file]">
	//    5    8:aload_2         
	//    6    9:invokeinterface #100 <Method String Report.getFileName()>
	//    7   14:ldc1            #10  <String "application/octet-stream">
	//    8   16:aload_2         
	//    9   17:invokeinterface #104 <Method java.io.File Report.getFile()>
	//   10   22:invokevirtual   #108 <Method HttpRequest HttpRequest.part(String, String, String, java.io.File)>
	//   11   25:ldc1            #16  <String "report[identifier]">
	//   12   27:aload_2         
	//   13   28:invokeinterface #111 <Method String Report.getIdentifier()>
	//   14   33:invokevirtual   #113 <Method HttpRequest HttpRequest.part(String, String)>
	//   15   36:areturn         
	}

	public boolean invoke(CreateReportRequest createreportrequest)
	{
		createreportrequest = ((CreateReportRequest) (applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createreportrequest), createreportrequest)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #119 <Method HttpRequest getHttpRequest()>
	//    4    6:aload_1         
	//    5    7:invokespecial   #121 <Method HttpRequest applyHeadersTo(HttpRequest, CreateReportRequest)>
	//    6   10:aload_1         
	//    7   11:invokespecial   #123 <Method HttpRequest applyMultipartDataTo(HttpRequest, CreateReportRequest)>
	//    8   14:astore_1        
		Object obj = ((Object) (Fabric.getLogger()));
	//    9   15:invokestatic    #129 <Method Logger Fabric.getLogger()>
	//   10   18:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   11   19:new             #131 <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #134 <Method void StringBuilder()>
	//   14   26:astore          4
		stringbuilder.append("Sending report to: ");
	//   15   28:aload           4
	//   16   30:ldc1            #136 <String "Sending report to: ">
	//   17   32:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		stringbuilder.append(getUrl());
	//   19   36:aload           4
	//   20   38:aload_0         
	//   21   39:invokevirtual   #143 <Method String getUrl()>
	//   22   42:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		((Logger) (obj)).d("CrashlyticsCore", stringbuilder.toString());
	//   24   46:aload_3         
	//   25   47:ldc1            #145 <String "CrashlyticsCore">
	//   26   49:aload           4
	//   27   51:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   28   54:invokeinterface #154 <Method void Logger.d(String, String)>
		int i = ((HttpRequest) (createreportrequest)).code();
	//   29   59:aload_1         
	//   30   60:invokevirtual   #158 <Method int HttpRequest.code()>
	//   31   63:istore_2        
		obj = ((Object) (Fabric.getLogger()));
	//   32   64:invokestatic    #129 <Method Logger Fabric.getLogger()>
	//   33   67:astore_3        
		stringbuilder = new StringBuilder();
	//   34   68:new             #131 <Class StringBuilder>
	//   35   71:dup             
	//   36   72:invokespecial   #134 <Method void StringBuilder()>
	//   37   75:astore          4
		stringbuilder.append("Create report request ID: ");
	//   38   77:aload           4
	//   39   79:ldc1            #160 <String "Create report request ID: ">
	//   40   81:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   41   84:pop             
		stringbuilder.append(((HttpRequest) (createreportrequest)).header("X-REQUEST-ID"));
	//   42   85:aload           4
	//   43   87:aload_1         
	//   44   88:ldc1            #162 <String "X-REQUEST-ID">
	//   45   90:invokevirtual   #165 <Method String HttpRequest.header(String)>
	//   46   93:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   47   96:pop             
		((Logger) (obj)).d("CrashlyticsCore", stringbuilder.toString());
	//   48   97:aload_3         
	//   49   98:ldc1            #145 <String "CrashlyticsCore">
	//   50  100:aload           4
	//   51  102:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   52  105:invokeinterface #154 <Method void Logger.d(String, String)>
		createreportrequest = ((CreateReportRequest) (Fabric.getLogger()));
	//   53  110:invokestatic    #129 <Method Logger Fabric.getLogger()>
	//   54  113:astore_1        
		obj = ((Object) (new StringBuilder()));
	//   55  114:new             #131 <Class StringBuilder>
	//   56  117:dup             
	//   57  118:invokespecial   #134 <Method void StringBuilder()>
	//   58  121:astore_3        
		((StringBuilder) (obj)).append("Result was: ");
	//   59  122:aload_3         
	//   60  123:ldc1            #167 <String "Result was: ">
	//   61  125:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   62  128:pop             
		((StringBuilder) (obj)).append(i);
	//   63  129:aload_3         
	//   64  130:iload_2         
	//   65  131:invokevirtual   #170 <Method StringBuilder StringBuilder.append(int)>
	//   66  134:pop             
		((Logger) (createreportrequest)).d("CrashlyticsCore", ((StringBuilder) (obj)).toString());
	//   67  135:aload_1         
	//   68  136:ldc1            #145 <String "CrashlyticsCore">
	//   69  138:aload_3         
	//   70  139:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   71  142:invokeinterface #154 <Method void Logger.d(String, String)>
		return ResponseParser.parse(i) == 0;
	//   72  147:iload_2         
	//   73  148:invokestatic    #176 <Method int ResponseParser.parse(int)>
	//   74  151:ifne            156
	//   75  154:iconst_1        
	//   76  155:ireturn         
	//   77  156:iconst_0        
	//   78  157:ireturn         
	}

	static final String FILE_CONTENT_TYPE = "application/octet-stream";
	static final String FILE_PARAM = "report[file]";
	static final String IDENTIFIER_PARAM = "report[identifier]";
}
