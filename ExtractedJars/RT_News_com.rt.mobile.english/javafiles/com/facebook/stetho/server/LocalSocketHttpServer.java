// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import android.net.LocalServerSocket;
import com.facebook.stetho.common.*;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.BindException;
import java.net.SocketException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.*;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.*;

// Referenced classes of package com.facebook.stetho.server:
//			RegistryInitializer, LocalSocketHttpServerConnection

public class LocalSocketHttpServer
{
	private static class WorkerThread extends Thread
	{

		public void run()
		{
			BasicHttpContext basichttpcontext = new BasicHttpContext(((org.apache.http.protocol.HttpContext) (null)));
		//    0    0:new             #61  <Class BasicHttpContext>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:invokespecial   #64  <Method void BasicHttpContext(org.apache.http.protocol.HttpContext)>
		//    4    8:astore_1        
			if(!Thread.interrupted() && conn.isOpen())
		//*   5    9:invokestatic    #68  <Method boolean Thread.interrupted()>
		//*   6   12:ifne            39
		//*   7   15:aload_0         
		//*   8   16:getfield        #48  <Field HttpServerConnection conn>
		//*   9   19:invokeinterface #73  <Method boolean HttpServerConnection.isOpen()>
		//*  10   24:ifeq            39
				httpservice.handleRequest(conn, ((org.apache.http.protocol.HttpContext) (basichttpcontext)));
		//   11   27:aload_0         
		//   12   28:getfield        #46  <Field HttpService httpservice>
		//   13   31:aload_0         
		//   14   32:getfield        #48  <Field HttpServerConnection conn>
		//   15   35:aload_1         
		//   16   36:invokevirtual   #79  <Method void HttpService.handleRequest(HttpServerConnection, org.apache.http.protocol.HttpContext)>
_L1:
			Object obj;
			try
			{
				conn.close();
		//   17   39:aload_0         
		//   18   40:getfield        #48  <Field HttpServerConnection conn>
		//   19   43:invokeinterface #82  <Method void HttpServerConnection.close()>
				return;
		//   20   48:return          
			}
		//*  21   49:astore_1        
		//*  22   50:goto            104
		//*  23   53:astore_1        
		//*  24   54:ldc1            #84  <String "Unrecoverable HTTP protocol violation: %s">
		//*  25   56:iconst_1        
		//*  26   57:anewarray       Object[]
		//*  27   60:dup             
		//*  28   61:iconst_0        
		//*  29   62:aload_1         
		//*  30   63:aastore         
		//*  31   64:invokestatic    #92  <Method void LogUtil.w(String, Object[])>
		//*  32   67:goto            39
		//*  33   70:astore_1        
		//*  34   71:ldc1            #94  <String "I/O error: %s">
		//*  35   73:iconst_1        
		//*  36   74:anewarray       Object[]
		//*  37   77:dup             
		//*  38   78:iconst_0        
		//*  39   79:aload_1         
		//*  40   80:aastore         
		//*  41   81:invokestatic    #92  <Method void LogUtil.w(String, Object[])>
		//*  42   84:goto            39
		//*  43   87:astore_1        
		//*  44   88:ldc1            #96  <String "Client closed connection: %s">
		//*  45   90:iconst_1        
		//*  46   91:anewarray       Object[]
		//*  47   94:dup             
		//*  48   95:iconst_0        
		//*  49   96:aload_1         
		//*  50   97:aastore         
		//*  51   98:invokestatic    #92  <Method void LogUtil.w(String, Object[])>
		//*  52  101:goto            39
		//*  53  104:aload_0         
		//*  54  105:getfield        #48  <Field HttpServerConnection conn>
		//*  55  108:invokeinterface #82  <Method void HttpServerConnection.close()>
		//*  56  113:aload_1         
		//*  57  114:athrow          
			catch(IOException ioexception)
		//*  58  115:astore_1        
			{
				return;
		//   59  116:return          
			}
			obj;
			break MISSING_BLOCK_LABEL_104;
			obj;
			LogUtil.w("Unrecoverable HTTP protocol violation: %s", new Object[] {
				obj
			});
			  goto _L1
			obj;
			LogUtil.w("I/O error: %s", new Object[] {
				obj
			});
			  goto _L1
			obj;
			LogUtil.w("Client closed connection: %s", new Object[] {
				obj
			});
			  goto _L1
			try
			{
				conn.close();
			}
			catch(IOException ioexception1) { }
		//   60  117:astore_2        
			throw obj;
		//*  61  118:goto            113
		}

		private final HttpServerConnection conn;
		private final HttpService httpservice;

		public WorkerThread(HttpService httpservice1, HttpServerConnection httpserverconnection)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #15  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #18  <Method void StringBuilder()>
		//    3    7:astore_3        
			stringbuilder.append("StethoWorker");
		//    4    8:aload_3         
		//    5    9:ldc1            #20  <String "StethoWorker">
		//    6   11:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(LocalSocketHttpServer.sThreadId.incrementAndGet());
		//    8   15:aload_3         
		//    9   16:invokestatic    #28  <Method AtomicInteger LocalSocketHttpServer.access$000()>
		//   10   19:invokevirtual   #34  <Method int AtomicInteger.incrementAndGet()>
		//   11   22:invokevirtual   #37  <Method StringBuilder StringBuilder.append(int)>
		//   12   25:pop             
			super(stringbuilder.toString());
		//   13   26:aload_0         
		//   14   27:aload_3         
		//   15   28:invokevirtual   #41  <Method String StringBuilder.toString()>
		//   16   31:invokespecial   #44  <Method void Thread(String)>
			httpservice = httpservice1;
		//   17   34:aload_0         
		//   18   35:aload_1         
		//   19   36:putfield        #46  <Field HttpService httpservice>
			conn = httpserverconnection;
		//   20   39:aload_0         
		//   21   40:aload_2         
		//   22   41:putfield        #48  <Field HttpServerConnection conn>
		//   23   44:return          
		}
	}


	public LocalSocketHttpServer(RegistryInitializer registryinitializer)
	{
		this(registryinitializer, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #47  <Method void LocalSocketHttpServer(RegistryInitializer, String)>
	//    4    6:return          
	}

	public LocalSocketHttpServer(RegistryInitializer registryinitializer, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		mRegistryInitializer = (RegistryInitializer)Util.throwIfNull(((Object) (registryinitializer)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #54  <Method Object Util.throwIfNull(Object)>
	//    5    9:checkcast       #56  <Class RegistryInitializer>
	//    6   12:putfield        #58  <Field RegistryInitializer mRegistryInitializer>
		mAddress = s;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #60  <Field String mAddress>
	//   10   20:return          
	}

	private static LocalServerSocket bindToSocket(String s)
		throws IOException
	{
		int i;
		BindException bindexception;
		i = 2;
	//    0    0:iconst_2        
	//    1    1:istore_1        
		bindexception = null;
	//    2    2:aconst_null     
	//    3    3:astore_2        
_L2:
		LocalServerSocket localserversocket;
		if(LogUtil.isLoggable(3))
	//*   4    4:iconst_3        
	//*   5    5:invokestatic    #75  <Method boolean LogUtil.isLoggable(int)>
	//*   6    8:ifeq            39
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #77  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #78  <Method void StringBuilder()>
	//   10   18:astore_3        
			stringbuilder.append("Trying to bind to @");
	//   11   19:aload_3         
	//   12   20:ldc1            #80  <String "Trying to bind to @">
	//   13   22:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
			stringbuilder.append(s);
	//   15   26:aload_3         
	//   16   27:aload_0         
	//   17   28:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   18   31:pop             
			LogUtil.d(stringbuilder.toString());
	//   19   32:aload_3         
	//   20   33:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   21   36:invokestatic    #92  <Method void LogUtil.d(String)>
		}
		localserversocket = new LocalServerSocket(s);
	//   22   39:new             #94  <Class LocalServerSocket>
	//   23   42:dup             
	//   24   43:aload_0         
	//   25   44:invokespecial   #96  <Method void LocalServerSocket(String)>
	//   26   47:astore_3        
		return localserversocket;
	//   27   48:aload_3         
	//   28   49:areturn         
		BindException bindexception2;
		bindexception2;
	//   29   50:astore          4
		LogUtil.w(((Throwable) (bindexception2)), "Binding error, sleep 1000 ms...");
	//   30   52:aload           4
	//   31   54:ldc1            #98  <String "Binding error, sleep 1000 ms...">
	//   32   56:invokestatic    #102 <Method void LogUtil.w(Throwable, String)>
		BindException bindexception1 = bindexception;
	//   33   59:aload_2         
	//   34   60:astore_3        
		if(bindexception == null)
	//*  35   61:aload_2         
	//*  36   62:ifnonnull       68
			bindexception1 = bindexception2;
	//   37   65:aload           4
	//   38   67:astore_3        
		Util.sleepUninterruptibly(1000L);
	//   39   68:ldc2w           #103 <Long 1000L>
	//   40   71:invokestatic    #108 <Method void Util.sleepUninterruptibly(long)>
		if(i <= 0)
	//*  41   74:iload_1         
	//*  42   75:ifgt            80
			throw bindexception1;
	//   43   78:aload_3         
	//   44   79:athrow          
		i--;
	//   45   80:iload_1         
	//   46   81:iconst_1        
	//   47   82:isub            
	//   48   83:istore_1        
		bindexception = bindexception1;
	//   49   84:aload_3         
	//   50   85:astore_2        
		if(true) goto _L2; else goto _L1
	//   51   86:goto            4
_L1:
	}

	private HttpParams createParams()
	{
		return (new BasicHttpParams()).setIntParameter("http.socket.timeout", 5000).setIntParameter("http.socket.buffer-size", 8192).setBooleanParameter("http.connection.stalecheck", false).setBooleanParameter("http.tcp.nodelay", true).setParameter("http.origin-server", "Stetho").setParameter("http.protocol.version", "HTTP/1.1");
	//    0    0:new             #114 <Class BasicHttpParams>
	//    1    3:dup             
	//    2    4:invokespecial   #115 <Method void BasicHttpParams()>
	//    3    7:ldc1            #117 <String "http.socket.timeout">
	//    4    9:sipush          5000
	//    5   12:invokevirtual   #121 <Method HttpParams BasicHttpParams.setIntParameter(String, int)>
	//    6   15:ldc1            #123 <String "http.socket.buffer-size">
	//    7   17:sipush          8192
	//    8   20:invokeinterface #126 <Method HttpParams HttpParams.setIntParameter(String, int)>
	//    9   25:ldc1            #128 <String "http.connection.stalecheck">
	//   10   27:iconst_0        
	//   11   28:invokeinterface #132 <Method HttpParams HttpParams.setBooleanParameter(String, boolean)>
	//   12   33:ldc1            #134 <String "http.tcp.nodelay">
	//   13   35:iconst_1        
	//   14   36:invokeinterface #132 <Method HttpParams HttpParams.setBooleanParameter(String, boolean)>
	//   15   41:ldc1            #136 <String "http.origin-server">
	//   16   43:ldc1            #138 <String "Stetho">
	//   17   45:invokeinterface #142 <Method HttpParams HttpParams.setParameter(String, Object)>
	//   18   50:ldc1            #144 <String "http.protocol.version">
	//   19   52:ldc1            #146 <String "HTTP/1.1">
	//   20   54:invokeinterface #142 <Method HttpParams HttpParams.setParameter(String, Object)>
	//   21   59:areturn         
	}

	private HttpService createService(HttpParams httpparams)
	{
		org.apache.http.protocol.HttpRequestHandlerRegistry httprequesthandlerregistry = mRegistryInitializer.getRegistry();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field RegistryInitializer mRegistryInitializer>
	//    2    4:invokeinterface #152 <Method org.apache.http.protocol.HttpRequestHandlerRegistry RegistryInitializer.getRegistry()>
	//    3    9:astore_2        
		Object obj = ((Object) (new BasicHttpProcessor()));
	//    4   10:new             #154 <Class BasicHttpProcessor>
	//    5   13:dup             
	//    6   14:invokespecial   #155 <Method void BasicHttpProcessor()>
	//    7   17:astore_3        
		((BasicHttpProcessor) (obj)).addInterceptor(((org.apache.http.HttpResponseInterceptor) (new ResponseDate())));
	//    8   18:aload_3         
	//    9   19:new             #157 <Class ResponseDate>
	//   10   22:dup             
	//   11   23:invokespecial   #158 <Method void ResponseDate()>
	//   12   26:invokevirtual   #162 <Method void BasicHttpProcessor.addInterceptor(org.apache.http.HttpResponseInterceptor)>
		((BasicHttpProcessor) (obj)).addInterceptor(((org.apache.http.HttpResponseInterceptor) (new ResponseServer())));
	//   13   29:aload_3         
	//   14   30:new             #164 <Class ResponseServer>
	//   15   33:dup             
	//   16   34:invokespecial   #165 <Method void ResponseServer()>
	//   17   37:invokevirtual   #162 <Method void BasicHttpProcessor.addInterceptor(org.apache.http.HttpResponseInterceptor)>
		((BasicHttpProcessor) (obj)).addInterceptor(((org.apache.http.HttpResponseInterceptor) (new ResponseContent())));
	//   18   40:aload_3         
	//   19   41:new             #167 <Class ResponseContent>
	//   20   44:dup             
	//   21   45:invokespecial   #168 <Method void ResponseContent()>
	//   22   48:invokevirtual   #162 <Method void BasicHttpProcessor.addInterceptor(org.apache.http.HttpResponseInterceptor)>
		((BasicHttpProcessor) (obj)).addInterceptor(((org.apache.http.HttpResponseInterceptor) (new ResponseConnControl())));
	//   23   51:aload_3         
	//   24   52:new             #170 <Class ResponseConnControl>
	//   25   55:dup             
	//   26   56:invokespecial   #171 <Method void ResponseConnControl()>
	//   27   59:invokevirtual   #162 <Method void BasicHttpProcessor.addInterceptor(org.apache.http.HttpResponseInterceptor)>
		obj = ((Object) (new HttpService(((org.apache.http.protocol.HttpProcessor) (obj)), ((org.apache.http.ConnectionReuseStrategy) (new DefaultConnectionReuseStrategy())), ((org.apache.http.HttpResponseFactory) (new DefaultHttpResponseFactory())))));
	//   28   62:new             #173 <Class HttpService>
	//   29   65:dup             
	//   30   66:aload_3         
	//   31   67:new             #175 <Class DefaultConnectionReuseStrategy>
	//   32   70:dup             
	//   33   71:invokespecial   #176 <Method void DefaultConnectionReuseStrategy()>
	//   34   74:new             #178 <Class DefaultHttpResponseFactory>
	//   35   77:dup             
	//   36   78:invokespecial   #179 <Method void DefaultHttpResponseFactory()>
	//   37   81:invokespecial   #182 <Method void HttpService(org.apache.http.protocol.HttpProcessor, org.apache.http.ConnectionReuseStrategy, org.apache.http.HttpResponseFactory)>
	//   38   84:astore_3        
		((HttpService) (obj)).setParams(httpparams);
	//   39   85:aload_3         
	//   40   86:aload_1         
	//   41   87:invokevirtual   #186 <Method void HttpService.setParams(HttpParams)>
		((HttpService) (obj)).setHandlerResolver(((org.apache.http.protocol.HttpRequestHandlerResolver) (httprequesthandlerregistry)));
	//   42   90:aload_3         
	//   43   91:aload_2         
	//   44   92:invokevirtual   #190 <Method void HttpService.setHandlerResolver(org.apache.http.protocol.HttpRequestHandlerResolver)>
		return ((HttpService) (obj));
	//   45   95:aload_3         
	//   46   96:areturn         
	}

	private static String getDefaultAddress()
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #77  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #78  <Method void StringBuilder()>
	//    3    7:astore_0        
		stringbuilder.append("stetho_");
	//    4    8:aload_0         
	//    5    9:ldc1            #14  <String "stetho_">
	//    6   11:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(ProcessUtil.getProcessName());
	//    8   15:aload_0         
	//    9   16:invokestatic    #196 <Method String ProcessUtil.getProcessName()>
	//   10   19:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append("_devtools_remote");
	//   12   23:aload_0         
	//   13   24:ldc1            #17  <String "_devtools_remote">
	//   14   26:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		return stringbuilder.toString();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   18   34:areturn         
	}

	private void listenOnAddress(String s)
		throws IOException
	{
		Object obj;
		mServerSocket = bindToSocket(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #203 <Method LocalServerSocket bindToSocket(String)>
	//    3    5:putfield        #205 <Field LocalServerSocket mServerSocket>
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #77  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #78  <Method void StringBuilder()>
	//    7   15:astore_2        
		stringbuilder.append("Listening on @");
	//    8   16:aload_2         
	//    9   17:ldc1            #207 <String "Listening on @">
	//   10   19:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append(s);
	//   12   23:aload_2         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
		LogUtil.i(stringbuilder.toString());
	//   16   29:aload_2         
	//   17   30:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   18   33:invokestatic    #210 <Method void LogUtil.i(String)>
		obj = null;
	//   19   36:aconst_null     
	//   20   37:astore_3        
		s = null;
	//   21   38:aconst_null     
	//   22   39:astore_1        
_L2:
		Object obj1;
		HttpParams httpparams1;
		LocalSocketHttpServerConnection localsockethttpserverconnection;
		if(Thread.interrupted())
			break; /* Loop/switch isn't completed */
	//   23   40:invokestatic    #216 <Method boolean Thread.interrupted()>
	//   24   43:ifne            200
		localsockethttpserverconnection = new LocalSocketHttpServerConnection();
	//   25   46:new             #218 <Class LocalSocketHttpServerConnection>
	//   26   49:dup             
	//   27   50:invokespecial   #219 <Method void LocalSocketHttpServerConnection()>
	//   28   53:astore          6
		obj1 = ((Object) (s));
	//   29   55:aload_1         
	//   30   56:astore          4
		httpparams1 = ((HttpParams) (obj));
	//   31   58:aload_3         
	//   32   59:astore          5
		android.net.LocalSocket localsocket = mServerSocket.accept();
	//   33   61:aload_0         
	//   34   62:getfield        #205 <Field LocalServerSocket mServerSocket>
	//   35   65:invokevirtual   #223 <Method android.net.LocalSocket LocalServerSocket.accept()>
	//   36   68:astore          7
		HttpParams httpparams;
		httpparams = ((HttpParams) (obj));
	//   37   70:aload_3         
	//   38   71:astore_2        
		if(obj != null)
			break MISSING_BLOCK_LABEL_87;
	//   39   72:aload_3         
	//   40   73:ifnonnull       87
		obj1 = ((Object) (s));
	//   41   76:aload_1         
	//   42   77:astore          4
		httpparams1 = ((HttpParams) (obj));
	//   43   79:aload_3         
	//   44   80:astore          5
		httpparams = createParams();
	//   45   82:aload_0         
	//   46   83:invokespecial   #225 <Method HttpParams createParams()>
	//   47   86:astore_2        
		obj = ((Object) (s));
	//   48   87:aload_1         
	//   49   88:astore_3        
		if(s != null)
			break MISSING_BLOCK_LABEL_105;
	//   50   89:aload_1         
	//   51   90:ifnonnull       105
		obj1 = ((Object) (s));
	//   52   93:aload_1         
	//   53   94:astore          4
		httpparams1 = httpparams;
	//   54   96:aload_2         
	//   55   97:astore          5
		obj = ((Object) (createService(httpparams)));
	//   56   99:aload_0         
	//   57  100:aload_2         
	//   58  101:invokespecial   #227 <Method HttpService createService(HttpParams)>
	//   59  104:astore_3        
		obj1 = obj;
	//   60  105:aload_3         
	//   61  106:astore          4
		httpparams1 = httpparams;
	//   62  108:aload_2         
	//   63  109:astore          5
		localsockethttpserverconnection.bind(localsocket, httpparams);
	//   64  111:aload           6
	//   65  113:aload           7
	//   66  115:aload_2         
	//   67  116:invokevirtual   #231 <Method void LocalSocketHttpServerConnection.bind(android.net.LocalSocket, HttpParams)>
		obj1 = obj;
	//   68  119:aload_3         
	//   69  120:astore          4
		httpparams1 = httpparams;
	//   70  122:aload_2         
	//   71  123:astore          5
		s = ((String) (new WorkerThread(((HttpService) (obj)), ((HttpServerConnection) (localsockethttpserverconnection)))));
	//   72  125:new             #6   <Class LocalSocketHttpServer$WorkerThread>
	//   73  128:dup             
	//   74  129:aload_3         
	//   75  130:aload           6
	//   76  132:invokespecial   #234 <Method void LocalSocketHttpServer$WorkerThread(HttpService, HttpServerConnection)>
	//   77  135:astore_1        
		obj1 = obj;
	//   78  136:aload_3         
	//   79  137:astore          4
		httpparams1 = httpparams;
	//   80  139:aload_2         
	//   81  140:astore          5
		((Thread) (s)).setDaemon(true);
	//   82  142:aload_1         
	//   83  143:iconst_1        
	//   84  144:invokevirtual   #238 <Method void Thread.setDaemon(boolean)>
		obj1 = obj;
	//   85  147:aload_3         
	//   86  148:astore          4
		httpparams1 = httpparams;
	//   87  150:aload_2         
	//   88  151:astore          5
		((Thread) (s)).start();
	//   89  153:aload_1         
	//   90  154:invokevirtual   #241 <Method void Thread.start()>
		s = ((String) (obj));
	//   91  157:aload_3         
	//   92  158:astore_1        
		obj = ((Object) (httpparams));
	//   93  159:aload_2         
	//   94  160:astore_3        
		continue; /* Loop/switch isn't completed */
	//   95  161:goto            40
		s;
	//   96  164:astore_1        
		LogUtil.w(((Throwable) (s)), "I/O error initialising connection thread");
	//   97  165:aload_1         
	//   98  166:ldc1            #243 <String "I/O error initialising connection thread">
	//   99  168:invokestatic    #102 <Method void LogUtil.w(Throwable, String)>
		return;
	//  100  171:return          
		SocketException socketexception;
		socketexception;
	//  101  172:astore_2        
		s = ((String) (obj1));
	//  102  173:aload           4
	//  103  175:astore_1        
		obj = ((Object) (httpparams1));
	//  104  176:aload           5
	//  105  178:astore_3        
		if(!Thread.interrupted())
	//* 106  179:invokestatic    #216 <Method boolean Thread.interrupted()>
	//* 107  182:ifne            40
		{
			LogUtil.w(((Throwable) (socketexception)), "I/O error");
	//  108  185:aload_2         
	//  109  186:ldc1            #245 <String "I/O error">
	//  110  188:invokestatic    #102 <Method void LogUtil.w(Throwable, String)>
			s = ((String) (obj1));
	//  111  191:aload           4
	//  112  193:astore_1        
			obj = ((Object) (httpparams1));
	//  113  194:aload           5
	//  114  196:astore_3        
		}
		if(true) goto _L2; else goto _L1
	//  115  197:goto            40
_L1:
		return;
	//  116  200:return          
		s;
	//  117  201:astore_1        
	//  118  202:return          
	}

	public void run()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!mStopped)
			break MISSING_BLOCK_LABEL_12;
	//    2    2:aload_0         
	//    3    3:getfield        #248 <Field boolean mStopped>
	//    4    6:ifeq            12
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		mListenerThread = Thread.currentThread();
	//    8   12:aload_0         
	//    9   13:invokestatic    #252 <Method Thread Thread.currentThread()>
	//   10   16:putfield        #254 <Field Thread mListenerThread>
		this;
	//   11   19:aload_0         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		String s;
		if(mAddress != null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #60  <Field String mAddress>
	//*  15   25:ifnull          36
			s = mAddress;
	//   16   28:aload_0         
	//   17   29:getfield        #60  <Field String mAddress>
	//   18   32:astore_1        
		else
	//*  19   33:goto            40
			s = getDefaultAddress();
	//   20   36:invokestatic    #256 <Method String getDefaultAddress()>
	//   21   39:astore_1        
		listenOnAddress(s);
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:invokespecial   #258 <Method void listenOnAddress(String)>
		return;
	//   25   45:return          
		Exception exception;
		exception;
	//   26   46:astore_1        
		this;
	//   27   47:aload_0         
		JVM INSTR monitorexit ;
	//   28   48:monitorexit     
		throw exception;
	//   29   49:aload_1         
	//   30   50:athrow          
	}

	public void stop()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mStopped = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #248 <Field boolean mStopped>
		if(mListenerThread != null)
			break MISSING_BLOCK_LABEL_17;
	//    5    7:aload_0         
	//    6    8:getfield        #254 <Field Thread mListenerThread>
	//    7   11:ifnonnull       17
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		this;
	//   11   17:aload_0         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		mListenerThread.interrupt();
	//   13   19:aload_0         
	//   14   20:getfield        #254 <Field Thread mListenerThread>
	//   15   23:invokevirtual   #262 <Method void Thread.interrupt()>
		Exception exception;
		try
		{
			if(mServerSocket != null)
	//*  16   26:aload_0         
	//*  17   27:getfield        #205 <Field LocalServerSocket mServerSocket>
	//*  18   30:ifnull          40
				mServerSocket.close();
	//   19   33:aload_0         
	//   20   34:getfield        #205 <Field LocalServerSocket mServerSocket>
	//   21   37:invokevirtual   #265 <Method void LocalServerSocket.close()>
			return;
	//   22   40:return          
		}
	//*  23   41:astore_1        
	//*  24   42:aload_0         
	//*  25   43:monitorexit     
	//*  26   44:aload_1         
	//*  27   45:athrow          
		catch(IOException ioexception)
	//*  28   46:astore_1        
		{
			return;
	//   29   47:return          
		}
		exception;
		this;
		JVM INSTR monitorexit ;
		throw exception;
	}

	private static final int MAX_BIND_RETRIES = 2;
	private static final String SOCKET_NAME_PREFIX = "stetho_";
	private static final String SOCKET_NAME_SUFFIX = "_devtools_remote";
	private static final int TIME_BETWEEN_BIND_RETRIES_MS = 1000;
	private static final String WORKDER_THREAD_NAME_PREFIX = "StethoWorker";
	private static final AtomicInteger sThreadId = new AtomicInteger();
	private final String mAddress;
	private Thread mListenerThread;
	private final RegistryInitializer mRegistryInitializer;
	private LocalServerSocket mServerSocket;
	private boolean mStopped;

	static 
	{
	//    0    0:new             #37  <Class AtomicInteger>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void AtomicInteger()>
	//    3    7:putstatic       #42  <Field AtomicInteger sThreadId>
	//*   4   10:return          
	}


/*
	static AtomicInteger access$000()
	{
		return sThreadId;
	//    0    0:getstatic       #42  <Field AtomicInteger sThreadId>
	//    1    3:areturn         
	}

*/
}
