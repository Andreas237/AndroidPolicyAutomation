// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho;

import android.content.Context;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.dumpapp.Dumper;
import com.facebook.stetho.dumpapp.RawDumpappHandler;
import com.facebook.stetho.dumpapp.StreamingDumpappHandler;
import com.facebook.stetho.inspector.ChromeDevtoolsServer;
import com.facebook.stetho.inspector.ChromeDiscoveryHandler;
import com.facebook.stetho.server.RegistryInitializer;
import com.facebook.stetho.websocket.WebSocketHandler;
import java.io.IOException;
import org.apache.http.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.protocol.*;

// Referenced classes of package com.facebook.stetho:
//			Stetho

public static abstract class Stetho$Initializer
	implements RegistryInitializer
{
	private static class LoggingCatchAllHandler
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

		private LoggingCatchAllHandler()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}

		LoggingCatchAllHandler(Stetho._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Stetho$Initializer$LoggingCatchAllHandler()>
		//    2    4:return          
		}
	}


	protected void addCustomEntries(HttpRequestHandlerRegistry httprequesthandlerregistry)
	{
	//    0    0:return          
	}

	protected abstract Iterable getDumperPlugins();

	protected abstract Iterable getInspectorModules();

	public final HttpRequestHandlerRegistry getRegistry()
	{
		HttpRequestHandlerRegistry httprequesthandlerregistry = new HttpRequestHandlerRegistry();
	//    0    0:new             #38  <Class HttpRequestHandlerRegistry>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void HttpRequestHandlerRegistry()>
	//    3    7:astore_1        
		Object obj = ((Object) (getDumperPlugins()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #41  <Method Iterable getDumperPlugins()>
	//    6   12:astore_2        
		if(obj != null)
	//*   7   13:aload_2         
	//*   8   14:ifnull          62
		{
			obj = ((Object) (new Dumper(((Iterable) (obj)))));
	//    9   17:new             #43  <Class Dumper>
	//   10   20:dup             
	//   11   21:aload_2         
	//   12   22:invokespecial   #46  <Method void Dumper(Iterable)>
	//   13   25:astore_2        
			httprequesthandlerregistry.register("/dumpapp", ((HttpRequestHandler) (new StreamingDumpappHandler(mContext, ((Dumper) (obj))))));
	//   14   26:aload_1         
	//   15   27:ldc1            #48  <String "/dumpapp">
	//   16   29:new             #50  <Class StreamingDumpappHandler>
	//   17   32:dup             
	//   18   33:aload_0         
	//   19   34:getfield        #27  <Field Context mContext>
	//   20   37:aload_2         
	//   21   38:invokespecial   #53  <Method void StreamingDumpappHandler(Context, Dumper)>
	//   22   41:invokevirtual   #57  <Method void HttpRequestHandlerRegistry.register(String, HttpRequestHandler)>
			httprequesthandlerregistry.register("/dumpapp-raw", ((HttpRequestHandler) (new RawDumpappHandler(mContext, ((Dumper) (obj))))));
	//   23   44:aload_1         
	//   24   45:ldc1            #59  <String "/dumpapp-raw">
	//   25   47:new             #61  <Class RawDumpappHandler>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:getfield        #27  <Field Context mContext>
	//   29   55:aload_2         
	//   30   56:invokespecial   #62  <Method void RawDumpappHandler(Context, Dumper)>
	//   31   59:invokevirtual   #57  <Method void HttpRequestHandlerRegistry.register(String, HttpRequestHandler)>
		}
		obj = ((Object) (getInspectorModules()));
	//   32   62:aload_0         
	//   33   63:invokevirtual   #64  <Method Iterable getInspectorModules()>
	//   34   66:astore_2        
		if(obj != null)
	//*  35   67:aload_2         
	//*  36   68:ifnull          113
		{
			(new ChromeDiscoveryHandler(mContext, "/inspector")).register(httprequesthandlerregistry);
	//   37   71:new             #66  <Class ChromeDiscoveryHandler>
	//   38   74:dup             
	//   39   75:aload_0         
	//   40   76:getfield        #27  <Field Context mContext>
	//   41   79:ldc1            #68  <String "/inspector">
	//   42   81:invokespecial   #71  <Method void ChromeDiscoveryHandler(Context, String)>
	//   43   84:aload_1         
	//   44   85:invokevirtual   #73  <Method void ChromeDiscoveryHandler.register(HttpRequestHandlerRegistry)>
			httprequesthandlerregistry.register("/inspector", ((HttpRequestHandler) (new WebSocketHandler(mContext, ((com.facebook.stetho.websocket.SimpleEndpoint) (new ChromeDevtoolsServer(((Iterable) (obj)))))))));
	//   45   88:aload_1         
	//   46   89:ldc1            #68  <String "/inspector">
	//   47   91:new             #75  <Class WebSocketHandler>
	//   48   94:dup             
	//   49   95:aload_0         
	//   50   96:getfield        #27  <Field Context mContext>
	//   51   99:new             #77  <Class ChromeDevtoolsServer>
	//   52  102:dup             
	//   53  103:aload_2         
	//   54  104:invokespecial   #78  <Method void ChromeDevtoolsServer(Iterable)>
	//   55  107:invokespecial   #81  <Method void WebSocketHandler(Context, com.facebook.stetho.websocket.SimpleEndpoint)>
	//   56  110:invokevirtual   #57  <Method void HttpRequestHandlerRegistry.register(String, HttpRequestHandler)>
		}
		addCustomEntries(httprequesthandlerregistry);
	//   57  113:aload_0         
	//   58  114:aload_1         
	//   59  115:invokevirtual   #83  <Method void addCustomEntries(HttpRequestHandlerRegistry)>
		httprequesthandlerregistry.register("/*", ((HttpRequestHandler) (new LoggingCatchAllHandler(((Stetho._cls1) (null))))));
	//   60  118:aload_1         
	//   61  119:ldc1            #85  <String "/*">
	//   62  121:new             #11  <Class Stetho$Initializer$LoggingCatchAllHandler>
	//   63  124:dup             
	//   64  125:aconst_null     
	//   65  126:invokespecial   #88  <Method void Stetho$Initializer$LoggingCatchAllHandler(Stetho$1)>
	//   66  129:invokevirtual   #57  <Method void HttpRequestHandlerRegistry.register(String, HttpRequestHandler)>
		return httprequesthandlerregistry;
	//   67  132:aload_1         
	//   68  133:areturn         
	}

	private final Context mContext;

	protected Stetho$Initializer(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #25  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #27  <Field Context mContext>
	//    6   12:return          
	}
}
