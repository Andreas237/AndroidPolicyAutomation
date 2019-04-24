// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import android.content.*;

// Referenced classes of package com.bumptech.glide.manager:
//			DefaultConnectivityMonitor

class DefaultConnectivityMonitor$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		boolean flag = isConnected;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field DefaultConnectivityMonitor this$0>
	//    2    4:getfield        #22  <Field boolean DefaultConnectivityMonitor.isConnected>
	//    3    7:istore_3        
		isConnected = isConnected(context);
	//    4    8:aload_0         
	//    5    9:getfield        #12  <Field DefaultConnectivityMonitor this$0>
	//    6   12:aload_0         
	//    7   13:getfield        #12  <Field DefaultConnectivityMonitor this$0>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #25  <Method boolean DefaultConnectivityMonitor.isConnected(Context)>
	//   10   20:putfield        #22  <Field boolean DefaultConnectivityMonitor.isConnected>
		if(flag != isConnected)
	//*  11   23:iload_3         
	//*  12   24:aload_0         
	//*  13   25:getfield        #12  <Field DefaultConnectivityMonitor this$0>
	//*  14   28:getfield        #22  <Field boolean DefaultConnectivityMonitor.isConnected>
	//*  15   31:icmpeq          53
			listener.onConnectivityChanged(isConnected);
	//   16   34:aload_0         
	//   17   35:getfield        #12  <Field DefaultConnectivityMonitor this$0>
	//   18   38:getfield        #29  <Field ConnectivityMonitor$ConnectivityListener DefaultConnectivityMonitor.listener>
	//   19   41:aload_0         
	//   20   42:getfield        #12  <Field DefaultConnectivityMonitor this$0>
	//   21   45:getfield        #22  <Field boolean DefaultConnectivityMonitor.isConnected>
	//   22   48:invokeinterface #35  <Method void ConnectivityMonitor$ConnectivityListener.onConnectivityChanged(boolean)>
	//   23   53:return          
	}

	final DefaultConnectivityMonitor this$0;

	DefaultConnectivityMonitor$1()
	{
		this$0 = DefaultConnectivityMonitor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field DefaultConnectivityMonitor this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
