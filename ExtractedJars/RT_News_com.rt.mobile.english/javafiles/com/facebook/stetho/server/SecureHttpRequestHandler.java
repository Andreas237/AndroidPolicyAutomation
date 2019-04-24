// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import android.content.Context;
import android.net.Credentials;
import android.net.LocalSocket;
import com.facebook.stetho.common.LogUtil;
import java.io.IOException;
import org.apache.http.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestHandler;

// Referenced classes of package com.facebook.stetho.server:
//			PeerAuthorizationException, LocalSocketHttpServerConnection

public abstract class SecureHttpRequestHandler
	implements HttpRequestHandler
{

	public SecureHttpRequestHandler(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Context mContext>
	//    5    9:return          
	}

	private static void enforcePermission(Context context, LocalSocket localsocket)
		throws IOException, PeerAuthorizationException
	{
		localsocket = ((LocalSocket) (localsocket.getPeerCredentials()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #34  <Method Credentials LocalSocket.getPeerCredentials()>
	//    2    4:astore_1        
		int i = ((Credentials) (localsocket)).getUid();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #40  <Method int Credentials.getUid()>
	//    5    9:istore_2        
		int j = ((Credentials) (localsocket)).getPid();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #43  <Method int Credentials.getPid()>
	//    8   14:istore_3        
		if(LogUtil.isLoggable(2))
	//*   9   15:iconst_2        
	//*  10   16:invokestatic    #49  <Method boolean LogUtil.isLoggable(int)>
	//*  11   19:ifeq            45
			LogUtil.v("Got request from uid=%d, pid=%d", new Object[] {
				Integer.valueOf(i), Integer.valueOf(j)
			});
	//   12   22:ldc1            #51  <String "Got request from uid=%d, pid=%d">
	//   13   24:iconst_2        
	//   14   25:anewarray       Object[]
	//   15   28:dup             
	//   16   29:iconst_0        
	//   17   30:iload_2         
	//   18   31:invokestatic    #57  <Method Integer Integer.valueOf(int)>
	//   19   34:aastore         
	//   20   35:dup             
	//   21   36:iconst_1        
	//   22   37:iload_3         
	//   23   38:invokestatic    #57  <Method Integer Integer.valueOf(int)>
	//   24   41:aastore         
	//   25   42:invokestatic    #61  <Method void LogUtil.v(String, Object[])>
		if(context.checkPermission("android.permission.DUMP", j, i) != 0)
	//*  26   45:aload_0         
	//*  27   46:ldc1            #63  <String "android.permission.DUMP">
	//*  28   48:iload_3         
	//*  29   49:iload_2         
	//*  30   50:invokevirtual   #69  <Method int Context.checkPermission(String, int, int)>
	//*  31   53:ifeq            116
		{
			context = ((Context) (new StringBuilder()));
	//   32   56:new             #71  <Class StringBuilder>
	//   33   59:dup             
	//   34   60:invokespecial   #72  <Method void StringBuilder()>
	//   35   63:astore_0        
			((StringBuilder) (context)).append("Peer pid=");
	//   36   64:aload_0         
	//   37   65:ldc1            #74  <String "Peer pid=">
	//   38   67:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   39   70:pop             
			((StringBuilder) (context)).append(j);
	//   40   71:aload_0         
	//   41   72:iload_3         
	//   42   73:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   43   76:pop             
			((StringBuilder) (context)).append(", uid=");
	//   44   77:aload_0         
	//   45   78:ldc1            #83  <String ", uid=">
	//   46   80:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   47   83:pop             
			((StringBuilder) (context)).append(i);
	//   48   84:aload_0         
	//   49   85:iload_2         
	//   50   86:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   51   89:pop             
			((StringBuilder) (context)).append(" does not have ");
	//   52   90:aload_0         
	//   53   91:ldc1            #85  <String " does not have ">
	//   54   93:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   55   96:pop             
			((StringBuilder) (context)).append("android.permission.DUMP");
	//   56   97:aload_0         
	//   57   98:ldc1            #63  <String "android.permission.DUMP">
	//   58  100:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   59  103:pop             
			throw new PeerAuthorizationException(((StringBuilder) (context)).toString());
	//   60  104:new             #28  <Class PeerAuthorizationException>
	//   61  107:dup             
	//   62  108:aload_0         
	//   63  109:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   64  112:invokespecial   #92  <Method void PeerAuthorizationException(String)>
	//   65  115:athrow          
		} else
		{
			return;
	//   66  116:return          
		}
	}

	private void ensureSecureRequest(HttpRequest httprequest, HttpContext httpcontext)
		throws PeerAuthorizationException, IOException
	{
		httprequest = ((HttpRequest) ((HttpConnection)httpcontext.getAttribute("http.connection")));
	//    0    0:aload_2         
	//    1    1:ldc1            #97  <String "http.connection">
	//    2    3:invokeinterface #103 <Method Object HttpContext.getAttribute(String)>
	//    3    8:checkcast       #105 <Class HttpConnection>
	//    4   11:astore_1        
		if(!(httprequest instanceof LocalSocketHttpServerConnection))
	//*   5   12:aload_1         
	//*   6   13:instanceof      #107 <Class LocalSocketHttpServerConnection>
	//*   7   16:ifne            58
		{
			httpcontext = ((HttpContext) (new StringBuilder()));
	//    8   19:new             #71  <Class StringBuilder>
	//    9   22:dup             
	//   10   23:invokespecial   #72  <Method void StringBuilder()>
	//   11   26:astore_2        
			((StringBuilder) (httpcontext)).append("Unexpected connection class: ");
	//   12   27:aload_2         
	//   13   28:ldc1            #109 <String "Unexpected connection class: ">
	//   14   30:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			((StringBuilder) (httpcontext)).append(((Object) (httprequest)).getClass().getName());
	//   16   34:aload_2         
	//   17   35:aload_1         
	//   18   36:invokevirtual   #113 <Method Class Object.getClass()>
	//   19   39:invokevirtual   #118 <Method String Class.getName()>
	//   20   42:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
			throw new PeerAuthorizationException(((StringBuilder) (httpcontext)).toString());
	//   22   46:new             #28  <Class PeerAuthorizationException>
	//   23   49:dup             
	//   24   50:aload_2         
	//   25   51:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   26   54:invokespecial   #92  <Method void PeerAuthorizationException(String)>
	//   27   57:athrow          
		} else
		{
			httprequest = ((HttpRequest) (((LocalSocketHttpServerConnection)httprequest).getSocket()));
	//   28   58:aload_1         
	//   29   59:checkcast       #107 <Class LocalSocketHttpServerConnection>
	//   30   62:invokevirtual   #122 <Method LocalSocket LocalSocketHttpServerConnection.getSocket()>
	//   31   65:astore_1        
			enforcePermission(mContext, ((LocalSocket) (httprequest)));
	//   32   66:aload_0         
	//   33   67:getfield        #22  <Field Context mContext>
	//   34   70:aload_1         
	//   35   71:invokestatic    #124 <Method void enforcePermission(Context, LocalSocket)>
			return;
	//   36   74:return          
		}
	}

	public final void handle(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
		throws HttpException, IOException
	{
		try
		{
			ensureSecureRequest(httprequest, httpcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #133 <Method void ensureSecureRequest(HttpRequest, HttpContext)>
			handleSecured(httprequest, httpresponse, httpcontext);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:aload_3         
	//    8   10:invokevirtual   #136 <Method void handleSecured(HttpRequest, HttpResponse, HttpContext)>
			return;
	//    9   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(HttpRequest httprequest)
	//*  10   14:astore_1        
		{
			httpcontext = ((HttpContext) (new StringBuilder()));
	//   11   15:new             #71  <Class StringBuilder>
	//   12   18:dup             
	//   13   19:invokespecial   #72  <Method void StringBuilder()>
	//   14   22:astore_3        
		}
		((StringBuilder) (httpcontext)).append("Unauthorized request: ");
	//   15   23:aload_3         
	//   16   24:ldc1            #138 <String "Unauthorized request: ">
	//   17   26:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   18   29:pop             
		((StringBuilder) (httpcontext)).append(((PeerAuthorizationException) (httprequest)).getMessage());
	//   19   30:aload_3         
	//   20   31:aload_1         
	//   21   32:invokevirtual   #141 <Method String PeerAuthorizationException.getMessage()>
	//   22   35:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   23   38:pop             
		LogUtil.e(((StringBuilder) (httpcontext)).toString());
	//   24   39:aload_3         
	//   25   40:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   26   43:invokestatic    #144 <Method void LogUtil.e(String)>
		httpresponse.setStatusCode(403);
	//   27   46:aload_2         
	//   28   47:sipush          403
	//   29   50:invokeinterface #150 <Method void HttpResponse.setStatusCode(int)>
		httpcontext = ((HttpContext) (new StringBuilder()));
	//   30   55:new             #71  <Class StringBuilder>
	//   31   58:dup             
	//   32   59:invokespecial   #72  <Method void StringBuilder()>
	//   33   62:astore_3        
		((StringBuilder) (httpcontext)).append(((PeerAuthorizationException) (httprequest)).getMessage());
	//   34   63:aload_3         
	//   35   64:aload_1         
	//   36   65:invokevirtual   #141 <Method String PeerAuthorizationException.getMessage()>
	//   37   68:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   38   71:pop             
		((StringBuilder) (httpcontext)).append("\n");
	//   39   72:aload_3         
	//   40   73:ldc1            #152 <String "\n">
	//   41   75:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   42   78:pop             
		httpresponse.setEntity(((org.apache.http.HttpEntity) (new StringEntity(((StringBuilder) (httpcontext)).toString(), "UTF-8"))));
	//   43   79:aload_2         
	//   44   80:new             #154 <Class StringEntity>
	//   45   83:dup             
	//   46   84:aload_3         
	//   47   85:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   48   88:ldc1            #156 <String "UTF-8">
	//   49   90:invokespecial   #159 <Method void StringEntity(String, String)>
	//   50   93:invokeinterface #163 <Method void HttpResponse.setEntity(org.apache.http.HttpEntity)>
	//   51   98:return          
	}

	protected abstract void handleSecured(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
		throws HttpException, IOException;

	private static final Class TAG = com/facebook/stetho/server/SecureHttpRequestHandler;
	private final Context mContext;

	static 
	{
	//    0    0:ldc1            #2   <Class SecureHttpRequestHandler>
	//    1    2:putstatic       #15  <Field Class TAG>
	//*   2    5:return          
	}
}
