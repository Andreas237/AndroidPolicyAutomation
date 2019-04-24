// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzs;

// Referenced classes of package com.google.android.gms.wearable:
//			WearableListenerService

class WearableListenerService$zzc$9
	implements Runnable
{

	public void run()
	{
		zzbTv.zza(((ChannelApi.ChannelListener) (zzbTo.zzbTl)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzs zzbTv>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field WearableListenerService$zzc zzbTo>
	//    4    8:getfield        #33  <Field WearableListenerService WearableListenerService$zzc.zzbTl>
	//    5   11:invokevirtual   #38  <Method void zzs.zza(ChannelApi$ChannelListener)>
	//    6   14:return          
	}

	final WearableListenerService.zzc zzbTo;
	final zzs zzbTv;

	WearableListenerService$zzc$9(WearableListenerService.zzc zzc1, zzs zzs1)
	{
		zzbTo = zzc1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field WearableListenerService$zzc zzbTo>
		zzbTv = zzs1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field zzs zzbTv>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
