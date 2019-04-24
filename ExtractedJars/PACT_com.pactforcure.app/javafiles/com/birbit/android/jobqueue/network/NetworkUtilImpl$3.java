// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.network;

import android.content.*;

// Referenced classes of package com.birbit.android.jobqueue.network:
//			NetworkUtilImpl

class NetworkUtilImpl$3 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		dispatchNetworkChange(context);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field NetworkUtilImpl this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method void NetworkUtilImpl.dispatchNetworkChange(Context)>
	//    4    8:return          
	}

	final NetworkUtilImpl this$0;

	NetworkUtilImpl$3()
	{
		this$0 = NetworkUtilImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field NetworkUtilImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
