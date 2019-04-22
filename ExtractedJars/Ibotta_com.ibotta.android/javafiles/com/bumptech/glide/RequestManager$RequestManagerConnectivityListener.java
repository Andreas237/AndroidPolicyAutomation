// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import com.bumptech.glide.manager.RequestTracker;

// Referenced classes of package com.bumptech.glide:
//			RequestManager

private class RequestManager$RequestManagerConnectivityListener
	implements com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
{

	public void onConnectivityChanged(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            26
		{
			synchronized(RequestManager.this)
	//*   2    4:aload_0         
	//*   3    5:getfield        #21  <Field RequestManager this$0>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				requestTracker.restartRequests();
	//    7   11:aload_0         
	//    8   12:getfield        #26  <Field RequestTracker requestTracker>
	//    9   15:invokevirtual   #35  <Method void RequestTracker.restartRequests()>
			}
	//   10   18:aload_2         
	//   11   19:monitorexit     
			return;
	//   12   20:return          
		} else
	//*  13   21:astore_3        
	//*  14   22:aload_2         
	//*  15   23:monitorexit     
	//*  16   24:aload_3         
	//*  17   25:athrow          
		{
			return;
	//   18   26:return          
		}
		exception;
		requestmanager;
		JVM INSTR monitorexit ;
		throw exception;
	}

	private final RequestTracker requestTracker;
	final RequestManager this$0;

	RequestManager$RequestManagerConnectivityListener(RequestTracker requesttracker)
	{
		this$0 = RequestManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field RequestManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		requestTracker = requesttracker;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field RequestTracker requestTracker>
	//    8   14:return          
	}
}
