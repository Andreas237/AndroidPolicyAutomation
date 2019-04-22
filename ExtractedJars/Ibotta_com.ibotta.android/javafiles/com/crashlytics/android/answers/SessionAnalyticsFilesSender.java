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
	//    5    6:getstatic       #16  <Field HttpMethod HttpMethod.POST>
	//    6    9:invokespecial   #19  <Method void AbstractSpiCall(Kit, String, String, HttpRequestFactory, HttpMethod)>
		apiKey = s2;
	//    7   12:aload_0         
	//    8   13:aload           5
	//    9   15:putfield        #21  <Field String apiKey>
	//   10   18:return          
	}

	public boolean send(List list)
	{
		Object obj = ((Object) (getHttpRequest().header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-API-CLIENT-VERSION", kit.getVersion()).header("X-CRASHLYTICS-API-KEY", apiKey)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method HttpRequest getHttpRequest()>
	//    2    4:ldc1            #30  <String "X-CRASHLYTICS-API-CLIENT-TYPE">
	//    3    6:ldc1            #32  <String "android">
	//    4    8:invokevirtual   #38  <Method HttpRequest HttpRequest.header(String, String)>
	//    5   11:ldc1            #40  <String "X-CRASHLYTICS-API-CLIENT-VERSION">
	//    6   13:aload_0         
	//    7   14:getfield        #44  <Field Kit kit>
	//    8   17:invokevirtual   #50  <Method String Kit.getVersion()>
	//    9   20:invokevirtual   #38  <Method HttpRequest HttpRequest.header(String, String)>
	//   10   23:ldc1            #52  <String "X-CRASHLYTICS-API-KEY">
	//   11   25:aload_0         
	//   12   26:getfield        #21  <Field String apiKey>
	//   13   29:invokevirtual   #38  <Method HttpRequest HttpRequest.header(String, String)>
	//   14   32:astore          4
		Object obj1 = ((Object) (list.iterator()));
	//   15   34:aload_1         
	//   16   35:invokeinterface #58  <Method Iterator List.iterator()>
	//   17   40:astore          5
		boolean flag = false;
	//   18   42:iconst_0        
	//   19   43:istore_3        
		for(int i = 0; ((Iterator) (obj1)).hasNext(); i++)
	//*  20   44:iconst_0        
	//*  21   45:istore_2        
	//*  22   46:aload           5
	//*  23   48:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//*  24   53:ifeq            119
		{
			File file = (File)((Iterator) (obj1)).next();
	//   25   56:aload           5
	//   26   58:invokeinterface #68  <Method Object Iterator.next()>
	//   27   63:checkcast       #70  <Class File>
	//   28   66:astore          6
			StringBuilder stringbuilder1 = new StringBuilder();
	//   29   68:new             #72  <Class StringBuilder>
	//   30   71:dup             
	//   31   72:invokespecial   #75  <Method void StringBuilder()>
	//   32   75:astore          7
			stringbuilder1.append("session_analytics_file_");
	//   33   77:aload           7
	//   34   79:ldc1            #77  <String "session_analytics_file_">
	//   35   81:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   36   84:pop             
			stringbuilder1.append(i);
	//   37   85:aload           7
	//   38   87:iload_2         
	//   39   88:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//   40   91:pop             
			((HttpRequest) (obj)).part(stringbuilder1.toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
	//   41   92:aload           4
	//   42   94:aload           7
	//   43   96:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   44   99:aload           6
	//   45  101:invokevirtual   #90  <Method String File.getName()>
	//   46  104:ldc1            #92  <String "application/vnd.crashlytics.android.events">
	//   47  106:aload           6
	//   48  108:invokevirtual   #96  <Method HttpRequest HttpRequest.part(String, String, String, File)>
	//   49  111:pop             
		}

	//   50  112:iload_2         
	//   51  113:iconst_1        
	//   52  114:iadd            
	//   53  115:istore_2        
	//*  54  116:goto            46
		obj1 = ((Object) (Fabric.getLogger()));
	//   55  119:invokestatic    #102 <Method Logger Fabric.getLogger()>
	//   56  122:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//   57  124:new             #72  <Class StringBuilder>
	//   58  127:dup             
	//   59  128:invokespecial   #75  <Method void StringBuilder()>
	//   60  131:astore          6
		stringbuilder.append("Sending ");
	//   61  133:aload           6
	//   62  135:ldc1            #104 <String "Sending ">
	//   63  137:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   64  140:pop             
		stringbuilder.append(list.size());
	//   65  141:aload           6
	//   66  143:aload_1         
	//   67  144:invokeinterface #108 <Method int List.size()>
	//   68  149:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//   69  152:pop             
		stringbuilder.append(" analytics files to ");
	//   70  153:aload           6
	//   71  155:ldc1            #110 <String " analytics files to ">
	//   72  157:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   73  160:pop             
		stringbuilder.append(getUrl());
	//   74  161:aload           6
	//   75  163:aload_0         
	//   76  164:invokevirtual   #113 <Method String getUrl()>
	//   77  167:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   78  170:pop             
		((Logger) (obj1)).d("Answers", stringbuilder.toString());
	//   79  171:aload           5
	//   80  173:ldc1            #115 <String "Answers">
	//   81  175:aload           6
	//   82  177:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   83  180:invokeinterface #121 <Method void Logger.d(String, String)>
		int j = ((HttpRequest) (obj)).code();
	//   84  185:aload           4
	//   85  187:invokevirtual   #124 <Method int HttpRequest.code()>
	//   86  190:istore_2        
		list = ((List) (Fabric.getLogger()));
	//   87  191:invokestatic    #102 <Method Logger Fabric.getLogger()>
	//   88  194:astore_1        
		obj = ((Object) (new StringBuilder()));
	//   89  195:new             #72  <Class StringBuilder>
	//   90  198:dup             
	//   91  199:invokespecial   #75  <Method void StringBuilder()>
	//   92  202:astore          4
		((StringBuilder) (obj)).append("Response code for analytics file send is ");
	//   93  204:aload           4
	//   94  206:ldc1            #126 <String "Response code for analytics file send is ">
	//   95  208:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   96  211:pop             
		((StringBuilder) (obj)).append(j);
	//   97  212:aload           4
	//   98  214:iload_2         
	//   99  215:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//  100  218:pop             
		((Logger) (list)).d("Answers", ((StringBuilder) (obj)).toString());
	//  101  219:aload_1         
	//  102  220:ldc1            #115 <String "Answers">
	//  103  222:aload           4
	//  104  224:invokevirtual   #87  <Method String StringBuilder.toString()>
	//  105  227:invokeinterface #121 <Method void Logger.d(String, String)>
		if(ResponseParser.parse(j) == 0)
	//* 106  232:iload_2         
	//* 107  233:invokestatic    #132 <Method int ResponseParser.parse(int)>
	//* 108  236:ifne            241
			flag = true;
	//  109  239:iconst_1        
	//  110  240:istore_3        
		return flag;
	//  111  241:iload_3         
	//  112  242:ireturn         
	}

	private final String apiKey;
}
