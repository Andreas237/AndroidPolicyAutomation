// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.maploader;

import android.content.*;
import java.lang.ref.WeakReference;

// Referenced classes of package com.autonavi.amap.mapcore.maploader:
//			NetworkState

static class NetworkState$MyBroadcastReceiver extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(reference != null && reference.get() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field WeakReference reference>
	//*   2    4:ifnull          33
	//*   3    7:aload_0         
	//*   4    8:getfield        #17  <Field WeakReference reference>
	//*   5   11:invokevirtual   #29  <Method Object WeakReference.get()>
	//*   6   14:ifnull          33
			((r)reference.get()).networkStateChanged(context);
	//    7   17:aload_0         
	//    8   18:getfield        #17  <Field WeakReference reference>
	//    9   21:invokevirtual   #29  <Method Object WeakReference.get()>
	//   10   24:checkcast       #31  <Class NetworkState$NetworkChangeListener>
	//   11   27:aload_1         
	//   12   28:invokeinterface #35  <Method void NetworkState$NetworkChangeListener.networkStateChanged(Context)>
	//   13   33:return          
	}

	WeakReference reference;

	public NetworkState$MyBroadcastReceiver(r r)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void BroadcastReceiver()>
		reference = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field WeakReference reference>
		reference = new WeakReference(((Object) (r)));
	//    5    9:aload_0         
	//    6   10:new             #19  <Class WeakReference>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #22  <Method void WeakReference(Object)>
	//   10   18:putfield        #17  <Field WeakReference reference>
	//   11   21:return          
	}
}
