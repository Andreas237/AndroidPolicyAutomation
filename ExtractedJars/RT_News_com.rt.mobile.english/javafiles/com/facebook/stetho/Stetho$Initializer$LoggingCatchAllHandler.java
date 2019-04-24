// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho;

import com.facebook.stetho.common.LogUtil;
import java.io.IOException;
import org.apache.http.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestHandler;

// Referenced classes of package com.facebook.stetho:
//			Stetho

private static class Stetho$Initializer$LoggingCatchAllHandler
	implements HttpRequestHandler
{

	public void handle(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
		throws HttpException, IOException
	{
		httpcontext = ((HttpContext) (new StringBuilder()));
	//    0    0:new             #27  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void StringBuilder()>
	//    3    7:astore_3        
		((StringBuilder) (httpcontext)).append("Unsupported request received: ");
	//    4    8:aload_3         
	//    5    9:ldc1            #30  <String "Unsupported request received: ">
	//    6   11:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (httpcontext)).append(((Object) (httprequest.getRequestLine())));
	//    8   15:aload_3         
	//    9   16:aload_1         
	//   10   17:invokeinterface #40  <Method org.apache.http.RequestLine HttpRequest.getRequestLine()>
	//   11   22:invokevirtual   #43  <Method StringBuilder StringBuilder.append(Object)>
	//   12   25:pop             
		LogUtil.w(((StringBuilder) (httpcontext)).toString());
	//   13   26:aload_3         
	//   14   27:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   15   30:invokestatic    #53  <Method void LogUtil.w(String)>
		httpresponse.setStatusCode(404);
	//   16   33:aload_2         
	//   17   34:sipush          404
	//   18   37:invokeinterface #59  <Method void HttpResponse.setStatusCode(int)>
		httpresponse.setReasonPhrase("Not Found");
	//   19   42:aload_2         
	//   20   43:ldc1            #61  <String "Not Found">
	//   21   45:invokeinterface #64  <Method void HttpResponse.setReasonPhrase(String)>
		httpresponse.setEntity(((org.apache.http.HttpEntity) (new StringEntity("Endpoint not implemented\n", "UTF-8"))));
	//   22   50:aload_2         
	//   23   51:new             #66  <Class StringEntity>
	//   24   54:dup             
	//   25   55:ldc1            #68  <String "Endpoint not implemented\n">
	//   26   57:ldc1            #70  <String "UTF-8">
	//   27   59:invokespecial   #73  <Method void StringEntity(String, String)>
	//   28   62:invokeinterface #77  <Method void HttpResponse.setEntity(org.apache.http.HttpEntity)>
	//   29   67:return          
	}

	private Stetho$Initializer$LoggingCatchAllHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	Stetho$Initializer$LoggingCatchAllHandler(Stetho._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Stetho$Initializer$LoggingCatchAllHandler()>
	//    2    4:return          
	}
}
