// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector;

import android.content.Context;
import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.server.SocketLikeHandler;
import com.facebook.stetho.server.http.*;
import com.facebook.stetho.websocket.WebSocketHandler;
import java.io.IOException;

// Referenced classes of package com.facebook.stetho.inspector:
//			ChromeDiscoveryHandler, ChromeDevtoolsServer

public class DevtoolsSocketHandler
	implements SocketLikeHandler
{

	public DevtoolsSocketHandler(Context context, Iterable iterable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Context mContext>
		mModules = iterable;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field Iterable mModules>
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method LightHttpServer createServer()>
	//   11   19:putfield        #28  <Field LightHttpServer mServer>
	//   12   22:return          
	}

	private LightHttpServer createServer()
	{
		HandlerRegistry handlerregistry = new HandlerRegistry();
	//    0    0:new             #33  <Class HandlerRegistry>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void HandlerRegistry()>
	//    3    7:astore_1        
		(new ChromeDiscoveryHandler(mContext, "/inspector")).register(handlerregistry);
	//    4    8:new             #36  <Class ChromeDiscoveryHandler>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field Context mContext>
	//    8   16:ldc1            #38  <String "/inspector">
	//    9   18:invokespecial   #41  <Method void ChromeDiscoveryHandler(Context, String)>
	//   10   21:aload_1         
	//   11   22:invokevirtual   #45  <Method void ChromeDiscoveryHandler.register(HandlerRegistry)>
		handlerregistry.register(((com.facebook.stetho.server.http.PathMatcher) (new ExactPathMatcher("/inspector"))), ((com.facebook.stetho.server.http.HttpHandler) (new WebSocketHandler(((com.facebook.stetho.websocket.SimpleEndpoint) (new ChromeDevtoolsServer(mModules)))))));
	//   12   25:aload_1         
	//   13   26:new             #47  <Class ExactPathMatcher>
	//   14   29:dup             
	//   15   30:ldc1            #38  <String "/inspector">
	//   16   32:invokespecial   #50  <Method void ExactPathMatcher(String)>
	//   17   35:new             #52  <Class WebSocketHandler>
	//   18   38:dup             
	//   19   39:new             #54  <Class ChromeDevtoolsServer>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:getfield        #22  <Field Iterable mModules>
	//   23   47:invokespecial   #57  <Method void ChromeDevtoolsServer(Iterable)>
	//   24   50:invokespecial   #60  <Method void WebSocketHandler(com.facebook.stetho.websocket.SimpleEndpoint)>
	//   25   53:invokevirtual   #63  <Method void HandlerRegistry.register(com.facebook.stetho.server.http.PathMatcher, com.facebook.stetho.server.http.HttpHandler)>
		return new LightHttpServer(handlerregistry);
	//   26   56:new             #65  <Class LightHttpServer>
	//   27   59:dup             
	//   28   60:aload_1         
	//   29   61:invokespecial   #67  <Method void LightHttpServer(HandlerRegistry)>
	//   30   64:areturn         
	}

	public void onAccepted(SocketLike socketlike)
		throws IOException
	{
		mServer.serve(socketlike);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field LightHttpServer mServer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #74  <Method void LightHttpServer.serve(SocketLike)>
	//    4    8:return          
	}

	private final Context mContext;
	private final Iterable mModules;
	private final LightHttpServer mServer = createServer();
}
