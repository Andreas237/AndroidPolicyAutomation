// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzcc;

// Referenced classes of package com.google.android.gms.wearable:
//			WearableListenerService

class WearableListenerService$zzc$4
	implements Runnable
{

	public void run()
	{
		zzbTo.zzbTl.onPeerDisconnected(((Node) (zzbTq)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field WearableListenerService$zzc zzbTo>
	//    2    4:getfield        #33  <Field WearableListenerService WearableListenerService$zzc.zzbTl>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field zzcc zzbTq>
	//    5   11:invokevirtual   #37  <Method void WearableListenerService.onPeerDisconnected(Node)>
	//    6   14:return          
	}

	final WearableListenerService.zzc zzbTo;
	final zzcc zzbTq;

	WearableListenerService$zzc$4(WearableListenerService.zzc zzc1, zzcc zzcc)
	{
		zzbTo = zzc1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field WearableListenerService$zzc zzbTo>
		zzbTq = zzcc;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field zzcc zzbTq>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
