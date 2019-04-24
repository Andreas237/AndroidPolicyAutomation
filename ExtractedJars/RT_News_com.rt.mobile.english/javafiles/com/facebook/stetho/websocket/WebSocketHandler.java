// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.websocket;

import android.content.Context;
import android.net.LocalSocket;
import android.util.Base64;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.server.LocalSocketHttpServerConnection;
import com.facebook.stetho.server.SecureHttpRequestHandler;
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.http.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.stetho.websocket:
//			WebSocketSession, SimpleEndpoint, CompositeInputStream

public class WebSocketHandler extends SecureHttpRequestHandler
{
	private static class RawSocketUpgradeHelper
	{

		public static RawSocketUpgradeHelper fromApacheContext(HttpContext httpcontext)
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
			return new RawSocketUpgradeHelper(((HttpServerConnection) (httpcontext)), joinInputStreams(new InputStream[] {
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

		private RawSocketUpgradeHelper(HttpServerConnection httpserverconnection, InputStream inputstream, OutputStream outputstream)
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


	public WebSocketHandler(Context context, SimpleEndpoint simpleendpoint)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #43  <Method void SecureHttpRequestHandler(Context)>
		mEndpoint = simpleendpoint;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #45  <Field SimpleEndpoint mEndpoint>
	//    6   10:return          
	}

	private void doUpgrade(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
		throws IOException, HttpException
	{
		httpcontext = ((HttpContext) (RawSocketUpgradeHelper.fromApacheContext(httpcontext)));
	//    0    0:aload_3         
	//    1    1:invokestatic    #56  <Method WebSocketHandler$RawSocketUpgradeHelper WebSocketHandler$RawSocketUpgradeHelper.fromApacheContext(HttpContext)>
	//    2    4:astore_3        
		httpresponse.setStatusCode(101);
	//    3    5:aload_2         
	//    4    6:bipush          101
	//    5    8:invokeinterface #62  <Method void HttpResponse.setStatusCode(int)>
		httpresponse.setReasonPhrase("Switching Protocols");
	//    6   13:aload_2         
	//    7   14:ldc1            #64  <String "Switching Protocols">
	//    8   16:invokeinterface #68  <Method void HttpResponse.setReasonPhrase(String)>
		httpresponse.addHeader("Upgrade", "websocket");
	//    9   21:aload_2         
	//   10   22:ldc1            #14  <String "Upgrade">
	//   11   24:ldc1            #33  <String "websocket">
	//   12   26:invokeinterface #72  <Method void HttpResponse.addHeader(String, String)>
		httpresponse.addHeader("Connection", "Upgrade");
	//   13   31:aload_2         
	//   14   32:ldc1            #11  <String "Connection">
	//   15   34:ldc1            #14  <String "Upgrade">
	//   16   36:invokeinterface #72  <Method void HttpResponse.addHeader(String, String)>
		httprequest = ((HttpRequest) (getFirstHeaderValue(((HttpMessage) (httprequest)), "Sec-WebSocket-Key")));
	//   17   41:aload_1         
	//   18   42:ldc1            #20  <String "Sec-WebSocket-Key">
	//   19   44:invokestatic    #76  <Method String getFirstHeaderValue(HttpMessage, String)>
	//   20   47:astore_1        
		if(httprequest != null)
	//*  21   48:aload_1         
	//*  22   49:ifnull          64
			httpresponse.addHeader("Sec-WebSocket-Accept", generateServerKey(((String) (httprequest))));
	//   23   52:aload_2         
	//   24   53:ldc1            #17  <String "Sec-WebSocket-Accept">
	//   25   55:aload_1         
	//   26   56:invokestatic    #80  <Method String generateServerKey(String)>
	//   27   59:invokeinterface #72  <Method void HttpResponse.addHeader(String, String)>
		forceSendResponse(((RawSocketUpgradeHelper) (httpcontext)).getServerConnection(), httpresponse);
	//   28   64:aload_0         
	//   29   65:aload_3         
	//   30   66:invokevirtual   #84  <Method HttpServerConnection WebSocketHandler$RawSocketUpgradeHelper.getServerConnection()>
	//   31   69:aload_2         
	//   32   70:invokespecial   #88  <Method void forceSendResponse(HttpServerConnection, HttpResponse)>
		(new WebSocketSession(((RawSocketUpgradeHelper) (httpcontext)).getInputStream(), ((RawSocketUpgradeHelper) (httpcontext)).getOutputStream(), mEndpoint)).handle();
	//   33   73:new             #90  <Class WebSocketSession>
	//   34   76:dup             
	//   35   77:aload_3         
	//   36   78:invokevirtual   #94  <Method InputStream WebSocketHandler$RawSocketUpgradeHelper.getInputStream()>
	//   37   81:aload_3         
	//   38   82:invokevirtual   #98  <Method OutputStream WebSocketHandler$RawSocketUpgradeHelper.getOutputStream()>
	//   39   85:aload_0         
	//   40   86:getfield        #45  <Field SimpleEndpoint mEndpoint>
	//   41   89:invokespecial   #101 <Method void WebSocketSession(InputStream, OutputStream, SimpleEndpoint)>
	//   42   92:invokevirtual   #105 <Method void WebSocketSession.handle()>
	//   43   95:return          
	}

	private void forceSendResponse(HttpServerConnection httpserverconnection, HttpResponse httpresponse)
		throws IOException, HttpException
	{
		httpserverconnection.sendResponseHeader(httpresponse);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #112 <Method void HttpServerConnection.sendResponseHeader(HttpResponse)>
		httpserverconnection.flush();
	//    3    7:aload_1         
	//    4    8:invokeinterface #115 <Method void HttpServerConnection.flush()>
	//    5   13:return          
	}

	private static String generateServerKey(String s)
	{
		try
		{
			Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #119 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #121 <Method void StringBuilder()>
	//    3    7:astore_1        
			((StringBuilder) (obj)).append(s);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
			((StringBuilder) (obj)).append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
	//    8   14:aload_1         
	//    9   15:ldc1            #36  <String "258EAFA5-E914-47DA-95CA-C5AB0DC85B11">
	//   10   17:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
			s = ((StringBuilder) (obj)).toString();
	//   12   21:aload_1         
	//   13   22:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   14   25:astore_0        
			obj = ((Object) (MessageDigest.getInstance("SHA-1")));
	//   15   26:ldc1            #131 <String "SHA-1">
	//   16   28:invokestatic    #137 <Method MessageDigest MessageDigest.getInstance(String)>
	//   17   31:astore_1        
			((MessageDigest) (obj)).update(Utf8Charset.encodeUTF8(s));
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:invokestatic    #143 <Method byte[] Utf8Charset.encodeUTF8(String)>
	//   21   37:invokevirtual   #147 <Method void MessageDigest.update(byte[])>
			s = Base64.encodeToString(((MessageDigest) (obj)).digest(), 2);
	//   22   40:aload_1         
	//   23   41:invokevirtual   #151 <Method byte[] MessageDigest.digest()>
	//   24   44:iconst_2        
	//   25   45:invokestatic    #157 <Method String Base64.encodeToString(byte[], int)>
	//   26   48:astore_0        
		}
	//*  27   49:aload_0         
	//*  28   50:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  29   51:astore_0        
		{
			throw new RuntimeException(((Throwable) (s)));
	//   30   52:new             #159 <Class RuntimeException>
	//   31   55:dup             
	//   32   56:aload_0         
	//   33   57:invokespecial   #162 <Method void RuntimeException(Throwable)>
	//   34   60:athrow          
		}
		return s;
	}

	private static String getFirstHeaderValue(HttpMessage httpmessage, String s)
	{
		httpmessage = ((HttpMessage) (httpmessage.getFirstHeader(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #169 <Method Header HttpMessage.getFirstHeader(String)>
	//    3    7:astore_0        
		if(httpmessage != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          19
			return ((Header) (httpmessage)).getValue();
	//    6   12:aload_0         
	//    7   13:invokeinterface #174 <Method String Header.getValue()>
	//    8   18:areturn         
		else
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
	}

	private static boolean isSupportableUpgradeRequest(HttpRequest httprequest)
	{
		return "websocket".equalsIgnoreCase(getFirstHeaderValue(((HttpMessage) (httprequest)), "Upgrade")) && "Upgrade".equals(((Object) (getFirstHeaderValue(((HttpMessage) (httprequest)), "Connection")))) && "13".equals(((Object) (getFirstHeaderValue(((HttpMessage) (httprequest)), "Sec-WebSocket-Version"))));
	//    0    0:ldc1            #33  <String "websocket">
	//    1    2:aload_0         
	//    2    3:ldc1            #14  <String "Upgrade">
	//    3    5:invokestatic    #76  <Method String getFirstHeaderValue(HttpMessage, String)>
	//    4    8:invokevirtual   #183 <Method boolean String.equalsIgnoreCase(String)>
	//    5   11:ifeq            44
	//    6   14:ldc1            #14  <String "Upgrade">
	//    7   16:aload_0         
	//    8   17:ldc1            #11  <String "Connection">
	//    9   19:invokestatic    #76  <Method String getFirstHeaderValue(HttpMessage, String)>
	//   10   22:invokevirtual   #187 <Method boolean String.equals(Object)>
	//   11   25:ifeq            44
	//   12   28:ldc1            #29  <String "13">
	//   13   30:aload_0         
	//   14   31:ldc1            #26  <String "Sec-WebSocket-Version">
	//   15   33:invokestatic    #76  <Method String getFirstHeaderValue(HttpMessage, String)>
	//   16   36:invokevirtual   #187 <Method boolean String.equals(Object)>
	//   17   39:ifeq            44
	//   18   42:iconst_1        
	//   19   43:ireturn         
	//   20   44:iconst_0        
	//   21   45:ireturn         
	}

	public void handleSecured(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
		throws IOException, HttpException
	{
		HttpConnection httpconnection;
		if(!isSupportableUpgradeRequest(httprequest))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #190 <Method boolean isSupportableUpgradeRequest(HttpRequest)>
	//*   2    4:ifne            40
		{
			httpresponse.setStatusCode(501);
	//    3    7:aload_2         
	//    4    8:sipush          501
	//    5   11:invokeinterface #62  <Method void HttpResponse.setStatusCode(int)>
			httpresponse.setReasonPhrase("Not Implemented");
	//    6   16:aload_2         
	//    7   17:ldc1            #192 <String "Not Implemented">
	//    8   19:invokeinterface #68  <Method void HttpResponse.setReasonPhrase(String)>
			httpresponse.setEntity(((org.apache.http.HttpEntity) (new StringEntity("Not a supported WebSocket upgrade request\n"))));
	//    9   24:aload_2         
	//   10   25:new             #194 <Class StringEntity>
	//   11   28:dup             
	//   12   29:ldc1            #196 <String "Not a supported WebSocket upgrade request\n">
	//   13   31:invokespecial   #198 <Method void StringEntity(String)>
	//   14   34:invokeinterface #202 <Method void HttpResponse.setEntity(org.apache.http.HttpEntity)>
			return;
	//   15   39:return          
		}
		httpconnection = (HttpConnection)httpcontext.getAttribute("http.connection");
	//   16   40:aload_3         
	//   17   41:ldc1            #204 <String "http.connection">
	//   18   43:invokeinterface #210 <Method Object HttpContext.getAttribute(String)>
	//   19   48:checkcast       #212 <Class HttpConnection>
	//   20   51:astore          4
		doUpgrade(httprequest, httpresponse, httpcontext);
	//   21   53:aload_0         
	//   22   54:aload_1         
	//   23   55:aload_2         
	//   24   56:aload_3         
	//   25   57:invokespecial   #214 <Method void doUpgrade(HttpRequest, HttpResponse, HttpContext)>
		try
		{
			httpconnection.close();
	//   26   60:aload           4
	//   27   62:invokeinterface #217 <Method void HttpConnection.close()>
		}
	//*  28   67:new             #219 <Class ConnectionClosedException>
	//*  29   70:dup             
	//*  30   71:ldc1            #221 <String "EOF">
	//*  31   73:invokespecial   #222 <Method void ConnectionClosedException(String)>
	//*  32   76:athrow          
	//*  33   77:astore_1        
	//*  34   78:aload           4
	//*  35   80:invokeinterface #217 <Method void HttpConnection.close()>
	//*  36   85:aload_1         
	//*  37   86:athrow          
		// Misplaced declaration of an exception variable
		catch(HttpRequest httprequest) { }
	//   38   87:astore_1        
		throw new ConnectionClosedException("EOF");
		httprequest;
		try
		{
			httpconnection.close();
		}
	//*  39   88:goto            67
		// Misplaced declaration of an exception variable
		catch(HttpResponse httpresponse) { }
	//   40   91:astore_2        
		throw httprequest;
	//*  41   92:goto            85
	}

	private static final String HEADER_CONNECTION = "Connection";
	private static final String HEADER_CONNECTION_UPGRADE = "Upgrade";
	private static final String HEADER_SEC_WEBSOCKET_ACCEPT = "Sec-WebSocket-Accept";
	private static final String HEADER_SEC_WEBSOCKET_KEY = "Sec-WebSocket-Key";
	private static final String HEADER_SEC_WEBSOCKET_PROTOCOL = "Sec-WebSocket-Protocol";
	private static final String HEADER_SEC_WEBSOCKET_VERSION = "Sec-WebSocket-Version";
	private static final String HEADER_SEC_WEBSOCKET_VERSION_13 = "13";
	private static final String HEADER_UPGRADE = "Upgrade";
	private static final String HEADER_UPGRADE_WEBSOCKET = "websocket";
	private static final String SERVER_KEY_GUID = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
	private final SimpleEndpoint mEndpoint;
}
