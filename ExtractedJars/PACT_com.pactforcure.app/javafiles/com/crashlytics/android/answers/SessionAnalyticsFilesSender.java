// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.events.FilesSender;
import io.fabric.sdk.android.services.network.*;
import java.io.File;
import java.util.Iterator;
import java.util.List;

class SessionAnalyticsFilesSender extends AbstractSpiCall
	implements FilesSender
{

	public SessionAnalyticsFilesSender(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory, String s2)
	{
		super(kit, s, s1, httprequestfactory, HttpMethod.POST);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:getstatic       #22  <Field HttpMethod HttpMethod.POST>
	//    6    9:invokespecial   #25  <Method void AbstractSpiCall(Kit, String, String, HttpRequestFactory, HttpMethod)>
		apiKey = s2;
	//    7   12:aload_0         
	//    8   13:aload           5
	//    9   15:putfield        #27  <Field String apiKey>
	//   10   18:return          
	}

	public boolean send(List list)
	{
		HttpRequest httprequest = getHttpRequest().header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-API-CLIENT-VERSION", kit.getVersion()).header("X-CRASHLYTICS-API-KEY", apiKey);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method HttpRequest getHttpRequest()>
	//    2    4:ldc1            #36  <String "X-CRASHLYTICS-API-CLIENT-TYPE">
	//    3    6:ldc1            #38  <String "android">
	//    4    8:invokevirtual   #44  <Method HttpRequest HttpRequest.header(String, String)>
	//    5   11:ldc1            #46  <String "X-CRASHLYTICS-API-CLIENT-VERSION">
	//    6   13:aload_0         
	//    7   14:getfield        #50  <Field Kit kit>
	//    8   17:invokevirtual   #56  <Method String Kit.getVersion()>
	//    9   20:invokevirtual   #44  <Method HttpRequest HttpRequest.header(String, String)>
	//   10   23:ldc1            #58  <String "X-CRASHLYTICS-API-KEY">
	//   11   25:aload_0         
	//   12   26:getfield        #27  <Field String apiKey>
	//   13   29:invokevirtual   #44  <Method HttpRequest HttpRequest.header(String, String)>
	//   14   32:astore_3        
		int i = 0;
	//   15   33:iconst_0        
	//   16   34:istore_2        
		for(Iterator iterator = list.iterator(); iterator.hasNext();)
	//*  17   35:aload_1         
	//*  18   36:invokeinterface #64  <Method Iterator List.iterator()>
	//*  19   41:astore          4
	//*  20   43:aload           4
	//*  21   45:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//*  22   50:ifeq            105
		{
			File file = (File)iterator.next();
	//   23   53:aload           4
	//   24   55:invokeinterface #74  <Method Object Iterator.next()>
	//   25   60:checkcast       #76  <Class File>
	//   26   63:astore          5
			httprequest.part((new StringBuilder()).append("session_analytics_file_").append(i).toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
	//   27   65:aload_3         
	//   28   66:new             #78  <Class StringBuilder>
	//   29   69:dup             
	//   30   70:invokespecial   #81  <Method void StringBuilder()>
	//   31   73:ldc1            #13  <String "session_analytics_file_">
	//   32   75:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   33   78:iload_2         
	//   34   79:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   35   82:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   36   85:aload           5
	//   37   87:invokevirtual   #94  <Method String File.getName()>
	//   38   90:ldc1            #10  <String "application/vnd.crashlytics.android.events">
	//   39   92:aload           5
	//   40   94:invokevirtual   #98  <Method HttpRequest HttpRequest.part(String, String, String, File)>
	//   41   97:pop             
			i++;
	//   42   98:iload_2         
	//   43   99:iconst_1        
	//   44  100:iadd            
	//   45  101:istore_2        
		}

	//*  46  102:goto            43
		Fabric.getLogger().d("Answers", (new StringBuilder()).append("Sending ").append(list.size()).append(" analytics files to ").append(getUrl()).toString());
	//   47  105:invokestatic    #104 <Method Logger Fabric.getLogger()>
	//   48  108:ldc1            #106 <String "Answers">
	//   49  110:new             #78  <Class StringBuilder>
	//   50  113:dup             
	//   51  114:invokespecial   #81  <Method void StringBuilder()>
	//   52  117:ldc1            #108 <String "Sending ">
	//   53  119:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   54  122:aload_1         
	//   55  123:invokeinterface #112 <Method int List.size()>
	//   56  128:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   57  131:ldc1            #114 <String " analytics files to ">
	//   58  133:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   59  136:aload_0         
	//   60  137:invokevirtual   #117 <Method String getUrl()>
	//   61  140:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   62  143:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   63  146:invokeinterface #123 <Method void Logger.d(String, String)>
		i = httprequest.code();
	//   64  151:aload_3         
	//   65  152:invokevirtual   #126 <Method int HttpRequest.code()>
	//   66  155:istore_2        
		Fabric.getLogger().d("Answers", (new StringBuilder()).append("Response code for analytics file send is ").append(i).toString());
	//   67  156:invokestatic    #104 <Method Logger Fabric.getLogger()>
	//   68  159:ldc1            #106 <String "Answers">
	//   69  161:new             #78  <Class StringBuilder>
	//   70  164:dup             
	//   71  165:invokespecial   #81  <Method void StringBuilder()>
	//   72  168:ldc1            #128 <String "Response code for analytics file send is ">
	//   73  170:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   74  173:iload_2         
	//   75  174:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   76  177:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   77  180:invokeinterface #123 <Method void Logger.d(String, String)>
		return ResponseParser.parse(i) == 0;
	//   78  185:iload_2         
	//   79  186:invokestatic    #134 <Method int ResponseParser.parse(int)>
	//   80  189:ifne            194
	//   81  192:iconst_1        
	//   82  193:ireturn         
	//   83  194:iconst_0        
	//   84  195:ireturn         
	}

	static final String FILE_CONTENT_TYPE = "application/vnd.crashlytics.android.events";
	static final String FILE_PARAM_NAME = "session_analytics_file_";
	private final String apiKey;
}
