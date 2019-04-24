// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import com.bumptech.glide.manager.RequestTracker;

// Referenced classes of package com.bumptech.glide:
//			RequestManager

static class RequestManager$RequestManagerConnectivityListener
	implements com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
{

	public void onConnectivityChanged(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			requestTracker.restartRequests();
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field RequestTracker requestTracker>
	//    4    8:invokevirtual   #26  <Method void RequestTracker.restartRequests()>
	//    5   11:return          
	}

	private final RequestTracker requestTracker;

	public RequestManager$RequestManagerConnectivityListener(RequestTracker requesttracker)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		requestTracker = requesttracker;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field RequestTracker requestTracker>
	//    5    9:return          
	}
}
