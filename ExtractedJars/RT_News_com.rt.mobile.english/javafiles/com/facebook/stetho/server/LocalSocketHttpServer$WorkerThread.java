// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import com.facebook.stetho.common.LogUtil;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.*;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpService;

// Referenced classes of package com.facebook.stetho.server:
//			LocalSocketHttpServer

private static class LocalSocketHttpServer$WorkerThread extends Thread
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

	public LocalSocketHttpServer$WorkerThread(HttpService httpservice1, HttpServerConnection httpserverconnection)
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
		stringbuilder.append(LocalSocketHttpServer.access$000().incrementAndGet());
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
