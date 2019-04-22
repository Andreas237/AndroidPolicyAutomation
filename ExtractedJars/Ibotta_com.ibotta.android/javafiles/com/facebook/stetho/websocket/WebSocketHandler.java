// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.websocket;

import android.util.Base64;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.server.http.*;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.facebook.stetho.websocket:
//			WebSocketSession, SimpleEndpoint

public class WebSocketHandler
	implements HttpHandler
{

	public WebSocketHandler(SimpleEndpoint simpleendpoint)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		mEndpoint = simpleendpoint;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #44  <Field SimpleEndpoint mEndpoint>
	//    5    9:return          
	}

	private void doUpgrade(SocketLike socketlike, LightHttpRequest lighthttprequest, LightHttpResponse lighthttpresponse)
		throws IOException
	{
		lighthttpresponse.code = 101;
	//    0    0:aload_3         
	//    1    1:bipush          101
	//    2    3:putfield        #55  <Field int LightHttpResponse.code>
		lighthttpresponse.reasonPhrase = "Switching Protocols";
	//    3    6:aload_3         
	//    4    7:ldc1            #57  <String "Switching Protocols">
	//    5    9:putfield        #60  <Field String LightHttpResponse.reasonPhrase>
		lighthttpresponse.addHeader("Upgrade", "websocket");
	//    6   12:aload_3         
	//    7   13:ldc1            #13  <String "Upgrade">
	//    8   15:ldc1            #32  <String "websocket">
	//    9   17:invokevirtual   #64  <Method void LightHttpResponse.addHeader(String, String)>
		lighthttpresponse.addHeader("Connection", "Upgrade");
	//   10   20:aload_3         
	//   11   21:ldc1            #10  <String "Connection">
	//   12   23:ldc1            #13  <String "Upgrade">
	//   13   25:invokevirtual   #64  <Method void LightHttpResponse.addHeader(String, String)>
		lighthttpresponse.body = null;
	//   14   28:aload_3         
	//   15   29:aconst_null     
	//   16   30:putfield        #68  <Field LightHttpBody LightHttpResponse.body>
		lighthttprequest = ((LightHttpRequest) (getFirstHeaderValue(((LightHttpMessage) (lighthttprequest)), "Sec-WebSocket-Key")));
	//   17   33:aload_2         
	//   18   34:ldc1            #19  <String "Sec-WebSocket-Key">
	//   19   36:invokestatic    #72  <Method String getFirstHeaderValue(LightHttpMessage, String)>
	//   20   39:astore_2        
		if(lighthttprequest != null)
	//*  21   40:aload_2         
	//*  22   41:ifnull          54
			lighthttpresponse.addHeader("Sec-WebSocket-Accept", generateServerKey(((String) (lighthttprequest))));
	//   23   44:aload_3         
	//   24   45:ldc1            #16  <String "Sec-WebSocket-Accept">
	//   25   47:aload_2         
	//   26   48:invokestatic    #76  <Method String generateServerKey(String)>
	//   27   51:invokevirtual   #64  <Method void LightHttpResponse.addHeader(String, String)>
		lighthttprequest = ((LightHttpRequest) (socketlike.getInput()));
	//   28   54:aload_1         
	//   29   55:invokevirtual   #82  <Method java.io.InputStream SocketLike.getInput()>
	//   30   58:astore_2        
		socketlike = ((SocketLike) (socketlike.getOutput()));
	//   31   59:aload_1         
	//   32   60:invokevirtual   #86  <Method java.io.OutputStream SocketLike.getOutput()>
	//   33   63:astore_1        
		LightHttpServer.writeResponseMessage(lighthttpresponse, new com.facebook.stetho.server.http.LightHttpServer.HttpMessageWriter(new BufferedOutputStream(((java.io.OutputStream) (socketlike)))));
	//   34   64:aload_3         
	//   35   65:new             #88  <Class com.facebook.stetho.server.http.LightHttpServer$HttpMessageWriter>
	//   36   68:dup             
	//   37   69:new             #90  <Class BufferedOutputStream>
	//   38   72:dup             
	//   39   73:aload_1         
	//   40   74:invokespecial   #93  <Method void BufferedOutputStream(java.io.OutputStream)>
	//   41   77:invokespecial   #96  <Method void com.facebook.stetho.server.http.LightHttpServer$HttpMessageWriter(BufferedOutputStream)>
	//   42   80:invokestatic    #102 <Method void LightHttpServer.writeResponseMessage(LightHttpResponse, com.facebook.stetho.server.http.LightHttpServer$HttpMessageWriter)>
		(new WebSocketSession(((java.io.InputStream) (lighthttprequest)), ((java.io.OutputStream) (socketlike)), mEndpoint)).handle();
	//   43   83:new             #104 <Class WebSocketSession>
	//   44   86:dup             
	//   45   87:aload_2         
	//   46   88:aload_1         
	//   47   89:aload_0         
	//   48   90:getfield        #44  <Field SimpleEndpoint mEndpoint>
	//   49   93:invokespecial   #107 <Method void WebSocketSession(java.io.InputStream, java.io.OutputStream, SimpleEndpoint)>
	//   50   96:invokevirtual   #110 <Method void WebSocketSession.handle()>
	//   51   99:return          
	}

	private static String generateServerKey(String s)
	{
		try
		{
			Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #115 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #116 <Method void StringBuilder()>
	//    3    7:astore_1        
			((StringBuilder) (obj)).append(s);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
			((StringBuilder) (obj)).append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
	//    8   14:aload_1         
	//    9   15:ldc1            #35  <String "258EAFA5-E914-47DA-95CA-C5AB0DC85B11">
	//   10   17:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
			s = ((StringBuilder) (obj)).toString();
	//   12   21:aload_1         
	//   13   22:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   14   25:astore_0        
			obj = ((Object) (MessageDigest.getInstance("SHA-1")));
	//   15   26:ldc1            #126 <String "SHA-1">
	//   16   28:invokestatic    #132 <Method MessageDigest MessageDigest.getInstance(String)>
	//   17   31:astore_1        
			((MessageDigest) (obj)).update(Utf8Charset.encodeUTF8(s));
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:invokestatic    #138 <Method byte[] Utf8Charset.encodeUTF8(String)>
	//   21   37:invokevirtual   #142 <Method void MessageDigest.update(byte[])>
			s = Base64.encodeToString(((MessageDigest) (obj)).digest(), 2);
	//   22   40:aload_1         
	//   23   41:invokevirtual   #146 <Method byte[] MessageDigest.digest()>
	//   24   44:iconst_2        
	//   25   45:invokestatic    #152 <Method String Base64.encodeToString(byte[], int)>
	//   26   48:astore_0        
		}
	//*  27   49:aload_0         
	//*  28   50:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  29   51:astore_0        
		{
			throw new RuntimeException(((Throwable) (s)));
	//   30   52:new             #154 <Class RuntimeException>
	//   31   55:dup             
	//   32   56:aload_0         
	//   33   57:invokespecial   #157 <Method void RuntimeException(Throwable)>
	//   34   60:athrow          
		}
		return s;
	}

	private static String getFirstHeaderValue(LightHttpMessage lighthttpmessage, String s)
	{
		return lighthttpmessage.getFirstHeaderValue(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #162 <Method String LightHttpMessage.getFirstHeaderValue(String)>
	//    3    5:areturn         
	}

	private static boolean isSupportableUpgradeRequest(LightHttpRequest lighthttprequest)
	{
		return "websocket".equalsIgnoreCase(getFirstHeaderValue(((LightHttpMessage) (lighthttprequest)), "Upgrade")) && "Upgrade".equals(((Object) (getFirstHeaderValue(((LightHttpMessage) (lighthttprequest)), "Connection")))) && "13".equals(((Object) (getFirstHeaderValue(((LightHttpMessage) (lighthttprequest)), "Sec-WebSocket-Version"))));
	//    0    0:ldc1            #32  <String "websocket">
	//    1    2:aload_0         
	//    2    3:ldc1            #13  <String "Upgrade">
	//    3    5:invokestatic    #72  <Method String getFirstHeaderValue(LightHttpMessage, String)>
	//    4    8:invokevirtual   #171 <Method boolean String.equalsIgnoreCase(String)>
	//    5   11:ifeq            44
	//    6   14:ldc1            #13  <String "Upgrade">
	//    7   16:aload_0         
	//    8   17:ldc1            #10  <String "Connection">
	//    9   19:invokestatic    #72  <Method String getFirstHeaderValue(LightHttpMessage, String)>
	//   10   22:invokevirtual   #175 <Method boolean String.equals(Object)>
	//   11   25:ifeq            44
	//   12   28:ldc1            #28  <String "13">
	//   13   30:aload_0         
	//   14   31:ldc1            #25  <String "Sec-WebSocket-Version">
	//   15   33:invokestatic    #72  <Method String getFirstHeaderValue(LightHttpMessage, String)>
	//   16   36:invokevirtual   #175 <Method boolean String.equals(Object)>
	//   17   39:ifeq            44
	//   18   42:iconst_1        
	//   19   43:ireturn         
	//   20   44:iconst_0        
	//   21   45:ireturn         
	}

	public boolean handleRequest(SocketLike socketlike, LightHttpRequest lighthttprequest, LightHttpResponse lighthttpresponse)
		throws IOException
	{
		if(!isSupportableUpgradeRequest(lighthttprequest))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #179 <Method boolean isSupportableUpgradeRequest(LightHttpRequest)>
	//*   2    4:ifne            33
		{
			lighthttpresponse.code = 501;
	//    3    7:aload_3         
	//    4    8:sipush          501
	//    5   11:putfield        #55  <Field int LightHttpResponse.code>
			lighthttpresponse.reasonPhrase = "Not Implemented";
	//    6   14:aload_3         
	//    7   15:ldc1            #181 <String "Not Implemented">
	//    8   17:putfield        #60  <Field String LightHttpResponse.reasonPhrase>
			lighthttpresponse.body = LightHttpBody.create("Not a supported WebSocket upgrade request\n", "text/plain");
	//    9   20:aload_3         
	//   10   21:ldc1            #183 <String "Not a supported WebSocket upgrade request\n">
	//   11   23:ldc1            #185 <String "text/plain">
	//   12   25:invokestatic    #191 <Method LightHttpBody LightHttpBody.create(String, String)>
	//   13   28:putfield        #68  <Field LightHttpBody LightHttpResponse.body>
			return true;
	//   14   31:iconst_1        
	//   15   32:ireturn         
		} else
		{
			doUpgrade(socketlike, lighthttprequest, lighthttpresponse);
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:aload_2         
	//   19   36:aload_3         
	//   20   37:invokespecial   #193 <Method void doUpgrade(SocketLike, LightHttpRequest, LightHttpResponse)>
			return false;
	//   21   40:iconst_0        
	//   22   41:ireturn         
		}
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
