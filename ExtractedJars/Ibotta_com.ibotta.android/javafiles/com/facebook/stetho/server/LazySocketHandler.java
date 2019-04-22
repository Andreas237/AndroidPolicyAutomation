// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import android.net.LocalSocket;
import java.io.IOException;

// Referenced classes of package com.facebook.stetho.server:
//			SocketHandler, SocketHandlerFactory

public class LazySocketHandler
	implements SocketHandler
{

	public LazySocketHandler(SocketHandlerFactory sockethandlerfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mSocketHandlerFactory = sockethandlerfactory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field SocketHandlerFactory mSocketHandlerFactory>
	//    5    9:return          
	}

	private SocketHandler getSocketHandler()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		SocketHandler sockethandler;
		if(mSocketHandler == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #24  <Field SocketHandler mSocketHandler>
	//*   4    6:ifnonnull       22
			mSocketHandler = mSocketHandlerFactory.create();
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #18  <Field SocketHandlerFactory mSocketHandlerFactory>
	//    8   14:invokeinterface #29  <Method SocketHandler SocketHandlerFactory.create()>
	//    9   19:putfield        #24  <Field SocketHandler mSocketHandler>
		sockethandler = mSocketHandler;
	//   10   22:aload_0         
	//   11   23:getfield        #24  <Field SocketHandler mSocketHandler>
	//   12   26:astore_1        
		this;
	//   13   27:aload_0         
		JVM INSTR monitorexit ;
	//   14   28:monitorexit     
		return sockethandler;
	//   15   29:aload_1         
	//   16   30:areturn         
		Exception exception;
		exception;
	//   17   31:astore_1        
	//*  18   32:aload_0         
		throw exception;
	//   19   33:monitorexit     
	//   20   34:aload_1         
	//   21   35:athrow          
	}

	public void onAccepted(LocalSocket localsocket)
		throws IOException
	{
		getSocketHandler().onAccepted(localsocket);
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method SocketHandler getSocketHandler()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #38  <Method void SocketHandler.onAccepted(LocalSocket)>
	//    4   10:return          
	}

	private SocketHandler mSocketHandler;
	private final SocketHandlerFactory mSocketHandlerFactory;
}
