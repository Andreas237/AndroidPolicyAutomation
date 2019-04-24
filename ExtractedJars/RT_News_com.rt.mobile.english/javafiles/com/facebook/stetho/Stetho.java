// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho;

import android.content.Context;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.dumpapp.Dumper;
import com.facebook.stetho.dumpapp.RawDumpappHandler;
import com.facebook.stetho.dumpapp.StreamingDumpappHandler;
import com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin;
import com.facebook.stetho.inspector.ChromeDevtoolsServer;
import com.facebook.stetho.inspector.ChromeDiscoveryHandler;
import com.facebook.stetho.inspector.protocol.module.CSS;
import com.facebook.stetho.inspector.protocol.module.Console;
import com.facebook.stetho.inspector.protocol.module.DOM;
import com.facebook.stetho.inspector.protocol.module.DOMStorage;
import com.facebook.stetho.inspector.protocol.module.Database;
import com.facebook.stetho.inspector.protocol.module.Debugger;
import com.facebook.stetho.inspector.protocol.module.HeapProfiler;
import com.facebook.stetho.inspector.protocol.module.Inspector;
import com.facebook.stetho.inspector.protocol.module.Network;
import com.facebook.stetho.inspector.protocol.module.Page;
import com.facebook.stetho.inspector.protocol.module.Profiler;
import com.facebook.stetho.inspector.protocol.module.Runtime;
import com.facebook.stetho.inspector.protocol.module.Worker;
import com.facebook.stetho.server.LocalSocketHttpServer;
import com.facebook.stetho.server.RegistryInitializer;
import com.facebook.stetho.websocket.WebSocketHandler;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.protocol.*;

// Referenced classes of package com.facebook.stetho:
//			DumperPluginsProvider, InspectorModulesProvider

public class Stetho
{
	private static class BuilderBasedInitializer extends Initializer
	{

		protected Iterable getDumperPlugins()
		{
			if(mDumperPlugins != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field DumperPluginsProvider mDumperPlugins>
		//*   2    4:ifnull          17
				return mDumperPlugins.get();
		//    3    7:aload_0         
		//    4    8:getfield        #26  <Field DumperPluginsProvider mDumperPlugins>
		//    5   11:invokeinterface #40  <Method Iterable DumperPluginsProvider.get()>
		//    6   16:areturn         
			else
				return null;
		//    7   17:aconst_null     
		//    8   18:areturn         
		}

		protected Iterable getInspectorModules()
		{
			if(mInspectorModules != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field InspectorModulesProvider mInspectorModules>
		//*   2    4:ifnull          17
				return mInspectorModules.get();
		//    3    7:aload_0         
		//    4    8:getfield        #29  <Field InspectorModulesProvider mInspectorModules>
		//    5   11:invokeinterface #47  <Method Iterable InspectorModulesProvider.get()>
		//    6   16:areturn         
			else
				return null;
		//    7   17:aconst_null     
		//    8   18:areturn         
		}

		private final DumperPluginsProvider mDumperPlugins;
		private final InspectorModulesProvider mInspectorModules;

		private BuilderBasedInitializer(InitializerBuilder initializerbuilder)
		{
			super(initializerbuilder.mContext);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #20  <Field Context Stetho$InitializerBuilder.mContext>
		//    3    5:invokespecial   #23  <Method void Stetho$Initializer(Context)>
			mDumperPlugins = initializerbuilder.mDumperPlugins;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:getfield        #25  <Field DumperPluginsProvider Stetho$InitializerBuilder.mDumperPlugins>
		//    7   13:putfield        #26  <Field DumperPluginsProvider mDumperPlugins>
			mInspectorModules = initializerbuilder.mInspectorModules;
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:getfield        #28  <Field InspectorModulesProvider Stetho$InitializerBuilder.mInspectorModules>
		//   11   21:putfield        #29  <Field InspectorModulesProvider mInspectorModules>
		//   12   24:return          
		}

	}

	public static abstract class Initializer
		implements RegistryInitializer
	{

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
			httprequesthandlerregistry.register("/*", ((HttpRequestHandler) (new LoggingCatchAllHandler())));
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

		protected Initializer(Context context)
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

	private static class Initializer.LoggingCatchAllHandler
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

		private Initializer.LoggingCatchAllHandler()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}

	}

	public static class InitializerBuilder
	{

		public Initializer build()
		{
			return ((Initializer) (new BuilderBasedInitializer(this)));
		//    0    0:new             #35  <Class Stetho$BuilderBasedInitializer>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #38  <Method void Stetho$BuilderBasedInitializer(Stetho$InitializerBuilder, Stetho$1)>
		//    5    9:areturn         
		}

		public InitializerBuilder enableDumpapp(DumperPluginsProvider dumperpluginsprovider)
		{
			mDumperPlugins = (DumperPluginsProvider)Util.throwIfNull(((Object) (dumperpluginsprovider)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #46  <Method Object Util.throwIfNull(Object)>
		//    3    5:checkcast       #48  <Class DumperPluginsProvider>
		//    4    8:putfield        #50  <Field DumperPluginsProvider mDumperPlugins>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public InitializerBuilder enableWebKitInspector(InspectorModulesProvider inspectormodulesprovider)
		{
			mInspectorModules = inspectormodulesprovider;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #54  <Field InspectorModulesProvider mInspectorModules>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		final Context mContext;
		DumperPluginsProvider mDumperPlugins;
		InspectorModulesProvider mInspectorModules;

		private InitializerBuilder(Context context)
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


	private Stetho()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public static DumperPluginsProvider defaultDumperPluginsProvider(Context context)
	{
		return new DumperPluginsProvider(context) {

			public Iterable get()
			{
				ArrayList arraylist = new ArrayList();
			//    0    0:new             #25  <Class ArrayList>
			//    1    3:dup             
			//    2    4:invokespecial   #26  <Method void ArrayList()>
			//    3    7:astore_1        
				arraylist.add(((Object) (new SharedPreferencesDumperPlugin(context))));
			//    4    8:aload_1         
			//    5    9:new             #28  <Class SharedPreferencesDumperPlugin>
			//    6   12:dup             
			//    7   13:aload_0         
			//    8   14:getfield        #17  <Field Context val$context>
			//    9   17:invokespecial   #30  <Method void SharedPreferencesDumperPlugin(Context)>
			//   10   20:invokevirtual   #34  <Method boolean ArrayList.add(Object)>
			//   11   23:pop             
				return ((Iterable) (arraylist));
			//   12   24:aload_1         
			//   13   25:areturn         
			}

			final Context val$context;

			
			{
				context = context1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Context val$context>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #8   <Class Stetho$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void Stetho$2(Context)>
	//    4    8:areturn         
	}

	public static InspectorModulesProvider defaultInspectorModulesProvider(Context context)
	{
		return new InspectorModulesProvider(context) {

			public Iterable get()
			{
				ArrayList arraylist = new ArrayList();
			//    0    0:new             #25  <Class ArrayList>
			//    1    3:dup             
			//    2    4:invokespecial   #26  <Method void ArrayList()>
			//    3    7:astore_1        
				arraylist.add(((Object) (new Console())));
			//    4    8:aload_1         
			//    5    9:new             #28  <Class Console>
			//    6   12:dup             
			//    7   13:invokespecial   #29  <Method void Console()>
			//    8   16:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
			//    9   19:pop             
				arraylist.add(((Object) (new CSS())));
			//   10   20:aload_1         
			//   11   21:new             #35  <Class CSS>
			//   12   24:dup             
			//   13   25:invokespecial   #36  <Method void CSS()>
			//   14   28:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
			//   15   31:pop             
				arraylist.add(((Object) (new Debugger())));
			//   16   32:aload_1         
			//   17   33:new             #38  <Class Debugger>
			//   18   36:dup             
			//   19   37:invokespecial   #39  <Method void Debugger()>
			//   20   40:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
			//   21   43:pop             
				arraylist.add(((Object) (new DOM())));
			//   22   44:aload_1         
			//   23   45:new             #41  <Class DOM>
			//   24   48:dup             
			//   25   49:invokespecial   #42  <Method void DOM()>
			//   26   52:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
			//   27   55:pop             
				arraylist.add(((Object) (new DOMStorage(context))));
			//   28   56:aload_1         
			//   29   57:new             #44  <Class DOMStorage>
			//   30   60:dup             
			//   31   61:aload_0         
			//   32   62:getfield        #17  <Field Context val$context>
			//   33   65:invokespecial   #46  <Method void DOMStorage(Context)>
			//   34   68:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
			//   35   71:pop             
				arraylist.add(((Object) (new HeapProfiler())));
			//   36   72:aload_1         
			//   37   73:new             #48  <Class HeapProfiler>
			//   38   76:dup             
			//   39   77:invokespecial   #49  <Method void HeapProfiler()>
			//   40   80:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
			//   41   83:pop             
				arraylist.add(((Object) (new Inspector())));
			//   42   84:aload_1         
			//   43   85:new             #51  <Class Inspector>
			//   44   88:dup             
			//   45   89:invokespecial   #52  <Method void Inspector()>
			//   46   92:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
			//   47   95:pop             
				arraylist.add(((Object) (new Network(context))));
			//   48   96:aload_1         
			//   49   97:new             #54  <Class Network>
			//   50  100:dup             
			//   51  101:aload_0         
			//   52  102:getfield        #17  <Field Context val$context>
			//   53  105:invokespecial   #55  <Method void Network(Context)>
			//   54  108:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
			//   55  111:pop             
				arraylist.add(((Object) (new Page(context))));
			//   56  112:aload_1         
			//   57  113:new             #57  <Class Page>
			//   58  116:dup             
			//   59  117:aload_0         
			//   60  118:getfield        #17  <Field Context val$context>
			//   61  121:invokespecial   #58  <Method void Page(Context)>
			//   62  124:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
			//   63  127:pop             
				arraylist.add(((Object) (new Profiler())));
			//   64  128:aload_1         
			//   65  129:new             #60  <Class Profiler>
			//   66  132:dup             
			//   67  133:invokespecial   #61  <Method void Profiler()>
			//   68  136:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
			//   69  139:pop             
				arraylist.add(((Object) (new Runtime())));
			//   70  140:aload_1         
			//   71  141:new             #63  <Class Runtime>
			//   72  144:dup             
			//   73  145:invokespecial   #64  <Method void Runtime()>
			//   74  148:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
			//   75  151:pop             
				arraylist.add(((Object) (new Worker())));
			//   76  152:aload_1         
			//   77  153:new             #66  <Class Worker>
			//   78  156:dup             
			//   79  157:invokespecial   #67  <Method void Worker()>
			//   80  160:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
			//   81  163:pop             
				if(android.os.Build.VERSION.SDK_INT >= 11)
			//*  82  164:getstatic       #73  <Field int android.os.Build$VERSION.SDK_INT>
			//*  83  167:bipush          11
			//*  84  169:icmplt          188
					arraylist.add(((Object) (new Database(context))));
			//   85  172:aload_1         
			//   86  173:new             #75  <Class Database>
			//   87  176:dup             
			//   88  177:aload_0         
			//   89  178:getfield        #17  <Field Context val$context>
			//   90  181:invokespecial   #76  <Method void Database(Context)>
			//   91  184:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
			//   92  187:pop             
				return ((Iterable) (arraylist));
			//   93  188:aload_1         
			//   94  189:areturn         
			}

			final Context val$context;

			
			{
				context = context1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Context val$context>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #10  <Class Stetho$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method void Stetho$3(Context)>
	//    4    8:areturn         
	}

	public static void initialize(Initializer initializer)
	{
		((Thread) (new Thread("Stetho-Listener", initializer) {

			public void run()
			{
				LocalSocketHttpServer localsockethttpserver = new LocalSocketHttpServer(((RegistryInitializer) (initializer)));
			//    0    0:new             #25  <Class LocalSocketHttpServer>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #15  <Field Stetho$Initializer val$initializer>
			//    4    8:invokespecial   #28  <Method void LocalSocketHttpServer(RegistryInitializer)>
			//    5   11:astore_1        
				try
				{
					localsockethttpserver.run();
			//    6   12:aload_1         
			//    7   13:invokevirtual   #30  <Method void LocalSocketHttpServer.run()>
					return;
			//    8   16:return          
				}
				catch(IOException ioexception)
			//*   9   17:astore_1        
				{
					LogUtil.e(((Throwable) (ioexception)), "Could not start Stetho");
			//   10   18:aload_1         
			//   11   19:ldc1            #32  <String "Could not start Stetho">
			//   12   21:invokestatic    #38  <Method void LogUtil.e(Throwable, String)>
				}
			//   13   24:return          
			}

			final Initializer val$initializer;

			
			{
				initializer = initializer1;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field Stetho$Initializer val$initializer>
				super(s);
			//    3    5:aload_0         
			//    4    6:aload_1         
			//    5    7:invokespecial   #18  <Method void Thread(String)>
			//    6   10:return          
			}
		}
)).start();
	//    0    0:new             #6   <Class Stetho$1>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "Stetho-Listener">
	//    3    6:aload_0         
	//    4    7:invokespecial   #44  <Method void Stetho$1(String, Stetho$Initializer)>
	//    5   10:invokevirtual   #49  <Method void Thread.start()>
	//    6   13:return          
	}

	public static InitializerBuilder newInitializerBuilder(Context context)
	{
		return new InitializerBuilder(context);
	//    0    0:new             #21  <Class Stetho$InitializerBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #54  <Method void Stetho$InitializerBuilder(Context, Stetho$1)>
	//    5    9:areturn         
	}

	private static final String LISTENER_THREAD_NAME = "Stetho-Listener";
}
