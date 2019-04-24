// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzk;

// Referenced classes of package com.google.android.gms.wearable:
//			WearableListenerService

class WearableListenerService$zzc$7
	implements Runnable
{

	public void run()
	{
		zzbTo.zzbTl.onNotificationReceived(((zzd) (zzbTt)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field WearableListenerService$zzc zzbTo>
	//    2    4:getfield        #33  <Field WearableListenerService WearableListenerService$zzc.zzbTl>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field zzk zzbTt>
	//    5   11:invokevirtual   #37  <Method void WearableListenerService.onNotificationReceived(zzd)>
	//    6   14:return          
	}

	final WearableListenerService.zzc zzbTo;
	final zzk zzbTt;

	WearableListenerService$zzc$7(WearableListenerService.zzc zzc1, zzk zzk)
	{
		zzbTo = zzc1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field WearableListenerService$zzc zzbTo>
		zzbTt = zzk;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field zzk zzbTt>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
