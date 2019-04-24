// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.websocket;

import android.net.LocalSocket;
import com.facebook.stetho.server.LocalSocketHttpServerConnection;
import java.io.*;
import org.apache.http.HttpServerConnection;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.stetho.websocket:
//			WebSocketHandler, CompositeInputStream

private static class WebSocketHandler$RawSocketUpgradeHelper
{

	public static WebSocketHandler$RawSocketUpgradeHelper fromApacheContext(HttpContext httpcontext)
		throws IOException
	{
		httpcontext = ((HttpContext) ((LocalSocketHttpServerConnection)httpcontext.getAttribute("http.connection")));
	//    0    0:aload_0         
	//    1    1:ldc1            #31  <String "http.connection">
	//    2    3:invokeinterface #37  <Method Object HttpContext.getAttribute(String)>
	//    3    8:checkcast       #39  <Class LocalSocketHttpServerConnection>
	//    4   11:astore_0        
		LocalSocket localsocket = ((LocalSocketHttpServerConnection) (httpcontext)).getSocket();
	//    5   12:aload_0         
	//    6   13:invokevirtual   #43  <Method LocalSocket LocalSocketHttpServerConnection.getSocket()>
	//    7   16:astore_1        
		return new WebSocketHandler$RawSocketUpgradeHelper(((HttpServerConnection) (httpcontext)), joinInputStreams(new InputStream[] {
			new ByteArrayInputStream(((LocalSocketHttpServerConnection) (httpcontext)).clearInputBuffer()), localsocket.getInputStream()
		}), localsocket.getOutputStream());
	//    8   17:new             #2   <Class WebSocketHandler$RawSocketUpgradeHelper>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:iconst_2        
	//   12   23:anewarray       InputStream[]
	//   13   26:dup             
	//   14   27:iconst_0        
	//   15   28:new             #47  <Class ByteArrayInputStream>
	//   16   31:dup             
	//   17   32:aload_0         
	//   18   33:invokevirtual   #51  <Method byte[] LocalSocketHttpServerConnection.clearInputBuffer()>
	//   19   36:invokespecial   #54  <Method void ByteArrayInputStream(byte[])>
	//   20   39:aastore         
	//   21   40:dup             
	//   22   41:iconst_1        
	//   23   42:aload_1         
	//   24   43:invokevirtual   #60  <Method InputStream LocalSocket.getInputStream()>
	//   25   46:aastore         
	//   26   47:invokestatic    #64  <Method InputStream joinInputStreams(InputStream[])>
	//   27   50:aload_1         
	//   28   51:invokevirtual   #68  <Method OutputStream LocalSocket.getOutputStream()>
	//   29   54:invokespecial   #70  <Method void WebSocketHandler$RawSocketUpgradeHelper(HttpServerConnection, InputStream, OutputStream)>
	//   30   57:areturn         
	}

	private static transient InputStream joinInputStreams(InputStream ainputstream[])
		throws IOException
	{
		return ((InputStream) (new CompositeInputStream(ainputstream)));
	//    0    0:new             #73  <Class CompositeInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #76  <Method void CompositeInputStream(InputStream[])>
	//    4    8:areturn         
	}

	public InputStream getInputStream()
	{
		return mIn;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field InputStream mIn>
	//    2    4:areturn         
	}

	public OutputStream getOutputStream()
	{
		return mOut;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field OutputStream mOut>
	//    2    4:areturn         
	}

	public HttpServerConnection getServerConnection()
	{
		return mConn;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HttpServerConnection mConn>
	//    2    4:areturn         
	}

	private final HttpServerConnection mConn;
	private final InputStream mIn;
	private final OutputStream mOut;

	private WebSocketHandler$RawSocketUpgradeHelper(HttpServerConnection httpserverconnection, InputStream inputstream, OutputStream outputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mConn = httpserverconnection;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field HttpServerConnection mConn>
		mIn = inputstream;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field InputStream mIn>
		mOut = outputstream;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field OutputStream mOut>
	//   11   19:return          
	}
}
