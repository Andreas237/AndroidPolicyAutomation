// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.network;

import android.content.Context;
import android.net.Network;

// Referenced classes of package com.birbit.android.jobqueue.network:
//			NetworkUtilImpl

class NetworkUtilImpl$2 extends android.net.r.NetworkCallback
{

	public void onAvailable(Network network)
	{
		dispatchNetworkChange(val$context);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field NetworkUtilImpl this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Context val$context>
	//    4    8:invokevirtual   #28  <Method void NetworkUtilImpl.dispatchNetworkChange(Context)>
	//    5   11:return          
	}

	final NetworkUtilImpl this$0;
	final Context val$context;

	NetworkUtilImpl$2()
	{
		this$0 = final_networkutilimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field NetworkUtilImpl this$0>
		val$context = Context.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Context val$context>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void android.net.ConnectivityManager$NetworkCallback()>
	//    8   14:return          
	}
}
