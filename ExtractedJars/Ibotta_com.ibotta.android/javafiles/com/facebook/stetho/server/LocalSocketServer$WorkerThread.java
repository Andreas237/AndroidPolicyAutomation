// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import android.net.LocalSocket;
import com.facebook.stetho.common.LogUtil;
import java.io.IOException;

// Referenced classes of package com.facebook.stetho.server:
//			LocalSocketServer, SocketHandler

private static class LocalSocketServer$WorkerThread extends Thread
{

	public void run()
	{
		mSocketHandler.onAccepted(mSocket);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SocketHandler mSocketHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field LocalSocket mSocket>
	//    4    8:invokeinterface #30  <Method void SocketHandler.onAccepted(LocalSocket)>
_L1:
		Object obj;
		try
		{
			mSocket.close();
	//    5   13:aload_0         
	//    6   14:getfield        #18  <Field LocalSocket mSocket>
	//    7   17:invokevirtual   #35  <Method void LocalSocket.close()>
			return;
	//    8   20:return          
		}
	//*   9   21:astore_1        
	//*  10   22:goto            42
	//*  11   25:astore_1        
	//*  12   26:ldc1            #37  <String "I/O error: %s">
	//*  13   28:iconst_1        
	//*  14   29:anewarray       Object[]
	//*  15   32:dup             
	//*  16   33:iconst_0        
	//*  17   34:aload_1         
	//*  18   35:aastore         
	//*  19   36:invokestatic    #45  <Method void LogUtil.w(String, Object[])>
	//*  20   39:goto            13
	//*  21   42:aload_0         
	//*  22   43:getfield        #18  <Field LocalSocket mSocket>
	//*  23   46:invokevirtual   #35  <Method void LocalSocket.close()>
	//*  24   49:aload_1         
	//*  25   50:athrow          
		catch(IOException ioexception)
	//*  26   51:astore_1        
		{
			return;
	//   27   52:return          
		}
		obj;
		break MISSING_BLOCK_LABEL_42;
		obj;
		LogUtil.w("I/O error: %s", new Object[] {
			obj
		});
		  goto _L1
		try
		{
			mSocket.close();
		}
		catch(IOException ioexception1) { }
	//   28   53:astore_2        
		throw obj;
	//*  29   54:goto            49
	}

	private final LocalSocket mSocket;
	private final SocketHandler mSocketHandler;

	public LocalSocketServer$WorkerThread(LocalSocket localsocket, SocketHandler sockethandler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Thread()>
		mSocket = localsocket;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field LocalSocket mSocket>
		mSocketHandler = sockethandler;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field SocketHandler mSocketHandler>
	//    8   14:return          
	}
}
